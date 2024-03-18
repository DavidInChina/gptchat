package io.sentry.config;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final List f34316a;

    public b(ArrayList arrayList) {
        this.f34316a = arrayList;
    }

    @Override // io.sentry.config.d
    public final String a(String str) {
        for (d dVar : this.f34316a) {
            String a5 = dVar.a(str);
            if (a5 != null) {
                return a5;
            }
        }
        return null;
    }

    @Override // io.sentry.config.d
    public final Map b() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (d dVar : this.f34316a) {
            concurrentHashMap.putAll(dVar.b());
        }
        return concurrentHashMap;
    }

    public final Boolean c(String str) {
        String a5 = a(str);
        if (a5 != null) {
            return Boolean.valueOf(a5);
        }
        return null;
    }

    public final String d() {
        String a5 = a("proxy.port");
        if (a5 == null) {
            return "80";
        }
        return a5;
    }
}
