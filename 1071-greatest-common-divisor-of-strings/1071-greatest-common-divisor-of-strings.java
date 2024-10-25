class Solution {
    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int gcdLength = gcd(str1.length(),str2.length());
        //Return the prefix of the gcdLength of either of the strings
        return str1.substring(0,gcdLength);
    }
    //Helper Function to find the gcd
    private static int gcd(int a, int b){
        if(b==0){
            return a;
        }
         return gcd(b,a%b);
    }
    //Helper Function to validate the input
    private static boolean isValidInput(String str){
        if(str.length() < 1 || 1000 < str.length()){
            System.out.println("Error: String should be between 1-1000");
            return false;
        }
        if(!str.matches("[A-Z]+")){
            System.out.println("Error: String should be uppercase");
            return false;
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1,str2;
        do{
            System.out.println("Enter String1: ");
            str1 = sc.nextLine();
        }while(!isValidInput(str1));
        do{
            System.out.println("Enter String2: ");
            str2 = sc.nextLine();
        }while(!isValidInput(str2));

        String result = gcdOfStrings(str1,str2);
        System.out.println(result);

        sc.close();
    }
}