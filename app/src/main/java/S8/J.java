package S8;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class J extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16234Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ M f16235Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f16236h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f16237i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ boolean f16238j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f16239k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f16240l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f16241m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ int f16242n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ Object f16243o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(M m10, U8.p pVar, AbstractC4326r abstractC4326r, wf.k kVar, boolean z10, int i10, int i11, int i12, int i13) {
        super(2);
        this.f16235Z = m10;
        this.f16243o0 = pVar;
        this.f16236h0 = abstractC4326r;
        this.f16237i0 = kVar;
        this.f16238j0 = z10;
        this.f16239k0 = i10;
        this.f16240l0 = i11;
        this.f16241m0 = i12;
        this.f16242n0 = i13;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f16234Y;
        int i12 = this.f16241m0;
        Object obj = this.f16243o0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                int i13 = this.f16239k0;
                int i14 = this.f16242n0;
                L.c(this.f16235Z, (String) obj, this.f16236h0, this.f16237i0, i13, this.f16238j0, this.f16240l0, abstractC1725n, p10, i14);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                boolean z10 = this.f16238j0;
                int i15 = this.f16242n0;
                Ad.l.w(this.f16235Z, (U8.p) obj, this.f16236h0, this.f16237i0, z10, this.f16239k0, this.f16240l0, abstractC1725n, p11, i15);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f16234Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(M m10, String str, AbstractC4326r abstractC4326r, wf.k kVar, int i10, boolean z10, int i11, int i12, int i13) {
        super(2);
        this.f16235Z = m10;
        this.f16243o0 = str;
        this.f16236h0 = abstractC4326r;
        this.f16237i0 = kVar;
        this.f16239k0 = i10;
        this.f16238j0 = z10;
        this.f16240l0 = i11;
        this.f16241m0 = i12;
        this.f16242n0 = i13;
    }
}
