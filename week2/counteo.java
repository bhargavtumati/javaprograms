//Write a java program to count total number of even and odd elements in an array.
class counteo{
  public static void main(String[] args){
    int a[]={10,5,75,15,48,75,15,48},i,even=0,odd=0;
for(i=0;i<a.length;i++)
  {
    if(a[i]%2==0)
      even++;
    else
      odd++;
  }
    System.out.println("no of even elements: "+even+"\nno of odd elements: "+odd);
      }
}