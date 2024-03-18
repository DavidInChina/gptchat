package io.sentry.clientreport;

import androidx.lifecycle.D;
import io.sentry.EnumC3639d1;
import io.sentry.EnumC3642e1;
import io.sentry.EnumC3652i;
import io.sentry.T0;
import io.sentry.X0;
import io.sentry.r1;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public final D f34302a = new D(5);

    /* renamed from: b  reason: collision with root package name */
    public final r1 f34303b;

    public c(r1 r1Var) {
        this.f34303b = r1Var;
    }

    public static EnumC3652i c(EnumC3639d1 enumC3639d1) {
        if (EnumC3639d1.Event.equals(enumC3639d1)) {
            return EnumC3652i.Error;
        }
        if (EnumC3639d1.Session.equals(enumC3639d1)) {
            return EnumC3652i.Session;
        }
        if (EnumC3639d1.Transaction.equals(enumC3639d1)) {
            return EnumC3652i.Transaction;
        }
        if (EnumC3639d1.UserFeedback.equals(enumC3639d1)) {
            return EnumC3652i.UserReport;
        }
        if (EnumC3639d1.Profile.equals(enumC3639d1)) {
            return EnumC3652i.Profile;
        }
        if (EnumC3639d1.Attachment.equals(enumC3639d1)) {
            return EnumC3652i.Attachment;
        }
        if (EnumC3639d1.CheckIn.equals(enumC3639d1)) {
            return EnumC3652i.Monitor;
        }
        return EnumC3652i.Default;
    }

    @Override // io.sentry.clientreport.f
    public final void a(d dVar, EnumC3652i enumC3652i) {
        try {
            f(dVar.getReason(), enumC3652i.getCategory(), 1L);
        } catch (Throwable th2) {
            this.f34303b.getLogger().b(EnumC3642e1.ERROR, th2, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.f
    public final void b(d dVar, T0 t02) {
        if (t02 == null) {
            return;
        }
        try {
            for (X0 x02 : t02.f33865b) {
                e(dVar, x02);
            }
        } catch (Throwable th2) {
            this.f34303b.getLogger().b(EnumC3642e1.ERROR, th2, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.f
    public final T0 d(T0 t02) {
        a aVar;
        r1 r1Var = this.f34303b;
        Date A10 = r.f.A();
        D d10 = this.f34302a;
        d10.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : d10.f25290b.entrySet()) {
            long andSet = ((AtomicLong) entry.getValue()).getAndSet(0L);
            Long valueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new e(((b) entry.getKey()).f34300a, ((b) entry.getKey()).f34301b, valueOf));
            }
        }
        if (arrayList.isEmpty()) {
            aVar = null;
        } else {
            aVar = new a(A10, arrayList);
        }
        if (aVar == null) {
            return t02;
        }
        try {
            r1Var.getLogger().f(EnumC3642e1.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList2 = new ArrayList();
            for (X0 x02 : t02.f33865b) {
                arrayList2.add(x02);
            }
            arrayList2.add(X0.a(r1Var.getSerializer(), aVar));
            return new T0(t02.f33864a, arrayList2);
        } catch (Throwable th2) {
            r1Var.getLogger().b(EnumC3642e1.ERROR, th2, "Unable to attach client report to envelope.", new Object[0]);
            return t02;
        }
    }

    @Override // io.sentry.clientreport.f
    public final void e(d dVar, X0 x02) {
        r1 r1Var = this.f34303b;
        if (x02 == null) {
            return;
        }
        try {
            EnumC3639d1 enumC3639d1 = x02.f33884a.f33890h0;
            if (EnumC3639d1.ClientReport.equals(enumC3639d1)) {
                try {
                    g(x02.c(r1Var.getSerializer()));
                } catch (Exception unused) {
                    r1Var.getLogger().f(EnumC3642e1.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                }
            } else {
                f(dVar.getReason(), c(enumC3639d1).getCategory(), 1L);
            }
        } catch (Throwable th2) {
            r1Var.getLogger().b(EnumC3642e1.ERROR, th2, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    public final void f(String str, String str2, Long l10) {
        AtomicLong atomicLong = (AtomicLong) this.f34302a.f25290b.get(new b(str, str2));
        if (atomicLong != null) {
            atomicLong.addAndGet(l10.longValue());
        }
    }

    public final void g(a aVar) {
        if (aVar == null) {
            return;
        }
        for (e eVar : aVar.f34298Z) {
            f(eVar.f34304Y, eVar.f34305Z, eVar.f34306h0);
        }
    }
}
