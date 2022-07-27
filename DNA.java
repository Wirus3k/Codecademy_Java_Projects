// Program will tell us is there protein in a strand of DNA or not
public class DNA{
    public DNA(){

    }

    public static void main(String [] args){

        //Add three Strings of DNA code
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        String dna4 = "ATTAATATGTACGGA";

        String dna = dna3;
        //System.out.println(dna.length());
        boolean one;
        boolean two;
        boolean three;

        // Check first condition
        int start = dna.indexOf("ATG");
        if(start==0){
            System.out.println("First condition is right");
            one = true;
        }
        else{
            System.out.println("First condition is false");
            one = false;
        }


        // Check second condition
        int size = dna.length();
        String check = dna.substring(size-3);
        if (check.equals("TGA")){
            System.out.println("Second condition is right");
            two = true;
        }
        else{
            System.out.println("Second condition is false");
            two = false;
        }
        // Check third condition
        if(size%3==0){
            System.out.println("Third condition is right");
            three = true;
        }
        else{
            System.out.println("Third condition is false");
            three = false;
        }
        // Check is protein or not
        if(one&&(two&three)){
            System.out.println("This DNA code contains a protein");
        }
        else{
            System.out.println("This DNA code does not contain a protein");
        }
    }
}