package p9;

import id.AbstractC3557B;
import r0.C5347k;
import t0.AbstractC5650i;
import u0.AbstractC5824b;

/* loaded from: classes.dex */
public final class k extends AbstractC5824b {

    /* renamed from: k0  reason: collision with root package name */
    public final AbstractC5824b f42789k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f42790l0;

    /* renamed from: m0  reason: collision with root package name */
    public C5347k f42791m0;

    /* renamed from: n0  reason: collision with root package name */
    public final wf.n f42792n0;

    /* renamed from: o0  reason: collision with root package name */
    public j f42793o0;

    public k(AbstractC5824b abstractC5824b, float f6, C5347k c5347k, wf.n nVar) {
        AbstractC3557B.c0("painter", abstractC5824b);
        this.f42789k0 = abstractC5824b;
        this.f42790l0 = f6;
        this.f42791m0 = c5347k;
        this.f42792n0 = nVar;
        this.f42793o0 = new j(abstractC5824b, f6, c5347k);
    }

    @Override // u0.AbstractC5824b
    public final boolean b(float f6) {
        if (f6 != 1.0f) {
            this.f42790l0 = f6;
            this.f42793o0 = new j(this.f42789k0, f6, this.f42791m0);
            return true;
        }
        return true;
    }

    @Override // u0.AbstractC5824b
    public final boolean e(C5347k c5347k) {
        if (c5347k != null) {
            this.f42791m0 = c5347k;
            this.f42793o0 = new j(this.f42789k0, this.f42790l0, c5347k);
            return true;
        }
        return true;
    }

    @Override // u0.AbstractC5824b
    public final long h() {
        return this.f42789k0.h();
    }

    @Override // u0.AbstractC5824b
    public final void i(AbstractC5650i abstractC5650i) {
        AbstractC3557B.c0("<this>", abstractC5650i);
        this.f42792n0.invoke(abstractC5650i, this.f42793o0);
    }
}
