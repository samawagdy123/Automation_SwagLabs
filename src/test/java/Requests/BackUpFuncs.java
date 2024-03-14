package Requests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import static Constrants.Constrants.*;

public class BackUpFuncs {

    static WebDriver driver = new EdgeDriver();;
    public static void login(){
        driver.get(url);
        driver.findElement(userLocator).sendKeys(user);
        driver.findElement(passLocator).sendKeys(pass);
        driver.findElement(By.id("login-button")).sendKeys(Keys.ENTER);
    }
    public static void getNameANdPrice(String searchItem){
        By price = By.xpath(String.format("//div[@class=\"inventory_item_name \" and text()=\"%s\"]/../../following-sibling::div/div[@class=\"inventory_item_price\"]", searchItem));
        WebElement priceElement = driver.findElement(price);
        globalPrice = priceElement.getText();

        By name = By.xpath(String.format("//div[@class=\"inventory_item_name \" and text()=\"%s\"]", searchItem));
        WebElement nameElement = driver.findElement(name);
        globalName = nameElement.getText();
    }

    public static void checkItem(String searchItem){

        By addToCartBtn = By.xpath(String.format("//div[@class=\"inventory_item_name \" and text()=\"%s\"]/../../following-sibling::div/button[@class=\"btn btn_primary btn_small btn_inventory \"]", searchItem));
        driver.findElement(addToCartBtn).sendKeys(Keys.ENTER);
        getNameANdPrice(searchItem);

    }

    public static void viewCart(){

        driver.findElement(By.xpath("//div[@class=\"shopping_cart_container\"]")).click();
        prices = driver.findElements(By.xpath(String.format("//div[@class=\"inventory_item_price\" and text()=\"%s\"]", globalPrice)));
        items = driver.findElements(By.xpath(String.format("//div[@class=\"inventory_item_name \" and text()=\"%s\"]", globalItem)));

    }
}
