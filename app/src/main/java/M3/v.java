package M3;

import L3.C0889a;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public static final String f11606a = L3.s.f("Schedulers");

    public static void a(U3.s sVar, R4.a aVar, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            aVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sVar.q(currentTimeMillis, ((U3.q) it.next()).f17450a);
            }
        }
    }

    public static void b(C0889a c0889a, WorkDatabase workDatabase, List list) {
        ArrayList arrayList;
        if (list != null && list.size() != 0) {
            U3.s u10 = workDatabase.u();
            workDatabase.c();
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    arrayList = u10.f();
                    a(u10, c0889a.f10686c, arrayList);
                } else {
                    arrayList = null;
                }
                ArrayList e10 = u10.e(c0889a.f10693j);
                a(u10, c0889a.f10686c, e10);
                if (arrayList != null) {
                    e10.addAll(arrayList);
                }
                ArrayList d10 = u10.d();
                workDatabase.n();
                workDatabase.j();
                if (e10.size() > 0) {
                    U3.q[] qVarArr = (U3.q[]) e10.toArray(new U3.q[e10.size()]);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        s sVar = (s) it.next();
                        if (sVar.b()) {
                            sVar.d(qVarArr);
                        }
                    }
                }
                if (d10.size() > 0) {
                    U3.q[] qVarArr2 = (U3.q[]) d10.toArray(new U3.q[d10.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        s sVar2 = (s) it2.next();
                        if (!sVar2.b()) {
                            sVar2.d(qVarArr2);
                        }
                    }
                }
            } catch (Throwable th2) {
                workDatabase.j();
                throw th2;
            }
        }
    }
}
