import java.util.*;

class Sports {
    // This method returns the name of the sport (Generic Sports)
    String getName() {
        return "Generic Sports";
    }

    // This method prints the number of team members in the sport
    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports {
    // Override getName to return "Soccer Class"
    @Override
    String getName() {
        return "Soccer Class";
    }

    // Override getNumberOfTeamMembers to specify 11 players for Soccer
    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}

public class overridingMethod {
    public static void main(String[] args) {
        // Create an instance of Sports
        Sports c1 = new Sports();
        // Create an instance of Soccer
        Soccer c2 = new Soccer();

        // Print the name and number of team members for both sports
        System.out.println(c1.getName()); // Calls Sports' getName()
        c1.getNumberOfTeamMembers(); // Calls Sports' getNumberOfTeamMembers()

        System.out.println(c2.getName()); // Calls Soccer's getName() (overridden)
        c2.getNumberOfTeamMembers(); // Calls Soccer's getNumberOfTeamMembers() (overridden)
    }
}
