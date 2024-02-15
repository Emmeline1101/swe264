# swe264
projects done in the course"Distributed Software Architecture"

# Lab2
a student & course system based on event bus arch.
## How to build lab2
1. clone the repository/download files
2. change the working directory to the directory that contains all of the system’s source files
3. type the following cmd:
```shell
 javac *.java
 java SystemMain Students.txt Courses.txt
```
  
 ## Function of the class
• SystemMain.java: Has the main() method and creates the system structure by instantiating all 
of the components and starting the ClientInput component. (initialize the whole project)
• ClientInput.java: Presents the main menu and broadcasts service requests to the other 
components based on user input. (receive the input & show result)
• ClientOutput.java: Subscribes to and receives “show” notification. The contents of these 
notifications are displayed onto the user console. 
• DataBase.java: Provides access to the student and course lists. Also provides methods for 
student registration. (provides data access)
• EventBus.java: The implicit invocation architecture is implemented using Java Observer/ 
Observable classes. This class provides the basis for the components to be observers and to 
announce notifications. (define event)
• CommandEventHandler.java: Provides services to list student/course information and to register a 
student for a course. (an interface)
• *Handler.java: Implementation of a component that handles a menu event. 
• Student.java: Class used to represent a Student in the system. 
• Course.java: Class used to represent a Course in the system. 
• Courses.txt: Text file that contains list of courses. 
• Students.txt: Text file that contains list of students.
