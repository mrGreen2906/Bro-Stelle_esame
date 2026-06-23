package view;

import controller.BroCentralController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class BroCentralView extends StackPane {

    private BroCentralController b;
    Circle c;
    Rectangle r;
    Text t1, t2, t3;

    public BroCentralView(String i1, String i2, String i3, int radius, Color col, BroCentralController b) {
        this.b = b;

        c = new Circle();
        c.setRadius(radius);
        c.setFill(Color.GREEN);
        c.setOnMouseClicked(event -> {b.attacco();});
        this.getChildren().add(c);


        r = new Rectangle(130, 90);
        r.setFill(col);

        t1 = new Text(i1);
        t2 = new Text(i2);
        t3 = new Text(i3);
        t1.setFill(Color.WHITE);
        t2.setFill(Color.WHITE);
        t3.setFill(Color.WHITE);

        VBox b1 = new VBox(3);
        b1.setAlignment(Pos.CENTER);
        b1.setMaxHeight(90);
        b1.setMaxWidth(130);
        b1.getChildren().addAll(t1, t2, t3);

        StackPane rectStack = new StackPane(r, b1);
        rectStack.setAlignment(Pos.CENTER);

        Button btn = new Button("+");
        btn.setOnMouseClicked(event -> { b.incrementLvl(); });

        HBox hb = new HBox(10);
        hb.setAlignment(Pos.CENTER);
        hb.getChildren().addAll(rectStack, btn);

        this.setAlignment(Pos.CENTER);
        this.getChildren().add(hb);
        hb.setPickOnBounds(false);
        this.setPickOnBounds(false);
    }

    public void updateInfo(String i1, String i2, String i3) {
        t1.setText(i1);
        t2.setText(i2);
        t3.setText(i3);
    }
}