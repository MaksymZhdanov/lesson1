package hillel.lesson2;

import java.util.Arrays;

public class CheckPolindrom
{
  public static void main(String[] args)
  {
    String polindrom = "A12345677654321a";
    System.out.println(getStartCheck(polindrom));
  }

  private static String getStartCheck(String polindrom)
  {
    String tempPolindrom = polindrom.replaceAll("\\s+", "");
    tempPolindrom = tempPolindrom.toLowerCase();
    char tempOrigin[] = tempPolindrom.toCharArray();
    for (int i = 0, j = tempPolindrom.length() - 1; i < tempPolindrom.length() - 1 && j > 0; i++, j--)
    {
      if (tempOrigin[i] == tempOrigin[j])
      {
      }
      else
      {
        return polindrom = "данная строка не полиндром";
      }
    }
    return polindrom = "данная строка полиндром";
  }
}
