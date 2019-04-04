import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SampleFXML extends Application {

    @Override
    public void start(Stage s){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));

            Scene scene = new Scene(root);

            s.setScene(scene);
            s.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
