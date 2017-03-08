/*
 * ReservationDetailsController.java controller class
 */
package controller;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Observer;
import model.ReservationDetails;
import observer.ReservationDetailsObserver;

/**
 *
 * @author Anjalee Mendis
 */
public interface ReservationDetailsController extends Remote{
    
     public boolean addReservationDetails(ReservationDetails reservationDetails)throws RemoteException, 
            ClassNotFoundException, IOException;
    
    public boolean updateReservationDetails(ReservationDetails reservationDetails)throws RemoteException, 
            ClassNotFoundException, IOException;
    
    public boolean deleteReservationDetails(String rid)throws RemoteException, 
            ClassNotFoundException, IOException;
    
    /**
     *
     * @param rid
     * @return
     * @throws RemoteException
     * @throws ClassNotFoundException
     * @throws IOException
     */
    public ReservationDetails searchReservationDetails(String rid)throws RemoteException, 
            ClassNotFoundException, IOException;
    
    public ArrayList<ReservationDetails> getAllReservationDetails()throws RemoteException, 
            ClassNotFoundException, IOException;
    
    public void addReservationDetailsObserver (ReservationDetailsObserver customerObserver) throws RemoteException;

    /**
     *
     * @param reservationDetailsObserver
     * @throws RemoteException
     */
    public void removeReservationDetailsObserver (Observer reservationDetailsObserver) throws RemoteException;
    
}
