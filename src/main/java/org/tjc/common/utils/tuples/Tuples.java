/*
 * The MIT License
 *
 * Copyright 2020 tjclancy.
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
package org.tjc.common.utils.tuples;

import java.util.Objects;

/**
 *
 * @author tjclancy
 */
public class Tuples {

    public static <A, B> Tuple2<A, B> newInstance(A a, B b) {
        return new Tuple2Impl<>(a, b);
    }

    public static <A, B, C> Tuple3<A, B, C> newInstance(A a, B b, C c) {
        return new Tuple3Impl<>(a, b, c);
    }

    public static <A, B, C, D> Tuple4<A, B, C, D> newInstance(A a, B b, C c, D d) {
        return new Tuple4Impl<>(a, b, c, d);
    }

    static class Tuple2Impl<A, B> implements Tuple2<A, B> {
        private final A a;
        private final B b;

        public Tuple2Impl(A a, B b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public A get_a() {
            return a;
        }

        @Override
        public B get_b() {
            return b;
        }

        @Override
        public String toString() {
            return "Tuple2Impl{" + "a=" + a + ", b=" + b + '}';
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 79 * hash + Objects.hashCode(this.a);
            hash = 79 * hash + Objects.hashCode(this.b);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Tuple2Impl<?, ?> other = (Tuple2Impl<?, ?>) obj;
            if (!Objects.equals(this.a, other.a)) {
                return false;
            }
            if (!Objects.equals(this.b, other.b)) {
                return false;
            }
            return true;
        }
    }

    static class Tuple3Impl<A, B, C> implements Tuple3<A, B, C> {
        private final A a;
        private final B b;
        private final C c;

        public Tuple3Impl(A a, B b, C c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public A get_a() {
            return a;
        }

        @Override
        public B get_b() {
            return b;
        }

        @Override
        public C get_c() {
            return c;
        }

        @Override
        public String toString() {
            return "Tuple3Impl{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 97 * hash + Objects.hashCode(this.a);
            hash = 97 * hash + Objects.hashCode(this.b);
            hash = 97 * hash + Objects.hashCode(this.c);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Tuple3Impl<?, ?, ?> other = (Tuple3Impl<?, ?, ?>) obj;
            if (!Objects.equals(this.a, other.a)) {
                return false;
            }
            if (!Objects.equals(this.b, other.b)) {
                return false;
            }
            if (!Objects.equals(this.c, other.c)) {
                return false;
            }
            return true;
        }
    }

    static class Tuple4Impl<A, B, C, D> implements Tuple4<A, B, C, D> {
        private final A a;
        private final B b;
        private final C c;
        private final D d;

        public Tuple4Impl(A a, B b, C c, D d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

        @Override
        public A get_a() {
            return a;
        }

        @Override
        public B get_b() {
            return b;
        }

        @Override
        public C get_c() {
            return c;
        }

        @Override
        public D get_d() {
            return d;
        }

        @Override
        public String toString() {
            return "Tuple4Impl{" + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + '}';
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 97 * hash + Objects.hashCode(this.a);
            hash = 97 * hash + Objects.hashCode(this.b);
            hash = 97 * hash + Objects.hashCode(this.c);
            hash = 97 * hash + Objects.hashCode(this.d);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Tuple4Impl<?, ?, ?, ?> other = (Tuple4Impl<?, ?, ?, ?>) obj;
            if (!Objects.equals(this.a, other.a)) {
                return false;
            }
            if (!Objects.equals(this.b, other.b)) {
                return false;
            }
            if (!Objects.equals(this.c, other.c)) {
                return false;
            }
            if (!Objects.equals(this.d, other.d)) {
                return false;
            }
            return true;
        }
    }

}
