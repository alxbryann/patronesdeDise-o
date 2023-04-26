/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observador;

import java.util.ArrayList;

/**
 *
 * @author SG701-10
 */
public class Subject implements ISubject {

    //Declarar estructura para manejar suscriptores
    private ArrayList<Observer> observerList; 
    //Atributo con estado
    private int flag;
    
    public Subject(){
        observerList= new ArrayList<>();
        flag=0;
    }
    @Override
    public void register(Observer ob) {
        observerList.add(ob);
    }

    @Override
    public void unregister(Observer ob) {
        observerList.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update();
        }
    }
    public int getFlag() {
        return flag;
    }
    public void setFlag(int flag) {
        //Indica que el estado del flag cambio
        this.flag = flag;
        //Notificar a observadores el cambio de estado
        notifyObservers();
    }
}
