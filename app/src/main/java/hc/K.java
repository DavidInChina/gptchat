package hc;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import ic.AbstractC3552w;
import jf.AbstractC3953c;
import l0.AbstractC4326r;
import nc.AbstractC4808A;
import pc.b0;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class K extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32150Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f32151Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f32152h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f32153i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f32154j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f32155k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(Tc.f fVar, AbstractC4326r abstractC4326r, Ad.g gVar, int i10, int i11, int i12) {
        super(2);
        this.f32150Y = i12;
        this.f32151Z = fVar;
        this.f32152h0 = abstractC4326r;
        this.f32155k0 = gVar;
        this.f32153i0 = i10;
        this.f32154j0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f32150Y;
        int i12 = this.f32153i0;
        Object obj = this.f32155k0;
        Object obj2 = this.f32151Z;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                int i13 = this.f32154j0;
                Ad.l.j((Tc.f) obj2, this.f32152h0, (M) obj, abstractC1725n, p10, i13);
                return;
            case 1:
                int p11 = AbstractC1734s.p(i12 | 1);
                int i14 = this.f32154j0;
                K8.d.N((Tc.f) obj2, this.f32152h0, (AbstractC3552w) obj, abstractC1725n, p11, i14);
                return;
            case 2:
                K8.d.c0((w9.j) obj2, (AbstractC6216a) obj, this.f32152h0, abstractC1725n, AbstractC1734s.p(i12 | 1), this.f32154j0);
                return;
            case 3:
                r9.y.A((ic.P) obj2, (wf.k) obj, this.f32152h0, abstractC1725n, AbstractC1734s.p(i12 | 1), this.f32154j0);
                return;
            case 4:
                int p12 = AbstractC1734s.p(i12 | 1);
                int i15 = this.f32154j0;
                r9.y.B((Tc.f) obj2, this.f32152h0, (ic.Q) obj, abstractC1725n, p12, i15);
                return;
            case 5:
                L4.a.z((Ec.o) obj2, (wf.k) obj, this.f32152h0, abstractC1725n, AbstractC1734s.p(i12 | 1), this.f32154j0);
                return;
            case 6:
                Bi.c.v((zd.d) obj2, (wf.k) obj, this.f32152h0, abstractC1725n, AbstractC1734s.p(i12 | 1), this.f32154j0);
                return;
            case 7:
                int p13 = AbstractC1734s.p(i12 | 1);
                int i16 = this.f32154j0;
                Ad.l.u((Tc.f) obj2, this.f32152h0, (nc.h) obj, abstractC1725n, p13, i16);
                return;
            case 8:
                nc.y.a((Tc.f) obj2, this.f32152h0, (AbstractC4808A) obj, abstractC1725n, AbstractC1734s.p(i12 | 1), this.f32154j0);
                return;
            case 9:
                int p14 = AbstractC1734s.p(i12 | 1);
                int i17 = this.f32154j0;
                K8.d.a0((Tc.f) obj2, this.f32152h0, (b0) obj, abstractC1725n, p14, i17);
                return;
            default:
                Ec.y.c((Ec.C) obj2, (AbstractC6216a) obj, this.f32152h0, abstractC1725n, AbstractC1734s.p(i12 | 1), this.f32154j0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f32150Y) {
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
            case 4:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 5:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 6:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 7:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 8:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 9:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(Object obj, AbstractC3953c abstractC3953c, AbstractC4326r abstractC4326r, int i10, int i11, int i12) {
        super(2);
        this.f32150Y = i12;
        this.f32151Z = obj;
        this.f32155k0 = abstractC3953c;
        this.f32152h0 = abstractC4326r;
        this.f32153i0 = i10;
        this.f32154j0 = i11;
    }
}
