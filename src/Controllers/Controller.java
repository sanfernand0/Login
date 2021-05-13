package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Controller {
    @FXML
    private TextField user;
    @FXML
    private TextField pass;
    @FXML
    private Label lblError;

    public void btnLogin() throws IOException {
        Main main = new Main();

        if(user.getText().equals("test")){
            main.checkLogin("../View/AfterLogin.fxml");
        }else{
            lblError.setText("Datos incorrectos");
        }

    }
}
