package oop.ATMApp;

import java.io.IOException;

public class ATM extends OptionsMenu{

    public static void main(String[] args) throws IOException {

        OptionsMenu optionMenu = new OptionsMenu();

        optionMenu.getLogin();
    }
}
