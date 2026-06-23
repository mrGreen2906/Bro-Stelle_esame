package view;

import controller.BroController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;



public class BroView extends StackPane {

    private BroController b;
    Circle c ;
    Rectangle r;
    Text t1,t2,t3;
    public BroView(String i1, String i2, String i3, int radius, Color col, BroController b){
        this.b=b;
        c=new Circle();
        c.setRadius(radius);
        this.getChildren().add(c);

        r=new Rectangle();
        r.setHeight(90);
        r.setWidth(130);
        r.setFill(col);


        VBox b1 = new VBox();
        t1= new Text(i1);
        t2= new Text(i2);
        t3= new Text(i3);
        b1.getChildren().add(t1);
        b1.getChildren().add(t2);
        b1.getChildren().add(t3);

        StackPane rectStack = new StackPane(r,b1);

        Button btn = new Button("+");
        btn.setOnMouseClicked(event->{b.incrementLvl();});

        HBox hb = new HBox(10);
        hb.getChildren().addAll(rectStack, btn);
        hb.setAlignment(Pos.CENTER);

        this.getChildren().add(hb);



    }
}
