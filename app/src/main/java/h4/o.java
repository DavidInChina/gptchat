package h4;

import Wh.F;
import java.io.Closeable;
import ji.AbstractC4137l;
import ji.AbstractC4141p;
import ji.C4113B;
import ji.C4116E;

/* loaded from: classes.dex */
public final class o extends F {

    /* renamed from: Y  reason: collision with root package name */
    public final C4113B f31896Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC4141p f31897Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f31898h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Closeable f31899i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f31900j0;

    /* renamed from: k0  reason: collision with root package name */
    public C4116E f31901k0;

    public o(C4113B c4113b, AbstractC4141p abstractC4141p, String str, Closeable closeable) {
        this.f31896Y = c4113b;
        this.f31897Z = abstractC4141p;
        this.f31898h0 = str;
        this.f31899i0 = closeable;
    }

    @Override // Wh.F, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f31900j0 = true;
            C4116E c4116e = this.f31901k0;
            if (c4116e != null) {
                u4.e.a(c4116e);
            }
            Closeable closeable = this.f31899i0;
            if (closeable != null) {
                u4.e.a(closeable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // Wh.F
    public final r.f h() {
        return null;
    }

    @Override // Wh.F
    public final synchronized AbstractC4137l i() {
        if (!this.f31900j0) {
            C4116E c4116e = this.f31901k0;
            if (c4116e != null) {
                return c4116e;
            }
            C4116E J10 = R4.b.J(this.f31897Z.l(this.f31896Y));
            this.f31901k0 = J10;
            return J10;
        }
        throw new IllegalStateException("closed".toString());
    }
}
