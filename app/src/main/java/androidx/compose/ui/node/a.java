package androidx.compose.ui.node;

import A.C0007a0;
import E0.J;
import E0.N;
import E0.V;
import E0.c0;
import E0.g0;
import E9.f;
import G0.AbstractC0579h;
import G0.AbstractC0584m;
import G0.AbstractC0587p;
import G0.AbstractC0591u;
import G0.C0571a;
import G0.C0572a0;
import G0.C0589s;
import G0.C0593w;
import G0.C0595y;
import G0.C0596z;
import G0.D;
import G0.E;
import G0.F;
import G0.G;
import G0.H;
import G0.I;
import G0.L;
import G0.M;
import G0.O;
import G0.P;
import G0.X;
import G0.Y;
import G0.b0;
import G0.n0;
import G0.o0;
import G0.p0;
import G0.q0;
import G0.r0;
import G0.t0;
import G0.w0;
import H0.C0714y;
import H0.Y0;
import L0.j;
import Z.A;
import Z.AbstractC1719k;
import Z.B;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import b0.C2104h;
import c1.l;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.List;
import k6.AbstractC4194d;
import kf.v;
import l0.AbstractC4324p;
import l0.AbstractC4325q;
import l0.AbstractC4326r;
import l0.C4320l;
import l0.C4323o;
import p0.g;
import p0.q;
import r0.AbstractC5352p;
import v.C5934c;
import wf.AbstractC6216a;
import wf.k;
import z.AbstractC6708l;
import z.C6672L;

/* loaded from: classes2.dex */
public final class a implements AbstractC1719k, g0, q0, AbstractC0584m, p0 {

    /* renamed from: M0  reason: collision with root package name */
    public static final F f24827M0 = new G("Undefined intrinsics block and it is required");

    /* renamed from: N0  reason: collision with root package name */
    public static final E f24828N0 = new Object();

    /* renamed from: O0  reason: collision with root package name */
    public static final C5934c f24829O0 = new C5934c(2);

    /* renamed from: A0  reason: collision with root package name */
    public boolean f24830A0;

    /* renamed from: B0  reason: collision with root package name */
    public final C0572a0 f24831B0;

    /* renamed from: C0  reason: collision with root package name */
    public J f24832C0;

    /* renamed from: D0  reason: collision with root package name */
    public G0.g0 f24833D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f24834E0;

    /* renamed from: F0  reason: collision with root package name */
    public AbstractC4326r f24835F0;

    /* renamed from: G0  reason: collision with root package name */
    public k f24836G0;

    /* renamed from: H0  reason: collision with root package name */
    public k f24837H0;

    /* renamed from: I0  reason: collision with root package name */
    public boolean f24838I0;

    /* renamed from: J0  reason: collision with root package name */
    public boolean f24839J0;

    /* renamed from: K0  reason: collision with root package name */
    public int f24840K0;

    /* renamed from: L0  reason: collision with root package name */
    public int f24841L0;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f24842Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f24843Z;

    /* renamed from: h0  reason: collision with root package name */
    public a f24844h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f24845i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Y f24846j0;

    /* renamed from: k0  reason: collision with root package name */
    public C2104h f24847k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f24848l0;
    private final O layoutDelegate;

    /* renamed from: m0  reason: collision with root package name */
    public a f24849m0;

    /* renamed from: n0  reason: collision with root package name */
    public Owner f24850n0;

    /* renamed from: o0  reason: collision with root package name */
    public l f24851o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f24852p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f24853q0;

    /* renamed from: r0  reason: collision with root package name */
    public j f24854r0;

    /* renamed from: s0  reason: collision with root package name */
    public final C2104h f24855s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f24856t0;

    /* renamed from: u0  reason: collision with root package name */
    public N f24857u0;

    /* renamed from: v0  reason: collision with root package name */
    public final C0596z f24858v0;

    /* renamed from: w0  reason: collision with root package name */
    public Z0.b f24859w0;

    /* renamed from: x0  reason: collision with root package name */
    public Z0.l f24860x0;

    /* renamed from: y0  reason: collision with root package name */
    public Y0 f24861y0;

    /* renamed from: z0  reason: collision with root package name */
    public B f24862z0;

    public a(int i10, boolean z10, int i11) {
        this(L0.l.f10412a.addAndGet(1), (i10 & 1) != 0 ? false : z10);
    }

    public static boolean X(a aVar) {
        Z0.a aVar2;
        L l10 = aVar.layoutDelegate.f5662p;
        if (l10 != null) {
            aVar2 = l10.f5610r0;
        } else {
            aVar2 = null;
        }
        return aVar.W(aVar2);
    }

    public static boolean i0(a aVar) {
        Z0.a aVar2;
        M m10 = aVar.layoutDelegate.f5661o;
        if (m10.f5632n0) {
            aVar2 = new Z0.a(m10.f4056i0);
        } else {
            aVar2 = null;
        }
        return aVar.h0(aVar2);
    }

