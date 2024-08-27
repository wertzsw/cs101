package HW05.Solutions;

public class ListFunctionsSol {

    public int[] arr;
    public ListFunctionsSol(int[] arr){
        this.arr = arr;
    }
    //TODO: Write a function that takes in a char[] and returns a String made up of the array.
    //Example: charArrToString(['s','e','t','h']) -> "seth"
    public String charArrToString(char[] arr){
        String s = "";
        for(int i = 0; i<arr.length; i++){
            s = s + arr[i];
        }
        return s;
    }

    //TODO: Write a function that takes in an int[] and returns a reversed list
    public int[] reverse(int[] arr){
        int[] rArr = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            rArr[i] = arr[arr.length - i - 1];
        }
        return rArr;
    }

    //TODO: Write a function that reverses the field arr
    //Ask Seth about cloning!
    public void reverse(){
        int[] tempArr = this.arr.clone();
        for(int i = 0; i<this.arr.length; i++){
            tempArr[i] = this.arr[this.arr.length - i - 1];
        }
        this.arr = tempArr;
    }

    //TODO: Write a function that takes in an int[] of positive values and returns the greatest value in the list.
    public int largest(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
}
