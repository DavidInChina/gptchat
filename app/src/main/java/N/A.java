package N;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class A extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12185Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f12186Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f12187h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f12188i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f12189j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(AbstractC4326r abstractC4326r, wf.n nVar, int i10, int i11, int i12) {
        super(2);
        this.f12185Y = i12;
        this.f12186Z = abstractC4326r;
        this.f12187h0 = nVar;
        this.f12188i0 = i10;
        this.f12189j0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f12185Y;
        wf.n nVar = this.f12187h0;
        AbstractC4326r abstractC4326r = this.f12186Z;
        int i12 = this.f12189j0;
        int i13 = this.f12188i0;
        switch (i11) {
            case 0:
                A7.b.M(abstractC4326r, nVar, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            case 1:
                Df.H.j(abstractC4326r, nVar, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            case 2:
                E0.k0.b(abstractC4326r, nVar, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            default:
                r9.y.M(abstractC4326r, nVar, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f12185Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
