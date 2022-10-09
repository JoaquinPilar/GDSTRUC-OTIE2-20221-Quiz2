
import java.util.LinkedList;

// This is the main class

public class Main

{

    public static void main(String[] args) {

        // This creates an empty LinkedList
        LinkedList<String> Playerlist = new LinkedList<>();

        // This uses the add() method to add the elements to the list
        Playerlist.add(String.valueOf(new Player(1, "Beggar", 1)));
        Playerlist.add(String.valueOf(new Player(2, "Crook", 10)));
        Playerlist.add(String.valueOf(new Player(3, "MMA Fighter", 100)));
        Playerlist.add(String.valueOf(new Player(4, "Mafia Boss", 500)));
        Playerlist.add(String.valueOf(new Player(5, "Thanos", 1000)));


        // This prints the initial elements inside the LinkedList
        System.out.println("Initial LinkedList");
        System.out.println("__________________");

        for (String p : Playerlist)
        {
            System.out.println(p);
        }

        // This uses the indexOf() method to check the index of the element
        System.out.println("\nChecking index of 'Beggar'... \n");
        System.out.println(Playerlist.indexOf(String.valueOf(new Player(1, "Beggar", 1))));

        // This function removes the first element of the LinkedList
        Playerlist.remove(0);
        System.out.println("\nRemoving Beggar... \n");

        // This prints the final elements inside the LinkedList
        System.out.println("Final LinkedList");
        System.out.println("________________");

        for (String p : Playerlist)
        {
            System.out.println(p);
        }

        // This uses the contains() method to check if the element exists or not
        System.out.println("\nChecking if 'Beggar' exists... \n");
        System.out.println(Playerlist.contains(new Player(1, "Beggar", 1)));

        // This uses the indexOf() method to check the index of the element
        System.out.println("\nChecking index of 'Beggar'... \n");
        System.out.println(Playerlist.indexOf(String.valueOf(new Player(1, "Beggar", 1))));

    }
}