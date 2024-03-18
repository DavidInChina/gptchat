package W;

import Rb.C1265k;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;
import wf.AbstractC6216a;

/* renamed from: W.x0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1636x0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f20587Y = 2;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f20588Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f20589h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f20590i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f20591j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f20592k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1636x0(Rb.M m10, C1265k c1265k, boolean z10, wf.k kVar, int i10) {
        super(2);
        this.f20590i0 = m10;
        this.f20591j0 = c1265k;
        this.f20588Z = z10;
        this.f20592k0 = kVar;
        this.f20589h0 = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f20587Y;
        int i12 = this.f20589h0;
        Object obj = this.f20592k0;
        Object obj2 = this.f20591j0;
        Object obj3 = this.f20590i0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                AbstractC1646z0.b(this.f20588Z, (M0.a) obj3, (AbstractC4326r) obj2, (C1626v0) obj, abstractC1725n, p10);
                return;
            case 1:
                A7.b.A((AbstractC6216a) obj3, (AbstractC6216a) obj2, (AbstractC6216a) obj, this.f20588Z, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                Bi.c.u((Rb.M) obj3, (C1265k) obj2, this.f20588Z, (wf.k) obj, abstractC1725n, p11);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f20587Y) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1636x0(AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, AbstractC6216a abstractC6216a3, boolean z10, int i10) {
        super(2);
        this.f20590i0 = abstractC6216a;
        this.f20591j0 = abstractC6216a2;
        this.f20592k0 = abstractC6216a3;
        this.f20588Z = z10;
        this.f20589h0 = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1636x0(boolean z10, M0.a aVar, AbstractC4326r abstractC4326r, C1626v0 c1626v0, int i10) {
        super(2);
        this.f20588Z = z10;
        this.f20590i0 = aVar;
        this.f20591j0 = abstractC4326r;
        this.f20592k0 = c1626v0;
        this.f20589h0 = i10;
    }
}
