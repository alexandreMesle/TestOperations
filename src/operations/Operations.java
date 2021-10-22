package operations;
public class Operations
{
	public static int succ(int x)
	{
		return x+1;
	}

	public static int pred(int x)
	{
		return x-1;
	}

	public static int somme(int a, int b)
	{
		return a+b;
	}

	public static int produit(int a, int b)
	{
		return a*b;
	}

	public static double puissance(int base, int exp)
	{
		return Math.pow(base, exp);
	}
}
