package dec30;


public class SORT_ARRAY
{
    public static void main(String[] args)
    {
        int[] arr = {10, 3, 20, 5, 6};

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) { // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
}
