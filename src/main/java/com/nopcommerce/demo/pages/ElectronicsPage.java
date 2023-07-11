package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    By Electronics=By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a");

    By CellPhone=By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");

    By View=By.xpath("//a[contains(text(),'List')]");

    By Nokia=By.xpath("//a[contains(text(),'Nokia Lumia 1020')]");

    By Cart=By.xpath("//span[contains(text(),'$349.00')]");

    By CheckBox=By.xpath("//input[@id='termsofservice']");

    By CheckOut=By.xpath("//button[@id='checkout']");












    public void hoverOneElectronics(){
        mouseHoverToElement(Electronics);
    }
    public void clickOnCellPhone(){
        clickOnElement(CellPhone);
    }
    public void clickOnView(){
        clickOnElement(View);
    }
    public void clickOnNokia(){
        clickOnElement(Nokia);
    }
    public void clickOnCart(){
        clickOnElement(Cart);
    }
    public void clickOnCheckBox(){
        clickOnElement(CheckBox);
    }
    public void clickOnCheckOutBox(){
        clickOnElement(CheckOut);
    }
}
