// Java Program to demonstrate how to import package and it's class

// Please follow the same steps as showed below or watch the Package video on LMS how to execute this program.

import package1.PackageDemo;
public class PackageImport {
  public static void main(String[] args) {
  // Object creation of the public class PackageDemo imported from package1
  PackageDemo p=new PackageDemo();
  // Calling public method sayHello defined in class PackageDemo imported from package1
  p.sayHello();
  }
}

/*Let's create another class outside package1 and name it say PackageImport
Objective of this java class is to understand how to import package1 here and call it's class and method here
First we need to write import statement to import PackageDemo class of package1 
Then we follow the same steps to call a method ie., first create the object of class and then call its method
Now let's run this class as you can see it has main method and see the output "Hello World!" in console.
Remember this is the right application building approach wherein there are several classes organized in packages and imported in the main class.
*/


