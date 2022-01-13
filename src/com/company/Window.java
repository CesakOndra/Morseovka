package com.company;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Window
{

    @FXML
    public TextField fileNameText;

    @FXML
    public Button convertButton;

    @FXML
    public TextArea convertedText;

    @FXML
    public void onButtonClick()
    {
        convertedText.setText(Morse.getConvertedText(fileNameText.getText()));
    }
}
