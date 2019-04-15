package hillel.lesson1;

import java.util.Arrays;

public class Sort
{
  public static void main(String[] args)
  {
    Sort sort = new Sort();
    int arr[] = new int[20];
    for (int i = 0; i < arr.length; i++)
    {
      arr[i] = (int) (Math.random() * 1000);
    }
    System.out.println(Arrays.toString(arr));
    sort.bubbleSort(arr);
    System.out.println("отсортированный масив");
    System.out.println(Arrays.toString(arr));
    System.out.println("три самых больших элемента массива");
    for (int i = 0; i < 3; i++)
    {
      System.out.println((i + 1) + ") [" + arr[i] + "]  ");
    }
  }

  private int[] bubbleSort(int[] arr)
  {
    boolean sorted = false;
    while (!sorted)
    {
      sorted = true;
      for (int j = 0; j < arr.length - 1; j++)
      {
        if (arr[j] < arr[j + 1])
        {
          sorted = false;
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return arr;
  }
}
