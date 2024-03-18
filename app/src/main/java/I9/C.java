package I9;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class C extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ J0 f8145Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f8146Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f8147h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f8148i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ boolean f8149j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ boolean f8150k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ boolean f8151l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ boolean f8152m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ int f8153n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ int f8154o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(J0 j02, wf.k kVar, wf.k kVar2, AbstractC4326r abstractC4326r, boolean z10, boolean z11, boolean z12, boolean z13, int i10, int i11) {
        super(2);
        this.f8145Y = j02;
        this.f8146Z = kVar;
        this.f8147h0 = kVar2;
        this.f8148i0 = abstractC4326r;
        this.f8149j0 = z10;
        this.f8150k0 = z11;
        this.f8151l0 = z12;
        this.f8152m0 = z13;
        this.f8153n0 = i10;
        this.f8154o0 = i11;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f8153n0 | 1);
        boolean z10 = this.f8151l0;
        boolean z11 = this.f8152m0;
        L4.a.p(this.f8145Y, this.f8146Z, this.f8147h0, this.f8148i0, this.f8149j0, this.f8150k0, z10, z11, (AbstractC1725n) obj, p10, this.f8154o0);
        return jf.y.f36177a;
    }
}
