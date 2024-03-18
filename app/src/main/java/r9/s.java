package r9;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44594Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f44595Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f44596h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f44597i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f44598j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f44599k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f44600l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ Object f44601m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ Object f44602n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ Object f44603o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ Object f44604p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, Object obj2, Object obj3, Object obj4, long j6, Object obj5, boolean z10, Object obj6, int i10, int i11, int i12) {
        super(2);
        this.f44594Y = i12;
        this.f44599k0 = obj;
        this.f44600l0 = obj2;
        this.f44601m0 = obj3;
        this.f44602n0 = obj4;
        this.f44595Z = j6;
        this.f44603o0 = obj5;
        this.f44596h0 = z10;
        this.f44604p0 = obj6;
        this.f44597i0 = i10;
        this.f44598j0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f44594Y;
        int i12 = this.f44597i0;
        Object obj = this.f44604p0;
        Object obj2 = this.f44603o0;
        Object obj3 = this.f44602n0;
        Object obj4 = this.f44601m0;
        Object obj5 = this.f44600l0;
        Object obj6 = this.f44599k0;
        switch (i11) {
            case 0:
                String str = (String) obj;
                int p10 = AbstractC1734s.p(i12 | 1);
                boolean z10 = this.f44596h0;
                int i13 = this.f44598j0;
                K8.d.j((AbstractC6216a) obj6, (AbstractC6216a) obj5, (String) obj4, (String) obj3, this.f44595Z, (String) obj2, z10, str, abstractC1725n, p10, i13);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                boolean z11 = this.f44596h0;
                int i14 = this.f44598j0;
                K8.d.f((Tc.f) obj6, (Ad.g) obj5, (wf.k) obj4, (AbstractC4326r) obj3, this.f44595Z, (wf.p) obj2, z11, (wf.q) obj, abstractC1725n, p11, i14);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f44594Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
