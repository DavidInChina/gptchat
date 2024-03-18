package Wh;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: a  reason: collision with root package name */
    public z f21117a;

    /* renamed from: b  reason: collision with root package name */
    public x f21118b;

    /* renamed from: d  reason: collision with root package name */
    public String f21120d;

    /* renamed from: e  reason: collision with root package name */
    public o f21121e;

    /* renamed from: g  reason: collision with root package name */
    public F f21123g;

    /* renamed from: h  reason: collision with root package name */
    public D f21124h;

    /* renamed from: i  reason: collision with root package name */
    public D f21125i;

    /* renamed from: j  reason: collision with root package name */
    public D f21126j;

    /* renamed from: k  reason: collision with root package name */
    public long f21127k;

    /* renamed from: l  reason: collision with root package name */
    public long f21128l;

    /* renamed from: m  reason: collision with root package name */
    public ai.e f21129m;

    /* renamed from: c  reason: collision with root package name */
    public int f21119c = -1;

    /* renamed from: f  reason: collision with root package name */
    public p f21122f = new p();

    public static void b(String str, D d10) {
        if (d10 != null) {
            if (d10.f21136l0 == null) {
                if (d10.f21137m0 == null) {
                    if (d10.f21138n0 == null) {
                        if (d10.f21139o0 != null) {
                            throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
                        }
                        return;
                    }
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
                }
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            throw new IllegalArgumentException(str.concat(".body != null").toString());
        }
    }

    public final D a() {
        int i10 = this.f21119c;
        if (i10 >= 0) {
            z zVar = this.f21117a;
            if (zVar != null) {
                x xVar = this.f21118b;
                if (xVar != null) {
                    String str = this.f21120d;
                    if (str != null) {
                        return new D(zVar, xVar, str, i10, this.f21121e, this.f21122f.e(), this.f21123g, this.f21124h, this.f21125i, this.f21126j, this.f21127k, this.f21128l, this.f21129m);
                    }
                    throw new IllegalStateException("message == null".toString());
                }
                throw new IllegalStateException("protocol == null".toString());
            }
            throw new IllegalStateException("request == null".toString());
        }
        throw new IllegalStateException(("code < 0: " + this.f21119c).toString());
    }

    public final void c(q qVar) {
        this.f21122f = qVar.I();
    }

    public final void d(z zVar) {
        AbstractC3557B.c0("request", zVar);
        this.f21117a = zVar;
    }
}
