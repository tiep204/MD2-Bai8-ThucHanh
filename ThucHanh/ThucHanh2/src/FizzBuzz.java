public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        if(isFizz && number % 5 == 0)
            return "FizzBuzz";
        if (isFizz){
            return "Fizz";
        }
        if(number % 5 == 0){
            return "Buzz";
        }
        return number + "";

    }
}
