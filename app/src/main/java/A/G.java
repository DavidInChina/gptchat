package A;

import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class G extends AbstractC0012d {

    /* renamed from: y0  reason: collision with root package name */
    public final K f68y0;

    /* renamed from: z0  reason: collision with root package name */
    public final I f69z0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [l0.q, A.f, A.I] */
    public G(D.m mVar, boolean z10, String str, L0.g gVar, AbstractC6216a abstractC6216a) {
        super(mVar, z10, abstractC6216a);
        K k10 = new K(z10, str, gVar, abstractC6216a, null, null);
        A0(k10);
        this.f68y0 = k10;
        ?? abstractC0016f = new AbstractC0016f(z10, mVar, abstractC6216a, this.f184x0);
        A0(abstractC0016f);
        this.f69z0 = abstractC0016f;
    }

    @Override // A.AbstractC0012d
    public final AbstractC0016f C0() {
        return this.f69z0;
    }
}
