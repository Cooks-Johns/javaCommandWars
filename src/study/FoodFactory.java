



interface FoodType {
	public String getType();
}

class Pizza implements Food {
	public String getType() {
		return "Someone ordered Fast Food!"
	}
}

class Cake implements Food {
	public String getType() {
		return "Some one ordered a Desert!";
	}
}


class FoodFactory {

	public Food getFood(String order) {
		if (order.equals("pizza")) {
			return new Pizza();
		} else if (order.equals("cake")) {
			return new Cake();
		} else {
			return null;
		}
	}

public class MainOrder {

	public static void main(Sting args[]) {
		 Do_Not_Terminate.forbidExit();
        try {
            Scanner sc = new Scanner(System.in);
            //creating the factory
            FoodFactory foodFactory = new FoodFactory();

            //factory instantiates an object
            Food food = foodFactory.getFood(sc.nextLine());
            
            System.out.println("The factory returned " + food.getClass());
            System.out.println(food.getType());
        } catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}