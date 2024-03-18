package g3;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* renamed from: g3.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3161d implements AbstractC3163f, x2.e {

    /* renamed from: a  reason: collision with root package name */
    public final x2.j f31170a;

    /* renamed from: f  reason: collision with root package name */
    public final x2.i[] f31175f;

    /* renamed from: h  reason: collision with root package name */
    public int f31177h;

    /* renamed from: i  reason: collision with root package name */
    public x2.h f31178i;

    /* renamed from: j  reason: collision with root package name */
    public C3164g f31179j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f31180k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f31181l;

    /* renamed from: b  reason: collision with root package name */
    public final Object f31171b = new Object();

    /* renamed from: m  reason: collision with root package name */
    public final long f31182m = -9223372036854775807L;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque f31172c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f31173d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public final x2.h[] f31174e = new C3167j[2];

    /* renamed from: g  reason: collision with root package name */
    public int f31176g = 2;

    public AbstractC3161d() {
        boolean z10;
        AbstractC3168k[] abstractC3168kArr = new AbstractC3168k[2];
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= this.f31176g) {
                break;
            }
            this.f31174e[i10] = new x2.h(1);
            i10++;
        }
        this.f31175f = abstractC3168kArr;
        this.f31177h = 2;
        for (int i11 = 0; i11 < this.f31177h; i11++) {
            this.f31175f[i11] = new C3160c(this);
        }
        x2.j jVar = new x2.j(this);
        this.f31170a = jVar;
        jVar.start();
        int i12 = this.f31176g;
        x2.h[] hVarArr = this.f31174e;
        Gi.e.n(i12 != hVarArr.length ? false : z10);
        for (x2.h hVar : hVarArr) {
            hVar.k(1024);
        }
    }

    @Override // x2.e
    public final Object b() {
        synchronized (this.f31171b) {
            try {
                C3164g c3164g = this.f31179j;
                if (c3164g == null) {
                    if (this.f31173d.isEmpty()) {
                        return null;
                    }
                    return (x2.i) this.f31173d.removeFirst();
                }
                throw c3164g;
            } finally {
            }
        }
    }

    @Override // x2.e
    public final Object c() {
        boolean z10;
        x2.h hVar;
        synchronized (this.f31171b) {
            try {
                C3164g c3164g = this.f31179j;
                if (c3164g == null) {
                    if (this.f31178i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Gi.e.n(z10);
                    int i10 = this.f31176g;
                    if (i10 == 0) {
                        hVar = null;
                    } else {
                        x2.h[] hVarArr = this.f31174e;
                        int i11 = i10 - 1;
                        this.f31176g = i11;
                        hVar = hVarArr[i11];
                    }
                    this.f31178i = hVar;
                } else {
                    throw c3164g;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    @Override // x2.e
    public final void d(C3167j c3167j) {
        boolean z10;
        synchronized (this.f31171b) {
            try {
                C3164g c3164g = this.f31179j;
                if (c3164g == null) {
                    if (c3167j == this.f31178i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Gi.e.l(z10);
                    this.f31172c.addLast(c3167j);
                    if (!this.f31172c.isEmpty() && this.f31177h > 0) {
                        this.f31171b.notify();
                    }
                    this.f31178i = null;
                } else {
                    throw c3164g;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final C3164g e(x2.h hVar, x2.i iVar, boolean z10) {
        C3167j c3167j = (C3167j) hVar;
        AbstractC3168k abstractC3168k = (AbstractC3168k) iVar;
        try {
            ByteBuffer byteBuffer = c3167j.f48641j0;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            AbstractC3170m abstractC3170m = ((G2.b) this).f5854n;
            if (z10) {
                abstractC3170m.b();
            }
            AbstractC3162e e10 = abstractC3170m.e(array, 0, limit);
            long j6 = c3167j.f48643l0;
            long j10 = c3167j.f31184p0;
            abstractC3168k.f48647h0 = j6;
            abstractC3168k.f31185i0 = e10;
            if (j10 != Long.MAX_VALUE) {
                j6 = j10;
            }
            abstractC3168k.f31186j0 = j6;
            abstractC3168k.f48626Z &= Integer.MAX_VALUE;
            return null;
        } catch (C3164g e11) {
            return e11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Exception] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f() {
        C3164g c3164g;
        C3164g c3164g2;
        synchronized (this.f31171b) {
            while (!this.f31181l && (this.f31172c.isEmpty() || this.f31177h <= 0)) {
                try {
                    this.f31171b.wait();
                } finally {
                }
            }
            if (this.f31181l) {
                return false;
            }
            x2.h hVar = (x2.h) this.f31172c.removeFirst();
            x2.i[] iVarArr = this.f31175f;
            int i10 = this.f31177h - 1;
            this.f31177h = i10;
            x2.i iVar = iVarArr[i10];
            boolean z10 = this.f31180k;
            this.f31180k = false;
            if (hVar.g(4)) {
                iVar.e(4);
            } else {
                long j6 = hVar.f48643l0;
                iVar.f48647h0 = j6;
                if (!g(j6) || hVar.g(Integer.MIN_VALUE)) {
                    iVar.e(Integer.MIN_VALUE);
                }
                if (hVar.g(134217728)) {
                    iVar.e(134217728);
                }
                try {
                    c3164g = e(hVar, iVar, z10);
                } catch (OutOfMemoryError e10) {
                    c3164g2 = new Exception("Unexpected decode error", e10);
                    c3164g = c3164g2;
                    if (c3164g != null) {
                    }
                    synchronized (this.f31171b) {
                    }
                } catch (RuntimeException e11) {
                    c3164g2 = new Exception("Unexpected decode error", e11);
                    c3164g = c3164g2;
                    if (c3164g != null) {
                    }
                    synchronized (this.f31171b) {
                    }
                }
                if (c3164g != null) {
                    synchronized (this.f31171b) {
                        this.f31179j = c3164g;
                    }
                    return false;
                }
            }
            synchronized (this.f31171b) {
                try {
                    if (this.f31180k) {
                        iVar.i();
                    } else if ((iVar.g(4) || g(iVar.f48647h0)) && !iVar.g(Integer.MIN_VALUE)) {
                        this.f31173d.addLast(iVar);
                    } else {
                        iVar.i();
                    }
                    hVar.i();
                    int i11 = this.f31176g;
                    this.f31176g = i11 + 1;
                    this.f31174e[i11] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // x2.e
    public final void flush() {
        synchronized (this.f31171b) {
            try {
                this.f31180k = true;
                x2.h hVar = this.f31178i;
                if (hVar != null) {
                    hVar.i();
                    int i10 = this.f31176g;
                    this.f31176g = i10 + 1;
                    this.f31174e[i10] = hVar;
                    this.f31178i = null;
                }
                while (!this.f31172c.isEmpty()) {
                    x2.h hVar2 = (x2.h) this.f31172c.removeFirst();
                    hVar2.i();
                    int i11 = this.f31176g;
                    this.f31176g = i11 + 1;
                    this.f31174e[i11] = hVar2;
                }
                while (!this.f31173d.isEmpty()) {
                    ((x2.i) this.f31173d.removeFirst()).i();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean g(long j6) {
        boolean z10;
        synchronized (this.f31171b) {
            long j10 = this.f31182m;
            if (j10 != -9223372036854775807L && j6 < j10) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // x2.e
    public final void release() {
        synchronized (this.f31171b) {
            this.f31181l = true;
            this.f31171b.notify();
        }
        try {
            this.f31170a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // g3.AbstractC3163f
    public final void a(long j6) {
    }
}
