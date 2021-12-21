package view;

import controler.eventhandler.LoginButtonEventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginView extends VBox{

    private Label usernameLabel;
    private Label passwordLabel;
    private TextField usernameTF;
    private TextField passwordTF;
    private Button loginButton;

    public LoginView(Stage window){
        this.setPadding(new Insets(10,10,10,10));
        this.setSpacing(10);
        usernameLabel= new Label("Username:");
        usernameTF = new TextField();
        usernameTF.setPromptText("username");
        passwordLabel = new Label("Password:");
        passwordTF = new PasswordField();
        passwordTF.setPromptText("password");
        loginButton = new Button("Login");
        this.getChildren().addAll(usernameLabel,usernameTF,passwordLabel,passwordTF,loginButton);
        loginButton.setOnAction(new LoginButtonEventHandler(this,window));
    }

    public Label getUsernameLabel() {
        return usernameLabel;
    }

    public void setUsernameLabel(Label usernameLabel) {
        this.usernameLabel = usernameLabel;
    }

    public Label getPasswordLabel() {
        return passwordLabel;
    }

    public void setPasswordLabel(Label passwordLabel) {
        this.passwordLabel = passwordLabel;
    }

    public TextField getUsernameTF() {
        return usernameTF;
    }

    public void setUsernameTF(TextField usernameTF) {
        this.usernameTF = usernameTF;
    }

    public TextField getPasswordTF() {
        return passwordTF;
    }

    public void setPasswordTF(TextField passwordTF) {
        this.passwordTF = passwordTF;
    }

    public Button getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(Button loginButton) {
        this.loginButton = loginButton;
    }
}
