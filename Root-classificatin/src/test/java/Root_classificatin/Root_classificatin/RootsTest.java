package Root_classificatin.Root_classificatin;
import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest 
{
	Roots root;

	@Test
	public void Check_Min() 
	{
		Roots.calculate_roots(1, 3, 8);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void Check_Min_Plus_One() 
	{
		Roots.calculate_roots(0, 4, 4);
		
		String  root_expected = Root_Types.Not_quadratic.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void Check_Nominal() 
	{
		Roots.calculate_roots(50, 20, 2);
		
		String  root_expected = Root_Types.Equal_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void Check_Max() 
	{
		Roots.calculate_roots(100, 40, 3);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void Check_Max_Minus_One() 
	{
		Roots.calculate_roots(99, 6, -124);
		
		String  root_expected = Root_Types.ERROR.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	}
