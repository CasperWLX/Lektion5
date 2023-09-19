package com.hampus.demo.modules;

import java.util.Scanner;

public class Input
{
    Scanner sc = new Scanner(System.in);

    public String getStringInput()
    {
        return sc.nextLine();
    }

    public int getIntInput()
    {
        return sc.nextInt();
    }
    public void clearBuffer()
    {
        sc.nextLine();
    }
}
