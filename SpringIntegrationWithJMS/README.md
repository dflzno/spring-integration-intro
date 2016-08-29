### Required:
ActiveMQ running on port 61616.

Tomcat or another container.

### Build: 
mvn clean install

### Run: 
Copy war on Tomcat's webapps folder.

Start ActiveMQ -> Navigate to ActiveMQ's bin folder and run <code>activemq start</code> or <code>./activemq start</code> accordingly

Start Tomcat -> Navigate to Tomcat's bin folder and run <code>./startup.sh</code> or <code>startup.bat</code> accordingly

### Usage:
POST http://localhost:8080/spring-integration-example/message

Body example:
<code>
{
	"name":"Message From Rest",
	"messageType":"CREATE",
	"body":"This is very important content"
}
</code>
