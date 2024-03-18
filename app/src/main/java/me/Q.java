package me;

import id.AbstractC3557B;
import le.C4435b;
import te.C5761e;

/* loaded from: classes2.dex */
public abstract class Q {

    /* renamed from: a  reason: collision with root package name */
    public static final Ei.a f39187a = Ad.l.o("io.ktor.client.plugins.HttpTimeout");

    public static final C4435b a(C5761e c5761e, Throwable th2) {
        Object obj;
        AbstractC3557B.c0("request", c5761e);
        StringBuilder sb2 = new StringBuilder("Socket timeout has expired [url=");
        sb2.append(c5761e.f46131a);
        sb2.append(", socket_timeout=");
        O o10 = P.f39182d;
        M m10 = (M) c5761e.a();
        if (m10 == null || (obj = m10.f39177c) == null) {
            obj = "unknown";
        }
        sb2.append(obj);
        sb2.append("] ms");
        return new C4435b(sb2.toString(), th2);
    }
}
