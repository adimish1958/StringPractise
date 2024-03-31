public class AllSubstrings{
  
public static void main(String args[]){
  List<String> res=allSubstring1(str6);
		System.out.println("**************************************");
		System.out.println("All substring of string");
		for(int i=0;i<res.size();i++) {
			System.out.print(res.get(i)+ " , ");
		}
}
public static List<String> allSubstring1(String str) {
		List<String> res= new ArrayList<>();
		backtrack(res, str, "",0);
		return res;
		
	}
	
	private static void backtrack(List<String> res, String str, String temp, int index) {
		// TODO Auto-generated method stub
		if(index==str.length()) {
			res.add(temp);
			return;
		}
		backtrack(res,str, temp+str.charAt(index),index+1);
		backtrack(res,str, temp,index+1);
	}
}

