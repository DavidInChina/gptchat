package Gf;

import id.AbstractC3557B;
import wf.AbstractC6216a;

/* renamed from: Gf.a0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0626a0 extends l0 implements AbstractC6216a {

    /* renamed from: o0  reason: collision with root package name */
    public final c0 f6383o0;

    public C0626a0(c0 c0Var) {
        AbstractC3557B.c0("property", c0Var);
        this.f6383o0 = c0Var;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        return this.f6383o0.get();
    }

    @Override // Gf.j0
    public final p0 x() {
        return this.f6383o0;
    }
}
