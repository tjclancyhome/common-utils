/*
 * The MIT License
 *
 * Copyright 2019 tjclancy.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.tjc.common.utils.config;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;

/**
 *
 * @author tjclancy
 */
public class ConfigImpl implements Config {
    private static final String PRINT_OUTPUT_FORMAT = "%s: %s\n";
    private final ConcurrentMap<String, Object> configMap;

    /**
     * Defaut constructor creates an empty properties object.
     *
     */
    protected ConfigImpl() {
        configMap = new ConcurrentHashMap<>();
    }

    /**
     * Factory method for creating new instances of ConfigImpl.
     *
     * @return A new ConfigImpl instance.
     */
    static ConfigImpl newInstance() {
        return new ConfigImpl();
    }

    @Override
    public boolean containsProperty(String propertyName) {
        return configMap.containsKey(propertyName);
    }

    @Override
    public Double getDoubleProperty(String propertyName) {
        if (configMap.containsKey(propertyName)) {
            Object value = configMap.get(propertyName);
            return Double.valueOf(value.toString());
        }
        return null;
    }

    @Override
    public Double getDoubleProperty(String propertyName, double defaultValue) {
        Double value = getDoubleProperty(propertyName);
        if (value != null) {
            return value;
        } else {
            return defaultValue;
        }
    }

    @Override
    public Float getFloatProperty(String propertyName) {
        if (configMap.containsKey(propertyName)) {
            Object value = configMap.get(propertyName);
            return Float.valueOf(value.toString());
        }
        return null;
    }

    @Override
    public Float getFloatProperty(String propertyName, float defaultValue) {
        Float value = getFloatProperty(propertyName);
        if (value != null) {
            return value;
        } else {
            return defaultValue;
        }
    }

    @Override
    public Integer getIntProperty(String propertyName) {
        if (configMap.containsKey(propertyName)) {
            Object value = configMap.get(propertyName);
            return Integer.valueOf(value.toString());
        }
        return null;
    }

    @Override
    public Integer getIntProperty(String propertyName, int defaultValue) {
        Integer value = getIntProperty(propertyName);
        if (value != null) {
            return value;
        } else {
            return defaultValue;
        }
    }

    @Override
    public String getStringProperty(String propertyName) {
        if (configMap.containsKey(propertyName)) {
            Object value = configMap.get(propertyName);
            return String.valueOf(value);
        }
        return null;

    }

    @Override
    public String getStringProperty(String propertyName, String defaultValue) {
        String value = getStringProperty(propertyName);
        if (value != null) {
            return value;
        } else {
            return defaultValue;
        }
    }

    @Override
    public Object getProperty(String propertyName) {
        return configMap.get(propertyName);
    }

    @Override
    public Object getProperty(String propertyName, Object defaultValue) {
        if (configMap.containsKey(propertyName)) {
            return configMap.get(propertyName);
        } else {
            return defaultValue;
        }
    }

    @Override
    public Set<String> getPropertyNames() {
        return Collections.unmodifiableSet(configMap.keySet());
    }


    public void load(final ConfigLoader loader) throws Exception {
        loader.loadConfiguration(this);
    }

    @Override
    public Object putProperty(String propertyName, Object value) {
        return configMap.put(propertyName, value);
    }

    @Override
    public Object removeProperty(String propertyName) {
        return configMap.remove(propertyName);
    }

    @Override
    public int size() {
        return configMap.size();
    }

    @Override
    public boolean isEmpty() {
        return configMap.isEmpty();
    }

    @Override
    public void forEach(BiConsumer<? super Object, ? super Object> action) {
        configMap.forEach(action);
    }

}
