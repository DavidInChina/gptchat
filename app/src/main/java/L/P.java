package L;

import Z.AbstractC1725n;
import Z.AbstractC1734s;

/* loaded from: classes2.dex */
public final class P extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10025Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f10026Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f10027h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f10028i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(Object obj, boolean z10, int i10, int i11) {
        super(2);
        this.f10025Y = i11;
        this.f10028i0 = obj;
        this.f10026Z = z10;
        this.f10027h0 = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f10025Y;
        boolean z10 = this.f10026Z;
        int i12 = this.f10027h0;
        Object obj = this.f10028i0;
        switch (i11) {
            case 0:
                kotlin.jvm.internal.m.f((N.t0) obj, z10, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 1:
                x8.W.A(z10, (wf.n) obj, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            default:
                Bi.c.G((wf.k) obj, z10, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f10025Y) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(boolean z10, wf.n nVar, int i10) {
        super(2);
        this.f10025Y = 1;
        this.f10026Z = z10;
        this.f10028i0 = nVar;
        this.f10027h0 = i10;
    }
}
