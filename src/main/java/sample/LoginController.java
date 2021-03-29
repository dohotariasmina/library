package sample;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.awt.*;
import java.io.File;
import java.util.ResourceBundle;
import java.net.URL;


public class LoginController implements Initializable {
    @FXML
    private Button cancelButton;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private ImageView brandingImageView;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File brandingFile= new File("images/71ol1jY8qQL._AC_SL1024_.jpg");
        Image brandingImage= new Image(brandingFile.toURI().toString());
        brandingImageView.setImage(brandingImage);

    }

    public void loginButtonOnAction(ActionEvent event){


            loginMessageLabel.setText("Please enter username and password");

    }
    public void cancelButtonOnAction(ActionEvent event){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
    
}
