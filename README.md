# Web-Application-Testing-with-Selenium

**Introduction:**  

Testing is a repetitive and iterative process. So, what does Selenium do? It automates routine tests and making work less boring. Selenium is restricted only to web application testing and no mobile applications testing. It works in different browsers such as Google Chrome, Firefox, Opera, Safari and among others can be accommodated in different operating systems such as iOS, Windows, Linux and it can also be integrated with different programming languages such as Perl, c-sharp, PHP and among others including java.

**Inadequacies in Selenium?**

Selenium does not have an inbuilt object repository and that’s an inadequacy in Selenium. Objects which I am referring here is nothing but a centralised repository where objects information can be stored. Now this object repository acts as an interface between the test script and the application to identify the objects during the execution of test cases, so the test script is written in a programming language and here I used java so java has certain objects in it and the web application will be tested upon using this test script So, this in build object repository helps in identifying the objects in the test script when the web application is being tested. If suppose an in-built object repository is not there so in a scenario like that, we will have to access multiple file and that will make it tedious, now this feature that is the feature of inbuilt object repository can be included in selenium by integrating it with Git.

**Integration of Java program with Selenium:**

Selenium web driver acts as a programming interface to create and execute the test cases so the
test script which is out here which is written in Java invokes the selenium web driver which runs
the test cases on different browsers so selenium web driver per se is written in Java and hence an understanding of the java language is quite beneficial. 

**Expected output of test cases:**

In this project, when we run the test script then the Google chrome browser will be launched and then web application will be opened which is Amazon.co.uk now the window will be maximized after this in the search text box I’m going to type in ‘Stephen King’ so I can send text also into web applications and this whole process/entire thing is automated and then the search results will come and then I’m going to go ahead and choose ‘the stand’ book of Stephen King and then I’m going to click on it so once I click on it then will click the ‘Hardcover’ which is the format of the book and then I’m going to add this book to the cart and then I’m just going to scroll down the webpage just to show that scroll down can also be performed next I’m going to open a new demo application to test high iframes and from there I’m going to shift the control to the inner iframe and inside the text box I’m going to type in “HEY” and then close the browser so this is all going to happen in this project.

**Implementation of Java Selenium**

So, first is the integration of java with selenium and we have three agenda here firstly the installation of software of Java Eclipse and selenium. Secondly we would run the test case and finally we will see each test case that has been executed.

**Implementation:**

I started with integrating the different software’s so the first and foremost thing here is we need to create a workspace in a local system where our files and all the progress will be stored of Eclipse IDE. Next open Eclipse IDE choose and browse the location of workspace then it will load the workbench. After all this we create a new Java project and name it as ‘CA650Assignment’ and ensure that jre environment is of java. And now we have jar files of selenium which we have to import it to the project so for this we go to ‘configure build path’ and in libraries we select ‘add external jars’ so in this we upload selenium server standalone and the other one which we have to upload is zip folder which has the library folder. So after adding external jar files we notice that a new sub-folder named ‘referenced libraries’ has been added in our ‘CA650Assignment’ and in this referenced libraries we have selenium jar file and zip file so in this we can see that all jar files the library folder has been imported. Next I need the chrome driver as well, so I have created a sub folder in ‘CA650Assignment’ as ‘drivers’ and this folder is for chrome driver next I just simply copy and paste the chrome driver here in this folder. So, till here we’ve integrated selenium and chrome drive driver with a java project.

Now I created a package and type in a path as ‘com.assignment’ so this is where it will all be stored and the next, I created a class named ‘launch.java’. After doing the whole setup we then write the code.


**Result**

When we run the test script then the following will happen consecutively, and we achieve our desired output:
 
1.	Google Chrome browser will be launched.
2.	Opening the web application i.e. Amazon.co.uk.
3.	Window will be maximized.
4.	Automated type of ‘Stephen King’.
5.	Click on text ‘search’ button.
6.	Search for the book naming ‘Stand’.
7.	Click the book naming ’The Stand’.
8.	Click ‘Hardcover’ which is format of the book.
9.	‘Add to Cart’ button will be clicked.
10.	Scroll down to last page.
11.	Shifts control to the inner frame.
12.	In text box of iframe typing “HEY”
13.	Finally closes the browser after successful execution of all steps.

