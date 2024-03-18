package androidx.lifecycle;

import android.os.Looper;
import g.RunnableC3118k;
import java.util.Map;
import n2.C4711b;

/* loaded from: classes2.dex */
public class E {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f25291k = new Object();

    /* renamed from: d  reason: collision with root package name */
    public boolean f25295d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f25296e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f25297f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f25299h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f25300i;

    /* renamed from: a  reason: collision with root package name */
    public final Object f25292a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final s.g f25293b = new s.g();

    /* renamed from: c  reason: collision with root package name */
    public int f25294c = 0;

    /* renamed from: j  reason: collision with root package name */
    public final RunnableC3118k f25301j = new RunnableC3118k(9, this);

    /* renamed from: g  reason: collision with root package name */
    public int f25298g = -1;

    public E() {
        Object obj = f25291k;
        this.f25297f = obj;
        this.f25296e = obj;
    }

    public static void a(String str) {
        r.b.d0().f44150f.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException(android.gov.nist.core.a.A("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(C c10) {
        if (c10.f25286Z) {
            if (!c10.e()) {
                c10.a(false);
                return;
            }
            int i10 = c10.f25287h0;
            int i11 = this.f25298g;
            if (i10 < i11) {
                c10.f25287h0 = i11;
                c10.f25285Y.B(this.f25296e);
            }
        }
    }

    public final void c(C c10) {
        if (this.f25299h) {
            this.f25300i = true;
            return;
        }
        this.f25299h = true;
        do {
            this.f25300i = false;
            if (c10 != null) {
                b(c10);
                c10 = null;
            } else {
                s.g gVar = this.f25293b;
                gVar.getClass();
                s.d dVar = new s.d(gVar);
                gVar.f45014h0.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((C) ((Map.Entry) dVar.next()).getValue());
                    if (this.f25300i) {
                        break;
                    }
                }
            }
        } while (this.f25300i);
        this.f25299h = false;
    }

    public final void d(AbstractC2086v abstractC2086v, C4711b c4711b) {
        Object obj;
        a("observe");
        if (abstractC2086v.h().f() != EnumC2082q.f25375Y) {
            B b10 = new B(this, abstractC2086v, c4711b);
            s.g gVar = this.f25293b;
            s.c f6 = gVar.f(c4711b);
            if (f6 != null) {
                obj = f6.f45004Z;
            } else {
                s.c cVar = new s.c(c4711b, b10);
                gVar.f45015i0++;
                s.c cVar2 = gVar.f45013Z;
                if (cVar2 == null) {
                    gVar.f45012Y = cVar;
                    gVar.f45013Z = cVar;
                } else {
                    cVar2.f45005h0 = cVar;
                    cVar.f45006i0 = cVar2;
                    gVar.f45013Z = cVar;
                }
                obj = null;
            }
            C c10 = (C) obj;
            if (c10 != null && !c10.d(abstractC2086v)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
            if (c10 == null) {
                abstractC2086v.h().a(b10);
            }
        }
    }

    public /* bridge */ /* synthetic */ void e() {
    }

    public /* bridge */ /* synthetic */ void f() {
    }

    public final void g(Object obj) {
        boolean z10;
        synchronized (this.f25292a) {
            if (this.f25297f == f25291k) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f25297f = obj;
        }
        if (z10) {
            r.b.d0().e0(this.f25301j);
        }
    }

    public void h(F f6) {
        a("removeObserver");
        C c10 = (C) this.f25293b.r(f6);
        if (c10 != null) {
            c10.c();
            c10.a(false);
        }
    }

    public void i(Object obj) {
        a("setValue");
        this.f25298g++;
        this.f25296e = obj;
        c(null);
    }
}
