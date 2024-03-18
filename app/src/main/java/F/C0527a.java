package F;

import B.L0;
import E.AbstractC0425i;
import E.AbstractC0427k;
import E.g0;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4311c;
import l0.AbstractC4312d;
import l0.AbstractC4326r;

/* renamed from: F.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0527a extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f4904Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f4905Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ J f4906h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ g0 f4907i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ boolean f4908j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ L0 f4909k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ boolean f4910l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ wf.k f4911m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ int f4912n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ int f4913o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ Object f4914p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ Object f4915q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0527a(AbstractC4326r abstractC4326r, J j6, g0 g0Var, boolean z10, Object obj, Object obj2, L0 l02, boolean z11, wf.k kVar, int i10, int i11, int i12) {
        super(2);
        this.f4904Y = i12;
        this.f4905Z = abstractC4326r;
        this.f4906h0 = j6;
        this.f4907i0 = g0Var;
        this.f4908j0 = z10;
        this.f4914p0 = obj;
        this.f4915q0 = obj2;
        this.f4909k0 = l02;
        this.f4910l0 = z11;
        this.f4911m0 = kVar;
        this.f4912n0 = i10;
        this.f4913o0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f4904Y;
        int i12 = this.f4912n0;
        Object obj = this.f4915q0;
        Object obj2 = this.f4914p0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                AbstractC0539m.a(this.f4905Z, this.f4906h0, this.f4907i0, this.f4908j0, (AbstractC0427k) obj2, (AbstractC4311c) obj, this.f4909k0, this.f4910l0, this.f4911m0, abstractC1725n, p10, this.f4913o0);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                L0 l02 = this.f4909k0;
                int i13 = this.f4913o0;
                AbstractC0539m.c(this.f4905Z, this.f4906h0, this.f4907i0, this.f4908j0, (AbstractC0425i) obj2, (AbstractC4312d) obj, l02, this.f4910l0, this.f4911m0, abstractC1725n, p11, i13);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f4904Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
