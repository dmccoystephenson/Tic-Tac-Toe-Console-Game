
public class Driver {

	public static void main(String[] args) {
		
		ThreeByThreeGrid myGrid = new ThreeByThreeGrid();
		
		TicTacToe theGame = new TicTacToe(myGrid);
		
		theGame.play();

	}

}
 