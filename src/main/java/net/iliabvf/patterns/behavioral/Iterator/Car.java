/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.Iterator;

public class Car implements Collection {
    private String name;
    private String[] features;

    public Car(String name, String[] features) {
        this.name = name;
        this.features = features;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getFeatures() {
        return features;
    }

    public void setFeatures(String[] features) {
        this.features = features;
    }

    @Override
    public Iterator getIterator() {
        return new FeaturesIterator();
    }

    private class FeaturesIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            return (index < features.length);
        }

        @Override
        public Object next() {
            return features[index++];
        }
    }
}
