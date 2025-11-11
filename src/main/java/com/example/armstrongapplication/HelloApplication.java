package com.example.armstrongapplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        BorderPane root = new BorderPane();
        Label labelHeading  = new Label("Armstrong Application 🚀🚀🚀");
        Label footerLabel = new Label("@ 2025 Armstrong Application. All rights reserved.");
        TextField inputField = new TextField();
        Button action = new Button("Check 📝");
        Label resultLabel = new Label("Result : ");
        action.setOnAction(event ->{
           int value = Integer.parseInt(inputField.getText());
           int temp=value;
           int sumValue= 0;
           while(value!=0){
             int rem = value%10;
              sumValue+=Math.pow(rem,3);
              value/=10;
           }
           if(temp==sumValue)
               resultLabel.setText("Result :  Armstrong Number ");
           else
               resultLabel.setText("Result : Not A Armstrong Number");

        });
        VBox vBox = new VBox(10);
        labelHeading.setAlignment(Pos.CENTER);
        resultLabel.setAlignment(Pos.CENTER);
        resultLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
        labelHeading.setFont(Font.font("Arail",FontWeight.BOLD,25));
        vBox.getChildren().addAll(labelHeading,inputField,action,resultLabel,footerLabel);
        Scene scene = new Scene(vBox, 320, 240);
        stage.setTitle("Armstrong Application");
        vBox.setPadding(new Insets(100));
        stage.setScene(scene);
        stage.show();
    }
}
