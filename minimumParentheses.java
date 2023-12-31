public static int minimumParentheses(String pattern) {
		// Write your code here.
		int count=0;
		Stack<Character> s= new Stack<Character>();
		for(int i=0;i<pattern.length();i++){
			if(pattern.charAt(i)=='('){
				s.push(pattern.charAt(i));
			}
			else if(pattern.charAt(i)==')'){
				if(!s.isEmpty()&& s.peek()=='('){
					s.pop();
				}
				else{
					if(!s.isEmpty()){
					count++;
					s.pop();
					}
					else{
						count++;
					}
				}
			}
		}
		if(s.isEmpty())
		return count;
		else{
			count+=s.size();
			return count;
		}
	}
