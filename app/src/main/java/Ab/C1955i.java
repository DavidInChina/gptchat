package ab;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* renamed from: ab.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1955i extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f24103Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f24104Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f24105h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1966t f24106i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f24107j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f24108k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1955i(Tc.f fVar, AbstractC4326r abstractC4326r, AbstractC1966t abstractC1966t, int i10, int i11, int i12) {
        super(2);
        this.f24103Y = i12;
        this.f24104Z = fVar;
        this.f24105h0 = abstractC4326r;
        this.f24106i0 = abstractC1966t;
        this.f24107j0 = i10;
        this.f24108k0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f24103Y;
        int i12 = this.f24107j0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                Ad.l.l(this.f24104Z, this.f24105h0, this.f24106i0, abstractC1725n, p10, this.f24108k0);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                K8.d.w(this.f24104Z, this.f24105h0, this.f24106i0, abstractC1725n, p11, this.f24108k0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f24103Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
