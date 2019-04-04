import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML public JFXTextField inputValue;
    @FXML public JFXTextField hexValue;
    @FXML public JFXTextField binaryValue;
    @FXML public JFXTextField octalValue;

    @Override
    public void initialize(URL url, ResourceBundle rb){

    }
}
