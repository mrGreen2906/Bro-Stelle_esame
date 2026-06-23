package view;

import javafx.scene.layout.BorderPane;

import javax.swing.border.Border;

public class MainView extends BorderPane {
    static MainView m;

    private MainView() {

    }

    public static MainView getInstance() {
        if (m == null) m = new MainView();
        return m;
    }
}
