/*
 * CabController.java controller class
 */
package controller;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Observer;
import model.Cab;
import observer.CabObserver;


/**
 *
 * @author Anjalee Mendis
 */
public interface CabController extends Remote{
    public boolean addCab(Cab cab)throws RemoteException, 
            ClassNotFoundException, IOException;
    
    public boolean updateCab(Cab cab)throws RemoteException, 
            ClassNotFoundException, IOException;
    
    public boolean deleteCab(String cid)throws RemoteException, 
            ClassNotFoundException, IOException;
    
    public Cab searchCab(String cid)throws RemoteException, 
            ClassNotFoundException, IOException;
    
    /**
     *
     * @return
     * @throws RemoteException
     * @throws ClassNotFoundException
     * @throws IOException
     */
    public ArrayList<Cab> getAllCab()throws RemoteException, 
            ClassNotFoundException, IOException;
    
    public boolean reserveCab (String cid)throws RemoteException;

    /**
     *
     * @param cabObserver
     * @throws RemoteException
     */
    public void addCabObserver (CabObserver cabObserver) throws RemoteException;
    public void removeCabObserver (Observer cabObserver) throws RemoteException;
}
