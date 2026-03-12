public class NestedIfBasic {
    public static void main(String[] args) {
        System.out.println("=== Nested If — Login System ===");
        boolean isRegistered = true;
        boolean correctPassword = true;
        boolean isActive = true;

        if (isRegistered) {
            System.out.println("User found.");
            if (correctPassword) {
                System.out.println("Password correct.");
                if (isActive) {
                    System.out.println("Welcome! Access granted.");
                } else {
                    System.out.println("Account is deactivated. Contact support.");
                }
            } else {
                System.out.println("Wrong password. Try again.");
            }
        } else {
            System.out.println("User not found. Please register.");
        }

        // Nested if: Season + weather activity
        System.out.println("\n=== Activity Recommender ===");
        String season = "Summer";
        boolean isSunny = true;
        boolean hasCompany = false;

        if (season.equals("Summer")) {
            if (isSunny) {
                if (hasCompany) {
                    System.out.println("Go to the beach with friends!");
                } else {
                    System.out.println("Take a solo bike ride.");
                }
            } else {
                System.out.println("Visit a museum or indoor cafe.");
            }
        } else if (season.equals("Winter")) {
            if (isSunny) {
                System.out.println("Take a winter walk in the park.");
            } else {
                System.out.println("Stay home and read a book.");
            }
        }

        // Ticket pricing nested logic
        System.out.println("\n=== Movie Ticket Pricing ===");
        boolean isMember = true;
        boolean isWeekend = true;
        int age = 15;
        double price;
        if (age < 12) {
            price = 5.0;
        } else if (age >= 65) {
            price = 7.0;
        } else {
            if (isMember) {
                price = isWeekend ? 10.0 : 8.0;
            } else {
                price = isWeekend ? 14.0 : 12.0;
            }
        }
        System.out.printf("Age: %d | Member: %b | Weekend: %b → $%.2f%n",
            age, isMember, isWeekend, price);
    }
}
