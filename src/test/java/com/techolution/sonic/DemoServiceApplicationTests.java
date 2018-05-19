package com.techolution.sonic;

import com.techolution.sonic.model.Product;
import com.techolution.sonic.service.impl.CartServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;


@SpringBootTest
@RunWith(SpringRunner.class)
public class DemoServiceApplicationTests {

	@Spy
	private CartServiceImpl cartService;


	@Test
	public void contextLoads() {
		//
	}

	@Test
	public void testProcessCheckOut() {
		Product product = Mockito.mock(Product.class);
		product.setProductDescription("Choclate Brownie");
		product.setProductTitle("Brownie");
		List<Product> products = new ArrayList<Product>();
		products.add(product);
		when(cartService.processCheckOut(products)).thenReturn(true);
		Assert.assertTrue(cartService.processCheckOut(products));
	}

    @Test
    public void testProcessCheckOutWrongCondition() {
        Product product = Mockito.mock(Product.class);
        product.setProductDescription("Choclate Brownie");
        product.setProductTitle("Brownie");
        List<Product> products = new ArrayList<Product>();
        products.add(product);
        when(cartService.processCheckOut(products)).thenReturn(true);
        Assert.assertFalse(cartService.processCheckOut(products));
    }
}
