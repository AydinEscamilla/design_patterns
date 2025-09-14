/**
 * Author: Aydin Escamilla
 * CSCE247
 */
package state;

import java.util.Random;

/**
 * {@code State} is the abstract base class for package states
 * 
 * Subclasses will go on to define status and ETA for different states throughout delivery
 */
public abstract class State {
    protected Package pkg;
    protected Random random;

    /**
     * Constructs a new state bound to the package
     * 
     * @param pkg is the package this state is representing
     */
    public State(Package pkg) {
        this.pkg = pkg;
        this.random = new Random();
    }

    /**
     * Returns a description of the package's status
     * 
     * @return is the status message
     */
    public abstract String getStatus();

    /**
     * Returns the estimated time of arrival for the package
     * 
     * @return is the ETA
     */
    public abstract String getETA();
}
