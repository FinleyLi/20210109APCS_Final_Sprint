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
            System.out.println("農夫帶著 " + str + " 從此岸到彼岸");
            System.out.println("此岸" + listThis + "\b" + "彼岸" + listThat);
            System.out.println();
            listThat.add(str);
            thatToThis();
        }else{
            listThis.add(str);
            thisTothat();
        }
	}
	public void thatToThis(){
        if(listThis.isEmpty()){
            System.out.println("此岸" + listThis + "\b" + "彼岸" + listThat);
            return;
        }
        if(isSafe(listThat)){
            System.out.println("農夫從彼岸到此岸");
            System.out.println("此岸" + listThis + "\b" + "彼岸" + listThat);
            System.out.println();
            thisTothat();
        }else{
            String str = listThat.get(0);
            listThat.remove(0);
            if(isSafe(listThat)){
                System.out.println("農夫帶著 " + str + " 從彼岸到此岸");
                System.out.println("此岸" + listThis + "\b" + "彼岸" + listThat);
                System.out.println();
                listThis.add(str);
                thisTothat();
            }else{
                listThat.add(str);
                thatToThis();
            }
        }
    }
    public static void main(String[] args){
        System.out.println("脚本之家测试结果：");
        System.out.println();
        new CrossRiver().thisTothat();
    }
}