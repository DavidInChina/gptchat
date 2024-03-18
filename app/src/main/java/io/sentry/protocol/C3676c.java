package io.sentry.protocol;

import io.sentry.A1;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: io.sentry.protocol.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3676c extends ConcurrentHashMap implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public final Object f34508Y = new Object();

    public C3676c() {
    }

    public final A1 a() {
        return (A1) c(A1.class, "trace");
    }

    public final void b(A1 a12) {
        Ad.l.Z0("traceContext is required", a12);
        put("trace", a12);
    }

    public final Object c(Class cls, String str) {
        Object obj = get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        ArrayList<String> list = Collections.list(keys());
        Collections.sort(list);
        for (String str : list) {
            Object obj = get(str);
            if (obj != null) {
                c3636c1.n(str);
                c3636c1.v(h10, obj);
            }
        }
        c3636c1.j();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, io.sentry.protocol.m] */
    /* JADX WARN: Type inference failed for: r0v11, types: [io.sentry.protocol.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [io.sentry.protocol.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [io.sentry.protocol.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [io.sentry.protocol.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, io.sentry.protocol.h] */
    /* JADX WARN: Type inference failed for: r0v9, types: [io.sentry.protocol.u, java.lang.Object] */
    public C3676c(C3676c c3676c) {
        Iterator it = c3676c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry != null) {
                Object value = entry.getValue();
                TimeZone timeZone = null;
                ArrayList arrayList = null;
                if ("app".equals(entry.getKey()) && (value instanceof C3674a)) {
                    C3674a c3674a = (C3674a) value;
                    ?? obj = new Object();
                    obj.f34500l0 = c3674a.f34500l0;
                    obj.f34494Y = c3674a.f34494Y;
                    obj.f34498j0 = c3674a.f34498j0;
                    obj.f34495Z = c3674a.f34495Z;
                    obj.f34499k0 = c3674a.f34499k0;
                    obj.f34497i0 = c3674a.f34497i0;
                    obj.f34496h0 = c3674a.f34496h0;
                    obj.f34501m0 = P4.a.p0(c3674a.f34501m0);
                    obj.f34503o0 = c3674a.f34503o0;
                    List list = c3674a.f34502n0;
                    obj.f34502n0 = list != null ? new ArrayList(list) : arrayList;
                    obj.f34504p0 = P4.a.p0(c3674a.f34504p0);
                    put("app", obj);
                } else if ("browser".equals(entry.getKey()) && (value instanceof C3675b)) {
                    C3675b c3675b = (C3675b) value;
                    ?? obj2 = new Object();
                    obj2.f34505Y = c3675b.f34505Y;
                    obj2.f34506Z = c3675b.f34506Z;
                    obj2.f34507h0 = P4.a.p0(c3675b.f34507h0);
                    put("browser", obj2);
                } else if ("device".equals(entry.getKey()) && (value instanceof f)) {
                    f fVar = (f) value;
                    ?? obj3 = new Object();
                    obj3.f34526Y = fVar.f34526Y;
                    obj3.f34527Z = fVar.f34527Z;
                    obj3.f34528h0 = fVar.f34528h0;
                    obj3.f34529i0 = fVar.f34529i0;
                    obj3.f34530j0 = fVar.f34530j0;
                    obj3.f34531k0 = fVar.f34531k0;
                    obj3.f34534n0 = fVar.f34534n0;
                    obj3.f34535o0 = fVar.f34535o0;
                    obj3.f34536p0 = fVar.f34536p0;
                    obj3.f34537q0 = fVar.f34537q0;
                    obj3.f34538r0 = fVar.f34538r0;
                    obj3.f34539s0 = fVar.f34539s0;
                    obj3.f34540t0 = fVar.f34540t0;
                    obj3.f34541u0 = fVar.f34541u0;
                    obj3.f34542v0 = fVar.f34542v0;
                    obj3.f34543w0 = fVar.f34543w0;
                    obj3.f34544x0 = fVar.f34544x0;
                    obj3.f34545y0 = fVar.f34545y0;
                    obj3.f34546z0 = fVar.f34546z0;
                    obj3.f34512A0 = fVar.f34512A0;
                    obj3.f34513B0 = fVar.f34513B0;
                    obj3.f34514C0 = fVar.f34514C0;
                    obj3.f34515D0 = fVar.f34515D0;
                    obj3.f34517F0 = fVar.f34517F0;
                    obj3.f34518G0 = fVar.f34518G0;
                    obj3.f34520I0 = fVar.f34520I0;
                    obj3.f34521J0 = fVar.f34521J0;
                    obj3.f34533m0 = fVar.f34533m0;
                    String[] strArr = fVar.f34532l0;
                    obj3.f34532l0 = strArr != null ? (String[]) strArr.clone() : null;
                    obj3.f34519H0 = fVar.f34519H0;
                    TimeZone timeZone2 = fVar.f34516E0;
                    obj3.f34516E0 = timeZone2 != null ? (TimeZone) timeZone2.clone() : timeZone;
                    obj3.f34522K0 = fVar.f34522K0;
                    obj3.f34523L0 = fVar.f34523L0;
                    obj3.f34524M0 = fVar.f34524M0;
                    obj3.f34525N0 = P4.a.p0(fVar.f34525N0);
                    put("device", obj3);
                } else if ("os".equals(entry.getKey()) && (value instanceof m)) {
                    m mVar = (m) value;
                    ?? obj4 = new Object();
                    obj4.f34577Y = mVar.f34577Y;
                    obj4.f34578Z = mVar.f34578Z;
                    obj4.f34579h0 = mVar.f34579h0;
                    obj4.f34580i0 = mVar.f34580i0;
                    obj4.f34581j0 = mVar.f34581j0;
                    obj4.f34582k0 = mVar.f34582k0;
                    obj4.f34583l0 = P4.a.p0(mVar.f34583l0);
                    put("os", obj4);
                } else if ("runtime".equals(entry.getKey()) && (value instanceof u)) {
                    u uVar = (u) value;
                    ?? obj5 = new Object();
                    obj5.f34624Y = uVar.f34624Y;
                    obj5.f34625Z = uVar.f34625Z;
                    obj5.f34626h0 = uVar.f34626h0;
                    obj5.f34627i0 = P4.a.p0(uVar.f34627i0);
                    put("runtime", obj5);
                } else if ("gpu".equals(entry.getKey()) && (value instanceof h)) {
                    h hVar = (h) value;
                    ?? obj6 = new Object();
                    obj6.f34551Y = hVar.f34551Y;
                    obj6.f34552Z = hVar.f34552Z;
                    obj6.f34553h0 = hVar.f34553h0;
                    obj6.f34554i0 = hVar.f34554i0;
                    obj6.f34555j0 = hVar.f34555j0;
                    obj6.f34556k0 = hVar.f34556k0;
                    obj6.f34557l0 = hVar.f34557l0;
                    obj6.f34558m0 = hVar.f34558m0;
                    obj6.f34559n0 = hVar.f34559n0;
                    obj6.f34560o0 = P4.a.p0(hVar.f34560o0);
                    put("gpu", obj6);
                } else if ("trace".equals(entry.getKey()) && (value instanceof A1)) {
                    b(new A1((A1) value));
                } else if ("response".equals(entry.getKey()) && (value instanceof o)) {
                    o oVar = (o) value;
                    ?? obj7 = new Object();
                    obj7.f34596Y = oVar.f34596Y;
                    obj7.f34597Z = P4.a.p0(oVar.f34597Z);
                    obj7.f34601k0 = P4.a.p0(oVar.f34601k0);
                    obj7.f34598h0 = oVar.f34598h0;
                    obj7.f34599i0 = oVar.f34599i0;
                    obj7.f34600j0 = oVar.f34600j0;
                    synchronized (this.f34508Y) {
                        put("response", obj7);
                    }
                } else {
                    put((String) entry.getKey(), value);
                }
            }
        }
    }
}
