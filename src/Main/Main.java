package Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.MainView;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        MainView m = MainView.getInstance();
        stage.setTitle("Bro-Stelle");
        stage.setScene(new Scene(m, 500, 450));
        stage.show();
    }

    static void main(String[] args) {
        launch(args);
    }
}