    public static void n0(a aVar, boolean z10, int i10) {
        a E10;
        boolean z11 = false;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if (aVar.f24844h0 != null) {
            Owner owner = aVar.f24850n0;
            if (owner != null && !aVar.f24853q0 && !aVar.f24842Y) {
                ((C0714y) owner).t(aVar, true, z10, z11);
                L l10 = aVar.layoutDelegate.f5662p;
                AbstractC3557B.Z(l10);
                O o10 = l10.f5602B0;
                a E11 = o10.f5647a.E();
                int i11 = o10.f5647a.f24840K0;
                if (E11 != null && i11 != 3) {
                    while (E11.f24840K0 == i11 && (E10 = E11.E()) != null) {
                        E11 = E10;
                    }
                    int f6 = AbstractC6708l.f(i11);
                    if (f6 != 0) {
                        if (f6 == 1) {
                            if (E11.f24844h0 != null) {
                                E11.m0(z10);
                                return;
                            } else {
                                E11.o0(z10);
                                return;
                            }
                        }
                        throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                    } else if (E11.f24844h0 != null) {
                        n0(E11, z10, 2);
                        return;
                    } else {
                        p0(E11, z10, 2);
                        return;
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope".toString());
    }

    public static void p0(a aVar, boolean z10, int i10) {
        boolean z11;
        Owner owner;
        a E10;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!aVar.f24853q0 && !aVar.f24842Y && (owner = aVar.f24850n0) != null) {
            int i11 = o0.f5814a;
            ((C0714y) owner).t(aVar, false, z10, z11);
            O o10 = aVar.layoutDelegate.f5661o.f5628J0;
            a E11 = o10.f5647a.E();
            int i12 = o10.f5647a.f24840K0;
            if (E11 != null && i12 != 3) {
                while (E11.f24840K0 == i12 && (E10 = E11.E()) != null) {
                    E11 = E10;
                }
                int f6 = AbstractC6708l.f(i12);
                if (f6 != 0) {
                    if (f6 == 1) {
                        E11.o0(z10);
                        return;
                    }
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
                p0(E11, z10, 2);
            }
        }
    }

    public static void q0(a aVar) {
        if (H.f5595a[AbstractC6708l.f(aVar.layoutDelegate.f5649c)] == 1) {
            O o10 = aVar.layoutDelegate;
            if (o10.f5653g) {
                n0(aVar, true, 2);
                return;
            }
            if (o10.f5654h) {
                aVar.m0(true);
            }
            O o11 = aVar.layoutDelegate;
            if (o11.f5650d) {
                p0(aVar, true, 2);
                return;
            } else if (o11.f5651e) {
                aVar.o0(true);
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException("Unexpected state ".concat(f.I(aVar.layoutDelegate.f5649c)));
    }

    public final boolean A() {
        return this.layoutDelegate.f5650d;
    }

    public final int B() {
        return this.layoutDelegate.f5661o.f5634p0;
    }

    public final int C() {
        int i10;
        L l10 = this.layoutDelegate.f5662p;
        if (l10 == null || (i10 = l10.f5606n0) == 0) {
            return 3;
        }
        return i10;
    }

    public final List D() {
        C0572a0 c0572a0 = this.f24831B0;
        C2104h c2104h = c0572a0.f5705f;
        if (c2104h == null) {
            return v.f37483Y;
        }
        C2104h c2104h2 = new C2104h(new V[c2104h.f25569h0]);
        AbstractC4325q abstractC4325q = c0572a0.f5704e;
        int i10 = 0;
        while (abstractC4325q != null) {
            w0 w0Var = c0572a0.f5703d;
            if (abstractC4325q == w0Var) {
                break;
            }
            G0.g0 g0Var = abstractC4325q.f37727m0;
            if (g0Var != null) {
                n0 n0Var = g0Var.f5769F0;
                n0 n0Var2 = c0572a0.f5701b.f5769F0;
                AbstractC4325q abstractC4325q2 = abstractC4325q.f37725k0;
                if (abstractC4325q2 != w0Var || g0Var == abstractC4325q2.f37727m0) {
                    n0Var2 = null;
                }
                if (n0Var == null) {
                    n0Var = n0Var2;
                }
                c2104h2.b(new V((AbstractC4326r) c2104h.f25567Y[i10], g0Var, n0Var));
                abstractC4325q = abstractC4325q.f37725k0;
                i10++;
            } else {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator".toString());
            }
        }
        return c2104h2.e();
    }

    public final a E() {
        a aVar = this.f24849m0;
        while (aVar != null && aVar.f24842Y) {
            aVar = aVar.f24849m0;
        }
        return aVar;
    }

    public final int F() {
        return this.layoutDelegate.f5661o.f5631m0;
    }

    public final int G() {
        return this.layoutDelegate.f5661o.f4053Y;
    }

    public final float H() {
        return this.layoutDelegate.f5661o.f5622D0;
    }

    public final C2104h I() {
        boolean z10 = this.f24856t0;
        C2104h c2104h = this.f24855s0;
        if (z10) {
            c2104h.f();
            c2104h.c(c2104h.f25569h0, J());
            C5934c c5934c = f24829O0;
            Object[] objArr = c2104h.f25567Y;
            int i10 = c2104h.f25569h0;
            AbstractC3557B.c0("<this>", objArr);
            Arrays.sort(objArr, 0, i10, c5934c);
            this.f24856t0 = false;
        }
        return c2104h;
    }

    public final C2104h J() {
        y0();
        if (this.f24845i0 == 0) {
            return this.f24846j0.f5690a;
        }
        C2104h c2104h = this.f24847k0;
        AbstractC3557B.Z(c2104h);
        return c2104h;
    }

    public final void K(long j6, C0593w c0593w, boolean z10, boolean z11) {
        C0572a0 c0572a0 = this.f24831B0;
        c0572a0.f5702c.J0(G0.g0.f5762J0, c0572a0.f5702c.D0(j6), c0593w, z10, z11);
    }

    public final void L(int i10, a aVar) {
        String str;
        if (aVar.f24849m0 == null) {
            if (aVar.f24850n0 == null) {
                aVar.f24849m0 = this;
                Y y10 = this.f24846j0;
                y10.f5690a.a(i10, aVar);
                y10.f5691b.mo122invoke();
                f0();
                if (aVar.f24842Y) {
                    this.f24845i0++;
                }
                R();
                Owner owner = this.f24850n0;
                if (owner != null) {
                    aVar.c(owner);
                }
                if (aVar.layoutDelegate.f5660n > 0) {
                    O o10 = this.layoutDelegate;
                    o10.b(o10.f5660n + 1);
                    return;
                }
                return;
            }
            throw new IllegalStateException(("Cannot insert " + aVar + " because it already has an owner. This tree: " + f(0) + " Other tree: " + aVar.f(0)).toString());
        }
        StringBuilder sb2 = new StringBuilder("Cannot insert ");
        sb2.append(aVar);
        sb2.append(" because it already has a parent. This tree: ");
        sb2.append(f(0));
        sb2.append(" Other tree: ");
        a aVar2 = aVar.f24849m0;
        if (aVar2 != null) {
            str = aVar2.f(0);
        } else {
            str = null;
        }
        sb2.append(str);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public final void M() {
        n0 n0Var;
        if (this.f24834E0) {
            C0572a0 c0572a0 = this.f24831B0;
            G0.g0 g0Var = c0572a0.f5701b;
            G0.g0 g0Var2 = c0572a0.f5702c.f5772p0;
            this.f24833D0 = null;
            while (true) {
                if (AbstractC3557B.K(g0Var, g0Var2)) {
                    break;
                }
                if (g0Var != null) {
                    n0Var = g0Var.f5769F0;
                } else {
                    n0Var = null;
                }
                if (n0Var != null) {
                    this.f24833D0 = g0Var;
                    break;
                } else if (g0Var != null) {
                    g0Var = g0Var.f5772p0;
                } else {
                    g0Var = null;
                }
            }
        }
        G0.g0 g0Var3 = this.f24833D0;
        if (g0Var3 != null && g0Var3.f5769F0 == null) {
            throw new IllegalStateException("layer was not set".toString());
        }
        if (g0Var3 != null) {
            g0Var3.L0();
            return;
        }
        a E10 = E();
        if (E10 != null) {
            E10.M();
        }
    }

    public final void N() {
        C0572a0 c0572a0 = this.f24831B0;
        G0.g0 g0Var = c0572a0.f5702c;
        C0595y c0595y = c0572a0.f5701b;
        while (g0Var != c0595y) {
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator", g0Var);
            D d10 = (D) g0Var;
            n0 n0Var = d10.f5769F0;
            if (n0Var != null) {
                n0Var.invalidate();
            }
            g0Var = d10.f5771o0;
        }
        n0 n0Var2 = c0572a0.f5701b.f5769F0;
        if (n0Var2 != null) {
            n0Var2.invalidate();
        }
    }

    public final void O() {
        if (this.f24844h0 != null) {
            n0(this, false, 3);
        } else {
            p0(this, false, 3);
        }
    }

    public final void P() {
        O o10 = this.layoutDelegate;
        o10.f5661o.f5639u0 = true;
        L l10 = o10.f5662p;
        if (l10 != null) {
            l10.f5617y0 = true;
        }
    }

    public final void Q() {
        this.f24854r0 = null;
        ((C0714y) AbstractC0579h.C(this)).u();
    }

    public final void R() {
        a aVar;
        if (this.f24845i0 > 0) {
            this.f24848l0 = true;
        }
        if (this.f24842Y && (aVar = this.f24849m0) != null) {
            aVar.R();
        }
    }

    public final boolean S() {
        if (this.f24850n0 != null) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        return this.layoutDelegate.f5661o.f5641w0;
    }

    public final boolean U() {
        return this.layoutDelegate.f5661o.f5642x0;
    }

    public final Boolean V() {
        L l10 = this.layoutDelegate.f5662p;
        if (l10 != null) {
            return Boolean.valueOf(l10.f5612t0);
        }
        return null;
    }

    public final boolean W(Z0.a aVar) {
        if (aVar != null && this.f24844h0 != null) {
            L l10 = this.layoutDelegate.f5662p;
            AbstractC3557B.Z(l10);
            return l10.r0(aVar.f22782a);
        }
        return false;
    }

    public final void Y() {
        a E10;
        if (this.f24840K0 == 3) {
            e();
        }
        L l10 = this.layoutDelegate.f5662p;
        AbstractC3557B.Z(l10);
        try {
            l10.f5603k0 = true;
            if (l10.f5608p0) {
                l10.f5601A0 = false;
                boolean z10 = l10.f5612t0;
                l10.X(l10.f5611s0, 0.0f, null);
                if (z10 && !l10.f5601A0 && (E10 = l10.f5602B0.f5647a.E()) != null) {
                    E10.m0(false);
                }
                return;
            }
            throw new IllegalStateException("replace() called on item that was not placed".toString());
        } finally {
            l10.f5603k0 = false;
        }
    }

    public final void Z() {
        O o10 = this.layoutDelegate;
        o10.f5651e = true;
        o10.f5652f = true;
    }

    @Override // Z.AbstractC1719k
    public final void a() {
        l lVar = this.f24851o0;
        if (lVar != null) {
            lVar.a();
        }
        J j6 = this.f24832C0;
        if (j6 != null) {
            j6.a();
        }
        C0572a0 c0572a0 = this.f24831B0;
        G0.g0 g0Var = c0572a0.f5701b.f5771o0;
        for (G0.g0 g0Var2 = c0572a0.f5702c; !AbstractC3557B.K(g0Var2, g0Var) && g0Var2 != null; g0Var2 = g0Var2.f5771o0) {
            g0Var2.f5773q0 = true;
            g0Var2.f5767D0.mo122invoke();
            if (g0Var2.f5769F0 != null) {
                g0Var2.Y0(null, false);
            }
        }
    }

    public final void a0() {
        O o10 = this.layoutDelegate;
        o10.f5654h = true;
        o10.f5655i = true;
    }

    @Override // Z.AbstractC1719k
    public final void b() {
        l lVar = this.f24851o0;
        if (lVar != null) {
            lVar.b();
        }
        J j6 = this.f24832C0;
        if (j6 != null) {
            j6.e(true);
        }
        this.f24839J0 = true;
        r0();
        if (S()) {
            Q();
        }
    }

    public final void b0() {
        this.layoutDelegate.f5653g = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0128 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Owner owner) {
        int i10;
        a aVar;
        G0.g0 g0Var;
        G0.g0 g0Var2;
        k kVar;
        ?? r22;
        ?? r42;
        ?? r02;
        n0 n0Var;
        Owner owner2;
        if (this.f24850n0 == null) {
            a aVar2 = this.f24849m0;
            C0595y c0595y = null;
            String str = null;
            if (aVar2 != null && !AbstractC3557B.K(aVar2.f24850n0, owner)) {
                StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
                sb2.append(owner);
                sb2.append(") than the parent's owner(");
                a E10 = E();
                if (E10 != null) {
                    owner2 = E10.f24850n0;
                } else {
                    owner2 = null;
                }
                sb2.append(owner2);
                sb2.append("). This tree: ");
                sb2.append(f(0));
                sb2.append(" Parent tree: ");
                a aVar3 = this.f24849m0;
                if (aVar3 != null) {
                    str = aVar3.f(0);
                }
                sb2.append(str);
                throw new IllegalStateException(sb2.toString().toString());
            }
            a E11 = E();
            if (E11 == null) {
                O o10 = this.layoutDelegate;
                o10.f5661o.f5641w0 = true;
                L l10 = o10.f5662p;
                if (l10 != null) {
                    l10.f5612t0 = true;
                }
            }
            C0572a0 c0572a0 = this.f24831B0;
            G0.g0 g0Var3 = c0572a0.f5702c;
            if (E11 != null) {
                c0595y = E11.f24831B0.f5701b;
            }
            g0Var3.f5772p0 = c0595y;
            this.f24850n0 = owner;
            if (E11 != null) {
                i10 = E11.f24852p0;
            } else {
                i10 = -1;
            }
            this.f24852p0 = i10 + 1;
            if (c0572a0.d(8)) {
                Q();
            }
            owner.getClass();
            a aVar4 = this.f24849m0;
            if (aVar4 == null || (aVar = aVar4.f24844h0) == null) {
                aVar = this.f24844h0;
            }
            u0(aVar);
            if (!this.f24839J0) {
                for (AbstractC4325q abstractC4325q = c0572a0.f5704e; abstractC4325q != null; abstractC4325q = abstractC4325q.f37725k0) {
                    abstractC4325q.r0();
                }
            }
            C2104h c2104h = this.f24846j0.f5690a;
            int i11 = c2104h.f25569h0;
            if (i11 > 0) {
                Object[] objArr = c2104h.f25567Y;
                int i12 = 0;
                do {
                    ((a) objArr[i12]).c(owner);
                    i12++;
                } while (i12 < i11);
                if (!this.f24839J0) {
                    c0572a0.e();
                }
                O();
                if (E11 != null) {
                    E11.O();
                }
                g0Var2 = c0572a0.f5701b.f5771o0;
                for (g0Var = c0572a0.f5702c; !AbstractC3557B.K(g0Var, g0Var2) && g0Var != null; g0Var = g0Var.f5771o0) {
                    g0Var.Y0(g0Var.f5775s0, true);
                    n0Var = g0Var.f5769F0;
                    if (n0Var == null) {
                        n0Var.invalidate();
                    }
                }
                kVar = this.f24836G0;
                if (kVar != null) {
                    kVar.invoke(owner);
                }
                this.layoutDelegate.e();
                if (this.f24839J0) {
                    AbstractC4325q abstractC4325q2 = c0572a0.f5704e;
                    if ((abstractC4325q2.f37723i0 & 7168) != 0) {
                        while (abstractC4325q2 != null) {
                            int i13 = abstractC4325q2.f37722h0;
                            if ((i13 & 1024) != 0) {
                                r22 = true;
                            } else {
                                r22 = false;
                            }
                            if ((i13 & 2048) != 0) {
                                r42 = true;
                            } else {
                                r42 = false;
                            }
                            ?? r43 = r42 == true ? 1 : 0;
                            ?? r44 = r42 == true ? 1 : 0;
                            ?? r23 = r22 == true ? 1 : 0;
                            ?? r24 = r22 == true ? 1 : 0;
                            ?? r25 = r23 | r43;
                            if ((i13 & 4096) != 0) {
                                r02 = true;
                            } else {
                                r02 = false;
                            }
                            ?? r26 = r25 == true ? 1 : 0;
                            ?? r03 = r02 == true ? 1 : 0;
                            ?? r04 = r02 == true ? 1 : 0;
                            if ((r03 | r26) != false) {
                                AbstractC0579h.h(abstractC4325q2);
                            }
                            abstractC4325q2 = abstractC4325q2.f37725k0;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.f24839J0) {
            }
            O();
            if (E11 != null) {
            }
            g0Var2 = c0572a0.f5701b.f5771o0;
            while (!AbstractC3557B.K(g0Var, g0Var2)) {
                g0Var.Y0(g0Var.f5775s0, true);
                n0Var = g0Var.f5769F0;
                if (n0Var == null) {
                }
            }
            kVar = this.f24836G0;
            if (kVar != null) {
            }
            this.layoutDelegate.e();
            if (this.f24839J0) {
            }
        } else {
            throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + f(0)).toString());
        }
    }

    public final void c0() {
        this.layoutDelegate.f5650d = true;
    }

    public final void d() {
        this.f24841L0 = this.f24840K0;
        this.f24840K0 = 3;
        C2104h J10 = J();
        int i10 = J10.f25569h0;
        if (i10 > 0) {
            Object[] objArr = J10.f25567Y;
            int i11 = 0;
            do {
                a aVar = (a) objArr[i11];
                if (aVar.f24840K0 != 3) {
                    aVar.d();
                }
                i11++;
            } while (i11 < i10);
        }
    }

    public final void d0(int i10, int i11, int i12) {
        int i13;
        if (i10 == i11) {
            return;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            if (i10 > i11) {
                i13 = i10 + i14;
            } else {
                i13 = i10;
            }
            int i15 = i10 > i11 ? i11 + i14 : (i11 + i12) - 2;
            Y y10 = this.f24846j0;
            Object n10 = y10.f5690a.n(i13);
            AbstractC6216a abstractC6216a = y10.f5691b;
            abstractC6216a.mo122invoke();
            y10.f5690a.a(i15, (a) n10);
            abstractC6216a.mo122invoke();
        }
        f0();
        R();
        O();
    }

    public final void e() {
        this.f24841L0 = this.f24840K0;
        this.f24840K0 = 3;
        C2104h J10 = J();
        int i10 = J10.f25569h0;
        if (i10 > 0) {
            Object[] objArr = J10.f25567Y;
            int i11 = 0;
            do {
                a aVar = (a) objArr[i11];
                if (aVar.f24840K0 == 2) {
                    aVar.e();
                }
                i11++;
            } while (i11 < i10);
        }
    }

    public final void e0(a aVar) {
        O o10;
        if (aVar.layoutDelegate.f5660n > 0) {
            this.layoutDelegate.b(o10.f5660n - 1);
        }
        if (this.f24850n0 != null) {
            aVar.g();
        }
        aVar.f24849m0 = null;
        aVar.f24831B0.f5702c.f5772p0 = null;
        if (aVar.f24842Y) {
            this.f24845i0--;
            C2104h c2104h = aVar.f24846j0.f5690a;
            int i10 = c2104h.f25569h0;
            if (i10 > 0) {
                Object[] objArr = c2104h.f25567Y;
                int i11 = 0;
                do {
                    ((a) objArr[i11]).f24831B0.f5702c.f5772p0 = null;
                    i11++;
                } while (i11 < i10);
            }
        }
        R();
        f0();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        C2104h J10 = J();
        int i12 = J10.f25569h0;
        if (i12 > 0) {
            Object[] objArr = J10.f25567Y;
            int i13 = 0;
            do {
                sb2.append(((a) objArr[i13]).f(i10 + 1));
                i13++;
            } while (i13 < i12);
            String sb3 = sb2.toString();
            if (i10 != 0) {
                String substring = sb3.substring(0, sb3.length() - 1);
                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
                return substring;
            }
            return sb3;
        }
        String sb32 = sb2.toString();
        if (i10 != 0) {
        }
    }

    public final void f0() {
        if (this.f24842Y) {
            a E10 = E();
            if (E10 != null) {
                E10.f0();
                return;
            }
            return;
        }
        this.f24856t0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        L l10;
        P p10;
        Owner owner = this.f24850n0;
        String str = null;
        if (owner == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            a E10 = E();
            if (E10 != null) {
                str = E10.f(0);
            }
            sb2.append(str);
            throw new IllegalStateException(sb2.toString().toString());
        }
        C0572a0 c0572a0 = this.f24831B0;
        int i10 = c0572a0.f5704e.f37723i0 & 1024;
        AbstractC4325q abstractC4325q = c0572a0.f5703d;
        if (i10 != 0) {
            for (AbstractC4325q abstractC4325q2 = abstractC4325q; abstractC4325q2 != null; abstractC4325q2 = abstractC4325q2.f37724j0) {
                if ((abstractC4325q2.f37722h0 & 1024) != 0) {
                    C2104h c2104h = null;
                    AbstractC4325q abstractC4325q3 = abstractC4325q2;
                    while (abstractC4325q3 != null) {
                        if (abstractC4325q3 instanceof q) {
                            q qVar = (q) abstractC4325q3;
                            if (qVar.B0().a()) {
                                ((g) ((C0714y) AbstractC0579h.C(this)).getFocusOwner()).a(true, false);
                                qVar.D0();
                            }
                        } else if ((abstractC4325q3.f37722h0 & 1024) != 0 && (abstractC4325q3 instanceof AbstractC0587p)) {
                            int i11 = 0;
                            for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q3).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                if ((abstractC4325q4.f37722h0 & 1024) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        abstractC4325q3 = abstractC4325q4;
                                    } else {
                                        if (c2104h == null) {
                                            c2104h = new C2104h(new AbstractC4325q[16]);
                                        }
                                        if (abstractC4325q3 != null) {
                                            c2104h.b(abstractC4325q3);
                                            abstractC4325q3 = null;
                                        }
                                        c2104h.b(abstractC4325q4);
                                    }
                                }
                            }
                            if (i11 == 1) {
                            }
                        }
                        abstractC4325q3 = AbstractC0579h.f(c2104h);
                    }
                }
            }
        }
        a E11 = E();
        if (E11 != null) {
            E11.M();
            E11.O();
            O o10 = this.layoutDelegate;
            o10.f5661o.f5634p0 = 3;
            L l11 = o10.f5662p;
            if (l11 != null) {
                l11.f5606n0 = 3;
            }
        }
        O o11 = this.layoutDelegate;
        I i12 = o11.f5661o.f5643y0;
        i12.f5709b = true;
        i12.f5710c = false;
        i12.f5712e = false;
        i12.f5711d = false;
        i12.f5713f = false;
        i12.f5714g = false;
        i12.f5715h = null;
        L l12 = o11.f5662p;
        if (l12 != null && (p10 = l12.f5613u0) != null) {
            p10.f5709b = true;
            p10.f5710c = false;
            p10.f5712e = false;
            p10.f5711d = false;
            p10.f5713f = false;
            p10.f5714g = false;
            p10.f5715h = null;
        }
        k kVar = this.f24837H0;
        if (kVar != null) {
            kVar.invoke(owner);
        }
        if (c0572a0.d(8)) {
            Q();
        }
        for (AbstractC4325q abstractC4325q5 = abstractC4325q; abstractC4325q5 != null; abstractC4325q5 = abstractC4325q5.f37724j0) {
            if (abstractC4325q5.f37732r0) {
                abstractC4325q5.y0();
            }
        }
        this.f24853q0 = true;
        C2104h c2104h2 = this.f24846j0.f5690a;
        int i13 = c2104h2.f25569h0;
        if (i13 > 0) {
            Object[] objArr = c2104h2.f25567Y;
            int i14 = 0;
            do {
                ((a) objArr[i14]).g();
                i14++;
            } while (i14 < i13);
            this.f24853q0 = false;
            while (abstractC4325q != null) {
                if (abstractC4325q.f37732r0) {
                    abstractC4325q.s0();
                }
                abstractC4325q = abstractC4325q.f37724j0;
            }
            C0714y c0714y = (C0714y) owner;
            C0589s c0589s = c0714y.f7083L0.f5683b;
            c0589s.f5829a.c(this);
            c0589s.f5830b.c(this);
            c0714y.f7074C0 = true;
            this.f24850n0 = null;
            u0(null);
            this.f24852p0 = 0;
            O o12 = this.layoutDelegate;
            M m10 = o12.f5661o;
            m10.f5631m0 = Integer.MAX_VALUE;
            m10.f5630l0 = Integer.MAX_VALUE;
            m10.f5641w0 = false;
            l10 = o12.f5662p;
            if (l10 == null) {
                l10.f5605m0 = Integer.MAX_VALUE;
                l10.f5604l0 = Integer.MAX_VALUE;
                l10.f5612t0 = false;
                return;
            }
            return;
        }
        this.f24853q0 = false;
        while (abstractC4325q != null) {
        }
        C0714y c0714y2 = (C0714y) owner;
        C0589s c0589s2 = c0714y2.f7083L0.f5683b;
        c0589s2.f5829a.c(this);
        c0589s2.f5830b.c(this);
        c0714y2.f7074C0 = true;
        this.f24850n0 = null;
        u0(null);
        this.f24852p0 = 0;
        O o122 = this.layoutDelegate;
        M m102 = o122.f5661o;
        m102.f5631m0 = Integer.MAX_VALUE;
        m102.f5630l0 = Integer.MAX_VALUE;
        m102.f5641w0 = false;
        l10 = o122.f5662p;
        if (l10 == null) {
        }
    }

    public final void g0() {
        c0 c0Var;
        C0595y c0595y;
        if (this.f24840K0 == 3) {
            e();
        }
        a E10 = E();
        if (E10 == null || (c0595y = E10.f24831B0.f5701b) == null || (c0Var = c0595y.f5672m0) == null) {
            c0Var = ((C0714y) AbstractC0579h.C(this)).getPlacementScope();
        }
        c0.g(c0Var, this.layoutDelegate.f5661o, 0, 0);
    }

    public final void h() {
        O o10 = this.layoutDelegate;
        if (o10.f5649c != 5 || o10.f5651e || o10.f5650d || this.f24839J0 || !T()) {
            return;
        }
        AbstractC4325q abstractC4325q = this.f24831B0.f5704e;
        if ((abstractC4325q.f37723i0 & 256) != 0) {
            while (abstractC4325q != null) {
                if ((abstractC4325q.f37722h0 & 256) != 0) {
                    AbstractC4325q abstractC4325q2 = abstractC4325q;
                    C2104h c2104h = null;
                    while (abstractC4325q2 != null) {
                        if (abstractC4325q2 instanceof AbstractC0591u) {
                            AbstractC0591u abstractC0591u = (AbstractC0591u) abstractC4325q2;
                            abstractC0591u.b0(AbstractC0579h.z(abstractC0591u, 256));
                        } else if ((abstractC4325q2.f37722h0 & 256) != 0 && (abstractC4325q2 instanceof AbstractC0587p)) {
                            int i10 = 0;
                            for (AbstractC4325q abstractC4325q3 = ((AbstractC0587p) abstractC4325q2).f5816t0; abstractC4325q3 != null; abstractC4325q3 = abstractC4325q3.f37725k0) {
                                if ((abstractC4325q3.f37722h0 & 256) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        abstractC4325q2 = abstractC4325q3;
                                    } else {
                                        if (c2104h == null) {
                                            c2104h = new C2104h(new AbstractC4325q[16]);
                                        }
                                        if (abstractC4325q2 != null) {
                                            c2104h.b(abstractC4325q2);
                                            abstractC4325q2 = null;
                                        }
                                        c2104h.b(abstractC4325q3);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        abstractC4325q2 = AbstractC0579h.f(c2104h);
                    }
                }
                if ((abstractC4325q.f37723i0 & 256) != 0) {
                    abstractC4325q = abstractC4325q.f37725k0;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean h0(Z0.a aVar) {
        if (aVar != null) {
            if (this.f24840K0 == 3) {
                d();
            }
            return this.layoutDelegate.f5661o.t0(aVar.f22782a);
        }
        return false;
    }

    @Override // Z.AbstractC1719k
    public final void i() {
        if (S()) {
            l lVar = this.f24851o0;
            if (lVar != null) {
                lVar.i();
            }
            J j6 = this.f24832C0;
            if (j6 != null) {
                j6.e(false);
            }
            if (this.f24839J0) {
                this.f24839J0 = false;
                Q();
            } else {
                r0();
            }
            this.f24843Z = L0.l.f10412a.addAndGet(1);
            C0572a0 c0572a0 = this.f24831B0;
            for (AbstractC4325q abstractC4325q = c0572a0.f5704e; abstractC4325q != null; abstractC4325q = abstractC4325q.f37725k0) {
                abstractC4325q.r0();
            }
            c0572a0.e();
            q0(this);
            return;
        }
        throw new IllegalArgumentException("onReuse is only expected on attached node".toString());
    }

    public final void j(AbstractC5352p abstractC5352p) {
        this.f24831B0.f5702c.y0(abstractC5352p);
    }

    public final void j0() {
        Y y10 = this.f24846j0;
        int i10 = y10.f5690a.f25569h0;
        while (true) {
            i10--;
            if (-1 < i10) {
                e0((a) y10.f5690a.f25567Y[i10]);
            } else {
                y10.f5690a.f();
                y10.f5691b.mo122invoke();
                return;
            }
        }
    }

    public final void k() {
        Z0.a aVar;
        if (this.f24844h0 != null) {
            n0(this, false, 1);
        } else {
            p0(this, false, 1);
        }
        M m10 = this.layoutDelegate.f5661o;
        if (m10.f5632n0) {
            aVar = new Z0.a(m10.f4056i0);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            Owner owner = this.f24850n0;
            if (owner != null) {
                ((C0714y) owner).p(this, aVar.f22782a);
                return;
            }
            return;
        }
        Owner owner2 = this.f24850n0;
        if (owner2 != null) {
            o0.a(owner2);
        }
    }

    public final void k0(int i10, int i11) {
        if (i11 >= 0) {
            int i12 = (i11 + i10) - 1;
            if (i10 > i12) {
                return;
            }
            while (true) {
                Y y10 = this.f24846j0;
                Object n10 = y10.f5690a.n(i12);
                y10.f5691b.mo122invoke();
                e0((a) n10);
                if (i12 != i10) {
                    i12--;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException(AbstractC4194d.v("count (", i11, ") must be greater than 0").toString());
        }
    }

    public final boolean l() {
        P p10;
        O o10 = this.layoutDelegate;
        if (o10.f5661o.f5643y0.f()) {
            return true;
        }
        L l10 = o10.f5662p;
        if (l10 != null && (p10 = l10.f5613u0) != null && p10.f()) {
            return true;
        }
        return false;
    }

    public final void l0() {
        a E10;
        if (this.f24840K0 == 3) {
            e();
        }
        M m10 = this.layoutDelegate.f5661o;
        m10.getClass();
        try {
            m10.f5629k0 = true;
            if (m10.f5633o0) {
                boolean z10 = m10.f5641w0;
                m10.s0(m10.f5636r0, m10.f5638t0, m10.f5637s0);
                if (z10 && !m10.f5623E0 && (E10 = m10.f5628J0.f5647a.E()) != null) {
                    E10.o0(false);
                }
                return;
            }
            throw new IllegalStateException("replace called on unplaced item".toString());
        } finally {
            m10.f5629k0 = false;
        }
    }

    public final List m() {
        L l10 = this.layoutDelegate.f5662p;
        AbstractC3557B.Z(l10);
        O o10 = l10.f5602B0;
        o10.f5647a.o();
        boolean z10 = l10.f5615w0;
        C2104h c2104h = l10.f5614v0;
        if (!z10) {
            return c2104h.e();
        }
        a aVar = o10.f5647a;
        C2104h J10 = aVar.J();
        int i10 = J10.f25569h0;
        if (i10 > 0) {
            Object[] objArr = J10.f25567Y;
            int i11 = 0;
            do {
                a aVar2 = (a) objArr[i11];
                if (c2104h.f25569h0 <= i11) {
                    L l11 = aVar2.layoutDelegate.f5662p;
                    AbstractC3557B.Z(l11);
                    c2104h.b(l11);
                } else {
                    L l12 = aVar2.layoutDelegate.f5662p;
                    AbstractC3557B.Z(l12);
                    c2104h.p(i11, l12);
                }
                i11++;
            } while (i11 < i10);
            c2104h.o(aVar.o().size(), c2104h.f25569h0);
            l10.f5615w0 = false;
            return c2104h.e();
        }
        c2104h.o(aVar.o().size(), c2104h.f25569h0);
        l10.f5615w0 = false;
        return c2104h.e();
    }

    public final void m0(boolean z10) {
        Owner owner;
        if (!this.f24842Y && (owner = this.f24850n0) != null) {
            C0714y c0714y = (C0714y) owner;
            if (c0714y.f7083L0.o(this, z10)) {
                c0714y.w(null);
            }
        }
    }

    public final List n() {
        return this.layoutDelegate.f5661o.h0();
    }

    public final List o() {
        return J().e();
    }

    public final void o0(boolean z10) {
        Owner owner;
        if (!this.f24842Y && (owner = this.f24850n0) != null) {
            int i10 = o0.f5814a;
            C0714y c0714y = (C0714y) owner;
            if (c0714y.f7083L0.q(this, z10)) {
                c0714y.w(null);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public final j p() {
        if (this.f24831B0.d(8) && this.f24854r0 == null) {
            ?? obj = new Object();
            obj.f37622Y = new j();
            r0 snapshotObserver = ((C0714y) AbstractC0579h.C(this)).getSnapshotObserver();
            snapshotObserver.a(this, snapshotObserver.f5824d, new C0007a0(this, obj));
            j jVar = (j) obj.f37622Y;
            this.f24854r0 = jVar;
            return jVar;
        }
        return this.f24854r0;
    }

    @Override // G0.q0
    public final boolean q() {
        return S();
    }

    public final List r() {
        return this.f24846j0.f5690a.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r0() {
        AbstractC4325q abstractC4325q;
        AbstractC4325q abstractC4325q2;
        int i10;
        C0572a0 c0572a0 = this.f24831B0;
        for (AbstractC4325q abstractC4325q3 = c0572a0.f5703d; abstractC4325q3 != null; abstractC4325q3 = abstractC4325q3.f37724j0) {
            if (abstractC4325q3.f37732r0) {
                abstractC4325q3.w0();
            }
        }
        C2104h c2104h = c0572a0.f5705f;
        if (c2104h != null && (i10 = c2104h.f25569h0) > 0) {
            Object[] objArr = c2104h.f25567Y;
            int i11 = 0;
            do {
                AbstractC4324p abstractC4324p = (AbstractC4324p) objArr[i11];
                if (abstractC4324p instanceof SuspendPointerInputElement) {
                    c2104h.p(i11, new ForceUpdateElement((X) abstractC4324p));
                }
                i11++;
            } while (i11 < i10);
            abstractC4325q = c0572a0.f5703d;
            while (abstractC4325q2 != null) {
            }
            while (abstractC4325q != null) {
            }
        }
        abstractC4325q = c0572a0.f5703d;
        for (abstractC4325q2 = abstractC4325q; abstractC4325q2 != null; abstractC4325q2 = abstractC4325q2.f37724j0) {
            if (abstractC4325q2.f37732r0) {
                abstractC4325q2.y0();
            }
        }
        while (abstractC4325q != null) {
            if (abstractC4325q.f37732r0) {
                abstractC4325q.s0();
            }
            abstractC4325q = abstractC4325q.f37724j0;
        }
    }

    public final int s() {
        return this.layoutDelegate.f5661o.f4054Z;
    }

    public final void s0() {
        C2104h J10 = J();
        int i10 = J10.f25569h0;
        if (i10 > 0) {
            Object[] objArr = J10.f25567Y;
            int i11 = 0;
            do {
                a aVar = (a) objArr[i11];
                int i12 = aVar.f24841L0;
                aVar.f24840K0 = i12;
                if (i12 != 3) {
                    aVar.s0();
                }
                i11++;
            } while (i11 < i10);
        }
    }

    public final O t() {
        return this.layoutDelegate;
    }

    public final void t0(Z0.b bVar) {
        if (!AbstractC3557B.K(this.f24859w0, bVar)) {
            this.f24859w0 = bVar;
            O();
            a E10 = E();
            if (E10 != null) {
                E10.M();
            }
            N();
            AbstractC4325q abstractC4325q = this.f24831B0.f5704e;
            if ((abstractC4325q.f37723i0 & 16) != 0) {
                while (abstractC4325q != null) {
                    if ((abstractC4325q.f37722h0 & 16) != 0) {
                        AbstractC4325q abstractC4325q2 = abstractC4325q;
                        C2104h c2104h = null;
                        while (abstractC4325q2 != null) {
                            if (abstractC4325q2 instanceof t0) {
                                ((t0) abstractC4325q2).N();
                            } else if ((abstractC4325q2.f37722h0 & 16) != 0 && (abstractC4325q2 instanceof AbstractC0587p)) {
                                int i10 = 0;
                                for (AbstractC4325q abstractC4325q3 = ((AbstractC0587p) abstractC4325q2).f5816t0; abstractC4325q3 != null; abstractC4325q3 = abstractC4325q3.f37725k0) {
                                    if ((abstractC4325q3.f37722h0 & 16) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            abstractC4325q2 = abstractC4325q3;
                                        } else {
                                            if (c2104h == null) {
                                                c2104h = new C2104h(new AbstractC4325q[16]);
                                            }
                                            if (abstractC4325q2 != null) {
                                                c2104h.b(abstractC4325q2);
                                                abstractC4325q2 = null;
                                            }
                                            c2104h.b(abstractC4325q3);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC4325q2 = AbstractC0579h.f(c2104h);
                        }
                    }
                    if ((abstractC4325q.f37723i0 & 16) != 0) {
                        abstractC4325q = abstractC4325q.f37725k0;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final String toString() {
        return Ng.H.u(this) + " children: " + o().size() + " measurePolicy: " + this.f24857u0;
    }

    public final boolean u() {
        return this.layoutDelegate.f5651e;
    }

    public final void u0(a aVar) {
        if (!AbstractC3557B.K(aVar, this.f24844h0)) {
            this.f24844h0 = aVar;
            if (aVar != null) {
                O o10 = this.layoutDelegate;
                if (o10.f5662p == null) {
                    o10.f5662p = new L(o10);
                }
                C0572a0 c0572a0 = this.f24831B0;
                G0.g0 g0Var = c0572a0.f5701b.f5771o0;
                for (G0.g0 g0Var2 = c0572a0.f5702c; !AbstractC3557B.K(g0Var2, g0Var) && g0Var2 != null; g0Var2 = g0Var2.f5771o0) {
                    g0Var2.B0();
                }
            }
            O();
        }
    }

    public final int v() {
        return this.layoutDelegate.f5649c;
    }

    public final void v0(N n10) {
        if (!AbstractC3557B.K(this.f24857u0, n10)) {
            this.f24857u0 = n10;
            this.f24858v0.f5849b.setValue(n10);
            O();
        }
    }

    public final boolean w() {
        return this.layoutDelegate.f5654h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0182  */
    /* JADX WARN: Type inference failed for: r3v1, types: [l0.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0(AbstractC4326r abstractC4326r) {
        int i10;
        b0 b0Var;
        ?? r32;
        C0595y c0595y;
        if (this.f24842Y && this.f24835F0 != C4323o.f37719b) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
        boolean z10 = true;
        if (!this.f24839J0) {
            this.f24835F0 = abstractC4326r;
            C0572a0 c0572a0 = this.f24831B0;
            AbstractC4325q abstractC4325q = c0572a0.f5704e;
            AbstractC4325q abstractC4325q2 = b.f24863a;
            if (abstractC4325q != abstractC4325q2) {
                abstractC4325q.f37724j0 = abstractC4325q2;
                abstractC4325q2.f37725k0 = abstractC4325q;
                C2104h c2104h = c0572a0.f5705f;
                int i11 = 0;
                if (c2104h != null) {
                    i10 = c2104h.f25569h0;
                } else {
                    i10 = 0;
                }
                C2104h c2104h2 = c0572a0.f5706g;
                if (c2104h2 == null) {
                    c2104h2 = new C2104h(new AbstractC4324p[16]);
                }
                C2104h c2104h3 = c2104h2;
                int i12 = c2104h3.f25569h0;
                if (i12 < 16) {
                    i12 = 16;
                }
                C2104h c2104h4 = new C2104h(new AbstractC4326r[i12]);
                c2104h4.b(abstractC4326r);
                C0571a c0571a = null;
                while (c2104h4.l()) {
                    AbstractC4326r abstractC4326r2 = (AbstractC4326r) c2104h4.n(c2104h4.f25569h0 - 1);
                    if (abstractC4326r2 instanceof C4320l) {
                        C4320l c4320l = (C4320l) abstractC4326r2;
                        c2104h4.b(c4320l.f37716c);
                        c2104h4.b(c4320l.f37715b);
                    } else if (abstractC4326r2 instanceof AbstractC4324p) {
                        c2104h3.b(abstractC4326r2);
                    } else {
                        if (c0571a == null) {
                            c0571a = new C0571a(1, c2104h3);
                        }
                        abstractC4326r2.l(c0571a);
                        c0571a = c0571a;
                    }
                }
                int i13 = c2104h3.f25569h0;
                w0 w0Var = c0572a0.f5703d;
                a aVar = c0572a0.f5700a;
                if (i13 == i10) {
                    AbstractC4325q abstractC4325q3 = abstractC4325q2.f37725k0;
                    int i14 = 0;
                    while (true) {
                        if (abstractC4325q3 == null || i14 >= i10) {
                            break;
                        } else if (c2104h != null) {
                            AbstractC4324p abstractC4324p = (AbstractC4324p) c2104h.f25567Y[i14];
                            AbstractC4324p abstractC4324p2 = (AbstractC4324p) c2104h3.f25567Y[i14];
                            int a5 = b.a(abstractC4324p, abstractC4324p2);
                            if (a5 != 0) {
                                if (a5 == 1) {
                                    C0572a0.h(abstractC4324p, abstractC4324p2, abstractC4325q3);
                                }
                                abstractC4325q3 = abstractC4325q3.f37725k0;
                                i14++;
                            } else {
                                abstractC4325q3 = abstractC4325q3.f37724j0;
                                break;
                            }
                        } else {
                            throw new IllegalStateException("expected prior modifier list to be non-empty".toString());
                        }
                    }
                    AbstractC4325q abstractC4325q4 = abstractC4325q3;
                    if (i14 < i10) {
                        if (c2104h != null) {
                            if (abstractC4325q4 != null) {
                                c0572a0.f(i14, c2104h, c2104h3, abstractC4325q4, aVar.S());
                                c0572a0.f5705f = c2104h3;
                                if (c2104h != null) {
                                    c2104h.f();
                                } else {
                                    c2104h = null;
                                }
                                c0572a0.f5706g = c2104h;
                                b0Var = b.f24863a;
                                r32 = b0Var.f37725k0;
                                if (r32 != 0) {
                                    w0Var = r32;
                                }
                                w0Var.f37724j0 = null;
                                b0Var.f37725k0 = null;
                                b0Var.f37723i0 = -1;
                                b0Var.f37727m0 = null;
                                if (w0Var != b0Var) {
                                    c0572a0.f5704e = w0Var;
                                    if (z10) {
                                        c0572a0.g();
                                    }
                                    this.layoutDelegate.e();
                                    if (c0572a0.d(512) && this.f24844h0 == null) {
                                        u0(this);
                                        return;
                                    }
                                    return;
                                }
                                throw new IllegalStateException("trimChain did not update the head".toString());
                            }
                            throw new IllegalStateException("structuralUpdate requires a non-null tail".toString());
                        }
                        throw new IllegalStateException("expected prior modifier list to be non-empty".toString());
                    }
                    z10 = false;
                    c0572a0.f5705f = c2104h3;
                    if (c2104h != null) {
                    }
                    c0572a0.f5706g = c2104h;
                    b0Var = b.f24863a;
                    r32 = b0Var.f37725k0;
                    if (r32 != 0) {
                    }
                    w0Var.f37724j0 = null;
                    b0Var.f37725k0 = null;
                    b0Var.f37723i0 = -1;
                    b0Var.f37727m0 = null;
                    if (w0Var != b0Var) {
                    }
                } else {
                    if (!aVar.S() && i10 == 0) {
                        for (int i15 = 0; i15 < c2104h3.f25569h0; i15++) {
                            abstractC4325q2 = C0572a0.b((AbstractC4324p) c2104h3.f25567Y[i15], abstractC4325q2);
                        }
                        for (AbstractC4325q abstractC4325q5 = w0Var.f37724j0; abstractC4325q5 != null && abstractC4325q5 != b.f24863a; abstractC4325q5 = abstractC4325q5.f37724j0) {
                            i11 |= abstractC4325q5.f37722h0;
                            abstractC4325q5.f37723i0 = i11;
                        }
                    } else if (c2104h3.f25569h0 == 0) {
                        if (c2104h != null) {
                            AbstractC4325q abstractC4325q6 = abstractC4325q2.f37725k0;
                            for (int i16 = 0; abstractC4325q6 != null && i16 < c2104h.f25569h0; i16++) {
                                abstractC4325q6 = C0572a0.c(abstractC4325q6).f37725k0;
                            }
                            a E10 = aVar.E();
                            if (E10 != null) {
                                c0595y = E10.f24831B0.f5701b;
                            } else {
                                c0595y = null;
                            }
                            C0595y c0595y2 = c0572a0.f5701b;
                            c0595y2.f5772p0 = c0595y;
                            c0572a0.f5702c = c0595y2;
                            z10 = false;
                        } else {
                            throw new IllegalStateException("expected prior modifier list to be non-empty".toString());
                        }
                    } else {
                        if (c2104h == null) {
                            c2104h = new C2104h(new AbstractC4324p[16]);
                        }
                        c0572a0.f(0, c2104h, c2104h3, abstractC4325q2, aVar.S());
                    }
                    c0572a0.f5705f = c2104h3;
                    if (c2104h != null) {
                    }
                    c0572a0.f5706g = c2104h;
                    b0Var = b.f24863a;
                    r32 = b0Var.f37725k0;
                    if (r32 != 0) {
                    }
                    w0Var.f37724j0 = null;
                    b0Var.f37725k0 = null;
                    b0Var.f37723i0 = -1;
                    b0Var.f37727m0 = null;
                    if (w0Var != b0Var) {
                    }
                }
            } else {
                throw new IllegalStateException("padChain called on already padded chain".toString());
            }
        } else {
            throw new IllegalArgumentException("modifier is updated when deactivated".toString());
        }
    }

    public final boolean x() {
        return this.layoutDelegate.f5653g;
    }

    public final void x0(Y0 y02) {
        if (!AbstractC3557B.K(this.f24861y0, y02)) {
            this.f24861y0 = y02;
            AbstractC4325q abstractC4325q = this.f24831B0.f5704e;
            if ((abstractC4325q.f37723i0 & 16) != 0) {
                while (abstractC4325q != null) {
                    if ((abstractC4325q.f37722h0 & 16) != 0) {
                        AbstractC4325q abstractC4325q2 = abstractC4325q;
                        C2104h c2104h = null;
                        while (abstractC4325q2 != null) {
                            if (abstractC4325q2 instanceof t0) {
                                ((t0) abstractC4325q2).h0();
                            } else if ((abstractC4325q2.f37722h0 & 16) != 0 && (abstractC4325q2 instanceof AbstractC0587p)) {
                                int i10 = 0;
                                for (AbstractC4325q abstractC4325q3 = ((AbstractC0587p) abstractC4325q2).f5816t0; abstractC4325q3 != null; abstractC4325q3 = abstractC4325q3.f37725k0) {
                                    if ((abstractC4325q3.f37722h0 & 16) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            abstractC4325q2 = abstractC4325q3;
                                        } else {
                                            if (c2104h == null) {
                                                c2104h = new C2104h(new AbstractC4325q[16]);
                                            }
                                            if (abstractC4325q2 != null) {
                                                c2104h.b(abstractC4325q2);
                                                abstractC4325q2 = null;
                                            }
                                            c2104h.b(abstractC4325q3);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC4325q2 = AbstractC0579h.f(c2104h);
                        }
                    }
                    if ((abstractC4325q.f37723i0 & 16) != 0) {
                        abstractC4325q = abstractC4325q.f37725k0;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final L y() {
        return this.layoutDelegate.f5662p;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0() {
        L l10;
        if (this.f24845i0 > 0 && this.f24848l0) {
            int i10 = 0;
            this.f24848l0 = false;
            C2104h c2104h = this.f24847k0;
            if (c2104h == null) {
                c2104h = new C2104h(new a[16]);
                this.f24847k0 = c2104h;
            }
            c2104h.f();
            C2104h c2104h2 = this.f24846j0.f5690a;
            int i11 = c2104h2.f25569h0;
            if (i11 > 0) {
                Object[] objArr = c2104h2.f25567Y;
                do {
                    a aVar = (a) objArr[i10];
                    if (aVar.f24842Y) {
                        c2104h.c(c2104h.f25569h0, aVar.J());
                    } else {
                        c2104h.b(aVar);
                    }
                    i10++;
                } while (i10 < i11);
                O o10 = this.layoutDelegate;
                o10.f5661o.f5619A0 = true;
                l10 = o10.f5662p;
                if (l10 == null) {
                    l10.f5615w0 = true;
                    return;
                }
                return;
            }
            O o102 = this.layoutDelegate;
            o102.f5661o.f5619A0 = true;
            l10 = o102.f5662p;
            if (l10 == null) {
            }
        }
    }

    public final M z() {
        return this.layoutDelegate.f5661o;
    }

    public a(int i10, boolean z10) {
        this.f24842Y = z10;
        this.f24843Z = i10;
        this.f24846j0 = new Y(new C2104h(new a[16]), new C6672L(21, this));
        this.f24855s0 = new C2104h(new a[16]);
        this.f24856t0 = true;
        this.f24857u0 = f24827M0;
        this.f24858v0 = new C0596z(this);
        this.f24859w0 = AbstractC0579h.f5784b;
        this.f24860x0 = Z0.l.f22805Y;
        this.f24861y0 = f24828N0;
        B.f22435v.getClass();
        this.f24862z0 = A.f22430b;
        this.f24840K0 = 3;
        this.f24841L0 = 3;
        this.f24831B0 = new C0572a0(this);
        this.layoutDelegate = new O(this);
        this.f24834E0 = true;
        this.f24835F0 = C4323o.f37719b;
    }
}
