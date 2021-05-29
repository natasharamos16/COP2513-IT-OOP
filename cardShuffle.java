//Program created to select 3 random cards from 52 deck of cards
//Created by Natasha Ramos-Gomez
//2/28/2019
//Tampa,FL
//USF COP2513
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import java.util.ArrayList;



public class cardShuffle extends Application {
	
	
	@Override
	public void start(Stage firstShuffle) {
		//Creating Array List//
		ArrayList<Integer> startCards = getCards();
		
		//Creating my pane grid with a horizontal pane
		HBox horiPane = new HBox(9);//9 is used to space out cards
		
      //Statement used to retrieve images of cards and select 3 random cards
      for (int n = 0; n < 3; n++) {
			horiPane.getChildren().add(new ImageView(new Image("image/card/"+ startCards.get(n) + ".png")));
		}
				
		//Setting up my stage with title and displays
		Scene scene = new Scene (horiPane);
		firstShuffle.setTitle("Card Shuffle");
		firstShuffle.setScene(scene);
		firstShuffle.show();
	}
	//Creating my array and statement that will return the list of cards 1-52	
	private ArrayList<Integer> getCards()
	{
		ArrayList<Integer> startCards = new ArrayList<>();
		for (int shuff = 0; shuff < 52; shuff++) {
			startCards.add(shuff + 1);
			
		}
      //Statement is used to shuffle the cards 
		java.util.Collections.shuffle(startCards);
		return startCards;
	}
}	

