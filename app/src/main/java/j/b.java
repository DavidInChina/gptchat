package J;

import A.AbstractC0040r0;
import A.AbstractC0048v0;
import D.l;
import L0.g;
import M3.H;
import W.EnumC1612s1;
import W.N3;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.r;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import l0.C4323o;
import nf.AbstractC4828h;
import r9.y;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class b extends o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8714Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f8715Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f8716h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f8717i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f8718j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, N3 n32, boolean z10, boolean z11) {
        super(3);
        this.f8717i0 = n32;
        this.f8715Z = z10;
        this.f8716h0 = z11;
        this.f8718j0 = lVar;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j6;
        int i10 = this.f8714Y;
        Object obj4 = this.f8718j0;
        Object obj5 = this.f8717i0;
        switch (i10) {
            case 0:
                AbstractC4326r abstractC4326r = (AbstractC4326r) obj;
                ((Number) obj3).intValue();
                r rVar = (r) ((AbstractC1725n) obj2);
                rVar.W(-2124609672);
                C4323o c4323o = C4323o.f37719b;
                rVar.W(-492369756);
                Object K10 = rVar.K();
                if (K10 == C1723m.f22654Y) {
                    K10 = m.d();
                    rVar.h0(K10);
                }
                rVar.t(false);
                AbstractC4326r p02 = H.p0(c4323o, this.f8715Z, (D.m) K10, (AbstractC0040r0) rVar.m(AbstractC0048v0.f314a), this.f8716h0, (g) obj5, (AbstractC6216a) obj4);
                rVar.t(false);
                return p02;
            default:
                EnumC1612s1 enumC1612s1 = (EnumC1612s1) obj;
                ((Number) obj3).intValue();
                r rVar2 = (r) ((AbstractC1725n) obj2);
                rVar2.W(-502832279);
                N3 n32 = (N3) obj5;
                n32.getClass();
                rVar2.W(1167161306);
                AbstractC1710f0 a02 = y.a0((l) obj4, rVar2, 0);
                if (!this.f8715Z) {
                    j6 = n32.f19455z;
                } else if (this.f8716h0) {
                    j6 = n32.f19415A;
                } else if (((Boolean) a02.getValue()).booleanValue()) {
                    j6 = n32.f19453x;
                } else {
                    j6 = n32.f19454y;
                }
                AbstractC1710f0 g02 = AbstractC4828h.g0(new r0.r(j6), rVar2);
                rVar2.t(false);
                long j10 = ((r0.r) g02.getValue()).f44265a;
                rVar2.t(false);
                return new r0.r(j10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z10, boolean z11, g gVar, AbstractC6216a abstractC6216a) {
        super(3);
        this.f8715Z = z10;
        this.f8716h0 = z11;
        this.f8717i0 = gVar;
        this.f8718j0 = abstractC6216a;
    }
}
