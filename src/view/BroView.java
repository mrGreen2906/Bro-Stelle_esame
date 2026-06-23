package view;

import controller.BroController;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;



public class BroView extends StackPane {


    public BroView(String nome, Color col, BroController c){
        Rectangle r =new Rectangle();
        r.setWidth(70);
        r.setHeight(70);
        r.setFill(col);
        Text t = new Text(nome);
        this.getChildren().add(r);
        this.getChildren().add(t);

        this.setOnMouseClicked(event-> {c.selezionaBro();});

    }


}
