import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.text.*;
//Simon Huang
public class AnimationTimer {

	private boolean scoring;
	private int score;
	
	public AnimationTimer(boolean scoring, int score)
	{
		this.scoring = false;
		this.score = 0;
	}
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("Clickerizer!");
		Button btn = new Button();
		Text txt = new Text(10,0, "Click Score");
		
		btn.setOnAction(new EventHandler<ActionEvent>());
		
		@Override
		public void handle(ActionEvent event)
		{
			if (scoring)
			{
				score ++;
			}
			else
			{
				score--;
			}
		}
	});
	
	timeStep = System.nanoTime()+1000000000L;
	new AnimationTimer();
}
