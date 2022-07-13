// Write a program to initialize your marks for 3 subjects and print the highest marks

class Exercise3 {
public static void main(String[] args){
  int x=70;
  int y=80;
  int z=90;
  System.out.println("x is highest "+(x>y&&x>z)+ " \ny is highest "+(y>x&&y>z)+ "\nz is highest "+(z>x&&z>y));
}
}