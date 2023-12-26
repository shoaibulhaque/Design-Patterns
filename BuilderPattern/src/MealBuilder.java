import java.util.Scanner;


public class MealBuilder {

   public Meal prepareMeal() {
	   
	   Scanner scanner = new Scanner(System.in);
	   Meal meal = new Meal();
	   
	   // Allowing user to choose burger
	   boolean burgerChosen = false;
	   while (!burgerChosen) {
		   
		   System.out.println("Choose from the following:");
		   System.out.println("1. Veg Burger");
		   System.out.println("2. Chicken Burger");
		   
		   // Taking input from the user
		   int burgerChoice = scanner.nextInt();
		   
		   switch (burgerChoice) {
		   
		   case 1:
			   meal.addItem(new VegBurger());
			   burgerChosen = true;
			   break;
			   
		   case 2:
			   meal.addItem(new ChickenBurger());
			   burgerChosen = true;
			   break;
			   
		   default:
			   System.out.println("Invalid Choice!....");
			   System.out.println();
			   
		   }
		   
	   }
	   
	   
	   // Allowing the user to choose a drink
	   boolean drinkChosen = false;
	   while (!drinkChosen) {
		   
		   System.out.println("Choose the drink from the following:");
		   System.out.println("1. Coke");
		   System.out.println("2. Pepsi");
		   
		   // Taking user input 
		   int drinkChoice = scanner.nextInt();
		   
		   switch (drinkChoice) {
		   
		   case 1:
			   meal.addItem(new Coke());
			   drinkChosen = true;
			   break;
			   
		   case 2:
			   meal.addItem(new Pepsi());
			   drinkChosen = true;
			   break;
			   
		   default:
			   System.out.println("Invalid Choice!....");
			   System.out.println();
		   }
		   
		  
		   
	   }
	   
	   return meal;
	   
	   
   }
   
}
 