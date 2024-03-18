package H2;

import java.util.Comparator;
import p2.h0;
import x8.E;
import x8.N;
import x8.i0;
import x8.r0;

/* loaded from: classes2.dex */
public final class l extends n implements Comparable {

    /* renamed from: j0  reason: collision with root package name */
    public final int f7291j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f7292k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f7293l0;

    /* renamed from: m0  reason: collision with root package name */
    public final boolean f7294m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f7295n0;

    /* renamed from: o0  reason: collision with root package name */
    public final int f7296o0;

    /* renamed from: p0  reason: collision with root package name */
    public final int f7297p0;

    /* renamed from: q0  reason: collision with root package name */
    public final int f7298q0;

    /* renamed from: r0  reason: collision with root package name */
    public final boolean f7299r0;

    public l(int i10, h0 h0Var, int i11, i iVar, int i12, String str) {
        super(i10, i11, h0Var);
        boolean z10;
        boolean z11;
        N n10;
        int i13;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14 = 0;
        this.f7292k0 = p.f(i12, false);
        int i15 = this.f7303i0.f42311i0 & (~iVar.f42162A0);
        if ((i15 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f7293l0 = z10;
        if ((i15 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f7294m0 = z11;
        N n11 = iVar.f42187y0;
        if (n11.isEmpty()) {
            n10 = N.u0("");
        } else {
            n10 = n11;
        }
        int i16 = 0;
        while (true) {
            if (i16 < n10.size()) {
                i13 = p.e(this.f7303i0, (String) n10.get(i16), iVar.f42163B0);
                if (i13 > 0) {
                    break;
                }
                i16++;
            } else {
                i16 = Integer.MAX_VALUE;
                i13 = 0;
                break;
            }
        }
        this.f7295n0 = i16;
        this.f7296o0 = i13;
        int b10 = p.b(this.f7303i0.f42312j0, iVar.f42188z0);
        this.f7297p0 = b10;
        if ((this.f7303i0.f42312j0 & 1088) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f7299r0 = z12;
        if (p.h(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int e10 = p.e(this.f7303i0, str, z13);
        this.f7298q0 = e10;
        if (i13 <= 0 && ((!n11.isEmpty() || b10 <= 0) && !this.f7293l0 && (!this.f7294m0 || e10 <= 0))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (p.f(i12, iVar.f7279v1) && z14) {
            i14 = 1;
        }
        this.f7291j0 = i14;
    }

    @Override // H2.n
    public final int a() {
        return this.f7291j0;
    }

    @Override // H2.n
    public final /* bridge */ /* synthetic */ boolean b(n nVar) {
        l lVar = (l) nVar;
        return false;
    }

    /* renamed from: c */
    public final int compareTo(l lVar) {
        E c10 = E.f49509a.c(this.f7292k0, lVar.f7292k0);
        Integer valueOf = Integer.valueOf(this.f7295n0);
        Integer valueOf2 = Integer.valueOf(lVar.f7295n0);
        Comparator comparator = i0.f49570Y;
        comparator.getClass();
        r0 r0Var = r0.f49607Y;
        E b10 = c10.b(valueOf, valueOf2, r0Var);
        int i10 = this.f7296o0;
        E a5 = b10.a(i10, lVar.f7296o0);
        int i11 = this.f7297p0;
        E c11 = a5.a(i11, lVar.f7297p0).c(this.f7293l0, lVar.f7293l0);
        Boolean valueOf3 = Boolean.valueOf(this.f7294m0);
        Boolean valueOf4 = Boolean.valueOf(lVar.f7294m0);
        if (i10 != 0) {
            comparator = r0Var;
        }
        E a10 = c11.b(valueOf3, valueOf4, comparator).a(this.f7298q0, lVar.f7298q0);
        if (i11 == 0) {
            a10 = a10.d(this.f7299r0, lVar.f7299r0);
        }
        return a10.e();
    }
}
