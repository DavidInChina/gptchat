package io.sentry.internal.modules;

import io.sentry.EnumC3642e1;
import io.sentry.H;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public abstract class d implements a {

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f34397c = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final H f34398a;

    /* renamed from: b  reason: collision with root package name */
    public Map f34399b = null;

    public d(H h10) {
        this.f34398a = h10;
    }

    @Override // io.sentry.internal.modules.a
    public final Map a() {
        Map map = this.f34399b;
        if (map != null) {
            return map;
        }
        Map b10 = b();
        this.f34399b = b10;
        return b10;
    }

    public abstract Map b();

    public final TreeMap c(InputStream inputStream) {
        H h10 = this.f34398a;
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f34397c));
            try {
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    int lastIndexOf = readLine.lastIndexOf(58);
                    treeMap.put(readLine.substring(0, lastIndexOf), readLine.substring(lastIndexOf + 1));
                }
                h10.f(EnumC3642e1.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            h10.d(EnumC3642e1.ERROR, "Error extracting modules.", e10);
        } catch (RuntimeException e11) {
            h10.b(EnumC3642e1.ERROR, e11, "%s file is malformed.", "sentry-external-modules.txt");
        }
        return treeMap;
    }
}
