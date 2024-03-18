package W;

import Z.AbstractC1725n;

/* renamed from: W.t2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1618t2 extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f20425Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f20426Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f20427h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f20428i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ T0.I f20429j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ D.m f20430k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ boolean f20431l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ wf.n f20432m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ wf.n f20433n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ wf.n f20434o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ wf.n f20435p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ wf.n f20436q0;

    /* renamed from: r0  reason: collision with root package name */
    public final /* synthetic */ wf.n f20437r0;

    /* renamed from: s0  reason: collision with root package name */
    public final /* synthetic */ wf.n f20438s0;

    /* renamed from: t0  reason: collision with root package name */
    public final /* synthetic */ r0.L f20439t0;

    /* renamed from: u0  reason: collision with root package name */
    public final /* synthetic */ N3 f20440u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1618t2(Object obj, boolean z10, boolean z11, T0.I i10, D.m mVar, boolean z12, wf.n nVar, wf.n nVar2, wf.n nVar3, wf.n nVar4, wf.n nVar5, wf.n nVar6, wf.n nVar7, N3 n32, r0.L l10, int i11) {
        super(3);
        this.f20425Y = i11;
        this.f20426Z = obj;
        this.f20427h0 = z10;
        this.f20428i0 = z11;
        this.f20429j0 = i10;
        this.f20430k0 = mVar;
        this.f20431l0 = z12;
        this.f20432m0 = nVar;
        this.f20433n0 = nVar2;
        this.f20434o0 = nVar3;
        this.f20435p0 = nVar4;
        this.f20436q0 = nVar5;
        this.f20437r0 = nVar6;
        this.f20438s0 = nVar7;
        this.f20440u0 = n32;
        this.f20439t0 = l10;
    }

    public final void a(wf.n nVar, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        AbstractC1725n abstractC1725n2;
        int i12;
        int i13;
        int i14 = this.f20425Y;
        Object obj = this.f20426Z;
        int i15 = 2;
        switch (i14) {
            case 0:
                if ((i10 & 6) == 0) {
                    abstractC1725n2 = abstractC1725n;
                    if (((Z.r) abstractC1725n2).i(nVar)) {
                        i15 = 4;
                    }
                    i11 = i10 | i15;
                } else {
                    abstractC1725n2 = abstractC1725n;
                    i11 = i10;
                }
                if ((i11 & 19) == 18) {
                    Z.r rVar = (Z.r) abstractC1725n2;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                r0.L l10 = this.f20439t0;
                boolean z10 = this.f20427h0;
                boolean z11 = this.f20431l0;
                D.m mVar = this.f20430k0;
                N3 n32 = this.f20440u0;
                C1608r2.f20379a.b((String) obj, nVar, z10, this.f20428i0, this.f20429j0, mVar, z11, this.f20432m0, this.f20433n0, this.f20434o0, this.f20435p0, this.f20436q0, this.f20437r0, this.f20438s0, n32, null, R4.b.X(abstractC1725n2, 2108828640, new C1613s2(z10, z11, mVar, n32, l10, 0)), abstractC1725n, (i11 << 3) & 112, 14155776, 32768);
                return;
            case 1:
                if ((i10 & 6) == 0) {
                    if (((Z.r) abstractC1725n).i(nVar)) {
                        i15 = 4;
                    }
                    i12 = i10 | i15;
                } else {
                    i12 = i10;
                }
                if ((i12 & 19) == 18) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                Q3.f19588a.b((String) obj, nVar, this.f20427h0, this.f20428i0, this.f20429j0, this.f20430k0, this.f20431l0, this.f20432m0, this.f20433n0, this.f20434o0, this.f20435p0, this.f20436q0, this.f20437r0, this.f20438s0, this.f20439t0, this.f20440u0, null, null, abstractC1725n, (i12 << 3) & 112, 100663296, 196608);
                return;
            default:
                if ((i10 & 6) == 0) {
                    if (((Z.r) abstractC1725n).i(nVar)) {
                        i15 = 4;
                    }
                    i13 = i10 | i15;
                } else {
                    i13 = i10;
                }
                if ((i13 & 19) == 18) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                C1608r2 c1608r2 = C1608r2.f20379a;
                String str = ((T0.z) obj).f16830a.f12512Y;
                r0.L l11 = this.f20439t0;
                boolean z12 = this.f20427h0;
                boolean z13 = this.f20431l0;
                D.m mVar2 = this.f20430k0;
                N3 n33 = this.f20440u0;
                c1608r2.b(str, nVar, z12, this.f20428i0, this.f20429j0, mVar2, z13, this.f20432m0, this.f20433n0, this.f20434o0, this.f20435p0, this.f20436q0, this.f20437r0, this.f20438s0, n33, null, R4.b.X(abstractC1725n, 255570733, new C1613s2(z12, z13, mVar2, n33, l11, 1)), abstractC1725n, (i13 << 3) & 112, 14155776, 32768);
                return;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f20425Y) {
            case 0:
                a((wf.n) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 1:
                a((wf.n) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((wf.n) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1618t2(String str, boolean z10, boolean z11, T0.I i10, D.m mVar, boolean z12, wf.n nVar, wf.n nVar2, wf.n nVar3, wf.n nVar4, wf.n nVar5, wf.n nVar6, wf.n nVar7, r0.L l10, N3 n32) {
        super(3);
        this.f20425Y = 1;
        this.f20426Z = str;
        this.f20427h0 = z10;
        this.f20428i0 = z11;
        this.f20429j0 = i10;
        this.f20430k0 = mVar;
        this.f20431l0 = z12;
        this.f20432m0 = nVar;
        this.f20433n0 = nVar2;
        this.f20434o0 = nVar3;
        this.f20435p0 = nVar4;
        this.f20436q0 = nVar5;
        this.f20437r0 = nVar6;
        this.f20438s0 = nVar7;
        this.f20439t0 = l10;
        this.f20440u0 = n32;
    }
}
