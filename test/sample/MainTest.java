package sample;

import static org.junit.jupiter.api.Assertions.*;

import com.sun.javafx.robot.FXRobot;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import java.awt.*;

@ExtendWith(ApplicationExtension.class)
class MainTest {

    private TextArea ime;

    @Start
    void start(Stage stage) throws Exception{
        Parent mainNode = FXMLLoader.load(Main.class.getResource("unosStudenta.fxml"));
        stage.setScene(new Scene(mainNode));
        stage.show();
        stage.toFront();
    }

    @Test
    void klikPrijava(FXRobot robot) {
        ime = robot.lookup("#imeField").queryAs(TextArea.class);
        ime.setText(ime.getText() + robot.keyPress(KeyCode.D));
    }
}