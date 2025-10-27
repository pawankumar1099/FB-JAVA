public class first5nummbers {
    public static void main(String[] args) {
        firstFiveNumbers(1);
        
    }

    static void firstFiveNumbers(int i){
        if(i==6){
            return;
        }
        System.out.println(i);
        firstFiveNumbers(i+1);

    }
}
