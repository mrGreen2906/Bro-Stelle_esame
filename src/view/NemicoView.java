package view;

import controller.NemicoController;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;



public class NemicoView extends HBox {
    Text t;
    public NemicoView(String info, NemicoController c){
        t=new Text(info);
        Button btn =new Button("Reset");
        btn.setOnMouseClicked(event -> {c.refresh();});
        this.getChildren().add(t);
        this.getChildren().add(btn);
        this.setSpacing(10);

    }

    public void aggiornaHp(String info){
        t.setText(info);
    }
}
