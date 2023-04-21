import java.util.Scanner;  // Import the Scanner class

class Main
{
  public static void main(String[] args)
  {
    //Accepts input text from user
    Scanner object = new Scanner(System.in);
    System.out.println("Input your text here:\n");
    String userText = object.nextLine();
    System.out.println("\n");
    
    //Sets up variables to work with the stack
    Stack groupingStack = new Stack(userText.length());
    boolean textBalanced = false;
    String tempString1 = "A";
    String tempString2 = "A";

    //Runs through user text and uses stack accordingly
    for(int i = 0; i < userText.length(); i++)
    {
      tempString1 = userText.substring(i, i + 1);

      //Pushes opening delimiter onto the stack
      if((tempString1.equals("(")) || (tempString1.equals("[")) || (tempString1.equals("{")))
      {
        groupingStack.push(tempString1);
        System.out.println("Pushed char: " + tempString1);
      }

      //Pops opening delimiter off the stack if the correct closing one is detected
      if((tempString1.equals(")")) || (tempString1.equals("]")) || (tempString1.equals("}")))
      {
        if(!(groupingStack.isStackEmpty()))
        {
          tempString2 = groupingStack.pop();
          System.out.println("Pop Trigger char: " + tempString1 + " Popped char:" + tempString2);
          if((tempString1.equals(")")) && !(tempString2.equals("(")))
          {
            groupingStack.push(tempString2);
            System.out.println("Re-pushed: " + tempString2 + "\nCheck loop will be exited.");
            i = userText.length();
          }
          else if((tempString1.equals("]")) && !(tempString2.equals("[")))
          {
            groupingStack.push(tempString2);
            System.out.println("Re-pushed: " + tempString2 + "\nCheck loop will be exited.");
            i = userText.length();
          }
          else if((tempString1.equals("}")) && !(tempString2.equals("{")))
          {
            groupingStack.push(tempString2);
            System.out.println("Re-pushed: " + tempString2 + "\nCheck loop will be exited.");
            i = userText.length();
          }
        }
        else
        {
          groupingStack.push("A");
          System.out.println("Check loop will be exited.");
          i = userText.length();
        }
      }
      tempString2 = "A";
    }

    //Determines if the text is balanced
    if(groupingStack.isStackEmpty())
    {
      textBalanced = true;
    }

    //Displays whether text is balanced or not
    if(textBalanced)
    {
      System.out.println("\nText is fine.");
    }
    else
    {
      System.out.println("\nText is not balanced properly!");
    }
  }
}