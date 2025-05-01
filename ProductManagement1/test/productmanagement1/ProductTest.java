/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package productmanagement1;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MSI
 */
  public class ProductTest {
      @Test		
      public void testGetProductId() {
          Product product = new Product("P001", "Laptop", 1500.0);
          assertEquals("P001", product.getProductId());
      }

      @Test
      public void testSetPrice() {
          Product product = new Product("P001", "Laptop", 1500.0);
          product.setPrice(1600.0);
          assertEquals(1600.0, product.getPrice(), 0.001);
      }
  }
