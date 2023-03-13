package _01_addToCard;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class addToCard  extends BaseDriver {
    @Test
    public void Test1(){
       driver.get("http://demo.nopcommerce.com/");

        MyFunc.Bekle(1);
        WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
        login.click();



        MyFunc.Bekle(1);
        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("adminTechn123@gmail.com");



        MyFunc.Bekle(1);
        WebElement paswrod = driver.findElement(By.xpath("//input[@id='Password']"));
        paswrod.sendKeys("12345678");


        MyFunc.Bekle(1);
        WebElement login1 = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        login1.click();



        MyFunc.Bekle(1);
        WebElement searc = driver.findElement(By.xpath("  //input[@class='search-box-text ui-autocomplete-input']"));
        searc.sendKeys("Beats Pill");




        MyFunc.Bekle(1);
        WebElement searcLogin = driver.findElement(By.xpath(" //button[@class='button-1 search-box-button']"));
        searcLogin.click();



        WebElement urunBasligi = driver.findElement(By.xpath("(//a[text()='Beats Pill 2.0 Wireless Speaker'])[2]"));
        Assert.assertTrue(urunBasligi.getText().contains("Beats Pill"));




        MyFunc.Bekle(1);
        WebElement urun = driver.findElement(By.xpath("(//a[text()='Beats Pill 2.0 Wireless Speaker'])[2]"));
        urun.click();


        MyFunc.Bekle(1);
        WebElement addToCard = driver.findElement(By.xpath("//button[@id='add-to-cart-button-21']"));
        addToCard.click();


     //   MyFunc.Bekle(1);
       // WebElement shoppinbag = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
       // shoppinbag.click();


      //  WebElement urunvarmi = driver.findElement(By.xpath("//a[text()='Beats Pill 2.0 Wireless Speaker']"));
       // Assert.assertTrue(urunvarmi.getText().contains("Beats Pill"));
        //System.out.println("urunvarmi = " + urunvarmi);



        BekleKapat();

    }
}
