package ste.commons.javafx.property;

import javafx.beans.property.SimpleObjectProperty;

public class IntegerProperty extends SimpleObjectProperty<Integer> {
    public IntegerProperty() {
        this(null);
    }

    public IntegerProperty(Integer initialValue) {
        super(initialValue);
    }

    public IntegerProperty(Object bean, String name) {
        this(bean, name, null);
    }

    public IntegerProperty(Object bean, String name, Integer initialValue) {
        super(bean, name, initialValue);
    }
}
