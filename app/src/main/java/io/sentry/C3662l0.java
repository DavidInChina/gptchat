package io.sentry;

import id.AbstractC3557B;
import io.sentry.protocol.C3677d;
import io.sentry.protocol.DebugImage;
import java.io.Closeable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.l0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3662l0 implements r, Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final r1 f34418Y;

    /* renamed from: Z  reason: collision with root package name */
    public final U3.c f34419Z;

    /* renamed from: h0  reason: collision with root package name */
    public final S4.o f34420h0;

    /* renamed from: i0  reason: collision with root package name */
    public volatile C3692x f34421i0 = null;

    public C3662l0(r1 r1Var) {
        Ad.l.Z0("The SentryOptions is required.", r1Var);
        this.f34418Y = r1Var;
        s1 s1Var = new s1(r1Var);
        this.f34420h0 = new S4.o(s1Var);
        this.f34419Z = new U3.c(s1Var, r1Var);
    }

    @Override // io.sentry.r
    public final Z0 a(Z0 z02, C3686u c3686u) {
        List list;
        List<io.sentry.protocol.r> list2;
        ArrayList arrayList;
        Thread thread;
        io.sentry.protocol.k kVar;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (z02.f33843m0 == null) {
            z02.f33843m0 = "java";
        }
        Throwable th2 = z02.f33845o0;
        if (th2 != null) {
            S4.o oVar = this.f34420h0;
            oVar.getClass();
            ArrayDeque arrayDeque = new ArrayDeque();
            HashSet hashSet = new HashSet();
            while (th2 != null && hashSet.add(th2)) {
                if (th2 instanceof io.sentry.exception.a) {
                    io.sentry.exception.a aVar = (io.sentry.exception.a) th2;
                    io.sentry.protocol.k kVar2 = aVar.f34326Y;
                    Throwable th3 = aVar.f34327Z;
                    thread = aVar.f34328h0;
                    z10 = aVar.f34329i0;
                    th2 = th3;
                    kVar = kVar2;
                } else {
                    thread = Thread.currentThread();
                    z10 = false;
                    kVar = null;
                }
                if (kVar != null && Boolean.FALSE.equals(kVar.f34568i0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                arrayDeque.addFirst(S4.o.n(th2, kVar, Long.valueOf(thread.getId()), ((s1) oVar.f16184Z).b(th2.getStackTrace(), z11), z10));
                th2 = th2.getCause();
            }
            z02.f33903y0 = new C4.c(2, new ArrayList(arrayDeque));
        }
        j(z02);
        r1 r1Var = this.f34418Y;
        Map a5 = r1Var.getModulesLoader().a();
        if (a5 != null) {
            Map map = z02.f33898D0;
            if (map == null) {
                z02.f33898D0 = new HashMap(a5);
            } else {
                map.putAll(a5);
            }
        }
        if (AbstractC3557B.u2(c3686u)) {
            i(z02);
            C4.c cVar = z02.f33902x0;
            if (cVar != null) {
                list = cVar.f2667Y;
            } else {
                list = null;
            }
            if (list == null) {
                C4.c cVar2 = z02.f33903y0;
                if (cVar2 == null) {
                    list2 = null;
                } else {
                    list2 = cVar2.f2667Y;
                }
                if (list2 != null && !list2.isEmpty()) {
                    arrayList = null;
                    for (io.sentry.protocol.r rVar : list2) {
                        if (rVar.f34617k0 != null && rVar.f34615i0 != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(rVar.f34615i0);
                        }
                    }
                } else {
                    arrayList = null;
                }
                boolean isAttachThreads = r1Var.isAttachThreads();
                U3.c cVar3 = this.f34419Z;
                if (!isAttachThreads && !io.sentry.hints.a.class.isInstance(AbstractC3557B.v1(c3686u))) {
                    if (r1Var.isAttachStacktrace() && ((list2 == null || list2.isEmpty()) && !io.sentry.hints.d.class.isInstance(AbstractC3557B.v1(c3686u)))) {
                        cVar3.getClass();
                        HashMap hashMap = new HashMap();
                        Thread currentThread = Thread.currentThread();
                        hashMap.put(currentThread, currentThread.getStackTrace());
                        z02.f33902x0 = new C4.c(2, cVar3.n(null, hashMap, false));
                    }
                } else {
                    Object v12 = AbstractC3557B.v1(c3686u);
                    if (v12 instanceof io.sentry.hints.a) {
                        z12 = ((io.sentry.hints.a) v12).b();
                    }
                    cVar3.getClass();
                    z02.f33902x0 = new C4.c(2, cVar3.n(arrayList, Thread.getAllStackTraces(), z12));
                }
            }
        } else {
            r1Var.getLogger().f(EnumC3642e1.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", z02.f33836Y);
        }
        return z02;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f34421i0 != null) {
            this.f34421i0.f34828f.shutdown();
        }
    }

    @Override // io.sentry.r
    public final io.sentry.protocol.z h(io.sentry.protocol.z zVar, C3686u c3686u) {
        if (zVar.f33843m0 == null) {
            zVar.f33843m0 = "java";
        }
        j(zVar);
        if (AbstractC3557B.u2(c3686u)) {
            i(zVar);
        } else {
            this.f34418Y.getLogger().f(EnumC3642e1.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", zVar.f33836Y);
        }
        return zVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [io.sentry.protocol.C, java.lang.Object] */
    public final void i(O0 o02) {
        if (o02.f33841k0 == null) {
            o02.f33841k0 = this.f34418Y.getRelease();
        }
        if (o02.f33842l0 == null) {
            o02.f33842l0 = this.f34418Y.getEnvironment();
        }
        if (o02.f33846p0 == null) {
            o02.f33846p0 = this.f34418Y.getServerName();
        }
        if (this.f34418Y.isAttachServerName() && o02.f33846p0 == null) {
            if (this.f34421i0 == null) {
                synchronized (this) {
                    try {
                        if (this.f34421i0 == null) {
                            if (C3692x.f34822i == null) {
                                C3692x.f34822i = new C3692x();
                            }
                            this.f34421i0 = C3692x.f34822i;
                        }
                    } finally {
                    }
                }
            }
            if (this.f34421i0 != null) {
                C3692x c3692x = this.f34421i0;
                if (c3692x.f34825c < System.currentTimeMillis() && c3692x.f34826d.compareAndSet(false, true)) {
                    c3692x.a();
                }
                o02.f33846p0 = c3692x.f34824b;
            }
        }
        if (o02.f33847q0 == null) {
            o02.f33847q0 = this.f34418Y.getDist();
        }
        if (o02.f33838h0 == null) {
            o02.f33838h0 = this.f34418Y.getSdkVersion();
        }
        Map map = o02.f33840j0;
        r1 r1Var = this.f34418Y;
        if (map == null) {
            o02.f33840j0 = new HashMap(new HashMap(r1Var.getTags()));
        } else {
            for (Map.Entry<String, String> entry : r1Var.getTags().entrySet()) {
                if (!o02.f33840j0.containsKey(entry.getKey())) {
                    o02.a(entry.getKey(), entry.getValue());
                }
            }
        }
        io.sentry.protocol.C c10 = o02.f33844n0;
        io.sentry.protocol.C c11 = c10;
        if (c10 == null) {
            ?? obj = new Object();
            o02.f33844n0 = obj;
            c11 = obj;
        }
        if (c11.f34474j0 == null) {
            c11.f34474j0 = "{{auto}}";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(O0 o02) {
        ArrayList arrayList = new ArrayList();
        r1 r1Var = this.f34418Y;
        if (r1Var.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(r1Var.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : r1Var.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (!arrayList.isEmpty()) {
            C3677d c3677d = o02.f33849s0;
            C3677d c3677d2 = c3677d;
            if (c3677d == null) {
                c3677d2 = new Object();
            }
            List list = c3677d2.f34510Z;
            if (list == null) {
                c3677d2.f34510Z = new ArrayList(arrayList);
            } else {
                list.addAll(arrayList);
            }
            o02.f33849s0 = c3677d2;
        }
    }
}
