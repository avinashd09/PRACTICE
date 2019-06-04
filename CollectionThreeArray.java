
import java.util.Arrays;

public class CollectionThreeArray {

    public static void main(String args[])
    {
    int arr[]={10,22,55,412,154,3254,214782,11,33,369,21,1,0,2};
    for(int tmp:arr)
    {
    System.out.println(tmp);
    }
    Arrays.sort(arr);
    for(int tmp:arr)
    {
    System.out.println(tmp);
    }
    int idx=Arrays.binarySearch(arr, 44);
System.out.println(idx);
    }
}
