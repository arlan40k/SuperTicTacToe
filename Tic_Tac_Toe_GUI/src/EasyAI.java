import java.util.Random;

public class EasyAI extends AI {

	@Override
	public int makeMove(Gameboard gameboard) {
		
		int test;
		Random rand = new Random();
		int  position;
		
		while(true)
		{
			position = rand.nextInt(24);
			if(gameboard.getTiles().get(position).getText().equals(""))
				break;
		}
		
		return position;
	}

	
}
