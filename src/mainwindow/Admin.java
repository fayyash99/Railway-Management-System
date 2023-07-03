package mainwindow;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class Admin extends Application {

    public static void main(String[] args) {

        launch(args);
    }


    @Override
    /*public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        primaryStage.setTitle("Login Portal");
        addComponent();
        primaryStage.setScene(new Scene(root, 700,700));
        primaryStage.setScene(s);
        primaryStage.show();
    }*/
    public void start(Stage stage) throws Exception {
        stage.setTitle("    Admin Portal  ");
        stage.setHeight(700);
        stage.setWidth(700);
        stage.setFullScreen(true);
        stage.setResizable(false);
        addComponent();
        stage.setScene(s);
        stage.show();
    }
    Scene s;
    private void addComponent()
    {

        Label admin=new Label("Admin");
        admin.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 70));
        admin.setTextFill(Color.BLACK);

        Label user=new Label("username");
        TextField u=new  TextField();
        u.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, null, null)));
        user.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD	, FontPosture.REGULAR, 20));


        Label password=new Label("Password");
        PasswordField p=new  PasswordField();
        password.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD	, FontPosture.REGULAR, 20));
        p.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, null, null)));


        Button n=new Button("login");
        //Button n1=new Button("Signup");
        Button n2=new Button("Exit");

        n.setMinSize(130, 20);
        n2.setMinSize(130, 20);

        GridPane g=new GridPane();
        g.setAlignment(Pos.BASELINE_LEFT);

        g.setStyle("-fx-background-image:url("+"'file:///C:/Users/Areeba/IdeaProjects/JavaProject/1200x630wa.png'"+");"+"-fx-background-size:cover;");
        g.setVgap(20);
        g.setHgap(20);
        g.add(admin	, 0, 0);
        g.add(user,0,1);
        g.add(u,0,1);
        g.setMargin(u, new Insets(0, 0, 0, 150));

        g.add(password, 0,2);
        g.add(p,0,2);
        g.setMargin(p, new Insets(0, 0, 0, 150));

        g.add(n,0,3);
        //g.add(n1, 1 ,3);
        g.add(n2, 0 ,3);
        g.setMargin(n2, new Insets(0, 0, 0, 150));

        s=new Scene(g);
        n.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                String name,password;
                password=p.getText();
                name=u.getText();

                if(u.getText().isEmpty()){
                    Alert u=new Alert(AlertType.ERROR);
                    u.setHeaderText("INFO");
                    u.setContentText("Please Enter User Name");
                    u.show();
                    return;

                }
                if(p.getText().isEmpty()){
                    Alert p=new Alert(AlertType.ERROR);
                    p.setHeaderText("INFO");
                    p.setContentText("Please Enter Password");
                    p.show();
                    return;

                }

                if(name.equals("Admin") && password.equals("admin123"))
                {
                    n.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle(ActionEvent event) {

                            MainWindow n=new MainWindow();
                        }
                    });
                }
                /*if(name!="Admin"){
                    Alert a2=new Alert(AlertType.ERROR);
                    //a2.setHeaderText("INFO");
                    a2.setContentText("Incorrect User name ");
                    a2.show();
                    return;
                }
                if(password!="admin123"){
                    Alert a3=new Alert(AlertType.ERROR);
                    //a2.setHeaderText("INFO");
                    a3.setContentText("Incorrect Password");
                    a3.show();
                    return;
              }*/


                else
                {
                    Alert a1=new Alert(AlertType.ERROR);
                    a1.setHeaderText("INFO");
                    a1.setContentText("LOGIN ERROR");
                    a1.show();

                }
            }
        });


        n2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.exit(1);
            }
        });
    }
}
