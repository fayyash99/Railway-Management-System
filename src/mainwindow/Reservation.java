package mainwindow;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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


public class Reservation {

    Stage stage;
    Scene scene,scene1 ;

    Reservation(){

        stage= new Stage();
        stage.setTitle("Ticket Reservation Screen");
        stage.setWidth(700);
        stage.setHeight(700);

        addcomponent();
        stage.setScene(scene);
        stage.show();

    }


    private void addcomponent(){
        Label n= new Label("Train Details");
        Label n1= new Label("Customer Name");
        TextField t1 = new TextField();
        Label n2= new Label("Train Name");
        TextField t2 = new TextField();
        Label n3= new Label("Class");
        TextField t3 = new TextField();
        //Label n4= new Label("Departure");
        //TextField t4 = new TextField();
        Label n5= new Label("Ticket Charges");
        TextField t5 = new TextField();
        Label n6= new Label("Total seats reserved");
        TextField t6 = new TextField();
        Label n7= new Label("Seat no");
        TextField t7 = new TextField();
        Label n8= new Label("Destination");
        TextField t8 = new TextField();
        n.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 25));
        n1.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        n2.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        n3.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        //n4.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        n5.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        n6.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        n7.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        n8.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        Button submitButton=new Button("Submit");
        Button exitButton=new Button("Exit");
        Button backButton=new Button("Back to main menu");



        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(20);
        grid.setHgap(20);
        grid.add(n, 0, 0);
        grid.add(n1, 0, 1);
        grid.add(t1, 1, 1);
        grid.add(n2, 0, 2);
        grid.add(t2, 1, 2);
        grid.add(n3, 0, 3);
        grid.add(t3, 1, 3);
        //	grid.add(n4, 0, 4);
        //grid.add(t4, 1, 4);
        grid.add(n5, 0, 5);
        grid.add(t5, 1, 5);
        grid.add(n6, 0, 6);
        grid.add(t6, 1, 6);
        grid.add(n7, 0, 7);
        grid.add(t7, 1, 7);
        grid.add(n8, 0, 8);
        grid.add(t8, 1, 8);
        grid.add(submitButton, 0, 9);
        grid.add(exitButton, 1, 9);
        grid.add(backButton, 2, 9);
        //grid.setMargin(a, new Insets(0,	 0,0,150));
        //grid.setMargin(a1, new Insets(0, 0, 0, 150));
        grid.setBackground(new Background(new BackgroundFill(Color.IVORY, null, null)));


        scene = new Scene(grid);
        submitButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                String detail="";

                detail+=n1.getText()+":";
                detail+=t1.getText() +"\n";

                detail+=n2.getText()+":";
                detail+=t2.getText()+"\n";

                detail+=n3.getText()+":";
                detail+=t3.getText()+"\n";

                //	detail+=n4.getText()+":";
                ///detail+=t4.getText()+"\n";

                detail+=n5.getText()+":";
                detail+=t5.getText()+"\n";

                detail+=n6.getText()+":";
                detail+=t6.getText()+"\n";

                detail+=n7.getText()+":";
                detail+=t7.getText()+"\n";

                detail+=n8.getText()+":";
                detail+=t8.getText()+"\n";
                if(t1.getText().isEmpty()){
                    Alert a1=new Alert(Alert.AlertType.ERROR);
                    a1.setHeaderText("INFO");
                    a1.setContentText("Please Enter Name");
                    a1.show();
                    return;
                }
                if(t2.getText().isEmpty()){
                    Alert a2=new Alert(Alert.AlertType.ERROR);
                    a2.setHeaderText("INFO");
                    a2.setContentText("Please Enter Train Name");
                    a2.show();
                    return;
                }
                if(t3.getText().isEmpty()){
                    Alert a3=new Alert(Alert.AlertType.ERROR);
                    a3.setHeaderText("INFO");
                    a3.setContentText("Please Enter Train Class");
                    a3.show();
                    return;
                }
                if(t5.getText().isEmpty()){
                    Alert a5=new Alert(Alert.AlertType.ERROR);
                    a5.setHeaderText("INFO");
                    a5.setContentText("Please Enter Charges");
                    a5.show();
                    return;
                }
                if(t6.getText().isEmpty()){
                    Alert a6=new Alert(Alert.AlertType.ERROR);
                    a6.setHeaderText("INFO");
                    a6.setContentText("Please Enter Total Seat ");
                    a6.show();
                    return;
                }
                if(t7.getText().isEmpty()){
                    Alert a7=new Alert(Alert.AlertType.ERROR);
                    a7.setHeaderText("INFO");
                    a7.setContentText("Please Enter Seat No");
                    a7.show();
                    return;
                }
                if(t8.getText().isEmpty()){
                    Alert a8=new Alert(Alert.AlertType.ERROR);
                    a8.setHeaderText("INFO");
                    a8.setContentText("Please Enter Destination");
                    a8.show();
                    return;
                }
                Alert a9 = new Alert(Alert.AlertType.CONFIRMATION);
                a9.setHeaderText("Successfull");
                a9.setContentText("You are Successfull Reservation");
                a9.show();

                ShowData sd = new ShowData(detail);

                System.out.println(detail);
                try {
                    Connection.writetoFile(detail);

                } catch (IOException ex) {
                    ex.printStackTrace();
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



    }}
