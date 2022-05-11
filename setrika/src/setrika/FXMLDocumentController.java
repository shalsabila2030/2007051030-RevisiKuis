/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setrika;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Button button;

    @FXML
    private ComboBox<?> cbMerk;

    @FXML
    private DatePicker dpTanggalProduksi;

    @FXML
    private TextField id;

    @FXML
    private ToggleGroup jenis;

    @FXML
    private RadioButton rdArang;

    @FXML
    private RadioButton rdListrik;

    @FXML
    private RadioButton rdUAP;

    @FXML
    private TextField tfHarga;

    @FXML
    private TextField tfNama;

    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
//        label.setText("Hello World!");
        System.out.println(id.getText());
        System.out.println(tfNama.getText());
        System.out.println(tfHarga.getText());
        System.out.println(dpTanggalProduksi.getValue().toString());
        String jenis ="";
        if(rdListrik.isSelected())
            jenis = rdListrik.getText();
        if(rdUAP.isSelected())
            jenis = rdUAP.getText();
        if(rdArang.isSelected())
            jenis = rdArang.getText();
        
        System.out.println(jenis);
        System.out.println(cbMerk.getValue().toString());      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList <String> list = new ArrayList<String>();
        list.add("Philips");
        list.add("Panasonic");
        list.add("Turbo");
        list.add("Maspion");
        
        ObservableList items = FXCollections.observableArrayList(list);
        
        cbMerk.setItems(items);
    }    
    
}