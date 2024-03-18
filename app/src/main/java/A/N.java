package A;

import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class N extends AbstractC0012d {

    /* renamed from: A0  reason: collision with root package name */
    public final P f94A0;

    /* renamed from: y0  reason: collision with root package name */
    public AbstractC6216a f95y0;

    /* renamed from: z0  reason: collision with root package name */
    public final K f96z0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [A.P, l0.q, A.f] */
    public N(D.m mVar, L0.g gVar, String str, String str2, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, AbstractC6216a abstractC6216a3, boolean z10) {
        super(mVar, z10, abstractC6216a);
        this.f95y0 = abstractC6216a2;
        K k10 = new K(z10, str2, gVar, abstractC6216a, str, abstractC6216a2);
        A0(k10);
        this.f96z0 = k10;
        C0006a c0006a = this.f184x0;
        AbstractC6216a abstractC6216a4 = this.f95y0;
        ?? abstractC0016f = new AbstractC0016f(z10, mVar, abstractC6216a, c0006a);
        abstractC0016f.f100A0 = abstractC6216a4;
        abstractC0016f.f101B0 = abstractC6216a3;
        A0(abstractC0016f);
        this.f94A0 = abstractC0016f;
    }

    @Override // A.AbstractC0012d
    public final AbstractC0016f C0() {
        return this.f94A0;
    }
}
