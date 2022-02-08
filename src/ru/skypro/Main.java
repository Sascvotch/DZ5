package ru.skypro;

public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        task8();
    }
    public static void task8() {
        int beerNum=99;
        String word ="бутылок (бутылки)";
        while (beerNum>0) {
            if (beerNum==1) {
                word ="бутылка";
            }
            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum =beerNum -1;
            if (beerNum >0) {
                System.out.println(beerNum + " "+ word + " пива на стене");
            } else {
                System.out.println("Нет бутылок пива на стене");
            }
        }
