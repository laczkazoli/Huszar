package pkg;

import static org.junit.Assert.*;
import org.junit.Test;

public class lepesekTest {

	@Test
	public void test() {
		Huszar test=new Huszar();
		int output=test.lepesek(0);
		assertEquals(0,output);
		
		output=test.lepesek(1);
		assertEquals(1,output);
		output=test.lepesek(41);
		assertEquals(1,output);
		output=test.lepesek(11);
		assertEquals(1,output);
		output=test.lepesek(31);
		assertEquals(1,output);
		output=test.lepesek(2);
		assertEquals(0,output);
		output=test.lepesek(10);
		assertEquals(0,output);
		output=test.lepesek(16);
		assertEquals(0,output);
		
		Huszar test2=new Huszar();
		boolean output1=test2.lepheteke(11);
		assertEquals(false,output1);
		output1=test2.lepheteke(23);
		assertEquals(false,output1);
		output1=test2.lepheteke(43);
		assertEquals(false,output1);
		output1=test2.lepheteke(22);
		assertEquals(false,output1);
		output1=test2.lepheteke(41);
		assertEquals(false,output1);
		output1=test2.lepheteke(62);
		assertEquals(false,output1);
		output1=test2.lepheteke(54);
		assertEquals(false,output1);
		output1=test2.lepheteke(42);
		assertEquals(false,output1);
		output1=test2.lepheteke(34);
		assertEquals(false,output1);
		output1=test2.lepheteke(13);
		assertEquals(false,output1);
		output1=test2.lepheteke(25);
		assertEquals(false,output1);
		output1=test2.lepheteke(33);
		assertEquals(false,output1);
		output1=test2.lepheteke(21);
		assertEquals(true,output1);
		
		
	}

}
