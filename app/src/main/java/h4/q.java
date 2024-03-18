package h4;

import Wh.F;
import id.AbstractC3557B;
import ji.AbstractC4137l;
import ji.AbstractC4141p;
import ji.C4116E;
import ji.x;

/* loaded from: classes.dex */
public final class q extends F {

    /* renamed from: Y  reason: collision with root package name */
    public final r.f f31903Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f31904Z;

    /* renamed from: h0  reason: collision with root package name */
    public AbstractC4137l f31905h0;

    public q(AbstractC4137l abstractC4137l, r.f fVar) {
        this.f31903Y = fVar;
        this.f31905h0 = abstractC4137l;
    }

    @Override // Wh.F, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f31904Z = true;
        AbstractC4137l abstractC4137l = this.f31905h0;
        if (abstractC4137l != null) {
            u4.e.a(abstractC4137l);
        }
    }

    @Override // Wh.F
    public final r.f h() {
        return this.f31903Y;
    }

    @Override // Wh.F
    public final synchronized AbstractC4137l i() {
        if (!this.f31904Z) {
            AbstractC4137l abstractC4137l = this.f31905h0;
            if (abstractC4137l != null) {
                return abstractC4137l;
            }
            x xVar = AbstractC4141p.f36737a;
            AbstractC3557B.Z(null);
            C4116E J10 = R4.b.J(xVar.l(null));
            this.f31905h0 = J10;
            return J10;
        }
        throw new IllegalStateException("closed".toString());
    }
}
