package r9;

import Z.AbstractC1725n;
import Z.AbstractC1734s;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44608Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Yg.r f44609Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f44610h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f44611i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Yg.r rVar, wf.k kVar, int i10, int i11) {
        super(2);
        this.f44608Y = i11;
        this.f44609Z = rVar;
        this.f44610h0 = kVar;
        this.f44611i0 = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f44608Y;
        wf.k kVar = this.f44610h0;
        Yg.r rVar = this.f44609Z;
        int i12 = this.f44611i0;
        switch (i11) {
            case 0:
                x.b(rVar, kVar, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 1:
                x.c(rVar, kVar, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            default:
                x.e(rVar, kVar, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f44608Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
