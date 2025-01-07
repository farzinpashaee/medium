# Spring Boot Reactive Web Application — WebFlux
WebFlux is part of Spring Framework which helps to achieve a programming paradigm that promotes an asynchronous, non-blocking, event-driven approach to data processing known as reactive programming. Reactive systems have certain characteristics that make them ideal for low-latency, high-throughput workloads.

In order to better understand it, let us think about an example like a REST API that simply gets some information from DataBase and return it as a JSON response. Having this example implemented with Spring Web MVC which has a blocking nature you will come up with a flow like this:

[![N|Solid](https://miro.medium.com/max/693/1*5EbwXAu2IWduCtLXpSRk4g.png)](https://medium.com/@farzinpashaeee/spring-boot-reactive-web-application-webflux-acef6ed7f37f)

Each incoming request will be processed with an HTTP request handler in different threads from the HTTP thread pool. During the time the request is being processed in the service layer which will include getting information from DB the thread is blocked and can not be used by any other request. As you can see the number of requests the server can handle depends on the size of the thread pool and if the blocking process takes longer than expected soon you will face with longer response time and fail to respond to new incoming requests.

On the other hand, we can use a reactive approach which in our case is the WebFlux as part of the Spring Boot application. Spring WebFlux uses internally Project Reactor and its publisher implementations, Flux, and Mono.

[![N|Solid](https://miro.medium.com/max/693/1*2DmPAU8wanGJV_R60pnrZw.png)](https://medium.com/@farzinpashaeee/spring-boot-reactive-web-application-webflux-acef6ed7f37f)

As you can see in this diagram, unlike the web MVC blocking model all incoming HTTP requests actually handled by a single or small set of threads. For each incoming request as an event, the process will pass to the EventHandler to do the expected business logic which in this case is retrieving the data from the database. Using R2DBC which is non-blocking instead of JDBC will help us to have a full non-blocking flow. Meaning that as soon as the data requested from DataBase is available it will be returned and during this time there will be no threads blocked for that request. Because of this functionality, you will not waste processing time by having the thread blocked for I/O latency.

Read the full article in [farzinpashaeee.medium.com](https://farzinpashaeee.medium.com/spring-boot-reactive-web-application-webflux-acef6ed7f37f)
