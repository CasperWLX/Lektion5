package com.hampus.demo;

import com.hampus.demo.modules.Input;

public class Main
{
    public static void main(String[] args)
    {
        //Scanner i separat klass
        Input userinput = new Input();

        //Tar emot en string och presenterar
        System.out.println("Please enter your name:");
        String username = userinput.getStringInput();
        System.out.println("Player #1: " + username);

        //Tar ENDAST emot en Int och inget annat.
        System.out.println("Please enter a number:");
        int number = userinput.getIntInput();

        //Loopar
        for(int i = 0; i < number; i++)
        {
            System.out.println("Loop " + i);
        }

        //Variabler
        boolean loopIsRunning = true;
        String randomString;

        //Switch med ett avslutnings-condition
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
