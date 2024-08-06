package org.example.StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Amazon_Locator;
import org.testng.Assert;


public class Amazon_Step_Action {
    //Take object from home page
   Amazon_Locator home=new Amazon_Locator();

   //scenario 1
   @Given("user navigates to home page")
   public void user_navigate_to_home_page(){
       home.search_field().click();
    }
  @When("user search for car accessories")
    public void user_open_amazon_link(){
     home.search_field().sendKeys("car accessories");
    }
    @And("user clicks on the search button")
    public void search_click_button(){
       home.search_button().click();
    }

  @And("Select the first Item")
    public void user_Select_the_first_Item() throws InterruptedException {
      home.first_item().click();
      Thread.sleep(500);
    }

    @And("Add item to the cart")
    public void add_to_cart() throws InterruptedException {
       home.Add_to_Cart().click();
        Thread.sleep(500);
    }
   @And("display cart page")
   public void cart_page() throws InterruptedException {
       home.Cart_page().click();
       Thread.sleep(500);
   }
    @Then("Go to the cart and check that item is added successfully and greater than 0")
    public void check_quantity(){
       //Assertion based on quantity
        String quantity = home.quantity().getAttribute("value");
        int value = Integer.parseInt(quantity);
         Assert.assertTrue(value > 0);
//another soft assert
//        SoftAssert soft = new SoftAssert();
//        String expectedMessage="Added to Cart";
//        String actualMessage = home.success_message().getText();
//        soft.assertEquals(actualMessage, expectedMessage);
//
//        String actualColor = home.success_message().getCssValue("background-color");
//        String expectedColor = "#4bb07a";  // Update with the correct hex color
//        actualColor = Color.fromString(actualColor).asHex();
//        soft.assertEquals(actualColor, expectedColor);
//        soft.assertAll();
    }

    // scenario two
    @When("Open today's deals")
    public void open_today_deals() throws InterruptedException {
     home.deal_today().click();
        Thread.sleep(500);
    }

    @And("from the left side filters select grocery")
    public void filter_grocery() throws InterruptedException {
       home.see_more().click();
       home.grocery_filter().click();
     Thread.sleep(500);
    }
    @And("from the discount part choose 10% off or more")
    public void discount_pert() throws InterruptedException {
        home.discount_filter().click();
        Thread.sleep(500);
    }
    @And("go to the fourth page then select any item")
    public void select_filtered_item() throws InterruptedException {
     home.select_filtered_item().click();
     Thread.sleep(500);
    }
   @Then("add filtered item to the cart")
    public void add_filtered_item_tom_cart() throws InterruptedException {
    home.add_filtered_item_to_cart().click();
    Thread.sleep(500);
   }

}
