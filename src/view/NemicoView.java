package view;

import controller.comparators.NemicoController;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import model.Nemico;



public class NemicoView extends HBox {
    Text t;
    public NemicoView(String info, NemicoController c){
        t=new Text(info);
        Button btn =new Button("Clear");
        btn.setOnMouseClicked(event -> {c.refresh();});
        this.getChildren().add(t);
        this.getChildren().add(btn);

    }

    public void aggiornaHp(String info){
        t.setText(info);
    }
}
