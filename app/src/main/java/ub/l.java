package ub;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import ca.C2317i;
import l0.AbstractC4326r;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46565Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2317i f46566Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f46567h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f46568i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f46569j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f46570k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(C2317i c2317i, wf.k kVar, AbstractC4326r abstractC4326r, int i10, int i11, int i12) {
        super(2);
        this.f46565Y = i12;
        this.f46566Z = c2317i;
        this.f46567h0 = kVar;
        this.f46568i0 = abstractC4326r;
        this.f46569j0 = i10;
        this.f46570k0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f46565Y;
        int i12 = this.f46569j0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                K8.d.n(this.f46566Z, this.f46567h0, this.f46568i0, abstractC1725n, p10, this.f46570k0);
                return;
            case 1:
                s.b(this.f46566Z, this.f46567h0, this.f46568i0, abstractC1725n, AbstractC1734s.p(i12 | 1), this.f46570k0);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                s.c(this.f46566Z, this.f46567h0, this.f46568i0, abstractC1725n, p11, this.f46570k0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f46565Y) {
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
