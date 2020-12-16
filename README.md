# Domain Driven Architecture
Basic skeleton for Domain Driven Design with Hexagonal Architecture.

## Hexagonal Architecture?
The hexagonal architecture, or ports and adapters architecture, is an architectural pattern used in software design. It aims at creating loosely coupled application components that can be easily connected to their software environment by means of ports and adapters. This makes components exchangeable at any level and facilitates test automation.

![Domain Driven Design with Hexagonal Architecture](https://vaadin.com/static/content/learning-center/learn/tutorials/ddd/03__ddd_and_hexagonal/images/hexagonal.png)<br/>

## What is a Port?<br/>
A port is an interface between the system and the outside world that has been designed for a particular purpose or protocol. Ports are not only used to allow outside clients to access the system but also to allow the system to access external systems.<br/>

A port is a technology agnostic application programming interface (API) that has been designed for a particular type of interaction with the application (hence the word "protocol"). How you define this protocol is completely up to you and that is what makes this approach exciting.<br/>

Here are a few examples of different ports you may have:

* A port used by your application to access a database

* A port used by your application to send out messages such as e-mails or text messages

* A port used by human users to access your application

* A port used by other systems to access your application

* A port used by a particular user group to access your application

## What is an Adapter?<br/>
I already mentioned that ports are technology agnostic. Still, you interact with the system through some technology - a web browser, a mobile device, a dedicated hardware device, a desktop client, and so on. This is where adapters come in.<br/>

An adapter allows interaction through a particular port, using a particular technology. For example:

* A REST adapter allows REST clients to interact with the system through some port

* A RabbitMQ adpter allows RabbitMQ clients to interact with the system through some port

* An SQL adapter allows the system to interact with a database through some port

* A Vaadin adapter allows human users to interact with the system through some port

You can have multiple adapters for a single port or even a single adapter for multiple ports. You can add as many adapters to the system as you want or need, without affecting the other adapters, the ports or the domain model.

![Ports and Adapters](https://vaadin.com/static/content/learning-center/learn/tutorials/ddd/03__ddd_and_hexagonal/images/client_adapter.png)<br/>

## Poject Related Information

To build project
`mvn clean install`

To run project create a new configuration under bootstrap <br/>
`mvn spring-boot:run`

For any queries mail me : debdutta94ofc@gmail.com
