package com.easyFundraising.pages;

import com.easyFundraising.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class RegisterABussiness extends BasePage {

    public RegisterABussiness() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

}
