package io.sentry.config;

import android.gov.nist.core.Separators;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c implements d {
    public static String c(String str) {
        return "SENTRY_" + str.replace(Separators.DOT, "_").replace("-", "_").toUpperCase(Locale.ROOT);
    }

    @Override // io.sentry.config.d
    public final String a(String str) {
        return io.sentry.util.e.b(System.getenv(c(str)));
    }

    @Override // io.sentry.config.d
    public final Map b() {
        String b10;
        String str = c("tags") + "_";
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(str) && (b10 = io.sentry.util.e.b(entry.getValue())) != null) {
                concurrentHashMap.put(key.substring(str.length()).toLowerCase(Locale.ROOT), b10);
            }
        }
        return concurrentHashMap;
    }
}
