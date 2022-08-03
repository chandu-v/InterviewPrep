import java.util.*;

class Optum2 {

    public static void main(String[] args) {
        // System.out.println(crapFunction("2|2|2|3|3|3|4|4|4|5|5|5|1|3"));
        // System.out.println(crapFunction("5|5|2|2|2|3|3|3|4|4|4|5|3|4"));
        // System.out.println(crapFunction("6|5"));
        // System.out.println(crapFunction("1|1"));
        // System.out.println(crapFunction("2|3|3|3|2|3"));
        // System.out.println(crapFunction("5|6"));
        // System.out.println(crapFunction("6|6"));
        // System.out.println(crapFunction("3|2|1|3|5|3|4|5|3|3|3|4"));
        // System.out.println(crapFunction("2|4|5|3|5|4|3|1|4|6|6|5|1|2|5|2"));
        // System.out.println(crapFunction("5|4|4|2|1|2|3|3|6|4|6|6|1|1|6|6|3|3|1|6"));
        // System.out.println(crapFunction("2|4|5|3|5|4|3|1|4|6|3|5|2|2|5|1"));
        // System.out.println(crapFunction("2|4|5|3|5|4|3|1|4|6|2|1|3|2|2|2|6|4|6|6|5|6|3|4"));
        // System.out.println(crapFunction("6|4|4|2|1|2|3|3|6|5|2|6|4|2|2|1|6|6|3|3|3|6|2|2|4|1|6|3|5|5"));
        // System.out.println(crapFunction("6|4|2|2|2|3|3|3|4|4|5|4"));
        System.out.println(crapFunction("6|4|2|2|2|3|3|3|4|4"));



    }

    public static String crapFunction(String input) {


        List<String> covered = new ArrayList();
        covered.addAll(Arrays.asList("4","5","6","8","9","10"));
    
        int comeoutPhase = 0;
    
        char [] strArr = input.toCharArray();
        comeoutPhase = Integer.parseInt(String.valueOf(strArr[0]))+Integer.parseInt(String.valueOf(strArr[2]));

        if(comeoutPhase == 7 || comeoutPhase == 11) return "natural";
        if(comeoutPhase == 2 || comeoutPhase == 3 || comeoutPhase == 12) return "craps";
        covered.remove(comeoutPhase+"");
        String result = "";
        for(int i = 4 ; i < strArr.length ; ) {
            int point = Integer.parseInt(String.valueOf(strArr[i]))+Integer.parseInt(String.valueOf(strArr[i+2]));
            if(covered.contains(point+"")) covered.remove(point+"");
            i=i+4;
            if(point == comeoutPhase) {
                result += "made point";
                break;
            }
            if(point == 7) {
                result += "seven out";
            }
        }
        if(covered.size() == 0) result += " covered";
        return result;
    }
    
}