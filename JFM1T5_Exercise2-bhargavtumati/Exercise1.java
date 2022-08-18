// Write a program for printing only even elements of an array using for-each loop 
class Exercise1 {

	public static void main(String args[]) {
int arr[]={1,2,3,4,5,7,8};
    for(int i:arr){
      if(i%2==0){
        System.out.print(i+" ");
      }
    }
		
   }
}
