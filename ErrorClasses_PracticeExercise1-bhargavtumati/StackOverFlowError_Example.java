/* 2. Write a program to illustrate StackOverFlowError. 
   To get StackOverFlowError do below steps. Create method with one integer parameter. If parameter value ==0 , 
   return that value, if integer value is not equals to zero then call again print method with increment value in else block 
*/

public class StackOverFlowError_Example {
    // create a method called print(int num)
    public void print(int num){
        // check num=0 or not
        if(num==0){
            return;
        }
        else{
            //call print(num++) method
            print(num++);
        }
    }
    
    public static void main(String args[]){
        //call print(2) method with object
        new StackOverFlowError_Example().print(2);
        
    }
}


