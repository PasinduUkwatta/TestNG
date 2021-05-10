package testng.annotations;

import org.testng.annotations.Test;
//adding dependency methods to arrange test cases to order
public class DependencyTest {
    @Test
    public void testLogin() {
        System.out.println("Login");
    }

    @Test(dependsOnMethods = {"testLogin"})
    public void testCreate() {
        System.out.println("Create");
    }

    @Test(dependsOnMethods = {"testLogin","testCreate"})
    public void testEdit() {
        System.out.println("Edit");
    }

    @Test(dependsOnMethods = {"testLogin","testCreate","testEdit"})
    public void testDelete() {
        System.out.println("Delete");
    }

    @Test(dependsOnMethods = {"testLogin","testCreate","testEdit","testDelete"})
    public void testLogout() {
        System.out.println("Logout");
    }

//    @Test
//    public void PrintAlpahbet(){
//        for(int i=1;i<27;i++){
//            System.out.println((char)(i+'A'-1));
//
//        }
//
//    }
}
