# nsm-gigrt-test

 Code Design Assessment 
1.	What are your opinions in the usage of interfaces in general? 
By having interfaces, we can have the surety of implementation without having to deal with the implementation.  Since interfaces are not classes, Java classes achieves multiple inheritance by implementing more than one interfaces.
a.	The concept of interfaces exists for a reason, but when and how should we use it? 
Interfaces are best suited to provide a common functionality to multiple classes.
Interfaces are used when we need to achieve full abstraction. When we design an interface with the abstract methods in it, we make an unbreakable contract for the classes that implements the interface to define the abstract methods of the interface.  
Also, a Java class can only inherit a single Java class, but can inherit multiple interfaces, for such scenarios when we can use interfaces. 


2.	What are your opinions on the Trading Currency Interface above? 
a.	Is it necessary or unnecessary?
It’s unnecessary in my opinion
b.	When/How is it necessary/unnecessary? It’s unnecessary as all the variants of currency will have to define the implementation of the abstract methods: getExchangeRate () and getExchangedAmount(). The abstract class currency can be implemented in places where there is no currency exchange but with the interface it will be forced to implement the two abstract methods.

3.	Programming languages typically comes with frameworks that implement arithmetic operations for decimal values differently. java.math. BigDecimal is Java platform's implementation. System.Decimal is .NET Framework's implementation. 
a.	Share your opinions on why such arithmetic operations are implemented by individual programming language frameworks differently.  
The implementations are defined differently because they support two different programming languages developed by people with different perspectives on development and complements and supporting other components offered by the programming languages
b.	Share your opinion why we should or shouldn't use implementations provided by individual programming languages.
The arithmetic operations implementations provided by the individual programming languages makes the life easy as it provides most of the necessary functions. There will be limitations on what you can do with them based on what is provided by the programming language.
