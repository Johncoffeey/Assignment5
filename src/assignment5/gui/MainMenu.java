/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5.gui;

/**
 *
 * @author ddose
 */
public class MainMenu extends Menu
{

    public MainMenu()
    {
        super("Main menu", "Option A", "Option B", "Option C");
    }

    @Override
    protected void doAction(int option)
    {
        switch (option)
        {
            case 1:
                System.out.println("You choose option 1");
                break;
            case 2:
                System.out.println("You choose option 2");
                break;
            case 3:
                System.out.println("You choose option 3");
                break;
            default:
                System.out.println("You choose wrong");
        }
    }

}
