package I9;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* renamed from: I9.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0794z extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Tc.f f8472Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ j1 f8473Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f8474h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f8475i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ boolean f8476j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ float f8477k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f8478l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f8479m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0794z(Tc.f fVar, j1 j1Var, wf.k kVar, AbstractC4326r abstractC4326r, boolean z10, float f6, int i10, int i11) {
        super(2);
        this.f8472Y = fVar;
        this.f8473Z = j1Var;
        this.f8474h0 = kVar;
        this.f8475i0 = abstractC4326r;
        this.f8476j0 = z10;
        this.f8477k0 = f6;
        this.f8478l0 = i10;
        this.f8479m0 = i11;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f8478l0 | 1);
        boolean z10 = this.f8476j0;
        float f6 = this.f8477k0;
        L4.a.k(this.f8472Y, this.f8473Z, this.f8474h0, this.f8475i0, z10, f6, (AbstractC1725n) obj, p10, this.f8479m0);
        return jf.y.f36177a;
    }
}
