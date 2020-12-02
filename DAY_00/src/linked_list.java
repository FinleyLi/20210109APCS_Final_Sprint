// repl.it/@tony92151/java#linked_list.java

public class linked_list{
	class Node{
		private String data;
		private Node next;

		public void setData(String data){
			this.data = data;
		}
		public String getData(){
			return data;
		}
		public void setNext(Node ne){
			next = ne;
		}
		public Node getNext(){
			return next;
		}
	}

	private Node head;
	//private Node tail;
	public linked_list(){
		head = new Node();
		head.next = null;
	}

	public void insert(int position, String value){
		Node newN = new Node();
		newN.setData(value);
		Node toinsert = toNode(position);
		//System.out.println(newN.getData());
		newN.setNext(toinsert.getNext());
		toinsert.setNext(newN);
		//system.out.println(head.next.data);
	}

	private Node toNode(int local){
		Node toN = head;
		for(int i=0; i<local; i++){
			toN = toN.getNext();
			//System.out.println("no");
		}
	return toN;
	}

	public String remove(int position){
		Node toremove =toNode(position-1);
		String de = toremove.getNext().getData();
		toremove.setNext(toremove.getNext().getNext());
		return de;
	}

	public int getLength(){
		Node N = head;
		int count = 0;
		while(N.getNext()!=null){
			count+=1;
			N = N.getNext();
		}
		return count;
	}

	public void printAllNode(){
		Node N = head;
		while(N.getNext()!=null){
			System.out.print(N.getNext().getData()+" > ");
			N = N.getNext();
		}
		System.out.print("\n");
	}

	public String[] list2string(){
		int leng = getLength();
		Node N = head;
		String[] s = new String[leng];
		for(int i=0; i<leng; i++){
			s[i] = N.getNext().getData();
			N = N.getNext();
		}
		return s;
	}
}