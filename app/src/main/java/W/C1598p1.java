package W;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;
import wf.AbstractC6216a;

/* renamed from: W.p1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1598p1 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f20278Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f20279Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f20280h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f20281i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ r0.L f20282j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C1588n1 f20283k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ D.m f20284l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ wf.n f20285m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ int f20286n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ int f20287o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1598p1(AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, boolean z10, r0.L l10, C1588n1 c1588n1, D.m mVar, wf.n nVar, int i10, int i11, int i12) {
        super(2);
        this.f20278Y = i12;
        this.f20279Z = abstractC6216a;
        this.f20280h0 = abstractC4326r;
        this.f20281i0 = z10;
        this.f20282j0 = l10;
        this.f20283k0 = c1588n1;
        this.f20284l0 = mVar;
        this.f20285m0 = nVar;
        this.f20286n0 = i10;
        this.f20287o0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f20278Y;
        int i12 = this.f20286n0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                R4.b.k(this.f20279Z, this.f20280h0, this.f20281i0, this.f20282j0, this.f20283k0, this.f20284l0, this.f20285m0, abstractC1725n, p10, this.f20287o0);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                R4.b.l(this.f20279Z, this.f20280h0, this.f20281i0, this.f20282j0, this.f20283k0, this.f20284l0, this.f20285m0, abstractC1725n, p11, this.f20287o0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f20278Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
