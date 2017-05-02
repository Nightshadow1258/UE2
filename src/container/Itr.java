/* 
 * Name: Paul Reisch
 * Matrikelnummer: 1529144
 */

package container;

import java.util.Iterator;

public class Itr<E> extends Object implements Iterator<E>{

	private IContainerElement<E> next;
	
	//Konstruktor:
	public Itr(IContainerElement<E> firstElement){
		this.next = firstElement;
	}

	//Methoden:
	public E next(){
			return (E) next.getNextElement().getData();
	}

	public boolean hasNext(){
		if(this.next.hasNextElement())
		return true;
		
		return false;
	}
	
	public void remove(){
		throw new UnsupportedOperationException();
	}

	
}
