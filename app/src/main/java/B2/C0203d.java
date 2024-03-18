package B2;

import E2.C0484p;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import g.RunnableC3111d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p2.AbstractC5058k;
import s2.AbstractC5530A;
import s2.C5536f;
import x2.AbstractC6267b;
import z2.C6755D;

/* renamed from: B2.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0203d implements k {

    /* renamed from: a  reason: collision with root package name */
    public final List f1750a;

    /* renamed from: b  reason: collision with root package name */
    public final y f1751b;

    /* renamed from: c  reason: collision with root package name */
    public final U3.u f1752c;

    /* renamed from: d  reason: collision with root package name */
    public final F4.a f1753d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1754e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1755f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1756g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f1757h;

    /* renamed from: i  reason: collision with root package name */
    public final C5536f f1758i;

    /* renamed from: j  reason: collision with root package name */
    public final R4.a f1759j;

    /* renamed from: k  reason: collision with root package name */
    public final C6755D f1760k;

    /* renamed from: l  reason: collision with root package name */
    public final E f1761l;

    /* renamed from: m  reason: collision with root package name */
    public final UUID f1762m;

    /* renamed from: n  reason: collision with root package name */
    public final Looper f1763n;

    /* renamed from: o  reason: collision with root package name */
    public final HandlerC0202c f1764o;

    /* renamed from: p  reason: collision with root package name */
    public int f1765p;

    /* renamed from: q  reason: collision with root package name */
    public int f1766q;

    /* renamed from: r  reason: collision with root package name */
    public HandlerThread f1767r;

    /* renamed from: s  reason: collision with root package name */
    public HandlerC0200a f1768s;

    /* renamed from: t  reason: collision with root package name */
    public AbstractC6267b f1769t;

    /* renamed from: u  reason: collision with root package name */
    public j f1770u;

    /* renamed from: v  reason: collision with root package name */
    public byte[] f1771v;

    /* renamed from: w  reason: collision with root package name */
    public byte[] f1772w;

    /* renamed from: x  reason: collision with root package name */
    public w f1773x;

    /* renamed from: y  reason: collision with root package name */
    public x f1774y;

    public C0203d(UUID uuid, y yVar, U3.u uVar, F4.a aVar, List list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, E e10, Looper looper, R4.a aVar2, C6755D c6755d) {
        if (i10 == 1 || i10 == 3) {
            bArr.getClass();
        }
        this.f1762m = uuid;
        this.f1752c = uVar;
        this.f1753d = aVar;
        this.f1751b = yVar;
        this.f1754e = i10;
        this.f1755f = z10;
        this.f1756g = z11;
        if (bArr != null) {
            this.f1772w = bArr;
            this.f1750a = null;
        } else {
            list.getClass();
            this.f1750a = Collections.unmodifiableList(list);
        }
        this.f1757h = hashMap;
        this.f1761l = e10;
        this.f1758i = new C5536f();
        this.f1759j = aVar2;
        this.f1760k = c6755d;
        this.f1765p = 2;
        this.f1763n = looper;
        this.f1764o = new HandlerC0202c(this, looper);
    }

    @Override // B2.k
    public final UUID a() {
        o();
        return this.f1762m;
    }

    @Override // B2.k
    public final void b(n nVar) {
        int i10;
        o();
        boolean z10 = false;
        if (this.f1766q < 0) {
            s2.p.c("DefaultDrmSession", "Session reference count less than zero: " + this.f1766q);
            this.f1766q = 0;
        }
        if (nVar != null) {
            C5536f c5536f = this.f1758i;
            synchronized (c5536f.f45153Y) {
                try {
                    ArrayList arrayList = new ArrayList(c5536f.f45156i0);
                    arrayList.add(nVar);
                    c5536f.f45156i0 = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) c5536f.f45154Z.get(nVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(c5536f.f45155h0);
                        hashSet.add(nVar);
                        c5536f.f45155h0 = Collections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = c5536f.f45154Z;
                    if (num != null) {
                        i10 = num.intValue() + 1;
                    } else {
                        i10 = 1;
                    }
                    hashMap.put(nVar, Integer.valueOf(i10));
                } finally {
                }
            }
        }
        int i11 = this.f1766q + 1;
        this.f1766q = i11;
        if (i11 == 1) {
            if (this.f1765p == 2) {
                z10 = true;
            }
            Gi.e.n(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f1767r = handlerThread;
            handlerThread.start();
            this.f1768s = new HandlerC0200a(this, this.f1767r.getLooper());
            if (l()) {
                h(true);
            }
        } else if (nVar != null && i() && this.f1758i.f(nVar) == 1) {
            nVar.d(this.f1765p);
        }
        F4.a aVar = this.f1753d;
        C0207h c0207h = (C0207h) aVar.f5033Z;
        if (c0207h.f1793p0 != -9223372036854775807L) {
            c0207h.f1796s0.remove(this);
            Handler handler = ((C0207h) aVar.f5033Z).f1802y0;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // B2.k
    public final void c(n nVar) {
        o();
        int i10 = this.f1766q;
        if (i10 <= 0) {
            s2.p.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f1766q = i11;
        if (i11 == 0) {
            this.f1765p = 0;
            HandlerC0202c handlerC0202c = this.f1764o;
            int i12 = AbstractC5530A.f45131a;
            handlerC0202c.removeCallbacksAndMessages(null);
            HandlerC0200a handlerC0200a = this.f1768s;
            synchronized (handlerC0200a) {
                handlerC0200a.removeCallbacksAndMessages(null);
                handlerC0200a.f1743a = true;
            }
            this.f1768s = null;
            this.f1767r.quit();
            this.f1767r = null;
            this.f1769t = null;
            this.f1770u = null;
            this.f1773x = null;
            this.f1774y = null;
            byte[] bArr = this.f1771v;
            if (bArr != null) {
                this.f1751b.k(bArr);
                this.f1771v = null;
            }
        }
        if (nVar != null) {
            this.f1758i.r(nVar);
            if (this.f1758i.f(nVar) == 0) {
                nVar.f();
            }
        }
        F4.a aVar = this.f1753d;
        int i13 = this.f1766q;
        if (i13 == 1) {
            C0207h c0207h = (C0207h) aVar.f5033Z;
            if (c0207h.f1797t0 > 0 && c0207h.f1793p0 != -9223372036854775807L) {
                c0207h.f1796s0.add(this);
                Handler handler = ((C0207h) aVar.f5033Z).f1802y0;
                handler.getClass();
                handler.postAtTime(new RunnableC3111d(16, this), this, SystemClock.uptimeMillis() + ((C0207h) aVar.f5033Z).f1793p0);
                ((C0207h) aVar.f5033Z).h();
            }
        }
        if (i13 == 0) {
            ((C0207h) aVar.f5033Z).f1794q0.remove(this);
            C0207h c0207h2 = (C0207h) aVar.f5033Z;
            if (c0207h2.f1799v0 == this) {
                c0207h2.f1799v0 = null;
            }
            if (c0207h2.f1800w0 == this) {
                c0207h2.f1800w0 = null;
            }
            U3.u uVar = c0207h2.f1790m0;
            ((Set) uVar.f17492Z).remove(this);
            if (((C0203d) uVar.f17493h0) == this) {
                uVar.f17493h0 = null;
                if (!((Set) uVar.f17492Z).isEmpty()) {
                    C0203d c0203d = (C0203d) ((Set) uVar.f17492Z).iterator().next();
                    uVar.f17493h0 = c0203d;
                    x e10 = c0203d.f1751b.e();
                    c0203d.f1774y = e10;
                    HandlerC0200a handlerC0200a2 = c0203d.f1768s;
                    int i14 = AbstractC5530A.f45131a;
                    e10.getClass();
                    handlerC0200a2.getClass();
                    handlerC0200a2.obtainMessage(0, new C0201b(C0484p.f4392b.getAndIncrement(), true, SystemClock.elapsedRealtime(), e10)).sendToTarget();
                }
            }
            C0207h c0207h3 = (C0207h) aVar.f5033Z;
            if (c0207h3.f1793p0 != -9223372036854775807L) {
                Handler handler2 = c0207h3.f1802y0;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                ((C0207h) aVar.f5033Z).f1796s0.remove(this);
            }
        }
        ((C0207h) aVar.f5033Z).h();
    }

    @Override // B2.k
    public final boolean d() {
        o();
        return this.f1755f;
    }

    @Override // B2.k
    public final boolean e(String str) {
        o();
        byte[] bArr = this.f1771v;
        Gi.e.o(bArr);
        return this.f1751b.r(str, bArr);
    }

    @Override // B2.k
    public final j f() {
        o();
        if (this.f1765p == 1) {
            return this.f1770u;
        }
        return null;
    }

    @Override // B2.k
    public final AbstractC6267b g() {
        o();
        return this.f1769t;
    }

    @Override // B2.k
    public final int getState() {
        o();
        return this.f1765p;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:32|65|33|(6:35|37|69|38|(1:40)|41)|36|37|69|38|(0)|41) */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095 A[Catch: NumberFormatException -> 0x0099, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0099, blocks: (B:38:0x008d, B:40:0x0095), top: B:69:0x008d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(boolean z10) {
        long j6;
        Set<n> set;
        Pair pair;
        long j10;
        String str;
        String str2;
        if (this.f1756g) {
            return;
        }
        byte[] bArr = this.f1771v;
        int i10 = AbstractC5530A.f45131a;
        int i11 = this.f1754e;
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    this.f1772w.getClass();
                    this.f1771v.getClass();
                    m(this.f1772w, z10, 3);
                    return;
                }
                return;
            }
            byte[] bArr2 = this.f1772w;
            if (bArr2 != null) {
                try {
                    this.f1751b.j(bArr, bArr2);
                } catch (Exception e10) {
                    j(1, e10);
                    return;
                }
            }
            m(bArr, z10, 2);
            return;
        }
        byte[] bArr3 = this.f1772w;
        if (bArr3 == null) {
            m(bArr, z10, 1);
            return;
        }
        if (this.f1765p != 4) {
            try {
                this.f1751b.j(bArr, bArr3);
            } catch (Exception e11) {
                j(1, e11);
                return;
            }
        }
        if (!AbstractC5058k.f42087d.equals(this.f1762m)) {
            j6 = Long.MAX_VALUE;
        } else {
            Map n10 = n();
            if (n10 == null) {
                pair = null;
            } else {
                long j11 = -9223372036854775807L;
                try {
                    str2 = (String) n10.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                if (str2 != null) {
                    j10 = Long.parseLong(str2);
                    Long valueOf = Long.valueOf(j10);
                    str = (String) n10.get("PlaybackDurationRemaining");
                    if (str != null) {
                        j11 = Long.parseLong(str);
                    }
                    pair = new Pair(valueOf, Long.valueOf(j11));
                }
                j10 = -9223372036854775807L;
                Long valueOf2 = Long.valueOf(j10);
                str = (String) n10.get("PlaybackDurationRemaining");
                if (str != null) {
                }
                pair = new Pair(valueOf2, Long.valueOf(j11));
            }
            pair.getClass();
            j6 = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        }
        if (this.f1754e == 0 && j6 <= 60) {
            s2.p.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + j6);
            m(bArr, z10, 2);
        } else if (j6 <= 0) {
            j(2, new Exception());
        } else {
            this.f1765p = 4;
            C5536f c5536f = this.f1758i;
            synchronized (c5536f.f45153Y) {
                set = c5536f.f45155h0;
            }
            for (n nVar : set) {
                nVar.c();
            }
        }
    }

    public final boolean i() {
        int i10 = this.f1765p;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void j(int i10, Exception exc) {
        int i11;
        Set<n> set;
        int i12 = AbstractC5530A.f45131a;
        if (i12 >= 21 && s.a(exc)) {
            i11 = s.b(exc);
        } else {
            if (i12 < 23 || !t.a(exc)) {
                if (i12 < 18 || !r.c(exc)) {
                    if (i12 >= 18 && r.a(exc)) {
                        i11 = 6007;
                    } else if (exc instanceof H) {
                        i11 = 6001;
                    } else if (i12 >= 18 && r.b(exc)) {
                        i11 = 6003;
                    } else if (exc instanceof F) {
                        i11 = 6008;
                    } else if (i10 != 1) {
                        if (i10 == 2) {
                            i11 = 6004;
                        } else if (i10 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i11 = 6002;
            }
            i11 = 6006;
        }
        this.f1770u = new j(i11, exc);
        s2.p.d("DefaultDrmSession", "DRM session error", exc);
        C5536f c5536f = this.f1758i;
        synchronized (c5536f.f45153Y) {
            set = c5536f.f45155h0;
        }
        for (n nVar : set) {
            nVar.e(exc);
        }
        if (this.f1765p != 4) {
            this.f1765p = 1;
        }
    }

    public final void k(Exception exc, boolean z10) {
        int i10;
        if (exc instanceof NotProvisionedException) {
            U3.u uVar = this.f1752c;
            ((Set) uVar.f17492Z).add(this);
            if (((C0203d) uVar.f17493h0) == null) {
                uVar.f17493h0 = this;
                x e10 = this.f1751b.e();
                this.f1774y = e10;
                HandlerC0200a handlerC0200a = this.f1768s;
                int i11 = AbstractC5530A.f45131a;
                e10.getClass();
                handlerC0200a.getClass();
                handlerC0200a.obtainMessage(0, new C0201b(C0484p.f4392b.getAndIncrement(), true, SystemClock.elapsedRealtime(), e10)).sendToTarget();
                return;
            }
            return;
        }
        if (z10) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        j(i10, exc);
    }

    public final boolean l() {
        Set<n> set;
        if (i()) {
            return true;
        }
        try {
            byte[] i10 = this.f1751b.i();
            this.f1771v = i10;
            this.f1751b.c(i10, this.f1760k);
            this.f1769t = this.f1751b.g(this.f1771v);
            this.f1765p = 3;
            C5536f c5536f = this.f1758i;
            synchronized (c5536f.f45153Y) {
                set = c5536f.f45155h0;
            }
            for (n nVar : set) {
                nVar.d(3);
            }
            this.f1771v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            U3.u uVar = this.f1752c;
            ((Set) uVar.f17492Z).add(this);
            if (((C0203d) uVar.f17493h0) == null) {
                uVar.f17493h0 = this;
                x e10 = this.f1751b.e();
                this.f1774y = e10;
                HandlerC0200a handlerC0200a = this.f1768s;
                int i11 = AbstractC5530A.f45131a;
                e10.getClass();
                handlerC0200a.getClass();
                handlerC0200a.obtainMessage(0, new C0201b(C0484p.f4392b.getAndIncrement(), true, SystemClock.elapsedRealtime(), e10)).sendToTarget();
            }
            return false;
        } catch (Exception e11) {
            j(1, e11);
            return false;
        }
    }

    public final void m(byte[] bArr, boolean z10, int i10) {
        try {
            w o10 = this.f1751b.o(bArr, this.f1750a, i10, this.f1757h);
            this.f1773x = o10;
            HandlerC0200a handlerC0200a = this.f1768s;
            int i11 = AbstractC5530A.f45131a;
            o10.getClass();
            handlerC0200a.getClass();
            handlerC0200a.obtainMessage(1, new C0201b(C0484p.f4392b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), o10)).sendToTarget();
        } catch (Exception e10) {
            k(e10, true);
        }
    }

    public final Map n() {
        o();
        byte[] bArr = this.f1771v;
        if (bArr == null) {
            return null;
        }
        return this.f1751b.b(bArr);
    }

    public final void o() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f1763n;
        if (currentThread != looper.getThread()) {
            s2.p.h("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
