import java.util.*;
import java.security.*;
interface Food {
	 public String getType();
	}
	class Pizza implements Food {
	 public String getType() {
	 return "Someone ordered a Fast Food!";
	 }
	}

	class Cake implements Food {

	 public String getType() {
	 return "Someone ordered a Dessert!";
	 }
	}
	class FoodFactory {
		public Food getFood(String order) {

            if("cake".equals(order)){
                return new Cake();
            }
            else if("pizza".equals(order)){
                return new Pizza();
            }
            return null;

}//End of getFood method