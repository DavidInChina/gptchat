package Z;

import nf.AbstractC4828h;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class O extends AbstractC1735s0 {

    /* renamed from: b  reason: collision with root package name */
    public final Z0 f22529b;

    public O(Z0 z02, AbstractC6216a abstractC6216a) {
        super(abstractC6216a);
        this.f22529b = z02;
    }

    @Override // Z.AbstractC1748z
    public final l1 a(l1 l1Var, Object obj) {
        if (l1Var != null && (l1Var instanceof AbstractC1710f0)) {
            ((AbstractC1710f0) l1Var).setValue(obj);
            return l1Var;
        }
        return AbstractC4828h.Z(obj, this.f22529b);
    }
}
