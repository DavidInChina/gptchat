package W;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import d1.C2587v;
import l0.AbstractC4326r;
import u0.AbstractC5824b;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class J extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19231Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f19232Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f19233h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f19234i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f19235j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f19236k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f19237l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ Object f19238m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ Object f19239n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ Object f19240o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(boolean z10, AbstractC5824b abstractC5824b, long j6, String str, String str2, AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, int i10, int i11) {
        super(2);
        this.f19232Z = z10;
        this.f19238m0 = abstractC5824b;
        this.f19233h0 = j6;
        this.f19239n0 = str;
        this.f19240o0 = str2;
        this.f19234i0 = abstractC6216a;
        this.f19235j0 = abstractC4326r;
        this.f19236k0 = i10;
        this.f19237l0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f19231Y;
        int i12 = this.f19236k0;
        Object obj = this.f19240o0;
        Object obj2 = this.f19239n0;
        Object obj3 = this.f19238m0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                AbstractC6216a abstractC6216a = this.f19234i0;
                Df.H.f(this.f19232Z, abstractC6216a, this.f19235j0, this.f19233h0, (A.Z0) obj3, (C2587v) obj2, (wf.o) obj, abstractC1725n, p10, this.f19237l0);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                long j6 = this.f19233h0;
                int i13 = this.f19237l0;
                K8.d.O(this.f19232Z, (AbstractC5824b) obj3, j6, (String) obj2, (String) obj, this.f19234i0, this.f19235j0, abstractC1725n, p11, i13);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f19231Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(boolean z10, AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, long j6, A.Z0 z02, C2587v c2587v, wf.o oVar, int i10, int i11) {
        super(2);
        this.f19232Z = z10;
        this.f19234i0 = abstractC6216a;
        this.f19235j0 = abstractC4326r;
        this.f19233h0 = j6;
        this.f19238m0 = z02;
        this.f19239n0 = c2587v;
        this.f19240o0 = oVar;
        this.f19236k0 = i10;
        this.f19237l0 = i11;
    }
}
