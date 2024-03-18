package ec;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;
import wd.o0;
import wf.AbstractC6216a;

/* renamed from: ec.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2869u extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f29246Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ o0 f29247Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f29248h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f29249i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f29250j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f29251k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2869u(o0 o0Var, AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, int i10, int i11, int i12) {
        super(2);
        this.f29246Y = i12;
        this.f29247Z = o0Var;
        this.f29248h0 = abstractC6216a;
        this.f29249i0 = abstractC4326r;
        this.f29250j0 = i10;
        this.f29251k0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f29246Y;
        int i12 = this.f29250j0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                r9.y.F(this.f29247Z, this.f29248h0, this.f29249i0, abstractC1725n, p10, this.f29251k0);
                return;
            case 1:
                int p11 = AbstractC1734s.p(i12 | 1);
                r9.y.H(this.f29247Z, this.f29248h0, this.f29249i0, abstractC1725n, p11, this.f29251k0);
                return;
            default:
                int p12 = AbstractC1734s.p(i12 | 1);
                r9.y.I(this.f29247Z, this.f29248h0, this.f29249i0, abstractC1725n, p12, this.f29251k0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f29246Y) {
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
