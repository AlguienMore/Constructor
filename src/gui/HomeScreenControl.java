/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

/**
 *
 * @author AlguienMoreInAsus
 */
public class HomeScreenControl{
    
    GUILoader iLoader;
    
    @FXML
    private Button user_button;
    @FXML
    private Label new_project;
    @FXML
    private HBox box;
    
    
    @FXML
    protected void letsGo(ActionEvent event) throws Exception
    {
    
        //iLoader = new GUILoader("CoreProgram", "Core Program");
        
        System.out.println("entra");
        
    }
    
    
    
    /*
    @FXML
    protected void helloWorldTest(ActionEvent event) throws IOException, Throwable
    {
    System.out.println("entra general");
    }
    */
    
    
    
    
}
