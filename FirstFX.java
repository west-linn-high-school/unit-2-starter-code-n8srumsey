import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class FirstFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        Text console = new Text(17.5, 25, ">> _");
        console.setFont(new Font(25));
        console.setStroke(Color.WHITE);
        console.setFill(Color.WHITE);

        Text exit = new Text(540, 187, "X");
        exit.setFont(new Font(12));
        exit.setStroke(Color.RED);
        exit.setFill(Color.RED);

        Text minimize = new Text(510, 187, "-");
        minimize.setFont(new Font(12));
        minimize.setStroke(Color.BLACK);
        minimize.setFill(Color.BLACK);

        Text errorTitle = new Text(260, 187, "Error - 404");
        errorTitle.setFont(new Font(12));
        errorTitle.setStroke(Color.BLACK);
        errorTitle.setFill(Color.BLACK);

        Text errorMessage = new Text(390, 225, "404");
        errorMessage.setFont(new Font(15));
        errorMessage.setStroke(Color.BLACK);
        errorMessage.setFill(Color.BLACK);

        Text errorSubMessage = new Text(350, 245, "Website Not Found");

        Line line = new Line();
        line.setStartX(250.0);
        line.setStartY(193.0);
        line.setEndX(550.0);
        line.setEndY(193.0);

        Rectangle box = new Rectangle();
        box.setX(1.0);
        box.setY(1.0);
        box.setWidth(998.0);
        box.setHeight(498.0);
        box.setStroke(Color.WHITESMOKE);
        box.setFill(null);

        Rectangle fullscreen = new Rectangle();
        fullscreen.setX(525.0);
        fullscreen.setY(179);
        fullscreen.setWidth(7.0);
        fullscreen.setHeight(7.0);
        fullscreen.setFill(null);
        fullscreen.setStroke(Color.BLACK);


        Rectangle errorWindow = new Rectangle();
        errorWindow.setX(250.0);
        errorWindow.setY(175.0);
        errorWindow.setWidth(300.0);
        errorWindow.setHeight(120.0);
        errorWindow.setStroke(Color.WHITESMOKE);
        errorWindow.setFill(Color.LIGHTGREY);

        Translate translation = new Translate(300, 50.0);


        Group errorPopUp = new Group(errorWindow, exit, minimize, line, fullscreen, errorTitle, errorMessage,
                errorSubMessage);
        errorPopUp.getTransforms().addAll(translation);
        Group root = new Group(console, box, errorPopUp);
        Scene scene = new Scene(root, 1000, 500, Color.BLACK);

        stage.setTitle("FXPractice");
        stage.setScene(scene);
        stage.show();
    }
}