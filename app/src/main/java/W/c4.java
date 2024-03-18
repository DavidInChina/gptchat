package W;

import Z.AbstractC1725n;
import Z.AbstractC1734s;

/* loaded from: classes.dex */
public final class c4 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ e4 f19966Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ EnumC1612s1 f19967Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f19968h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f19969i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.o f19970j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ boolean f19971k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ wf.s f19972l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f19973m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(e4 e4Var, EnumC1612s1 enumC1612s1, long j6, long j10, wf.o oVar, boolean z10, wf.s sVar, int i10) {
        super(2);
        this.f19966Y = e4Var;
        this.f19967Z = enumC1612s1;
        this.f19968h0 = j6;
        this.f19969i0 = j10;
        this.f19970j0 = oVar;
        this.f19971k0 = z10;
        this.f19972l0 = sVar;
        this.f19973m0 = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f19973m0 | 1);
        boolean z10 = this.f19971k0;
        wf.s sVar = this.f19972l0;
        this.f19966Y.a(this.f19967Z, this.f19968h0, this.f19969i0, this.f19970j0, z10, sVar, (AbstractC1725n) obj, p10);
        return jf.y.f36177a;
    }
}
