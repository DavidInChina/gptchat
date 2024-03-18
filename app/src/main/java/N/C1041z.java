package N;

import Cd.AbstractC0324i;
import S8.AbstractC1377v;
import Z.AbstractC1725n;
import Z.AbstractC1734s;

/* renamed from: N.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1041z extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12457Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.n f12458Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f12459h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1041z(wf.n nVar, int i10, int i11) {
        super(2);
        this.f12457Y = i11;
        this.f12458Z = nVar;
        this.f12459h0 = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f12457Y;
        wf.n nVar = this.f12458Z;
        int i12 = this.f12459h0;
        switch (i11) {
            case 0:
                A7.b.B(nVar, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 1:
                AbstractC1377v.c(nVar, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 2:
                T8.e.b(nVar, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            default:
                AbstractC0324i.a(nVar, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f12457Y) {
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
