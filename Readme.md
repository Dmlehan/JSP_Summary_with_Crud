1.what is the java EE?
java EE is the one of java edition.There are serveral java edition .you can see those edition  in below .


Java Edition	                        Purpose
Java SE	Core Java,                  desktop applications, basic libraries
Jakarta EE (Java EE)            	Enterprise applications (web, business, cloud)
Java ME	Mobile,                     embedded systems, IoT
JavaFX	                            Desktop GUI applications
GraalVM	High-performance JVM,       multi-language support

Java EE (Java Platform, Enterprise Edition) is a set of specifications built on top of Java SE (Standard Edition) to provide a framework for developing large-scale, distributed, and secure enterprise applications.

Key Features of Java EE:
Web Development – Uses Servlets, JSP (JavaServer Pages), and JSF (JavaServer Faces) to create web applications.

Business Logic – Implements EJB (Enterprise JavaBeans) for managing business logic and transactions.

Database Connectivity – Uses JPA (Java Persistence API) for database operations and ORM (Object-Relational Mapping).

Web Services – Supports JAX-RS (RESTful APIs) and JAX-WS (SOAP-based APIs) for communication between applications.

Messaging System – Uses JMS (Java Message Service) for asynchronous communication between distributed components.

Security & Authentication – Provides role-based security, authentication, and encryption mechanisms.

Evolution of Java EE
Originally developed by Sun Microsystems and later maintained by Oracle.

In 2017, Oracle donated Java EE to the Eclipse Foundation, rebranding it as Jakarta EE.
Common Use Cases:
Large-scale enterprise applications (e.g., banking, healthcare, logistics).

E-commerce platforms and supply chain management systems.

Cloud-based applications and microservices architectures (now often using Jakarta EE or Spring).

2.......................................................................................................

What is the programming specification and JSR,JCP?
programming specification is a detailed document .Guys have mentioned that how should implement feature in that.
JSR-java Specification Request
JSP-java community process (it is a community and approve JSR)

3.......................................................................................................

what is the Web Application servers vs Web containers?
if does it has implemented all specification in JSR it is a WEB APPLICATION SERVERS.
if does it has implemented selected specification in JSR it's a WEB CONTAINERS.

4........................................................................................................

 What are the basic Http methods 
doGet-for reading data from server to browser
doPost-for creating(carrying) data from browser to server.
doPut-to Update data in the server.
doDelete-delete data in the server.
PATCH

Method   	Purpose	Idempotent? 	Sends Data in Body?
GET	       Retrieve data	        ✅ Yes	❌ No
POST	   Create resource	        ❌ No	✅ Yes
PUT	       Update/Replace resource	✅ Yes	✅ Yes
DELETE	   Remove resource	        ✅ Yes	❌ No
PATCH	   Partial update	        ❌ No	✅ Yes

5.........................................................................................................

Main Mapping
1.Default Mapping
@WebServlet (urlPatterns = "/").

2.Exact Mapping
@WebServlet(urlPatterns = "/exact")

3.Empty String Mapping
@WebServlet(urlPatterns = "")

6.............................................................................................................

what is the jsp (JavaServer Pages)?

Jsp (JavaServer pages) is a technology used to create a dynamic web pages using java .it is a part of jakarta EE(Formerly java EE) and allows embedding java code inside HTML.

7................................................................................................................
what is the Features of JSP?

Simplified web Development-Mixes java with HTML
Dynamic Content - Generates content based on user input or database  queries.
Reusable Components - Uses jsp tags ,javaBeans, anbd custom tags 
Faster than Servlets-Reduces java code in HTML files.
Session Management-Support cookies ,session tracking ,and authentication.

8.............................................................................................................................

What is the jsp life Cycle

1 Translation-JSP is converted into a Servlet(.java file).
2.Compilation-The Servlets is the compiled into a (.class) file
3.Initialization (init())-Called once when the jsp is loaded .
4.Execution (_JspService())-Runs for request.
5.Destruction (destroy())-Called when the page is removed from memory.

9..................................................................................................................................


Give to me Jsp Syntax and Example
Basic JSP pages (index.jsp)
<%@ page language="java" contentType="text/html" %>
<html>
<head><title>JSP Example</title></head>
<body>
    <h1>Welcome to JSP!</h1>
    <p>Current Time: <%= new java.util.Date() %></p>
</body>
</html>

10........................................................................................................................................

What is the different Servlet class vs JSP
servlet class --> Only java can be included into it .
JSP(java Servlet page )-->HTML,CSS,JS,Java can be included for it.


11.............................................................................................................................................

What is the JSP Issues 
 it run trough the Container so it is Heavy weight and slow.
it don't load in Exception Error.

12...................................................................................................................................................

what is the option for these issue?

The option is AJAX.

13...................................................................................................................................................

What is the AjAX ?

Asynchronous javaScript And XML

it is Non blocking task.

14......................................................................................................................................................

Why is Ajax is used ?

1. it is used to update webpage without refreshing webpage.
2. it is used to communicate with server.

15.......................................................................................................................................................

what are the inbuilt objects for using ajax

ActiveX <-- it is  microsoft one. it isn't used now.
XMLHttpRequest<-- it is used now .
 
JSON,XML,HTML,TXT, data format can be gotten from that ajax server

16...........................................................................................................................................................

what is the  Synchronous vs Asynchronous? 






