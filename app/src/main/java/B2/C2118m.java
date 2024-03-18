package b2;

import M1.AbstractC0931l;
import M1.q;
import androidx.glance.appwidget.protobuf.AbstractC2055o;
import androidx.glance.appwidget.protobuf.C;
import androidx.glance.appwidget.protobuf.C2054n;
import id.AbstractC3557B;
import java.io.IOException;
import java.util.logging.Logger;

/* renamed from: b2.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2118m implements AbstractC0931l {

    /* renamed from: a  reason: collision with root package name */
    public static final C2118m f25613a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C2110e f25614b;

    /* JADX WARN: Type inference failed for: r0v0, types: [b2.m, java.lang.Object] */
    static {
        C2110e q10 = C2110e.q();
        AbstractC3557B.b0("getDefaultInstance()", q10);
        f25614b = q10;
    }

    @Override // M1.AbstractC0931l
    public final Object f() {
        return f25614b;
    }

    @Override // M1.AbstractC0931l
    public final Object g(io.sentry.instrumentation.file.d dVar) {
        try {
            return C2110e.t(dVar);
        } catch (C e10) {
            throw new IOException("Cannot read proto.", e10);
        }
    }

    @Override // M1.AbstractC0931l
    public final void h(Object obj, q qVar) {
        C2110e c2110e = (C2110e) obj;
        c2110e.getClass();
        int a5 = c2110e.a(null);
        Logger logger = AbstractC2055o.f25260i;
        if (a5 > 4096) {
            a5 = 4096;
        }
        C2054n c2054n = new C2054n(qVar, a5);
        c2110e.m(c2054n);
        if (c2054n.f25257m > 0) {
            c2054n.N2();
        }
    }
}
