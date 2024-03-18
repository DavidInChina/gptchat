package ec;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* renamed from: ec.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2872x extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f29260Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2873y f29261Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f29262h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f29263i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f29264j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f29265k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2872x(C2873y c2873y, wf.k kVar, AbstractC4326r abstractC4326r, int i10, int i11, int i12) {
        super(2);
        this.f29260Y = i12;
        this.f29261Z = c2873y;
        this.f29262h0 = kVar;
        this.f29263i0 = abstractC4326r;
        this.f29264j0 = i10;
        this.f29265k0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f29260Y;
        int i12 = this.f29264j0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                r9.y.J(this.f29261Z, this.f29262h0, this.f29263i0, abstractC1725n, p10, this.f29265k0);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                r9.y.K(this.f29261Z, this.f29262h0, this.f29263i0, abstractC1725n, p11, this.f29265k0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f29260Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
