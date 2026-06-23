package view;

import controller.BroCentralController;
import controller.VetrinaController;
import controller.comparators.NemicoController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MainView extends BorderPane {
    private static MainView m;
    private HBox br;
    private VetrinaController vc;
    private BroCentralController bc;
    private NemicoController n;

    private MainView() {
        n= new NemicoController();
        this.setBottom(n.getV());

        vc = new VetrinaController();
        this.setTop(vc.getV());

        VBox box1 = new VBox();
        Button b1 = new Button("Ordina per Vita");
        b1.setOnMouseClicked(event -> { vc.ordinaPerVita(); });
        Button b2 = new Button("Ordina per Nome");
        b2.setOnMouseClicked(event -> { vc.ordinaPerNome(); });
        box1.getChildren().add(b1);
        box1.getChildren().add(b2);
        box1.setSpacing(10);
        this.setLeft(box1);

        // rettangolo nero 300x300 sempre presente
        StackPane centro = new StackPane();
        Rectangle nero = new Rectangle(300, 300);
        nero.setFill(Color.BLACK);
        centro.getChildren().add(nero);

        this.br = new HBox();
        this.br.setAlignment(Pos.CENTER);
        centro.getChildren().add(this.br);

        this.setCenter(centro);
    }

    public static MainView getInstance() {
        if (m == null) m = new MainView();
        return m;
    }

    public void setBroCentrale(BroCentralController b) {
        this.bc = b;
        this.br.getChildren().clear();
        this.br.getChildren().add(bc.getV());
    }

    public NemicoController getNemico(){
        return this.n;
    }
}