//Program used to create a circle that detects when the mouse pointer is inside or outside of the circle
//Created by Natasha Ramos-Gomez
//COP2513 USF
//3/6/19

//importing javafx packages
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class geoCircle extends Application {
	
	@Override
	public void start(Stage stage) {
		
      //creating layout for program
		Pane back = new Pane();
		
      //creating the circle with the desired radius 
		Circle circle = new Circle(100, 60, 50);
		circle.setFill(Color.PINK);//setting the color of the circle
		circle.setStroke(Color.PURPLE);
		back.getChildren().add(circle);//adding the circle to the pane
		
      //Creating statement that enables the users mouse pointer and displays
      //message to let them know whether its inside or outside the circle
		back.setOnMouseMoved(e -> {
			back.getChildren().clear();
         Text message = new Text(e.getX(), e.getY(), "Mouse point is " + (circle.contains(e.getX(), e.getY()) ? "inside " : "outside ") + "the circle");
			
			back.getChildren().addAll(circle, message);
		});
      //Statement used to display elements 
		Scene scene = new Scene(back, 360, 200);
		stage.setTitle("Follow the mouse");
		stage.setScene(scene);
		stage.show();
	}

}
