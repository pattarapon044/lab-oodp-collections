package lab.oodp.test;

import java.util.Deque;

import org.junit.Before;
import org.junit.Test;

import lab.oodp.pancake.Customer;
import lab.oodp.pancake.PancakeApp;
import lab.oodp.pancake.PancakeShop;

import static org.junit.Assert.assertTrue;


public class TestPancakeApp {
	
	PancakeApp app;
	
	@Before
	public void setup() {
		app = new PancakeApp();
		Deque<Customer> customers = app.createCustomerQueue();

        app.shop = new PancakeShop("PancakeTopia", customers);
	}
	
	@Test
	public void testCustomerQueue() {
		assertTrue(app.shop.getCustomerQueue().getFirst().getNumber() 
				< app.shop.getCustomerQueue().getLast().getNumber());
		
		
	}
	@Test
	public void testPancakeStack() {
		assertTrue(app.shop.getPancakeStack().getFirst().getNumber() 
				> app.shop.getPancakeStack().getLast().getNumber());
	}

}
