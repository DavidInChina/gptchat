package t3;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import jf.AbstractC3953c;
import l0.AbstractC4313e;
import l0.AbstractC4326r;
import s3.C5542E;
import s3.C5545H;
import y.d0;
import y.e0;
import z.C6729v0;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45713Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f45714Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f45715h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f45716i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f45717j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ wf.k f45718k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ AbstractC3953c f45719l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ Object f45720m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ AbstractC3953c f45721n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ int f45722o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ int f45723p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(C5545H c5545h, C5542E c5542e, AbstractC4326r abstractC4326r, AbstractC4313e abstractC4313e, wf.k kVar, wf.k kVar2, wf.k kVar3, wf.k kVar4, int i10, int i11, int i12) {
        super(2);
        this.f45713Y = i12;
        this.f45714Z = c5545h;
        this.f45715h0 = c5542e;
        this.f45716i0 = abstractC4326r;
        this.f45717j0 = abstractC4313e;
        this.f45718k0 = kVar;
        this.f45719l0 = kVar2;
        this.f45720m0 = kVar3;
        this.f45721n0 = kVar4;
        this.f45722o0 = i10;
        this.f45723p0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f45713Y;
        int i12 = this.f45722o0;
        AbstractC3953c abstractC3953c = this.f45721n0;
        Object obj = this.f45720m0;
        AbstractC3953c abstractC3953c2 = this.f45719l0;
        Object obj2 = this.f45717j0;
        Object obj3 = this.f45715h0;
        Object obj4 = this.f45714Z;
        switch (i11) {
            case 0:
                wf.k kVar = (wf.k) abstractC3953c;
                int p10 = AbstractC1734s.p(i12 | 1);
                wf.k kVar2 = this.f45718k0;
                int i13 = this.f45723p0;
                R4.b.q((C5545H) obj4, (C5542E) obj3, this.f45716i0, (AbstractC4313e) obj2, kVar2, (wf.k) abstractC3953c2, (wf.k) obj, kVar, abstractC1725n, p10, i13);
                return;
            case 1:
                int p11 = AbstractC1734s.p(i12 | 1);
                wf.k kVar3 = this.f45718k0;
                int i14 = this.f45723p0;
                R4.b.q((C5545H) obj4, (C5542E) obj3, this.f45716i0, (AbstractC4313e) obj2, kVar3, (wf.k) abstractC3953c2, (wf.k) obj, (wf.k) abstractC3953c, abstractC1725n, p11, i14);
                return;
            case 2:
                wf.k kVar4 = (wf.k) abstractC3953c;
                int p12 = AbstractC1734s.p(i12 | 1);
                wf.k kVar5 = this.f45718k0;
                int i15 = this.f45723p0;
                R4.b.q((C5545H) obj4, (C5542E) obj3, this.f45716i0, (AbstractC4313e) obj2, kVar5, (wf.k) abstractC3953c2, (wf.k) obj, kVar4, abstractC1725n, p12, i15);
                return;
            default:
                AbstractC2469q0.p(obj);
                int p13 = AbstractC1734s.p(i12 | 1);
                wf.k kVar6 = this.f45718k0;
                int i16 = this.f45723p0;
                R4.b.d((C6729v0) obj4, kVar6, this.f45716i0, (d0) obj3, (e0) obj2, (wf.n) abstractC3953c2, (wf.o) abstractC3953c, abstractC1725n, p13, i16);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f45713Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(C6729v0 c6729v0, wf.k kVar, AbstractC4326r abstractC4326r, d0 d0Var, e0 e0Var, wf.n nVar, wf.o oVar, int i10, int i11) {
        super(2);
        this.f45713Y = 3;
        this.f45714Z = c6729v0;
        this.f45718k0 = kVar;
        this.f45716i0 = abstractC4326r;
        this.f45715h0 = d0Var;
        this.f45717j0 = e0Var;
        this.f45719l0 = nVar;
        this.f45720m0 = null;
        this.f45721n0 = oVar;
        this.f45722o0 = i10;
        this.f45723p0 = i11;
    }
}
