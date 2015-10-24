/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marvin - Jocsan
 */
public class InventoryControlTest {
 
 public InventoryControlTest() {
 }

 /**
  * Test of calcVolumeOfContainer method, of class InventoryControl.
  */
 @Test
 public void testCalcVolumeOfContainer() {
  System.out.println("calcVolumeOfContainer");
  
  System.out.println("\tTest case #1");
  
  double height = 1.83;
  double width = 2.35;
  double length = 5.89;
  
  double expResult = 25.329945000000002;
  
  InventoryControl instance = new InventoryControl();
  
  double result = instance.calcVolumeOfContainer(height, width, length);
  assertEquals(expResult, result, 0.0001);
  
  System.out.println("\tTest case #2");
  
  height = -1;
  width = 2.35;
  length = 5.89;
 
  expResult = -1;
  
  result = instance.calcVolumeOfContainer(height, width, length);
  assertEquals(expResult, result, 0.0001);
  
  System.out.println("\tTest case #3");
  
  height = 1.83;
  width = -235;
  length = 5.89;
 
  expResult = -1;
  result = instance.calcVolumeOfContainer(height, width, length);
  assertEquals(expResult, result, 0.0001);
  
 }
 
}
