package application;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController {
	@FXML Button newCharButton;
	@FXML TextField dmgAmount;
	ArrayList<Player> playerList = new ArrayList<Player>();
	Player currPlayer;

	public Player newChar(){
		String name = "";
		int health = 0;
		Player player = new Player(name, health);
		playerList.add(player);
		return player;
	}

	//TODO!!!!!!!
	public Player highlightPlayer(){
		return currPlayer;
	}


	public int attack(){
		String dmgString = dmgAmount.getText();
		int dmg = stringIntConversion(dmgString);
		return currPlayer.takeDmg(dmg);

	}

	public int heal(){
		String healString = dmgAmount.getText();
		int heal = stringIntConversion(healString);
		return currPlayer.heal(heal);

	}

	public int stringIntConversion(String s){
		int result = 0;
		for(int i=0;i<s.length();i++){
			if((int)s.charAt(i)<49||(int)s.charAt(i)>57){
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setTitle("Not a valid number!");
				alert.setContentText("You did not input a valid number!  Press ok to continue");
				alert.show();
				return 0;
			}
		}
		result = Integer.valueOf(s);
		return result;
	}
}
