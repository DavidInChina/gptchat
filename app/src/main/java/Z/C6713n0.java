package z;

import Z.l1;

/* renamed from: z.n0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6713n0 implements l1 {

    /* renamed from: Y  reason: collision with root package name */
    public final C6721r0 f51338Y;

    /* renamed from: Z  reason: collision with root package name */
    public wf.k f51339Z;

    /* renamed from: h0  reason: collision with root package name */
    public wf.k f51340h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C6715o0 f51341i0;

    public C6713n0(C6715o0 c6715o0, C6721r0 c6721r0, wf.k kVar, wf.k kVar2) {
        this.f51341i0 = c6715o0;
        this.f51338Y = c6721r0;
        this.f51339Z = kVar;
        this.f51340h0 = kVar2;
    }

    public final void b(AbstractC6717p0 abstractC6717p0) {
        Object invoke = this.f51340h0.invoke(abstractC6717p0.c());
        boolean d10 = this.f51341i0.f51344c.d();
        C6721r0 c6721r0 = this.f51338Y;
        if (d10) {
            c6721r0.f(this.f51340h0.invoke(abstractC6717p0.a()), invoke, (AbstractC6659E) this.f51339Z.invoke(abstractC6717p0));
        } else {
            c6721r0.g(invoke, (AbstractC6659E) this.f51339Z.invoke(abstractC6717p0));
        }
    }

    @Override // Z.l1
    public final Object getValue() {
        b(this.f51341i0.f51344c.c());
        return this.f51338Y.f51363m0.getValue();
    }
}
