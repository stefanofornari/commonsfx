package ste.commons.javafx.property;

import ste.commons.javafx.property.IntegerProperty;
import static org.assertj.core.api.BDDAssertions.then;
import org.junit.jupiter.api.Test;

public class IntegerPropertyTest {

    @Test
    public void initial_value_is_null() {
        IntegerProperty p = new IntegerProperty();
        then(p.getValue()).isNull();
    }

    @Test
    public void initial_value_support() {
        IntegerProperty p = new IntegerProperty(10);
        then(p.getValue()).isEqualTo(10);
    }

    @Test
    public void supports_null_initial_value() {
        IntegerProperty p = new IntegerProperty(null);
        then(p.getValue()).isNull();
    }

    @Test
    public void supports_setting_to_null() {
        IntegerProperty p = new IntegerProperty(10);
        p.setValue(null);
        then(p.getValue()).isNull();
    }

    @Test
    public void bean_and_name_support() {
        Object bean = new Object();
        IntegerProperty p = new IntegerProperty(bean, "testProperty", 42);
        then(p.getBean()).isSameAs(bean);
        then(p.getName()).isEqualTo("testProperty");
        then(p.getValue()).isEqualTo(42);
    }

    @Test
    public void bean_and_name_support_with_null_value() {
        Object bean = new Object();
        IntegerProperty p = new IntegerProperty(bean, "testProperty");
        then(p.getBean()).isSameAs(bean);
        then(p.getName()).isEqualTo("testProperty");
        then(p.getValue()).isNull();
    }
}
