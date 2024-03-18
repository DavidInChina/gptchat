package Wh;

import id.AbstractC3557B;
import java.io.Closeable;
import java.io.EOFException;
import jh.L1;
import ji.C4116E;
import ji.C4135j;

/* loaded from: classes2.dex */
public final class D implements Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final z f21130Y;

    /* renamed from: Z  reason: collision with root package name */
    public final x f21131Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f21132h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f21133i0;

    /* renamed from: j0  reason: collision with root package name */
    public final o f21134j0;

    /* renamed from: k0  reason: collision with root package name */
    public final q f21135k0;

    /* renamed from: l0  reason: collision with root package name */
    public final F f21136l0;

    /* renamed from: m0  reason: collision with root package name */
    public final D f21137m0;

    /* renamed from: n0  reason: collision with root package name */
    public final D f21138n0;

    /* renamed from: o0  reason: collision with root package name */
    public final D f21139o0;

    /* renamed from: p0  reason: collision with root package name */
    public final long f21140p0;

    /* renamed from: q0  reason: collision with root package name */
    public final long f21141q0;

    /* renamed from: r0  reason: collision with root package name */
    public final ai.e f21142r0;

    /* renamed from: s0  reason: collision with root package name */
    public C1658c f21143s0;

    public D(z zVar, x xVar, String str, int i10, o oVar, q qVar, F f6, D d10, D d11, D d12, long j6, long j10, ai.e eVar) {
        this.f21130Y = zVar;
        this.f21131Z = xVar;
        this.f21132h0 = str;
        this.f21133i0 = i10;
        this.f21134j0 = oVar;
        this.f21135k0 = qVar;
        this.f21136l0 = f6;
        this.f21137m0 = d10;
        this.f21138n0 = d11;
        this.f21139o0 = d12;
        this.f21140p0 = j6;
        this.f21141q0 = j10;
        this.f21142r0 = eVar;
    }

    public static String h(D d10, String str) {
        d10.getClass();
        String r10 = d10.f21135k0.r(str);
        if (r10 == null) {
            return null;
        }
        return r10;
    }

    public final C1658c a() {
        C1658c c1658c = this.f21143s0;
        if (c1658c == null) {
            C1658c c1658c2 = C1658c.f21170n;
            C1658c o10 = L1.o(this.f21135k0);
            this.f21143s0 = o10;
            return o10;
        }
        return c1658c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        F f6 = this.f21136l0;
        if (f6 != null) {
            f6.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Wh.C] */
    public final C i() {
        ?? obj = new Object();
        obj.f21117a = this.f21130Y;
        obj.f21118b = this.f21131Z;
        obj.f21119c = this.f21133i0;
        obj.f21120d = this.f21132h0;
        obj.f21121e = this.f21134j0;
        obj.f21122f = this.f21135k0.I();
        obj.f21123g = this.f21136l0;
        obj.f21124h = this.f21137m0;
        obj.f21125i = this.f21138n0;
        obj.f21126j = this.f21139o0;
        obj.f21127k = this.f21140p0;
        obj.f21128l = this.f21141q0;
        obj.f21129m = this.f21142r0;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ji.j] */
    public final E j() {
        F f6 = this.f21136l0;
        AbstractC3557B.Z(f6);
        C4116E peek = ((E) f6).f21146h0.peek();
        ?? obj = new Object();
        peek.o0(33554432L);
        long min = Math.min(33554432L, peek.f36672Z.f36721Z);
        while (min > 0) {
            long g02 = peek.g0(obj, min);
            if (g02 != -1) {
                min -= g02;
            } else {
                throw new EOFException();
            }
        }
        return new E(obj.f36721Z, f6.a(), (C4135j) obj);
    }

    public final String toString() {
        return "Response{protocol=" + this.f21131Z + ", code=" + this.f21133i0 + ", message=" + this.f21132h0 + ", url=" + this.f21130Y.f21336a + '}';
    }
}
