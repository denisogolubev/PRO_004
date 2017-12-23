package JavaFX.lesson01.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ViewController {
    @FXML private TextField fldPassword;
    @FXML private TextField fldLogin;

    @FXML
    public void buttonSignUpOnClick () {
    System.out.println("Login: " + fldLogin.getText());
    System.out.println ("Password: " + fldPassword.getText());
    }

    @FXML
    public void buttonPasswordOnClick(){
    System.exit(0);
    }
}
