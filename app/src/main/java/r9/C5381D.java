package r9;

import W.C1572k0;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;
import wf.AbstractC6216a;
import x8.W;

/* renamed from: r9.D  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5381D extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44485Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f44486Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f44487h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C1572k0 f44488i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ boolean f44489j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ boolean f44490k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ wf.n f44491l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f44492m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ int f44493n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5381D(AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, C1572k0 c1572k0, boolean z10, boolean z11, wf.n nVar, int i10, int i11, int i12) {
        super(2);
        this.f44485Y = i12;
        this.f44486Z = abstractC6216a;
        this.f44487h0 = abstractC4326r;
        this.f44488i0 = c1572k0;
        this.f44489j0 = z10;
        this.f44490k0 = z11;
        this.f44491l0 = nVar;
        this.f44492m0 = i10;
        this.f44493n0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f44485Y;
        int i12 = this.f44492m0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                W.p(this.f44486Z, this.f44487h0, this.f44488i0, this.f44489j0, this.f44490k0, this.f44491l0, abstractC1725n, p10, this.f44493n0);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                W.q(this.f44486Z, this.f44487h0, this.f44488i0, this.f44489j0, this.f44490k0, this.f44491l0, abstractC1725n, p11, this.f44493n0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f44485Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
