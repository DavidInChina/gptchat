package z4;

import E0.AbstractC0454m;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import java.util.Map;
import jf.y;
import l0.AbstractC4313e;
import l0.AbstractC4326r;
import l8.AbstractC4344b;
import v4.C5971a;
import wf.AbstractC6216a;

/* renamed from: z4.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6771j extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f51638Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5971a f51639Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f51640h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f51641i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ boolean f51642j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ boolean f51643k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ boolean f51644l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f51645m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ boolean f51646n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4313e f51647o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0454m f51648p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ boolean f51649q0;

    /* renamed from: r0  reason: collision with root package name */
    public final /* synthetic */ boolean f51650r0;

    /* renamed from: s0  reason: collision with root package name */
    public final /* synthetic */ Map f51651s0;

    /* renamed from: t0  reason: collision with root package name */
    public final /* synthetic */ int f51652t0;

    /* renamed from: u0  reason: collision with root package name */
    public final /* synthetic */ boolean f51653u0;

    /* renamed from: v0  reason: collision with root package name */
    public final /* synthetic */ int f51654v0;

    /* renamed from: w0  reason: collision with root package name */
    public final /* synthetic */ int f51655w0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ int f51656x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6771j(C5971a c5971a, AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, boolean z10, boolean z11, boolean z12, int i10, boolean z13, AbstractC4313e abstractC4313e, AbstractC0454m abstractC0454m, boolean z14, boolean z15, Map map, int i11, boolean z16, int i12, int i13, int i14, int i15) {
        super(2);
        this.f51638Y = i15;
        this.f51639Z = c5971a;
        this.f51640h0 = abstractC6216a;
        this.f51641i0 = abstractC4326r;
        this.f51642j0 = z10;
        this.f51643k0 = z11;
        this.f51644l0 = z12;
        this.f51645m0 = i10;
        this.f51646n0 = z13;
        this.f51647o0 = abstractC4313e;
        this.f51648p0 = abstractC0454m;
        this.f51649q0 = z14;
        this.f51650r0 = z15;
        this.f51651s0 = map;
        this.f51652t0 = i11;
        this.f51653u0 = z16;
        this.f51654v0 = i12;
        this.f51655w0 = i13;
        this.f51656x0 = i14;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f51638Y;
        int i12 = this.f51655w0;
        int i13 = this.f51654v0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i13 | 1);
                int p11 = AbstractC1734s.p(i12);
                AbstractC4344b.H(this.f51639Z, this.f51640h0, this.f51641i0, this.f51642j0, this.f51643k0, this.f51644l0, this.f51645m0, this.f51646n0, this.f51647o0, this.f51648p0, this.f51649q0, this.f51650r0, this.f51651s0, this.f51652t0, this.f51653u0, abstractC1725n, p10, p11, this.f51656x0);
                return;
            default:
                int p12 = AbstractC1734s.p(i13 | 1);
                int p13 = AbstractC1734s.p(i12);
                AbstractC4344b.H(this.f51639Z, this.f51640h0, this.f51641i0, this.f51642j0, this.f51643k0, this.f51644l0, this.f51645m0, this.f51646n0, this.f51647o0, this.f51648p0, this.f51649q0, this.f51650r0, this.f51651s0, this.f51652t0, this.f51653u0, abstractC1725n, p12, p13, this.f51656x0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f51638Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
