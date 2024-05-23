import com.mentors.Animal;
import com.mentors.Cat;
import com.mentors.Dog;
import org.testng.annotations.Test;

public class UnitTests {
    @Test
    void dynamicPolymorphismTest() {
        System.out.println("test");
        Animal animal1 = new Cat(3, "Barsik");
        Animal animal2 = new Dog(2, "Barbos");

        Cat cat = new Cat(3, "Barsik");
        Dog dog = new Dog(2, "Barbos");

        animal1.sayHello();
        animal1.scratch();
        animal1.sleep(5);
        animal2.sayHello();
        animal2.scratch();
        animal2.sleep(10);
        cat.sayHello();
        cat.scratch();
    }

    @Test
    void staticPolymorphismTest() {
        Dog dog = new Dog(2, "Barbos");

        dog.sleep();
        dog.sleep(10);
    }

}
