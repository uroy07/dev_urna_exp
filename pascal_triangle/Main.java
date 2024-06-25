public class Main {
  public static void main(String[] args) {
    System.out.println(arrayToString(pascalsTriangle(5)));
  }
  public static String arrayToString(int[][] a){
    if(a==null)
      return "null";
    String ans = "{";
    for(int i=0; i<a.length; i++){
      if(a[i]==null)
        ans += "null";
      else{
        ans += "{";
        for(int j=0; j<a[i].length-1; j++)
          ans +=  a[i][j] + ", ";
        ans += a[i][a[i].length-1] + "}";
      }
      if(i<a.length-1)
        ans += ", \n";
    }
    return ans + "}";
  }
  public static int[][] pascalsTriangle(int n){
    int[][] ans = new int[n][];
    int[] row1 = {1}, row2={1, 1};
    if(n>0)
      ans[0] = row1;
    if(n>1)
      ans[1] = row2;
    for(int i=2; i<n; i++){
      ans[i] = new int[i+1];
      ans[i][0] = 1;
      for(int j=0; j<i-1; j++){
        ans[i][j+1] = ans[i-1][j] + ans[i-1][j+1];
      }
      ans[i][i] = 1;
    }
    return ans;
  }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
