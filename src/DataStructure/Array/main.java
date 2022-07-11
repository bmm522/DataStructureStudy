package DataStructure.Array;

public class main {

	public static void main(String[] args) {
		
		ArrayList as = new ArrayList();
		as.addLast(10); //0
		as.addLast(20); //1
		as.addLast(30); //2
		as.addLast(40); //3
		
	//	as.add(1, 15);
	//	as.addFirst(5);
		
		System.out.println(as.remove(1));
		
		System.out.println(as);
	}

}
