package controler.eventhandler;

import controler.alerts.WrongUsernameOrPasswordAlert;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import view.KnjigovodjaView;
import view.LoginView;
import view.RacunovodjaView;
import view.UserView;

public class LoginButtonEventHandler implements EventHandler {
    private LoginView loginView;
    private String username;
    private String password;
    private Stage window;


    public LoginButtonEventHandler(LoginView loginView,Stage window) {
        this.loginView=loginView;
        this.window=window;
    }

    @Override
    public void handle(Event event) {
        username=loginView.getUsernameTF().getText();
        password=loginView.getPasswordTF().getText();

        if(username.equals("bojan")){
            Scene scene = new Scene(new UserView(),300,200);
            window.setScene(scene);
        }
        else if(username.equals("knjigovodja")){
            Scene scene = new Scene(new KnjigovodjaView(),300,200);
            window.setScene(scene);
        }
        else if(username.equals("racunovodja")){
            Scene scene = new Scene(new RacunovodjaView(),300,200);
            window.setScene(scene);
        }
        else{
            Alert alert = new WrongUsernameOrPasswordAlert(Alert.AlertType.ERROR);
            alert.showAndWait();
        }



    }

}
