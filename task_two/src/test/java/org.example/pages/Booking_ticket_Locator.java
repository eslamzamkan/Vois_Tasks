package org.example.pages;
import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Booking_ticket_Locator {
    public WebElement Departure_city(){
     return Hooks.driver.findElement(By.xpath("//span[contains(text(),'Select Departure City')]"));
    }
    public WebElement verification(){
        return Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/section[1]/div[3]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
    }
    public WebElement Departure_text() {
        return Hooks.driver.findElement(By.xpath("//li[contains(text(),'Chikkamagaluru')]"));
    }
  public WebElement Destination_city(){
        return Hooks.driver.findElement(By.xpath("//span[contains(text(),'Select Destination City')]"));
  }
  public WebElement verification2(){
        return Hooks.driver.findElement(By.xpath("//body[1]/div[1]/div[2]/section[1]/div[3]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
  }
    public WebElement Destination_text() {
       // return Hooks.driver.findElement(By.xpath("//li[contains(text(),'Bengaluru')]"));
        return Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/section[1]/div[3]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]"));
                }

    public WebElement arrival_date() {
        return Hooks.driver.findElement(By.xpath("//label[contains(text(),'Date of Departure')]"));
    }
    public WebElement choose_date(){
        return Hooks.driver.findElement(By.xpath("//a[contains(text(),'17')]"));
    }
    public WebElement Search_buses() {
        return Hooks.driver.findElement(By.xpath("//div[@id='submitSearch']"));
    }
}
