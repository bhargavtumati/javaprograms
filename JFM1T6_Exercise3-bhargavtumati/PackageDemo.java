// Java Program to illustrate a user defined package.
package package1;
// Defining class and it's methods as public to allow access outside this package
public class PackageDemo{  
 public void sayHello(){  
    System.out.println("Hello World!");  
   }  
}  
/* Let's learn how to organize classes inside a java packagae and access them from outside of the package
first create a package or a folder in root folder here and name it package1
inside this package, create a new file PackageDemo.java 
Let's open this file. Here we'll first write a package statement and then create a class say PackageDemo that contains a simple method named sayHello
We'll not run this class as you can see it doesn't have main method
We'll rather create another class outside this package to access this class but before that remember here the class and its member method must be public to be accessible outside it's package.
*/