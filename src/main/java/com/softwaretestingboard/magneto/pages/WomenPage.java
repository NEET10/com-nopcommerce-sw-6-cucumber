package com.softwaretestingboard.magneto.pages;

import com.softwaretestingboard.magneto.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public WomenPage() {
        PageFactory.initElements(driver, this);
    }

    //***************** Storing jackets names in list

    By jacketsNameListBeforeSorting = By.xpath("//strong[@class='product name product-item-name']//a");


    //***************** Select Sort By filter “Product Name”
    @CacheLookup
    @FindBy(xpath = "(//select[@id='sorter'])[1]")
    WebElement filterProductName;

    //***************** After Sorting value

    By jacketsNameListAfterSorting = By.xpath("//strong[@class='product name product-item-name']//a");


    //***************** Storing jackets price in list

    By jacketsPriceListBeforeSorting = By.xpath("//span[@class='price-wrapper ']//span");

    //*****************  filter “Price”
    @CacheLookup
    @FindBy(xpath = "(//select[@id='sorter'])[1]")
    WebElement filterPrice;

    //***************** After Sorting Products by Price

    By jacketsPriceListAfterSorting = By.xpath("//span[@class='price-wrapper ']//span");


    public List<String> productListBeforeSorting() {
        Reporter.log("Jacket Name Sorting " + jacketsNameListBeforeSorting.toString());
        log.info("Jacket Name Sorting " + jacketsNameListBeforeSorting.toString());
        List<WebElement> jacketsElementsList = driver.findElements(jacketsNameListBeforeSorting);
        List<String> jacketsNameListBefore = new ArrayList<String>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());
        }
        // Sort the before name list into Ascending Order
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
        return jacketsNameListBefore;
    }


    public List<String> productListAfterSorting()  {
        Reporter.log("After Sorting Product List " + jacketsNameListAfterSorting.toString());
        log.info("After Sorting Product List " + jacketsNameListAfterSorting.toString());

        // Select Sort By filter “Product Name”
        selectByVisibleTextFromDropDown(filterProductName, "Product Name");

        // After Sorting value
        List<WebElement> jacketsElementsList = driver.findElements(jacketsNameListAfterSorting);
        List<String> jacketsNameListAfter = new ArrayList<String>();

        for (WebElement value : jacketsElementsList) {
            jacketsNameListAfter.add(value.getText());
        }

        return jacketsNameListAfter;
    }
    // *****************************************  Price  ***************************************************************************//


    public List<Double> priceListBeforeSorting() {
        Reporter.log("Product Price Before Sorting " + jacketsPriceListBeforeSorting.toString());
       log.info("Product Price Before Sorting " + jacketsPriceListBeforeSorting.toString());
        // Storing jackets price in list
        List<WebElement> jacketsPriceElementList = driver.findElements(jacketsPriceListBeforeSorting);
        List<Double> jacketsPriceListBefore = new ArrayList<Double>();
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }
        // Sort the jacketPriceListBefore to Ascending Order
        Collections.sort(jacketsPriceListBefore);
        return jacketsPriceListBefore;
    }


    public List<Double> priceListAfterSorting()  {
        Reporter.log("Jacket Price After Sorting " + jacketsPriceListAfterSorting.toString());
        log.info("Jacket Price After Sorting " + jacketsPriceListAfterSorting.toString());
        // Select Sort By filter “Price”
        selectByVisibleTextFromDropDown(filterPrice, "Price");

        // After Sorting Products by Price
        List<WebElement> jacketsPriceElementList = driver.findElements(jacketsPriceListAfterSorting);
        List<Double> jacketsPriceListAfter = new ArrayList<Double>();

        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }
        return jacketsPriceListAfter;
    }


}
