package cognizant;

public class SubStringCount {

    public static void main(String[] args) {
        String str = "aavvccssdd";
        String str2 = "ccxxmmkkaa";
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(i+1!=str.length()) {
                String newString = str.charAt(i) +"" +str.charAt(i + 1);
                for(int j=0; j<str2.length();j++){
                    if(j+1!=str2.length()) {
                        String secondString = str2.charAt(j) +""+ str2.charAt(j + 1) ;
                        if(newString.equals(secondString)){
                            System.out.println(newString+">>>>>>>>>"+secondString);
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println("The Count is "+count);

    }
}
