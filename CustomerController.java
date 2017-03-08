/*
 * CustomerController.java controller class
 */
package controller;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Observer;
import model.Customer;
import observer.CustomerObserver;

/**
 *
 * @author Anjalee Mendis
 */
public interface CustomerController extends Remote{
    
    
    public boolean addCustomer(Customer customer)throws RemoteException, 
            ClassNotFoundException, IOException;
    
    public boolean updateCustomer(Customer customer)throws RemoteException, 
            ClassNotFoundException, IOException;
    
    public boolean deleteCustomer(String id)throws RemoteException, 
            ClassNotFoundException, IOException;
    
    public Customer searchCustomer(String id)throws RemoteException, 
            ClassNotFoundException, IOException;
    
    public ArrayList<Customer> getAllCustomer()throws RemoteException, 
            ClassNotFoundException, IOException;
    
    /**
     *
     * @param id
     * @return
     * @throws RemoteException
     */
    public boolean reserveCustomer (String id)throws RemoteException;

    /**
     *
     * @param customerObserver
     * @throws RemoteException
     */
    public void addCustomerObserver (CustomerObserver customerObserver) throws RemoteException;
    public void removeCustomerObserver (Observer customerObserver) throws RemoteException;
    
}
