import java.util.ArrayList;

class PrimeDirective {
    public PrimeDirective(){

    }
    //Klasa sprawdzająca czy liczba jest pierwsza czy nie
    public boolean isPrime(int number){
        //Inicjacja zmiennej int licznika
        int times = 0;
        if(number == 0){
            return false;
        }
        else{
            //Pętla for która sprawdzą resztę z dzielenia
            for(int i = number; i>1;i--){
                int score = number%i;
                //Warunek ktory mowi ze jesli reszta z dzielenia bedzie 0 to inkrementacja licznika
                if(score==0){
                    times++;

                }

            }
            //Warunek ktory mowi ze jesli licznik jest jeden to jest to liczba pierwsza
            if(times==1){
                return true;
            }
            else{
                return false;
            }
        }
    }
    //Metoda tworząca liste
    public ArrayList<Integer> onlyPrimes(int[] numbers) {

        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int number:numbers){
            if(isPrime(number)){
                primes.add(number);
            }
        }
        return primes;
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    /*System.out.println(pd.isPrime(7));
    System.out.println(pd.isPrime(28));
    System.out.println(pd.isPrime(2));
    System.out.println(pd.isPrime(0));*/
        System.out.println(pd.onlyPrimes(numbers));
    }

}