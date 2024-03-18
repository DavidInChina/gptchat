package R0;

import Ad.l;
import id.AbstractC3557B;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kf.t;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final P5.c f15011a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f15012b = new HashMap(0, 0.75f);

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet f15013c = new LinkedHashSet();

    /* renamed from: d  reason: collision with root package name */
    public int f15014d;

    /* renamed from: e  reason: collision with root package name */
    public int f15015e;

    /* renamed from: f  reason: collision with root package name */
    public int f15016f;

    public final Object a(Object obj) {
        synchronized (this.f15011a) {
            Object obj2 = this.f15012b.get(obj);
            if (obj2 != null) {
                this.f15013c.remove(obj);
                this.f15013c.add(obj);
                this.f15015e++;
                return obj2;
            }
            this.f15016f++;
            return null;
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object put;
        if (obj != null && obj2 != null) {
            synchronized (this.f15011a) {
                try {
                    this.f15014d = d() + 1;
                    put = this.f15012b.put(obj, obj2);
                    if (put != null) {
                        this.f15014d = d() - 1;
                    }
                    if (this.f15013c.contains(obj)) {
                        this.f15013c.remove(obj);
                    }
                    this.f15013c.add(obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            e();
            return put;
        }
        throw null;
    }

    public final Object c(Object obj) {
        Object remove;
        obj.getClass();
        synchronized (this.f15011a) {
            remove = this.f15012b.remove(obj);
            this.f15013c.remove(obj);
            if (remove != null) {
                this.f15014d = d() - 1;
            }
        }
        return remove;
    }

    public final int d() {
        int i10;
        synchronized (this.f15011a) {
            i10 = this.f15014d;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        Object obj;
        Object obj2;
        while (true) {
            synchronized (this.f15011a) {
                try {
                    if (d() >= 0) {
                        if (this.f15012b.isEmpty() && d() != 0) {
                            break;
                        }
                        if (this.f15012b.isEmpty() != this.f15013c.isEmpty()) {
                            break;
                        } else if (d() > 16 && !this.f15012b.isEmpty()) {
                            obj2 = t.e2(this.f15013c);
                            obj = this.f15012b.get(obj2);
                            if (obj != null) {
                                HashMap hashMap = this.f15012b;
                                l.I(hashMap);
                                hashMap.remove(obj2);
                                l.H(this.f15013c).remove(obj2);
                                int d10 = d();
                                AbstractC3557B.Z(obj2);
                                this.f15014d = d10 - 1;
                            } else {
                                throw new IllegalStateException("inconsistent state");
                            }
                        } else {
                            obj2 = null;
                            obj = null;
                        }
                    } else {
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (obj2 == null && obj == null) {
                return;
            }
            AbstractC3557B.Z(obj2);
            AbstractC3557B.Z(obj);
        }
    }

    public final String toString() {
        int i10;
        String str;
        synchronized (this.f15011a) {
            try {
                int i11 = this.f15015e;
                int i12 = this.f15016f + i11;
                if (i12 != 0) {
                    i10 = (i11 * 100) / i12;
                } else {
                    i10 = 0;
                }
                str = "LruCache[maxSize=16,hits=" + this.f15015e + ",misses=" + this.f15016f + ",hitRate=" + i10 + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
