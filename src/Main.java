import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String partyChoice = "";
        String party = "R - Republican\tD - Democrat\tI - Independent\tO -Other";

        System.out.println("What is your party affiliation?");
        System.out.println(party);

        partyChoice = in.nextLine();

        if (partyChoice.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey");
        }
        else if (partyChoice.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant");
        }
        else if (partyChoice.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Person");
        }
        else
        {
            System.out.println("You are the wisest of us all!");
        }

    }
}