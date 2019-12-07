/*
 * The MIT License
 *
 * Copyright 2018 tjclancy.
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
package org.tjc.common.net;

import java.net.URLDecoder;
import org.junit.jupiter.api.Test;

/**
 *
 * @author tjclancy
 */
public class UrlDecodingTest {
    @Test
    public void smokeTest() {
        String snippit = "</pre>  <p>i can see created .ear file in \"target\" directory, under name \"wi-ear\". </p>  <p>so far good. next, again per tutorial, right-click ear project node in projects window , choose run.</p>  <p>at point, however, glassfish console displays following error:</p>  <pre><code>severe: exception while deploying app java.lang.illegalargumentexception: expected find expanded directory submodule wi-ejb-1.0-snapshot.jar found jar.  if directory deployment sure expand submodules. </code></pre>  <p>by clicking on \"we-ear.ear\" file within netbeans, can see in fact contain \"wi-ejb-1.0-snapshot.jar\", opposed expanded directory. how can resolve problem? </p>     </div> <p> <div class=\"post-text\" itemprop=\"text\">  <p>had change ear's pom.xml include modules section below - note \"unpack\" command. </p>  <pre><code>  <plugin>     <groupid>org.apache.maven.plugins</groupid>     <artifactid>maven-ear-plugin</artifactid>     <version>2.3.2</version>     <configuration>         <version>5</version>              <modules>                     <webmodule>                         <groupid>com.mycompany</groupid>                         <artifactid>wi-ent-web</artifactid>                         <unpack>true</unpack>                         <!--<contextroot></contextroot>-->                     </webmodule>                     <ejbmodule>                         <groupid>com.mycompany</groupid>                         <artifactid>wi-ejb</artifactid>                         <unpack>true</unpack>                     </ejbmodule>                </modules>     </configuration>   </plugin> </plugins> </code></pre>  <p><em>also</em></p>  <p>under dependencies section, make sure declare types - in case problem there wasn't \"ejb\" type specified.</p>  <pre><code>  <dependencies>      <dependency>       <groupid>com.mycompany</groupid>       <artifactid>wi-ent-web</artifactid>       <version>1.0-snapshot</version>       <type>war</type>     </dependency>      <dependency>       <groupid>com.mycompany</groupid>       <artifactid>wi-ejb</artifactid>       <version>1.0-snapshot</version>       <type>ejb</type>     </dependency>    </dependencies> </code></pre>";
        String decoded = URLDecoder.decode(snippit);
        System.out.println(decoded);
    }
}
