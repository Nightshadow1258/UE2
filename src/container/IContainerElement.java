/* 
 * Name: Paul Reisch
 * Matrikelnummer: 1529144
 */

package container;

public interface IContainerElement<E> {

	void setNextElement(IContainerElement<E> next);

	boolean hasNextElement();

	IContainerElement<E> getNextElement();

	E getData();
}
