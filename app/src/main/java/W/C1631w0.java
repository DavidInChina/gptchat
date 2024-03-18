package W;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import jf.AbstractC3953c;
import l0.AbstractC4326r;
import q1.AbstractC5260f;
import wf.AbstractC6216a;

/* renamed from: W.w0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1631w0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f20554Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f20555Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f20556h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f20557i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f20558j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f20559k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f20560l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ Object f20561m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ Object f20562n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1631w0(Q3 q32, boolean z10, boolean z11, D.l lVar, N3 n32, r0.L l10, int i10, int i11) {
        super(2);
        this.f20554Y = 2;
        this.f20561m0 = q32;
        this.f20555Z = z10;
        this.f20557i0 = z11;
        this.f20556h0 = lVar;
        this.f20562n0 = n32;
        this.f20558j0 = l10;
        this.f20559k0 = i10;
        this.f20560l0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f20554Y;
        int i12 = this.f20559k0;
        Object obj = this.f20558j0;
        Object obj2 = this.f20556h0;
        Object obj3 = this.f20562n0;
        Object obj4 = this.f20561m0;
        switch (i11) {
            case 0:
                D.m mVar = (D.m) obj;
                int p10 = AbstractC1734s.p(i12 | 1);
                boolean z10 = this.f20557i0;
                int i13 = this.f20560l0;
                AbstractC1646z0.a(this.f20555Z, (wf.k) obj4, (AbstractC4326r) obj2, z10, (C1626v0) obj3, mVar, abstractC1725n, p10, i13);
                return;
            case 1:
                int p11 = AbstractC1734s.p(i12 | 1);
                boolean z11 = this.f20557i0;
                int i14 = this.f20560l0;
                K2.a(this.f20555Z, (AbstractC6216a) obj4, (AbstractC4326r) obj2, z11, (J2) obj3, (D.m) obj, abstractC1725n, p11, i14);
                return;
            case 2:
                int p12 = AbstractC1734s.p(i12 | 1);
                boolean z12 = this.f20557i0;
                int i15 = this.f20560l0;
                ((Q3) obj4).a(this.f20555Z, z12, (D.l) obj2, (N3) obj3, (r0.L) obj, abstractC1725n, p12, i15);
                return;
            case 3:
                int p13 = AbstractC1734s.p(i12 | 1);
                Bi.c.a((xd.e) obj3, (wf.k) obj4, (AbstractC4326r) obj2, (AbstractC6216a) obj, this.f20555Z, this.f20557i0, abstractC1725n, p13, this.f20560l0);
                return;
            default:
                int p14 = AbstractC1734s.p(i12 | 1);
                AbstractC5260f.c((String) obj4, (String) obj3, (AbstractC4326r) obj2, (AbstractC6216a) obj, this.f20555Z, this.f20557i0, abstractC1725n, p14, this.f20560l0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f20554Y) {
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
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1631w0(String str, String str2, AbstractC4326r abstractC4326r, AbstractC6216a abstractC6216a, boolean z10, boolean z11, int i10, int i11) {
        super(2);
        this.f20554Y = 4;
        this.f20561m0 = str;
        this.f20562n0 = str2;
        this.f20556h0 = abstractC4326r;
        this.f20558j0 = abstractC6216a;
        this.f20555Z = z10;
        this.f20557i0 = z11;
        this.f20559k0 = i10;
        this.f20560l0 = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1631w0(xd.e eVar, wf.k kVar, AbstractC4326r abstractC4326r, AbstractC6216a abstractC6216a, boolean z10, boolean z11, int i10, int i11) {
        super(2);
        this.f20554Y = 3;
        this.f20562n0 = eVar;
        this.f20561m0 = kVar;
        this.f20556h0 = abstractC4326r;
        this.f20558j0 = abstractC6216a;
        this.f20555Z = z10;
        this.f20557i0 = z11;
        this.f20559k0 = i10;
        this.f20560l0 = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1631w0(boolean z10, AbstractC3953c abstractC3953c, AbstractC4326r abstractC4326r, boolean z11, Object obj, D.m mVar, int i10, int i11, int i12) {
        super(2);
        this.f20554Y = i12;
        this.f20555Z = z10;
        this.f20561m0 = abstractC3953c;
        this.f20556h0 = abstractC4326r;
        this.f20557i0 = z11;
        this.f20562n0 = obj;
        this.f20558j0 = mVar;
        this.f20559k0 = i10;
        this.f20560l0 = i11;
    }
}
