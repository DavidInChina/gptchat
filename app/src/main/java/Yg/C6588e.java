package yg;

import id.AbstractC3557B;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: yg.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6588e {
    public static InputStream a(String str) {
        AbstractC3557B.c0("path", str);
        ClassLoader classLoader = C6588e.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection openConnection = resource.openConnection();
        openConnection.setUseCaches(false);
        return openConnection.getInputStream();
    }
}
