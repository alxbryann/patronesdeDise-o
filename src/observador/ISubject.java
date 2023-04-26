/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package observador;

/**
 *
 * @author SG701-10
 */
public interface ISubject {
    
    public void register (Observer ob);
    public void unregister(Observer ob);
    public void notifyObservers();
    
}
