package com.example.stlab200539535week2;

import com.sun.glass.ui.Accessible;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Label MobilePhonedisplay;

    public void initialize() {
        Mobilephone myMobilePhone = new Mobilephone("S23","ultra",2300);
        MobilePhonedisplay.setText(myMobilePhone.toString());

    }




}
