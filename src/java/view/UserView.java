package view;


import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class UserView extends VBox {
    private Label label;
    public UserView(){
        label= new Label("userview");
        this.getChildren().add(label);
    }

}
