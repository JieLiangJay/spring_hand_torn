package com.spring.springframework.beans.factory;

/**
 * @ClassName: PropertyValue
 * @Description: 属性值
 * @Author: jay
 **/
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

}