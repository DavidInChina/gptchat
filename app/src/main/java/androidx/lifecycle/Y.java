package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public abstract class Y {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f25344a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f25345b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f25346c = false;

    public static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final void a(Closeable closeable) {
        if (this.f25346c) {
            b(closeable);
            return;
        }
        LinkedHashSet linkedHashSet = this.f25345b;
        if (linkedHashSet != null) {
            synchronized (linkedHashSet) {
                this.f25345b.add(closeable);
            }
        }
    }

    public void c() {
    }

    public final Object d(String str, Object obj) {
        Object obj2;
        synchronized (this.f25344a) {
            try {
                obj2 = this.f25344a.get(str);
                if (obj2 == null) {
                    this.f25344a.put(str, obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f25346c) {
            b(obj);
        }
        return obj;
    }
}
