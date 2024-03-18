package na;

import E.AbstractC0438w;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* renamed from: na.m0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4772m0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40052Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC0438w f40053Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f40054h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f40055i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f40056j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4772m0(AbstractC0438w abstractC0438w, AbstractC4326r abstractC4326r, int i10, int i11, int i12) {
        super(2);
        this.f40052Y = i12;
        this.f40053Z = abstractC0438w;
        this.f40054h0 = abstractC4326r;
        this.f40055i0 = i10;
        this.f40056j0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f40052Y;
        AbstractC4326r abstractC4326r = this.f40054h0;
        AbstractC0438w abstractC0438w = this.f40053Z;
        int i12 = this.f40056j0;
        int i13 = this.f40055i0;
        switch (i11) {
            case 0:
                AbstractC4778o0.e(abstractC0438w, abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            case 1:
                AbstractC4778o0.b(abstractC0438w, abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            default:
                x8.W.j(abstractC0438w, abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f40052Y) {
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
