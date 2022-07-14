import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

public class car extends Application {

    public void start(Stage primaryStage) {

        // draw a car using shapes
        Polygon body = new Polygon( 100,100, 300,100, 300,200, 100,200);
        body.setFill(Color.RED);
        Circle wheel1 = new Circle(120,200,20);
        wheel1.setFill(Color.BLACK);
        Circle wheel2 = new Circle(280,200,20);
        wheel2.setFill(Color.BLACK);

        Group root = new Group();
        root.getChildren().add( wheels);

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("Car");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
