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
public class PersonMenu extends Menu
{

    public PersonMenu()
    {
        super("Person Menu", "Vote for kandidate A", "Vote for kandidate B", "Vote for kandidate C");
    }

    @Override
    protected void doAction(int option)
    {
        switch (option)
        {
            case 1:
                System.out.println("You choosed to vote for kandidate A");
                optionA();
                break;
            case 2:
                System.out.println("You choosed to vote for kandidate B");
                optionB();
                break;
            case 3:
                System.out.println("You choosed to vote for kandidate C");
                optionC();
                break;
            default:
                System.out.println("You must have typed something wrong");
                break;
        }
    }

    public void optionA()
    {
        System.out.println("You voted for Donal J. Trump");
    }

    public void optionB()
    {
        System.out.println("You voted for Lars Lykke");
    }

    public void optionC()
    {
        System.out.println("You voted for Vladamir Putin");
    }
}
