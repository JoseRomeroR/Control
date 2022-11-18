/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package usomicontrol;

import Controllers.miControl;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Kyle7
 */
public class UsoMiControl extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //Button btn = new Button();
       // btn.setText("Say 'Hello World'");
       miControl miControler = new miControl();

        miControler.setOnAction(new EventHandler<MouseEvent>() {
            
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Pulsandoo clickk");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(miControler);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
