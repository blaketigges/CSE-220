import javafx.animation.FillTransition;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;


public class car extends Application {

    public void start(Stage primaryStage) {

        // draw a car using shapes
        Polygon top = new Polygon( 100,130, 260,100, 370,150);
        top.setFill(Color.DARKGREY);
        Polygon body = new Polygon(100,130, 370,150, 360,180, 110,175);
        body.setFill(Color.GRAY);
        Polygon window = new Polygon(350,145, 210,132.5, 210,115, 260,105);
        window.setFill(Color.DARKBLUE);
        Circle wheel1 = new Circle(150,180,22);
        wheel1.setFill(Color.BLACK);
        Circle wheel2 = new Circle(320,180,22);
        wheel2.setFill(Color.BLACK);

        // add buttons to the scene
        Button button = new Button("Spin");
        Button button2 = new Button("Random Colors");
        Button button3 = new Button("Reset Colors");
        VBox buttons = new VBox(10);
        buttons.getChildren().addAll(button, button2, button3);

        Group cybertruck = new Group(top, window, body, wheel1, wheel2);
        Group root = new Group(cybertruck, buttons);

        Scene scene = new Scene(root, 400, 400);
        EventHandler<ActionEvent> eventHandler = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                // spin the car
                RotateTransition rt = new RotateTransition(Duration.millis(1000), cybertruck);
                rt.setByAngle(360);
                rt.play();
            }
        };
        button.setOnAction(eventHandler);
        EventHandler<ActionEvent> eventHandler2 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                // give it random colors
                top.setFill(Color.rgb((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
                body.setFill(Color.rgb((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
                window.setFill(Color.rgb((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
                wheel1.setFill(Color.rgb((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
                wheel2.setFill(Color.rgb((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));

            }
        };
        button2.setOnAction(eventHandler2);

        EventHandler<ActionEvent> eventHandler3 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                // reset colors to default
                top.setFill(Color.DARKGREY);
                body.setFill(Color.GRAY);
                window.setFill(Color.DARKBLUE);
                wheel1.setFill(Color.BLACK);
                wheel2.setFill(Color.BLACK);
            }
        };
        button3.setOnAction(eventHandler3);

        primaryStage.setTitle("Car");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
