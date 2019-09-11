package com.company;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.util.Scanner;

      public class CgpaCalculator extends JFrame {
            public static void main(String[] args) {
                  double CGPA;
                  double grade;
                  double unit;

                  System.out.println("Enter the number of courses offered: ");
                  Scanner scanner = new Scanner(System.in);
                  int classes = scanner.nextInt();

                  if (classes == 0) {
                        return;
                  }

                  for (int i = 1; i <= classes; i++) {
                          String courseId;
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.print("Enter the course number: ");
                  }
            }
      }







