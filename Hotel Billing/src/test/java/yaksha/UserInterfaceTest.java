package test.java.yaksha;
  

import main.java.yaksha.FoodProduct;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.java.yaksha.Order;
import main.java.yaksha.TestUtils;

class UserInterfaceTest {

	@Test
	void testFindDiscount() throws IOException {
		Order o=new Order();
		//assertEquals(true,o.findDiscount("SBI") );
		 TestUtils.yakshaAssert(TestUtils.currentTest(),o.findDiscount("SBI")==true==true?"true":"false",TestUtils.businessTestFile);

 	}
	@Test
	void testAddToCart() throws IOException {
		Order o=new Order();
		FoodProduct foodProductObject=new FoodProduct() ;
		//assertEquals(true,o.addToCart(foodProductObject) );	
		 TestUtils.yakshaAssert(TestUtils.currentTest(),o.addToCart(foodProductObject)==true==true?"true":"false",TestUtils.businessTestFile);

	}
	@Test
	public void testCalculateTotalBill() throws IOException {
		FoodProduct f=new FoodProduct();
		Order o=new Order();
		f.setFoodId(1);
		f.setFoodName("Rice");
		f.setCostPerUnit(100);
		f.setQuantity(2);
		o.setDiscountPercentage(50.0);
		o.addToCart(f);
		//assertEquals(100, o.calculateTotalBill());
		 TestUtils.yakshaAssert(TestUtils.currentTest(),o.calculateTotalBill()==100==true?"true":"false",TestUtils.businessTestFile);

	}

}
