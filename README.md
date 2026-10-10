# Webscribe

A blog engine for publishing blogs by a single author. The website is comprised of following main sections:
* Welcome section
* Weekly notes section
* Projects section

# Getting started

Set active profile in `application.properties` and define a profile specific property file. Start the server with the following command as stated in the official [doc](https://docs.spring.io/spring-boot/maven-plugin/run.html). 
```
mvn spring-boot:run
```

## Customisation

* Set name of the blog in application.properties.  
```
# application.properties

  blog.name=blog name
```
* Other texts are externalized and defined in `messages.properties`. Be sure to set the base name property so that spring knows where to look for the `messages` files.
```
# application-dev.properties

spring.messages.basename=i18n/messages
```
  