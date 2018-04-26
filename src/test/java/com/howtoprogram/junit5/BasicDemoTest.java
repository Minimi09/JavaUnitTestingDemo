package com.howtoprogram.junit5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicDemoTest {
  private BasicDemo basicDemo;

    @BeforeAll() //Antes de todas las pruebas yo corro esto
    static void setUpAll()
    {
        System.out.println("BeforeAll");
    }

     @BeforeEach()//antes de cada prueba yo corro esto
     void setUp()
     {
         System.out.println("BeforeEach");
     }

     @AfterEach
     void tearDown()
     {
         System.out.println("tearDown");
     }

     @AfterAll
    static void tearDownAll()
     {
         System.out.println("tearDownAll");
     }

  @Test
  @DisplayName("Prueba")
  void testGetDemoString() {
        System.out.println("PRUEBADEMO");
    basicDemo = new BasicDemo();
    String expectedDemo = "Prueba";
    basicDemo.setDemoString(expectedDemo);
    assertEquals(expectedDemo, basicDemo.getDemoString());

  }

    @Test
    @DisplayName("SimpleTest")
    void simpleTest() {
        System.out.println("SimpleTest");
        assertEquals(true , true);
    }
}