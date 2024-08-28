package array;

public class Resizing {

    public int[] resize(int[] arr, int capacity){
        int temp[] = new int[capacity];
        for (int i=0; i<arr.length; i++){
            temp[i]=arr[i];
        }
        arr=temp;
        return arr;
    }
    public static void main(String[] args) {
        int[] original = new int[]{1,5,7,3,8};
        System.out.println("original array length " + original.length);
        Resizing re = new Resizing();
        original = re.resize(original,10);
        System.out.println("The size of original array after resize : "+ original.length);
    }
}
