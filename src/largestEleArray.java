public class largestEleArray {

    public static void findLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int n : arr){
            if(n > max){
                max =n;
            }
        }
        System.out.println("largest element = " + max);
    }


    public static void main(String[] args) {
        int[] arr ={23,73,55,1,85,64,48};
        findLargest(arr);
    }
}
