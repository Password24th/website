public class AdvancedJavaCode {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Print a welcome message
        System.out.println("Welcome, " + name + "!");

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Calculate the year of birth
        int currentYear = java.time.Year.now().getValue();
        int birthYear = currentYear - age;

        // Print the year of birth
        System.out.println("You were born in " + birthYear + ".");

        // Determine if the user is an adult
        boolean isAdult = (age >= 18);

        // Print the adult status
        if (isAdult) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not yet an adult.");
        }

        // Generate and print a random number between 1 and 100
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Random Number: " + randomNumber);

        // Close the Scanner object
        scanner.close();
    }
}