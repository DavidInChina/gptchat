package io.sentry.transport;

import io.sentry.EnumC3652i;
import io.sentry.r1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Date;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final g f34757a;

    /* renamed from: b  reason: collision with root package name */
    public final r1 f34758b;

    /* renamed from: c  reason: collision with root package name */
    public final ConcurrentHashMap f34759c = new ConcurrentHashMap();

    public o(r1 r1Var) {
        e eVar = e.f34741Y;
        this.f34757a = eVar;
        this.f34758b = r1Var;
    }

    public final void a(EnumC3652i enumC3652i, Date date) {
        ConcurrentHashMap concurrentHashMap = this.f34759c;
        Date date2 = (Date) concurrentHashMap.get(enumC3652i);
        if (date2 == null || date.after(date2)) {
            concurrentHashMap.put(enumC3652i, date);
        }
    }

    public final boolean b(EnumC3652i enumC3652i) {
        Date date;
        Date date2 = new Date(this.f34757a.getCurrentTimeMillis());
        ConcurrentHashMap concurrentHashMap = this.f34759c;
        Date date3 = (Date) concurrentHashMap.get(EnumC3652i.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (EnumC3652i.Unknown.equals(enumC3652i) || (date = (Date) concurrentHashMap.get(enumC3652i)) == null) {
            return false;
        }
        return !date2.after(date);
    }
}
