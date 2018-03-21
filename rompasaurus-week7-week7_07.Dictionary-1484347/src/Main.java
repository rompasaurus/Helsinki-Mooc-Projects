import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();
        }
    }

