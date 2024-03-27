public class NumberOfNumbers {
    public StringBuilder sayNumber(String number){

        Character current = number.charAt(0);
        StringBuilder countedNumbers = new StringBuilder();
        int count = 1;
        for(int i=1; i<number.length(); i++){
            if(current == number.charAt(i)){
                count++;
            }else{
                countedNumbers.append(count).append(current);
                current = number.charAt(i);
                count = 1;
            }
        }countedNumbers.append(count).append(current);
        System.out.println(number);
        return countedNumbers;
    }
    public static void main(String[] args) {
        NumberOfNumbers obj = new NumberOfNumbers();
        System.out.println(obj.sayNumber("11442114"));
    }
}
