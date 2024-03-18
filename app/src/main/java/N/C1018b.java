package N;

import W.C1608r2;
import W.N3;
import Z.AbstractC1725n;
import l0.AbstractC4326r;
import z.C6672L;

/* renamed from: N.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1018b extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12281Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f12282Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f12283h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f12284i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f12285j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1018b(D.l lVar, N3 n32, boolean z10, boolean z11) {
        super(2);
        this.f12282Z = z10;
        this.f12283h0 = z11;
        this.f12284i0 = lVar;
        this.f12285j0 = n32;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f12281Y;
        Object obj = this.f12285j0;
        Object obj2 = this.f12284i0;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                AbstractC1031o abstractC1031o = (AbstractC1031o) obj;
                boolean z10 = this.f12283h0;
                boolean z11 = this.f12282Z;
                M3.H.i(L0.l.a((AbstractC4326r) obj2, false, new C1017a(abstractC1031o, z10, z11)), new C6672L(9, abstractC1031o), z11, abstractC1725n, 0);
                return;
            default:
                if ((i10 & 3) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                C1608r2.f20379a.a(this.f12282Z, this.f12283h0, (D.l) obj2, (N3) obj, null, 0.0f, 0.0f, abstractC1725n, 12582912, 112);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f12281Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1018b(AbstractC4326r abstractC4326r, boolean z10, AbstractC1031o abstractC1031o, boolean z11) {
        super(2);
        this.f12284i0 = abstractC4326r;
        this.f12282Z = z10;
        this.f12285j0 = abstractC1031o;
        this.f12283h0 = z11;
    }
}
