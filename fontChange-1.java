//Program is created to change font style from text
//Natasha Ramos-Gomez
//COP2513 3/28/2019

//importing my packages
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import java.util.*;
import javafx.collections.*;


public class fontChange extends Application {

	Text textNam = new Text("Programming is Fun!");
	
	//creating the combobox to select from font styles and sizes
	ComboBox<String> comFonSty = new ComboBox<>();
	ComboBox<String> comFonNum = new ComboBox<>();
		
	//creating the checkbox to select bold or italic for the text change
	CheckBox boldCk = new CheckBox("Bold");
	CheckBox italCk = new CheckBox("Italic");
	
	@Override 
	public void start(Stage stage) {
		
		//statement is created to add a list of font styles from font family package
		List<String> fontStyList = Font.getFamilies();
		ObservableList<String> style = FXCollections.observableArrayList(fontStyList); 
		comFonSty.getItems().addAll(style);
		
		//statement is created to set up the list for font sizes ranging from 1 - 100
		ArrayList<String> scroll = new ArrayList<>();	
		for(int n = 1; n < 100; n++)  {
			scroll.add(String.valueOf(n));
			
		}
		ObservableList<String> fontSize = FXCollections.observableArrayList(scroll);
		comFonNum.getItems().addAll(fontSize);
		
		//statement is used to create the combo boxes pane to insert labels font style and size with their lists of functions
		HBox comBox = new HBox();
		comBox.setAlignment(Pos.CENTER);
		comBox.getChildren().addAll(new Label("Font Style:"), comFonSty, new Label("Font Size:"), comFonNum);
		
		//statement used to create our default text "Programming is Fun!
		textNam.setFont(Font.font(35));
		StackPane textBox = new StackPane(textNam);
		
		//setting a default for when program opens up to show set font style with size
		comFonSty.setValue("Verdana");
		comFonNum.setValue("35");
		textNam.setFont(Font.font(fontSty(), fontWeight(), fontPosh(), getNum()));
		
		//statement is created to insert checkboxes with their values
		HBox ckBox = new HBox(5);
		ckBox.setAlignment(Pos.CENTER);
		ckBox.getChildren().addAll(boldCk, italCk);
		textBox.setPadding(new Insets(24, 8, 24, 8));
		
		//statement is used to create outer border pane to hold all panes
		BorderPane outLay = new BorderPane();
		outLay.setTop(comBox);
		outLay.setCenter(textBox);
		outLay.setBottom(ckBox);
		
		//statement used to create handlers and is used to create the action when boxes and lists are check or selected
		boldCk.setOnAction(e -> fontUpdate());
		italCk.setOnAction(e -> fontUpdate());
		comFonSty.setOnAction(e -> fontUpdate());
		comFonNum.setOnAction(e -> fontUpdate());
		
		//statement is used to create scene to display statements
		Scene scene = new Scene(outLay, 450, 350);
		stage.setTitle("Change Style");
		stage.setScene(scene);
		stage.show();
		
		}
		//statement is used to display font properties based on selections made
		public void fontUpdate() {
			textNam.setFont(Font.font(fontSty(), fontWeight(), fontPosh(), getNum()));
			
		}
		//statement to return font style
		public String fontSty() {
			return comFonSty.getValue();
					
		}
		//statement to return bold properties
		public FontWeight fontWeight() {
			return boldCk.isSelected() ? FontWeight.BOLD : FontWeight.NORMAL;		
		}
		//statement to return italic properties
		public FontPosture fontPosh() {
			return italCk.isSelected() ? FontPosture.ITALIC : FontPosture.REGULAR;
		}
		//statement is used to return selected font size
		public int getNum() {
			return Integer.parseInt(comFonNum.getValue());
		}
}
