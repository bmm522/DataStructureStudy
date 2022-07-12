package DataStructure.Array;

public class main {

	public static void main(String[] args) {
		
		ArrayList as = new ArrayList();
		as.addLast(10); //0
		as.addLast(20); //1
		as.addLast(30); //2
		as.addLast(40); //3
		as.addLast(50); //4
		as.addLast(60); //5
		as.addLast(70); //6
		as.addLast(80); //7


		ArrayList.ListIterator li =as.listIterator();
		
		while(li.hasNext()) {
			int number = (int)li.next();
			if(number ==30) {
				li.remove();
			}
			
		}
		System.out.println(as);
	}
		
		
		
	}


