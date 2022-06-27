import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PieChart extends Application {
    // create java fx application
    public void start(Stage primaryStage)
    {
        TextField textField1 = new TextField("Enter first number");
        TextField textField2 = new TextField("Enter second number");
        TextField textField3 = new TextField("Enter third number");
        TextField textField4 = new TextField("Enter fourth number");

        Label label1 = new Label("First number");
        Label label2 = new Label("Second number");
        Label label3 = new Label("Third number");
        Label label4 = new Label("Fourth number");

        HBox box = new HBox(6);
        box.getChildren().addAll(label1, textField1, label2, textField2, label3, textField3, label4, textField4);

        Scene scene = new Scene(box, 300, 200);
        primaryStage.setTitle("Pie Chart");
        primaryStage.setScene(scene);
        primaryStage.show();
        // read 4 numbers from the user from text fields
        float slice1 = Integer.parseInt(textField1.getText());
        float slice2 = Integer.parseInt(textField2.getText());
        float slice3 = Integer.parseInt(textField3.getText());
        float slice4 = Integer.parseInt(textField4.getText());
        // calculate the percentage of each number and display it as a pie chart using JavaFX

        // extra credit, ask for strings to name the slices
    }

    public static void main(String[] args) {
        launch(args);
    }

}
