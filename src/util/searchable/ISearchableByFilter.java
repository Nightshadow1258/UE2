/* 
 * Name: Paul Reisch
 * Matrikelnummer: 1529144
 */

package util.searchable;

import java.util.Collection;

public interface ISearchableByFilter<T> {

	Collection<T> searchByFilter(ISearchFilter filter, Object compareObject);
	
	
}
