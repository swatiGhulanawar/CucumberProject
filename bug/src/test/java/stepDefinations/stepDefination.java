package stepDefinations;


import org.junit.runner.RunWith;

@RunWith(io.cucumber.junit.Cucumber.class)
public class stepDefination {

    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
    	
    	System.out.println("hello");
       
    }

    @io.cucumber.java.en.When("^When user enteres username and password and logs in$")
    public void when_user_enteres_username_and_password_and_logs_in() throws Throwable {
    	System.out.println("hello");
    }

    @io.cucumber.java.en.Then("^Verify that user is succesfully signed in$")
    public void verify_that_user_is_succesfully_signed_in() throws Throwable {
    	System.out.println("hello");
    }

    @io.cucumber.java.en.And("^Naviagate to url$")
    public void naviagate_to_url() throws Throwable {
    	System.out.println("hello");
    }

    @io.cucumber.java.en.And("^Click on login to home page to land on secure sign in page$")
    public void click_on_login_to_home_page_to_land_on_secure_sign_in_page() throws Throwable {
    	System.out.println("hello");
    }

}