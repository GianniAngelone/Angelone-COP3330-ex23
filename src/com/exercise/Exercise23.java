/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Gianni Angelone
 */
package com.exercise;
import java.util.Scanner;
public class Exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        String num1 = input.nextLine();
        if (num1.equalsIgnoreCase("y")) {
            System.out.print("Are the battery terminals corroded? ");
            String num2 = input.nextLine();
            if (num2.equalsIgnoreCase("y")) {
                System.out.print("Clean terminals and try starting again ");
            }else {
                System.out.print("Replace the cables and try again. ");
            }
        }else {
            System.out.print("Does the car make a slicking noise? ");
            String num3 = input.nextLine();
            if (num3.equalsIgnoreCase("y")) {
                System.out.print("Replace the battery. ");
            }else {
                System.out.print("Does the car crank up but fail to start? ");
                String num4 = input.nextLine();
                if (num4.equalsIgnoreCase("y")) {
                    System.out.print("Check spark plug connections. ");
                    return;
                }else System.out.print("Does the engine start and then die? ");
                        String num5 = input.nextLine();
                        if (num5.equalsIgnoreCase("y")) {
                            System.out.print("Does your car have fuel injection? ");
                            String num6 = input.nextLine();
                            if (num6.equalsIgnoreCase("y")) {
                                System.out.print("Get it in for service! ");
                            }else System.out.print("Check to ensure the choke is opening and closing! ");
                        }else System.out.print("This should not be possible! ");
                }
            }
        }
    }
