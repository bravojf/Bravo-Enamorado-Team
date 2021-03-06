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
 * @author Marvin y Amada
 */
public class TransportControlTest {
 
 public TransportControlTest() {
 }

 /**
  * Test of calcTimeInTransit method, of class TransportControl.
  */
 @Test
 public void testCalcTimeInTransit() {
  System.out.println("calcTimeInTransit");
  System.out.println("\tTest case #1");
  String fromLocation = "Riverside";
  double speed = 35;
  TransportControl instance = new TransportControl();
  double expResult = 10.4;
  double result = instance.calcTimeInTransit(fromLocation, speed);
  assertEquals(expResult, result, 0.0001);
  

  System.out.println("\tTest case #2");
  
  fromLocation = "Mountain";
  speed = 80;
  
  expResult = -1;
  result = instance.calcTimeInTransit(fromLocation, speed);
  assertEquals(expResult, result, 0.0001);

  
  System.out.println("\tTest case #3");
  
  fromLocation = null;
  speed = 10;
  
  expResult = -1;
  result = instance.calcTimeInTransit(fromLocation, speed);
  assertEquals(expResult, result, 0.0001);
  
  
  System.out.println("\tTest case #4");
  
  fromLocation = "Village";
  speed = -10;
  
  expResult = -1;
  result = instance.calcTimeInTransit(fromLocation, speed);
  assertEquals(expResult, result, 0.0001);
  
  
  System.out.println("\tTest case #5");
  
  fromLocation = "Riverside";
  speed = 40;
  
  expResult = 9.1;
  result = instance.calcTimeInTransit(fromLocation, speed);
  assertEquals(expResult, result, 0.0001);
  
  
  System.out.println("\tTest case #6");
  
  fromLocation = "Riverside";
  speed = 1;
  
  expResult = 364;
  result = instance.calcTimeInTransit(fromLocation, speed);
  assertEquals(expResult, result, 0.0001);
  
 }
 
}
