import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Unit2AssignmentFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        // set window size
        double sceneWidth = 600.0;
        double sceneHeight = 250.0;

        // create snow on the ground
        Rectangle snow = new Rectangle();
        snow.setX(0.0);
        snow.setY(sceneHeight - 60.0);
        snow.setWidth(sceneWidth);
        snow.setHeight(sceneHeight - snow.getY());
        snow.setFill(Color.WHITE);
        snow.setStroke(Color.WHITE);

        //create snowman body
        double snowmanX = 200.0; // snowman location
        double snowmanY = snow.getY() - 12.5;

        Circle body = new Circle();
        body.setCenterX(snowmanX);
        body.setCenterY(snowmanY);
        body.setRadius(35.0);
        body.setFill(Color.WHITE);
        body.setStroke(Color.WHITE);

        Circle bodyOutline = new Circle();
        bodyOutline.setCenterX(snowmanX);
        bodyOutline.setCenterY(snowmanY);
        bodyOutline.setRadius(body.getRadius() + 1.0);
        bodyOutline.setFill(Color.WHITE);
        bodyOutline.setStroke(Color.BLACK);
        bodyOutline.setStrokeWidth(.5);

        Circle torso = new Circle();
        torso.setRadius(body.getRadius() * 0.8);
        torso.setCenterX(snowmanX);
        torso.setCenterY(snowmanY - body.getRadius() - torso.getRadius() / 2.0);
        torso.setFill(Color.WHITE);
        torso.setStroke(Color.WHITE);

        Circle torsoOutline = new Circle();
        torsoOutline.setRadius(torso.getRadius() + 1.0);
        torsoOutline.setCenterX(snowmanX);
        torsoOutline.setCenterY(snowmanY - body.getRadius() - torso.getRadius()/2.0);
        torsoOutline.setFill(Color.WHITE);
        torsoOutline.setStroke(Color.BLACK);
        torsoOutline.setStrokeWidth(.5);

        Circle head = new Circle();
        head.setRadius(torso.getRadius() * 0.8);
        head.setCenterX(snowmanX);
        head.setCenterY(torso.getCenterY() - torso.getRadius() - head.getRadius() / 2.0);
        head.setFill(Color.WHITE);
        head.setStroke(Color.WHITE);

        Circle headOutline = new Circle();
        headOutline.setRadius(head.getRadius() + 1.0);
        headOutline.setCenterX(snowmanX);
        headOutline.setCenterY(torso.getCenterY() - torso.getRadius() - head.getRadius() / 2.0);
        headOutline.setFill(Color.WHITE);
        headOutline.setStroke(Color.BLACK);
        headOutline.setStrokeWidth(0.5);

        // create snowman eyes
        Circle leftEye = new Circle();
        leftEye.setRadius(head.getRadius() / 12.0);
        leftEye.setCenterX(head.getCenterX() - head.getRadius() * 0.27);
        leftEye.setCenterY(head.getCenterY() - head.getRadius() * 0.25);
        leftEye.setFill(Color.BLACK);
        leftEye.setStroke(Color.BLACK);

        Circle rightEye = new Circle();
        rightEye.setRadius(head.getRadius() / 12.0);
        rightEye.setCenterX(head.getCenterX() + head.getRadius() * 0.27);
        rightEye.setCenterY(head.getCenterY() - head.getRadius() * 0.25);
        rightEye.setFill(Color.BLACK);
        rightEye.setStroke(Color.BLACK);

        // create snowman nose
        double noseWidth = 12.0;
        double noseHeight = 4.0;
        double noseX = head.getCenterX() - 1.0;
        double noseY = head.getCenterY();
        Polygon nose = new Polygon();
        nose.getPoints().addAll(
                noseX, noseY,
                noseX, (noseHeight + noseY),
                (noseWidth + noseX), ((noseHeight / 2.0) + noseY)
        );
        nose.setFill(Color.ORANGERED);
        nose.setStroke(Color.BLACK);
        nose.setStrokeWidth(0.5);

        // create snowman hat
        Rectangle hat = new Rectangle();
        hat.setX(head.getCenterX() - head.getRadius() / 2.0 - 2.0);
        hat.setY(head.getCenterY() - head.getRadius() * 2 + 2.0);
        hat.setWidth(head.getRadius() + 4.0 );
        hat.setHeight(head.getRadius());
        hat.setFill(Color.BLACK);
        hat.setStroke(Color.BLACK);

        Rectangle hatBrim = new Rectangle();
        hatBrim.setX(head.getCenterX() - head.getRadius() + 2.0);
        hatBrim.setY(head.getCenterY() - head.getRadius() - 1.0);
        hatBrim.setWidth(head.getRadius() * 2.0 - 4.0);
        hatBrim.setHeight(7.0);
        hatBrim.setFill(Color.BLACK);
        hatBrim.setStroke(Color.BLACK);

        // create snowman arms
        double armThickness = 2.0;
        double armVerticalShift = -10.0;
        Polygon leftArm = new Polygon();
        leftArm.getPoints().addAll(
                (torso.getCenterX() - torso.getRadius() / 2.0),
                (torso.getCenterY() - torso.getRadius() / 2.0 - armVerticalShift),

                (torso.getCenterX() - torso.getRadius() / 2.0 - armThickness),
                (torso.getCenterY() - torso.getRadius() / 2.0 + armThickness - armVerticalShift),


                (torso.getCenterX() - torso.getRadius() * 2.0 - armThickness),
                (torso.getCenterY() - torso.getRadius() * 2.0 + armThickness - armVerticalShift),

                (torso.getCenterX() - torso.getRadius() * 2.0),
                (torso.getCenterY() - torso.getRadius() * 2.0 - armVerticalShift)
        );
        leftArm.setFill(Color.BROWN);
        leftArm.setStroke(Color.BLACK);
        leftArm.setStrokeWidth(0.5);

        Polygon rightArm = new Polygon();
        rightArm.getPoints().addAll(
                (torso.getCenterX() + torso.getRadius() / 2.0),
                (torso.getCenterY() - torso.getRadius() / 2.0 - armVerticalShift),

                (torso.getCenterX() + torso.getRadius() / 2.0 + armThickness),
                (torso.getCenterY() - torso.getRadius() / 2.0 + armThickness - armVerticalShift),


                (torso.getCenterX() + torso.getRadius() * 2.0 + armThickness),
                (torso.getCenterY() - torso.getRadius() * 2.0 + armThickness - armVerticalShift),

                (torso.getCenterX() + torso.getRadius() * 2.0),
                (torso.getCenterY() - torso.getRadius() * 2.0 - armVerticalShift)
                );
        rightArm.setFill(Color.BROWN);
        rightArm.setStroke(Color.BLACK);
        rightArm.setStrokeWidth(0.5);

        //create background tree
        double treeX = sceneWidth * 0.75;
        double treeY = snow.getY() + 20.0;
        Rectangle trunk = new Rectangle();
        trunk.setWidth(17.5);
        trunk.setHeight(60.0);
        trunk.setX(treeX - trunk.getWidth() / 2.0);
        trunk.setY( treeY - trunk.getHeight() );
        trunk.setFill(Color.BROWN);
        trunk.setStroke(Color.BLACK);
        trunk.setStrokeWidth(0.5);

        double leavesWidth = 65.0;
        double leavesHeight = 125.0;
        Polygon leaves = new Polygon();
        leaves.getPoints().addAll(
                (treeX - leavesWidth / 2.0), ( treeY - trunk.getHeight() ),
                (treeX + leavesWidth / 2.0), ( treeY - trunk.getHeight() ),
                treeX, (treeY - (trunk.getHeight() + leavesHeight) )
        );
        leaves.setFill(Color.DARKGREEN);
        leaves.setStroke(Color.BLACK);
        leaves.setStrokeWidth(0.5);


        // create groups and scene
        Group topHat = new Group(hat, hatBrim);
        Group arms = new Group(leftArm, rightArm);
        Group snowBody = new Group(arms, bodyOutline, torsoOutline, headOutline, body, torso, head);
        Group snowStuff = new Group(leftEye, rightEye, nose, topHat);
        Group snowman = new Group(snowBody, snowStuff);
        Group tree = new Group(leaves, trunk);
        Group background = new Group(snow, tree);
        Group root = new Group(background, snowman);
        Scene scene = new Scene(root, sceneWidth, sceneHeight, Color.LIGHTBLUE);

        // display scene
        stage.setTitle("Snowman");
        stage.setScene(scene);
        stage.show();
    }
}
