package sora;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sora.controller.MainWindow;

/**
 * A GUI for Sora using FXML.
 */
public class Main extends Application {
    /**
     * Initialize and start the program in GUI interface.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            fxmlLoader.<MainWindow>getController().setDuke(new Sora(false));

            stage.setScene(scene);
            stage.setResizable(false);
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
