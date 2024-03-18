package th;

import java.util.HashMap;
import java.util.Map;
import wh.AbstractC6242g;
import yh.l1;

/* renamed from: th.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5797e extends AbstractC5793a {

    /* renamed from: e  reason: collision with root package name */
    public final l1 f46217e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f46218f;

    public C5797e(l1 l1Var, HashMap hashMap) {
        this.f46217e = l1Var;
        this.f46218f = hashMap;
    }

    @Override // th.AbstractC5802j
    public final h0 c(AbstractC6242g abstractC6242g) {
        l1 mo118a = abstractC6242g.mo118a();
        l1 l1Var = this.f46217e;
        if (mo118a.equals(l1Var)) {
            h0 h0Var = (h0) this.f46218f.get(abstractC6242g.getName());
            if (h0Var != null) {
                return ((AbstractC5809q) h0Var).d(abstractC6242g, abstractC6242g.getReturnType());
            }
            h0 f6 = abstractC6242g.f();
            if (f6 == null) {
                return new C5787T(1, l1Var, abstractC6242g.getName());
            }
            return f6;
        }
        throw new IllegalArgumentException("Not a property of " + l1Var + ": " + abstractC6242g);
    }

    @Override // th.AbstractC5802j
    public final l1 d() {
        return this.f46217e;
    }

    /* renamed from: h */
    public final C5796d b(Class cls) {
        l1 l1Var = this.f46217e;
        if (l1Var.H(cls)) {
            return new C5796d(this, cls);
        }
        throw new IllegalArgumentException(cls + " does not represent " + l1Var);
    }
}
