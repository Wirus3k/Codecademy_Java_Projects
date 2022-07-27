public class CarLoan {
    int carLoan = 10000;
    int loanLength = 3; //years
    int interestRate = 5;
    int downPayment = 2000;

    //Requirements that would prevent a buyer from taking invalid car loan
    public void prevent(){
        if(loanLength <= 0 || interestRate <=0){
            System.out.println("Error! You must take out a valid car loan.");
        }
        else if(downPayment >= carLoan){
            System.out.println("The car can be paid in full");
        }
        else{
            int remainingBalance = carLoan - downPayment;
            int months = 12 * loanLength;
            int monthlyBalance = remainingBalance / months;
            int interest = (monthlyBalance * interestRate)/100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println("Monthly payment is "+monthlyPayment);
        }
    }

    public static void main(String[] args) {
        CarLoan first = new CarLoan();
        //first.loanLength = -5;
        //first.downPayment = 12000;
        first.prevent();


    }
}