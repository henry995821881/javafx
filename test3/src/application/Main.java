package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;


	public class Main extends Application {

	    @Override
	    public void start(Stage stage) {
	        VBox box = new VBox();
	        final Scene scene = new Scene(box,300, 250);
	        scene.setFill(null);

	        Line line = new Line();
	        line.setStartX(0.0f);
	        line.setStartY(0.0f);
	        line.setEndX(100.0f);
	        line.setEndY(100.0f);

	        box.getChildren().add(line);

	        stage.setScene(scene);
	        stage.show();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	}
