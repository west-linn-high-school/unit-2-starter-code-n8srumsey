import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class FirstFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        Text console = new Text(50, 50, ">>");
        console.setFont(new Font(100));
        Rectangle box = new Rectangle(20, 20, 120, 50);
        Circle circle = new Circle();
        circle.setCenterX(400.0);
        circle.setCenterY(500.0);
        circle.setRadius(100.0);
        Arc arc = new Arc();
        arc.setCenterX(1000.0);
        arc.setCenterY(500.0);
        arc.setRadiusX(600.0);
        arc.setRadiusY(300.0);
        arc.setStartAngle(30.0);
        arc.setLength(1000.0);
        arc.setType(ArcType.ROUND);


        box.setStroke(Color.WHITESMOKE);
        box.setFill(null);

        circle.setStroke(Color.RED);
        circle.setFill(null);

        arc.setStroke(Color.CADETBLUE);
        arc.setFill(null);

        Group root = new Group(console, box, circle, arc);
        Scene scene = new Scene(root, 1000, 500, Color.BLACK);

        stage.setTitle("FXPractice");
        stage.setScene(scene);
        stage.show();
    }
}