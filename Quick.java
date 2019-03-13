import java.util.Random;
public class test{
  public static String toString(int[] ary){
    String output = "";
    for(int i = 0; i < ary.length; i++){
      output += ary[i] + " ";}
    return output;
  }
  public static int partition (int [] data, int start, int end){
   Random rand = new Random();
   int pick = rand.nextInt(data.length);
   int index = 0;
   int pivot = data[pick];
   data[pick] = data[0];
   data[0] = pivot;
   while (start != end) {
     int value = data[start];
     if (value > pivot) {
       data[start] = data[end];
       data[end] = value;
       end--;
     }
     if (value <= pivot) {
       start++;
     }
   }
   if (start == 0 && end == 0) {
     return index;
   }
   if (start == end) {
     if (pivot <= data[start]) {
       data[0] = data[start - 1];
       data[start - 1] = pivot;
       index = start - 1;
     } else {
       data[0] = data[start];
       data[start] = pivot;
       index = start;
     }
   }
   System.out.println(pivot);
   System.out.println(toString(data));
   return index;
  }
public static void main(String[] args) {
  int[] ary = {23,10,36,7,6,8,73,1,124,15,16,24};
  System.out.print(partition(ary, 0, 11));

  } 
}
