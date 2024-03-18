package ld;

import java.util.ArrayList;
import kf.t;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f38286a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList f38287b = new ArrayList();

    public final synchronized void a(Object obj) {
        f38287b.add(obj);
    }

    public final synchronized Object b(Class cls) {
        Object obj;
        try {
            ArrayList c22 = t.c2(f38287b, cls);
            int size = c22.size();
            if (size != 0) {
                if (size != 1) {
                    obj = t.o2(c22);
                } else {
                    obj = t.B2(c22);
                }
            } else {
                obj = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return obj;
    }
}
