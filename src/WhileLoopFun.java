public class WhileLoopFun {
    public WhileLoopFun() { }

    public void printDigits(int number) {;
        while(number!=0){
            int digit = number %10;
            System.out.println(digit);
            number/=10;
        }
    }

    public int countLetter(String word, String letter) {
        /**int count = 0;
        for(int i = 0; i<=word.length()-1; i++){
            if((word.substring(i,i+1)).equals(letter)){
                count++;
            }
        }
        return count;
        **/
        int count = 0;
        int index = 0;
        while(index<word.length()){
            if (word.substring(index, index+1).equals(letter)){
                count++;
            }
            index++;
        }
        return count;

    }

     public int maxDoubles(int number, int threshold) {
         int count = 0;
         while(number<threshold){
             number*=2;
             if(number<=threshold){
                 count++;
             }
         }
         return count;
     }

     public boolean isPrime(int number) {
         if(number==1) {
             return false;
         }
         int factor = 2;
         int count = 0;
         while(factor<number){
             if(number%factor==0){
                 count++;
             }
             factor++;
         }
        if(count>1){
            return false;
        }else{
            return true;
        }
     }
}


