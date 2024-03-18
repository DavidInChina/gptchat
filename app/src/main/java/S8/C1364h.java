package S8;

import Z.AbstractC1725n;

/* renamed from: S8.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1364h extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16323Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.o f16324Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ M f16325h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1364h(wf.o oVar, M m10, int i10) {
        super(2);
        this.f16323Y = i10;
        this.f16324Z = oVar;
        this.f16325h0 = m10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f16323Y;
        M m10 = this.f16325h0;
        wf.o oVar = this.f16324Z;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                oVar.invoke(m10, abstractC1725n, 0);
                return;
            case 1:
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                oVar.invoke(m10, abstractC1725n, 0);
                return;
            default:
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                oVar.invoke(m10, abstractC1725n, 0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f16323Y) {
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
