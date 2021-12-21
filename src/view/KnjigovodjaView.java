package view;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class KnjigovodjaView extends VBox {
    private Label label;
    public KnjigovodjaView(){
        label= new Label("knjigovodjaview");
        this.getChildren().add(label);
    }
}
