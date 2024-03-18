package j0;

import Z.AbstractC1734s;
import b0.C2104h;
import id.AbstractC3557B;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import w.C6077x;
import wf.AbstractC6216a;
import y.C6473k;

/* renamed from: j0.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3876A {

    /* renamed from: a  reason: collision with root package name */
    public final wf.k f35826a;

    /* renamed from: c  reason: collision with root package name */
    public boolean f35828c;

    /* renamed from: g  reason: collision with root package name */
    public C3892h f35832g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f35833h;

    /* renamed from: i  reason: collision with root package name */
    public z f35834i;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference f35827b = new AtomicReference(null);

    /* renamed from: d  reason: collision with root package name */
    public final C6473k f35829d = new C6473k(11, this);

    /* renamed from: e  reason: collision with root package name */
    public final C6077x f35830e = new C6077x(23, this);

    /* renamed from: f  reason: collision with root package name */
    public final C2104h f35831f = new C2104h(new z[16]);

    /* renamed from: j  reason: collision with root package name */
    public long f35835j = -1;

    public C3876A(wf.k kVar) {
        this.f35826a = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(C3876A c3876a) {
        boolean z10;
        Set set;
        synchronized (c3876a.f35831f) {
            z10 = c3876a.f35828c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            AtomicReference atomicReference = c3876a.f35827b;
            Object obj = atomicReference.get();
            Set set2 = null;
            r4 = null;
            List list = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else if (obj instanceof List) {
                    List list2 = (List) obj;
                    set = (Set) list2.get(0);
                    if (list2.size() == 2) {
                        list = list2.get(1);
                    } else if (list2.size() > 2) {
                        list = list2.subList(1, list2.size());
                    }
                } else {
                    AbstractC1734s.j("Unexpected notification");
                    throw null;
                }
                List list3 = list;
                while (!atomicReference.compareAndSet(obj, list3)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set2 = set;
            }
            if (set2 == null) {
                return z11;
            }
            synchronized (c3876a.f35831f) {
                C2104h c2104h = c3876a.f35831f;
                int i10 = c2104h.f25569h0;
                if (i10 > 0) {
                    Object[] objArr = c2104h.f25567Y;
                    int i11 = 0;
                    do {
                        if (!((z) objArr[i11]).b(set2) && !z11) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        i11++;
                    } while (i11 < i10);
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f35831f) {
            C2104h c2104h = this.f35831f;
            int i10 = c2104h.f25569h0;
            if (i10 > 0) {
                Object[] objArr = c2104h.f25567Y;
                int i11 = 0;
                do {
                    z zVar = (z) objArr[i11];
                    zVar.f35946e.f25570a.a();
                    zVar.f35947f.a();
                    zVar.f35952k.f25570a.a();
                    zVar.f35953l.clear();
                    i11++;
                } while (i11 < i10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void c(Object obj, wf.k kVar, AbstractC6216a abstractC6216a) {
        z zVar;
        z zVar2;
        synchronized (this.f35831f) {
            C2104h c2104h = this.f35831f;
            int i10 = c2104h.f25569h0;
            if (i10 > 0) {
                ?? r42 = c2104h.f25567Y;
                int i11 = 0;
                do {
                    ?? r62 = r42[i11];
                    if (((z) r62).f35942a == kVar) {
                        zVar = r62;
                        break;
                    }
                    i11++;
                } while (i11 < i10);
                zVar = null;
            } else {
                zVar = null;
            }
            zVar2 = zVar;
            if (zVar2 == null) {
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>", kVar);
                Ad.l.M(1, kVar);
                zVar2 = new z(kVar);
                c2104h.b(zVar2);
            }
        }
        boolean z10 = this.f35833h;
        z zVar3 = this.f35834i;
        long j6 = this.f35835j;
        if (j6 != -1 && j6 != Thread.currentThread().getId()) {
            throw new IllegalArgumentException(("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j6 + "), currentThread={id=" + Thread.currentThread().getId() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.").toString());
        }
        try {
            this.f35833h = false;
            this.f35834i = zVar2;
            this.f35835j = Thread.currentThread().getId();
            zVar2.a(obj, this.f35830e, abstractC6216a);
        } finally {
            this.f35834i = zVar3;
            this.f35833h = z10;
            this.f35835j = j6;
        }
    }
}
