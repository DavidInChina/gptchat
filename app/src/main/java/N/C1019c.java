package N;

import H0.AbstractC0701r0;
import H0.Y0;
import W.N3;
import W.Q3;
import Z.AbstractC1725n;
import Z.C1737t0;
import l0.AbstractC4326r;

/* renamed from: N.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1019c extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12288Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f12289Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f12290h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f12291i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f12292j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f12293k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1019c(Y0 y02, AbstractC4326r abstractC4326r, boolean z10, AbstractC1031o abstractC1031o, boolean z11) {
        super(2);
        this.f12291i0 = y02;
        this.f12292j0 = abstractC4326r;
        this.f12289Z = z10;
        this.f12293k0 = abstractC1031o;
        this.f12290h0 = z11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f12288Y;
        Object obj = this.f12293k0;
        Object obj2 = this.f12292j0;
        Object obj3 = this.f12291i0;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                C1737t0 b10 = AbstractC0701r0.f7013p.b((Y0) obj3);
                boolean z10 = this.f12290h0;
                A7.b.k(b10, R4.b.X(abstractC1725n, -1338858912, new C1018b((AbstractC4326r) obj2, this.f12289Z, (AbstractC1031o) obj, z10)), abstractC1725n, 56);
                return;
            default:
                if ((i10 & 3) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                Q3.f19588a.a(this.f12289Z, this.f12290h0, (D.l) obj3, (N3) obj2, (r0.L) obj, abstractC1725n, 196608, 0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f12288Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1019c(boolean z10, boolean z11, D.l lVar, N3 n32, r0.L l10) {
        super(2);
        this.f12289Z = z10;
        this.f12290h0 = z11;
        this.f12291i0 = lVar;
        this.f12292j0 = n32;
        this.f12293k0 = l10;
    }
}
