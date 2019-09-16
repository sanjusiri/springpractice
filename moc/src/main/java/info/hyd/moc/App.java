package info.hyd.moc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext container=new ClassPathXmlApplicationContext("classpath:info/hyd/config/spring-config.xml");
    	Person person = container.getBean(Person.class);
    	Address address = container.getBean(Address.class);
    	Student student = container.getBean(Student.class);
    	System.out.println(person);
    	System.out.println(address);
    	System.out.println(student);
    	ClassPathXmlApplicationContext.class.cast(container).close();
    	
    }
}
