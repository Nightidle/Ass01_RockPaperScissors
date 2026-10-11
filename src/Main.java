import java.util.Scanner;
void main()
{
    Scanner in = new Scanner(System.in);

    String playA = "";
    String playB = "";
    String wantingToPlay = "";

    boolean done = false;
    boolean playingGame = true;

    do
    {
        do
        {
            System.out.print("Player A, please enter your RPS Move(R, P, S, r, p, s): ");
            playA = in.nextLine();

            if(playA.matches("[RPSrps]"))
            {
                System.out.println("Got player A move: " + playA);
                done = true;
            }
            else
            {
                System.out.println("Please enter a valid move (RPSrps), not: " + playA);
            }
        }while(!done);

        done = false;

        do
        {
            System.out.print("Player B, please enter your RPS Move(R, P, S, r, p, s): ");
            playB = in.nextLine();

            if(playB.matches("[RPSrps]"))
            {
                System.out.println("Got player B move: " + playB);
                done = true;
            }
            else
            {
                System.out.println("Please enter a valid move (RPSrps), not: " + playB);
            }
        }while(!done);

        done = false;

        do
        {
            if(playA.equalsIgnoreCase(playB))
            {
                System.out.println("Player A: " + playA + " and Player B: " + playB + " Tied!");
                done = true;
            }
            else if (playA.equalsIgnoreCase("R") && playB.equalsIgnoreCase("S") || playA.equalsIgnoreCase("P") && playB.equalsIgnoreCase("R") || playA.equalsIgnoreCase("S") && playB.equalsIgnoreCase("P") )
            {
                System.out.println("Player A: " + playA + " beats Player B: " + playB);
                done = true;
            }
            else
            {
                System.out.println("Player B: " + playB + " beats Player A: " + playA);
                done = true;
            }
        }while(!done);

        System.out.print("Would you like to play again? [Y/N]: ");
        wantingToPlay = in.nextLine();
        if(wantingToPlay.equalsIgnoreCase("Y"))
        {
            playingGame = true;
        }
        else if(wantingToPlay.equalsIgnoreCase("N"))
        {
            playingGame = false;
        }
        else
        {
            System.out.println("Please enter a valid option!");
        }

    }while(playingGame);

}



