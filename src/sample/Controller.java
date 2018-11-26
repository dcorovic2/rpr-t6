package sample;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;

import java.awt.event.ActionEvent;

public class Controller {
    public TextArea imeField;
    public TextArea prezimeField;
    public TextArea indeks;
    public TextArea JMBG;
    public TextArea rodjenje;
    public TextArea mjesto;
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
        System.out.println("JMBG: " + JMBG.getText() + "\n" + "Datum rodjenja: " + rodjenje.getText() + "\n" + "Mjesto rodjenja: " + mjesto.getText() + "\n");
        System.out.println("Kontakt adresa: " + konAdresa.getText() + "\n" + "KontaktTelefon: " + konTel.getText() + "\n" + "E-mail adresa: " + mailAdresa.getText() + "\n");
        System.out.println("Odjsek: " + odjesk.getText() + "\n" + "Godina: " + godina.getText() + "\n" + "Ciklus: " + ciklus.getText() + "\n");


        imeField.setText("");
        prezimeField.setText("");
        indeks.setText("");
        JMBG.setText("");
        rodjenje.setText("");
        mjesto.setText("");
        konAdresa.setText("");
        konTel.setText("");
        mailAdresa.setText("");
        odjesk.setText("");
        godina.setText("");
        ciklus.setText("");
    }
}
