/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBLayer;

/**
 *
 * @author Erik
 */
import ModelLayer.*;

/**
 * Interface to the DBEmployeer
 * @author kbh
 */
public interface IFDBCustomer {
    // get all employees

    public Customer findCustomer(int customerNo, boolean retriveAssociation);
    //find one employee having the fname

//    public int insertCustomer(Customer c);
//    //update information about an employee
}
