package pages;

import base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by s.milaserdov on 12/13/2017.
 */
public class HomePage extends Page{

    public void goToGmail(){

        driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
    }
    
    public void gotoImages(){
        driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[2]/a")).click();
    }

    public void goToGoogleApps(){ driver.findElement(By.xpath("//*[@id='gbwa']/div[1]/a")).click();

    }

    public void goToSignIn(){

        driver.findElement(By.xpath("//*[@id='gb_70']")).click();
    }

     public void validateFooterLinks(){
         
     }
}

