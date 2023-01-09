package com.telus.projectpages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.seleniumframework.logs.Log;
import com.telus.basePackage.TestBase;

public class VerifyLinks extends TestBase {

	public void verifyLinks() {

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total links are " + links.size());
		Log.info("Total links are " + links.size());

		for (int i = 0; i < links.size(); i++) {

			WebElement ele = links.get(i);

			String url = ele.getAttribute("href");

			verifyLinkActive(url);

		}

	}

	public void verifyLinkActive(String linkUrl) {
		try {
			URL url = new URL(linkUrl);

			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

			httpURLConnect.setConnectTimeout(1000);

			httpURLConnect.connect();

			if (httpURLConnect.getResponseCode() == 200) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
				Log.info(linkUrl + " - " + httpURLConnect.getResponseMessage());
			}
			if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
				Log.info(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {

		}
	}

}
