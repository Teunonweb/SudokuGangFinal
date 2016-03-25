/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pg3f4battleship;

/**
 *
 * @author pg3f4
 */
public class Space {
    private boolean pressed;
    private Ship ship;
    
    /**
     *
     */
    public Space(){
        this.pressed = false;
        this.ship = null;
    }
    
    /**
     *
     * @param ship the ship to place in this space
     */
    public Space(Ship ship){
        this();
        this.ship = ship;
    }

    /**
     *
     * @return true if this space has been pressed
     */
    public boolean isPressed() {
        return pressed;
    }

    /**
     *
     * @param pressed
     */
    public void setPressed(boolean pressed) {
        this.pressed = pressed;
    }

    /**
     *
     * @return the Ship occupying this space
     */
    public Ship getShip() {
        return ship;
    }

    /**
     *
     * @param ship the Ship to place in this space
     */
    public void setShip(Ship ship) {
        this.ship = ship;
    }
    
    
}
