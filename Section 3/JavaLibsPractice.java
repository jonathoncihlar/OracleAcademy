/** 
 * JavaLibs
 * Implements a solution for Oracle Academy's Java Foundations Course
 * for the Section 3 Practice.
 * @author Jon Cihlar
 * @version 1.0
 */


import java.util.Scanner;
public class JavaLibsPractice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

            // get all input first
        System.out.print("Type of food (singular): ");
        String typeOfFood = sc.nextLine();
        
        System.out.print("Method of preparing food ending in -ed: ");
        String preparationMethod = sc.nextLine();

        System.out.print("Positive whole number: ");
        int fruitQuantity = sc.nextInt();
        sc.nextLine();

        System.out.print("Fruit: ");
        String dicedFruit = sc.nextLine();

        System.out.print("Another Fruit: ");
        String peeledFruit = sc.nextLine();

        System.out.print("Small Quantity: ");
        String smallQuantity = sc.nextLine();

        System.out.print("Sweet Ingredient: ");
        String sweetIngredient = sc.nextLine();

        System.out.print("Decimal quantity: ");
        double periodOfTime = sc.nextDouble();
        sc.nextLine();

        System.out.print("Container: ");
        String container = sc.nextLine();

        System.out.print("Adverb: ");
        String mannerOfMixing = sc.nextLine();

        System.out.print("Command: ");
        String action = sc.nextLine();

        sc.close();

            // set up story 
            // the lack of multiline strings in Java hurts
        String story =  "%s Salad\n" +
                        "1 cup %s watermelon\n" +
                        "%d cups diced %s\n" +
                        "%d cups peeled %s\n" +
                        "1 %s of %s\n" + 
                        "In a large %s, mix the fruit %s.\n" +
                        "Let rest for %.1f - %.1f hours.\n" +
                        "%s!";
            // interpolate variables
        story = String.format(story, typeOfFood, preparationMethod, fruitQuantity, 
                           dicedFruit, 3*fruitQuantity, peeledFruit, smallQuantity,
                           sweetIngredient, container, mannerOfMixing, periodOfTime,
                           2*periodOfTime, action);
            // output
        System.out.println(story);
    }   
}
