/* 
 * Name: Paul Reisch
 * Matrikelnummer: 1529144
 */

package container;
import container.IContainerElement;

public class ContainerElement<E> extends Object implements IContainerElement<E>{

	//Attribute:
	private E data = null;
	private IContainerElement<E> nextElement = null;
	
	
	//Konstruktoren:
	public ContainerElement(E data){
		this.data = data;
	}
	
	public ContainerElement(E data, IContainerElement<E> next){
		this.data = data;
		this.nextElement = next;
	}

	//Methoden:	
	public E getData(){
		return this.data;
	}

	public void setNextElement(IContainerElement<E> next){
		this.nextElement = next;
	}

	public boolean hasNextElement(){
		if(this.nextElement == null)
			return false;
		
		return true;
	}

	public IContainerElement<E> getNextElement(){
		return this.nextElement;
	}

}
