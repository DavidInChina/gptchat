package Tc;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ f f17064Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f17065Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f17066h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.n f17067i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ boolean f17068j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ wf.o f17069k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f17070l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f17071m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, AbstractC4326r abstractC4326r, long j6, wf.n nVar, boolean z10, wf.o oVar, int i10, int i11) {
        super(2);
        this.f17064Y = fVar;
        this.f17065Z = abstractC4326r;
        this.f17066h0 = j6;
        this.f17067i0 = nVar;
        this.f17068j0 = z10;
        this.f17069k0 = oVar;
        this.f17070l0 = i10;
        this.f17071m0 = i11;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f17070l0 | 1);
        boolean z10 = this.f17068j0;
        wf.o oVar = this.f17069k0;
        K8.d.o(this.f17064Y, this.f17065Z, this.f17066h0, this.f17067i0, z10, oVar, (AbstractC1725n) obj, p10, this.f17071m0);
        return jf.y.f36177a;
    }
}
