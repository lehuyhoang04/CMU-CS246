
import com.mycompany.student.Student;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class StudentTest{
    
    @Test
    public void TestGetName(){
        Student student = new Student("123","Huyhoang", 99);
        Assert.assertTrue(student.getName().equalsIgnoreCase("HuyHoang"));
        
    }
    
    @Test
    public void TestAge(){
        Student student = new Student("123","HuyHoang", 99);
        student.setAge(20);
        Assert.assertEquals(student.getAge(), 20);
}
    
    @Test
    public void updateName(){
        Student student =new Student("123", "HuyHoang", 99);
        student.updateName("huyhoangle");
        Assert.assertEquals(student.getName(), "huyhoangle");
        
    }
}
    
