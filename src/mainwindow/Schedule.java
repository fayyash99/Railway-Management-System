package mainwindow;

import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class Schedule {

    Stage stage;
    Scene scene,scene1 ;

    Schedule(){

        stage= new Stage();
        stage.setTitle("Schedule");
        stage.setWidth(900);
        stage.setHeight(700);

        addcomponent();
        stage.setScene(scene);
        stage.show();

    }


    private void addcomponent(){

        Label n =new Label("Train Schedule");
        Label n1= new Label("Train Name");
        Label n2= new Label("Destination");
        Label n3 = new Label("Each Ticekt Price");
        Label n4= new Label("\tClass");
        Label n5= new Label("Departure Time");
        Label n6= new Label("Arrival time");

        Label n7= new Label("Green Line");
        Label n8= new Label("Karachi to Rawalpindi");
        Label n9 = new Label("\t6000 & 7000");
        Label n10= new Label("Economy & Buisness");
        Label n11= new Label("\t10:00 PM");
        Label n12= new Label("1:30 PM");

        Label n13= new Label("Green Line");
        Label n14= new Label("Rawalpindi to Karachi");
        Label n15 = new Label("\t6000 & 7000");
        Label n16= new Label("Economy & Buisness");
        Label n17= new Label("\t9:00 PM");
        Label n18= new Label("10:30 AM");

		/*Label n19 =new Label("Train 2");
		Label n20= new Label("Train Name");
        Label n21= new Label("Departure Time");
        Label n22 = new Label("Ticekt Price");
        Label n23= new Label("Class");
		Label n24= new Label("Destination");
		Label n25= new Label("Arrival time");*/

        Label n19= new Label("Paskitan express");
        Label n20= new Label("Karachi to Fasilabad");
        Label n21 = new Label("\t1250 & 4000");
        Label n22 = new Label("Economy & Buisness");
        Label n23= new Label("\t1:00 PM");
        Label n24= new Label("9:00 AM");

        Label n25= new Label("Pakistan express");
        Label n26= new Label("Faslabad to Karachi");
        Label n27 = new Label("\t1250 & 4000");
        Label n28= new Label("Economy & Buisness");
        Label n29= new Label("\t2:00 PM");
        Label n30= new Label("10:00 AM");

        /*Label n38 =new Label("Train 3");
        Label n39= new Label("Train Name");
        Label n40= new Label("Departure Time");
        Label n41 = new Label("Ticekt Price");
        Label n42 = new Label("Class");
        Label n43 = new Label("Destination");
        Label n44 = new Label("Arrival time");*/

        Label n31= new Label("Tezgham");
        Label n32= new Label("Karachi to Peshawar");
        Label n33 = new Label("\t1500 & 2500");
        Label n34= new Label("Economy & Buisness");
        Label n35= new Label("\t2:30 PM");
        Label n36= new Label("4:00 PM");

        Label n37= new Label("Tezgham");
        Label n38= new Label("Peshawar to Karachi");
        Label n39 = new Label("\t1500 & 2500");
        Label n40= new Label("Economy & Buisness");
        Label n41= new Label("\t3:00 PM");
        Label n42= new Label("4:30 PM");

        n.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 20));
        n1.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        n2.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        n3.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        n4.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        n5.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        n6.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));

        /*n19.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 20));
        n20.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        n21.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        n22.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        n23.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        n24.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        n25.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));*/

        /*n38.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 20));
        n39.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        n40.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        n41.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        n42.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        n43.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));
        n44.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 15));*/

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.BASELINE_CENTER);
        grid.setVgap(20);
        grid.setHgap(20);


		/*Calendar time=new GregorianCalendar();
	    int sec=time.get(Calendar.SECOND);
		int min=time.get(Calendar.MINUTE);
		int hour=time.get(Calendar.HOUR);
		Label daytime=new Label("TIME:"+hour+":"+min+":"+sec);
	    grid.add(daytime, 0, 0);
		grid.setMargin(daytime, new Insets(0, 0, 150,0 ) );)*/






        n.setTextFill(Color.BLUE);
        n1.setTextFill(Color.BLUE);
        n2.setTextFill(Color.BLUE);
        n3.setTextFill(Color.BLUE);
        n4.setTextFill(Color.BLUE);
        n5.setTextFill(Color.BLUE);
        n6.setTextFill(Color.BLUE);

		/*n19.setTextFill(Color.BLUE);
		n20.setTextFill(Color.BLUE);
		n21.setTextFill(Color.BLUE);
		n22.setTextFill(Color.BLUE);
		n23.setTextFill(Color.BLUE);
		n24.setTextFill(Color.BLUE);
        n25.setTextFill(Color.BLUE);

        n38.setTextFill(Color.BLUE);
        n39.setTextFill(Color.BLUE);
        n40.setTextFill(Color.BLUE);
        n41.setTextFill(Color.BLUE);
        n42.setTextFill(Color.BLUE);
        n43.setTextFill(Color.BLUE);
        n44.setTextFill(Color.BLUE);*/

        grid.add(n, 0, 0);
        grid.add(n1, 0, 1);
        grid.add(n2, 1, 1);
        grid.add(n3, 2, 1);
        grid.add(n4, 3, 1);
        grid.add(n5, 4, 1);
        grid.add(n6, 5, 1);

        grid.add(n7, 0, 2);
        grid.add(n8, 1, 2);
        grid.add(n9, 2, 2);
        grid.add(n10, 3, 2);
        grid.add(n11, 4, 2);
        grid.add(n12, 5, 2);

        grid.add(n13, 0, 3);
        grid.add(n14, 1, 3);
        grid.add(n15, 2,3);
        grid.add(n16, 3, 3);
        grid.add(n17, 4, 3);
        grid.add(n18, 5, 3);

        /*grid.add(n19, 0, 5);
        grid.add(n20, 0, 6);
        grid.add(n21, 1, 6);
        grid.add(n22, 2, 6);
        grid.add(n23, 3, 6);
        grid.add(n24, 4, 6);
        grid.add(n25, 5, 6);*/

        grid.add(n19, 0, 4);
        grid.add(n20, 1, 4);
        grid.add(n21, 2, 4);
        grid.add(n22, 3, 4);
        grid.add(n23, 4, 4);
        grid.add(n24, 5, 4);

        grid.add(n25, 0, 5);
        grid.add(n26, 1, 5);
        grid.add(n27, 2, 5);
        grid.add(n28, 3, 5);
        grid.add(n29, 4, 5);
        grid.add(n30, 5, 5);

        /*grid.add(n38, 0, 9);
        grid.add(n39, 0, 10);
        grid.add(n40, 1, 10);
        grid.add(n41, 2, 10);
        grid.add(n42, 3, 10);
        grid.add(n43, 4, 10);
        grid.add(n44, 5, 10);*/

        grid.add(n31, 0, 6);
        grid.add(n32, 1, 6);
        grid.add(n33, 2, 6);
        grid.add(n34,3,6);
        grid.add(n35,4,6);
        grid.add(n36,5,6);

        grid.add(n37,0,7);
        grid.add(n38,1,7);
        grid.add(n39,2,7);
        grid.add(n40,3,7);
        grid.add(n41,4,7);
        grid.add(n42,5,7);







        grid.setBackground(new Background(new BackgroundFill(Color.IVORY, null, null)));
        Button back=new Button("Back to main menu");
        Button exit=new Button("Exit");

        grid.add(back, 1, 13);
        grid.add(exit, 3, 13);

        back.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                MainWindow n=new MainWindow();
            }
        });


        exit.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.exit(1);
            }});

        scene = new Scene(grid);


    }
}