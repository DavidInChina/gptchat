package z4;

import Ng.C1084s;
import Z.C1724m0;
import Z.I;
import Z.o1;
import nf.AbstractC4828h;
import v4.C5971a;

/* loaded from: classes2.dex */
public final class q implements o {

    /* renamed from: Z  reason: collision with root package name */
    public final C1724m0 f51705Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C1724m0 f51706h0;

    /* renamed from: Y  reason: collision with root package name */
    public final C1084s f51704Y = A7.b.j();

    /* renamed from: i0  reason: collision with root package name */
    public final I f51707i0 = AbstractC4828h.E(new p(this, 0));

    /* renamed from: j0  reason: collision with root package name */
    public final I f51708j0 = AbstractC4828h.E(new p(this, 3));

    public q() {
        o1 o1Var = o1.f22665a;
        this.f51705Z = AbstractC4828h.Z(null, o1Var);
        this.f51706h0 = AbstractC4828h.Z(null, o1Var);
        AbstractC4828h.E(new p(this, 2));
        AbstractC4828h.E(new p(this, 1));
    }

    public final synchronized void b(Throwable th2) {
        if (((Boolean) this.f51707i0.getValue()).booleanValue()) {
            return;
        }
        this.f51706h0.setValue(th2);
        this.f51704Y.q0(th2);
    }

    @Override // Z.l1
    public final Object getValue() {
        return (C5971a) this.f51705Z.getValue();
    }
}
