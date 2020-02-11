/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame;
import java.util.Scanner;

/**
 *
 * @author marissarousseau
 */
public class TriviaGame 
{
    public static Scanner input = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        mainMenu();
    }
    
    public static void mainMenu()
    {
        System.out.println("TRIVIA GAME");
        System.out.println("");
        System.out.println("Welcome to Trivia Game!");
        System.out.println("1) Start");
        System.out.println("2) How to play");
        System.out.println("3) Options");
        System.out.print("Select an option: ");
        
        switch(input.nextInt())
        {
            case 1:
            {
                initialize();
                break;
            }
            case 2:
            {
                displayRules();
            }
            case 3:
            {
                displayOptions();
            }
        }
    }
    
    public static void initialize()
    {
        
    }
    
    
    public static void displayRules()
    {
        addSpacing();
        System.out.println("HOW TO PLAY");
        System.out.println("");
        System.out.println("Answer as many multiple choice trivia questions as you can!");
        System.out.println("You get a point for every question you answer correctly.");
        System.out.println("");
        addSpacing();
        mainMenu();
    }
    
    public static void displayOptions()
    {
        addSpacing();
        System.out.println("OPTIONS");
        System.out.println("");
        System.out.println("The options page is coming soon.");
        System.out.println("Reloading main menu...");
        addSpacing();
        mainMenu();
    }
    
    public static void addSpacing()
    {
        System.out.println("");
        System.out.println("");
    }
    
}
