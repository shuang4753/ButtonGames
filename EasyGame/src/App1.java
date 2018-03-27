import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.text.*;
//Simon Huang
public class App1 extends Application {

	private boolean scoring = false;
	private int score = 0;
	private long timeStep ;

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("Clickerizer!");
		Button btn = new Button();
		
		Text txt = new Text(10,0, "Click Score");

		btn.setOnAction(new EventHandler<ActionEvent>()
		{
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
		new AnimationTimer()
		{
			public void handle(long now)
			{
				if (now > timeStep)
				{
					timeStep = now + 1000000000L;
					scoring = !scoring;
				}
				if (!scoring)
				{
					btn.setText("Don't Click");
				}
				else
				{
					btn.setText("Click Me!");
				}

				txt.setText("Score: " + Integer.toString(score));
			}
		}.start();

		StackPane root = new StackPane();
		HBox hbox = new HBox();
		hbox.getChildren().addAll(btn,txt);
		root.getChildren().add(hbox);
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
	}
}
