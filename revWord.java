public static String revWord(String input) {
		String rev="";
		String words[]=input.split(" ");
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String temp="";
			for(int j=word.length()-1;j>=0;j--) {
				temp+=word.charAt(j);
			}
			rev+=temp+" ";
		}
		return rev;
	}
