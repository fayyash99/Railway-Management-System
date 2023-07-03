package mainwindow;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShowData {
	Stage stage;
	Scene scene;
	String data;
	public ShowData(String data) {
		this.data = data;
		stage = new Stage();
		stage.setTitle("Reservation Show Data");
		stage.setWidth(500);
		stage.setHeight(600);
		
		addcomponent();
		stage.setScene(scene);
		
		stage.show();
	
	}

	private void addcomponent() {
		
		VBox v = new VBox(10);
		
		Label head = new Label("Reservation");
		
		ListView<String> datalist = new ListView<String>();
		datalist.getItems().add(data);
		
		v.getChildren().addAll(head, datalist);
		
		scene = new Scene(v);
		
		
		
	}
}
