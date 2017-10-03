/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9dan12;

/**
 *
 * @author C I C I L I A
 */
public abstract class LinearList {
    
    int modCount;
    public abstract int size();
    public abstract void add(int index, Object obj);
    @Override
    public abstract String toString();
    protected abstract void removeRange(int fromIndex, int toIndex);
    protected abstract Object clone(Object [] a);
}
