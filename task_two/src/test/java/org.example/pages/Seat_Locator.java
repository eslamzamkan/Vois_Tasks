package org.example.pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Seat_Locator {

    public WebElement select_seat(){
    return Hooks.driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[5]/div[7]/div[1]"));
    }
    public WebElement select_number_seat(){
        return Hooks.driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[5]/div[6]"));
    }

    //boarding point
    public WebElement Boarding_Point(){
        return Hooks.driver.findElement(By.xpath("//div[contains(text(),'Select Boarding Point')]"));
    }
    public WebElement Boarding_choose(){
        return Hooks.driver.findElement(By.xpath("//div[contains(text(),'CHIKKAMAGALURU')]"));
    }

    //dropping point
    public WebElement Dropping_point(){
         return Hooks.driver.findElement(By.xpath("//div[contains(text(),'Select Dropping Point')]"));
    }
    public WebElement Dropping_choose(){
        return Hooks.driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]"));
    }
    public WebElement provide_passenger_details(){
        return Hooks.driver.findElement(By.xpath("//div[contains(text(),'Provide Passenger Details')]"));
    }

    //customer details
    public WebElement customer_mobile_num(){
        return Hooks.driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[2]"));
    }
    public WebElement customer_email(){
        return Hooks.driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/input[2]"));
    }
   public WebElement proceed_to_passenger_details(){
        return Hooks.driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section[1]/div[1]/div[2]/div[1]/div[2]"));
   }

   //passenger details
    public WebElement passenger_name(){
        return Hooks.driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/input[2]"));
    }
    public WebElement passenger_gender(){
        return Hooks.driver.findElement(By.cssSelector("div.result-container div.srch-card:nth-child(1) div.seatchart section.checkout-wrapper div.left-div div.block:nth-child(2) div.card div.pass-info div:nth-child(3) > input:nth-child(1)"));
    }
    public WebElement passenger_gender_option(){
        return Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]"));
    }

    public WebElement passenger_age(){
        return Hooks.driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[4]/input[2]"));
    }

    public WebElement passenger_concession(){
        return Hooks.driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[5]/input[1]"));
    }
    public WebElement passenger_concession_option(){
        return Hooks.driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[5]/div[1]/div[1]"));
    }
    public WebElement proceed_to_checkout(){
        return Hooks.driver.findElement(By.xpath("//div[contains(text(),'Proceed to Checkout')]"));
    }
}
