package hillel.lesson1;

public class GeometryPrinter
{
  public static void main(String[] args)
  {
    GeometryPrinter printer = new GeometryPrinter();

        printer.printSquare(6,6);
        System.out.println();
        printer.printTriangle(7,17);
        printer.printLeftTriagle(6,6);
        System.out.println();
        System.out.println();
        printer.printRightTriagle(6,6);
        System.out.println();
        printer.printRhumbus(9,11);
        System.out.println();
        printer.printChessBoard(5,10);
  }

  private void printRhumbus(int row, int column)
  {
    int tempLongRight = column / 2 + 1;
    int tempLongLeft = column / 2 + 1;
    int tempCentrRow = row / 2;
    for (int i = 0; i < row; i++)
    {
      if (i <= tempCentrRow - 1)
      {
        for (int j = 0; j < column; j++)
        {
          if (j == tempLongLeft || j == tempLongRight)
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }
        }
        tempLongLeft--;
        tempLongRight++;
        System.out.println();
      }
      else
      {
        for (int j = 0; j < column; j++)
        {
          if (j == tempLongLeft || j == tempLongRight)
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }
        }
        tempLongLeft++;
        tempLongRight--;
        System.out.println();
      }

    }

  }

  private void printRightTriagle(int row, int column)
  {
    int counter = row;
    for (int i = 0; i < row; i++)
    {
      counter--;
      for (int j = 0; j < column; j++)
      {
        if (j >= counter)
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  private void printChessBoard(int row, int column)
  {
    int countColumn = 1;
    int countRow = 1;
    for (int i = 0; i < row; i++)
    {
      for (int j = 0; j < column; j++)
      {
        if (countColumn % 2 == 0 && countRow % 2 != 0 || countColumn % 2 != 0 && countRow % 2 == 0)
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
        countColumn++;
      }
      countRow++;
      System.out.println();
    }
  }

  private void printLeftTriagle(int row, int column)
  {
    int counter = 0;
    for (int i = 0; i < row; i++)
    {
      for (int j = 0; j < column; j++)
      {
        if (j <= counter)
        {
          System.out.print("*");
        }
        else
        {
          System.out.println();
          break;
        }
      }
      counter++;
    }
  }

  private void printTriangle(int row, int column)
  {
    int temp = column % 2;
    if (temp == 0)
    {
      column = column / 2 + 1;
    }
    temp = column;
    for (int i = 0; i < row; i++)
    {
      for (int j = 0; j < column + 1; j++)
      {
        if (j < temp)
        {
          System.out.print(" ");
        }
        else
        {
          System.out.print("*");
        }
      }
      temp--;
      column++;
      System.out.println();
    }
  }

  private void printSquare(int row, int column)
  {
    for (int i = 0; i < row; i++)
    {
      if (i == 0 || i == row - 1)
      {
        for (int j = 0; j < column; j++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
      else
      {
        for (int j = 0; j < column; j++)
        {
          if (j == 0 || j == column - 1)
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
  }
}
