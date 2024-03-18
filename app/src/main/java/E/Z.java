package E;

import l0.AbstractC4325q;

/* loaded from: classes.dex */
public final class Z extends AbstractC4325q implements G0.s0 {

    /* renamed from: s0  reason: collision with root package name */
    public float f3831s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f3832t0;

    @Override // G0.s0
    public final Object n0(Object obj) {
        o0 o0Var;
        if (obj instanceof o0) {
            o0Var = (o0) obj;
        } else {
            o0Var = null;
        }
        if (o0Var == null) {
            o0Var = new o0();
        }
        o0Var.f3931a = this.f3831s0;
        o0Var.f3932b = this.f3832t0;
        return o0Var;
    }
}
