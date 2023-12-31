public static String rev(String input) {
		String rev="";
		String words[]=input.split(" ");
		for(int i=words.length-1;i>=0;i--) {
			String temp="";
			
			rev+=words[i]+" ";
		}
		return rev;
	}
	
