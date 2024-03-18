package W;

import X.AbstractC1674h;
import Z.AbstractC1725n;
import h0.C3288a;

/* loaded from: classes.dex */
public final class E extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ wf.n f19055Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.n f19056Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19057h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ r0.L f19058i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ long f19059j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ float f19060k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ long f19061l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ long f19062m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ long f19063n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19064o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19065p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(wf.n nVar, wf.n nVar2, wf.n nVar3, r0.L l10, long j6, float f6, long j10, long j11, long j12, wf.n nVar4, wf.n nVar5) {
        super(2);
        this.f19055Y = nVar;
        this.f19056Z = nVar2;
        this.f19057h0 = nVar3;
        this.f19058i0 = l10;
        this.f19059j0 = j6;
        this.f19060k0 = f6;
        this.f19061l0 = j10;
        this.f19062m0 = j11;
        this.f19063n0 = j12;
        this.f19064o0 = nVar4;
        this.f19065p0 = nVar5;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        C3288a X10 = R4.b.X(abstractC1725n, -3244296, new D(this.f19064o0, this.f19065p0, 1));
        float f6 = AbstractC1674h.f21564a;
        AbstractC1556h.a(X10, null, this.f19055Y, this.f19056Z, this.f19057h0, this.f19058i0, this.f19059j0, this.f19060k0, R0.e(26, abstractC1725n), this.f19061l0, this.f19062m0, this.f19063n0, abstractC1725n, 6, 0, 2);
        return jf.y.f36177a;
    }
}
