import com.demo.Car;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    private static final Log log = LogFactory.getLog(SpringApp.class);
    public static void main(String[] args) {
        // SOLID
        // Single Responsibility
        log.info("Hello Spring");
        log.warn("Hello Spring");
        log.fatal("Hello Spring");
        // Framework
        // open source
        // lightweight framework
        // Loose Coupling

        // Book
        // Author
// dependencies injections
       // inversion of control --   IOC
//        Book b = new Book(1,"Java",29);
//        Author author = new Author(1,"Faraz","Masood");
//        author.setBook(b);
//        System.out.println(author);

//        Engine v8 = EngineFactory.createEngine("V8");
//
//        Car  farazCar = new Car(v8);
//        farazCar.start();
//        Engine v6 = EngineFactory.createEngine("V6");
//        Car zevarCar = new Car(v6);
//        zevarCar.start();

        // Using XML notation

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Car carV6 =(Car) context.getBean("zevarCar");
        carV6.start();

        Car farazCar = (Car) context.getBean("farazCar");
        farazCar.start();



    }
}
