package pages;

import base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by s.milaserdov on 12/14/2017.
 */
public class LoginPage extends Page{

    public void doLogin(String username, String password){

        driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(username);

        driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();

        WebElement pass = driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(pass));

        driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(password);

        driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
    }

    public void forgotEmail(){

        driver.findElement(By.xpath("//*[@id='view_container']/form/div[2]/div/div[1]/button")).click();

    }

    public void forgotPassword(){
       driver.findElement(By.xpath("//*[@id='forgotPassword']")).click();
    }
    
    public void gotoMoreOptions(){
        driver.findElement(By.xpath("//*[@id='view_container']/form/div[2]/div/div[2]/div[2]/div")).click();
    }

    public void chooseLanguage(){

        WebElement languageSelector = driver.findElement(By.xpath("//*[@id='lang-chooser']/div[1]/div[1]/div[9]"));
        languageSelector.click();
        //languageSelector.sendKeys("English (United States)");
    }

    public void gotoHelp(){
        driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[1]/a")).click();

        System.out.println(driver.getTitle());
    }

    public void gotoPrivacy(){
         driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[2]/a")).click();    
    }

    public void gotoTerms(){
        driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[3]/a")).click();
    }
}
