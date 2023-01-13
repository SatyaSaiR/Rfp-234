package LinkedList;

public class LinkedList<T> {

	
		
		Node<T> head;
		Node<T> tail;
		
		
		void add ( T key) {
			Node <T> node = new Node<>( key);
			if (head == null) {
				head = node;
				tail = node;
			}
			else {
			    node.next = head;
			    head = node;
			}
		}
		
		void display() {
			Node <T> temp = head;
			while (temp != null) {
				System.out.print(temp.key + " ");
				temp = temp.next;
			}
		}
		
		void append(T key) {
			Node <T> node = new Node<>(key);
			if (head == null) {
				head = node;
				tail = node;
			}else {
				tail.next= node;
				tail = node;
			}		
		}
		  void insert (T key) {
			Node <T> node = new Node<>(key);
			head.next = node;
			node.next = tail;
		}
		  
		  T pop() {
			  T deletedElement = head.key;
			  head = head.next;
			  return deletedElement;
		  }
		  
		  T popLast() {
			  T deletedElement = tail.key;
			  Node<T> temp = head;
			  while (temp.next != tail) {
				  temp = temp.next;
			  }
			  temp.next = null;
			  temp = tail;
			return deletedElement;
			  
		  }
		  
		  public Node<T> search(T key) {
			  Node<T> temp = head;
			  while(temp  != null) {
				  if(temp.key.equals(key)) 
					  return temp;
					  temp = temp.next;
			  }
				  return null;
			  
			  }
		  
		  public boolean insertAfter(T searchData, T insertData) {
			  Node<T> node = new Node<>(insertData);
			  Node<T> searchedNode = search(searchData);
			  if(searchedNode != null) {
				  node.next = searchedNode.next;
				  searchedNode.next = node;
				  return true;
			  }
			return false;
			  
		  }
		  
		  public void popElement(T key) {
			  Node<T> searchedNode = search(key);
			  Node<T> temp = head;
			  while(temp.next != searchedNode) {
				  temp = temp.next;
			  }
			  temp.next = searchedNode.next;
		  }
		  
		  public int size() {
			  int count =0;
			  Node<T> temp = head;
			  while (temp != null) {
				  temp = temp.next;
				  count++;
				
			}
			  return count;
		  }

		public T peek() {
			return null;
			
		}

}


