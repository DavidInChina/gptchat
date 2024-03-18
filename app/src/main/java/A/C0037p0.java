package A;

import E0.AbstractC0454m;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4313e;
import l0.AbstractC4326r;
import r0.C5347k;
import u0.AbstractC5824b;

/* renamed from: A.p0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0037p0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f265Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ float f266Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f267h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f268i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f269j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f270k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f271l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ Object f272m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ Object f273n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ Object f274o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0037p0(E.g0 g0Var, E.g0 g0Var2, Tc.r rVar, wf.n nVar, float f6, wf.o oVar, wf.n nVar2, int i10, int i11) {
        super(2);
        this.f269j0 = g0Var;
        this.f270k0 = g0Var2;
        this.f271l0 = rVar;
        this.f272m0 = nVar;
        this.f266Z = f6;
        this.f273n0 = oVar;
        this.f274o0 = nVar2;
        this.f267h0 = i10;
        this.f268i0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f265Y;
        int i12 = this.f267h0;
        Object obj = this.f274o0;
        Object obj2 = this.f273n0;
        Object obj3 = this.f272m0;
        Object obj4 = this.f271l0;
        Object obj5 = this.f270k0;
        Object obj6 = this.f269j0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                int i13 = this.f268i0;
                androidx.compose.foundation.a.b((AbstractC5824b) obj6, (String) obj5, (AbstractC4326r) obj4, (AbstractC4313e) obj3, (AbstractC0454m) obj2, this.f266Z, (C5347k) obj, abstractC1725n, p10, i13);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                int i14 = this.f268i0;
                r9.y.O((E.g0) obj6, (E.g0) obj5, (Tc.r) obj4, (wf.n) obj3, this.f266Z, (wf.o) obj2, (wf.n) obj, abstractC1725n, p11, i14);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f265Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0037p0(AbstractC5824b abstractC5824b, String str, AbstractC4326r abstractC4326r, AbstractC4313e abstractC4313e, AbstractC0454m abstractC0454m, float f6, C5347k c5347k, int i10, int i11) {
        super(2);
        this.f269j0 = abstractC5824b;
        this.f270k0 = str;
        this.f271l0 = abstractC4326r;
        this.f272m0 = abstractC4313e;
        this.f273n0 = abstractC0454m;
        this.f266Z = f6;
        this.f274o0 = c5347k;
        this.f267h0 = i10;
        this.f268i0 = i11;
    }
}
