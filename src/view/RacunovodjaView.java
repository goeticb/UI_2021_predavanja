package view;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class RacunovodjaView extends VBox {
    private Label label;
    public RacunovodjaView(){
        label= new Label("racunovodjaview");
        this.getChildren().add(label);
    }
}
