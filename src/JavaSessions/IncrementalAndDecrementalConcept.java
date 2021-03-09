package JavaSessions;

public class IncrementalAndDecrementalConcept {

	public static void main(String[] args) {

		// post increment: ++
		int m = 1;
		int n = m++;
		System.out.println(m);// 2
		System.out.println(n);// 1

		int p = -99;
		int q = p++;
		System.out.println(p);// -98
		System.out.println(q);// -99

		int l = 0;
		int t = l++;
		System.out.println(l);// 1
		System.out.println(t);// 0

		// pre increment:
		int a = 1;
		int b = ++a;
		System.out.println(a);// 2
		System.out.println(b);// 2

		int g = -10;
		int h = ++g;
		System.out.println(g);// -9
		System.out.println(h);// -9

		int x = -39;
		int y = ++x;
		System.out.println(x);// -38
		System.out.println(y);// -38

		// post decrement: --
		int a1 = 2;
		int b1 = a1--;
		System.out.println(a1);// 1
		System.out.println(b1);// 2

		// pre decrement:
		int r = 2;
		int e = --r;
		System.out.println(r);// 1
		System.out.println(e);// 1

		int m1 = 1;
		System.out.println(m1++);
		System.out.println(m1);

		int n1 = -90;
		System.out.println(++n1);

	}

}
