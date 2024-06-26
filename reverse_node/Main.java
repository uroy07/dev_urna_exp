public class Main {
  class Node{
    public Object data;
    public Node next;
    public Node(){
      data=null;
      next=null;
    }
    public Node(Object obj, Node next){
      data=obj;
      this.next=next;
    }
    public Object data(){
      return data;
    }
    public Node next(){
      return next;
    }
    public void setData(Object obj){
      data=obj;
    }
    public void setNext(Node n){
      next=n;
    }

  }
  public static void main(String[] args) {
    Main outer = new Main();
    Main.Node n= outer.new Node("3", null);
    Main.Node n1= outer.new Node("2", n);
    Main.Node n2= outer.new Node("1", n1);
    reverse(n2);
  }
  public static String nodeToString(Node h){
    if(h==null)
      return "[]";
    String ans = "[";
    while(!(h==null)){
      ans+=h.data() + ", ";
      h=h.next();
    }
    return ans.substring(0, ans.length()-2)+"]";
  }
  public static Node reverse(Node h){
    Node storage = h.next;
    Node previous = h;
    h.next=null;

    while(storage!=null){
      h=storage;
      storage=h.next;

      h.next=previous;
      previous=h;
    }
    System.out.print(nodeToString(h));
    return h;
  }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
