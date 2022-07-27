class Language{
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
    //Constructor
    Language(String langName, int speakers, String regions, String wdOrder){
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = wdOrder;
    }
    // Method to display info about language
    public void getInfo(){
        System.out.println(this.name+" is spoken by "+this.numSpeakers+" people mainly in "+this.regionsSpoken+" . The language follows the word order: "+this.wordOrder);
    }
    //main method
    public static void main(String[] args){
        Language spanish = new Language("Spanish", 555000000, "Spain, Latin America and Equatorial Guinea", "subject-verv-object");
        spanish.getInfo();
        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
        mandarin.getInfo();
        SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
        burmese.getInfo();
    }
}