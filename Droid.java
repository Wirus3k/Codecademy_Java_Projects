public class Droid{
    String name;
    int batteryLevel;
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }
    public String toString(){
        return "Hello, I’m the droid: "+name;
    }

    public void performTask(String task){
        System.out.println(name+" is performing task: "+task);
        batteryLevel-=10;
    }
    public String energyReport(){
        return "Battery level of "+name+" is: "+ batteryLevel;
    }
    public void energyTransfer(int addEnergy){
        batteryLevel+=addEnergy;
    }
    public static void main(String[] args){
        Droid Codey = new Droid("Codey");
        Codey.performTask("cleaning");
        Codey.performTask("dancing");
        System.out.println(Codey.energyReport());
        Codey.energyTransfer(15);
        System.out.println(Codey.energyReport());
    }
}