package hillel.lesson2;

public class RotationArray
{
  public static void main(String[] args)
  {
    int arr[][] = new int[4][4];
    for (int i = 0; i < arr.length; i++)
    {
      for (int j = 0; j < arr[i].length; j++)
      {
        arr[i][j] = (int) (Math.random() * 9);
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    getRotate(arr);
  }

  private static int[][] getRotate(int array[][])
  {
    int tempArray[][] = new int[array.length][array.length];
    for (int i = 0; i < array.length; i++)
    {
      for (int j = 0; j < array[i].length; j++)
      {
        tempArray[i][j] = array[(array.length - 1) - j][i];
        System.out.print(tempArray[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    return tempArray;
  }
}
