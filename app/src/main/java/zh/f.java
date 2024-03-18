package Zh;

import com.statsig.androidsdk.ErrorBoundaryKt;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;
import jh.L1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: h  reason: collision with root package name */
    public static final L1 f23775h = new L1(18, 0);

    /* renamed from: i  reason: collision with root package name */
    public static final f f23776i;

    /* renamed from: j  reason: collision with root package name */
    public static final Logger f23777j;

    /* renamed from: a  reason: collision with root package name */
    public final d f23778a;

    /* renamed from: c  reason: collision with root package name */
    public boolean f23780c;

    /* renamed from: d  reason: collision with root package name */
    public long f23781d;

    /* renamed from: b  reason: collision with root package name */
    public int f23779b = ErrorBoundaryKt.SAMPLING_RATE;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f23782e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f23783f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final e f23784g = new e(this);

    static {
        String str = Xh.b.f22002g + " TaskRunner";
        AbstractC3557B.c0("name", str);
        f23776i = new f(new d(new Xh.a(str, true)));
        Logger logger = Logger.getLogger(f.class.getName());
        AbstractC3557B.b0("getLogger(TaskRunner::class.java.name)", logger);
        f23777j = logger;
    }

    public f(d dVar) {
        this.f23778a = dVar;
    }

    public static final void a(f fVar, a aVar) {
        fVar.getClass();
        byte[] bArr = Xh.b.f21996a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f23761a);
        try {
            long a5 = aVar.a();
            synchronized (fVar) {
                fVar.b(aVar, a5);
            }
            currentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (fVar) {
                fVar.b(aVar, -1L);
                currentThread.setName(name);
                throw th2;
            }
        }
    }

    public final void b(a aVar, long j6) {
        byte[] bArr = Xh.b.f21996a;
        c cVar = aVar.f23763c;
        AbstractC3557B.Z(cVar);
        if (cVar.f23770d == aVar) {
            boolean z10 = cVar.f23772f;
            cVar.f23772f = false;
            cVar.f23770d = null;
            this.f23782e.remove(cVar);
            if (j6 != -1 && !z10 && !cVar.f23769c) {
                cVar.d(aVar, j6, true);
            }
            if (!cVar.f23771e.isEmpty()) {
                this.f23783f.add(cVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final a c() {
        boolean z10;
        byte[] bArr = Xh.b.f21996a;
        while (true) {
            ArrayList arrayList = this.f23783f;
            if (arrayList.isEmpty()) {
                return null;
            }
            d dVar = this.f23778a;
            dVar.getClass();
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j6 = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (it.hasNext()) {
                    a aVar2 = (a) ((c) it.next()).f23771e.get(0);
                    long max = Math.max(0L, aVar2.f23764d - nanoTime);
                    if (max > 0) {
                        j6 = Math.min(max, j6);
                    } else if (aVar != null) {
                        z10 = true;
                        break;
                    } else {
                        aVar = aVar2;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (aVar != null) {
                byte[] bArr2 = Xh.b.f21996a;
                aVar.f23764d = -1L;
                c cVar = aVar.f23763c;
                AbstractC3557B.Z(cVar);
                cVar.f23771e.remove(aVar);
                arrayList.remove(cVar);
                cVar.f23770d = aVar;
                this.f23782e.add(cVar);
                if (z10 || (!this.f23780c && (!arrayList.isEmpty()))) {
                    e eVar = this.f23784g;
                    AbstractC3557B.c0("runnable", eVar);
                    dVar.f23773a.execute(eVar);
                }
                return aVar;
            } else if (this.f23780c) {
                if (j6 < this.f23781d - nanoTime) {
                    notify();
                }
                return null;
            } else {
                this.f23780c = true;
                this.f23781d = nanoTime + j6;
                try {
                    try {
                        long j10 = j6 / 1000000;
                        Long.signum(j10);
                        long j11 = j6 - (1000000 * j10);
                        if (j10 > 0 || j6 > 0) {
                            wait(j10, (int) j11);
                        }
                    } catch (InterruptedException unused) {
                        d();
                    }
                    this.f23780c = false;
                } catch (Throwable th2) {
                    this.f23780c = false;
                    throw th2;
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f23782e;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            ((c) arrayList.get(size)).b();
        }
        ArrayList arrayList2 = this.f23783f;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            c cVar = (c) arrayList2.get(size2);
            cVar.b();
            if (cVar.f23771e.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
    }

    public final void e(c cVar) {
        AbstractC3557B.c0("taskQueue", cVar);
        byte[] bArr = Xh.b.f21996a;
        if (cVar.f23770d == null) {
            boolean z10 = !cVar.f23771e.isEmpty();
            ArrayList arrayList = this.f23783f;
            if (z10) {
                AbstractC3557B.c0("<this>", arrayList);
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            } else {
                arrayList.remove(cVar);
            }
        }
        boolean z11 = this.f23780c;
        d dVar = this.f23778a;
        if (z11) {
            dVar.getClass();
            notify();
            return;
        }
        dVar.getClass();
        e eVar = this.f23784g;
        AbstractC3557B.c0("runnable", eVar);
        dVar.f23773a.execute(eVar);
    }

    public final c f() {
        int i10;
        synchronized (this) {
            i10 = this.f23779b;
            this.f23779b = i10 + 1;
        }
        return new c(this, android.gov.nist.core.a.e("Q", i10));
    }
}
