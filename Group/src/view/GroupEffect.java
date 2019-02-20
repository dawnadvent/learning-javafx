package view;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.MotionBlur;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GroupEffect extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();

		Rectangle rectangle = new Rectangle();
		rectangle.setX(10);
		rectangle.setY(30);
		rectangle.setWidth(160);
		rectangle.setHeight(80);
		rectangle.setFill(Color.DARKBLUE);

		Text text = new Text();
		text.setText("Motion Blur!");
		text.setFill(Color.RED);
		text.setFont(Font.font("null", FontWeight.BOLD, 36));
		text.setX(25);
		text.setY(65);

		Button button = new Button("My Button");

		root.setCache(true);

		// Tạo hiệu ứng chuyển động mờ
		MotionBlur motionBlur = new MotionBlur();

		// Sét hiệu ứng cho Group.
		root.setEffect(motionBlur);

		// Di chuyển trục tọa độ X 50 pixel.
		root.setTranslateX(50);

		// Thêm các thành phần vào Group.
		root.getChildren().addAll(rectangle, button, text);

		Scene scene = new Scene(root, 250, 100);

		primaryStage.setTitle("JavaFX Group Demo (o7planning.org)");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
