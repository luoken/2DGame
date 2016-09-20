//creates window, starts application
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;;
public class app extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		HBox hpane = new HBox();
		hpane.getChildren().add(new Button("hello world"));
		
		
		Scene S = new Scene(hpane);
		
		primaryStage.setScene(S);
		primaryStage.show();
		
		
		
		
	}
	
	public static void main(String [] args){
		Application.launch(args);
	}

	
}
