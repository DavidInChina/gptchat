package na;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import cb.C2334C;
import l0.AbstractC4326r;

/* renamed from: na.n0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4775n0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40064Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2334C f40065Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f40066h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f40067i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f40068j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f40069k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4775n0(C2334C c2334c, AbstractC4326r abstractC4326r, wf.k kVar, int i10, int i11) {
        super(2);
        this.f40065Z = c2334c;
        this.f40066h0 = abstractC4326r;
        this.f40067i0 = kVar;
        this.f40068j0 = i10;
        this.f40069k0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f40064Y;
        int i12 = this.f40068j0;
        switch (i11) {
            case 0:
                AbstractC4778o0.d(AbstractC1734s.p(i12 | 1), this.f40069k0, abstractC1725n, this.f40066h0, this.f40065Z, this.f40067i0);
                return;
            default:
                Bi.c.f(AbstractC1734s.p(i12 | 1), this.f40069k0, abstractC1725n, this.f40066h0, this.f40065Z, this.f40067i0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f40064Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4775n0(C2334C c2334c, wf.k kVar, AbstractC4326r abstractC4326r, int i10, int i11) {
        super(2);
        this.f40065Z = c2334c;
        this.f40067i0 = kVar;
        this.f40066h0 = abstractC4326r;
        this.f40068j0 = i10;
        this.f40069k0 = i11;
    }
}
