package i4;

import B2.E;
import G0.C0571a;
import Sg.C1394f;
import id.AbstractC3557B;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jf.y;
import ji.AbstractC4136k;
import ji.C4113B;
import ji.C4115D;
import ji.C4116E;
import ji.x;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class i implements Closeable, Flushable {

    /* renamed from: v0  reason: collision with root package name */
    public static final Lg.i f32681v0 = new Lg.i("[a-z0-9_-]{1,120}");

    /* renamed from: Y  reason: collision with root package name */
    public final C4113B f32682Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f32683Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C4113B f32684h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C4113B f32685i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C4113B f32686j0;

    /* renamed from: k0  reason: collision with root package name */
    public final LinkedHashMap f32687k0;

    /* renamed from: l0  reason: collision with root package name */
    public final C1394f f32688l0;

    /* renamed from: m0  reason: collision with root package name */
    public long f32689m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f32690n0;

    /* renamed from: o0  reason: collision with root package name */
    public AbstractC4136k f32691o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f32692p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f32693q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f32694r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f32695s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f32696t0;

    /* renamed from: u0  reason: collision with root package name */
    public final C3474g f32697u0;

    public i(x xVar, C4113B c4113b, Tg.d dVar, long j6) {
        this.f32682Y = c4113b;
        this.f32683Z = j6;
        if (j6 > 0) {
            this.f32684h0 = c4113b.d("journal");
            this.f32685i0 = c4113b.d("journal.tmp");
            this.f32686j0 = c4113b.d("journal.bkp");
            this.f32687k0 = new LinkedHashMap(0, 0.75f, true);
            this.f32688l0 = Ad.l.g(AbstractC4344b.Q0(Bi.c.z(), dVar.u0(1)));
            this.f32697u0 = new C3474g(xVar);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    public static void V(String str) {
        if (f32681v0.b(str)) {
            return;
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.h("keys must match regex [a-z0-9_-]{1,120}: \"", str, '\"').toString());
    }

    public static final void a(i iVar, E e10, boolean z10) {
        long j6;
        synchronized (iVar) {
            C3472e c3472e = (C3472e) e10.f1739b;
            if (AbstractC3557B.K(c3472e.f32673g, e10)) {
                if (z10 && !c3472e.f32672f) {
                    for (int i10 = 0; i10 < 2; i10++) {
                        if (((boolean[]) e10.f1740c)[i10] && !iVar.f32697u0.f((C4113B) c3472e.f32670d.get(i10))) {
                            e10.b(false);
                            return;
                        }
                    }
                    for (int i11 = 0; i11 < 2; i11++) {
                        C4113B c4113b = (C4113B) c3472e.f32670d.get(i11);
                        C4113B c4113b2 = (C4113B) c3472e.f32669c.get(i11);
                        if (iVar.f32697u0.f(c4113b)) {
                            iVar.f32697u0.b(c4113b, c4113b2);
                        } else {
                            C3474g c3474g = iVar.f32697u0;
                            C4113B c4113b3 = (C4113B) c3472e.f32669c.get(i11);
                            if (!c3474g.f(c4113b3)) {
                                u4.e.a(c3474g.k(c4113b3));
                            }
                        }
                        long j10 = c3472e.f32668b[i11];
                        Long l10 = iVar.f32697u0.h(c4113b2).f36732d;
                        if (l10 != null) {
                            j6 = l10.longValue();
                        } else {
                            j6 = 0;
                        }
                        c3472e.f32668b[i11] = j6;
                        iVar.f32689m0 = (iVar.f32689m0 - j10) + j6;
                    }
                } else {
                    for (int i12 = 0; i12 < 2; i12++) {
                        iVar.f32697u0.e((C4113B) c3472e.f32670d.get(i12));
                    }
                }
                c3472e.f32673g = null;
                if (c3472e.f32672f) {
                    iVar.P(c3472e);
                    return;
                }
                iVar.f32690n0++;
                AbstractC4136k abstractC4136k = iVar.f32691o0;
                AbstractC3557B.Z(abstractC4136k);
                if (!z10 && !c3472e.f32671e) {
                    iVar.f32687k0.remove(c3472e.f32667a);
                    abstractC4136k.c0("REMOVE");
                    abstractC4136k.I(32);
                    abstractC4136k.c0(c3472e.f32667a);
                    abstractC4136k.I(10);
                    abstractC4136k.flush();
                    if (iVar.f32689m0 <= iVar.f32683Z || iVar.f32690n0 >= 2000) {
                        iVar.m();
                    }
                    return;
                }
                c3472e.f32671e = true;
                abstractC4136k.c0("CLEAN");
                abstractC4136k.I(32);
                abstractC4136k.c0(c3472e.f32667a);
                for (long j11 : c3472e.f32668b) {
                    abstractC4136k.I(32).M0(j11);
                }
                abstractC4136k.I(10);
                abstractC4136k.flush();
                if (iVar.f32689m0 <= iVar.f32683Z) {
                }
                iVar.m();
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F() {
        y yVar;
        C4116E J10 = R4.b.J(this.f32697u0.l(this.f32684h0));
        Throwable th2 = null;
        try {
            String R10 = J10.R(Long.MAX_VALUE);
            String R11 = J10.R(Long.MAX_VALUE);
            String R12 = J10.R(Long.MAX_VALUE);
            String R13 = J10.R(Long.MAX_VALUE);
            String R14 = J10.R(Long.MAX_VALUE);
            if (AbstractC3557B.K("libcore.io.DiskLruCache", R10) && AbstractC3557B.K("1", R11) && AbstractC3557B.K(String.valueOf(1), R12) && AbstractC3557B.K(String.valueOf(2), R13) && R14.length() <= 0) {
                int i10 = 0;
                while (true) {
                    try {
                        O(J10.R(Long.MAX_VALUE));
                        i10++;
                    } catch (EOFException unused) {
                        this.f32690n0 = i10 - this.f32687k0.size();
                        if (!J10.H()) {
                            a0();
                        } else {
                            this.f32691o0 = p();
                        }
                        yVar = y.f36177a;
                        try {
                            J10.close();
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                        if (th2 != null) {
                            AbstractC3557B.Z(yVar);
                            return;
                        }
                        throw th2;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + R10 + ", " + R11 + ", " + R12 + ", " + R13 + ", " + R14 + ']');
            }
        } catch (Throwable th4) {
            try {
                J10.close();
            } catch (Throwable th5) {
                P4.a.m(th4, th5);
            }
            th2 = th4;
            yVar = null;
            if (th2 != null) {
            }
        }
    }

    public final void O(String str) {
        String str2;
        int k22 = Lg.n.k2(str, ' ', 0, false, 6);
        if (k22 != -1) {
            int i10 = k22 + 1;
            int k23 = Lg.n.k2(str, ' ', i10, false, 4);
            LinkedHashMap linkedHashMap = this.f32687k0;
            if (k23 == -1) {
                str2 = str.substring(i10);
                AbstractC3557B.b0("substring(...)", str2);
                if (k22 == 6 && Lg.n.I2(str, "REMOVE", false)) {
                    linkedHashMap.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i10, k23);
                AbstractC3557B.b0("substring(...)", str2);
            }
            Object obj = linkedHashMap.get(str2);
            if (obj == null) {
                obj = new C3472e(this, str2);
                linkedHashMap.put(str2, obj);
            }
            C3472e c3472e = (C3472e) obj;
            if (k23 != -1 && k22 == 5 && Lg.n.I2(str, "CLEAN", false)) {
                String substring = str.substring(k23 + 1);
                AbstractC3557B.b0("substring(...)", substring);
                List F22 = Lg.n.F2(substring, new char[]{' '});
                c3472e.f32671e = true;
                c3472e.f32673g = null;
                int size = F22.size();
                c3472e.f32675i.getClass();
                if (size == 2) {
                    try {
                        int size2 = F22.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            c3472e.f32668b[i11] = Long.parseLong((String) F22.get(i11));
                        }
                        return;
                    } catch (NumberFormatException unused) {
                        throw new IOException("unexpected journal line: " + F22);
                    }
                }
                throw new IOException("unexpected journal line: " + F22);
            } else if (k23 == -1 && k22 == 5 && Lg.n.I2(str, "DIRTY", false)) {
                c3472e.f32673g = new E(this, c3472e);
                return;
            } else if (k23 == -1 && k22 == 4 && Lg.n.I2(str, "READ", false)) {
                return;
            } else {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final void P(C3472e c3472e) {
        AbstractC4136k abstractC4136k;
        int i10 = c3472e.f32674h;
        String str = c3472e.f32667a;
        if (i10 > 0 && (abstractC4136k = this.f32691o0) != null) {
            abstractC4136k.c0("DIRTY");
            abstractC4136k.I(32);
            abstractC4136k.c0(str);
            abstractC4136k.I(10);
            abstractC4136k.flush();
        }
        if (c3472e.f32674h <= 0 && c3472e.f32673g == null) {
            for (int i11 = 0; i11 < 2; i11++) {
                this.f32697u0.e((C4113B) c3472e.f32669c.get(i11));
                long j6 = this.f32689m0;
                long[] jArr = c3472e.f32668b;
                this.f32689m0 = j6 - jArr[i11];
                jArr[i11] = 0;
            }
            this.f32690n0++;
            AbstractC4136k abstractC4136k2 = this.f32691o0;
            if (abstractC4136k2 != null) {
                abstractC4136k2.c0("REMOVE");
                abstractC4136k2.I(32);
                abstractC4136k2.c0(str);
                abstractC4136k2.I(10);
            }
            this.f32687k0.remove(str);
            if (this.f32690n0 >= 2000) {
                m();
                return;
            }
            return;
        }
        c3472e.f32672f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        P(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S() {
        while (this.f32689m0 > this.f32683Z) {
            for (C3472e c3472e : this.f32687k0.values()) {
                if (!c3472e.f32672f) {
                    break;
                }
            }
            return;
        }
        this.f32695s0 = false;
    }

    public final synchronized void a0() {
        long[] jArr;
        try {
            AbstractC4136k abstractC4136k = this.f32691o0;
            if (abstractC4136k != null) {
                abstractC4136k.close();
            }
            C4115D I10 = R4.b.I(this.f32697u0.k(this.f32685i0));
            Throwable th2 = null;
            I10.c0("libcore.io.DiskLruCache");
            I10.I(10);
            I10.c0("1");
            I10.I(10);
            I10.M0(1);
            I10.I(10);
            I10.M0(2);
            I10.I(10);
            I10.I(10);
            for (C3472e c3472e : this.f32687k0.values()) {
                if (c3472e.f32673g != null) {
                    I10.c0("DIRTY");
                    I10.I(32);
                    I10.c0(c3472e.f32667a);
                    I10.I(10);
                } else {
                    I10.c0("CLEAN");
                    I10.I(32);
                    I10.c0(c3472e.f32667a);
                    for (long j6 : c3472e.f32668b) {
                        I10.I(32);
                        I10.M0(j6);
                    }
                    I10.I(10);
                }
            }
            y yVar = y.f36177a;
            try {
                I10.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
            if (th2 == null) {
                AbstractC3557B.Z(yVar);
                if (this.f32697u0.f(this.f32684h0)) {
                    this.f32697u0.b(this.f32684h0, this.f32686j0);
                    this.f32697u0.b(this.f32685i0, this.f32684h0);
                    this.f32697u0.e(this.f32686j0);
                } else {
                    this.f32697u0.b(this.f32685i0, this.f32684h0);
                }
                this.f32691o0 = p();
                this.f32690n0 = 0;
                this.f32692p0 = false;
                this.f32696t0 = false;
            } else {
                throw th2;
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f32693q0 && !this.f32694r0) {
                for (C3472e c3472e : (C3472e[]) this.f32687k0.values().toArray(new C3472e[0])) {
                    E e10 = c3472e.f32673g;
                    if (e10 != null) {
                        Object obj = e10.f1739b;
                        if (AbstractC3557B.K(((C3472e) obj).f32673g, e10)) {
                            ((C3472e) obj).f32672f = true;
                        }
                    }
                }
                S();
                Ad.l.P(this.f32688l0, null);
                AbstractC4136k abstractC4136k = this.f32691o0;
                AbstractC3557B.Z(abstractC4136k);
                abstractC4136k.close();
                this.f32691o0 = null;
                this.f32694r0 = true;
                return;
            }
            this.f32694r0 = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (!this.f32693q0) {
            return;
        }
        h();
        S();
        AbstractC4136k abstractC4136k = this.f32691o0;
        AbstractC3557B.Z(abstractC4136k);
        abstractC4136k.flush();
    }

    public final void h() {
        if (!this.f32694r0) {
            return;
        }
        throw new IllegalStateException("cache is closed".toString());
    }

    public final synchronized E i(String str) {
        E e10;
        try {
            h();
            V(str);
            k();
            C3472e c3472e = (C3472e) this.f32687k0.get(str);
            if (c3472e != null) {
                e10 = c3472e.f32673g;
            } else {
                e10 = null;
            }
            if (e10 != null) {
                return null;
            }
            if (c3472e != null && c3472e.f32674h != 0) {
                return null;
            }
            if (!this.f32695s0 && !this.f32696t0) {
                AbstractC4136k abstractC4136k = this.f32691o0;
                AbstractC3557B.Z(abstractC4136k);
                abstractC4136k.c0("DIRTY");
                abstractC4136k.I(32);
                abstractC4136k.c0(str);
                abstractC4136k.I(10);
                abstractC4136k.flush();
                if (this.f32692p0) {
                    return null;
                }
                if (c3472e == null) {
                    c3472e = new C3472e(this, str);
                    this.f32687k0.put(str, c3472e);
                }
                E e11 = new E(this, c3472e);
                c3472e.f32673g = e11;
                return e11;
            }
            m();
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized C3473f j(String str) {
        C3473f a5;
        h();
        V(str);
        k();
        C3472e c3472e = (C3472e) this.f32687k0.get(str);
        if (c3472e != null && (a5 = c3472e.a()) != null) {
            this.f32690n0++;
            AbstractC4136k abstractC4136k = this.f32691o0;
            AbstractC3557B.Z(abstractC4136k);
            abstractC4136k.c0("READ");
            abstractC4136k.I(32);
            abstractC4136k.c0(str);
            abstractC4136k.I(10);
            if (this.f32690n0 >= 2000) {
                m();
            }
            return a5;
        }
        return null;
    }

    public final synchronized void k() {
        try {
            if (this.f32693q0) {
                return;
            }
            this.f32697u0.e(this.f32685i0);
            if (this.f32697u0.f(this.f32686j0)) {
                if (this.f32697u0.f(this.f32684h0)) {
                    this.f32697u0.e(this.f32686j0);
                } else {
                    this.f32697u0.b(this.f32686j0, this.f32684h0);
                }
            }
            if (this.f32697u0.f(this.f32684h0)) {
                try {
                    F();
                    r();
                    this.f32693q0 = true;
                    return;
                } catch (IOException unused) {
                    close();
                    U3.f.u(this.f32697u0, this.f32682Y);
                    this.f32694r0 = false;
                }
            }
            a0();
            this.f32693q0 = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void m() {
        Ad.l.O0(this.f32688l0, null, null, new h(this, null), 3);
    }

    public final C4115D p() {
        C3474g c3474g = this.f32697u0;
        c3474g.getClass();
        C4113B c4113b = this.f32684h0;
        AbstractC3557B.c0("file", c4113b);
        return R4.b.I(new j(c3474g.a(c4113b), new C0571a(18, this)));
    }

    public final void r() {
        Iterator it = this.f32687k0.values().iterator();
        long j6 = 0;
        while (it.hasNext()) {
            C3472e c3472e = (C3472e) it.next();
            int i10 = 0;
            if (c3472e.f32673g == null) {
                while (i10 < 2) {
                    j6 += c3472e.f32668b[i10];
                    i10++;
                }
            } else {
                c3472e.f32673g = null;
                while (i10 < 2) {
                    C3474g c3474g = this.f32697u0;
                    c3474g.e((C4113B) c3472e.f32669c.get(i10));
                    c3474g.e((C4113B) c3472e.f32670d.get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.f32689m0 = j6;
    }
}
