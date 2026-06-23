package view;

import controller.VetrinaController;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import javax.swing.border.Border;

public class MainView extends BorderPane {
    static MainView m;

    VetrinaController vc;
    private MainView() {
        vc = new VetrinaController();
        VBox box1 = new VBox();
        Button b1 = new Button("Ordina per Vita");
        b1.setOnMouseClicked(event->{vc.ordinaPerVita();});
        Button b2 = new Button("Ordina per Nome");
        b1.setOnMouseClicked(event->{vc.ordinaPerNome();});
        box1.getChildren().add(b1);
        box1.getChildren().add(b2);
        this.setLeft(box1);

    }

    public static MainView getInstance() {
        if (m == null) m = new MainView();
        return m;
    }
}
