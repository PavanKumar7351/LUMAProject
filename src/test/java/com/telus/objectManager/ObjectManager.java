package com.telus.objectManager;

import com.telus.basePackage.TestBase;
import com.telus.projectpages.CompanyLogoPage;
import com.telus.projectpages.CreateAccountPage;
import com.telus.projectpages.DropDownPage;
import com.telus.projectpages.MenProductsNamesPages;
import com.telus.projectpages.ProductSelection;
import com.telus.projectpages.VerifyLinks;
import com.telus.projectpages.WomenProductsNamesPages;

public class ObjectManager extends TestBase {
	public static CompanyLogoPage logo=new CompanyLogoPage();
	public static DropDownPage drop=new DropDownPage();
	public static MenProductsNamesPages menProduct=new MenProductsNamesPages();
	public static WomenProductsNamesPages womenProduct=new WomenProductsNamesPages();
	public static VerifyLinks links=new VerifyLinks();
	public static ProductSelection product=new ProductSelection();
	public static CreateAccountPage createAccount=new CreateAccountPage();


}
