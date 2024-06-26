
import pack.Stack;

public class Main {
  
  public static void main(String[] args) {
    testCode1();
    
  }
  public static Stack append(Stack s, Stack t){
    Stack ans = new Stack();
    int tSize = t.size();
    int totalSize = s.size() + t.size();
    for(int i=0; i<totalSize;i++){
      if(i<tSize)
        ans.push(t.pop());
      else
        ans.push(s.pop());
    }
    Stack ans1 = new Stack();
    for(int i=0; i<totalSize; i++)
      ans1.push(ans.pop());
    return ans1;
  }

   public static void testCode1(){
     int task=0;
     try {
       task = 1;
       Stack s = new Stack();
       s.push(1);
       s.push(2);
       s.push(3);
       s.push(4);
       s.push(5);
       s.pop();
       s.pop();
       boolean b = s.size()==3 && s.pop()==3;
       System.out.println(task + ". testCode1():\t\t\t\t\t\t" + b);
     } catch (Exception e1) {
        System.out.println("\n\n" + task + ". Your code crashed.");
     }
   }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
