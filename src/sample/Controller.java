package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import jdk.nashorn.internal.runtime.regexp.joni.Warnings;

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

        Alert alert = new Alert(Alert.AlertType.WARNING, "File already exists. Do you want to override?");
        alert.setTitle("Upozorenje!");
        alert.setContentText("Uneseni podaci nisu validni");
        alert.getDialogPane().setPrefSize(200, 100);
        alert.show();
    }

    public void prikazi(Event event) {
        ObservableList<String> opcije = FXCollections.observableArrayList("Sarajevo", "Zenica","Tuzla", "Mostar", "Gorazde");
        mjesto.getItems().clear();
        mjesto.getItems().addAll(opcije);
    }

    public void unosImena(KeyEvent keyEvent) {
        imeField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Validacija e = new Validacija();
                if (e.validno(n)) {
                    imeField.getStyleClass().removeAll("poljeNijeIspravno");
                    imeField.getStyleClass().add("poljeIspravno");
                } else {
                    imeField.getStyleClass().removeAll("poljeIspravno");
                    imeField.getStyleClass().add("poljeNijeIspravno");
                }
            }
        });
    }

    public void unosPrezimena(KeyEvent keyEvent) {
        prezimeField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Validacija e = new Validacija();
                if (e.validno(n)) {
                    prezimeField.getStyleClass().removeAll("poljeNijeIspravno");
                    prezimeField.getStyleClass().add("poljeIspravno");
                } else {
                    prezimeField.getStyleClass().removeAll("poljeIspravno");
                    prezimeField.getStyleClass().add("poljeNijeIspravno");
                }
            }
        });
    }

    public void unosIndeksa(KeyEvent keyEvent) {
        indeks.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Validacija e = new Validacija();
                if (e.validnoIndeks(n)) {
                    indeks.getStyleClass().removeAll("poljeNijeIspravno");
                    indeks.getStyleClass().add("poljeIspravno");
                } else {
                    indeks.getStyleClass().removeAll("poljeIspravno");
                    indeks.getStyleClass().add("poljeNijeIspravno");
                }
            }
        });
    }

    public void unosTelefona(KeyEvent keyEvent) {
        konTel.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Validacija e = new Validacija();
                if (e.validnoTelefon(n)) {
                    konTel.getStyleClass().removeAll("poljeNijeIspravno");
                    konTel.getStyleClass().add("poljeIspravno");
                } else {
                    konTel.getStyleClass().removeAll("poljeIspravno");
                    konTel.getStyleClass().add("poljeNijeIspravno");
                }
            }
        });
    }

    public void unosOdsjeka(KeyEvent keyEvent) {
        odjesk.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Validacija e = new Validacija();
                if (e.validnoOdsjek(n)) {
                    odjesk.getStyleClass().removeAll("poljeNijeIspravno");
                    odjesk.getStyleClass().add("poljeIspravno");
                } else {
                    odjesk.getStyleClass().removeAll("poljeIspravno");
                    odjesk.getStyleClass().add("poljeNijeIspravno");
                }
            }
        });
    }

    public void unosGodine(KeyEvent keyEvent) {
        godina.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Validacija e = new Validacija();
                if (e.validnoGodine(n)) {
                    godina.getStyleClass().removeAll("poljeNijeIspravno");
                    godina.getStyleClass().add("poljeIspravno");
                } else {
                    godina.getStyleClass().removeAll("poljeIspravno");
                    godina.getStyleClass().add("poljeNijeIspravno");
                }
            }
        });
    }

    public void unosCiklusa(KeyEvent keyEvent) {
        ciklus.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Validacija e = new Validacija();
                if (e.validnoCiklus(n)) {
                    ciklus.getStyleClass().removeAll("poljeNijeIspravno");
                    ciklus.getStyleClass().add("poljeIspravno");
                } else {
                    ciklus.getStyleClass().removeAll("poljeIspravno");
                    ciklus.getStyleClass().add("poljeNijeIspravno");
                }
            }
        });
    }

    public void unosMaila(KeyEvent keyEvent) {
        mailAdresa.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Validacija e = new Validacija();
                if (e.validnoMail(n)) {
                    mailAdresa.getStyleClass().removeAll("poljeNijeIspravno");
                    mailAdresa.getStyleClass().add("poljeIspravno");
                } else {
                    mailAdresa.getStyleClass().removeAll("poljeIspravno");
                    mailAdresa.getStyleClass().add("poljeNijeIspravno");
                }
            }
        });
    }

    public void unosJMBG(KeyEvent keyEvent) {
        JMBG.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Validacija e = new Validacija();
                if (e.validnoJMBG(n)) {
                    JMBG.getStyleClass().removeAll("poljeNijeIspravno");
                    JMBG.getStyleClass().add("poljeIspravno");
                } else {
                    JMBG.getStyleClass().removeAll("poljeIspravno");
                    JMBG.getStyleClass().add("poljeNijeIspravno");
                }
            }
        });
    }
}
