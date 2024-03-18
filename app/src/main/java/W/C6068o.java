package w;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: w.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6068o {

    /* renamed from: a  reason: collision with root package name */
    public final int f47602a;

    /* renamed from: b  reason: collision with root package name */
    public final F4.a f47603b;

    /* renamed from: c  reason: collision with root package name */
    public final io.sentry.hints.i f47604c;

    /* renamed from: d  reason: collision with root package name */
    public int f47605d;

    /* renamed from: e  reason: collision with root package name */
    public int f47606e;

    /* renamed from: f  reason: collision with root package name */
    public int f47607f;

    public C6068o(int i10) {
        this.f47602a = i10;
        if (i10 > 0) {
            this.f47603b = new F4.a();
            this.f47604c = new io.sentry.hints.i(6);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    public void a(Object obj, Object obj2, Object obj3) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, obj);
        AbstractC3557B.c0("oldValue", obj2);
    }

    public final Object b(Object obj) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, obj);
        synchronized (this.f47604c) {
            F4.a aVar = this.f47603b;
            aVar.getClass();
            Object obj2 = ((LinkedHashMap) aVar.f5033Z).get(obj);
            if (obj2 != null) {
                this.f47606e++;
                return obj2;
            }
            this.f47607f++;
            return null;
        }
    }

    public final Object c(Object obj, Object obj2) {
        Object put;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, obj);
        AbstractC3557B.c0("value", obj2);
        synchronized (this.f47604c) {
            this.f47605d += e(obj, obj2);
            F4.a aVar = this.f47603b;
            aVar.getClass();
            put = ((LinkedHashMap) aVar.f5033Z).put(obj, obj2);
            if (put != null) {
                this.f47605d -= e(obj, put);
            }
        }
        if (put != null) {
            a(obj, put, obj2);
        }
        g(this.f47602a);
        return put;
    }

    public final void d(Object obj) {
        Object remove;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, obj);
        synchronized (this.f47604c) {
            F4.a aVar = this.f47603b;
            aVar.getClass();
            remove = ((LinkedHashMap) aVar.f5033Z).remove(obj);
            if (remove != null) {
                this.f47605d -= e(obj, remove);
            }
        }
        if (remove != null) {
            a(obj, remove, null);
        }
    }

    public final int e(Object obj, Object obj2) {
        int f6 = f(obj, obj2);
        if (f6 >= 0) {
            return f6;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    public int f(Object obj, Object obj2) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, obj);
        AbstractC3557B.c0("value", obj2);
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!".toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i10) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.f47604c) {
                try {
                    if (this.f47605d < 0 || (((LinkedHashMap) this.f47603b.f5033Z).isEmpty() && this.f47605d != 0)) {
                        break;
                    }
                    if (this.f47605d <= i10 || ((LinkedHashMap) this.f47603b.f5033Z).isEmpty()) {
                        break;
                    }
                    Set entrySet = ((LinkedHashMap) this.f47603b.f5033Z).entrySet();
                    AbstractC3557B.b0("map.entries", entrySet);
                    Map.Entry entry = (Map.Entry) kf.t.g2(entrySet);
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    F4.a aVar = this.f47603b;
                    aVar.getClass();
                    AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, key);
                    ((LinkedHashMap) aVar.f5033Z).remove(key);
                    this.f47605d -= e(key, value);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            a(key, value, null);
        }
    }

    public final String toString() {
        int i10;
        String str;
        synchronized (this.f47604c) {
            try {
                int i11 = this.f47606e;
                int i12 = this.f47607f + i11;
                if (i12 != 0) {
                    i10 = (i11 * 100) / i12;
                } else {
                    i10 = 0;
                }
                str = "LruCache[maxSize=" + this.f47602a + ",hits=" + this.f47606e + ",misses=" + this.f47607f + ",hitRate=" + i10 + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
