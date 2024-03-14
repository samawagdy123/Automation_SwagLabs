package Constrants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Constrants {
    public static String globalItem;
   public static List<WebElement> items,prices;

    public static String globalPrice,globalName;
    public static  String url = "https://www.saucedemo.com/";
    public static String user="standard_user";
    public static By userLocator=By.id("user-name");
    public static String pass="secret_sauce";
    public static By passLocator=By.id("password");
}
