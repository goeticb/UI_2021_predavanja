package controler.alerts;

import javafx.scene.control.Alert;

public class WrongUsernameOrPasswordAlert extends Alert {
    public WrongUsernameOrPasswordAlert(AlertType alertType) {
        super(alertType);
        this.setContentText("Pogresan username ili password");
    }

}
