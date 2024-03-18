package B2;

import android.gov.nist.core.Separators;
import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import m.RunnableC4517N;
import p2.AbstractC5058k;
import p2.C5062o;
import p2.C5063p;
import p2.C5065s;
import p2.N;
import s2.AbstractC5530A;
import x8.L;
import x8.S;
import x8.k0;
import z2.C6755D;

/* renamed from: B2.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0207h implements q {

    /* renamed from: A0  reason: collision with root package name */
    public byte[] f1780A0;

    /* renamed from: B0  reason: collision with root package name */
    public C6755D f1781B0;

    /* renamed from: C0  reason: collision with root package name */
    public volatile HandlerC0204e f1782C0;

    /* renamed from: Y  reason: collision with root package name */
    public final UUID f1783Y;

    /* renamed from: Z  reason: collision with root package name */
    public final A f1784Z;

    /* renamed from: h0  reason: collision with root package name */
    public final E f1785h0;

    /* renamed from: i0  reason: collision with root package name */
    public final HashMap f1786i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f1787j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int[] f1788k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f1789l0;

    /* renamed from: n0  reason: collision with root package name */
    public final R4.a f1791n0;

    /* renamed from: p0  reason: collision with root package name */
    public final long f1793p0;

    /* renamed from: t0  reason: collision with root package name */
    public int f1797t0;

    /* renamed from: u0  reason: collision with root package name */
    public y f1798u0;

    /* renamed from: v0  reason: collision with root package name */
    public C0203d f1799v0;

    /* renamed from: w0  reason: collision with root package name */
    public C0203d f1800w0;

    /* renamed from: x0  reason: collision with root package name */
    public Looper f1801x0;

    /* renamed from: y0  reason: collision with root package name */
    public Handler f1802y0;

    /* renamed from: m0  reason: collision with root package name */
    public final U3.u f1790m0 = new U3.u(this);

    /* renamed from: o0  reason: collision with root package name */
    public final F4.a f1792o0 = new F4.a(this);

    /* renamed from: z0  reason: collision with root package name */
    public int f1803z0 = 0;

    /* renamed from: q0  reason: collision with root package name */
    public final ArrayList f1794q0 = new ArrayList();

    /* renamed from: r0  reason: collision with root package name */
    public final Set f1795r0 = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: s0  reason: collision with root package name */
    public final Set f1796s0 = Collections.newSetFromMap(new IdentityHashMap());

    public C0207h(UUID uuid, A a5, E e10, HashMap hashMap, boolean z10, int[] iArr, boolean z11, R4.a aVar, long j6) {
        uuid.getClass();
        Gi.e.k("Use C.CLEARKEY_UUID instead", !AbstractC5058k.f42085b.equals(uuid));
        this.f1783Y = uuid;
        this.f1784Z = a5;
        this.f1785h0 = e10;
        this.f1786i0 = hashMap;
        this.f1787j0 = z10;
        this.f1788k0 = iArr;
        this.f1789l0 = z11;
        this.f1791n0 = aVar;
        this.f1793p0 = j6;
    }

    public static boolean b(C0203d c0203d) {
        c0203d.o();
        if (c0203d.f1765p == 1) {
            if (AbstractC5530A.f45131a < 19) {
                return true;
            }
            j f6 = c0203d.f();
            f6.getClass();
            if (f6.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList f(C5063p c5063p, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(c5063p.f42217i0);
        for (int i10 = 0; i10 < c5063p.f42217i0; i10++) {
            C5062o c5062o = c5063p.f42214Y[i10];
            if ((c5062o.a(uuid) || (AbstractC5058k.f42086c.equals(uuid) && c5062o.a(AbstractC5058k.f42085b))) && (c5062o.f42210j0 != null || z10)) {
                arrayList.add(c5062o);
            }
        }
        return arrayList;
    }

    @Override // B2.q
    public final p E(n nVar, C5065s c5065s) {
        boolean z10;
        if (this.f1797t0 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
        Gi.e.o(this.f1801x0);
        C0206g c0206g = new C0206g(this, nVar);
        Handler handler = this.f1802y0;
        handler.getClass();
        handler.post(new RunnableC4517N(c0206g, 10, c5065s));
        return c0206g;
    }

    @Override // B2.q
    public final int M(C5065s c5065s) {
        i(false);
        y yVar = this.f1798u0;
        yVar.getClass();
        int q10 = yVar.q();
        C5063p c5063p = c5065s.f42322t0;
        if (c5063p == null) {
            int f6 = N.f(c5065s.f42319q0);
            int i10 = 0;
            while (true) {
                int[] iArr = this.f1788k0;
                if (i10 >= iArr.length) {
                    return 0;
                }
                if (iArr[i10] == f6) {
                    if (i10 == -1) {
                        return 0;
                    }
                    return q10;
                }
                i10++;
            }
        } else if (this.f1780A0 == null) {
            UUID uuid = this.f1783Y;
            if (f(c5063p, uuid, true).isEmpty()) {
                if (c5063p.f42217i0 == 1 && c5063p.f42214Y[0].a(AbstractC5058k.f42085b)) {
                    s2.p.g("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = c5063p.f42216h0;
            if (str != null && !"cenc".equals(str)) {
                if ("cbcs".equals(str)) {
                    if (AbstractC5530A.f45131a >= 25) {
                        return q10;
                    }
                } else if (!"cbc1".equals(str) && !"cens".equals(str)) {
                    return q10;
                }
                return 1;
            }
            return q10;
        } else {
            return q10;
        }
    }

    @Override // B2.q
    public final k Q(n nVar, C5065s c5065s) {
        boolean z10 = false;
        i(false);
        if (this.f1797t0 > 0) {
            z10 = true;
        }
        Gi.e.n(z10);
        Gi.e.o(this.f1801x0);
        return a(this.f1801x0, nVar, c5065s, true);
    }

    public final k a(Looper looper, n nVar, C5065s c5065s, boolean z10) {
        ArrayList arrayList;
        if (this.f1782C0 == null) {
            this.f1782C0 = new HandlerC0204e(this, looper);
        }
        C5063p c5063p = c5065s.f42322t0;
        C0203d c0203d = null;
        if (c5063p == null) {
            int f6 = N.f(c5065s.f42319q0);
            y yVar = this.f1798u0;
            yVar.getClass();
            if (yVar.q() == 2 && z.f1825d) {
                return null;
            }
            int[] iArr = this.f1788k0;
            for (int i10 = 0; i10 < iArr.length; i10++) {
                if (iArr[i10] == f6) {
                    if (i10 == -1 || yVar.q() == 1) {
                        return null;
                    }
                    C0203d c0203d2 = this.f1799v0;
                    if (c0203d2 == null) {
                        L l10 = x8.N.f49523Z;
                        C0203d d10 = d(k0.f49573j0, true, null, z10);
                        this.f1794q0.add(d10);
                        this.f1799v0 = d10;
                    } else {
                        c0203d2.b(null);
                    }
                    return this.f1799v0;
                }
            }
            return null;
        }
        if (this.f1780A0 == null) {
            arrayList = f(c5063p, this.f1783Y, false);
            if (arrayList.isEmpty()) {
                Exception exc = new Exception("Media does not support uuid: " + this.f1783Y);
                s2.p.d("DefaultDrmSessionMgr", "DRM error", exc);
                if (nVar != null) {
                    nVar.e(exc);
                }
                return new v(new j(6003, exc));
            }
        } else {
            arrayList = null;
        }
        if (!this.f1787j0) {
            c0203d = this.f1800w0;
        } else {
            Iterator it = this.f1794q0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0203d c0203d3 = (C0203d) it.next();
                if (AbstractC5530A.a(c0203d3.f1750a, arrayList)) {
                    c0203d = c0203d3;
                    break;
                }
            }
        }
        if (c0203d == null) {
            c0203d = d(arrayList, false, nVar, z10);
            if (!this.f1787j0) {
                this.f1800w0 = c0203d;
            }
            this.f1794q0.add(c0203d);
        } else {
            c0203d.b(nVar);
        }
        return c0203d;
    }

    public final C0203d c(List list, boolean z10, n nVar) {
        this.f1798u0.getClass();
        y yVar = this.f1798u0;
        F4.a aVar = this.f1792o0;
        int i10 = this.f1803z0;
        byte[] bArr = this.f1780A0;
        Looper looper = this.f1801x0;
        looper.getClass();
        C6755D c6755d = this.f1781B0;
        c6755d.getClass();
        E e10 = this.f1785h0;
        R4.a aVar2 = this.f1791n0;
        C0203d c0203d = new C0203d(this.f1783Y, yVar, this.f1790m0, aVar, list, i10, this.f1789l0 | z10, z10, bArr, this.f1786i0, e10, looper, aVar2, c6755d);
        c0203d.b(nVar);
        if (this.f1793p0 != -9223372036854775807L) {
            c0203d.b(null);
        }
        return c0203d;
    }

    public final C0203d d(List list, boolean z10, n nVar, boolean z11) {
        C0203d c10 = c(list, z10, nVar);
        boolean b10 = b(c10);
        long j6 = this.f1793p0;
        Set set = this.f1796s0;
        if (b10 && !set.isEmpty()) {
            com.google.android.gms.internal.play_billing.C it = S.V(set).iterator();
            while (it.hasNext()) {
                ((k) it.next()).c(null);
            }
            c10.c(nVar);
            if (j6 != -9223372036854775807L) {
                c10.c(null);
            }
            c10 = c(list, z10, nVar);
        }
        if (b(c10) && z11) {
            Set set2 = this.f1795r0;
            if (!set2.isEmpty()) {
                com.google.android.gms.internal.play_billing.C it2 = S.V(set2).iterator();
                while (it2.hasNext()) {
                    ((C0206g) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    com.google.android.gms.internal.play_billing.C it3 = S.V(set).iterator();
                    while (it3.hasNext()) {
                        ((k) it3.next()).c(null);
                    }
                }
                c10.c(nVar);
                if (j6 != -9223372036854775807L) {
                    c10.c(null);
                }
                return c(list, z10, nVar);
            }
            return c10;
        }
        return c10;
    }

    @Override // B2.q
    public final void e(Looper looper, C6755D c6755d) {
        boolean z10;
        synchronized (this) {
            try {
                Looper looper2 = this.f1801x0;
                if (looper2 == null) {
                    this.f1801x0 = looper;
                    this.f1802y0 = new Handler(looper);
                } else {
                    if (looper2 == looper) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Gi.e.n(z10);
                    this.f1802y0.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f1781B0 = c6755d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // B2.q
    public final void g() {
        D d10;
        i(true);
        int i10 = this.f1797t0;
        this.f1797t0 = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f1798u0 == null) {
            UUID uuid = this.f1783Y;
            getClass();
            try {
                try {
                    d10 = new D(uuid);
                } catch (H unused) {
                    s2.p.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + Separators.DOT);
                    d10 = new Object();
                }
                this.f1798u0 = d10;
                d10.d(new J0.a(this));
            } catch (UnsupportedSchemeException e10) {
                throw new Exception(e10);
            } catch (Exception e11) {
                throw new Exception(e11);
            }
        } else if (this.f1793p0 != -9223372036854775807L) {
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f1794q0;
                if (i11 < arrayList.size()) {
                    ((C0203d) arrayList.get(i11)).b(null);
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public final void h() {
        if (this.f1798u0 != null && this.f1797t0 == 0 && this.f1794q0.isEmpty() && this.f1795r0.isEmpty()) {
            y yVar = this.f1798u0;
            yVar.getClass();
            yVar.release();
            this.f1798u0 = null;
        }
    }

    public final void i(boolean z10) {
        if (z10 && this.f1801x0 == null) {
            s2.p.h("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f1801x0;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            s2.p.h("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f1801x0.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // B2.q
    public final void release() {
        i(true);
        int i10 = this.f1797t0 - 1;
        this.f1797t0 = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f1793p0 != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f1794q0);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((C0203d) arrayList.get(i11)).c(null);
            }
        }
        com.google.android.gms.internal.play_billing.C it = S.V(this.f1795r0).iterator();
        while (it.hasNext()) {
            ((C0206g) it.next()).release();
        }
        h();
    }
}
