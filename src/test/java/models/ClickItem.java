package models;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Constrants.Constrants.*;
import static Requests.BackUpFuncs.*;

public class ClickItem {

    @Test
    public void addToCart() {
        login();
        checkItem("Sauce Labs Backpack");

    }

    @Test
    public void isTheSame(){
        viewCart();
        for (WebElement item : items) {
            Assert.assertEquals(globalItem, item.getText(), "the name is not the same");
        }
        for (WebElement price : prices) {
            Assert.assertEquals(globalPrice, price.getText(), "the price is not the same");
        }
    }

}
