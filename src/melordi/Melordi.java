/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package melordi;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Roland Kouadio Dje
 */
public class Melordi extends Application {
    
    @Override
    public void start(Stage primaryStage) {
         
        primaryStage.setTitle("Melordi"); 
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500, Color.WHITE);
       
            Instru mon_instru = new Instru();
            //mon_instru.note_on(65);
            
            Clavier mon_clavier = new Clavier(); //objet Ccavier
            root.getChildren().add(mon_clavier);// ajout a notre group root
        
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
