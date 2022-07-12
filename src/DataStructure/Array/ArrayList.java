package DataStructure.Array;

public class ArrayList {
	
	private int size = 0;
	
	private Object[] elementData = new Object[100];

	public boolean addLast(Object element) {
		elementData[size] = element;
		size++;
		return true;
	}
	
	public boolean add(int index, Object element) {
		
		for(int i = size-1; i >= index ; i--) {
			elementData[i+1] = elementData[i];	
		}
		
		elementData[index] = element;
		size++;
		return true;
	}
	
	public boolean addFirst(Object element) {
		return add(0, element);
	}
	
	public String toString() {
		String str = "[";
		for (int i= 0 ; i<size; i++) {
			str+=elementData[i];
				if(i < size -1) {
					str+=",";
				}
		}
		return str + "]";
		
	}

	public Object remove(int index) {
		Object object = elementData[index];
		for(int i = index ; i<=size-1; i++) {
			elementData[i] = elementData[i+1];
		
		}
		size--;
		//elementData[size] = null;
		return object;
	}	
	public Object removeFirst() {
		return remove(0);
		
	}
	public Object removeLast() {
		return remove(size-1);
	}

	public Object get(int index) { //ArrayList를 사용하는 이유 (인덱스의 위치를 알 경우에 데이터를 찾기 쉬움)
		return elementData[index];
	}

	public int size() {
		return size;
	}

	public int indexOf(Object element) {
		for(int i = 0; i < size ; i++) {
			if(elementData[i] == element) {
				return i;
			}
		}
		return -1;
	}
	public ListIterator listIterator() {
		return new ListIterator();
		
	}
	class ListIterator{
		
		private int nextindex = 0;
		
		public Object next() {
				return get(nextindex++);	
		}
		
		public boolean hasNext() {
//			if(elementData[nextindex] == null) {
//				return false;
//			}
//			return true;
			
			return nextindex<size();
		}

		public Object previous() {
			
			return get(--nextindex);
			
		}
		public boolean hasPrevious() {
			return nextindex>0;
		}

		public void add(Object element) {
			ArrayList.this.add(nextindex++, element);
			
		}
		
		public void remove() {
			ArrayList.this.remove(nextindex-1);
			nextindex--;
			
		}
	}
}
