package sample;

import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import org.controlsfx.validation.ValidationSupport;
import org.controlsfx.validation.Validator;

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
    public boolean validnosti1, validnosti2, validnosti3, validnosti4, validnosti5, validnosti6, validnosti7, validnosti8, validnosti9;

    public void onBtnClick(javafx.event.ActionEvent actionEvent) {
        if(validnosti1 && validnosti2 && validnosti3 && validnosti4 && validnosti5 && validnosti6 && validnosti7 && validnosti8 && validnosti9) {
            System.out.println("Ime: " + imeField.getText() + "\n" + "Prezime: " + prezimeField.getText() + "\n" + "Broj indeksa: " + indeks.getText() + "\n");
            System.out.println("JMBG: " + JMBG.getText() + "\n" + "Datum rodjenja: " + rodjenje.getText() + "\n" + "Mjesto rodjenja: " + mjesto.getValue() + "\n");
            System.out.println("Kontakt adresa: " + konAdresa.getText() + "\n" + "KontaktTelefon: " + konTel.getText() + "\n" + "E-mail adresa: " + mailAdresa.getText() + "\n");
            System.out.println("Odjsek: " + odjesk.getText() + "\n" + "Godina: " + godina.getText() + "\n" + "Ciklus: " + ciklus.getText() + "\n");
            System.out.println("Da li je student redovan ili redovan samofinansirajući? ");
            if(dugmeDa1.isSelected()) System.out.println("Jeste\n");
            if(dugmeNe1.isSelected()) System.out.println("Nije\n");

            System.out.println("Da li student pripada posebnim boračkim kategorijama? ");
            if(dugmeDa2.isSelected()) System.out.println("Jeste\n");
            if(dugmeNe2.isSelected()) System.out.println("Nije\n");

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

            imeField.getStyleClass().add("poljeIsprazni");
            prezimeField.getStyleClass().add("poljeIsprazni");
            indeks.getStyleClass().add("poljeIsprazni");
            JMBG.getStyleClass().add("poljeIsprazni");
            rodjenje.getStyleClass().add("poljeIsprazni");
            konTel.getStyleClass().add("poljeIsprazni");
            mailAdresa.getStyleClass().add("poljeIsprazni");
            odjesk.getStyleClass().add("poljeIsprazni");
            godina.getStyleClass().add("poljeIsprazni");
            ciklus.getStyleClass().add("poljeIsprazni");

        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING, "File already exists. Do you want to override?");
            alert.setTitle("Upozorenje!");
            alert.setContentText("Provjerite da li ste unijeli sve neophodne podatke korektno!");
            alert.getDialogPane().setPrefSize(350, 100);
            alert.show();
        }
    }

    public void prikazi(Event event) {
        ObservableList<String> opcije = FXCollections.observableArrayList("Sarajevo", "Zenica","Tuzla", "Mostar", "Gorazde");
        mjesto.getItems().clear();
        mjesto.getItems().addAll(opcije);
    }

    public void unosImena(KeyEvent keyEvent) {
        ValidationSupport validationSupport = new ValidationSupport();
        validationSupport.registerValidator(imeField, Validator.createEmptyValidator("Text is Required!"));

        imeField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Validacija e = new Validacija();
                if (e.validno(n)) {
                    imeField.getStyleClass().removeAll("poljeNijeIspravno");
                    imeField.getStyleClass().add("poljeIspravno");
                    validationSupport.setErrorDecorationEnabled(false);

                    validnosti1 = true;
                } else {
                    imeField.getStyleClass().removeAll("poljeIspravno");
                    imeField.getStyleClass().add("poljeNijeIspravno");
                    validationSupport.setErrorDecorationEnabled(true); //da pokaze da je greska

                    validnosti1 = false;
                }
            }
        });

    }

    public void unosPrezimena(KeyEvent keyEvent) {
        ValidationSupport validationSupport = new ValidationSupport();
        validationSupport.registerValidator(prezimeField, Validator.createEmptyValidator("Text is Required!"));

        prezimeField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Validacija e = new Validacija();
                if (e.validno(n)) {
                    prezimeField.getStyleClass().removeAll("poljeNijeIspravno");
                    prezimeField.getStyleClass().add("poljeIspravno");
                    validnosti2 = true;
                } else {
                    prezimeField.getStyleClass().removeAll("poljeIspravno");
                    prezimeField.getStyleClass().add("poljeNijeIspravno");
                    validnosti2 = false;
                }
            }
        });
    }

    public void unosIndeksa(KeyEvent keyEvent) {
        ValidationSupport validationSupport = new ValidationSupport();
        validationSupport.registerValidator(indeks, Validator.createEmptyValidator("Text is Required!"));

        indeks.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Validacija e = new Validacija();
                if (e.validnoIndeks(n)) {
                    indeks.getStyleClass().removeAll("poljeNijeIspravno");
                    indeks.getStyleClass().add("poljeIspravno");
                    validnosti3 = true;
                } else {
                    indeks.getStyleClass().removeAll("poljeIspravno");
                    indeks.getStyleClass().add("poljeNijeIspravno");
                    validnosti3 = false;
                }
            }
        });
    }

    public void unosTelefona(KeyEvent keyEvent) {
        ValidationSupport validationSupport = new ValidationSupport();
        validationSupport.registerValidator(konTel, Validator.createEmptyValidator("Text is Required!"));

        konTel.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Validacija e = new Validacija();
                if (e.validnoTelefon(n)) {
                    konTel.getStyleClass().removeAll("poljeNijeIspravno");
                    konTel.getStyleClass().add("poljeIspravno");
                    validnosti4 = true;
                } else {
                    konTel.getStyleClass().removeAll("poljeIspravno");
                    konTel.getStyleClass().add("poljeNijeIspravno");
                    validnosti4 = false;
                }
            }
        });
    }

    public void unosOdsjeka(KeyEvent keyEvent) {
        ValidationSupport validationSupport = new ValidationSupport();
        validationSupport.registerValidator(odjesk, Validator.createEmptyValidator("Text is Required!"));

        odjesk.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Validacija e = new Validacija();
                if (e.validnoOdsjek(n)) {
                    odjesk.getStyleClass().removeAll("poljeNijeIspravno");
                    odjesk.getStyleClass().add("poljeIspravno");

                    validnosti5 = true;
                } else {
                    odjesk.getStyleClass().removeAll("poljeIspravno");
                    odjesk.getStyleClass().add("poljeNijeIspravno");

                    validnosti5 = false;
                }
            }
        });
    }

    public void unosGodine(KeyEvent keyEvent) {
        ValidationSupport validationSupport = new ValidationSupport();
        validationSupport.registerValidator(godina, Validator.createEmptyValidator("Text is Required!"));

        godina.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Validacija e = new Validacija();
                if (e.validnoGodine(n)) {
                    godina.getStyleClass().removeAll("poljeNijeIspravno");
                    godina.getStyleClass().add("poljeIspravno");
                    validnosti6 = true;
                } else {
                    godina.getStyleClass().removeAll("poljeIspravno");
                    godina.getStyleClass().add("poljeNijeIspravno");
                    validnosti6 = false;
                }
            }
        });
    }

    public void unosCiklusa(KeyEvent keyEvent) {
        ValidationSupport validationSupport = new ValidationSupport();
        validationSupport.registerValidator(ciklus, Validator.createEmptyValidator("Text is Required!"));

        ciklus.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Validacija e = new Validacija();
                if (e.validnoCiklus(n)) {
                    ciklus.getStyleClass().removeAll("poljeNijeIspravno");
                    ciklus.getStyleClass().add("poljeIspravno");
                    validnosti7 = true;
                } else {
                    ciklus.getStyleClass().removeAll("poljeIspravno");
                    ciklus.getStyleClass().add("poljeNijeIspravno");
                    validnosti7 = false;
                }
            }
        });
    }

    public void unosMaila(KeyEvent keyEvent) {
        ValidationSupport validationSupport = new ValidationSupport();
        validationSupport.registerValidator(mailAdresa, Validator.createEmptyValidator("Text is Required!"));

        mailAdresa.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Validacija e = new Validacija();
                if (e.validnoMail(n)) {
                    mailAdresa.getStyleClass().removeAll("poljeNijeIspravno");
                    mailAdresa.getStyleClass().add("poljeIspravno");
                    validnosti8 = true;
                } else {
                    mailAdresa.getStyleClass().removeAll("poljeIspravno");
                    mailAdresa.getStyleClass().add("poljeNijeIspravno");
                    validnosti8 = false;
                }
            }
        });
    }

    public void unosJMBG(KeyEvent keyEvent) {
        ValidationSupport validationSupport = new ValidationSupport();
        validationSupport.registerValidator(JMBG, Validator.createEmptyValidator("Text is Required!"));

        JMBG.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                Validacija e = new Validacija();
                if (e.validnoJMBG(n)) {
                    JMBG.getStyleClass().removeAll("poljeNijeIspravno");
                    JMBG.getStyleClass().add("poljeIspravno");
                    validnosti9 = true;
                } else {
                    JMBG.getStyleClass().removeAll("poljeIspravno");
                    JMBG.getStyleClass().add("poljeNijeIspravno");

                    validnosti9 = false;
                }
            }
        });
    }

    public void clickRadBtnDa1(MouseEvent mouseEvent) {
        if(dugmeNe1.isSelected()) dugmeNe1.setSelected(false);
    }

    public void clickTadBtnNe1(MouseEvent mouseEvent) {
        if(dugmeDa1.isSelected()) dugmeDa1.setSelected(false);
    }

    public void clickRadBtnDa2(MouseEvent mouseEvent) {
        if(dugmeNe2.isSelected()) dugmeNe2.setSelected(false);
    }

    public void clickTadBtnNe2(MouseEvent mouseEvent) {
        if(dugmeDa2.isSelected()) dugmeDa2.setSelected(false);
    }

}
