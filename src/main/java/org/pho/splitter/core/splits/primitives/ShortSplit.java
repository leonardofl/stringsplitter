package org.pho.splitter.core.splits.primitives;

import org.pho.splitter.core.exception.SplitterException;
import org.pho.splitter.core.splits.AbstractSplitter;

/**
 * Converts a String split into a <strong>Short</strong>.
 *
 * @author Paulo Henrique Ortolan
 */
public final class ShortSplit extends AbstractSplitter<Short> {

    private String[] specialCharacters;

    private ShortSplit(int start, int end, String... specialCharacters) {
        super(start, end, specialCharacters);
    }

    /**
     * Adds a String conversion into a Short.
     *
     * @param start             start where the split starts
     * @param end               end end where the split ends
     * @param specialCharacters special characters to be removed
     * @return an instance of ShortSplit
     */
    public static ShortSplit newShortSplit(int start, int end, String... specialCharacters) {
        return new ShortSplit(start, end, specialCharacters);
    }

    /**
     * Adds a String conversion into a Long.
     *
     * @param start             start where the split starts
     * @param specialCharacters special characters to be removed
     * @return an instance of ShortSplit
     */
    public static ShortSplit newShortSplit(int start, String... specialCharacters) {
        return new ShortSplit(start, END_OF_LINE, specialCharacters);
    }

    /**
     * Splits the String source into a short.
     *
     * @param source the String source
     * @return a Short converted from a String
     * @throws SplitterException when the conversion goes wrong
     */
    @Override
    public Short split(String source) throws SplitterException {
        String result = removeSpecialCharactersAndSplit(source);

        try {
            return Short.valueOf(result.trim());
        } catch (Exception e) {
            throw new SplitterException(e.getMessage(), e);
        }
    }

}
