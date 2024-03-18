package io.sentry;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Map;

/* loaded from: classes.dex */
public interface Q {
    void b(T0 t02, OutputStream outputStream);

    Object e(Reader reader, Class cls);

    T0 h(BufferedInputStream bufferedInputStream);

    String j(Map map);

    Object k(BufferedReader bufferedReader, Class cls, C3637d c3637d);

    void n(Object obj, BufferedWriter bufferedWriter);
}
