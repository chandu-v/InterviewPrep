
class Optum {
    
    public static void main(String [] args) {
       System.out.println(revertString("i am running short of time"));
    }

    public static String revertString(String str) {

        String result = "";
        String string = "";
        for(int i = 0 ; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                result = string +" "+result;
                string = "";
                continue;
            }
            string = string+String.valueOf(str.charAt(i));
        }
        result = string +" "+result;
        return result;
    }

    /**
i/p: i am running short of time.
o/p: time of short running am i
     */
}