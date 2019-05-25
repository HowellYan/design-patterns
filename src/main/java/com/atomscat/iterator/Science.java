package com.atomscat.iterator;

import java.util.LinkedList;

/**
 * 理科
 */
public class Science implements ISubject {
    private LinkedList<String> subjects;

    public Science() {
        subjects = new LinkedList<String>();
        subjects.addLast("Maths");
        subjects.addLast("Comp. Sc.");
        subjects.addLast("Physics");
    }

    public IIterator CreateIterator() {
        return new ScienceIterator(subjects);
    }
}
