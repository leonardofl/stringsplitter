package org.pho.splitter.core.splits;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringArraySplit {

    private List<StringSplit> splitters;

    public StringArraySplit() {
        splitters = new ArrayList<>();
    }

    public void addSplit(StringSplit stringSplit) {
        splitters.add(stringSplit);
    }

    public List<StringSplit> getSplitters() {
        return splitters;
    }

    public List<String> split(String source) {
        return splitters
            .stream()
            .map(s -> s.split(source))
            .collect(Collectors.toList());
    }

}