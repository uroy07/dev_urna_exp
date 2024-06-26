package pack;

public class Stack{
  Package Stacks;
  private static int count=0;
  private static Stack[] stacks = null;
  private int[] data;
  private int size;
  public Stack(){
    data = new int[100];
    size = 0;
    count++;
    Stack[] holder = new Stack[count];
    if(stacks != null)
      for(int i=0; i<stacks.length; i++)
        holder[i] = stacks[i];
    holder[count-1] = this;
    stacks=holder;
  }
  public static int getCount(){
    return count;
  }
  private int[] getData(){
    return data;
  }
  private void setData(int[] d){
    data = d;
  }
  private void setSize(int s){
    size = s;
  }
  public int size(){
    return size;
  }
  public void push(int a){
    if(size >= data.length){
      System.out.print("Error: Stack overflow.");
      return;
    }
    data[size] = a;
    size++;
  }
  public int pop(){
    if(size==0){
      System.out.print("Error: Stack is empty.");
      return 0;
    }
    size--;
    return data[size];
  }
  public String toString(){
    String ans = "[";
    for(int i=0; i<size; i++){
      if(!(i+1==size))
        ans+= data[i] + ", ";
      else
        ans += data[i];  
    }
    ans += "]";
    return ans;
  }
  public Stack copy(){
    Stack s = new Stack();
    for(int i=0; i<size; i++)
      s.push(data[i]);
    s.size=size;
    return s;
  }
  public void append(Stack s){
    int holder=size+s.size();
    for(int i=size+s.size()-1; i>=size; i--){
      data[i] = s.pop();
    }
    size = holder;
  }
  public static void printAllStacks(){
    if(stacks == null){
      System.out.println("Error: No Stacks have been created.");
      return;
    }
    for(int i=0; i<stacks.length; i++)
      System.out.println(stacks[i].toString());
  }

}
