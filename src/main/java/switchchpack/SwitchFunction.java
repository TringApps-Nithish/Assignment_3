package switchchpack;

import java.util.logging.Logger;

import functions.Functions;

import java.util.Scanner;
public class SwitchFunction
{
    private Scanner sc =  new Scanner(System.in);
    private Logger l = Logger.getLogger("SwitchFunctions");
    private int choice = 0;
    private Functions nextMove = new  Functions();

    public void run()
    {
        while(choice!=4)
        {
            l.info("\t----- Student Report -----\n 1 -> Create a New Student \n 2 -> Edit Student Grade \n 3 -> Display all Students Report \n 4 -> Exit ");
            l.info(" Enter Your Choice : ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1 -> nextMove.insert();
                case 2 -> nextMove.upgpa();
                case 3 -> nextMove.display();
                case 4 -> System.exit(0);
                default -> l.info(" Invalid Choice ");
            }
        }
    }
}
