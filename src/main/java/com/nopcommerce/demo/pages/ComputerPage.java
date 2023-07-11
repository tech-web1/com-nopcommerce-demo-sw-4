package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    By Computer=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By Menu=By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1])");

    By DeskTop=By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]");

    By Cart=By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");

    By PentiumDual=By.xpath("//select[@id='product_attribute_1']");

    By Class=By.xpath("//select[@id='product_attribute_2']");

    By VistaPremium=By.xpath("//label[contains(text(),'Vista Premium [+$60.00]");

    By CheckOut=By.xpath("//button[@id='checkout']");






    public void clickOnComputer(){
        clickOnElement(Computer);
    }
    public void clickOnMenu(){
        clickOnElement(Menu);
    }
    public void clickOnDeskTop(){
        clickOnElement(DeskTop);
    }

    public void clickOnCart(){
        clickOnElement(Cart);

    }
    public void selectPentiumDual(){
        selectByValueFromDropDown(PentiumDual,"");
    }
    public void select8GbClass(){
        selectByVisibleTextFromDropDown(Class,"");
    }

    public void selectOsRadio(){
        selectByVisibleTextFromDropDown(VistaPremium,"");
    }
    public void clickOnCheckOut(){
        clickOnElement(CheckOut);
    }










}
