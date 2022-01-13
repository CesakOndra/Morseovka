package com.company;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class WindowController
{

    @FXML
    public TextField text;

    @FXML
    public Button convertButton;

    @FXML
    public Label convertedText;

    @FXML
    public void onButtonClick() throws IOException
    {
        convertedText.setText(Morse.getConvertedText(text.getText()));
    }
}
