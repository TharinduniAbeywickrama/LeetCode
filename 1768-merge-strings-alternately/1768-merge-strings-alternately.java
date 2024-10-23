class Solution {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i=0, j=0;

        //Iterate while either of the words has characters
        while(i<word1.length() || j<word2.length()){
            // Adds a character from word1 if available
            if(i<word1.length()){
                merged.append(word1.charAt(i));
                i++;
            }
            // Adds a character from word2 if available
            if(j<word2.length()){
                merged.append(word2.charAt(j));
                j++;
            }
        }
        return merged.toString();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Input for word1
        String word1;
        do{
            System.out.print("Enter a word between 1-100 lowercase: ");
            word1=sc.nextLine();
        }while(!isValidInput(word1));

        //input for word2
        String word2;
        do{
            System.out.print("Enter a word between 1-100 lowercase: ");
            word2=sc.nextLine();
        }while(!isValidInput(word2));
    
        String result = mergeAlternately(word1,word2);
        System.out.print(result);
        sc.close();
    }
    //Helper function to valid inputs
    private static boolean isValidInput(String word){
        if(word.length()<1 || word.length()>100){
            return false;
        }
        if(!word.matches("[a-z]+")){
            return false;
        }
        return true;
    }
}