package lab.oodp.pancake;

import java.util.Deque;

/**
 * Someone who eats pancakes.
 */
public class Customer {

    private int bellySize;
    private String name;
    private int number;

    /**
     * Creates a new customer with the given belly size and name.
     *
     * @param bellySize the number of pancakes this person can eat in one sitting
     * @param name the name of the person
     */
    public Customer(int bellySize, String name, int number) {
        this.bellySize = bellySize;
        this.name = name;
        this.number = number;
    }

    /**
     * Eats from the top of the stack of pancakes until either full or there's no pancakes left.
     *
     * If full, then the method returns successfully. If not, a HungryException is thrown.
     *
     * @param pancakes
     */
    public void eat(Deque<Pancake> pancakes) throws HungryException {

        /*
         * While this customer wants to eat more pancakes
         * - Get the top pancake of the stack (LIFO)
         * - If we got a pancake:
         *   - Print out a message saying [customer name] ate [pancake.toString()]!
         *   - Decrease the amount of pancakes we want to eat by one
         * - else:
         *   - Throw a HungryException
         * If we make it to the end without throwing an exception, print out how many pancakes we ate.
         */

        int desiredMealSize = this.bellySize;

        while (desiredMealSize > 0) {
        	//TODO: remove null, get pancake from stack
            Pancake p = null;
            
            if (p != null) {

                System.out.println(getName() + " ate " + p + "!");
                desiredMealSize--;

            } //TODO: add else when p is null (no more pancake in the stack), and throws HungryException

        }

        System.out.println(getName() + " ate " + this.bellySize + " pancakes in total!");

    }

    public String getName() {
        return name + " ["+number+"]";
    }

    public int getBellySize() {
        return bellySize;
    }

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
