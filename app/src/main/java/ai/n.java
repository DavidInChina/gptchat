package ai;

import Wh.C1656a;
import id.AbstractC3557B;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b  reason: collision with root package name */
    public final long f24295b;

    /* renamed from: c  reason: collision with root package name */
    public final Zh.c f24296c;

    /* renamed from: a  reason: collision with root package name */
    public final int f24294a = 5;

    /* renamed from: d  reason: collision with root package name */
    public final Zh.b f24297d = new Zh.b(this, R.a.t(new StringBuilder(), Xh.b.f22002g, " ConnectionPool"));

    /* renamed from: e  reason: collision with root package name */
    public final ConcurrentLinkedQueue f24298e = new ConcurrentLinkedQueue();

    public n(Zh.f fVar, TimeUnit timeUnit) {
        AbstractC3557B.c0("taskRunner", fVar);
        AbstractC3557B.c0("timeUnit", timeUnit);
        this.f24295b = timeUnit.toNanos(5L);
        this.f24296c = fVar.f();
    }

    public final boolean a(C1656a c1656a, j jVar, List list, boolean z10) {
        AbstractC3557B.c0("address", c1656a);
        AbstractC3557B.c0("call", jVar);
        Iterator it = this.f24298e.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            AbstractC3557B.b0("connection", mVar);
            synchronized (mVar) {
                if (z10) {
                    if (mVar.f24283g == null) {
                        continue;
                    }
                }
                if (mVar.i(c1656a, list)) {
                    jVar.b(mVar);
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(m mVar, long j6) {
        byte[] bArr = Xh.b.f21996a;
        ArrayList arrayList = mVar.f24292p;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                ei.m mVar2 = ei.m.f29511a;
                ei.m.f29511a.k("A connection to " + mVar.f24278b.f21148a.f21166i + " was leaked. Did you forget to close a response body?", ((h) reference).f24253a);
                arrayList.remove(i10);
                mVar.f24286j = true;
                if (arrayList.isEmpty()) {
                    mVar.f24293q = j6 - this.f24295b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
