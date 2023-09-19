package com.hampus.demo;

import com.hampus.demo.modules.Input;

public class Main
{
    public static void main(String[] args)
    {
        Input userinput = new Input();

        System.out.println("Please enter your name:");
        String username = userinput.getStringInput();
        System.out.println("Player #1: " + username);

        System.out.println("Please enter a number:");
        int number = userinput.getIntInput();
        for(int i = 0; i < number; i++)
        {
            System.out.println("Loop " + i);
        }
        userinput.clearBuffer();

        boolean loopIsRunning = true;
        String randomString;
        do
        {
            System.out.println("Type anything!");
            randomString = userinput.getStringInput();
            switch(randomString)
            {
                case "Stop":
                    loopIsRunning = false;
                    break;
                case "1":
                    System.out.println("Throwing!");
                    break;
                default:
                    System.out.println("Wrong input");
            }
        } while(loopIsRunning);
    }
}
