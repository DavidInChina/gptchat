package G0;

import E0.AbstractC0442a;
import b0.C2104h;
import id.AbstractC3557B;
import java.util.LinkedHashMap;

/* renamed from: G0.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0594x extends T {

    /* renamed from: t0  reason: collision with root package name */
    public final /* synthetic */ int f5839t0 = 1;

    /* renamed from: u0  reason: collision with root package name */
    public final /* synthetic */ g0 f5840u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0594x(C0595y c0595y) {
        super(c0595y);
        this.f5840u0 = c0595y;
    }

    @Override // E0.r
    public final int S(int i10) {
        switch (this.f5839t0) {
            case 0:
                C0596z c0596z = this.f5673n0.f5770n0.f24858v0;
                E0.N a5 = c0596z.a();
                androidx.compose.ui.node.a aVar = c0596z.f5848a;
                return a5.c(aVar.f24831B0.f5702c, aVar.m(), i10);
            default:
                D d10 = (D) this.f5840u0;
                C c10 = d10.f5592L0;
                g0 g0Var = d10.f5771o0;
                AbstractC3557B.Z(g0Var);
                T E02 = g0Var.E0();
                AbstractC3557B.Z(E02);
                return c10.c(this, E02, i10);
        }
    }

    @Override // E0.r
    public final int c(int i10) {
        switch (this.f5839t0) {
            case 0:
                C0596z c0596z = this.f5673n0.f5770n0.f24858v0;
                E0.N a5 = c0596z.a();
                androidx.compose.ui.node.a aVar = c0596z.f5848a;
                return a5.e(aVar.f24831B0.f5702c, aVar.m(), i10);
            default:
                D d10 = (D) this.f5840u0;
                C c10 = d10.f5592L0;
                g0 g0Var = d10.f5771o0;
                AbstractC3557B.Z(g0Var);
                T E02 = g0Var.E0();
                AbstractC3557B.Z(E02);
                return c10.i(this, E02, i10);
        }
    }

    @Override // G0.S
    public final int h0(AbstractC0442a abstractC0442a) {
        int i10;
        LinkedHashMap linkedHashMap = this.f5678s0;
        switch (this.f5839t0) {
            case 0:
                L l10 = this.f5673n0.f5770n0.t().f5662p;
                AbstractC3557B.Z(l10);
                boolean z10 = l10.f5607o0;
                P p10 = l10.f5613u0;
                if (!z10) {
                    O o10 = l10.f5602B0;
                    if (o10.f5649c == 2) {
                        p10.f5713f = true;
                        if (p10.f5709b) {
                            o10.f5654h = true;
                            o10.f5655i = true;
                        }
                    } else {
                        p10.f5714g = true;
                    }
                }
                T t10 = l10.e().f5847M0;
                if (t10 != null) {
                    t10.f5671l0 = true;
                }
                l10.H();
                T t11 = l10.e().f5847M0;
                if (t11 != null) {
                    t11.f5671l0 = false;
                }
                Integer num = (Integer) p10.f5716i.get(abstractC0442a);
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = Integer.MIN_VALUE;
                }
                linkedHashMap.put(abstractC0442a, Integer.valueOf(i10));
                return i10;
            default:
                int c10 = AbstractC0579h.c(this, abstractC0442a);
                linkedHashMap.put(abstractC0442a, Integer.valueOf(c10));
                return c10;
        }
    }

    @Override // E0.r
    public final int l(int i10) {
        switch (this.f5839t0) {
            case 0:
                C0596z c0596z = this.f5673n0.f5770n0.f24858v0;
                E0.N a5 = c0596z.a();
                androidx.compose.ui.node.a aVar = c0596z.f5848a;
                return a5.d(aVar.f24831B0.f5702c, aVar.m(), i10);
            default:
                D d10 = (D) this.f5840u0;
                C c10 = d10.f5592L0;
                g0 g0Var = d10.f5771o0;
                AbstractC3557B.Z(g0Var);
                T E02 = g0Var.E0();
                AbstractC3557B.Z(E02);
                return c10.d(this, E02, i10);
        }
    }

    @Override // E0.r
    public final int m(int i10) {
        switch (this.f5839t0) {
            case 0:
                C0596z c0596z = this.f5673n0.f5770n0.f24858v0;
                E0.N a5 = c0596z.a();
                androidx.compose.ui.node.a aVar = c0596z.f5848a;
                return a5.b(aVar.f24831B0.f5702c, aVar.m(), i10);
            default:
                D d10 = (D) this.f5840u0;
                C c10 = d10.f5592L0;
                g0 g0Var = d10.f5771o0;
                AbstractC3557B.Z(g0Var);
                T E02 = g0Var.E0();
                AbstractC3557B.Z(E02);
                return c10.h(this, E02, i10);
        }
    }

    @Override // E0.M
    public final E0.d0 o(long j6) {
        switch (this.f5839t0) {
            case 0:
                d0(j6);
                g0 g0Var = this.f5673n0;
                C2104h J10 = g0Var.f5770n0.J();
                int i10 = J10.f25569h0;
                if (i10 > 0) {
                    Object[] objArr = J10.f25567Y;
                    int i11 = 0;
                    do {
                        L y10 = ((androidx.compose.ui.node.a) objArr[i11]).y();
                        AbstractC3557B.Z(y10);
                        y10.f5606n0 = 3;
                        i11++;
                    } while (i11 < i10);
                    androidx.compose.ui.node.a aVar = g0Var.f5770n0;
                    T.u0(this, aVar.f24857u0.a(this, aVar.m(), j6));
                    return this;
                }
                androidx.compose.ui.node.a aVar2 = g0Var.f5770n0;
                T.u0(this, aVar2.f24857u0.a(this, aVar2.m(), j6));
                return this;
            default:
                D d10 = (D) this.f5840u0;
                d0(j6);
                d10.getClass();
                C c10 = d10.f5592L0;
                g0 g0Var2 = d10.f5771o0;
                AbstractC3557B.Z(g0Var2);
                T E02 = g0Var2.E0();
                AbstractC3557B.Z(E02);
                T.u0(this, c10.e(this, E02, j6));
                return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0594x(D d10) {
        super(d10);
        this.f5840u0 = d10;
    }
}
