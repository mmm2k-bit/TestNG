package class01;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotations {

    @Test
    public void firstTest(){
        System.out.println("first test");
    }

    @Test
    public void secondTest(){
        System.out.println("second test");
    }

    @Test
    public void thirdTest(){
        System.out.println("third test");
    }

    @BeforeMethod
    public void beforeM(){
        System.out.println("i am precondition");
    }

    @AfterMethod
    public void afterM(){
        System.out.println("i am postcondition");
    }



}
