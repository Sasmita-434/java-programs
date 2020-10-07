// Identify State & Behaviour.
// Find where the state is used.
// Does behavour depends on the state? -> No.

package org.activity.classandobjects;

public class Calculator {

    private int i;
    private int j;

    public Calculator(int i, int j)
    {
        this.i = i;  // State
        this.j = j;  // State
    }

    public int sum()  // Behaviour
    {
        return i + j;
    }
}
