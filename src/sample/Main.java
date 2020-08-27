package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Label un;
    Label p;
    private TextField UserName;
    private TextField Password;
    VBox fp1;
    VBox fp2;
    private FlowPane b;
    private Button btn;
    private Button btn1;

    @Override
    public void start(Stage primaryStage) throws Exception{
       un = new Label("Username");
       p = new Label("Password");
       btn = new Button("Username Button");
       btn1 = new Button("Password Button");
       fp1 = new VBox(20);
       fp2 = new VBox(20);
       fp1.getChildren().addAll(un , p);
       fp2.getChildren().addAll(btn , btn1);
       fp1.setPadding(new Insets(210 , 10 , 200 , 150));
       fp2.setPadding(new Insets(200 ,10 , 200 ,10));


       b = new FlowPane(fp1 , fp2);
       Scene Display = new Scene(b , 500 , 500);
       primaryStage.setTitle("181380012");
       primaryStage.setScene(Display);
       primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
