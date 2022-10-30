package com.easyFundraising.pages;

import com.easyFundraising.utilities.Driver;
import org.openqa.selenium.support.PageFactory;


public class RegisterACause extends BasePage {

    public RegisterACause() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

}
