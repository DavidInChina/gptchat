package y2;

import E2.AbstractC0469a;
import E2.AbstractC0489v;
import E2.AbstractC0490w;
import E2.C0492y;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import m.RunnableC4517N;
import p2.C5047B;
import p2.C5065s;
import q1.AbstractC5260f;
import s2.AbstractC5530A;
import s2.AbstractC5532b;
import z2.AbstractC6756a;
import z2.C6755D;

/* renamed from: y2.M  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6510M implements Handler.Callback, AbstractC0489v, AbstractC6524k {

    /* renamed from: A0  reason: collision with root package name */
    public l0 f50409A0;

    /* renamed from: B0  reason: collision with root package name */
    public d0 f50410B0;

    /* renamed from: C0  reason: collision with root package name */
    public C6507J f50411C0;

    /* renamed from: D0  reason: collision with root package name */
    public boolean f50412D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f50413E0;

    /* renamed from: F0  reason: collision with root package name */
    public boolean f50414F0;

    /* renamed from: G0  reason: collision with root package name */
    public boolean f50415G0;

    /* renamed from: I0  reason: collision with root package name */
    public boolean f50417I0;

    /* renamed from: J0  reason: collision with root package name */
    public int f50418J0;

    /* renamed from: L0  reason: collision with root package name */
    public boolean f50420L0;

    /* renamed from: M0  reason: collision with root package name */
    public boolean f50421M0;

    /* renamed from: N0  reason: collision with root package name */
    public boolean f50422N0;

    /* renamed from: O0  reason: collision with root package name */
    public int f50423O0;

    /* renamed from: P0  reason: collision with root package name */
    public C6509L f50424P0;

    /* renamed from: Q0  reason: collision with root package name */
    public long f50425Q0;

    /* renamed from: R0  reason: collision with root package name */
    public int f50426R0;

    /* renamed from: S0  reason: collision with root package name */
    public boolean f50427S0;

    /* renamed from: T0  reason: collision with root package name */
    public C6527n f50428T0;

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC6519f[] f50430Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Set f50431Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC6519f[] f50432h0;

    /* renamed from: i0  reason: collision with root package name */
    public final H2.v f50433i0;

    /* renamed from: j0  reason: collision with root package name */
    public final H2.w f50434j0;

    /* renamed from: k0  reason: collision with root package name */
    public final AbstractC6511N f50435k0;

    /* renamed from: l0  reason: collision with root package name */
    public final I2.c f50436l0;

    /* renamed from: m0  reason: collision with root package name */
    public final s2.y f50437m0;

    /* renamed from: n0  reason: collision with root package name */
    public final HandlerThread f50438n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Looper f50439o0;

    /* renamed from: p0  reason: collision with root package name */
    public final p2.f0 f50440p0;

    /* renamed from: q0  reason: collision with root package name */
    public final p2.e0 f50441q0;

    /* renamed from: r0  reason: collision with root package name */
    public final long f50442r0;

    /* renamed from: s0  reason: collision with root package name */
    public final C6525l f50443s0;

    /* renamed from: t0  reason: collision with root package name */
    public final ArrayList f50444t0;

    /* renamed from: u0  reason: collision with root package name */
    public final AbstractC5532b f50445u0;

    /* renamed from: v0  reason: collision with root package name */
    public final C6533u f50446v0;

    /* renamed from: w0  reason: collision with root package name */
    public final U f50447w0;

    /* renamed from: x0  reason: collision with root package name */
    public final c0 f50448x0;

    /* renamed from: y0  reason: collision with root package name */
    public final C6522i f50449y0;

    /* renamed from: z0  reason: collision with root package name */
    public final long f50450z0;

    /* renamed from: K0  reason: collision with root package name */
    public boolean f50419K0 = false;

    /* renamed from: U0  reason: collision with root package name */
    public long f50429U0 = -9223372036854775807L;

    /* renamed from: H0  reason: collision with root package name */
    public long f50416H0 = -9223372036854775807L;

    public C6510M(AbstractC6519f[] abstractC6519fArr, H2.v vVar, H2.w wVar, AbstractC6511N abstractC6511N, I2.c cVar, int i10, AbstractC6756a abstractC6756a, l0 l0Var, C6522i c6522i, long j6, boolean z10, Looper looper, AbstractC5532b abstractC5532b, C6533u c6533u, C6755D c6755d) {
        this.f50446v0 = c6533u;
        this.f50430Y = abstractC6519fArr;
        this.f50433i0 = vVar;
        this.f50434j0 = wVar;
        this.f50435k0 = abstractC6511N;
        this.f50436l0 = cVar;
        this.f50418J0 = i10;
        this.f50409A0 = l0Var;
        this.f50449y0 = c6522i;
        this.f50450z0 = j6;
        this.f50413E0 = z10;
        this.f50445u0 = abstractC5532b;
        this.f50442r0 = ((C6523j) abstractC6511N).f50639g;
        d0 h10 = d0.h(wVar);
        this.f50410B0 = h10;
        this.f50411C0 = new C6507J(h10);
        this.f50432h0 = new AbstractC6519f[abstractC6519fArr.length];
        H2.p pVar = (H2.p) vVar;
        pVar.getClass();
        for (int i11 = 0; i11 < abstractC6519fArr.length; i11++) {
            AbstractC6519f abstractC6519f = abstractC6519fArr[i11];
            abstractC6519f.f50567j0 = i11;
            abstractC6519f.f50568k0 = c6755d;
            abstractC6519f.f50569l0 = abstractC5532b;
            this.f50432h0[i11] = abstractC6519f;
            synchronized (abstractC6519f.f50563Y) {
                abstractC6519f.f50579v0 = pVar;
            }
        }
        this.f50443s0 = new C6525l(this, abstractC5532b);
        this.f50444t0 = new ArrayList();
        this.f50431Z = Collections.newSetFromMap(new IdentityHashMap());
        this.f50440p0 = new p2.f0();
        this.f50441q0 = new p2.e0();
        vVar.f7335a = this;
        vVar.f7336b = cVar;
        this.f50427S0 = true;
        s2.w wVar2 = (s2.w) abstractC5532b;
        s2.y a5 = wVar2.a(looper, null);
        this.f50447w0 = new U(abstractC6756a, a5);
        this.f50448x0 = new c0(this, abstractC6756a, a5, c6755d);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f50438n0 = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f50439o0 = looper2;
        this.f50437m0 = wVar2.a(looper2, this);
    }

    public static Pair H(p2.g0 g0Var, C6509L c6509l, boolean z10, int i10, boolean z11, p2.f0 f0Var, p2.e0 e0Var) {
        p2.g0 g0Var2;
        Pair k10;
        Object I10;
        p2.g0 g0Var3 = c6509l.f50406a;
        if (g0Var.r()) {
            return null;
        }
        if (g0Var3.r()) {
            g0Var2 = g0Var;
        } else {
            g0Var2 = g0Var3;
        }
        try {
            k10 = g0Var2.k(f0Var, e0Var, c6509l.f50407b, c6509l.f50408c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (g0Var.equals(g0Var2)) {
            return k10;
        }
        if (g0Var.c(k10.first) != -1) {
            if (g0Var2.i(k10.first, e0Var).f42027k0 && g0Var2.o(e0Var.f42024h0, f0Var, 0L).f42059t0 == g0Var2.c(k10.first)) {
                return g0Var.k(f0Var, e0Var, g0Var.i(k10.first, e0Var).f42024h0, c6509l.f50408c);
            }
            return k10;
        }
        if (z10 && (I10 = I(f0Var, e0Var, i10, z11, k10.first, g0Var2, g0Var)) != null) {
            return g0Var.k(f0Var, e0Var, g0Var.i(I10, e0Var).f42024h0, -9223372036854775807L);
        }
        return null;
    }

    public static Object I(p2.f0 f0Var, p2.e0 e0Var, int i10, boolean z10, Object obj, p2.g0 g0Var, p2.g0 g0Var2) {
        int c10 = g0Var.c(obj);
        int j6 = g0Var.j();
        int i11 = c10;
        int i12 = -1;
        for (int i13 = 0; i13 < j6 && i12 == -1; i13++) {
            i11 = g0Var.e(i11, e0Var, f0Var, i10, z10);
            if (i11 == -1) {
                break;
            }
            i12 = g0Var2.c(g0Var.n(i11));
        }
        if (i12 == -1) {
            return null;
        }
        return g0Var2.n(i12);
    }

    public static void N(AbstractC6519f abstractC6519f, long j6) {
        abstractC6519f.f50576s0 = true;
        if (abstractC6519f instanceof G2.g) {
            G2.g gVar = (G2.g) abstractC6519f;
            Gi.e.n(gVar.f50576s0);
            gVar.f5874P0 = j6;
        }
    }

    public static void d(f0 f0Var) {
        synchronized (f0Var) {
        }
        try {
            f0Var.f50580a.b(f0Var.f50583d, f0Var.f50584e);
        } finally {
            f0Var.b(true);
        }
    }

    public static boolean r(AbstractC6519f abstractC6519f) {
        if (abstractC6519f.f50570m0 != 0) {
            return true;
        }
        return false;
    }

    public final void A() {
        boolean z10;
        for (int i10 = 0; i10 < this.f50430Y.length; i10++) {
            AbstractC6519f abstractC6519f = this.f50432h0[i10];
            synchronized (abstractC6519f.f50563Y) {
                abstractC6519f.f50579v0 = null;
            }
            AbstractC6519f abstractC6519f2 = this.f50430Y[i10];
            if (abstractC6519f2.f50570m0 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Gi.e.n(z10);
            abstractC6519f2.p();
        }
    }

    public final void B(int i10, int i11, E2.a0 a0Var) {
        boolean z10 = true;
        this.f50411C0.a(1);
        c0 c0Var = this.f50448x0;
        c0Var.getClass();
        if (i10 < 0 || i10 > i11 || i11 > c0Var.f50524b.size()) {
            z10 = false;
        }
        Gi.e.l(z10);
        c0Var.f50532j = a0Var;
        c0Var.g(i10, i11);
        m(c0Var.b(), false);
    }

    public final void C() {
        boolean z10;
        float f6 = this.f50443s0.c().f41934Y;
        U u10 = this.f50447w0;
        S s10 = u10.f50488h;
        S s11 = u10.f50489i;
        boolean z11 = true;
        for (S s12 = s10; s12 != null && s12.f50460d; s12 = s12.f50468l) {
            H2.w h10 = s12.h(f6, this.f50410B0.f50536a);
            H2.w wVar = s12.f50470n;
            if (wVar != null) {
                int length = wVar.f7339c.length;
                H2.s[] sVarArr = h10.f7339c;
                if (length == sVarArr.length) {
                    for (int i10 = 0; i10 < sVarArr.length; i10++) {
                        if (h10.a(wVar, i10)) {
                        }
                    }
                    if (s12 == s11) {
                        z11 = false;
                    }
                }
            }
            if (z11) {
                U u11 = this.f50447w0;
                S s13 = u11.f50488h;
                boolean l10 = u11.l(s13);
                boolean[] zArr = new boolean[this.f50430Y.length];
                long a5 = s13.a(h10, this.f50410B0.f50553r, l10, zArr);
                d0 d0Var = this.f50410B0;
                if (d0Var.f50540e != 4 && a5 != d0Var.f50553r) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d0 d0Var2 = this.f50410B0;
                this.f50410B0 = p(d0Var2.f50537b, a5, d0Var2.f50538c, d0Var2.f50539d, z10, 5);
                if (z10) {
                    F(a5);
                }
                boolean[] zArr2 = new boolean[this.f50430Y.length];
                int i11 = 0;
                while (true) {
                    AbstractC6519f[] abstractC6519fArr = this.f50430Y;
                    if (i11 >= abstractC6519fArr.length) {
                        break;
                    }
                    AbstractC6519f abstractC6519f = abstractC6519fArr[i11];
                    boolean r10 = r(abstractC6519f);
                    zArr2[i11] = r10;
                    E2.Y y10 = s13.f50459c[i11];
                    if (r10) {
                        if (y10 != abstractC6519f.f50571n0) {
                            e(abstractC6519f);
                        } else if (zArr[i11]) {
                            long j6 = this.f50425Q0;
                            abstractC6519f.f50576s0 = false;
                            abstractC6519f.f50574q0 = j6;
                            abstractC6519f.f50575r0 = j6;
                            abstractC6519f.o(j6, false);
                            i11++;
                        }
                    }
                    i11++;
                }
                g(zArr2, this.f50425Q0);
            } else {
                this.f50447w0.l(s12);
                if (s12.f50460d) {
                    s12.a(h10, Math.max(s12.f50462f.f50473b, this.f50425Q0 - s12.f50471o), false, new boolean[s12.f50465i.length]);
                }
            }
            l(true);
            if (this.f50410B0.f50540e != 4) {
                t();
                f0();
                this.f50437m0.d(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
        if (r5.equals(r32.f50410B0.f50537b) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(boolean z10, boolean z11, boolean z12, boolean z13) {
        long j6;
        p2.g0 g0Var;
        C0492y c0492y;
        p2.g0 g0Var2;
        E2.i0 i0Var;
        H2.w wVar;
        List list;
        AbstractC6519f[] abstractC6519fArr;
        this.f50437m0.f45201a.removeMessages(2);
        C6527n c6527n = null;
        this.f50428T0 = null;
        boolean z14 = true;
        h0(false, true);
        C6525l c6525l = this.f50443s0;
        c6525l.f50650k0 = false;
        m0 m0Var = c6525l.f50645Y;
        if (m0Var.f50657Z) {
            m0Var.b(m0Var.a());
            m0Var.f50657Z = false;
        }
        this.f50425Q0 = 1000000000000L;
        for (AbstractC6519f abstractC6519f : this.f50430Y) {
            try {
                e(abstractC6519f);
            } catch (RuntimeException | C6527n e10) {
                s2.p.d("ExoPlayerImplInternal", "Disable failed.", e10);
            }
        }
        if (z10) {
            for (AbstractC6519f abstractC6519f2 : this.f50430Y) {
                if (this.f50431Z.remove(abstractC6519f2)) {
                    try {
                        abstractC6519f2.x();
                    } catch (RuntimeException e11) {
                        s2.p.d("ExoPlayerImplInternal", "Reset failed.", e11);
                    }
                }
            }
        }
        this.f50423O0 = 0;
        d0 d0Var = this.f50410B0;
        C0492y c0492y2 = d0Var.f50537b;
        long j10 = d0Var.f50553r;
        if (!this.f50410B0.f50537b.b()) {
            d0 d0Var2 = this.f50410B0;
            p2.e0 e0Var = this.f50441q0;
            C0492y c0492y3 = d0Var2.f50537b;
            p2.g0 g0Var3 = d0Var2.f50536a;
            if (!g0Var3.r() && !g0Var3.i(c0492y3.f4420a, e0Var).f42027k0) {
                j6 = this.f50410B0.f50553r;
                if (z11) {
                    this.f50424P0 = null;
                    Pair i10 = i(this.f50410B0.f50536a);
                    c0492y2 = (C0492y) i10.first;
                    j10 = ((Long) i10.second).longValue();
                    j6 = -9223372036854775807L;
                }
                z14 = false;
                long j11 = j10;
                long j12 = j6;
                this.f50447w0.b();
                this.f50417I0 = false;
                g0Var = this.f50410B0.f50536a;
                if (!z12 && (g0Var instanceof h0)) {
                    h0 h0Var = (h0) g0Var;
                    E2.a0 a0Var = this.f50448x0.f50532j;
                    p2.g0[] g0VarArr = h0Var.f50615p0;
                    p2.g0[] g0VarArr2 = new p2.g0[g0VarArr.length];
                    for (int i11 = 0; i11 < g0VarArr.length; i11++) {
                        g0VarArr2[i11] = new g0(h0Var, g0VarArr[i11]);
                    }
                    g0Var2 = new h0(g0VarArr2, h0Var.f50616q0, a0Var);
                    if (c0492y2.f4421b != -1) {
                        g0Var2.i(c0492y2.f4420a, this.f50441q0);
                        int i12 = this.f50441q0.f42024h0;
                        p2.f0 f0Var = this.f50440p0;
                        g0Var2.o(i12, f0Var, 0L);
                        if (f0Var.b()) {
                            c0492y = new C0492y(c0492y2.f4423d, c0492y2.f4420a);
                            d0 d0Var3 = this.f50410B0;
                            int i13 = d0Var3.f50540e;
                            if (!z13) {
                                c6527n = d0Var3.f50541f;
                            }
                            C6527n c6527n2 = c6527n;
                            if (z14) {
                                i0Var = E2.i0.f4359i0;
                            } else {
                                i0Var = d0Var3.f50543h;
                            }
                            E2.i0 i0Var2 = i0Var;
                            if (z14) {
                                wVar = this.f50434j0;
                            } else {
                                wVar = d0Var3.f50544i;
                            }
                            H2.w wVar2 = wVar;
                            if (z14) {
                                x8.L l10 = x8.N.f49523Z;
                                list = x8.k0.f49573j0;
                            } else {
                                list = d0Var3.f50545j;
                            }
                            this.f50410B0 = new d0(g0Var2, c0492y, j12, j11, i13, c6527n2, false, i0Var2, wVar2, list, c0492y, d0Var3.f50547l, d0Var3.f50548m, d0Var3.f50549n, j11, 0L, j11, 0L, false);
                            if (z12) {
                                c0 c0Var = this.f50448x0;
                                HashMap hashMap = c0Var.f50528f;
                                for (a0 a0Var2 : hashMap.values()) {
                                    try {
                                        a0Var2.f50513a.n(a0Var2.f50514b);
                                    } catch (RuntimeException e12) {
                                        s2.p.d("MediaSourceList", "Failed to release child source.", e12);
                                    }
                                    AbstractC0469a abstractC0469a = a0Var2.f50513a;
                                    U3.c cVar = a0Var2.f50515c;
                                    abstractC0469a.q(cVar);
                                    a0Var2.f50513a.p(cVar);
                                }
                                hashMap.clear();
                                c0Var.f50529g.clear();
                                c0Var.f50533k = false;
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    g0Var2 = g0Var;
                }
                c0492y = c0492y2;
                d0 d0Var32 = this.f50410B0;
                int i132 = d0Var32.f50540e;
                if (!z13) {
                }
                C6527n c6527n22 = c6527n;
                if (z14) {
                }
                E2.i0 i0Var22 = i0Var;
                if (z14) {
                }
                H2.w wVar22 = wVar;
                if (z14) {
                }
                this.f50410B0 = new d0(g0Var2, c0492y, j12, j11, i132, c6527n22, false, i0Var22, wVar22, list, c0492y, d0Var32.f50547l, d0Var32.f50548m, d0Var32.f50549n, j11, 0L, j11, 0L, false);
                if (z12) {
                }
            }
        }
        j6 = this.f50410B0.f50538c;
        if (z11) {
        }
        z14 = false;
        long j112 = j10;
        long j122 = j6;
        this.f50447w0.b();
        this.f50417I0 = false;
        g0Var = this.f50410B0.f50536a;
        if (!z12) {
        }
        g0Var2 = g0Var;
        c0492y = c0492y2;
        d0 d0Var322 = this.f50410B0;
        int i1322 = d0Var322.f50540e;
        if (!z13) {
        }
        C6527n c6527n222 = c6527n;
        if (z14) {
        }
        E2.i0 i0Var222 = i0Var;
        if (z14) {
        }
        H2.w wVar222 = wVar;
        if (z14) {
        }
        this.f50410B0 = new d0(g0Var2, c0492y, j122, j112, i1322, c6527n222, false, i0Var222, wVar222, list, c0492y, d0Var322.f50547l, d0Var322.f50548m, d0Var322.f50549n, j112, 0L, j112, 0L, false);
        if (z12) {
        }
    }

    public final void E() {
        boolean z10;
        S s10 = this.f50447w0.f50488h;
        if (s10 != null && s10.f50462f.f50479h && this.f50413E0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f50414F0 = z10;
    }

    public final void F(long j6) {
        U u10;
        long j10;
        AbstractC6519f[] abstractC6519fArr;
        H2.s[] sVarArr;
        S s10 = this.f50447w0.f50488h;
        if (s10 == null) {
            j10 = 1000000000000L;
        } else {
            j10 = s10.f50471o;
        }
        long j11 = j6 + j10;
        this.f50425Q0 = j11;
        this.f50443s0.f50645Y.b(j11);
        for (AbstractC6519f abstractC6519f : this.f50430Y) {
            if (r(abstractC6519f)) {
                long j12 = this.f50425Q0;
                abstractC6519f.f50576s0 = false;
                abstractC6519f.f50574q0 = j12;
                abstractC6519f.f50575r0 = j12;
                abstractC6519f.o(j12, false);
            }
        }
        for (S s11 = u10.f50488h; s11 != null; s11 = s11.f50468l) {
            for (H2.s sVar : s11.f50470n.f7339c) {
                if (sVar != null) {
                    sVar.i();
                }
            }
        }
    }

    public final void G(p2.g0 g0Var, p2.g0 g0Var2) {
        if (g0Var.r() && g0Var2.r()) {
            return;
        }
        ArrayList arrayList = this.f50444t0;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            AbstractC2469q0.p(arrayList.get(size));
            throw null;
        }
    }

    public final void J(boolean z10) {
        C0492y c0492y = this.f50447w0.f50488h.f50462f.f50472a;
        long L10 = L(c0492y, this.f50410B0.f50553r, true, false);
        if (L10 != this.f50410B0.f50553r) {
            d0 d0Var = this.f50410B0;
            this.f50410B0 = p(c0492y, L10, d0Var.f50538c, d0Var.f50539d, z10, 5);
        }
    }

    public final void K(C6509L c6509l) {
        long j6;
        long j10;
        boolean z10;
        C0492y c0492y;
        long j11;
        Throwable th2;
        long j12;
        long j13;
        boolean z11;
        boolean z12;
        long j14;
        d0 d0Var;
        int i10;
        long j15;
        boolean z13;
        long j16;
        boolean z14 = true;
        this.f50411C0.a(1);
        Pair H6 = H(this.f50410B0.f50536a, c6509l, true, this.f50418J0, this.f50419K0, this.f50440p0, this.f50441q0);
        if (H6 == null) {
            Pair i11 = i(this.f50410B0.f50536a);
            c0492y = (C0492y) i11.first;
            long longValue = ((Long) i11.second).longValue();
            z10 = !this.f50410B0.f50536a.r();
            j6 = longValue;
            j10 = -9223372036854775807L;
        } else {
            Object obj = H6.first;
            long longValue2 = ((Long) H6.second).longValue();
            if (c6509l.f50408c == -9223372036854775807L) {
                j15 = -9223372036854775807L;
            } else {
                j15 = longValue2;
            }
            C0492y n10 = this.f50447w0.n(this.f50410B0.f50536a, obj, longValue2);
            if (n10.b()) {
                this.f50410B0.f50536a.i(n10.f4420a, this.f50441q0);
                if (this.f50441q0.g(n10.f4421b) == n10.f4422c) {
                    j16 = this.f50441q0.f42028l0.f41990h0;
                } else {
                    j16 = 0;
                }
                j6 = j16;
                j10 = j15;
                c0492y = n10;
                z10 = true;
            } else {
                if (c6509l.f50408c == -9223372036854775807L) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                j6 = longValue2;
                j10 = j15;
                z10 = z13;
                c0492y = n10;
            }
        }
        try {
            if (this.f50410B0.f50536a.r()) {
                this.f50424P0 = c6509l;
            } else if (H6 == null) {
                if (this.f50410B0.f50540e != 1) {
                    W(4);
                }
                D(false, true, false, true);
            } else {
                if (c0492y.equals(this.f50410B0.f50537b)) {
                    S s10 = this.f50447w0.f50488h;
                    if (s10 != null && s10.f50460d && j6 != 0) {
                        j14 = s10.f50457a.p(j6, this.f50409A0);
                    } else {
                        j14 = j6;
                    }
                    if (AbstractC5530A.L(j14) == AbstractC5530A.L(this.f50410B0.f50553r) && ((i10 = (d0Var = this.f50410B0).f50540e) == 2 || i10 == 3)) {
                        long j17 = d0Var.f50553r;
                        this.f50410B0 = p(c0492y, j17, j10, j17, z10, 2);
                        return;
                    }
                    j13 = j14;
                } else {
                    j13 = j6;
                }
                if (this.f50410B0.f50540e == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                U u10 = this.f50447w0;
                if (u10.f50488h != u10.f50489i) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                long L10 = L(c0492y, j13, z12, z11);
                if (j6 == L10) {
                    z14 = false;
                }
                z10 |= z14;
                try {
                    d0 d0Var2 = this.f50410B0;
                    p2.g0 g0Var = d0Var2.f50536a;
                    g0(g0Var, c0492y, g0Var, d0Var2.f50537b, j10, true);
                    j12 = L10;
                    this.f50410B0 = p(c0492y, j12, j10, j12, z10, 2);
                } catch (Throwable th3) {
                    th2 = th3;
                    j11 = L10;
                    this.f50410B0 = p(c0492y, j11, j10, j11, z10, 2);
                    throw th2;
                }
            }
            j12 = j6;
            this.f50410B0 = p(c0492y, j12, j10, j12, z10, 2);
        } catch (Throwable th4) {
            th2 = th4;
            j11 = j6;
        }
    }

    public final long L(C0492y c0492y, long j6, boolean z10, boolean z11) {
        b0();
        h0(false, true);
        if (z11 || this.f50410B0.f50540e == 3) {
            W(2);
        }
        U u10 = this.f50447w0;
        S s10 = u10.f50488h;
        S s11 = s10;
        while (s11 != null && !c0492y.equals(s11.f50462f.f50472a)) {
            s11 = s11.f50468l;
        }
        if (z10 || s10 != s11 || (s11 != null && s11.f50471o + j6 < 0)) {
            AbstractC6519f[] abstractC6519fArr = this.f50430Y;
            for (AbstractC6519f abstractC6519f : abstractC6519fArr) {
                e(abstractC6519f);
            }
            if (s11 != null) {
                while (u10.f50488h != s11) {
                    u10.a();
                }
                u10.l(s11);
                s11.f50471o = 1000000000000L;
                g(new boolean[abstractC6519fArr.length], u10.f50489i.e());
            }
        }
        if (s11 != null) {
            u10.l(s11);
            if (!s11.f50460d) {
                s11.f50462f = s11.f50462f.b(j6);
            } else if (s11.f50461e) {
                AbstractC0490w abstractC0490w = s11.f50457a;
                j6 = abstractC0490w.j(j6);
                abstractC0490w.k(j6 - this.f50442r0);
            }
            F(j6);
            t();
        } else {
            u10.b();
            F(j6);
        }
        l(false);
        this.f50437m0.d(2);
        return j6;
    }

    public final void M(f0 f0Var) {
        Looper looper = f0Var.f50585f;
        if (!looper.getThread().isAlive()) {
            s2.p.g("TAG", "Trying to send message on a dead thread.");
            f0Var.b(false);
            return;
        }
        ((s2.w) this.f50445u0).a(looper, null).c(new RunnableC4517N(this, 8, f0Var));
    }

    public final void O(boolean z10, AtomicBoolean atomicBoolean) {
        AbstractC6519f[] abstractC6519fArr;
        if (this.f50420L0 != z10) {
            this.f50420L0 = z10;
            if (!z10) {
                for (AbstractC6519f abstractC6519f : this.f50430Y) {
                    if (!r(abstractC6519f) && this.f50431Z.remove(abstractC6519f)) {
                        abstractC6519f.x();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void P(C6506I c6506i) {
        this.f50411C0.a(1);
        int i10 = c6506i.f50391c;
        E2.a0 a0Var = c6506i.f50390b;
        List list = c6506i.f50389a;
        if (i10 != -1) {
            this.f50424P0 = new C6509L(new h0(list, a0Var), c6506i.f50391c, c6506i.f50392d);
        }
        c0 c0Var = this.f50448x0;
        ArrayList arrayList = c0Var.f50524b;
        c0Var.g(0, arrayList.size());
        m(c0Var.a(arrayList.size(), list, a0Var), false);
    }

    public final void Q(boolean z10) {
        this.f50413E0 = z10;
        E();
        if (this.f50414F0) {
            U u10 = this.f50447w0;
            if (u10.f50489i != u10.f50488h) {
                J(true);
                l(false);
            }
        }
    }

    public final void R(int i10, int i11, boolean z10, boolean z11) {
        H2.s[] sVarArr;
        this.f50411C0.a(z11 ? 1 : 0);
        C6507J c6507j = this.f50411C0;
        c6507j.f50393a = true;
        c6507j.f50398f = true;
        c6507j.f50399g = i11;
        this.f50410B0 = this.f50410B0.d(i10, z10);
        h0(false, false);
        for (S s10 = this.f50447w0.f50488h; s10 != null; s10 = s10.f50468l) {
            for (H2.s sVar : s10.f50470n.f7339c) {
                if (sVar != null) {
                    sVar.b(z10);
                }
            }
        }
        if (!X()) {
            b0();
            f0();
            return;
        }
        int i12 = this.f50410B0.f50540e;
        s2.y yVar = this.f50437m0;
        if (i12 == 3) {
            Z();
            yVar.d(2);
        } else if (i12 == 2) {
            yVar.d(2);
        }
    }

    public final void S(p2.S s10) {
        this.f50437m0.f45201a.removeMessages(16);
        C6525l c6525l = this.f50443s0;
        c6525l.d(s10);
        p2.S c10 = c6525l.c();
        o(c10, c10.f41934Y, true, true);
    }

    public final void T(int i10) {
        this.f50418J0 = i10;
        p2.g0 g0Var = this.f50410B0.f50536a;
        U u10 = this.f50447w0;
        u10.f50486f = i10;
        if (!u10.o(g0Var)) {
            J(true);
        }
        l(false);
    }

    public final void U(boolean z10) {
        this.f50419K0 = z10;
        p2.g0 g0Var = this.f50410B0.f50536a;
        U u10 = this.f50447w0;
        u10.f50487g = z10;
        if (!u10.o(g0Var)) {
            J(true);
        }
        l(false);
    }

    public final void V(E2.a0 a0Var) {
        this.f50411C0.a(1);
        c0 c0Var = this.f50448x0;
        int size = c0Var.f50524b.size();
        if (a0Var.f4283b.length != size) {
            a0Var = new E2.a0(new Random(a0Var.f4282a.nextLong())).a(size);
        }
        c0Var.f50532j = a0Var;
        m(c0Var.b(), false);
    }

    public final void W(int i10) {
        d0 d0Var = this.f50410B0;
        if (d0Var.f50540e != i10) {
            if (i10 != 2) {
                this.f50429U0 = -9223372036854775807L;
            }
            this.f50410B0 = d0Var.f(i10);
        }
    }

    public final boolean X() {
        d0 d0Var = this.f50410B0;
        if (d0Var.f50547l && d0Var.f50548m == 0) {
            return true;
        }
        return false;
    }

    public final boolean Y(p2.g0 g0Var, C0492y c0492y) {
        if (c0492y.b() || g0Var.r()) {
            return false;
        }
        int i10 = g0Var.i(c0492y.f4420a, this.f50441q0).f42024h0;
        p2.f0 f0Var = this.f50440p0;
        g0Var.p(i10, f0Var);
        if (!f0Var.b() || !f0Var.f42053n0 || f0Var.f42050k0 == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    public final void Z() {
        AbstractC6519f[] abstractC6519fArr;
        boolean z10;
        h0(false, false);
        C6525l c6525l = this.f50443s0;
        c6525l.f50650k0 = true;
        c6525l.f50645Y.e();
        for (AbstractC6519f abstractC6519f : this.f50430Y) {
            if (r(abstractC6519f)) {
                if (abstractC6519f.f50570m0 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Gi.e.n(z10);
                abstractC6519f.f50570m0 = 2;
                abstractC6519f.r();
            }
        }
    }

    @Override // E2.AbstractC0489v
    public final void a(AbstractC0490w abstractC0490w) {
        this.f50437m0.a(8, abstractC0490w).b();
    }

    public final void a0(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.f50420L0) {
            z12 = false;
        } else {
            z12 = true;
        }
        D(z12, false, true, false);
        this.f50411C0.a(z11 ? 1 : 0);
        ((C6523j) this.f50435k0).b(true);
        W(1);
    }

    @Override // E2.AbstractC0489v
    public final void b(E2.Z z10) {
        this.f50437m0.a(9, (AbstractC0490w) z10).b();
    }

    public final void b0() {
        AbstractC6519f[] abstractC6519fArr;
        int i10;
        boolean z10;
        C6525l c6525l = this.f50443s0;
        c6525l.f50650k0 = false;
        m0 m0Var = c6525l.f50645Y;
        if (m0Var.f50657Z) {
            m0Var.b(m0Var.a());
            m0Var.f50657Z = false;
        }
        for (AbstractC6519f abstractC6519f : this.f50430Y) {
            if (r(abstractC6519f) && (i10 = abstractC6519f.f50570m0) == 2) {
                if (i10 == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Gi.e.n(z10);
                abstractC6519f.f50570m0 = 1;
                abstractC6519f.s();
            }
        }
    }

    public final void c(C6506I c6506i, int i10) {
        this.f50411C0.a(1);
        c0 c0Var = this.f50448x0;
        if (i10 == -1) {
            i10 = c0Var.f50524b.size();
        }
        m(c0Var.a(i10, c6506i.f50389a, c6506i.f50390b), false);
    }

    public final void c0() {
        boolean z10;
        S s10 = this.f50447w0.f50490j;
        if (!this.f50417I0 && (s10 == null || !s10.f50457a.l())) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        d0 d0Var = this.f50410B0;
        if (z11 != d0Var.f50542g) {
            this.f50410B0 = new d0(d0Var.f50536a, d0Var.f50537b, d0Var.f50538c, d0Var.f50539d, d0Var.f50540e, d0Var.f50541f, z11, d0Var.f50543h, d0Var.f50544i, d0Var.f50545j, d0Var.f50546k, d0Var.f50547l, d0Var.f50548m, d0Var.f50549n, d0Var.f50551p, d0Var.f50552q, d0Var.f50553r, d0Var.f50554s, d0Var.f50550o);
        }
    }

    public final void d0(H2.w wVar) {
        p2.g0 g0Var = this.f50410B0.f50536a;
        H2.s[] sVarArr = wVar.f7339c;
        C6523j c6523j = (C6523j) this.f50435k0;
        int i10 = c6523j.f50638f;
        if (i10 == -1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                AbstractC6519f[] abstractC6519fArr = this.f50430Y;
                int i13 = 13107200;
                if (i11 < abstractC6519fArr.length) {
                    if (sVarArr[i11] != null) {
                        switch (abstractC6519fArr[i11].f50564Z) {
                            case -2:
                                i13 = 0;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i13 = 144310272;
                                break;
                            case 1:
                                break;
                            case 2:
                                i13 = 131072000;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i13 = 131072;
                                break;
                        }
                        i12 += i13;
                    }
                    i11++;
                } else {
                    i10 = Math.max(13107200, i12);
                }
            }
        }
        c6523j.f50640h = i10;
        c6523j.f50633a.a(i10);
    }

    public final void e(AbstractC6519f abstractC6519f) {
        boolean z10;
        boolean z11;
        if (!r(abstractC6519f)) {
            return;
        }
        C6525l c6525l = this.f50443s0;
        if (abstractC6519f == c6525l.f50647h0) {
            c6525l.f50648i0 = null;
            c6525l.f50647h0 = null;
            c6525l.f50649j0 = true;
        }
        int i10 = abstractC6519f.f50570m0;
        if (i10 == 2) {
            if (i10 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            Gi.e.n(z11);
            abstractC6519f.f50570m0 = 1;
            abstractC6519f.s();
        }
        if (abstractC6519f.f50570m0 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
        abstractC6519f.f50565h0.g();
        abstractC6519f.f50570m0 = 0;
        abstractC6519f.f50571n0 = null;
        abstractC6519f.f50572o0 = null;
        abstractC6519f.f50576s0 = false;
        abstractC6519f.m();
        this.f50423O0--;
    }

    public final void e0(List list, int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        this.f50411C0.a(1);
        c0 c0Var = this.f50448x0;
        c0Var.getClass();
        ArrayList arrayList = c0Var.f50524b;
        if (i10 >= 0 && i10 <= i11 && i11 <= arrayList.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        if (list.size() != i11 - i10) {
            z11 = false;
        }
        Gi.e.l(z11);
        for (int i12 = i10; i12 < i11; i12++) {
            ((b0) arrayList.get(i12)).f50516a.r((p2.H) list.get(i12 - i10));
        }
        m(c0Var.b(), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:280:0x04c1, code lost:
        if (s() != false) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0574, code lost:
        if (r0 >= r14.f50640h) goto L282;
     */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x06db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        int i10;
        int i11;
        int i12;
        int i13;
        long j6;
        S s10;
        boolean z10;
        boolean z11;
        d0 d0Var;
        int i14;
        E2.Y y10;
        d0 d0Var2;
        int i15;
        H2.s[] sVarArr;
        long j10;
        boolean z12;
        boolean z13;
        long j11;
        long j12;
        int i16;
        int i17;
        int i18;
        long j13;
        boolean z14;
        U u10;
        S s11;
        S s12;
        boolean z15;
        int i19;
        AbstractC6519f[] abstractC6519fArr;
        AbstractC6519f[] abstractC6519fArr2;
        boolean z16;
        int i20;
        T t10;
        long j14;
        boolean z17;
        C6510M c6510m = this;
        ((s2.w) c6510m.f50445u0).getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        c6510m.f50437m0.f45201a.removeMessages(2);
        if (c6510m.f50410B0.f50536a.r() || !c6510m.f50448x0.f50533k) {
            i10 = 1;
        } else {
            U u11 = c6510m.f50447w0;
            long j15 = c6510m.f50425Q0;
            S s13 = u11.f50490j;
            if (s13 != null) {
                if (s13.f50468l == null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                Gi.e.n(z17);
                if (s13.f50460d) {
                    s13.f50457a.C(j15 - s13.f50471o);
                }
            }
            U u12 = c6510m.f50447w0;
            S s14 = u12.f50490j;
            if (s14 == null || (!s14.f50462f.f50480i && s14.f() && u12.f50490j.f50462f.f50476e != -9223372036854775807L && u12.f50491k < 100)) {
                U u13 = c6510m.f50447w0;
                long j16 = c6510m.f50425Q0;
                d0 d0Var3 = c6510m.f50410B0;
                S s15 = u13.f50490j;
                if (s15 == null) {
                    t10 = u13.e(d0Var3.f50536a, d0Var3.f50537b, d0Var3.f50538c, d0Var3.f50553r);
                } else {
                    t10 = u13.d(d0Var3.f50536a, s15, j16);
                }
                if (t10 != null) {
                    U u14 = c6510m.f50447w0;
                    AbstractC6519f[] abstractC6519fArr3 = c6510m.f50432h0;
                    H2.v vVar = c6510m.f50433i0;
                    I2.d dVar = ((C6523j) c6510m.f50435k0).f50633a;
                    c0 c0Var = c6510m.f50448x0;
                    H2.w wVar = c6510m.f50434j0;
                    S s16 = u14.f50490j;
                    if (s16 == null) {
                        j14 = 1000000000000L;
                    } else {
                        j14 = (s16.f50471o + s16.f50462f.f50476e) - t10.f50473b;
                    }
                    S s17 = new S(abstractC6519fArr3, j14, vVar, dVar, c0Var, t10, wVar);
                    S s18 = u14.f50490j;
                    if (s18 != null) {
                        if (s17 != s18.f50468l) {
                            s18.b();
                            s18.f50468l = s17;
                            s18.c();
                        }
                    } else {
                        u14.f50488h = s17;
                        u14.f50489i = s17;
                    }
                    u14.f50492l = null;
                    u14.f50490j = s17;
                    u14.f50491k++;
                    u14.k();
                    s17.f50457a.q(c6510m, t10.f50473b);
                    if (c6510m.f50447w0.f50488h == s17) {
                        c6510m.F(t10.f50473b);
                    }
                    c6510m.l(false);
                }
            }
            if (c6510m.f50417I0) {
                c6510m.f50417I0 = q();
                c0();
            } else {
                t();
            }
            U u15 = c6510m.f50447w0;
            S s19 = u15.f50489i;
            if (s19 != null) {
                S s20 = s19.f50468l;
                AbstractC6519f[] abstractC6519fArr4 = c6510m.f50430Y;
                if (s20 != null && !c6510m.f50414F0) {
                    if (s19.f50460d) {
                        int i21 = 0;
                        while (true) {
                            if (i21 < abstractC6519fArr4.length) {
                                AbstractC6519f abstractC6519f = abstractC6519fArr4[i21];
                                E2.Y y11 = s19.f50459c[i21];
                                if (abstractC6519f.f50571n0 != y11) {
                                    break;
                                }
                                if (y11 != null && !abstractC6519f.j()) {
                                    S s21 = s19.f50468l;
                                    if (!s19.f50462f.f50477f) {
                                        break;
                                    } else if (!s21.f50460d) {
                                        break;
                                    } else if (!(abstractC6519f instanceof G2.g) && !(abstractC6519f instanceof D2.b) && abstractC6519f.f50575r0 < s21.e()) {
                                        break;
                                    }
                                }
                                i21++;
                            } else {
                                S s22 = s19.f50468l;
                                if (s22.f50460d || c6510m.f50425Q0 >= s22.e()) {
                                    H2.w wVar2 = s19.f50470n;
                                    S s23 = u15.f50489i;
                                    Gi.e.o(s23);
                                    u15.f50489i = s23.f50468l;
                                    u15.k();
                                    S s24 = u15.f50489i;
                                    Gi.e.o(s24);
                                    H2.w wVar3 = s24.f50470n;
                                    p2.g0 g0Var = c6510m.f50410B0.f50536a;
                                    g0(g0Var, s24.f50462f.f50472a, g0Var, s19.f50462f.f50472a, -9223372036854775807L, false);
                                    if (s24.f50460d && s24.f50457a.r() != -9223372036854775807L) {
                                        long e10 = s24.e();
                                        for (AbstractC6519f abstractC6519f2 : abstractC6519fArr4) {
                                            if (abstractC6519f2.f50571n0 != null) {
                                                N(abstractC6519f2, e10);
                                            }
                                        }
                                        if (!s24.f()) {
                                            u15.l(s24);
                                            c6510m = this;
                                            c6510m.l(false);
                                            t();
                                        } else {
                                            c6510m = this;
                                        }
                                    } else {
                                        c6510m = this;
                                        for (int i22 = 0; i22 < abstractC6519fArr4.length; i22++) {
                                            boolean b10 = wVar2.b(i22);
                                            boolean b11 = wVar3.b(i22);
                                            if (b10 && !abstractC6519fArr4[i22].f50576s0) {
                                                if (c6510m.f50432h0[i22].f50564Z == -2) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                j0 j0Var = wVar2.f7338b[i22];
                                                j0 j0Var2 = wVar3.f7338b[i22];
                                                if (!b11 || !j0Var2.equals(j0Var) || z14) {
                                                    N(abstractC6519fArr4[i22], s24.e());
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (s19.f50462f.f50480i || c6510m.f50414F0) {
                    for (int i23 = 0; i23 < abstractC6519fArr4.length; i23++) {
                        AbstractC6519f abstractC6519f3 = abstractC6519fArr4[i23];
                        E2.Y y12 = s19.f50459c[i23];
                        if (y12 != null && abstractC6519f3.f50571n0 == y12 && abstractC6519f3.j()) {
                            long j17 = s19.f50462f.f50476e;
                            if (j17 != -9223372036854775807L && j17 != Long.MIN_VALUE) {
                                j13 = s19.f50471o + j17;
                            } else {
                                j13 = -9223372036854775807L;
                            }
                            N(abstractC6519f3, j13);
                        }
                    }
                }
            }
            U u16 = c6510m.f50447w0;
            S s25 = u16.f50489i;
            if (s25 != null && u16.f50488h != s25 && !s25.f50463g) {
                H2.w wVar4 = s25.f50470n;
                int i24 = 0;
                boolean z18 = false;
                while (true) {
                    abstractC6519fArr2 = c6510m.f50430Y;
                    if (i24 >= abstractC6519fArr2.length) {
                        break;
                    }
                    AbstractC6519f abstractC6519f4 = abstractC6519fArr2[i24];
                    if (r(abstractC6519f4)) {
                        E2.Y y13 = abstractC6519f4.f50571n0;
                        E2.Y[] yArr = s25.f50459c;
                        if (y13 != yArr[i24]) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (!wVar4.b(i24) || z16) {
                            if (!abstractC6519f4.f50576s0) {
                                H2.s sVar = wVar4.f7339c[i24];
                                if (sVar != null) {
                                    i20 = sVar.length();
                                } else {
                                    i20 = 0;
                                }
                                C5065s[] c5065sArr = new C5065s[i20];
                                for (int i25 = 0; i25 < i20; i25++) {
                                    c5065sArr[i25] = sVar.c(i25);
                                }
                                abstractC6519f4.w(c5065sArr, yArr[i24], s25.e(), s25.f50471o, s25.f50462f.f50472a);
                                boolean z19 = c6510m.f50422N0;
                                if (z19 && z19) {
                                    c6510m.f50422N0 = false;
                                    if (c6510m.f50410B0.f50550o) {
                                        c6510m.f50437m0.d(2);
                                    }
                                }
                            } else if (abstractC6519f4.k()) {
                                c6510m.e(abstractC6519f4);
                            } else {
                                z18 = true;
                            }
                        }
                    }
                    i24++;
                }
                if (!z18) {
                    c6510m.g(new boolean[abstractC6519fArr2.length], c6510m.f50447w0.f50489i.e());
                }
            }
            boolean z20 = false;
            while (X() && !c6510m.f50414F0 && (s11 = (u10 = c6510m.f50447w0).f50488h) != null && (s12 = s11.f50468l) != null && c6510m.f50425Q0 >= s12.e() && s12.f50463g) {
                if (z20) {
                    u();
                }
                S a5 = u10.a();
                a5.getClass();
                if (c6510m.f50410B0.f50537b.f4420a.equals(a5.f50462f.f50472a.f4420a)) {
                    C0492y c0492y = c6510m.f50410B0.f50537b;
                    if (c0492y.f4421b == -1) {
                        C0492y c0492y2 = a5.f50462f.f50472a;
                        if (c0492y2.f4421b == -1 && c0492y.f4424e != c0492y2.f4424e) {
                            z15 = true;
                            T t11 = a5.f50462f;
                            C0492y c0492y3 = t11.f50472a;
                            long j18 = t11.f50473b;
                            long j19 = t11.f50474c;
                            z20 = true;
                            c6510m.f50410B0 = p(c0492y3, j18, j19, j18, !z15, 0);
                            E();
                            f0();
                            H2.w wVar5 = u10.f50488h.f50470n;
                            i19 = 0;
                            while (true) {
                                abstractC6519fArr = c6510m.f50430Y;
                                if (i19 >= abstractC6519fArr.length) {
                                    if (wVar5.b(i19)) {
                                        abstractC6519fArr[i19].g();
                                    }
                                    i19++;
                                }
                            }
                        }
                    }
                }
                z15 = false;
                T t112 = a5.f50462f;
                C0492y c0492y32 = t112.f50472a;
                long j182 = t112.f50473b;
                long j192 = t112.f50474c;
                z20 = true;
                c6510m.f50410B0 = p(c0492y32, j182, j192, j182, !z15, 0);
                E();
                f0();
                H2.w wVar52 = u10.f50488h.f50470n;
                i19 = 0;
                while (true) {
                    abstractC6519fArr = c6510m.f50430Y;
                    if (i19 >= abstractC6519fArr.length) {
                        break;
                    }
                    i19++;
                }
            }
            i10 = 1;
        }
        int i26 = c6510m.f50410B0.f50540e;
        if (i26 != i10 && i26 != 4) {
            S s26 = c6510m.f50447w0.f50488h;
            if (s26 == null) {
                c6510m.f50437m0.f45201a.sendEmptyMessageAtTime(2, uptimeMillis + 10);
                return;
            }
            AbstractC5260f.g("doSomeWork");
            f0();
            if (s26.f50460d) {
                ((s2.w) c6510m.f50445u0).getClass();
                long C10 = AbstractC5530A.C(SystemClock.elapsedRealtime());
                s26.f50457a.k(c6510m.f50410B0.f50553r - c6510m.f50442r0);
                i12 = i10;
                i11 = i12;
                int i27 = 0;
                while (true) {
                    AbstractC6519f[] abstractC6519fArr5 = c6510m.f50430Y;
                    if (i27 >= abstractC6519fArr5.length) {
                        break;
                    }
                    AbstractC6519f abstractC6519f5 = abstractC6519fArr5[i27];
                    if (r(abstractC6519f5)) {
                        abstractC6519f5.v(c6510m.f50425Q0, C10);
                        if (i11 != 0 && abstractC6519f5.k()) {
                            i11 = i10;
                        } else {
                            i11 = 0;
                        }
                        if (s26.f50459c[i27] != abstractC6519f5.f50571n0) {
                            i16 = i10;
                        } else {
                            i16 = 0;
                        }
                        if (i16 == 0 && abstractC6519f5.j()) {
                            i17 = i10;
                        } else {
                            i17 = 0;
                        }
                        if (i16 == 0 && i17 == 0 && !abstractC6519f5.l() && !abstractC6519f5.k()) {
                            i18 = 0;
                        } else {
                            i18 = i10;
                        }
                        if (i12 != 0 && i18 != 0) {
                            i12 = i10;
                        } else {
                            i12 = 0;
                        }
                        if (i18 == 0) {
                            E2.Y y14 = abstractC6519f5.f50571n0;
                            y14.getClass();
                            y14.m();
                        }
                    }
                    i27++;
                }
            } else {
                s26.f50457a.e();
                i12 = i10;
                i11 = i12;
            }
            long j20 = s26.f50462f.f50476e;
            if (i11 != 0 && s26.f50460d) {
                j6 = -9223372036854775807L;
                if (j20 == -9223372036854775807L || j20 <= c6510m.f50410B0.f50553r) {
                    i13 = i10;
                    if (i13 != 0 && c6510m.f50414F0) {
                        c6510m.f50414F0 = false;
                        c6510m.R(c6510m.f50410B0.f50548m, 5, false, false);
                    }
                    if (i13 == 0 && s26.f50462f.f50480i) {
                        c6510m.W(4);
                        b0();
                        s10 = s26;
                    } else {
                        d0Var2 = c6510m.f50410B0;
                        if (d0Var2.f50540e == 2) {
                            if (c6510m.f50423O0 != 0) {
                                if (i12 != 0) {
                                    if (d0Var2.f50542g) {
                                        U u17 = c6510m.f50447w0;
                                        S s27 = u17.f50488h;
                                        if (c6510m.Y(d0Var2.f50536a, s27.f50462f.f50472a)) {
                                            s10 = s26;
                                            j10 = c6510m.f50449y0.f50626i;
                                        } else {
                                            s10 = s26;
                                            j10 = j6;
                                        }
                                        S s28 = u17.f50490j;
                                        if (s28.f() && s28.f50462f.f50480i) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (s28.f50462f.f50472a.b() && !s28.f50460d) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (!z12 && !z13) {
                                            d0 d0Var4 = c6510m.f50410B0;
                                            p2.g0 g0Var2 = d0Var4.f50536a;
                                            C0492y c0492y4 = s27.f50462f.f50472a;
                                            long j21 = d0Var4.f50551p;
                                            S s29 = c6510m.f50447w0.f50490j;
                                            i15 = i12;
                                            if (s29 == null) {
                                                j11 = 0;
                                            } else {
                                                j11 = Math.max(0L, j21 - (c6510m.f50425Q0 - s29.f50471o));
                                            }
                                            float f6 = c6510m.f50443s0.c().f41934Y;
                                            boolean z21 = c6510m.f50415G0;
                                            C6523j c6523j = (C6523j) c6510m.f50435k0;
                                            c6523j.getClass();
                                            if (f6 != 1.0f) {
                                                j11 = Math.round(j11 / f6);
                                            }
                                            if (z21) {
                                                j12 = c6523j.f50637e;
                                            } else {
                                                j12 = c6523j.f50636d;
                                            }
                                            if (j10 != j6) {
                                                j12 = Math.min(j10 / 2, j12);
                                            }
                                            if (j12 > 0 && j11 < j12) {
                                                I2.d dVar2 = c6523j.f50633a;
                                                synchronized (dVar2) {
                                                    int i28 = dVar2.f7965d * dVar2.f7963b;
                                                }
                                            }
                                        }
                                        c6510m.W(3);
                                        c6510m.f50428T0 = null;
                                        if (X()) {
                                            Z();
                                        }
                                    }
                                    s10 = s26;
                                    c6510m.W(3);
                                    c6510m.f50428T0 = null;
                                    if (X()) {
                                    }
                                }
                            }
                        }
                        s10 = s26;
                        i15 = i12;
                        if (c6510m.f50410B0.f50540e == 3 && (c6510m.f50423O0 != 0 ? i15 == 0 : !s())) {
                            c6510m.h0(X(), false);
                            c6510m.W(2);
                            if (c6510m.f50415G0) {
                                for (S s30 = c6510m.f50447w0.f50488h; s30 != null; s30 = s30.f50468l) {
                                    for (H2.s sVar2 : s30.f50470n.f7339c) {
                                        if (sVar2 != null) {
                                            sVar2.j();
                                        }
                                    }
                                }
                                C6522i c6522i = c6510m.f50449y0;
                                long j22 = c6522i.f50626i;
                                if (j22 != j6) {
                                    long j23 = j22 + c6522i.f50619b;
                                    c6522i.f50626i = j23;
                                    long j24 = c6522i.f50625h;
                                    if (j24 != j6 && j23 > j24) {
                                        c6522i.f50626i = j24;
                                    }
                                    c6522i.f50630m = j6;
                                }
                            }
                            b0();
                        }
                    }
                    if (c6510m.f50410B0.f50540e == 2) {
                        int i29 = 0;
                        while (true) {
                            AbstractC6519f[] abstractC6519fArr6 = c6510m.f50430Y;
                            if (i29 >= abstractC6519fArr6.length) {
                                break;
                            }
                            if (r(abstractC6519fArr6[i29]) && (y10 = c6510m.f50430Y[i29].f50571n0) == s10.f50459c[i29]) {
                                y10.getClass();
                                y10.m();
                            }
                            i29++;
                        }
                        d0 d0Var5 = c6510m.f50410B0;
                        if (!d0Var5.f50542g && d0Var5.f50552q < 500000 && q()) {
                            if (c6510m.f50429U0 == j6) {
                                ((s2.w) c6510m.f50445u0).getClass();
                                c6510m.f50429U0 = SystemClock.elapsedRealtime();
                            } else {
                                ((s2.w) c6510m.f50445u0).getClass();
                                if (SystemClock.elapsedRealtime() - c6510m.f50429U0 >= 4000) {
                                    throw new IllegalStateException("Playback stuck buffering and not loading");
                                }
                            }
                            if (!X() && c6510m.f50410B0.f50540e == 3) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!c6510m.f50422N0 && c6510m.f50421M0 && z10) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            d0Var = c6510m.f50410B0;
                            if (d0Var.f50550o != z11) {
                                c6510m.f50410B0 = new d0(d0Var.f50536a, d0Var.f50537b, d0Var.f50538c, d0Var.f50539d, d0Var.f50540e, d0Var.f50541f, d0Var.f50542g, d0Var.f50543h, d0Var.f50544i, d0Var.f50545j, d0Var.f50546k, d0Var.f50547l, d0Var.f50548m, d0Var.f50549n, d0Var.f50551p, d0Var.f50552q, d0Var.f50553r, d0Var.f50554s, z11);
                            }
                            c6510m.f50421M0 = false;
                            if (!z11 && (i14 = c6510m.f50410B0.f50540e) != 4) {
                                if (z10 && i14 != 2) {
                                    if (i14 == 3 && c6510m.f50423O0 != 0) {
                                        c6510m.f50437m0.f45201a.sendEmptyMessageAtTime(2, uptimeMillis + 1000);
                                    }
                                } else {
                                    c6510m.f50437m0.f45201a.sendEmptyMessageAtTime(2, uptimeMillis + 10);
                                }
                            }
                            AbstractC5260f.q();
                        }
                    }
                    c6510m.f50429U0 = j6;
                    if (!X()) {
                    }
                    z10 = false;
                    if (!c6510m.f50422N0) {
                    }
                    z11 = false;
                    d0Var = c6510m.f50410B0;
                    if (d0Var.f50550o != z11) {
                    }
                    c6510m.f50421M0 = false;
                    if (!z11) {
                        if (z10) {
                        }
                        c6510m.f50437m0.f45201a.sendEmptyMessageAtTime(2, uptimeMillis + 10);
                    }
                    AbstractC5260f.q();
                }
            } else {
                j6 = -9223372036854775807L;
            }
            i13 = 0;
            if (i13 != 0) {
                c6510m.f50414F0 = false;
                c6510m.R(c6510m.f50410B0.f50548m, 5, false, false);
            }
            if (i13 == 0) {
            }
            d0Var2 = c6510m.f50410B0;
            if (d0Var2.f50540e == 2) {
            }
            s10 = s26;
            i15 = i12;
            if (c6510m.f50410B0.f50540e == 3) {
                c6510m.h0(X(), false);
                c6510m.W(2);
                if (c6510m.f50415G0) {
                }
                b0();
            }
            if (c6510m.f50410B0.f50540e == 2) {
            }
            c6510m.f50429U0 = j6;
            if (!X()) {
            }
            z10 = false;
            if (!c6510m.f50422N0) {
            }
            z11 = false;
            d0Var = c6510m.f50410B0;
            if (d0Var.f50550o != z11) {
            }
            c6510m.f50421M0 = false;
            if (!z11) {
            }
            AbstractC5260f.q();
        }
    }

    public final void f0() {
        long j6;
        long j10;
        long j11;
        long j12;
        float f6;
        long max;
        boolean z10;
        S s10 = this.f50447w0.f50488h;
        if (s10 == null) {
            return;
        }
        if (s10.f50460d) {
            j6 = s10.f50457a.r();
        } else {
            j6 = -9223372036854775807L;
        }
        if (j6 != -9223372036854775807L) {
            if (!s10.f()) {
                this.f50447w0.l(s10);
                l(false);
                t();
            }
            F(j6);
            if (j6 != this.f50410B0.f50553r) {
                d0 d0Var = this.f50410B0;
                this.f50410B0 = p(d0Var.f50537b, j6, d0Var.f50538c, j6, true, 5);
            }
        } else {
            C6525l c6525l = this.f50443s0;
            if (s10 != this.f50447w0.f50489i) {
                z10 = true;
            } else {
                z10 = false;
            }
            AbstractC6519f abstractC6519f = c6525l.f50647h0;
            m0 m0Var = c6525l.f50645Y;
            if (abstractC6519f != null && !abstractC6519f.k() && (c6525l.f50647h0.l() || (!z10 && !c6525l.f50647h0.j()))) {
                Q q10 = c6525l.f50648i0;
                q10.getClass();
                long a5 = q10.a();
                if (c6525l.f50649j0) {
                    if (a5 < m0Var.a()) {
                        if (m0Var.f50657Z) {
                            m0Var.b(m0Var.a());
                            m0Var.f50657Z = false;
                        }
                    } else {
                        c6525l.f50649j0 = false;
                        if (c6525l.f50650k0) {
                            m0Var.e();
                        }
                    }
                }
                m0Var.b(a5);
                p2.S c10 = q10.c();
                if (!c10.equals(m0Var.f50660j0)) {
                    m0Var.d(c10);
                    ((C6510M) c6525l.f50646Z).f50437m0.a(16, c10).b();
                }
            } else {
                c6525l.f50649j0 = true;
                if (c6525l.f50650k0) {
                    m0Var.e();
                }
            }
            long a10 = c6525l.a();
            this.f50425Q0 = a10;
            long j13 = a10 - s10.f50471o;
            long j14 = this.f50410B0.f50553r;
            if (!this.f50444t0.isEmpty() && !this.f50410B0.f50537b.b()) {
                if (this.f50427S0) {
                    this.f50427S0 = false;
                }
                d0 d0Var2 = this.f50410B0;
                d0Var2.f50536a.c(d0Var2.f50537b.f4420a);
                int min = Math.min(this.f50426R0, this.f50444t0.size());
                if (min > 0) {
                    AbstractC2469q0.p(this.f50444t0.get(min - 1));
                }
                if (min < this.f50444t0.size()) {
                    AbstractC2469q0.p(this.f50444t0.get(min));
                }
                this.f50426R0 = min;
            }
            d0 d0Var3 = this.f50410B0;
            d0Var3.f50553r = j13;
            d0Var3.f50554s = SystemClock.elapsedRealtime();
        }
        this.f50410B0.f50551p = this.f50447w0.f50490j.d();
        d0 d0Var4 = this.f50410B0;
        long j15 = d0Var4.f50551p;
        S s11 = this.f50447w0.f50490j;
        if (s11 == null) {
            j10 = 0;
        } else {
            j10 = Math.max(0L, j15 - (this.f50425Q0 - s11.f50471o));
        }
        d0Var4.f50552q = j10;
        d0 d0Var5 = this.f50410B0;
        if (d0Var5.f50547l && d0Var5.f50540e == 3 && Y(d0Var5.f50536a, d0Var5.f50537b)) {
            d0 d0Var6 = this.f50410B0;
            float f10 = 1.0f;
            if (d0Var6.f50549n.f41934Y == 1.0f) {
                C6522i c6522i = this.f50449y0;
                long h10 = h(d0Var6.f50536a, d0Var6.f50537b.f4420a, d0Var6.f50553r);
                long j16 = this.f50410B0.f50551p;
                S s12 = this.f50447w0.f50490j;
                if (s12 == null) {
                    j11 = 0;
                } else {
                    j11 = Math.max(0L, j16 - (this.f50425Q0 - s12.f50471o));
                }
                if (c6522i.f50621d != -9223372036854775807L) {
                    long j17 = h10 - j11;
                    if (c6522i.f50631n == -9223372036854775807L) {
                        c6522i.f50631n = j17;
                        c6522i.f50632o = 0L;
                    } else {
                        float f11 = 1.0f - c6522i.f50620c;
                        c6522i.f50631n = Math.max(j17, (((float) j17) * f11) + (((float) j12) * f6));
                        c6522i.f50632o = (f11 * ((float) Math.abs(j17 - max))) + (f6 * ((float) c6522i.f50632o));
                    }
                    if (c6522i.f50630m != -9223372036854775807L && SystemClock.elapsedRealtime() - c6522i.f50630m < 1000) {
                        f10 = c6522i.f50629l;
                    } else {
                        c6522i.f50630m = SystemClock.elapsedRealtime();
                        long j18 = (c6522i.f50632o * 3) + c6522i.f50631n;
                        if (c6522i.f50626i > j18) {
                            float C10 = (float) AbstractC5530A.C(1000L);
                            long[] jArr = {j18, c6522i.f50623f, c6522i.f50626i - (((c6522i.f50629l - 1.0f) * C10) + ((c6522i.f50627j - 1.0f) * C10))};
                            long j19 = jArr[0];
                            for (int i10 = 1; i10 < 3; i10++) {
                                long j20 = jArr[i10];
                                if (j20 > j19) {
                                    j19 = j20;
                                }
                            }
                            c6522i.f50626i = j19;
                        } else {
                            long j21 = AbstractC5530A.j(h10 - (Math.max(0.0f, c6522i.f50629l - 1.0f) / 1.0E-7f), c6522i.f50626i, j18);
                            c6522i.f50626i = j21;
                            long j22 = c6522i.f50625h;
                            if (j22 != -9223372036854775807L && j21 > j22) {
                                c6522i.f50626i = j22;
                            }
                        }
                        long j23 = h10 - c6522i.f50626i;
                        if (Math.abs(j23) < c6522i.f50618a) {
                            c6522i.f50629l = 1.0f;
                        } else {
                            c6522i.f50629l = AbstractC5530A.h((1.0E-7f * ((float) j23)) + 1.0f, c6522i.f50628k, c6522i.f50627j);
                        }
                        f10 = c6522i.f50629l;
                    }
                }
                if (this.f50443s0.c().f41934Y != f10) {
                    p2.S s13 = new p2.S(f10, this.f50410B0.f50549n.f41935Z);
                    this.f50437m0.f45201a.removeMessages(16);
                    this.f50443s0.d(s13);
                    o(this.f50410B0.f50549n, this.f50443s0.c().f41934Y, false, false);
                }
            }
        }
    }

    public final void g(boolean[] zArr, long j6) {
        AbstractC6519f[] abstractC6519fArr;
        Set set;
        int i10;
        S s10;
        H2.w wVar;
        U u10;
        Set set2;
        boolean z10;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Q q10;
        U u11 = this.f50447w0;
        S s11 = u11.f50489i;
        H2.w wVar2 = s11.f50470n;
        int i12 = 0;
        while (true) {
            abstractC6519fArr = this.f50430Y;
            int length = abstractC6519fArr.length;
            set = this.f50431Z;
            if (i12 >= length) {
                break;
            }
            if (!wVar2.b(i12) && set.remove(abstractC6519fArr[i12])) {
                abstractC6519fArr[i12].x();
            }
            i12++;
        }
        int i13 = 0;
        while (i13 < abstractC6519fArr.length) {
            if (wVar2.b(i13)) {
                boolean z15 = zArr[i13];
                AbstractC6519f abstractC6519f = abstractC6519fArr[i13];
                if (!r(abstractC6519f)) {
                    S s12 = u11.f50489i;
                    if (s12 == u11.f50488h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    H2.w wVar3 = s12.f50470n;
                    j0 j0Var = wVar3.f7338b[i13];
                    H2.s sVar = wVar3.f7339c[i13];
                    if (sVar != null) {
                        u10 = u11;
                        i11 = sVar.length();
                    } else {
                        u10 = u11;
                        i11 = 0;
                    }
                    C5065s[] c5065sArr = new C5065s[i11];
                    wVar = wVar2;
                    for (int i14 = 0; i14 < i11; i14++) {
                        c5065sArr[i14] = sVar.c(i14);
                    }
                    if (X() && this.f50410B0.f50540e == 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z15 && z11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f50423O0++;
                    set.add(abstractC6519f);
                    E2.Y y10 = s12.f50459c[i13];
                    s10 = s11;
                    boolean z16 = z11;
                    long j10 = s12.f50471o;
                    C0492y c0492y = s12.f50462f.f50472a;
                    if (abstractC6519f.f50570m0 == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    Gi.e.n(z13);
                    abstractC6519f.f50566i0 = j0Var;
                    abstractC6519f.f50570m0 = 1;
                    abstractC6519f.n(z12, z10);
                    i10 = i13;
                    set2 = set;
                    abstractC6519f.w(c5065sArr, y10, j6, j10, c0492y);
                    abstractC6519f.f50576s0 = false;
                    abstractC6519f.f50574q0 = j6;
                    abstractC6519f.f50575r0 = j6;
                    abstractC6519f.o(j6, z12);
                    abstractC6519f.b(11, new C6505H(this));
                    C6525l c6525l = this.f50443s0;
                    c6525l.getClass();
                    Q h10 = abstractC6519f.h();
                    if (h10 != null && h10 != (q10 = c6525l.f50648i0)) {
                        if (q10 == null) {
                            c6525l.f50648i0 = h10;
                            c6525l.f50647h0 = abstractC6519f;
                            ((A2.V) h10).d(c6525l.f50645Y.f50660j0);
                        } else {
                            throw new C6527n(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z16) {
                        if (abstractC6519f.f50570m0 == 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        Gi.e.n(z14);
                        abstractC6519f.f50570m0 = 2;
                        abstractC6519f.r();
                    }
                    i13 = i10 + 1;
                    set = set2;
                    u11 = u10;
                    wVar2 = wVar;
                    s11 = s10;
                }
            }
            i10 = i13;
            u10 = u11;
            s10 = s11;
            wVar = wVar2;
            set2 = set;
            i13 = i10 + 1;
            set = set2;
            u11 = u10;
            wVar2 = wVar;
            s11 = s10;
        }
        s11.f50463g = true;
    }

    public final void g0(p2.g0 g0Var, C0492y c0492y, p2.g0 g0Var2, C0492y c0492y2, long j6, boolean z10) {
        Object obj;
        p2.S s10;
        if (!Y(g0Var, c0492y)) {
            if (c0492y.b()) {
                s10 = p2.S.f41931i0;
            } else {
                s10 = this.f50410B0.f50549n;
            }
            C6525l c6525l = this.f50443s0;
            if (!c6525l.c().equals(s10)) {
                this.f50437m0.f45201a.removeMessages(16);
                c6525l.d(s10);
                o(this.f50410B0.f50549n, s10.f41934Y, false, false);
                return;
            }
            return;
        }
        Object obj2 = c0492y.f4420a;
        p2.e0 e0Var = this.f50441q0;
        int i10 = g0Var.i(obj2, e0Var).f42024h0;
        p2.f0 f0Var = this.f50440p0;
        g0Var.p(i10, f0Var);
        C5047B c5047b = f0Var.f42055p0;
        int i11 = AbstractC5530A.f45131a;
        C6522i c6522i = this.f50449y0;
        c6522i.getClass();
        c6522i.f50621d = AbstractC5530A.C(c5047b.f41746Y);
        c6522i.f50624g = AbstractC5530A.C(c5047b.f41747Z);
        c6522i.f50625h = AbstractC5530A.C(c5047b.f41748h0);
        float f6 = c5047b.f41749i0;
        if (f6 == -3.4028235E38f) {
            f6 = 0.97f;
        }
        c6522i.f50628k = f6;
        float f10 = c5047b.f41750j0;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        c6522i.f50627j = f10;
        if (f6 == 1.0f && f10 == 1.0f) {
            c6522i.f50621d = -9223372036854775807L;
        }
        c6522i.a();
        if (j6 != -9223372036854775807L) {
            c6522i.f50622e = h(g0Var, obj2, j6);
            c6522i.a();
            return;
        }
        Object obj3 = f0Var.f42045Y;
        if (!g0Var2.r()) {
            obj = g0Var2.o(g0Var2.i(c0492y2.f4420a, e0Var).f42024h0, f0Var, 0L).f42045Y;
        } else {
            obj = null;
        }
        if (!AbstractC5530A.a(obj, obj3) || z10) {
            c6522i.f50622e = -9223372036854775807L;
            c6522i.a();
        }
    }

    public final long h(p2.g0 g0Var, Object obj, long j6) {
        long j10;
        p2.e0 e0Var = this.f50441q0;
        int i10 = g0Var.i(obj, e0Var).f42024h0;
        p2.f0 f0Var = this.f50440p0;
        g0Var.p(i10, f0Var);
        if (f0Var.f42050k0 == -9223372036854775807L || !f0Var.b() || !f0Var.f42053n0) {
            return -9223372036854775807L;
        }
        long j11 = f0Var.f42051l0;
        int i11 = AbstractC5530A.f45131a;
        if (j11 == -9223372036854775807L) {
            j10 = System.currentTimeMillis();
        } else {
            j10 = j11 + SystemClock.elapsedRealtime();
        }
        return AbstractC5530A.C(j10 - f0Var.f42050k0) - (j6 + e0Var.f42026j0);
    }

    public final void h0(boolean z10, boolean z11) {
        long j6;
        this.f50415G0 = z10;
        if (z11) {
            j6 = -9223372036854775807L;
        } else {
            ((s2.w) this.f50445u0).getClass();
            j6 = SystemClock.elapsedRealtime();
        }
        this.f50416H0 = j6;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        S s10;
        S s11;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        s2.y yVar = this.f50437m0;
        int i11 = 1000;
        try {
            switch (message.what) {
                case 0:
                    x();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    R(message.arg2, 1, z10, true);
                    break;
                case 2:
                    f();
                    break;
                case 3:
                    K((C6509L) message.obj);
                    break;
                case 4:
                    S((p2.S) message.obj);
                    break;
                case 5:
                    this.f50409A0 = (l0) message.obj;
                    break;
                case 6:
                    a0(false, true);
                    break;
                case 7:
                    z();
                    return true;
                case 8:
                    n((AbstractC0490w) message.obj);
                    break;
                case 9:
                    j((AbstractC0490w) message.obj);
                    break;
                case 10:
                    C();
                    break;
                case 11:
                    T(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    U(z11);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    O(z12, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    f0 f0Var = (f0) message.obj;
                    f0Var.getClass();
                    if (f0Var.f50585f == this.f50439o0) {
                        d(f0Var);
                        int i12 = this.f50410B0.f50540e;
                        if (i12 == 3 || i12 == 2) {
                            yVar.d(2);
                            break;
                        }
                    } else {
                        yVar.a(15, f0Var).b();
                        break;
                    }
                case 15:
                    M((f0) message.obj);
                    break;
                case 16:
                    p2.S s12 = (p2.S) message.obj;
                    o(s12, s12.f41934Y, true, false);
                    break;
                case 17:
                    P((C6506I) message.obj);
                    break;
                case 18:
                    c((C6506I) message.obj, message.arg1);
                    break;
                case 19:
                    AbstractC2469q0.p(message.obj);
                    w();
                    throw null;
                case 20:
                    B(message.arg1, message.arg2, (E2.a0) message.obj);
                    break;
                case 21:
                    V((E2.a0) message.obj);
                    break;
                case 22:
                    v();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    Q(z13);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    C();
                    J(true);
                    break;
                case 26:
                    C();
                    J(true);
                    break;
                case 27:
                    e0((List) message.obj, message.arg1, message.arg2);
                    break;
            }
        } catch (B2.j e10) {
            k(e10, e10.f1807Y);
        } catch (RuntimeException e11) {
            if ((e11 instanceof IllegalStateException) || (e11 instanceof IllegalArgumentException)) {
                i11 = 1004;
            }
            C6527n c6527n = new C6527n(2, e11, i11);
            s2.p.d("ExoPlayerImplInternal", "Playback error", c6527n);
            a0(true, false);
            this.f50410B0 = this.f50410B0.e(c6527n);
        } catch (p2.O e12) {
            boolean z14 = e12.f41919Y;
            int i13 = e12.f41920Z;
            if (i13 == 1) {
                if (z14) {
                    i10 = 3001;
                } else {
                    i10 = 3003;
                }
            } else {
                if (i13 == 4) {
                    if (z14) {
                        i10 = 3002;
                    } else {
                        i10 = 3004;
                    }
                }
                k(e12, i11);
            }
            i11 = i10;
            k(e12, i11);
        } catch (v2.i e13) {
            k(e13, e13.f47078Y);
        } catch (IOException e14) {
            k(e14, 2000);
        } catch (C6527n e15) {
            e = e15;
            int i14 = e.f50667m0;
            U u10 = this.f50447w0;
            if (i14 == 1 && (s11 = u10.f50489i) != null) {
                e = e.b(s11.f50462f.f50472a);
            }
            if (e.f50673s0 && (this.f50428T0 == null || e.f41929Y == 5003)) {
                s2.p.h("ExoPlayerImplInternal", "Recoverable renderer error", e);
                C6527n c6527n2 = this.f50428T0;
                if (c6527n2 != null) {
                    c6527n2.addSuppressed(e);
                    e = this.f50428T0;
                } else {
                    this.f50428T0 = e;
                }
                s2.x a5 = yVar.a(25, e);
                yVar.getClass();
                Message message2 = a5.f45199a;
                message2.getClass();
                yVar.f45201a.sendMessageAtFrontOfQueue(message2);
                a5.a();
            } else {
                C6527n c6527n3 = this.f50428T0;
                if (c6527n3 != null) {
                    c6527n3.addSuppressed(e);
                    e = this.f50428T0;
                }
                s2.p.d("ExoPlayerImplInternal", "Playback error", e);
                if (e.f50667m0 == 1 && u10.f50488h != u10.f50489i) {
                    while (true) {
                        s10 = u10.f50488h;
                        if (s10 == u10.f50489i) {
                            break;
                        }
                        u10.a();
                    }
                    s10.getClass();
                    T t10 = s10.f50462f;
                    C0492y c0492y = t10.f50472a;
                    long j6 = t10.f50473b;
                    this.f50410B0 = p(c0492y, j6, t10.f50474c, j6, true, 0);
                }
                a0(true, false);
                this.f50410B0 = this.f50410B0.e(e);
            }
        }
        u();
        return true;
    }

    public final Pair i(p2.g0 g0Var) {
        long j6 = 0;
        if (g0Var.r()) {
            return Pair.create(d0.f50535t, 0L);
        }
        int b10 = g0Var.b(this.f50419K0);
        Pair k10 = g0Var.k(this.f50440p0, this.f50441q0, b10, -9223372036854775807L);
        C0492y n10 = this.f50447w0.n(g0Var, k10.first, 0L);
        long longValue = ((Long) k10.second).longValue();
        if (n10.b()) {
            Object obj = n10.f4420a;
            p2.e0 e0Var = this.f50441q0;
            g0Var.i(obj, e0Var);
            if (n10.f4422c == e0Var.g(n10.f4421b)) {
                j6 = e0Var.f42028l0.f41990h0;
            }
            longValue = j6;
        }
        return Pair.create(n10, Long.valueOf(longValue));
    }

    public final synchronized void i0(C6530q c6530q, long j6) {
        ((s2.w) this.f50445u0).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j6;
        boolean z10 = false;
        while (!((Boolean) c6530q.get()).booleanValue() && j6 > 0) {
            try {
                this.f50445u0.getClass();
                wait(j6);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            ((s2.w) this.f50445u0).getClass();
            j6 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final void j(AbstractC0490w abstractC0490w) {
        boolean z10;
        S s10 = this.f50447w0.f50490j;
        if (s10 != null && s10.f50457a == abstractC0490w) {
            long j6 = this.f50425Q0;
            if (s10 != null) {
                if (s10.f50468l == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Gi.e.n(z10);
                if (s10.f50460d) {
                    s10.f50457a.C(j6 - s10.f50471o);
                }
            }
            t();
        }
    }

    public final void k(IOException iOException, int i10) {
        C6527n c6527n = new C6527n(0, iOException, i10);
        S s10 = this.f50447w0.f50488h;
        if (s10 != null) {
            c6527n = c6527n.b(s10.f50462f.f50472a);
        }
        s2.p.d("ExoPlayerImplInternal", "Playback error", c6527n);
        a0(false, false);
        this.f50410B0 = this.f50410B0.e(c6527n);
    }

    public final void l(boolean z10) {
        C0492y c0492y;
        long j6;
        S s10 = this.f50447w0.f50490j;
        if (s10 == null) {
            c0492y = this.f50410B0.f50537b;
        } else {
            c0492y = s10.f50462f.f50472a;
        }
        boolean z11 = !this.f50410B0.f50546k.equals(c0492y);
        if (z11) {
            this.f50410B0 = this.f50410B0.b(c0492y);
        }
        d0 d0Var = this.f50410B0;
        if (s10 == null) {
            j6 = d0Var.f50553r;
        } else {
            j6 = s10.d();
        }
        d0Var.f50551p = j6;
        d0 d0Var2 = this.f50410B0;
        long j10 = d0Var2.f50551p;
        S s11 = this.f50447w0.f50490j;
        long j11 = 0;
        if (s11 != null) {
            j11 = Math.max(0L, j10 - (this.f50425Q0 - s11.f50471o));
        }
        d0Var2.f50552q = j11;
        if ((z11 || z10) && s10 != null && s10.f50460d) {
            C0492y c0492y2 = s10.f50462f.f50472a;
            d0(s10.f50470n);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ee, code lost:
        if (r5.f(r6, r9) != 2) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01f0, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01fe, code lost:
        if (r5.j(r3.f4421b) != false) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0420 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0468  */
    /* JADX WARN: Type inference failed for: r13v1, types: [long] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v1, types: [y2.L] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(p2.g0 g0Var, boolean z10) {
        long j6;
        long j10;
        int i10;
        int i11;
        C6508K c6508k;
        boolean z11;
        ?? r14;
        boolean z12;
        int i12;
        Throwable th2;
        long j11;
        Object obj;
        int i13;
        boolean z13;
        p2.e0 e0Var;
        boolean z14;
        long j12;
        boolean z15;
        C6509L c6509l;
        long j13;
        int i14;
        boolean z16;
        boolean z17;
        long j14;
        boolean z18;
        boolean z19;
        boolean z20;
        C0492y c0492y;
        int i15;
        long j15;
        long j16;
        boolean z21;
        boolean z22;
        long j17;
        long j18;
        int i16;
        boolean z23;
        int i17;
        boolean z24;
        boolean z25;
        boolean z26;
        int i18;
        boolean z27;
        boolean z28;
        d0 d0Var = this.f50410B0;
        C6509L c6509l2 = this.f50424P0;
        U u10 = this.f50447w0;
        int i19 = this.f50418J0;
        boolean z29 = this.f50419K0;
        p2.f0 f0Var = this.f50440p0;
        p2.e0 e0Var2 = this.f50441q0;
        if (g0Var.r()) {
            j10 = -9223372036854775807L;
            c6508k = new C6508K(d0.f50535t, 0L, -9223372036854775807L, false, true, false);
            j6 = 0;
            i11 = -1;
            i10 = 4;
        } else {
            C0492y c0492y2 = d0Var.f50537b;
            Object obj2 = c0492y2.f4420a;
            p2.g0 g0Var2 = d0Var.f50536a;
            if (!g0Var2.r() && !g0Var2.i(c0492y2.f4420a, e0Var2).f42027k0) {
                z17 = false;
            } else {
                z17 = true;
            }
            if (!d0Var.f50537b.b() && !z17) {
                j14 = d0Var.f50553r;
            } else {
                j14 = d0Var.f50538c;
            }
            j10 = j14;
            if (c6509l2 != null) {
                i10 = 4;
                Pair H6 = H(g0Var, c6509l2, true, i19, z29, f0Var, e0Var2);
                if (H6 == null) {
                    i18 = g0Var.b(z29);
                    j15 = j10;
                    z26 = false;
                    z25 = false;
                    z24 = true;
                } else {
                    if (c6509l2.f50408c == -9223372036854775807L) {
                        i18 = g0Var.i(H6.first, e0Var2).f42024h0;
                        j15 = j10;
                        z27 = false;
                    } else {
                        obj2 = H6.first;
                        j15 = ((Long) H6.second).longValue();
                        i18 = -1;
                        z27 = true;
                    }
                    if (d0Var.f50540e == 4) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z25 = z28;
                    z26 = z27;
                    z24 = false;
                }
                z18 = z26;
                z20 = z25;
                z19 = z24;
                c0492y = c0492y2;
                i11 = -1;
                j6 = 0;
                i15 = i18;
            } else {
                i10 = 4;
                if (d0Var.f50536a.r()) {
                    i15 = g0Var.b(z29);
                    j15 = j10;
                    c0492y = c0492y2;
                    i11 = -1;
                } else {
                    i11 = -1;
                    if (g0Var.c(obj2) == -1) {
                        Object I10 = I(f0Var, e0Var2, i19, z29, obj2, d0Var.f50536a, g0Var);
                        if (I10 == null) {
                            i17 = g0Var.b(z29);
                            z23 = true;
                        } else {
                            i17 = g0Var.i(I10, e0Var2).f42024h0;
                            z23 = false;
                        }
                        i15 = i17;
                        z19 = z23;
                        j15 = j10;
                        c0492y = c0492y2;
                        j6 = 0;
                        z20 = false;
                        z18 = false;
                    } else if (j10 == -9223372036854775807L) {
                        i15 = g0Var.i(obj2, e0Var2).f42024h0;
                        j15 = j10;
                        c0492y = c0492y2;
                    } else if (z17) {
                        c0492y = c0492y2;
                        d0Var.f50536a.i(c0492y.f4420a, e0Var2);
                        if (d0Var.f50536a.o(e0Var2.f42024h0, f0Var, 0L).f42059t0 == d0Var.f50536a.c(c0492y.f4420a)) {
                            j6 = 0;
                            Pair k10 = g0Var.k(f0Var, e0Var2, g0Var.i(obj2, e0Var2).f42024h0, j10 + e0Var2.f42026j0);
                            obj2 = k10.first;
                            j15 = ((Long) k10.second).longValue();
                        } else {
                            j6 = 0;
                            j15 = j10;
                        }
                        i15 = -1;
                        z20 = false;
                        z19 = false;
                        z18 = true;
                    } else {
                        c0492y = c0492y2;
                        j6 = 0;
                        i15 = -1;
                        j15 = j10;
                        z20 = false;
                        z19 = false;
                        z18 = false;
                    }
                }
                j6 = 0;
                z20 = false;
                z19 = false;
                z18 = false;
            }
            if (i15 != i11) {
                Pair k11 = g0Var.k(f0Var, e0Var2, i15, -9223372036854775807L);
                obj2 = k11.first;
                j15 = ((Long) k11.second).longValue();
                j16 = -9223372036854775807L;
            } else {
                j16 = j15;
            }
            C0492y n10 = u10.n(g0Var, obj2, j15);
            int i20 = n10.f4424e;
            if (i20 != i11 && ((i16 = c0492y.f4424e) == i11 || i20 < i16)) {
                z21 = false;
            } else {
                z21 = true;
            }
            if (c0492y.f4420a.equals(obj2) && !c0492y.b() && !n10.b() && z21) {
                z22 = true;
            } else {
                z22 = false;
            }
            p2.e0 i21 = g0Var.i(obj2, e0Var2);
            if (!z17 && j10 == j16 && c0492y.f4420a.equals(n10.f4420a)) {
                if (c0492y.b()) {
                    int i22 = c0492y.f4421b;
                    if (i21.j(i22)) {
                        int i23 = c0492y.f4422c;
                        if (i21.f(i22, i23) != i10) {
                        }
                    }
                }
                if (n10.b()) {
                }
            }
            boolean z30 = false;
            if (z22 || z30) {
                n10 = c0492y;
            }
            if (n10.b()) {
                if (n10.equals(c0492y)) {
                    j17 = d0Var.f50553r;
                } else {
                    g0Var.i(n10.f4420a, e0Var2);
                    if (n10.f4422c == e0Var2.g(n10.f4421b)) {
                        j18 = e0Var2.f42028l0.f41990h0;
                    } else {
                        j18 = j6;
                    }
                    j17 = j18;
                }
            } else {
                j17 = j15;
            }
            c6508k = new C6508K(n10, j17, j16, z20, z19, z18);
        }
        C0492y c0492y3 = c6508k.f50400a;
        ?? r13 = c6508k.f50402c;
        boolean z31 = c6508k.f50403d;
        long j19 = c6508k.f50401b;
        int i24 = i10;
        C6510M c6510m = this;
        if (c6510m.f50410B0.f50537b.equals(c0492y3) && j19 == c6510m.f50410B0.f50553r) {
            z11 = false;
        } else {
            z11 = true;
        }
        try {
            if (c6508k.f50404e) {
                try {
                    z13 = true;
                    if (c6510m.f50410B0.f50540e != 1) {
                        try {
                            c6510m.W(i24);
                        } catch (Throwable th3) {
                            th2 = th3;
                            j10 = j19;
                            i12 = i11;
                            j6 = r13;
                            r14 = 0;
                            z12 = z13;
                            d0 d0Var2 = c6510m.f50410B0;
                            p2.g0 g0Var3 = d0Var2.f50536a;
                            C0492y c0492y4 = d0Var2.f50537b;
                            if (!c6508k.f50405f) {
                                j11 = j10;
                            } else {
                                j11 = -9223372036854775807L;
                            }
                            g0(g0Var, c0492y3, g0Var3, c0492y4, j11, false);
                            if (!z11 || j6 != c6510m.f50410B0.f50538c) {
                                d0 d0Var3 = c6510m.f50410B0;
                                obj = d0Var3.f50537b.f4420a;
                                p2.g0 g0Var4 = d0Var3.f50536a;
                                if (z11 || !z10 || g0Var4.r() || g0Var4.i(obj, c6510m.f50441q0).f42027k0) {
                                    z12 = false;
                                }
                                long j20 = c6510m.f50410B0.f50539d;
                                if (g0Var.c(obj) != i12) {
                                    i13 = 4;
                                } else {
                                    i13 = 3;
                                }
                                boolean z32 = z12 ? 1 : 0;
                                boolean z33 = z12 ? 1 : 0;
                                boolean z34 = z12 ? 1 : 0;
                                c6510m.f50410B0 = p(c0492y3, j10, j6, j20, z32, i13);
                            }
                            E();
                            c6510m.G(g0Var, c6510m.f50410B0.f50536a);
                            c6510m.f50410B0 = c6510m.f50410B0.g(g0Var);
                            if (!g0Var.r()) {
                                c6510m.f50424P0 = r14;
                            }
                            c6510m.l(false);
                            throw th2;
                        }
                    }
                    c6510m.D(false, false, false, true);
                } catch (Throwable th4) {
                    th2 = th4;
                    z13 = true;
                    j10 = j19;
                    i12 = i11;
                    j6 = r13;
                    r14 = 0;
                    z12 = z13;
                    d0 d0Var22 = c6510m.f50410B0;
                    p2.g0 g0Var32 = d0Var22.f50536a;
                    C0492y c0492y42 = d0Var22.f50537b;
                    if (!c6508k.f50405f) {
                    }
                    g0(g0Var, c0492y3, g0Var32, c0492y42, j11, false);
                    if (!z11) {
                    }
                    d0 d0Var32 = c6510m.f50410B0;
                    obj = d0Var32.f50537b.f4420a;
                    p2.g0 g0Var42 = d0Var32.f50536a;
                    if (z11) {
                    }
                    z12 = false;
                    long j202 = c6510m.f50410B0.f50539d;
                    if (g0Var.c(obj) != i12) {
                    }
                    boolean z322 = z12 ? 1 : 0;
                    boolean z332 = z12 ? 1 : 0;
                    boolean z342 = z12 ? 1 : 0;
                    c6510m.f50410B0 = p(c0492y3, j10, j6, j202, z322, i13);
                    E();
                    c6510m.G(g0Var, c6510m.f50410B0.f50536a);
                    c6510m.f50410B0 = c6510m.f50410B0.g(g0Var);
                    if (!g0Var.r()) {
                    }
                    c6510m.l(false);
                    throw th2;
                }
            } else {
                z13 = true;
            }
            AbstractC6519f[] abstractC6519fArr = c6510m.f50430Y;
            int length = abstractC6519fArr.length;
            int i25 = 0;
            C6510M c6510m2 = i11;
            while (i25 < length) {
                try {
                    AbstractC6519f abstractC6519f = abstractC6519fArr[i25];
                    if (!AbstractC5530A.a(abstractC6519f.f50578u0, g0Var)) {
                        abstractC6519f.f50578u0 = g0Var;
                    }
                    i25++;
                    c6510m2 = -1;
                } catch (Throwable th5) {
                    th2 = th5;
                    j10 = j19;
                    j6 = r13;
                    i12 = -1;
                    z12 = true;
                    r14 = 0;
                    d0 d0Var222 = c6510m.f50410B0;
                    p2.g0 g0Var322 = d0Var222.f50536a;
                    C0492y c0492y422 = d0Var222.f50537b;
                    if (!c6508k.f50405f) {
                    }
                    g0(g0Var, c0492y3, g0Var322, c0492y422, j11, false);
                    if (!z11) {
                    }
                    d0 d0Var322 = c6510m.f50410B0;
                    obj = d0Var322.f50537b.f4420a;
                    p2.g0 g0Var422 = d0Var322.f50536a;
                    if (z11) {
                    }
                    z12 = false;
                    long j2022 = c6510m.f50410B0.f50539d;
                    if (g0Var.c(obj) != i12) {
                    }
                    boolean z3222 = z12 ? 1 : 0;
                    boolean z3322 = z12 ? 1 : 0;
                    boolean z3422 = z12 ? 1 : 0;
                    c6510m.f50410B0 = p(c0492y3, j10, j6, j2022, z3222, i13);
                    E();
                    c6510m.G(g0Var, c6510m.f50410B0.f50536a);
                    c6510m.f50410B0 = c6510m.f50410B0.g(g0Var);
                    if (!g0Var.r()) {
                    }
                    c6510m.l(false);
                    throw th2;
                }
            }
            try {
                if (!z11) {
                    try {
                        U u11 = c6510m.f50447w0;
                        long j21 = c6510m.f50425Q0;
                        try {
                            S s10 = u11.f50489i;
                            if (s10 == null) {
                                j10 = j19;
                                c6510m2 = c6510m;
                                j12 = j6;
                            } else {
                                try {
                                    j12 = s10.f50471o;
                                    if (!s10.f50460d) {
                                        c6510m2 = this;
                                        j10 = j19;
                                    } else {
                                        int i26 = 0;
                                        c6510m2 = this;
                                        j10 = j19;
                                        r13 = r13;
                                        while (true) {
                                            try {
                                                AbstractC6519f[] abstractC6519fArr2 = c6510m2.f50430Y;
                                                if (i26 >= abstractC6519fArr2.length) {
                                                    break;
                                                }
                                                try {
                                                    if (r(abstractC6519fArr2[i26])) {
                                                        AbstractC6519f abstractC6519f2 = abstractC6519fArr2[i26];
                                                        j6 = r13;
                                                        try {
                                                            if (abstractC6519f2.f50571n0 == s10.f50459c[i26]) {
                                                                long j22 = abstractC6519f2.f50575r0;
                                                                if (j22 == Long.MIN_VALUE) {
                                                                    j12 = Long.MIN_VALUE;
                                                                    break;
                                                                }
                                                                j12 = Math.max(j22, j12);
                                                            }
                                                        } catch (Throwable th6) {
                                                            th2 = th6;
                                                            r13 = 1;
                                                            e0Var2 = null;
                                                            c6510m = c6510m2;
                                                            z14 = r13;
                                                            e0Var = e0Var2;
                                                            i12 = -1;
                                                            z12 = z14;
                                                            r14 = e0Var;
                                                            d0 d0Var2222 = c6510m.f50410B0;
                                                            p2.g0 g0Var3222 = d0Var2222.f50536a;
                                                            C0492y c0492y4222 = d0Var2222.f50537b;
                                                            if (!c6508k.f50405f) {
                                                            }
                                                            g0(g0Var, c0492y3, g0Var3222, c0492y4222, j11, false);
                                                            if (!z11) {
                                                            }
                                                            d0 d0Var3222 = c6510m.f50410B0;
                                                            obj = d0Var3222.f50537b.f4420a;
                                                            p2.g0 g0Var4222 = d0Var3222.f50536a;
                                                            if (z11) {
                                                            }
                                                            z12 = false;
                                                            long j20222 = c6510m.f50410B0.f50539d;
                                                            if (g0Var.c(obj) != i12) {
                                                            }
                                                            boolean z32222 = z12 ? 1 : 0;
                                                            boolean z33222 = z12 ? 1 : 0;
                                                            boolean z34222 = z12 ? 1 : 0;
                                                            c6510m.f50410B0 = p(c0492y3, j10, j6, j20222, z32222, i13);
                                                            E();
                                                            c6510m.G(g0Var, c6510m.f50410B0.f50536a);
                                                            c6510m.f50410B0 = c6510m.f50410B0.g(g0Var);
                                                            if (!g0Var.r()) {
                                                            }
                                                            c6510m.l(false);
                                                            throw th2;
                                                        }
                                                    } else {
                                                        j6 = r13;
                                                    }
                                                    i26++;
                                                    r13 = j6;
                                                } catch (Throwable th7) {
                                                    th2 = th7;
                                                    j6 = r13;
                                                    r13 = 1;
                                                    e0Var2 = null;
                                                    c6510m = c6510m2;
                                                    z14 = r13;
                                                    e0Var = e0Var2;
                                                    i12 = -1;
                                                    z12 = z14;
                                                    r14 = e0Var;
                                                    d0 d0Var22222 = c6510m.f50410B0;
                                                    p2.g0 g0Var32222 = d0Var22222.f50536a;
                                                    C0492y c0492y42222 = d0Var22222.f50537b;
                                                    if (!c6508k.f50405f) {
                                                    }
                                                    g0(g0Var, c0492y3, g0Var32222, c0492y42222, j11, false);
                                                    if (!z11) {
                                                    }
                                                    d0 d0Var32222 = c6510m.f50410B0;
                                                    obj = d0Var32222.f50537b.f4420a;
                                                    p2.g0 g0Var42222 = d0Var32222.f50536a;
                                                    if (z11) {
                                                    }
                                                    z12 = false;
                                                    long j202222 = c6510m.f50410B0.f50539d;
                                                    if (g0Var.c(obj) != i12) {
                                                    }
                                                    boolean z322222 = z12 ? 1 : 0;
                                                    boolean z332222 = z12 ? 1 : 0;
                                                    boolean z342222 = z12 ? 1 : 0;
                                                    c6510m.f50410B0 = p(c0492y3, j10, j6, j202222, z322222, i13);
                                                    E();
                                                    c6510m.G(g0Var, c6510m.f50410B0.f50536a);
                                                    c6510m.f50410B0 = c6510m.f50410B0.g(g0Var);
                                                    if (!g0Var.r()) {
                                                    }
                                                    c6510m.l(false);
                                                    throw th2;
                                                }
                                            } catch (Throwable th8) {
                                                th2 = th8;
                                            }
                                        }
                                    }
                                } catch (Throwable th9) {
                                    th2 = th9;
                                    c6510m2 = this;
                                    j10 = j19;
                                }
                            }
                            j6 = r13;
                            z15 = true;
                            c6509l = null;
                            if (!u11.p(g0Var, j21, j12)) {
                                c6510m2.J(false);
                            }
                        } catch (Throwable th10) {
                            th2 = th10;
                            j10 = j19;
                            c6510m2 = c6510m;
                        }
                    } catch (Throwable th11) {
                        th2 = th11;
                        j10 = j19;
                        j6 = r13;
                        z14 = true;
                        e0Var = null;
                        i12 = -1;
                        z12 = z14;
                        r14 = e0Var;
                        d0 d0Var222222 = c6510m.f50410B0;
                        p2.g0 g0Var322222 = d0Var222222.f50536a;
                        C0492y c0492y422222 = d0Var222222.f50537b;
                        if (!c6508k.f50405f) {
                        }
                        g0(g0Var, c0492y3, g0Var322222, c0492y422222, j11, false);
                        if (!z11) {
                        }
                        d0 d0Var322222 = c6510m.f50410B0;
                        obj = d0Var322222.f50537b.f4420a;
                        p2.g0 g0Var422222 = d0Var322222.f50536a;
                        if (z11) {
                        }
                        z12 = false;
                        long j2022222 = c6510m.f50410B0.f50539d;
                        if (g0Var.c(obj) != i12) {
                        }
                        boolean z3222222 = z12 ? 1 : 0;
                        boolean z3322222 = z12 ? 1 : 0;
                        boolean z3422222 = z12 ? 1 : 0;
                        c6510m.f50410B0 = p(c0492y3, j10, j6, j2022222, z3222222, i13);
                        E();
                        c6510m.G(g0Var, c6510m.f50410B0.f50536a);
                        c6510m.f50410B0 = c6510m.f50410B0.g(g0Var);
                        if (!g0Var.r()) {
                        }
                        c6510m.l(false);
                        throw th2;
                    }
                } else {
                    j10 = j19;
                    c6510m2 = c6510m;
                    j6 = r13;
                    z15 = true;
                    c6509l = null;
                    if (!g0Var.r()) {
                        for (S s11 = c6510m2.f50447w0.f50488h; s11 != null; s11 = s11.f50468l) {
                            if (s11.f50462f.f50472a.equals(c0492y3)) {
                                s11.f50462f = c6510m2.f50447w0.h(g0Var, s11.f50462f);
                                s11.i();
                            }
                        }
                        U u12 = c6510m2.f50447w0;
                        if (u12.f50488h != u12.f50489i) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        j10 = L(c0492y3, j10, z16, z31);
                    }
                }
                d0 d0Var4 = c6510m2.f50410B0;
                p2.g0 g0Var5 = d0Var4.f50536a;
                C0492y c0492y5 = d0Var4.f50537b;
                if (c6508k.f50405f) {
                    j13 = j10;
                } else {
                    j13 = -9223372036854775807L;
                }
                C6510M c6510m3 = c6510m2;
                g0(g0Var, c0492y3, g0Var5, c0492y5, j13, false);
                if (z11 || j6 != c6510m3.f50410B0.f50538c) {
                    d0 d0Var5 = c6510m3.f50410B0;
                    Object obj3 = d0Var5.f50537b.f4420a;
                    p2.g0 g0Var6 = d0Var5.f50536a;
                    if (!z11 || !z10 || g0Var6.r() || g0Var6.i(obj3, c6510m3.f50441q0).f42027k0) {
                        z15 = false;
                    }
                    long j23 = c6510m3.f50410B0.f50539d;
                    if (g0Var.c(obj3) == -1) {
                        i14 = 4;
                    } else {
                        i14 = 3;
                    }
                    c6510m3.f50410B0 = p(c0492y3, j10, j6, j23, z15, i14);
                }
                E();
                c6510m3.G(g0Var, c6510m3.f50410B0.f50536a);
                c6510m3.f50410B0 = c6510m3.f50410B0.g(g0Var);
                if (!g0Var.r()) {
                    c6510m3.f50424P0 = c6509l;
                }
                c6510m3.l(false);
            } catch (Throwable th12) {
                th2 = th12;
            }
        } catch (Throwable th13) {
            th2 = th13;
            j10 = j19;
            i12 = i11;
            j6 = r13;
        }
    }

    public final void n(AbstractC0490w abstractC0490w) {
        U u10 = this.f50447w0;
        S s10 = u10.f50490j;
        if (s10 != null && s10.f50457a == abstractC0490w) {
            float f6 = this.f50443s0.c().f41934Y;
            p2.g0 g0Var = this.f50410B0.f50536a;
            s10.f50460d = true;
            s10.f50469m = s10.f50457a.u();
            H2.w h10 = s10.h(f6, g0Var);
            T t10 = s10.f50462f;
            long j6 = t10.f50473b;
            long j10 = t10.f50476e;
            if (j10 != -9223372036854775807L && j6 >= j10) {
                j6 = Math.max(0L, j10 - 1);
            }
            long a5 = s10.a(h10, j6, false, new boolean[s10.f50465i.length]);
            long j11 = s10.f50471o;
            T t11 = s10.f50462f;
            s10.f50471o = (t11.f50473b - a5) + j11;
            s10.f50462f = t11.b(a5);
            d0(s10.f50470n);
            if (s10 == u10.f50488h) {
                F(s10.f50462f.f50473b);
                g(new boolean[this.f50430Y.length], u10.f50489i.e());
                d0 d0Var = this.f50410B0;
                C0492y c0492y = d0Var.f50537b;
                long j12 = s10.f50462f.f50473b;
                this.f50410B0 = p(c0492y, j12, d0Var.f50538c, j12, false, 5);
            }
            t();
        }
    }

    public final void o(p2.S s10, float f6, boolean z10, boolean z11) {
        int i10;
        C6510M c6510m = this;
        if (z10) {
            if (z11) {
                c6510m.f50411C0.a(1);
            }
            d0 d0Var = c6510m.f50410B0;
            c6510m = this;
            c6510m.f50410B0 = new d0(d0Var.f50536a, d0Var.f50537b, d0Var.f50538c, d0Var.f50539d, d0Var.f50540e, d0Var.f50541f, d0Var.f50542g, d0Var.f50543h, d0Var.f50544i, d0Var.f50545j, d0Var.f50546k, d0Var.f50547l, d0Var.f50548m, s10, d0Var.f50551p, d0Var.f50552q, d0Var.f50553r, d0Var.f50554s, d0Var.f50550o);
        }
        float f10 = s10.f41934Y;
        S s11 = c6510m.f50447w0.f50488h;
        while (true) {
            i10 = 0;
            if (s11 == null) {
                break;
            }
            H2.s[] sVarArr = s11.f50470n.f7339c;
            int length = sVarArr.length;
            while (i10 < length) {
                H2.s sVar = sVarArr[i10];
                if (sVar != null) {
                    sVar.h(f10);
                }
                i10++;
            }
            s11 = s11.f50468l;
        }
        AbstractC6519f[] abstractC6519fArr = c6510m.f50430Y;
        int length2 = abstractC6519fArr.length;
        while (i10 < length2) {
            AbstractC6519f abstractC6519f = abstractC6519fArr[i10];
            if (abstractC6519f != null) {
                abstractC6519f.y(f6, s10.f41934Y);
            }
            i10++;
        }
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [x8.K, x8.H] */
    public final d0 p(C0492y c0492y, long j6, long j10, long j11, boolean z10, int i10) {
        boolean z11;
        x8.k0 k0Var;
        H2.w wVar;
        E2.i0 i0Var;
        long j12;
        E2.i0 i0Var2;
        H2.w wVar2;
        x8.k0 k0Var2;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        if (!this.f50427S0 && j6 == this.f50410B0.f50553r && c0492y.equals(this.f50410B0.f50537b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f50427S0 = z11;
        E();
        d0 d0Var = this.f50410B0;
        E2.i0 i0Var3 = d0Var.f50543h;
        H2.w wVar3 = d0Var.f50544i;
        List list = d0Var.f50545j;
        if (this.f50448x0.f50533k) {
            S s10 = this.f50447w0.f50488h;
            if (s10 == null) {
                i0Var2 = E2.i0.f4359i0;
            } else {
                i0Var2 = s10.f50469m;
            }
            if (s10 == null) {
                wVar2 = this.f50434j0;
            } else {
                wVar2 = s10.f50470n;
            }
            H2.s[] sVarArr = wVar2.f7339c;
            ?? h10 = new x8.H();
            boolean z15 = false;
            for (H2.s sVar : sVarArr) {
                if (sVar != null) {
                    p2.M m10 = sVar.c(0).f42317o0;
                    if (m10 == null) {
                        h10.d0(new p2.M(new p2.L[0]));
                    } else {
                        h10.d0(m10);
                        z15 = true;
                    }
                }
            }
            if (z15) {
                k0Var2 = h10.i0();
            } else {
                x8.L l10 = x8.N.f49523Z;
                k0Var2 = x8.k0.f49573j0;
            }
            if (s10 != null) {
                T t10 = s10.f50462f;
                if (t10.f50474c != j10) {
                    s10.f50462f = t10.a(j10);
                }
            }
            S s11 = this.f50447w0.f50488h;
            if (s11 != null) {
                H2.w wVar4 = s11.f50470n;
                int i11 = 0;
                boolean z16 = false;
                while (true) {
                    AbstractC6519f[] abstractC6519fArr = this.f50430Y;
                    if (i11 < abstractC6519fArr.length) {
                        if (wVar4.b(i11)) {
                            if (abstractC6519fArr[i11].f50564Z != 1) {
                                z12 = false;
                                break;
                            } else if (wVar4.f7338b[i11].f50643a != 0) {
                                z16 = true;
                            }
                        }
                        i11++;
                    } else {
                        z12 = true;
                        break;
                    }
                }
                if (z16 && z12) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 != this.f50422N0) {
                    this.f50422N0 = z13;
                    if (!z13 && this.f50410B0.f50550o) {
                        this.f50437m0.d(2);
                    }
                }
            }
            k0Var = k0Var2;
            i0Var = i0Var2;
            wVar = wVar2;
        } else if (!c0492y.equals(d0Var.f50537b)) {
            i0Var = E2.i0.f4359i0;
            wVar = this.f50434j0;
            k0Var = x8.k0.f49573j0;
        } else {
            i0Var = i0Var3;
            wVar = wVar3;
            k0Var = list;
        }
        if (z10) {
            C6507J c6507j = this.f50411C0;
            if (c6507j.f50396d && c6507j.f50397e != 5) {
                if (i10 == 5) {
                    z14 = true;
                }
                Gi.e.l(z14);
            } else {
                c6507j.f50393a = true;
                c6507j.f50396d = true;
                c6507j.f50397e = i10;
            }
        }
        d0 d0Var2 = this.f50410B0;
        long j13 = d0Var2.f50551p;
        S s12 = this.f50447w0.f50490j;
        if (s12 == null) {
            j12 = 0;
        } else {
            j12 = Math.max(0L, j13 - (this.f50425Q0 - s12.f50471o));
        }
        return d0Var2.c(c0492y, j6, j10, j11, j12, i0Var, wVar, k0Var);
    }

    public final boolean q() {
        long j6;
        S s10 = this.f50447w0.f50490j;
        if (s10 == null) {
            return false;
        }
        if (!s10.f50460d) {
            j6 = 0;
        } else {
            j6 = s10.f50457a.c();
        }
        if (j6 == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final boolean s() {
        S s10 = this.f50447w0.f50488h;
        long j6 = s10.f50462f.f50476e;
        if (s10.f50460d && (j6 == -9223372036854775807L || this.f50410B0.f50553r < j6 || !X())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, y2.O] */
    public final void t() {
        boolean z10;
        boolean z11;
        boolean z12;
        long j6;
        long j10;
        boolean z13 = false;
        if (!q()) {
            z10 = false;
        } else {
            S s10 = this.f50447w0.f50490j;
            if (!s10.f50460d) {
                j6 = 0;
            } else {
                j6 = s10.f50457a.c();
            }
            S s11 = this.f50447w0.f50490j;
            if (s11 == null) {
                j10 = 0;
            } else {
                j10 = Math.max(0L, j6 - (this.f50425Q0 - s11.f50471o));
            }
            if (s10 != this.f50447w0.f50488h) {
                long j11 = s10.f50462f.f50473b;
            }
            z10 = ((C6523j) this.f50435k0).c(this.f50443s0.c().f41934Y, j10);
            if (!z10 && j10 < 500000 && this.f50442r0 > 0) {
                this.f50447w0.f50488h.f50457a.k(this.f50410B0.f50553r);
                z10 = ((C6523j) this.f50435k0).c(this.f50443s0.c().f41934Y, j10);
            }
        }
        this.f50417I0 = z10;
        if (z10) {
            S s12 = this.f50447w0.f50490j;
            long j12 = this.f50425Q0;
            float f6 = this.f50443s0.c().f41934Y;
            long j13 = this.f50416H0;
            if (s12.f50468l == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            Gi.e.n(z11);
            AbstractC0490w abstractC0490w = s12.f50457a;
            ?? obj = new Object();
            obj.f50452b = -3.4028235E38f;
            obj.f50453c = -9223372036854775807L;
            obj.f50451a = j12 - s12.f50471o;
            if (f6 <= 0.0f && f6 != -3.4028235E38f) {
                z12 = false;
            } else {
                z12 = true;
            }
            Gi.e.l(z12);
            obj.f50452b = f6;
            if (j13 >= 0 || j13 == -9223372036854775807L) {
                z13 = true;
            }
            Gi.e.l(z13);
            obj.f50453c = j13;
            abstractC0490w.m(new C6513P(obj));
        }
        c0();
    }

    public final void u() {
        boolean z10;
        C6507J c6507j = this.f50411C0;
        d0 d0Var = this.f50410B0;
        boolean z11 = c6507j.f50393a;
        if (c6507j.f50394b != d0Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        c6507j.f50393a = z12;
        c6507j.f50394b = d0Var;
        if (z12) {
            C6504G c6504g = this.f50446v0.f50700Y;
            c6504g.f50370i.c(new RunnableC4517N(c6504g, 7, c6507j));
            this.f50411C0 = new C6507J(this.f50410B0);
        }
    }

    public final void v() {
        m(this.f50448x0.b(), true);
    }

    public final void w() {
        this.f50411C0.a(1);
        throw null;
    }

    public final void x() {
        int i10;
        this.f50411C0.a(1);
        int i11 = 0;
        D(false, false, false, true);
        ((C6523j) this.f50435k0).b(false);
        if (this.f50410B0.f50536a.r()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        W(i10);
        I2.g gVar = (I2.g) this.f50436l0;
        gVar.getClass();
        c0 c0Var = this.f50448x0;
        Gi.e.n(!c0Var.f50533k);
        c0Var.f50534l = gVar;
        while (true) {
            ArrayList arrayList = c0Var.f50524b;
            if (i11 < arrayList.size()) {
                b0 b0Var = (b0) arrayList.get(i11);
                c0Var.e(b0Var);
                c0Var.f50529g.add(b0Var);
                i11++;
            } else {
                c0Var.f50533k = true;
                this.f50437m0.d(2);
                return;
            }
        }
    }

    public final synchronized boolean y() {
        if (!this.f50412D0 && this.f50439o0.getThread().isAlive()) {
            this.f50437m0.d(7);
            i0(new C6530q(1, this), this.f50450z0);
            return this.f50412D0;
        }
        return true;
    }

    public final void z() {
        D(true, false, true, false);
        A();
        ((C6523j) this.f50435k0).b(true);
        W(1);
        HandlerThread handlerThread = this.f50438n0;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.f50412D0 = true;
            notifyAll();
        }
    }
}
