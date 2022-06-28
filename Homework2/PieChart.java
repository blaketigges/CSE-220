import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PieChart extends Application {
    // create java fx application
    public void start(Stage primaryStage)
    {
        TextField textField1 = new TextField();
        TextField pieText1 = new TextField();
        TextField textField2 = new TextField();
        TextField pieText2 = new TextField();
        TextField textField3 = new TextField();
        TextField pieText3 = new TextField();
        TextField textField4 = new TextField();
        TextField pieText4 = new TextField();

        Label label1 = new Label("First number:");
        Label pieLabel1 = new Label("Label for first number:");
        Label label2 = new Label("Second number:");
        Label pieLabel2 = new Label("Label for second number:");
        Label label3 = new Label("Third number:");
        Label pieLabel3 = new Label("Label for third number:");
        Label label4 = new Label("Fourth number:");
        Label pieLabel4 = new Label("Label for fourth number:");

        // group labels and their text fields together in a horizontal box
        HBox box1 = new HBox(10);
        box1.getChildren().addAll(label1, textField1);
        box1.setAlignment(Pos.CENTER);
        HBox lbox1 = new HBox(10);
        lbox1.getChildren().addAll(pieLabel1, pieText1);
        lbox1.setAlignment(Pos.CENTER);
        HBox box2 = new HBox(10);
        box2.getChildren().addAll(label2, textField2);
        box2.setAlignment(Pos.CENTER);
        HBox lbox2 = new HBox(10);
        lbox2.getChildren().addAll(pieLabel2, pieText2);
        lbox2.setAlignment(Pos.CENTER);
        HBox box3 = new HBox(10);
        box3.getChildren().addAll(label3, textField3);
        box3.setAlignment(Pos.CENTER);
        HBox lbox3 = new HBox(10);
        lbox3.getChildren().addAll(pieLabel3, pieText3);
        lbox3.setAlignment(Pos.CENTER);
        HBox box4 = new HBox(10);
        box4.getChildren().addAll(label4, textField4);
        box4.setAlignment(Pos.CENTER);
        HBox lbox4 = new HBox(10);
        lbox4.getChildren().addAll(pieLabel4, pieText4);
        lbox4.setAlignment(Pos.CENTER);

        // Add button to create pie chart from the values
        Button button = new Button("Create Pie Chart");
        HBox box5 = new HBox(10);
        box5.getChildren().addAll(button);
        box5.setAlignment(Pos.CENTER);

        // group all horizontal boxes together in a vertical box
        VBox box = new VBox(10);
        box.getChildren().addAll(box1, lbox1, box2, lbox2, box3, lbox3, box4, lbox4, box5);

        // event handler for button to create pie chart
        EventHandler<ActionEvent> eventHandler = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                // get the values from the text fields
                float num1 = Float.parseFloat(textField1.getText());
                float num2 = Float.parseFloat(textField2.getText());
                float num3 = Float.parseFloat(textField3.getText());
                float num4 = Float.parseFloat(textField4.getText());

                // calculate the percentages of the values
                float percent1 = num1 / (num1 + num2 + num3 + num4);
                float percent2 = num2 / (num1 + num2 + num3 + num4);
                float percent3 = num3 / (num1 + num2 + num3 + num4);
                float percent4 = num4 / (num1 + num2 + num3 + num4);

                // create pie chart of the percentages using the arc class each having a differnt color
                Group pie = new Group();
                Arc arc1 = new Arc(120, 120, 100, 100, 0, percent1 * 360);
                arc1.setFill(Color.RED);
                arc1.setType(ArcType.ROUND);
                Arc arc2 = new Arc(120, 120, 100, 100, percent1 * 360, percent2 * 360);
                arc2.setFill(Color.BLUE);
                arc2.setType(ArcType.ROUND);
                Arc arc3 = new Arc(120, 120, 100, 100, percent1 * 360 + percent2 * 360, percent3 * 360);
                arc3.setFill(Color.GREEN);
                arc3.setType(ArcType.ROUND);
                Arc arc4 = new Arc(120, 120, 100, 100, percent1 * 360 + percent2 * 360 + percent3 * 360, percent4 * 360);
                arc4.setFill(Color.YELLOW);
                arc4.setType(ArcType.ROUND);

                // add arcs to the group

                pie.getChildren().addAll(arc1, arc2, arc3, arc4);

                // Add labels to the pie chart matching color to the arc
                Text text1 = new Text(120, 120, pieText1.getText() + ": " + percent1 * 100 + "%");
                text1.setFill(Color.RED);
                text1.setStyle("-fx-font: normal bold 16px 'arial'");
                Text text2 = new Text(120, 120, pieText2.getText() + ": " + percent2 * 100 + "%");
                text2.setFill(Color.BLUE);
                text2.setStyle("-fx-font: normal bold 16px 'arial'");
                Text text3 = new Text(120, 120, pieText3.getText() + ": " + percent3 * 100 + "%");
                text3.setFill(Color.GREEN);
                text3.setStyle("-fx-font: normal bold 16px 'arial'");
                Text text4 = new Text(120, 120, pieText4.getText() + ": " + percent4 * 100 + "%");
                text4.setFill(Color.YELLOW);
                text4.setStyle("-fx-font: normal bold 16px 'arial'");

                VBox text = new VBox(10);
                text.getChildren().addAll(text1, text2, text3, text4);
                text.setLayoutX(240);
                text.setLayoutY(80);

                // create a group to hold the pie chart and the labels
                Group group = new Group();
                group.getChildren().addAll(pie, text);

                // create a scene and place it in the stage
                Scene chart = new Scene(group, 350, 250);
                primaryStage.setTitle("Pie Chart");
                primaryStage.setScene(chart);
                primaryStage.show();

            }
        };
        button.setOnAction(eventHandler);

        Scene scene = new Scene(box, 300, 400);
        primaryStage.setTitle("Pie Chart Input");
        primaryStage.setScene(scene);
        primaryStage.show();


        // read 4 numbers from the user from text fields
        // calculate the percentage of each number and display it as a pie chart using JavaFX

        // extra credit, ask for strings to name the slices
    }

    public static void main(String[] args) {
        launch(args);
    }

}
