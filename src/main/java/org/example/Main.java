package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DataBase db1 = DataBase.getInstance();
        DataBase db2 = DataBase.getInstance();
        System.out.println(db1);
        System.out.println(db2);
    }
}