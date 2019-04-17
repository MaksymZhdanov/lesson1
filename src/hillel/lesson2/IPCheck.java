package hillel.lesson2;

public class IPCheck
{
  public static void main(String[] args)
  {
    String ip = "255.255.255.255";
    System.out.println(getCheckIp(ip));
  }

  private static String getCheckIp(String ipAddress)
  {
    String notValid = "Ip не валиден";
    String valid = "Ip валиден";
    try
    {
      if (ipAddress != null && !ipAddress.isEmpty())
      {
        String[] ip = ipAddress.split("\\.");
        if (ip.length != 4)
        {
          return notValid;
        }
        for (int i = 0; i <= ip.length - 1; i++)
        {
          int j = Integer.parseInt(ip[i]);
          if (j < 0 || j > 255)
          {
            return notValid;
          }
        }
        if (ipAddress.endsWith("."))
        {
          return notValid;
        }
        if (ipAddress.startsWith("."))
        {
          return notValid;
        }
      }
      return valid;
    }
    catch (NumberFormatException ex)
    {
      return notValid;
    }
  }
}
