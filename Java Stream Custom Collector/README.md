# Java Stream Custom Collector

Without a doubt, the Stream was one of the major features added to Java 8. If you don't know what a stream is, a stream is a sequence of objects that support functional-style operations on elements, such as map-reduce transformations on collections with a pipeline approach.


[![N|Solid](https://miro.medium.com/max/1400/1*Qc8dTs7Uxg3OrZP_l4_oXA.png)](https://medium.com/codex/java-stream-custom-collector-376409c7af4)

## When to use it?
The best way to learn this topic is by example but first, let me share with you a couple of use cases, and then we can implement an example step by step.

**Aggregation** is one of the most used scenarios for custom collectors. Although there are predefined methods to do aggregation out of the box in the Stream API, It is very common that you may need to do some more complex aggregation using your own specific business need. The output of the aggregation can be an object or a list of objects that are grouped based on your requirements.

**Transformation** & Enrichment is another use case that you can consider to utilize the custom Collector. Of course, there are a lot of other tools in the collection framework that can help you with this. I think you will find the Collectors a strong solution for enrichment and transformation processes.

You may say that all of these can be done by SQL and it is true, but you will find yourself in situations that running complex and expensive aggregation and enrichment queries can easily be avoided by just using this approach.

Read the full article in [farzinpashaeee.medium.com](https://farzinpashaeee.medium.com/java-stream-custom-collector-376409c7af4).
