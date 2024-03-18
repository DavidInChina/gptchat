package android.javax.sip;

import c.AbstractC2270z;
import java.util.Hashtable;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static o f24333b;

    /* renamed from: a  reason: collision with root package name */
    public AbstractC2270z f24334a;

    /* JADX WARN: Type inference failed for: r1v3, types: [android.javax.sip.o, java.lang.Object] */
    public static synchronized o a() {
        o oVar;
        synchronized (o.class) {
            try {
                if (f24333b == null) {
                    ?? obj = new Object();
                    obj.f24334a = null;
                    new LinkedList();
                    new Hashtable();
                    f24333b = obj;
                }
                oVar = f24333b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oVar;
    }
}
