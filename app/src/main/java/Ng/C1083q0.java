package Ng;

import nf.AbstractC4825e;

/* renamed from: Ng.q0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1083q0 extends C1072l {

    /* renamed from: n0  reason: collision with root package name */
    public final v0 f12964n0;

    public C1083q0(AbstractC4825e abstractC4825e, v0 v0Var) {
        super(1, abstractC4825e);
        this.f12964n0 = v0Var;
    }

    @Override // Ng.C1072l
    public final String D() {
        return "AwaitContinuation";
    }

    @Override // Ng.C1072l
    public final Throwable r(v0 v0Var) {
        Throwable c10;
        Object U10 = this.f12964n0.U();
        if ((U10 instanceof s0) && (c10 = ((s0) U10).c()) != null) {
            return c10;
        }
        if (U10 instanceof C1087v) {
            return ((C1087v) U10).f12988a;
        }
        return v0Var.P();
    }
}
