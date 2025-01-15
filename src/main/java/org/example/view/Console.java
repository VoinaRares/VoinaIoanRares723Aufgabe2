package org.example.view;

import org.example.controller.Controller;
import org.example.model.Spieler;

public class Console {
    Controller controller = new Controller();

    public void run() {
        while (true) {
            System.out.println("1 - Read Spieler");
            System.out.println("2 - Write Spieler");
            System.out.println("3 - Update Spieler");
            System.out.println("4 - Delete Spieler");
            System.out.println("5 - Display all Spielers");
            System.out.println("6 - Read Kunde");
            System.out.println("7 - Write Kunde");
            System.out.println("8 - Update Kunde");
            System.out.println("9 - Delete Kunde");
            System.out.println("10 - Display all Kundes");

            System.out.println("0 - Exit");

            int choice = Integer.parseInt(System.console().readLine());
            if (choice == 1) {
                System.out.println("Enter Name: ");
                String name = System.console().readLine();
                System.out.println(controller.readSpieler(name));

            } else if (choice == 2) {
                System.out.println("Enter Name: ");
                String name = System.console().readLine();
                System.out.println("Enter alter: ");
                int alter = Integer.parseInt(System.console().readLine());
                System.out.println("Enter position: ");
                String position = System.console().readLine();
                System.out.println("Enter Markt: ");
                int markt = Integer.parseInt(System.console().readLine());

                controller.createSpieler(new Spieler(name, alter, position, markt));

            } else if (choice == 3) {
                System.out.println("Enter Name: ");
                String name = System.console().readLine();
                System.out.println("Enter alter: ");
                int alter = Integer.parseInt(System.console().readLine());
                System.out.println("Enter position: ");
                String position = System.console().readLine();
                System.out.println("Enter Markt: ");
                int markt = Integer.parseInt(System.console().readLine());

                controller.updateSpieler(new Spieler(name, alter, position, markt));

            } else if (choice == 4) {
                System.out.println("Enter Name: ");
                String name = System.console().readLine();

                controller.deleteSpieler(name);

            } else if (choice == 5) {
               for(Spieler s : controller.getAllSpielers()) {
                   System.out.println(s);
               }

            }



            if(choice == 0) {
                break;
            }
        }
    }
}
