import java.util.Random;
public class Quick{
  public static int partition(int[] ary, int start, int end){
    Random randgen = new Random();
    int index = Math.abs(randgen.nextInt()) % (end - start);
    int hold = ary[start];
    ary[start] = ary[index];
    ary[index] = hold;
    index = start;
    int point = end;
    for(int i = start + 1; i < end; i++){
      System.out.println(toString(ary));
      if(ary[i] <= ary[index]){
        hold = ary[i];
        ary[i] = ary[index];
        ary[index] = hold;
        index ++;}
      else{
        while(ary[point] > ary[index]){
          if(point == index + 1){
            return index;}
          point --;}
        hold = ary[point];
        ary[point] = ary[i];
        ary[i] = hold;
        i--;}}
    return index;}
    public static String toString(int[] ary){
      String output = "";
      for(int i = 0; i < ary.length; i++){
        output += ary[i] + " ";}
      return output;
    }
    public static void main(String[] args) {
      int[] ary = {4,10,3,7,6,8,9,1,12,15,16,24};
      System.out.print(partition(ary, 0, 11));

    }
  }
