package org.example.pages;
import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Amazon_Locator {

    //scenario one
public WebElement search_field(){
    return Hooks.driver.findElement(By.id("twotabsearchtextbox"));
}
public WebElement search_button(){
    return Hooks.driver.findElement(By.id("nav-search-submit-button"));
}
public  WebElement first_item(){
    return Hooks.driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/span[1]/a[1]/div[1]/img[1]"));
}
public WebElement Add_to_Cart(){
    return Hooks.driver.findElement(By.cssSelector("#add-to-cart-button"));
}
public WebElement Cart_page(){
    return Hooks.driver.findElement(By.xpath("//html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[4]"));
}
public WebElement success_message(){
    return Hooks.driver.findElement(By.xpath("//h1[contains(text(),'Added to Cart')]"));
}
public WebElement quantity(){
   return Hooks.driver.findElement(By.xpath("//body/div[@id='a-page']/div[1]/div[3]/div[4]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[4]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]/span[1]/span[1]/span[1]"));
}

////scenario 2

    public WebElement deal_today(){
    return Hooks.driver.findElement(By.xpath("//a[contains(text(),\"Today's Deals\")]"));
    }
    public WebElement see_more(){
    return Hooks.driver.findElement(By.xpath("//a[contains(text(),'See more')]"));
    }
    public WebElement grocery_filter(){
    return Hooks.driver.findElement(By.xpath("//span[contains(text(),'Grocery & Gourmet Food')]"));
    }

    public WebElement discount_filter(){
    return Hooks.driver.findElement(By.xpath("//span[contains(text(),'10% off or more')]"));
    }

    public WebElement select_filtered_item( ){
    return Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[21]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]/div[1]"));
    }

    public WebElement add_filtered_item_to_cart(){
    return Hooks.driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
    }


}
