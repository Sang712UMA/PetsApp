package UnitTests;

import Exercise2_1.MyCollection;

public class MyCollectionTest {

	public static void main(String[] args) {
		MyCollection col = new MyCollection();
		col.add(1);
		col.add(2);
		col.add(3);
		col.add(4);
		System.out.println(col);
		col.remove(5);
		col.remove(2);
		System.out.println(col);
		

	}

}
