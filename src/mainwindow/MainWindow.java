package mainwindow;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class MainWindow {

	
	Stage stage;
	Scene scene ;

  MainWindow(){
	  
	    stage= new Stage();
		stage.setTitle(" Main Page ");
		stage.setWidth(200);
		stage.setHeight(200);
		stage.setFullScreen(true);

		addcomponent();

		stage.setScene(scene);
		stage.show();
  }
 

	public void addcomponent(){

		Button b1 = new Button("");
		Button b2 = new Button("");
		Button b3 = new Button("");
		Button b4 = new Button("");

		b1.setMinSize(200, 100);
		b2.setMinSize(200, 100);
		b3.setMinSize(200, 100);
		//b4.setMinSize(200, 100);
		GridPane g=new GridPane();


		//g.setStyle("-fx-background-image:url("+"'file:///C:/Users/Areeba/IdeaProjects/JavaProject/Download.jpg'"+");"+"-fx-background;");
		b1.setStyle("-fx-background-image:url("+"'file:///C:/Users/Areeba/IdeaProjects/JavaProject/calendar.png'"+");"+"-fx-background-size:cover;");
		b2.setStyle("-fx-background-image:url("+"'file:///C:/Users/Areeba/IdeaProjects/JavaProject/external-link-symbol.png'"+");"+"-fx-background-size:cover;");
		b3.setStyle("-fx-background-image:url("+"'file:///C:/Users/Areeba/IdeaProjects/JavaProject/train-ticket.png'"+");"+"-fx-background-size:cover;");
		//b4.setStyle("-fx-background-image:url("+"'file:///C:/Users/Areeba/IdeaProjects/JavaProject/medical-notes-symbol-of-a-list-paper-on-a-clipboard.png'"+");"+"-fx-background-size:cover;");
		HBox hbox = new HBox(190);
		hbox.getChildren().addAll(b1, b2, b3);
		hbox.setStyle("-fx-background-image:url("+"'file:///C:/Users/Areeba/IdeaProjects/JavaProject/1200x630wa.png'"+");"+"-fx-background-size:cover;");
		scene = new Scene(hbox);



		b1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Schedule b1= new Schedule();

			}
			
		
		
		});
	
	b2.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {

		    CustomerSignup b2 =new CustomerSignup();
		}
		
	});
	
	b3.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {

		    Reservation b3=new Reservation();
		}
		
	});

	
	
	
	
}}
	