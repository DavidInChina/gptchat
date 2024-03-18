package na;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;
import ra.AbstractC5399d;

/* renamed from: na.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4774n extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40059Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f40060Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f40061h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f40062i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f40063j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4774n(Tc.f fVar, AbstractC4326r abstractC4326r, int i10, int i11, int i12) {
        super(2);
        this.f40059Y = i12;
        this.f40060Z = fVar;
        this.f40061h0 = abstractC4326r;
        this.f40062i0 = i10;
        this.f40063j0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f40059Y;
        AbstractC4326r abstractC4326r = this.f40061h0;
        Tc.f fVar = this.f40060Z;
        int i12 = this.f40063j0;
        int i13 = this.f40062i0;
        switch (i11) {
            case 0:
                x8.W.o(fVar, abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            case 1:
                x8.W.u(fVar, abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            case 2:
                AbstractC5399d.a(fVar, abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            case 3:
                K8.d.I(fVar, abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            default:
                Ad.l.k(fVar, abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f40059Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 3:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
