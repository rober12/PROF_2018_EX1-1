package es.upm.grise.profundizacion2018.PROF_2018_EX1_1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


//import static org.junit.Assert.assertEquals;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
* Unit test for simple App.
*/
public class AppTest 
  extends TestCase
{
	private App ejercicio = new App();
  /**
   * Create the test case
   *
   * @param testName name of the test case
   */
  public AppTest( String testName )
  {
      super( testName );
  }

  /**
   * @return the suite of tests being tested
   */
  public static Test suite()
  {
      return new TestSuite( AppTest.class );
  }

  /**
   * Rigourous Test :-)
   */
  public void testAppBien()
  {
  	String a = "Hola";
  	String b = "Hola";
      assertTrue( true );
      assertEquals( 0 , ejercicio.MyString(a,b));
  }
  public void testAppMal()
  {
  	String a = "Hola";
  	String b = "Holo";
      assertTrue( true );
      assertEquals( -1 , ejercicio.MyString(a,b));
  }
}
