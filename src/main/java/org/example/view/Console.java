package org.example.view;

import org.example.controller.Controller;
import org.example.model.Spieler;
import org.example.model.Verein;

import java.util.ArrayList;
import java.util.List;

public class Console {
    Controller controller = new Controller();

    public void run() {
        while (true) {
            System.out.println("1 - Read Spieler");
            System.out.println("2 - Write Spieler");
            System.out.println("3 - Update Spieler");
            System.out.println("4 - Delete Spieler");
            System.out.println("5 - Display all Spielers");
            System.out.println("6 - Read Verein");
            System.out.println("7 - Write Verein");
            System.out.println("8 - Update Verein");
            System.out.println("9 - Delete Verein");
            System.out.println("10 - Display all Vereins");
            System.out.println("11 - Filter Vereins by city");
            System.out.println("12 - Filter Spielers by Verein");
            System.out.println("13 - Filter Spieler by Verein and Markt");

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

            }else if (choice == 6) {
                System.out.println("Enter id: ");
                int id = Integer.parseInt(System.console().readLine());
                System.out.println(controller.readVerein(id));
            }
            else if (choice == 7) {
                System.out.println("Enter id: ");
                int id = Integer.parseInt(System.console().readLine());
                System.out.println("Enter Name: ");
                String name = System.console().readLine();
                System.out.println("Enter Stadt: ");
                String stadt = System.console().readLine();
                List<Spieler> spielers = new ArrayList<>();
                while(true){
                    System.out.println(controller.getAllSpielers());
                    System.out.println("0 - Exit");
                    System.out.println("Enter Name: ");
                    String spielerName = System.console().readLine();
                    if(spielerName.equals("0")){
                        break;
                    }
                    spielers.add(controller.readSpieler(spielerName));
                }
                controller.createVerein(new Verein(id, name, stadt, spielers));

            }
            else if (choice == 8) {
                System.out.println("Enter id: ");
                int id = Integer.parseInt(System.console().readLine());
                System.out.println("Enter Name: ");
                String name = System.console().readLine();
                System.out.println("Enter Stadt: ");
                String stadt = System.console().readLine();
                List<Spieler> spielers = new ArrayList<>();
                while(true){
                    System.out.println(controller.getAllSpielers());
                    System.out.println("0 - Exit");
                    System.out.println("Enter Name: ");
                    String spielerName = System.console().readLine();
                    if(spielerName.equals("0")){
                        break;
                    }
                    spielers.add(controller.readSpieler(spielerName));
                }
                controller.updateVerein(new Verein(id, name, stadt, spielers));
            }
            else if (choice == 9) {
                System.out.println("Enter id: ");
                int id = Integer.parseInt(System.console().readLine());
                controller.deleteVerein(id);
            }
            else if (choice == 10) {
                for(Verein v : controller.getAllVereins()) {
                    System.out.println(v);
                }
            } else if (choice == 11) {
                System.out.println("Enter Stadt: ");
                String city = System.console().readLine();
                for(Verein v : controller.filterByCity(city)) {
                    System.out.println(v);
                }

            } else if (choice == 12) {
                System.out.println("Enter Verein Name: ");
                String name = System.console().readLine();
                for(Spieler s : controller.filterByVerein(name)) {
                    System.out.println(s);

                }

            } else if (choice == 13) {
                System.out.println("Enter Verein Name: ");
                String name = System.console().readLine();
                System.out.println("Enter Sorting Algorithm: ");
                System.out.println("1 - ASC");
                System.out.println("2 - DESC");
                int option = Integer.parseInt(System.console().readLine());
                for(Spieler s : controller.sortByVerein(name, option)){
                    System.out.println(s);
                }

            } else if (choice == 0) {
                break;
            }
        }
    }
}
