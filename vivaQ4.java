import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        boolean hasPizza = false,
                hasDrink = false,
                hasDessert = false;
        boolean checkout = false;

        System.out.println("Welcome to Maroni's Pizza!");

        while (!checkout) {
            System.out.print("1. Pizza\n2. Drinks\n3. Dessert\n4. CHECKOUT\n");
            System.out.print("Pick an option: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    while(hasPizza = true) {
                        System.out.println("1. Chicken Pepperoni - RM15");
                        System.out.println("2. Chicken Supreme - RM18");
                        System.out.println("3. Vegan Indulgence - RM12");
                        System.out.println("4. Beef Delight - RM22");
                        System.out.println("5. Margherita - RM9");
                        System.out.println("6. BACK TO MAIN MENU");
                        System.out.print("Pick an option: ");
                        int pizzaChoice = sc.nextInt();

                        if (pizzaChoice == 6) break;

                        switch (pizzaChoice) {
                            case 1 -> { total += 15; System.out.println("Added Chicken Pepperoni");}
                            case 2 -> { total += 18; System.out.println("Added Chicken Supreme");}
                            case 3 -> { total += 12; System.out.println("Added Vegan Indulgence");}
                            case 4 -> { total += 22; System.out.println("Added Beef Delight");}
                            case 5 -> { total += 9; System.out.println("Margherita");}
                            default -> System.out.println("Invalid option, try again");

                        }
                        System.out.printf("Current total: RM%.2f\n\n", total);
                    }
                    break;
                case 2:
                    while (hasDrink = true) {
                        System.out.println("1. Strawberry Smoothies - RM8");
                        System.out.println("2. Banana Smoothies - RM8");
                        System.out.println("3. Mocktail - RM12");
                        System.out.println("4. Soft Drink - RM5");
                        System.out.println("5. Mineral Water - RM3");
                        System.out.println("6. BACK TO MAIN MENU");
                        System.out.print("Pick an option: ");
                        int drinkChoice = sc.nextInt();

                        if (drinkChoice == 6) break;

                        switch (drinkChoice) {
                            case 1 -> { total += 8; System.out.println("Added Strawberry Smoothies"); }
                            case 2 -> { total += 8; System.out.println("Added Banana Smoothies"); }
                            case 3 -> { total += 12; System.out.println("Added Mocktail"); }
                            case 4 -> { total += 5; System.out.println("Added Soft Drink"); }
                            case 5 -> { total += 3; System.out.println("Added Mineral Water"); }
                            default -> System.out.println("Invalid option, try again");
                        }
                        System.out.printf("Current total: RM%.2f\n\n", total);
                    }
                    break;
                case 3:
                    while (hasDessert = true) {
                        System.out.println("1. Tiramisu - RM7");
                        System.out.println("2. Strawberry Shortcake - RM10");
                        System.out.println("3. Green Jello - RM4");
                        System.out.println("4. Creme Brulee - RM15");
                        System.out.println("5. Raspberry Pie - RM20");
                        System.out.println("6. BACK TO MAIN MENU");
                        System.out.println("Pick an option: ");
                        int dessertChoice = sc.nextInt();

                        if (dessertChoice == 6) break;

                        switch (dessertChoice) {
                            case 1 -> { total += 7; System.out.println("Added Tiramisu");}
                            case 2 -> { total += 10; System.out.println("Added Strawberry Shortcake");}
                            case 3 -> { total += 4; System.out.println("Added Green Jello");}
                            case 4 -> { total += 15; System.out.println("Added Creme Brulee");}
                            case 5 -> { total += 20; System.out.println("Added Raspberry Pie");}
                            default -> System.out.println("Invalid option, try again");
                        }
                        System.out.printf("Current total: RM%.2f\n\n", total);

                    }
                    break;

                case 4:
                    checkout = true;
                    System.out.printf("Your total is RM%.2f\n\n", total);

                    if (hasPizza && hasDrink && hasDessert) {
                        double discount = total * 0.20;
                        total -= discount;
                        System.out.println("You have availed the one-of-each offer. You get a 20% discount!");
                        System.out.printf("Your new total is RM%.2f\n\n", total);

                    }
                    System.out.println("Have a nice day!");
                    break;

                default:
                    System.out.println("Invalid option, try again please");
            }
        }
        sc.close();
    }
}
