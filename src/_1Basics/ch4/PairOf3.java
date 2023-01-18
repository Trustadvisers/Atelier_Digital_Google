package _1Basics.ch4;

public class PairOf3 {
    public static void main(String[] args) {
        int arr[] = {-1,-1,2,1};
        pairs(arr);

    }

    public static void pairs(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for(int j = i+1; j<arr.length; j++)
                for(int z=j+1; z<arr.length; z++)
                    if (arr[i] + arr[j] +arr[z] == 0)
                        count++;
        System.out.println(count);
    }
}