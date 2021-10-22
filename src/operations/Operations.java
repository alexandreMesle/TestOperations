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

	public static int puissance(int base, int exp)
	{
		int number = 1;
		for(int i=1;i<=exp;i++) {
				number =  base*number;
			 

		}

		return number;
				
	}
}
