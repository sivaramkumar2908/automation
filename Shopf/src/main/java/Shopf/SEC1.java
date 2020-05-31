package Shopf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class SEC1 {

    public static void main(String[] args) throws InterruptedException{
        System.out.println("Hello ShopUp");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\siva\\Downloads\\chromedriver.exe");
        WebDriver obj = new ChromeDriver();
        //opening cricbuzz
        obj.get("https://m.cricbuzz.com");
        obj.manage().window().maximize();
        obj.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        //searching for menu
        WebElement menu = obj.findElement(By.cssSelector("#top > div > div:nth-child(4) > div.col-xs-4.col-lg-4.pull-right.dis-inline > a > span.ui-btn-text"));
        Actions action = new Actions(obj);
        action.moveToElement(menu);
        action.click();
        action.perform();
        Thread.sleep(2000);
        //searching for player profiles
        WebElement players = obj.findElement(By.linkText("Players"));
        action.moveToElement(players).click();
        action.perform();
        Thread.sleep(2000);
        //searching the search box
        WebElement search = obj.findElement(By.id("searchtag"));
        //entering name
        search.sendKeys("Suresh raina");
        //searching about player
        WebElement searchResult = obj.findElement(By.cssSelector("#top > div > form > div > div:nth-child(3) > div > div > div > div > input"));
        action.moveToElement(searchResult).click();
        action.perform();
    }
}
