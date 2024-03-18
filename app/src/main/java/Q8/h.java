package Q8;

import R8.s;
import S8.M;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import jf.y;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14497Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ M f14498Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ s f14499h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.p f14500i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.p f14501j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f14502k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(M m10, s sVar, wf.p pVar, wf.p pVar2, int i10, int i11) {
        super(2);
        this.f14497Y = i11;
        this.f14498Z = m10;
        this.f14499h0 = sVar;
        this.f14500i0 = pVar;
        this.f14501j0 = pVar2;
        this.f14502k0 = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f14497Y;
        int i12 = this.f14502k0;
        switch (i11) {
            case 0:
                m.c(this.f14498Z, this.f14499h0, this.f14500i0, this.f14501j0, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 1:
                m.c(this.f14498Z, this.f14499h0, this.f14500i0, this.f14501j0, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 2:
                m.c(this.f14498Z, this.f14499h0, this.f14500i0, this.f14501j0, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            default:
                m.d(this.f14498Z, this.f14499h0, this.f14500i0, this.f14501j0, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f14497Y) {
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
