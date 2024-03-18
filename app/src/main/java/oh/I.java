package oh;

import B0.C0194k;
import B0.P;
import G0.AbstractC0587p;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class I extends AbstractC0587p {

    /* renamed from: C0  reason: collision with root package name */
    public final B0.J f41387C0;

    /* renamed from: u0  reason: collision with root package name */
    public C5018e f41388u0;

    /* renamed from: v0  reason: collision with root package name */
    public wf.k f41389v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f41390w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f41391x0;

    /* renamed from: y0  reason: collision with root package name */
    public wf.k f41392y0;

    /* renamed from: z0  reason: collision with root package name */
    public final H f41393z0 = new H(this, 0);

    /* renamed from: A0  reason: collision with root package name */
    public final H f41385A0 = new H(this, 1);

    /* renamed from: B0  reason: collision with root package name */
    public final Pg.k f41386B0 = Bi.c.d(Integer.MAX_VALUE, null, 6);

    public I(C5018e c5018e, wf.k kVar, boolean z10, boolean z11, wf.k kVar2) {
        AbstractC3557B.c0("state", c5018e);
        AbstractC3557B.c0("canPan", kVar);
        AbstractC3557B.c0("onTransformStopped", kVar2);
        this.f41388u0 = c5018e;
        this.f41389v0 = kVar;
        this.f41390w0 = z10;
        this.f41391x0 = z11;
        this.f41392y0 = kVar2;
        G g10 = new G(this, null);
        C0194k c0194k = B0.I.f1599a;
        P p10 = new P(g10);
        A0(p10);
        this.f41387C0 = p10;
    }

    public final void B0(C5018e c5018e, wf.k kVar, boolean z10, boolean z11, wf.k kVar2) {
        AbstractC3557B.c0("state", c5018e);
        AbstractC3557B.c0("canPan", kVar);
        AbstractC3557B.c0("onTransformStopped", kVar2);
        this.f41389v0 = kVar;
        this.f41392y0 = kVar2;
        if (!AbstractC3557B.K(this.f41388u0, c5018e) || this.f41391x0 != z11 || this.f41390w0 != z10) {
            this.f41388u0 = c5018e;
            this.f41391x0 = z11;
            this.f41390w0 = z10;
            ((P) this.f41387C0).C0();
        }
    }
}
