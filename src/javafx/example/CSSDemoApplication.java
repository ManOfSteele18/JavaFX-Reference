package javafx.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CSSDemoApplication extends Application {

	/* To run this in Eclipse you have to add the JavaFX library to the build path first.
	   You must also add "--module-path "your\path\to\javafx-sdk-15.0.1\lib" --add-modules javafx.controls,javafx.fxml" 
	   to Run Configurations > Arguments > VM Arguments without the double quotes. */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("css_demo.fxml"));
        Scene scene = new Scene(root, 800, 500);
        scene.getStylesheets().add(getClass().getResource("demo.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}