package mainwindow;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class CustomerSignup {

    Stage stage;
    Scene scene,scene1 ;

    CustomerSignup(){

        stage= new Stage();
        stage.setTitle("Customer Signup Screen");
        stage.setWidth(700);
        stage.setHeight(700);
        addcomponent();
        stage.setScene(scene);
        stage.show();

    }


    private void addcomponent(){
        Label n1= new Label("Customer Name");
        TextField t1 = new TextField();
        Label n2= new Label("Address");
        TextField t2 = new TextField();
        Label n3= new Label("Email");
        TextField t3 = new TextField();
        Label n4= new Label("Mobile Number");
        TextField t4 = new TextField();
        Label n5= new Label("CNIC No");
        TextField t5 = new TextField();
        Label n6= new Label("Date of Birth");
        TextField t6 = new TextField();
        n1.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 20));
        n2.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 20));
        n3.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 20));
        n4.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 20));
        n5.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 20));
        n6.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 20));

        Button submitButton = new Button("Submit");
        Button exitButton=new Button("Exit");
        Button backButton=new Button("Back to main menu");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.BASELINE_CENTER);
        grid.setVgap(20);
        grid.setHgap(20);

        grid.add(n1, 0, 0);
        grid.add(t1, 0, 1);
        grid.add(n2, 0, 2);
        grid.add(t2, 0, 3);
        grid.add(n3, 0, 4);
        grid.add(t3, 0, 5);
        grid.add(n4, 0, 6);
        grid.add(t4, 0, 7);
        grid.add(n5, 0, 8);
        grid.add(t5, 0, 9);
        grid.add(n6, 0, 10);
        grid.add(t6, 0, 11);
        grid.add(submitButton, 0, 12);
        grid.add(exitButton, 1, 12);
        grid.add(backButton, 2, 12);

        grid.setBackground(new Background(new BackgroundFill(Color.IVORY, null, null)));


        scene = new Scene(grid);

        submitButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                String detail = "";

                detail+=n1.getText()+":";
                detail+=t1.getText() +"\n";

                detail+=n2.getText()+":";
                detail+=t2.getText()+"\n";

                detail+=n3.getText()+":";
                detail+=t3.getText()+"\n";

                detail+=n4.getText()+":";
                detail+=t4.getText()+"\n";

                detail+=n5.getText()+":";
                detail+=t5.getText()+"\n";

                detail+=n6.getText()+":";
                detail+=t6.getText()+"\n";
                if(t1.getText().isEmpty()){
                    Alert a1=new Alert(AlertType.ERROR);
                    a1.setHeaderText("INFO");
                    a1.setContentText("Please Enter Name");
                    a1.show();
                    return;
                }
                if(t2.getText().isEmpty()){
                    Alert a2=new Alert(AlertType.ERROR);
                    a2.setHeaderText("INFO");
                    a2.setContentText("Please Enter Adress");
                    a2.show();
                    return;
                }
                if(t3.getText().isEmpty()){
                    Alert a3=new Alert(AlertType.ERROR);
                    a3.setHeaderText("INFO");
                    a3.setContentText("Please Enter Email");
                    a3.show();
                    return;
                }
                if(t4.getText().isEmpty()){
                    Alert a4=new Alert(AlertType.ERROR);
                    a4.setHeaderText("INFO");
                    a4.setContentText("Please Enter Mobile No");
                    a4.show();
                    return;
                }
                if(t5.getText().isEmpty()){
                    Alert a5=new Alert(AlertType.ERROR);
                    a5.setHeaderText("INFO");
                    a5.setContentText("Please Enter CNIC No");
                    a5.show();
                    return;
                }
                if(t6.getText().isEmpty()){
                    Alert a6=new Alert(AlertType.ERROR);
                    a6.setHeaderText("INFO");
                    a6.setContentText("Please Enter Date of Birth");
                    a6.show();
                    return;
                }
                Alert a7 = new Alert(AlertType.CONFIRMATION);
                a7.setHeaderText("Successfull");
                a7.setContentText("You are Successfull Signup");
                a7.show();

                try {
                    Connection.writetoFile(detail);

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        exitButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                System.exit(1);
            }

        });
        backButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                MainWindow n=new MainWindow();
            }

        });
    }



}