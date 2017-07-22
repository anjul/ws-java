This example focus on demonstration of "How does two threads execute in parallel using Sleep and Join methods of Thread".

Following is the algorithmic of the program:

1. 	Create a Main class named "app.java"
2. 	Create a static void main method in app.java
3. 	Create a class named "Runner1" in app.java
4. 	Runner1 class should implement "Runnable Interface"
5. 	Runner1 class should implements "run()" method from Runnable interface
6. 	Runner1 class method run() should have simple for loop which is iterating values from 0 to 10 and 	printing "In Runner1:"+index
7. 	Call Thread.sleep(100) for 100ms so that after executing every print statement thread should sleep/	paused for 100ms
8. 	Runner2 class should implement "Runnable Interface"
9. 	Runner2 class should implements "run()" method from Runnable interface
10.	Runner2 class method run() should have simple for loop which is iterating values from 0 to 10 and 	printing "In Runner2:"+index
11.	Call Thread.sleep(100) for 100ms so that after executing every print statement thread should sleep/	paused for 100ms
12. Now in main method of app.java class, Create an instance of Thread class by initialize the thread 	class and pass the instance of Runner1 class in the constructor of thread class
13. Repeat the above step for Runner2 class
14. Call Thread.join method on both instances of thread classes.
15. Print "Task is completed"