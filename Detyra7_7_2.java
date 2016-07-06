import javax.swing.*;

public class Detyra7_7_2
{ public Detyra7_7_2()
  {}
  

  public static String removeDuplicateLetters(String s)
  { String result = "";
    for ( int i = 0;  i != s.length();  i++ )
        { if ( notFoundIn(result, s.charAt(i)) )
             { result = result + s.charAt(i); }
        }
    return result;
  }


  private static boolean notFoundIn(String a, char c)
  { boolean notfound = true;
    for ( int j = 0;  j != a.length();  j++ )
        { notfound = notfound  &&  (c != a.charAt(j)); }
    return notfound;
  }
  
  public static void main(String[] args)
  { String input = JOptionPane.showInputDialog("Type a word");
    System.out.println(removeDuplicateLetters(input));
  }
}