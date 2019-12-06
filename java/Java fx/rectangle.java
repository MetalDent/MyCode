import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class rectangle extends Application {

	@Override
	public void start(Stage applicationStage) {

		Pane pane = new Pane();
		Scene scene = new Scene();
		Canvas canvas = new Canvas(400, 800);

		GraphicsContext grpcnt = canvas.getGraphicsContext2D();

		Color c1 = Color.rgb(255, 120, 140);
		grpcnt.setfill(c1);
		grpcnt.fillRect(10, 10, 30, 10);

		pane.getchildren().add(canvas);
		applicationStage.setTitle("Rectangle");
		applicationStage.setScene(scene);
		applicationStage.show();

		return;
	}

	public static void main(String[] args) {
		
		launch(args);

		return;
	}
}