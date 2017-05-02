/* 
 * Name: Paul Reisch
 * Matrikelnummer: 1529144
 */

package container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import util.searchable.ISearchFilter;
import util.searchable.ISearchableByFilter;

public class Container<E> extends Object implements Collection<E>, ISearchableByFilter<E> {

	// Attribute:
	private IContainerElement<E> firstElement;

	// Konstruktur:

	Container() {
		this.firstElement = null;
	}
	// Methoden:

	public boolean add(E e) {
		if (e == null)
			throw new NullPointerException();

		else {

			IContainerElement<E> tmp = this.firstElement;
			for (; tmp.hasNextElement(); tmp = tmp.getNextElement()) {
			}

			tmp.setNextElement(new ContainerElement<E>(e));
			return true;
		}
	}
	
	public boolean addAll(Collection<? extends E> c) {
			
		
		for (Iterator<? extends E> it = c.iterator(); it.hasNext();) {
			if(add(it.next()) ==false)
				return false;
		}
		return true;
	}
	
	public void clear() {
		this.firstElement = null;
	}
	
	public boolean contains(Object o) {
		
		IContainerElement<E> tmp = this.firstElement;
		
		for (; tmp !=null ; tmp = tmp.getNextElement()) {
			if (tmp.getData().equals(o))
				return true;
		}
		return false;
	}
	
	
	public boolean containsAll(Collection<?> c) {

		for (Iterator<?> it = c.iterator(); it.hasNext();) {
			if(contains(it) == false)
				return false;
		}
		return true;
	}
	
	public int size() {
		
		if(this.firstElement==null)
			return 0;
		
		IContainerElement<E> tmp = this.firstElement;
		int i=1;
		for (; tmp.hasNextElement() ; tmp = tmp.getNextElement()) {
		 i++;
	}
		return i;
	}
	
	
	public E get(int index) throws IndexOutOfBoundsException {

		if( size() < index )
			throw new IndexOutOfBoundsException();
			
		int i=1;
		IContainerElement<E> tmp = this.firstElement;
		
		for (; i < index ; tmp = tmp.getNextElement()) {
			i++;
		}
		return tmp.getData();
	}	
	
	
	public boolean isEmpty() {
		if(this.firstElement == null)
			return true;
		
		else
			return false;
	}
	
	public Iterator<E> iterator() {
		return new Itr<E>(firstElement); //muss getestet werden
	}

	public boolean remove(Object o) {
		
		if(contains(o) != true)
			return false;
		
		IContainerElement<E> tmp = this.firstElement;
		
		if(tmp.getData().equals(o))
		{
			this.firstElement = tmp.getNextElement();
		}
		
		while(tmp.hasNextElement()){
			
			
			if (tmp.getNextElement().equals(o)){
			tmp.setNextElement(tmp.getNextElement().getNextElement());	
			return true;
			}
			
			tmp=tmp.getNextElement();
		}
		return false;
	}

	
	
	
	
	
	
	public boolean removeAll(Collection<?> c) {
		
		int i = 0;
		
		for (Iterator<?> it = c.iterator(); it.hasNext();) {
			if(remove(it.next()) == true);
			i = 1;
		}
		
		if(i==1)
		return true;
		
		else
			return false;
	}

	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	public Object[] toArray() {
		throw new UnsupportedOperationException();
	}

	public <T> T[] toArray(T[] a) {
		throw new UnsupportedOperationException();

	}

	
	
	public String toString() {

		String s = "Container: [";
		IContainerElement<E> tmp = this.firstElement;
		
		for (; tmp.hasNextElement(); tmp = tmp.getNextElement()) {
			s = s+ ", " + tmp.getData().toString();
		}
		s = s + "]";
		
		return  s;
	}

	
	
	public Collection<E> searchByFilter(ISearchFilter filter, Object filterObject) {
		
		Collection<E> liste = new ArrayList<E>();
		
		
		//add
		
		
		return liste;
		
		
		
	}

}
