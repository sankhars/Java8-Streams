import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
//Find the maximum repeat vowels , replace maximum consonant with that vowels?
      //  String input = new String{"SivaVigneshS"};
        int[] input = {1,2,3,4,4,5};
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,1,2,3,4,5));
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(19,11,12,14,15));

        int[] num1 = {1,2,3,4,5};
        int[] num2 = {10,9,8,5};
        int k=3;
         System.out.println (Arrays.toString(removespecific(num1, k)));
        System.out.println(sortNumbers(numbers));
        System.out.println(reversesortNumbers(numbers));
        System.out.println(Arrays.toString(mergetwoNumbers(num1,num2)));
        //findcountofOccurence(int[] input);
        //findmaxRepeatVowelswithConsonant(input);
    }


 public static int[] removespecific(int[] nums,int k) {

       // return (ArrayList) input.stream().distinct().collect(Collectors.toList());

       return Arrays.stream(nums).filter(num->num!=k).toArray();


    }
    public static ArrayList sortNumbers(ArrayList input){
        return (ArrayList) input.stream().sorted().collect(Collectors.toList());
    }

    public static ArrayList reversesortNumbers(ArrayList input){
        return (ArrayList) input.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public static int[] mergetwoNumbers(int[] input,int[] input1){
        return IntStream.concat(Arrays.stream(input),Arrays.stream(input1)).sorted().toArray();
    }


        //System.out.println(Arrays.stream(input).distinct().collect(Collectors.toList()));
}


 /*  public static void findmaxRepeatVowelswithConsonant(String input){
        int count = 0;
        int maxValue = 0;
        input.toUpperCase();
        char[] ch = input.toCharArray();
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(int i=0;i<input.length();i++){
            if(ch!='A'||'E'||'I'||'O'||'U'){
                count++;
                maxValue = Math.max(count,ch[i]);
                hashmap.put(ch[i],maxValue);
            }
        }
        for(int j=0;j<input.length();j++) {
            char[] ch1 = input.toCharArray();
            if(ch1='A'||'E'||'I'||'O'||'U') {
                input.replace(ch1,hashmap.get(ch[j]));
            }
        }*/
















   /* public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
*/

/*
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
*/

 /*   public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }*/

