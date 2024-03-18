package t3;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import c1.AbstractC2279d;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45698Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i0.e f45699Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f45700h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f45701i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(i0.e eVar, wf.n nVar, int i10, int i11) {
        super(2);
        this.f45698Y = i11;
        this.f45699Z = eVar;
        this.f45700h0 = nVar;
        this.f45701i0 = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f45698Y;
        wf.n nVar = this.f45700h0;
        i0.e eVar = this.f45699Z;
        int i12 = this.f45701i0;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                AbstractC2279d.f(eVar, nVar, abstractC1725n, ((i12 >> 3) & 112) | 8);
                return;
            default:
                AbstractC2279d.f(eVar, nVar, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f45698Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
