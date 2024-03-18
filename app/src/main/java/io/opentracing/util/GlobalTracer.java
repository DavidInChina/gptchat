package io.opentracing.util;

import C6.e;
import ff.AbstractC3029a;
import ff.c;
import ff.f;
import g6.C3201a;
import gf.C3269j;
import hf.C3421a;
import o2.d;

/* loaded from: classes.dex */
public final class GlobalTracer implements f {

    /* renamed from: Y  reason: collision with root package name */
    public static final GlobalTracer f33707Y = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public static volatile f f33708Z = C3269j.f31618Y;

    /* renamed from: h0  reason: collision with root package name */
    public static volatile boolean f33709h0 = false;

    public static synchronized void a(e eVar) {
        synchronized (GlobalTracer.class) {
            h(new d(2, eVar));
        }
    }

    public static synchronized boolean h(d dVar) {
        synchronized (GlobalTracer.class) {
            if (!isRegistered()) {
                try {
                    try {
                        Object call = dVar.call();
                        if (call != null) {
                            f fVar = (f) call;
                            if (!(fVar instanceof GlobalTracer)) {
                                f33708Z = fVar;
                                f33709h0 = true;
                                return true;
                            }
                        } else {
                            throw new NullPointerException("Cannot register GlobalTracer <null>.");
                        }
                    } catch (RuntimeException e10) {
                        throw e10;
                    }
                } catch (Exception e11) {
                    throw new IllegalStateException("Exception obtaining tracer from provider: " + e11.getMessage(), e11);
                }
            }
            return false;
        }
    }

    public static boolean isRegistered() {
        return f33709h0;
    }

    @Override // ff.f
    public final void B(ff.d dVar, C3201a c3201a) {
        f33708Z.B(dVar, c3201a);
    }

    @Override // ff.f
    public final ff.e E(String str) {
        return f33708Z.E(str);
    }

    @Override // ff.f
    public final AbstractC3029a J(c cVar) {
        return f33708Z.J(cVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f33708Z.close();
    }

    @Override // ff.f
    public final ff.d k0(C3421a c3421a) {
        return f33708Z.k0(c3421a);
    }

    public final String toString() {
        return "GlobalTracer{" + f33708Z + '}';
    }
}
