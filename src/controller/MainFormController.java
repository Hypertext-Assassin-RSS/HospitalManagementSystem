package controller;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 * @author Rajith Sanjayan
 */
public class MainFormController {
    @FXML
    private AnchorPane Apane;

    @FXML
    private AnchorPane root;

    @FXML
    private Label Menu;

    @FXML
    private Label MenuClose;

    @FXML
    private AnchorPane slider;

    public void  initialize () {
            /*Exit.setOnMouseClicked(event -> {
                System.exit(0);
            });*/
            slider.setTranslateX(-400);
            Menu.setOnMouseClicked(event -> {
                TranslateTransition slide = new TranslateTransition();
                slide.setDuration(Duration.seconds(0.4));
                slide.setNode(slider);

                slide.setToX(0);
                slide.play();

                slider.setTranslateX(-400);

                slide.setOnFinished((ActionEvent e)-> {
                    Menu.setVisible(false);
                    MenuClose.setVisible(true);
                });
            });

            MenuClose.setOnMouseClicked(event -> {
                TranslateTransition slide = new TranslateTransition();
                slide.setDuration(Duration.seconds(0.4));
                slide.setNode(slider);

                slide.setToX(-400);
                slide.play();

                slider.setTranslateX(0);

                slide.setOnFinished((ActionEvent e)-> {
                    Menu.setVisible(true);
                    MenuClose.setVisible(false);
                });
            });
        }
    }


