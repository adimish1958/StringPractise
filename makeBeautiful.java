//beautiful strings are with alternate 1 and 0
	
	public static int makeBeautiful(String str) {
        int count1=0;
        int count2=0;
        
        for(int i=0;i<str.length();i++){
            if(i%2==0){
            if(str.charAt(i)=='1'){
                count1++;

            }
            }
            else{
                if(str.charAt(i)=='0'){
                count1++;
            }

            }
        }
        
            for(int i=0;i<str.length();i++){
            if(i%2==0){
            if(str.charAt(i)=='0'){
                count2++;

            }
            }
            else{
                if(str.charAt(i)=='1'){
                count2++;
            }

            }
            }
    
        return Math.min(count1, count2);

    }
