package na;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import cb.C2334C;
import l0.AbstractC4326r;
import ta.AbstractC5685A;
import ta.AbstractC5690F;
import wd.C6205s;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class A0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39695Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f39696Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f39697h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f39698i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f39699j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f39700k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A0(Object obj, AbstractC4326r abstractC4326r, boolean z10, int i10, int i11, int i12) {
        super(2);
        this.f39695Y = i12;
        this.f39700k0 = obj;
        this.f39696Z = abstractC4326r;
        this.f39697h0 = z10;
        this.f39698i0 = i10;
        this.f39699j0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f39695Y;
        int i12 = this.f39698i0;
        Object obj = this.f39700k0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                D0.d((AbstractC6216a) obj, this.f39696Z, this.f39697h0, abstractC1725n, p10, this.f39699j0);
                return;
            case 1:
                int p11 = AbstractC1734s.p(i12 | 1);
                AbstractC5685A.e((C2334C) obj, this.f39696Z, this.f39697h0, abstractC1725n, p11, this.f39699j0);
                return;
            case 2:
                int p12 = AbstractC1734s.p(i12 | 1);
                int i13 = this.f39699j0;
                AbstractC5690F.b(this.f39697h0, this.f39696Z, (wf.n) obj, abstractC1725n, p12, i13);
                return;
            case 3:
                int p13 = AbstractC1734s.p(i12 | 1);
                Bi.c.c((C6205s) obj, this.f39697h0, this.f39696Z, abstractC1725n, p13, this.f39699j0);
                return;
            case 4:
                int p14 = AbstractC1734s.p(i12 | 1);
                K8.d.f0((Tc.f) obj, this.f39697h0, this.f39696Z, abstractC1725n, p14, this.f39699j0);
                return;
            default:
                int p15 = AbstractC1734s.p(i12 | 1);
                R4.b.y((Ed.i) obj, this.f39697h0, this.f39696Z, abstractC1725n, p15, this.f39699j0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f39695Y) {
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
            case 4:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A0(Object obj, boolean z10, AbstractC4326r abstractC4326r, int i10, int i11, int i12) {
        super(2);
        this.f39695Y = i12;
        this.f39700k0 = obj;
        this.f39697h0 = z10;
        this.f39696Z = abstractC4326r;
        this.f39698i0 = i10;
        this.f39699j0 = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(boolean z10, AbstractC4326r abstractC4326r, wf.n nVar, int i10, int i11) {
        super(2);
        this.f39695Y = 2;
        this.f39697h0 = z10;
        this.f39696Z = abstractC4326r;
        this.f39700k0 = nVar;
        this.f39698i0 = i10;
        this.f39699j0 = i11;
    }
}
