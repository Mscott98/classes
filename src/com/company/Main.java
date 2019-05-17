

public class Main {

    public static void main(String[] args) {
        Contacts person1 = new Contacts(1, "Barney", "Rubble", "barney@aol.com",
                "815-555-1234", "815-555-1111", "815-555-2222");
        Contacts person2 = new Contacts(2, "Fred", "Flinstone", "fflint@aol.com",
                "815-555-3334", "815-555-3111", "815-555-5552");

        person1.printAll();
        System.out.println("\n");
        person2.printAll();

    }
}