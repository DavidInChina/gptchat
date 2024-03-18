package V3;

import L3.z;
import M3.F;
import M3.J;
import androidx.work.impl.WorkDatabase;
import io.sentry.C1;
import io.sentry.L0;
import io.sentry.S;
import java.util.LinkedList;
import x3.y;

/* loaded from: classes.dex */
public abstract class d implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final U3.e f18339Y = new U3.e(7);

    public static void a(F f6, String str) {
        J b10;
        S s10;
        WorkDatabase workDatabase = f6.f11519h;
        U3.s u10 = workDatabase.u();
        U3.c p10 = workDatabase.p();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int i10 = u10.i(str2);
            if (i10 != 3 && i10 != 4) {
                S d10 = L0.d();
                if (d10 != null) {
                    s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
                } else {
                    s10 = null;
                }
                y yVar = u10.f17474a;
                yVar.b();
                U3.r rVar = u10.f17478e;
                B3.i c10 = rVar.c();
                if (str2 == null) {
                    c10.s0(1);
                } else {
                    c10.b(1, str2);
                }
                yVar.c();
                try {
                    c10.w();
                    yVar.n();
                    if (s10 != null) {
                        s10.c(C1.OK);
                    }
                } finally {
                    yVar.j();
                    if (s10 != null) {
                        s10.b();
                    }
                    rVar.g(c10);
                }
            }
            linkedList.addAll(p10.p(str2));
        }
        M3.q qVar = f6.f11522k;
        synchronized (qVar.f11594k) {
            L3.s d11 = L3.s.d();
            String str3 = M3.q.f11583l;
            d11.a(str3, "Processor cancelling " + str);
            qVar.f11592i.add(str);
            b10 = qVar.b(str);
        }
        M3.q.e(str, b10, 1);
        for (M3.s sVar : f6.f11521j) {
            sVar.c(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        U3.e eVar = this.f18339Y;
        try {
            b();
            eVar.y(z.f10734n);
        } catch (Throwable th2) {
            eVar.y(new L3.w(th2));
        }
    }
}
