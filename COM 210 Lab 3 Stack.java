//Creates the Stack class
class Stack
{
  //Creates the private data for the Stack class
  private int maxSize;
  private String[] stackArray;
  private int top;

  //Instantiates a Stack class object
  public Stack(int s)
  {
    maxSize = s;
    stackArray = new String[s];
    top = -1;
  }

  //Accesses the maxSize variable for the Stack object
  public int getMaxSize()
  {
    return maxSize;
  }

  //Accesses the stack from the Stack object
  public String[] getStackArray()
  {
    return stackArray;
  }

  //Accesses the top variable for the Stack object
  public int getTop()
  {
    return top;
  }

  //Pushes a String onto the stack
  public void push(String j)
  {
    stackArray[++top] = j;
  }

  //Pops a String off the stack and returns the result
  public String pop()
  {
    return stackArray[top--];
  }

  //Determines whether the stack of a Stack object is empty and returns such information
  public boolean isStackEmpty()
  {
    return (top <= -1);
  }

  //Determines whether the stack of a Stack object is full and returns such information
  public boolean isStackFull()
  {
    return (top >= maxSize - 1);
  }
}