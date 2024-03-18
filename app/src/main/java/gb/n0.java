package gb;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import ca.AbstractC2314f;
import l0.AbstractC4326r;

/* loaded from: classes2.dex */
public final class n0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31488Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC2314f f31489Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f31490h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f31491i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f31492j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f31493k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(AbstractC2314f abstractC2314f, wf.k kVar, AbstractC4326r abstractC4326r, int i10, int i11, int i12) {
        super(2);
        this.f31488Y = i12;
        this.f31489Z = abstractC2314f;
        this.f31490h0 = kVar;
        this.f31491i0 = abstractC4326r;
        this.f31492j0 = i10;
        this.f31493k0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f31488Y;
        int i12 = this.f31492j0;
        switch (i11) {
            case 0:
                L4.a.x(this.f31489Z, this.f31490h0, this.f31491i0, abstractC1725n, AbstractC1734s.p(i12 | 1), this.f31493k0);
                return;
            default:
                int p10 = AbstractC1734s.p(i12 | 1);
                L4.a.y(this.f31489Z, this.f31490h0, this.f31491i0, abstractC1725n, p10, this.f31493k0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f31488Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
