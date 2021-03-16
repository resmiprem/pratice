package Day14;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

public class MyTestCase {

	@BeforeClass
public static void setUpBeforeClass()throws Exception
{
	System.out.println("setup before the class");
}


	@AfterClass
public static void tearDownAfterClass()throws Exception
{
	System.out.println("tear down after the class");
}
	
@Before
public void setUp()throws Exception
{
System.out.println("setup executed......");	
}


@After
public  void tearDown()throws Exception
{
	
	System.out.println("tear down");
}

@Test
public void test1() {
	System.out.println("test1......");
}

@Test
public void test2()	
{
	System.out.println("test2......");
}

@Test
public void test3()
{
	System.out.println("test3......");	
}
}
