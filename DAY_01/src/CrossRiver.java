/**
	@ compiler version JDK 11.0.9.1
	@ Input: height, weight
	@ Output: BMI
	@ Date: 2020/12/05
	@ Author: Finley
*/
import java.util.ArrayList;
import java.util.List;

public class CrossRiver{
	
	List<String> listThis = new ArrayList<String>();
	List<String> listThat = new ArrayList<String>();
	// boolean thisFlag = true; 
	// boolean thatFlag = false;

	// constructor
	public CrossRiver(){
		listThis.add("dog");
		listThis.add("fish");
		listThis.add("cat");
		// listThis.add("people");
	}

	// is safe?
	public boolean isSafe(@SuppressWarnings("rawtypes") List list){
		if (list.contains("fish")&&list.contains("cat") || list.contains("cat")&&list.contains("dog")){
			return false;
		} else{
			return true;
		}
	}
	
	// this to that
	public void thisTothat(){
		String str = listThis.get(0);
		listThis.remove(str);
		if(this.isSafe(listThis)){
			System.out.pirnt("farmer_take" + str +  "Cross River")
		}
	} 
}