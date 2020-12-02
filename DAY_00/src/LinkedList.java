import java.util.Arrays;

class LinkedList{
	public static void main(String[] args){
		linked_list ls = new linked_list();

		System.out.println("Insert 0~9");
		for(int i=0; i<10; i++){
			ls.insert(ls.getLength(), String.valueOf(i));
		}
		ls.printAllNode();

		System.out.println("Delete 0~4");
		for(int i=0; i<5; i++){
			ls.remove(0);
		}
		ls.printAllNode();

		System.out.println("Insert \"B\" at 3 ");
		ls.insert(3, "B");
		ls.printAllNode();

		System.out.println("Print as array");
		System.out.println(Arrays.toString(ls.list2string()));
	}
}