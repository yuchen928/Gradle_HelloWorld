package FirstGradle;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class SLF4J {
private static Logger LOGGER = LoggerFactory.getLogger(SLF4J.class);



public static void main(String[] args) {
LOGGER.info("Hello World");
System.out.println("Hello World");
System.out.println("Second Gradle");
}
}
