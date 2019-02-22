public class IntersectionOfArrays{
    public int[] intersection(int []num1,int []num2){
        HashSet<Integer> set1=new HashSet<Integer>();
        for(int i:num1){
            set1.add(i)
        }
        HashSet<Integer> set2=new HashSet<Integer>();
        for(int i:num2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }
        int[] result=new int[size.set2];
        int i=0
        for(int n:set2){
            result[i]=n;
            i++;

        }