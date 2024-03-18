package io.sentry;

import id.AbstractC3557B;
import io.sentry.protocol.C3676c;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: io.sentry.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3655j implements r {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f34401Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f34402Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f34403h0;

    public C3655j(String str, String str2) {
        this.f34401Y = 2;
        this.f34402Z = str;
        this.f34403h0 = str2;
    }

    @Override // io.sentry.r
    public final Z0 a(Z0 z02, C3686u c3686u) {
        io.sentry.protocol.r b10;
        String str;
        Long l10;
        int i10 = this.f34401Y;
        Object obj = this.f34402Z;
        Object obj2 = this.f34403h0;
        switch (i10) {
            case 0:
                if (M1.class.isInstance(AbstractC3557B.v1(c3686u)) && (b10 = z02.b()) != null && (str = b10.f34612Y) != null && (l10 = b10.f34615i0) != null) {
                    Map map = (Map) obj;
                    Long l11 = (Long) map.get(str);
                    if (l11 != null && !l11.equals(l10)) {
                        ((r1) obj2).getLogger().f(EnumC3642e1.INFO, "Event %s has been dropped due to multi-threaded deduplication", z02.f33836Y);
                        c3686u.c("sentry:eventDropReason", io.sentry.hints.e.MULTITHREADED_DEDUPLICATION);
                        return null;
                    }
                    map.put(str, l10);
                    return z02;
                }
                return z02;
            case 1:
                r1 r1Var = (r1) obj2;
                if (r1Var.isEnableDeduplication()) {
                    Throwable th2 = z02.f33845o0;
                    if (th2 instanceof io.sentry.exception.a) {
                        th2 = ((io.sentry.exception.a) th2).f34327Z;
                    }
                    if (th2 != null) {
                        Map map2 = (Map) obj;
                        if (!map2.containsKey(th2)) {
                            ArrayList arrayList = new ArrayList();
                            for (Throwable th3 = th2; th3.getCause() != null; th3 = th3.getCause()) {
                                arrayList.add(th3.getCause());
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (map2.containsKey(it.next())) {
                                    r1Var.getLogger().f(EnumC3642e1.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", z02.f33836Y);
                                    return null;
                                }
                            }
                            map2.put(th2, null);
                            return z02;
                        }
                        r1Var.getLogger().f(EnumC3642e1.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", z02.f33836Y);
                        return null;
                    }
                    return z02;
                }
                r1Var.getLogger().f(EnumC3642e1.DEBUG, "Event deduplication is disabled.", new Object[0]);
                return z02;
            default:
                b(z02);
                return z02;
        }
    }

    public final void b(O0 o02) {
        io.sentry.protocol.u uVar = (io.sentry.protocol.u) o02.f33837Z.c(io.sentry.protocol.u.class, "runtime");
        C3676c c3676c = o02.f33837Z;
        if (uVar == null) {
            c3676c.put("runtime", new Object());
        }
        io.sentry.protocol.u uVar2 = (io.sentry.protocol.u) c3676c.c(io.sentry.protocol.u.class, "runtime");
        if (uVar2 != null && uVar2.f34624Y == null && uVar2.f34625Z == null) {
            uVar2.f34624Y = (String) this.f34403h0;
            uVar2.f34625Z = (String) this.f34402Z;
        }
    }

    @Override // io.sentry.r
    public final io.sentry.protocol.z h(io.sentry.protocol.z zVar, C3686u c3686u) {
        switch (this.f34401Y) {
            case 0:
            case 1:
                break;
            default:
                b(zVar);
                break;
        }
        return zVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3655j() {
        this(System.getProperty("java.version"), System.getProperty("java.vendor"));
        this.f34401Y = 2;
    }

    public C3655j(r1 r1Var, int i10) {
        this.f34401Y = i10;
        if (i10 != 1) {
            this.f34402Z = DesugarCollections.synchronizedMap(new HashMap());
            this.f34403h0 = r1Var;
            return;
        }
        this.f34402Z = DesugarCollections.synchronizedMap(new WeakHashMap());
        Ad.l.Z0("options are required", r1Var);
        this.f34403h0 = r1Var;
    }
}
