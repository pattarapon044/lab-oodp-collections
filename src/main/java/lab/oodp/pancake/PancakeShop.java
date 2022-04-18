package lab.oodp.pancake;

import java.util.ArrayDeque;
import java.util.Deque;


public class PancakeShop {

    private String name;
    private Deque<Customer> customerQueue;
    private Deque<Pancake> pancakeStack;

    public PancakeShop(String name, Deque<Customer> customerQueue) {

        this.name = name;
        this.customerQueue = customerQueue;
        this.pancakeStack = createPancakes();


    }

    public void serveLunch() {

        System.out.println(this.name + " has opened for lunch!");
        System.out.println("We have " + customerQueue.size() + " customers today, and have made " +
                pancakeStack.size() + " pancakes. Hope it's enough!");

       

            Customer customer;
            // Continually de-queues customers till there are none left.
            // HINT: Remember, queues are FIFO.
            while (customerQueue.size()>0) {
            	//TODO: uncomment code below
            	//get customer from the queue in FIFO manner
// 				customer = 
//                System.out.println(customer.getName() + " sat at the table. They want to eat "
//                        + customer.getBellySize() + " pancakes for lunch!");
//
//
//                customer.eat(this.pancakeStack);
//                System.out.println(customer.getName() + " is happy and full!");
            }

            System.out.println("We fed everyone today!");

            if (this.pancakeStack.isEmpty()) {
                System.out.println("We don't have any pancakes wasted either!!");
            } else {
                System.out.println("We fed the remaining " + this.pancakeStack.size() + " pancakes to the birds.");
            }

        //TODO: surround try/catch above and print this when no more pancakes
//        System.out.println("Oh no! " + e.getMessage());
//        System.out.println("We ran out of pancakes...");
//        System.out.println("There were still " + this.customerQueue.size() + " unfed customers today...");
   
    }

    private Deque<Pancake> createPancakes() {

        // Each day there'll be between 200 - 1000 pancakes
        int numPancakes = Util.randomValueBetwen(200, 1000);

        //TODO: create stack for pancake
        Deque<Pancake> pancakes = null;

        for (int i = 1; i <= numPancakes; i++) {

            // Create a pancake
            Pancake p = new Pancake(i);

            //TODO: Add the pancake to the top of the stack.
            // HINT:Stacks are Last-In-First-Out (LIFO)
            // pancakes.

        }

        return pancakes;

    }

	public Deque<Customer> getCustomerQueue() {
		return customerQueue;
	}

	public Deque<Pancake> getPancakeStack() {
		return pancakeStack;
	}
    
 
    
}
