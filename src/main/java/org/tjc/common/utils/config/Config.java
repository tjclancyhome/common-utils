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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 *
 * @author tjclancy
 */
public class Config {

    private static final String PRINT_OUTPUT_FORMAT = "%s: %s\n";
    private final Properties properties;

    /**
     * Defaut constructor creates an empty properties object.
     *
     */
    protected Config() {
        properties = new Properties();
    }

    /**
     *
     * @param url
     *
     * @throws IOException
     */
    protected Config(URL url) throws IOException {
        this();
        loadFromUrl(url);
    }

    /**
     *
     * @param properties
     */
    protected Config(Properties properties) {
        this();
        this.properties.putAll(properties);
    }

    /**
     * Factory method for creating new instances of Config.
     *
     * @return A new Config instance.
     */
    public static Config newInstance() {
        return new Config();
    }

    /**
     * Factory method for creating new instances of Config given the URL of a properties file.
     *
     * @param url
     *
     * @return A new Config instance initialized with a properties file at a URL.
     *
     * @throws IOException
     */
    public static Config newInstance(URL url) throws IOException {
        return new Config(url);
    }

    /**
     *
     * @param props
     *
     * @return
     *
     * @throws IOException
     */
    public static Config newInstance(Properties props) throws IOException {
        return new Config(props);
    }

    /**
     * Loads and updates the internal properties collection from a given URL.
     *
     * @param url
     *
     * @throws IOException
     */
    public synchronized void load(URL url) throws IOException {
        this.loadFromUrl(url);
    }

    /**
     * Loads and updates the internal properties collection from an InputStream.
     *
     * @param in
     *
     * @throws IOException
     */
    public synchronized void load(InputStream in) throws IOException {
        loadFromInputStream(in);
    }

    /**
     * Loads and updates the internal properties collection from a Properties instance.
     *
     * @param props
     *
     * @throws IOException
     */
    public synchronized void load(Properties props) throws IOException {
        this.properties.putAll(props);
    }

    /**
     * Returns a property for a given key or null if the key does not exist.
     *
     * @param key
     *
     * @return
     */
    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    /**
     * Returns a property with the given key or if the key does not exist returns defaultValue.
     *
     * @param key
     * @param defaultValue
     *
     * @return
     */
    public String getProperty(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }

    /**
     * Adds or updates a property value for the specified key.
     *
     * @param key
     * @param value
     *
     * @return
     */
    public synchronized Object putProperty(String key, Object value) {
        return properties.put(key, value);
    }

    /**
     * Removes property given a valid key or null if the key is invalid.
     *
     * @param key
     *
     * @throws NullPointerException is the key is null.
     *
     * @return
     */
    public synchronized Object removeProperty(String key) {
        return properties.remove(key);
    }

    /**
     * Stores the contents of the managed properties file as a properties structure to an
     * OutputStream.
     *
     * @param out
     * @param comments
     *
     * @throws IOException
     */
    public void store(OutputStream out, String comments) throws IOException {
        properties.store(out, comments);
    }

    /**
     * Stores the contents of the managed properties file as XML to an OutputStream.
     *
     * @param os
     * @param comment
     *
     * @throws IOException
     */
    public void storeToXML(OutputStream os, String comment) throws IOException {
        properties.storeToXML(os, comment);
    }

    public Set<String> stringPropertyNames() {
        return properties.stringPropertyNames();
    }

    public synchronized Object put(Object key, Object value) {
        return properties.put(key, value);
    }

    public synchronized void putAll(Map<?, ?> t) {
        properties.putAll(t);
    }

    public synchronized void replaceAll(BiFunction<? super Object, ? super Object, ?> function) {
        properties.replaceAll(function);
    }

    public synchronized Object remove(Object key) {
        return properties.remove(key);
    }

    public synchronized boolean remove(Object key, Object value) {
        return properties.remove(key, value);
    }

    public int size() {
        return properties.size();
    }

    public boolean isEmpty() {
        return properties.isEmpty();
    }

    public boolean containsValue(Object value) {
        return properties.containsValue(value);
    }

    public boolean containsKey(Object key) {
        return properties.containsKey(key);
    }

    public synchronized void forEach(BiConsumer<? super Object, ? super Object> action) {
        properties.forEach(action);
    }

    public void print() {
        print(System.out);
    }

    public void print(PrintStream out) {
        properties.forEach((k, v) -> out.format(PRINT_OUTPUT_FORMAT, k, v));
    }

    public void print(PrintWriter out) {
        properties.forEach((k, v) -> out.format(PRINT_OUTPUT_FORMAT, k, v));
        out.flush();
    }

    private void loadFromUrl(URL url) throws IOException {
        try( InputStream in = url.openStream()) {
            loadFromInputStream(in);
        }
    }

    private void loadFromInputStream(InputStream in) throws IOException {
        properties.load(in);
    }
}
