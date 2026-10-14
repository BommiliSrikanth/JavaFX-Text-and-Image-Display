// JavaFX Application: Display Text Label and Image
// Demonstrates Stage, Scene, Label, ImageView and VBox layout

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class DisplayTextAndImage extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Step-3: Set the title of the stage
        primaryStage.setTitle("Text and Image Display");

        // Step-4: Create a Label with the text "Hello, JavaFX!"
        Label label = new Label("Hello, JavaFX!");
        label.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-text-fill: #2c3e50;");

        // Step-5: Load an image and create ImageView
        // Image path relative to the project (resources/sample.png)
        // You can also use an absolute path or a URL if preferred
        Image image = new Image("file:resources/sample.png");
        ImageView imageView = new ImageView(image);

        // Optional: set preferred size of the ImageView
        imageView.setFitWidth(400);
        imageView.setFitHeight(300);
        imageView.setPreserveRatio(true);

        // Step-6: Create a VBox layout and add the Label + ImageView
        VBox vbox = new VBox(20);          // 20 pixels spacing
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(20));
        vbox.getChildren().addAll(label, imageView);

        // Step-7: Create a Scene with size 600x400
        Scene scene = new Scene(vbox, 600, 400);

        // Step-8: Set the scene on the stage and show it
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    // Step-9: main method launches the JavaFX application
    public static void main(String[] args) {
        launch(args);
    }
}
