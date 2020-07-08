package adapterpattern.enumerationadapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * <ul>
 *     <li> Since we are adapting Enumeration to Iterator out Adapter Implements the Iterator interface, it has to look like
 *     and iterator.</li>
 *     <li> The Enumeration we are adapting , we are using composition to stash it to an instance variable.</li>
 * </ul>
 */
public class EnumerationIterator implements Iterator<Object> {

    private final Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
