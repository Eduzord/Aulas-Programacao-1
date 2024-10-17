package br.senac.rj.teste;

public class TesteClasseStringComparacao {

	public static void main(String[] args) {
		String a,b,c,d;
		a = "Ricardo";
		b = "Ricardo";
		c = " Ricardo";
		d = c.substring(1,8);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " +d);
		System.out.println("a == b -> " + (a==b));
		System.out.println("a == c -> " + (a==c));
		System.out.println("a == d -> " + (a==d));
		System.out.println("a == d.intern() -> " + (a==d.intern()));
		System.out.println("a.equals(b) = " + a.equals(b));
		System.out.println("a.equals(c) = " + a.equals(c));
		System.out.println("a.equals(d) = " + a.equals(d));
				
	}

}
