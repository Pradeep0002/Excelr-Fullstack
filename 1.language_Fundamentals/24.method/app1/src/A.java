class  A
{
	public static void main(String[] args) 
	{
		System.out.println("from main");
	}
	public static void test() 
	{
		System.out.println("from test");
	}
}
/*
METHOD
 - by using methods we can execute a set of statement any of times  
 - each time we can able to supply different values for  a method.
 - we can call a method any no. of times.and in each all the statement are which are in the method will be executed
 - main is also a method which is the starting point of a program
 - JVM will start the execution from the main method .
 - Jvm will be always searching for " public static void main(String[] args)
 declaration.
 - main method is also called as an entry point of a java program.
 - we can keep any number of statement and any type of statement insid of method.
 - we can develop any number of method inside the class.
 - method must be having a return type. at least 'void'
 - void means nothing.if we keep void return type for any method that means the method return means nothing (no value).
 - method can takes any no. of arguments(parameter,signatue) including no-argument or 0 no. of arguments.
 - argument datatype can be anything.
 - by using ',' as a seperator we can develop any no. of arguments.
 - while JVM is calling the main method compulsory it has create one empty String
 array Object and should supply that object as an argument to the main method. 
 - method will be called by the JVM only once while the class is executing.
 - method must be having '}''{' thats what we are calling body of that method.
 - method can be static and non-static.
 - methods compulsary has the access-specifiers or access modifiers.
  (public,protected,default,private)
  - if we dont specify anything,the default access specifiers will be 'default'(friendly).
  - methods are going to be executed if and only if they are called.otherwise they will execute.
  - in case of main method that will be called implicity by the JVM.but with the regular user created methods,compulsary
  we have to make a call to the,in order for them to be executed.
  - to call the static methods we dont have to create object for that class.
  - main method also is a static method.that means there is no need for jvm to create
  an object in order to call the main method.
  - if we dont keep any access specifier for a user created method,compiler only
  adding default access specifier while at time of compilation.
  - method name must be a valid identifiers
  - if method name is more than two words follow the camel case but first word first letter in the lower case.

*/