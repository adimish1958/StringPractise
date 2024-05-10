//split the sting such that each character comes only once in a splitted string
	
	public static void splitStringUniqueCharacters(String str) {
		List<String> result=new ArrayList<>();
		Set<Character> st=new HashSet<>();
		StringBuilder sb=new StringBuilder();
		for(char ch:str.toCharArray()) {
			if(!st.contains(ch)) {
				sb.append(ch);
				st.add(ch);
				
			}
			else {
				result.add(sb.toString());
				sb.setLength(0);
				st.clear();
				sb.append(ch);
				st.add(ch);
			}
		}
		result.add(sb.toString());
		System.out.println("All unique substring :");
		for(String s:result) {
			System.out.print(" "+ s);
		}
	}
