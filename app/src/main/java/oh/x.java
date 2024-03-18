package oh;

import B0.C0194k;
import B0.P;
import G0.AbstractC0587p;
import id.AbstractC3557B;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class x extends AbstractC0587p {

    /* renamed from: A0  reason: collision with root package name */
    public boolean f41473A0;

    /* renamed from: B0  reason: collision with root package name */
    public final Pg.k f41474B0 = Bi.c.d(Integer.MAX_VALUE, null, 6);

    /* renamed from: C0  reason: collision with root package name */
    public final B0.J f41475C0;

    /* renamed from: u0  reason: collision with root package name */
    public wf.k f41476u0;

    /* renamed from: v0  reason: collision with root package name */
    public wf.k f41477v0;

    /* renamed from: w0  reason: collision with root package name */
    public wf.k f41478w0;

    /* renamed from: x0  reason: collision with root package name */
    public wf.k f41479x0;

    /* renamed from: y0  reason: collision with root package name */
    public AbstractC6216a f41480y0;

    /* renamed from: z0  reason: collision with root package name */
    public C5018e f41481z0;

    public x(wf.k kVar, wf.k kVar2, wf.k kVar3, wf.k kVar4, AbstractC6216a abstractC6216a, C5018e c5018e, boolean z10) {
        AbstractC3557B.c0("onPress", kVar);
        AbstractC3557B.c0("onDoubleTap", kVar4);
        AbstractC3557B.c0("onQuickZoomStopped", abstractC6216a);
        AbstractC3557B.c0("transformableState", c5018e);
        this.f41476u0 = kVar;
        this.f41477v0 = kVar2;
        this.f41478w0 = kVar3;
        this.f41479x0 = kVar4;
        this.f41480y0 = abstractC6216a;
        this.f41481z0 = c5018e;
        this.f41473A0 = z10;
        w wVar = new w(this, null);
        C0194k c0194k = B0.I.f1599a;
        P p10 = new P(wVar);
        A0(p10);
        this.f41475C0 = p10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (id.AbstractC3557B.K(r4.f41481z0, r10) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B0(wf.k kVar, wf.k kVar2, wf.k kVar3, wf.k kVar4, AbstractC6216a abstractC6216a, C5018e c5018e, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        AbstractC3557B.c0("onPress", kVar);
        AbstractC3557B.c0("onDoubleTap", kVar4);
        AbstractC3557B.c0("onQuickZoomStopped", abstractC6216a);
        AbstractC3557B.c0("transformableState", c5018e);
        boolean z15 = false;
        if (this.f41477v0 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (kVar2 == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 == z12) {
            if (this.f41478w0 == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (kVar3 == null) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z13 == z14) {
            }
        }
        z15 = true;
        this.f41476u0 = kVar;
        this.f41479x0 = kVar4;
        this.f41473A0 = z10;
        this.f41480y0 = abstractC6216a;
        if (z15) {
            this.f41477v0 = kVar2;
            this.f41478w0 = kVar3;
            this.f41481z0 = c5018e;
            ((P) this.f41475C0).C0();
        }
    }
}
