package lab.oodp.pancake;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Runs the pancake simulation
 */
public class PancakeApp {
	
	public PancakeShop shop;

    private void start() {

        // Simulate a day's business.
        shop.serveLunch();

    }

    /**
     * Creates a queue consisting of a random number of customers.
     * @return
     */
    public Deque<Customer> createCustomerQueue() {

        // An object which will allow us to give our customers names.
        NameGenerator nameGen = new NameGenerator();

        // Each day there'll be between 100 - 200 customers
        int numCustomers = Util.randomValueBetwen(100, 200);

        // TODO: remove null below,initialize the queue variable appropriately
        Deque<Customer> queue = null;

        for (int i = 1; i <= numCustomers; i++) {

            // Each customer can eat between 1 and 10 pancakes per session.
            int bellySize = Util.randomValueBetwen(1, 10);
            Customer customer = new Customer(bellySize, nameGen.getRandomName(), i);

            // TODO Add customer to the queue. 
            //HINT: Remember, queues are First-In-First-Out.
            //queue.

        }

        return queue;
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {
        PancakeApp pancakeApp = new PancakeApp();
        // Create a queue of customers
        Deque<Customer> customers = pancakeApp.createCustomerQueue();

        // Create the pancake shop
        pancakeApp.shop = new PancakeShop("PancakeTopia", customers);
        pancakeApp.start();
    }

}
