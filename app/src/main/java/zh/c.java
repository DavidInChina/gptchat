package Zh;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import jh.L1;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final f f23767a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23768b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f23769c;

    /* renamed from: d  reason: collision with root package name */
    public a f23770d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f23771e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public boolean f23772f;

    public c(f fVar, String str) {
        AbstractC3557B.c0("taskRunner", fVar);
        AbstractC3557B.c0("name", str);
        this.f23767a = fVar;
        this.f23768b = str;
    }

    public final void a() {
        byte[] bArr = Xh.b.f21996a;
        synchronized (this.f23767a) {
            if (b()) {
                this.f23767a.e(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f23770d;
        if (aVar != null && aVar.f23762b) {
            this.f23772f = true;
        }
        ArrayList arrayList = this.f23771e;
        boolean z10 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f23762b) {
                a aVar2 = (a) arrayList.get(size);
                L1 l12 = f.f23775h;
                if (f.f23777j.isLoggable(Level.FINE)) {
                    L4.a.U(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void c(a aVar, long j6) {
        AbstractC3557B.c0("task", aVar);
        synchronized (this.f23767a) {
            if (this.f23769c) {
                if (aVar.f23762b) {
                    f.f23775h.getClass();
                    if (f.f23777j.isLoggable(Level.FINE)) {
                        L4.a.U(aVar, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                f.f23775h.getClass();
                if (f.f23777j.isLoggable(Level.FINE)) {
                    L4.a.U(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if (d(aVar, j6, false)) {
                this.f23767a.e(this);
            }
        }
    }

    public final boolean d(a aVar, long j6, boolean z10) {
        String str;
        AbstractC3557B.c0("task", aVar);
        c cVar = aVar.f23763c;
        if (cVar != this) {
            if (cVar == null) {
                aVar.f23763c = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        this.f23767a.f23778a.getClass();
        long nanoTime = System.nanoTime();
        long j10 = nanoTime + j6;
        ArrayList arrayList = this.f23771e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f23764d <= j10) {
                L1 l12 = f.f23775h;
                if (f.f23777j.isLoggable(Level.FINE)) {
                    L4.a.U(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.f23764d = j10;
        L1 l13 = f.f23775h;
        if (f.f23777j.isLoggable(Level.FINE)) {
            if (z10) {
                str = "run again after ".concat(L4.a.s0(j10 - nanoTime));
            } else {
                str = "scheduled after ".concat(L4.a.s0(j10 - nanoTime));
            }
            L4.a.U(aVar, this, str);
        }
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((a) it.next()).f23764d - nanoTime > j6) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            i10 = arrayList.size();
        }
        arrayList.add(i10, aVar);
        if (i10 != 0) {
            return false;
        }
        return true;
    }

    public final void e() {
        byte[] bArr = Xh.b.f21996a;
        synchronized (this.f23767a) {
            this.f23769c = true;
            if (b()) {
                this.f23767a.e(this);
            }
        }
    }

    public final String toString() {
        return this.f23768b;
    }
}
