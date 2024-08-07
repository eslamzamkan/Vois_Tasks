package org.example.StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.Booking_ticket_Locator;


public class Booking_ticket_Action {
  Booking_ticket_Locator book = new Booking_ticket_Locator();
  @When("user Choose the Departure route from CHIKKAMAGALURU")
  public void choose_Departure() throws InterruptedException {
      book.Departure_city().click();
      Thread.sleep(500);
      book.verification().sendKeys("Chikkamagaluru");
      book.Departure_text().click();
  }

  @And("user Choose the Destination route from BENGALURU")
  public void choose_Destination() throws InterruptedException {
     book.Destination_city().click();
     Thread.sleep(500);
     book.verification2().sendKeys("Bengaluru");
     Thread.sleep(500);
     book.Destination_text().click();
}
  @And("user Choose the arrival date only")
  public void choose_Arrival() throws InterruptedException {
      book.arrival_date().click();
      Thread.sleep(500);
      book.choose_date().click();
  }

  @And("Click Search for bus")
  public void search_bus() {
   book.Search_buses().click();
  }

}
