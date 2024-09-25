package org.example.manager;

import org.example.model.Table;
import org.example.repository.RestaurantDB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TableManager {
    public static void printAvailableTables(RestaurantDB r1) {
        // print available tables
        System.out.println("\nAvailable tables:\n");
// let s fake a busy table
        r1.getTables().get("TABLE-01").setBusy(true);
// Create a List to store the available tables
        List<Table> availableTables = new ArrayList<>();
        List<Table> busyTables = new ArrayList<>();
        for (Table t : r1.getTables().values()) {
            if (!t.isBusy()) {
                availableTables.add(t);
            } else if (t.isBusy()) {
                busyTables.add(t);
            }
        }

        Collections.sort(availableTables, Comparator.comparing(Table::getName));
        int i = 1;
        for (Table t : availableTables) {
            System.out.println(i + " - " + t.getName()+ "*FREE");
            i++;
        }
        int j = 1;
        for (Table t : busyTables) {
            System.out.println(j + " - " + t.getName()+ "*BUSY");
            j++;
        }
    }

    public static void printBusyTables(RestaurantDB r1){
        // let s fake a busy table
        r1.getTables().get("TABLE-01").setBusy(true);
        List<Table> busyTables = new ArrayList<>();
        for (Table t : r1.getTables().values()) {
            if (t.isBusy()) {
                busyTables.add(t);
            }
        }
        Collections.sort(busyTables, Comparator.comparing(Table::getName));
        int i = 1;
        for (Table t : busyTables) {
            System.out.println(i + " - " + t.getName()+ "*BUSY");
            i++;
        }
    }

    public static void deleteAll() {
        //todo
    }

    public static void createTable() {
        //todo
    }

    public static void updateTable() {
        //todo
    }

    public static List<Table> getAllTables() {
        //todo
        return null;
    }

    public static Table getOneTable(String id) {
        //todo
        return null;
    }
}
