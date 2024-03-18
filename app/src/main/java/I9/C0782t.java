package I9;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import cb.C2334C;
import l0.AbstractC4326r;
import wf.AbstractC6216a;

/* renamed from: I9.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0782t extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8444Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f8445Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f8446h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f8447i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f8448j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f8449k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f8450l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ Object f8451m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0782t(C2334C c2334c, boolean z10, boolean z11, wf.k kVar, AbstractC4326r abstractC4326r, int i10, int i11) {
        super(2);
        this.f8450l0 = c2334c;
        this.f8446h0 = z10;
        this.f8447i0 = z11;
        this.f8445Z = kVar;
        this.f8451m0 = abstractC4326r;
        this.f8448j0 = i10;
        this.f8449k0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f8444Y;
        int i12 = this.f8448j0;
        Object obj = this.f8451m0;
        Object obj2 = this.f8450l0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                boolean z10 = this.f8446h0;
                int i13 = this.f8449k0;
                L4.a.K((C2334C) obj2, z10, this.f8447i0, this.f8445Z, (AbstractC4326r) obj, abstractC1725n, p10, i13);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                wf.k kVar = this.f8445Z;
                int i14 = this.f8449k0;
                K8.d.F(kVar, (AbstractC6216a) obj2, this.f8446h0, this.f8447i0, (p0.l) obj, abstractC1725n, p11, i14);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f8444Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0782t(wf.k kVar, AbstractC6216a abstractC6216a, boolean z10, boolean z11, p0.l lVar, int i10, int i11) {
        super(2);
        this.f8445Z = kVar;
        this.f8450l0 = abstractC6216a;
        this.f8446h0 = z10;
        this.f8447i0 = z11;
        this.f8451m0 = lVar;
        this.f8448j0 = i10;
        this.f8449k0 = i11;
    }
}
