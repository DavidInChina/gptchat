package io.sentry.config;

import Ad.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes2.dex */
public abstract class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final String f34314a;

    /* renamed from: b  reason: collision with root package name */
    public final Properties f34315b;

    public a(String str, Properties properties) {
        this.f34314a = str;
        l.Z0("properties are required", properties);
        this.f34315b = properties;
    }

    @Override // io.sentry.config.d
    public final String a(String str) {
        return io.sentry.util.e.b(this.f34315b.getProperty(R.a.t(new StringBuilder(), this.f34314a, str)));
    }

    @Override // io.sentry.config.d
    public final Map b() {
        String t10 = R.a.t(new StringBuilder(), this.f34314a, "tags.");
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f34315b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str = (String) entry.getKey();
                if (str.startsWith(t10)) {
                    hashMap.put(str.substring(t10.length()), io.sentry.util.e.b((String) entry.getValue()));
                }
            }
        }
        return hashMap;
    }
}
