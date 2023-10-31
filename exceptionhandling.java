public class exceptionhandling {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3};
        try{
            int j= arr[4]/2;
        } catch(Exception e){
            System.out.println("error is"+e);
        }
        System.out.println("after execution of array");
    }
}