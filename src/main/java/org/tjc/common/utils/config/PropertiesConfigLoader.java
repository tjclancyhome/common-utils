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
import java.net.URL;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

/**
 *
 * @author tjclancy
 */
public class PropertiesConfigLoader implements ConfigLoader {
    private Properties props;

    public PropertiesConfigLoader(Properties props) {
        Objects.requireNonNull(props, () -> "The 'props' argument is null.");
        this.props = props;
    }

    public PropertiesConfigLoader(final InputStream in) throws IOException {
        Objects.requireNonNull(in, () -> "The 'in' argument is null.");
        loadProperties(in);
    }

    public PropertiesConfigLoader(final URL url) throws IOException {
        Objects.requireNonNull(url, () -> "The 'in' argument is null.");
        loadProperties(url);
    }

    @Override
    public void loadConfiguration(Config config) throws IOException {
        props.entrySet().forEach((Map.Entry entry) -> config.putProperty(entry.getKey().toString(), entry
                .getValue()));
    }

    private void loadProperties(final InputStream in) throws IOException {
        this.props = new Properties();
        this.props.load(in);
    }

    private void loadProperties(URL url) throws IOException {
        this.props = new Properties();
        try( InputStream in = url.openStream()) {
            loadProperties(in);
        }
    }

}
