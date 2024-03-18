package E;

import l0.AbstractC4312d;
import l0.AbstractC4325q;

/* loaded from: classes2.dex */
public final class z0 extends AbstractC4325q implements G0.s0 {

    /* renamed from: s0  reason: collision with root package name */
    public AbstractC4312d f3983s0;

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
        o0Var.f3933c = new E(this.f3983s0);
        return o0Var;
    }
}
