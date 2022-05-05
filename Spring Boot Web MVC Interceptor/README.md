# Spring Boot Web MVC Interceptor
Spring Boot Interceptors are useful tools for intercepting the HTTP request process. The concept is similar to AOP pointcuts and you can have them easily plugged and unplugged from the HTTP request process flow.

[![N|Solid](https://cdn-images-1.medium.com/max/800/1*HCeQSAnb8uVW28hVOrZZnQ.png)](https://farzinpashaeee.medium.com/)

Basically, Interceptor is similar to a Servlet Filter, but in contrast to the latter, It is located after DispatcherServlet and as a result, related HandlerInterceptor class configured inside the application context. Filters are known to be more powerful, they are allowed to exchange the request and response objects that are handed down the chain whereas, Interceptors are just allowed to add some customer custom pre-processing, option of prohibiting the execution, and also custom post-processing.

Read the full article in [farzinpashaeee.medium.com](https://farzinpashaeee.medium.com/x)
