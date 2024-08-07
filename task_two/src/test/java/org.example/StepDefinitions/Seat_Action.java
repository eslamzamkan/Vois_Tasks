package org.example.StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.Seat_Locator;

public class Seat_Action {
    Seat_Locator seat=new Seat_Locator();

    @And("Select a seat")
    public void select_seat() throws InterruptedException {
    seat.select_seat().click();
    seat.select_number_seat().click();
        Thread.sleep(500);
    }

    @And("Choose the boarding point")
    public void boarding_point() throws InterruptedException {
        seat.Boarding_Point().click();
        Thread.sleep(500);
        seat.Boarding_choose().click();
        Thread.sleep(500);
    }

    @And("user choose dropping point")
    public void dropping_point() throws InterruptedException {
        seat.Dropping_point().click();
        Thread.sleep(500);
        seat.Dropping_choose().click();
        Thread.sleep(500);
        seat.provide_passenger_details().click();
        Thread.sleep(500);
    }

    @And("Fill the Customer")
    public void customer_details() throws InterruptedException {
        seat.customer_mobile_num().sendKeys("6789125987");
        Thread.sleep(500);
        seat.customer_email().sendKeys("eslamzamkan1@gmail.com");
        Thread.sleep(500);
        seat.proceed_to_passenger_details().click();
        Thread.sleep(500);
    }

    @And("Fill Passenger details")
    public void passenger_details() throws InterruptedException {
        seat.passenger_name().sendKeys("islam");
        Thread.sleep(500);
        seat.passenger_gender().click();
        seat.passenger_gender_option().click();
        Thread.sleep(500);
       // seat.passenger_gender_option().click();
        seat.passenger_age().sendKeys("21");
        Thread.sleep(500);
        seat.passenger_concession().click();
        seat.passenger_concession_option().click();
        Thread.sleep(500);
    }

    @Then("Click on make payment and fill all the fields without submitting the payment")
    public void make_payment() throws InterruptedException {
        seat.proceed_to_checkout().click();
        Thread.sleep(500);
    }
}
