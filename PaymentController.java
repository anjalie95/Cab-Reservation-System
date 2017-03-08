/*
 * PaymentController.java controller class
 */
package controller;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Observer;
import model.Payment;
import observer.PaymentObserver;

/**
 *
 * @author Anjalee Mendis
 */
public interface PaymentController extends Remote {
    
    
    public boolean addPayment(Payment payment)throws RemoteException, 
            ClassNotFoundException, IOException;
    
    public boolean updatePayment(Payment payment)throws RemoteException, 
            ClassNotFoundException, IOException;
    
    public boolean deletePayment(String pid)throws RemoteException, 
            ClassNotFoundException, IOException;
    
    /**
     *
     * @param pid
     * @return
     * @throws RemoteException
     * @throws ClassNotFoundException
     * @throws IOException
     */
    public Payment searchPayment(String pid)throws RemoteException, 
            ClassNotFoundException, IOException;
    
    public ArrayList<Payment> getAllPayment()throws RemoteException, 
            ClassNotFoundException, IOException;
    
    public void addPaymentObserver (PaymentObserver paymentObserver) throws RemoteException;

    /**
     *
     * @param paymentObserver
     * @throws RemoteException
     */
    public void removePaymentObserver (Observer paymentObserver) throws RemoteException;
    
}
