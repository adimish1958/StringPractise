//check palindrome for integer, string
//longest palindromic substring

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12;
		System.out.println(palindrome_number(num));
		System.out.println(checkPalindrome(num));
		
		String str="forgeeksskeegfor";
		System.out.println("Longest Palindromic substring: " + longestPalindromic(str) );
		

	}
	
static String longestPalindromic(String s) {
		
	int n = s.length();
    int start = 0, end = 1;
    int low, hi;

    // Traverse the input string
    for (int i = 0; i < n; i++) {

        // Find longest palindromic substring of even size
        low = i - 1;
        hi = i;

        // Expand substring while it is palindrome and in bounds
        while (low >= 0 && hi < n && s.charAt(low) == s.charAt(hi)) {

            // Update maximum length and starting index
            if (hi - low + 1 > end) {
                start = low;
                end = hi - low + 1;
            }
            low--;
            hi++;
        }

        // Find longest palindromic substring of odd size
        low = i - 1;
        hi = i + 1;

        // Expand substring while it is palindrome and in bounds
        while (low >= 0 && hi < n && s.charAt(low) == s.charAt(hi)) {

            // Update maximum length and starting index
            if (hi - low + 1 > end) {
                start = low;
                end = hi - low + 1;
            }
            low--;
            hi++;
        }
    }
    return s.substring(start, start + end);
	}
	
	static boolean palindrome_number(int n){
		
		//O(Log (n))
		
		String str=String.valueOf(n);
		
		int low=0;
		int high=str.length()-1;
		if(str.length()<=1)
			return true;
		while(low<=high) {
			if(str.charAt(low)!=str.charAt(high)) {
				return false;
			}
			else {
				low++;
				high--;
			}
		}
		
		return true;
		
	}
	
	static boolean checkPalindrome(int n) 
	  { 
		//Time Complexity : O(log10(n)) or O(Number of digits in a given number)
	    int reverse = 0; 
	    int temp = n; 
	    while (temp != 0) { 
	      reverse = (reverse * 10) + (temp % 10); 
	      temp = temp / 10; 
	    } 
	    return (reverse == n); // if it is true then it will return 1; 
	    // else if false it will return 0; 
	  } 
	
	
	  

}
