package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;

import java.awt.event.ActionEvent;

public class Controller {
    public TextArea imeField;
    public TextArea prezimeField;
    public TextArea indeks;
    public TextArea JMBG;
    public TextArea rodjenje;
    public ComboBox<String> mjesto;
    public TextArea konAdresa;
    public TextArea konTel;
    public TextArea mailAdresa;
    public TextArea odjesk;
    public TextArea godina;
    public TextArea ciklus;
    public RadioButton dugmeDa1;
    public RadioButton dugmeNe2;
    public RadioButton dugmeNe1;
    public RadioButton dugmeDa2;


    public void onBtnClick(javafx.event.ActionEvent actionEvent) {
        System.out.println("Ime: " + imeField.getText() + "\n" + "Prezime: " + prezimeField.getText() + "\n" + "Broj indeksa: " + indeks.getText() + "\n");
        System.out.println("JMBG: " + JMBG.getText() + "\n" + "Datum rodjenja: " + rodjenje.getText() + "\n" + "Mjesto rodjenja: " + mjesto.getValue() + "\n");
        System.out.println("Kontakt adresa: " + konAdresa.getText() + "\n" + "KontaktTelefon: " + konTel.getText() + "\n" + "E-mail adresa: " + mailAdresa.getText() + "\n");
        System.out.println("Odjsek: " + odjesk.getText() + "\n" + "Godina: " + godina.getText() + "\n" + "Ciklus: " + ciklus.getText() + "\n");


        imeField.setText("");
        prezimeField.setText("");
        indeks.setText("");
        JMBG.setText("");
        rodjenje.setText("");
        konAdresa.setText("");
        konTel.setText("");
        mailAdresa.setText("");
        odjesk.setText("");
        godina.setText("");
        ciklus.setText("");
    }

    public void prikazi(Event event) {
        ObservableList<String> opcije = FXCollections.observableArrayList("Sarajevo", "Zenica","Tuzla", "Mostar", "Gorazde");
        mjesto.getItems().clear();
        mjesto.getItems().addAll(opcije);
    }
}
