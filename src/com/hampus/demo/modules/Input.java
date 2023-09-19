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
        int number = Integer.MAX_VALUE;
        while(number == Integer.MAX_VALUE)
        {
            if(sc.hasNextInt())
            {
                number = sc.nextInt();
            }
            else
            {
                System.out.println("Please only enter a number");
            }
            clearBuffer();
        }
        return number;
    }
    public void clearBuffer()
    {
        sc.nextLine();
    }
}
