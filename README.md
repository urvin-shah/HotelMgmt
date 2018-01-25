# HotelMgmt-Spring Boot and Embedded MongoDB Application

This is a demo project for Embedded MongoDB using Spring Boot framework.

This is very simple application where i have used Emebedded Mongo DB, in the test environment we can use this approach. There are following dependancies which one needs to add to use the emebedded mongodb :

 <dependency>
    <groupId>de.flapdoodle.embed</groupId>
    <artifactId>de.flapdoodle.embed.mongo</artifactId>
    <version>1.50.5</version>
</dependency>
<dependency>
    <groupId>cz.jirutka.spring</groupId>
    <artifactId>embedmongo-spring</artifactId>
    <version>RELEASE</version>
</dependency>
<dependency>
  
Apart from these dependacies we need to add the MongoTemplate bean, please refer the MongoConfig class under the config package for the same.

These are the additional things which we need to configure for using the embedded and physical mongoDB server.
