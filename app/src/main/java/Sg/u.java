package Sg;

import Ng.x0;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public static final x0 f16684a;

    static {
        String str;
        Object obj;
        int i10 = B.f16631a;
        x0 x0Var = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        List p12 = Kg.m.p1(Kg.p.Z0(R.a.A()));
        Iterator it = p12.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                int c10 = ((t) obj).c();
                do {
                    Object next = it.next();
                    int c11 = ((t) next).c();
                    if (c10 < c11) {
                        obj = next;
                        c10 = c11;
                    }
                } while (it.hasNext());
            }
        }
        t tVar = (t) obj;
        if (tVar != null) {
            try {
                x0Var = tVar.b(p12);
            } catch (Throwable unused2) {
                tVar.a();
            }
            if (x0Var != null) {
                f16684a = x0Var;
                return;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
