package I9;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* renamed from: I9.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0777q extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8428Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f8429Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f8430h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f8431i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f8432j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f8433k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0777q(wf.k kVar, boolean z10, AbstractC4326r abstractC4326r, int i10, int i11) {
        super(2);
        this.f8430h0 = kVar;
        this.f8429Z = z10;
        this.f8431i0 = abstractC4326r;
        this.f8432j0 = i10;
        this.f8433k0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f8428Y;
        int i12 = this.f8432j0;
        switch (i11) {
            case 0:
                L4.a.E(AbstractC1734s.p(i12 | 1), this.f8433k0, abstractC1725n, this.f8431i0, this.f8430h0, this.f8429Z);
                return;
            default:
                r9.y.P(AbstractC1734s.p(i12 | 1), this.f8433k0, abstractC1725n, this.f8431i0, this.f8430h0, this.f8429Z);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f8428Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0777q(boolean z10, wf.k kVar, AbstractC4326r abstractC4326r, int i10, int i11) {
        super(2);
        this.f8429Z = z10;
        this.f8430h0 = kVar;
        this.f8431i0 = abstractC4326r;
        this.f8432j0 = i10;
        this.f8433k0 = i11;
    }
}
