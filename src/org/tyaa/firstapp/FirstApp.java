/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.firstapp;

import java.util.Scanner;
//java.lang.*;

/**
 *
 * @author student
 */
public class FirstApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //System.out.println("Hello World!");
        
        //1. Объявление переменной x
        //2. Присвоение значения переменной x (инициализация)
        //int x = 10;
        
        /*int x;
        
        x = 11;
        
        //x = x + 10;
        //x += 10;
        
        x = x + 1;
        x += 1;
        x++;
        
        //System.out.println(x);
        
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        y++;
        System.out.println(y);
        
        // a cat myVariable b2
        
        byte b1 = -128;
        byte b2 = 127;
        
        short sh1 = 1000;
        
        int int1 = 100000;
        
        long l1 = 1000000000000L;
        
        float f1 = 0.15f;
        double d1 = 0.0004325415d;
        
        boolean bool1 = true;
        boolean bool2 = false;
        
        char ch1 = 'a';*/
        
        System.out.println("Введите первое целое число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        System.out.println("Введите второе целое число: ");
        int b = sc.nextInt();
        
        System.out.println("Какое действие выполнить?");
        System.out.println("1 - сложение");
        System.out.println("2 - вычитание");
        
        int action = sc.nextInt();
        
        //System.out.println(action == 1);
        
        //Управляющая конструкция "если"
        if (action == 1) {
            
            System.out.println(a + b);
        } else if(action == 2) {
        
            System.out.println(a - b);
        }
        
        //TODO Доработать код так, чтобы пользователю предлагались варианты
        //действий 3 и 4 - умножение и деление * /
        
        /*System.out.println("Результат: ");
        System.out.println(a + b);*/
        
    }
    
}
