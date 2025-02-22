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


