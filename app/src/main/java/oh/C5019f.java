package oh;

import Z.G0;
import id.AbstractC3557B;
import r0.C5347k;
import t0.AbstractC5650i;
import u0.AbstractC5824b;

/* renamed from: oh.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5019f extends AbstractC5824b implements G0 {

    /* renamed from: k0  reason: collision with root package name */
    public final AbstractC5824b f41414k0;

    /* renamed from: l0  reason: collision with root package name */
    public final long f41415l0;

    /* renamed from: m0  reason: collision with root package name */
    public float f41416m0 = 1.0f;

    /* renamed from: n0  reason: collision with root package name */
    public C5347k f41417n0;

    public C5019f(AbstractC5824b abstractC5824b, long j6) {
        this.f41414k0 = abstractC5824b;
        this.f41415l0 = j6;
    }

    @Override // Z.G0
    public final void a() {
        G0 g02;
        AbstractC5824b abstractC5824b = this.f41414k0;
        if (abstractC5824b instanceof G0) {
            g02 = (G0) abstractC5824b;
        } else {
            g02 = null;
        }
        if (g02 != null) {
            g02.a();
        }
    }

    @Override // u0.AbstractC5824b
    public final boolean b(float f6) {
        this.f41416m0 = f6;
        return true;
    }

    @Override // Z.G0
    public final void c() {
        G0 g02;
        AbstractC5824b abstractC5824b = this.f41414k0;
        if (abstractC5824b instanceof G0) {
            g02 = (G0) abstractC5824b;
        } else {
            g02 = null;
        }
        if (g02 != null) {
            g02.c();
        }
    }

    @Override // Z.G0
    public final void d() {
        G0 g02;
        AbstractC5824b abstractC5824b = this.f41414k0;
        if (abstractC5824b instanceof G0) {
            g02 = (G0) abstractC5824b;
        } else {
            g02 = null;
        }
        if (g02 != null) {
            g02.d();
        }
    }

    @Override // u0.AbstractC5824b
    public final boolean e(C5347k c5347k) {
        this.f41417n0 = c5347k;
        return true;
    }

    @Override // u0.AbstractC5824b
    public final long h() {
        return this.f41415l0;
    }

    @Override // u0.AbstractC5824b
    public final void i(AbstractC5650i abstractC5650i) {
        AbstractC3557B.c0("<this>", abstractC5650i);
        this.f41414k0.g(abstractC5650i, abstractC5650i.g(), this.f41416m0, this.f41417n0);
    }
}
