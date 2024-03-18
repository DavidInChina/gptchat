package M6;

import android.gov.nist.core.Separators;
import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigInteger;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class b implements ff.d {

    /* renamed from: p  reason: collision with root package name */
    public static final Map f11656p = Collections.emptyMap();

    /* renamed from: a  reason: collision with root package name */
    public final d f11657a;

    /* renamed from: b  reason: collision with root package name */
    public final h f11658b;

    /* renamed from: c  reason: collision with root package name */
    public final ConcurrentHashMap f11659c;

    /* renamed from: d  reason: collision with root package name */
    public final BigInteger f11660d;

    /* renamed from: e  reason: collision with root package name */
    public final BigInteger f11661e;

    /* renamed from: f  reason: collision with root package name */
    public final BigInteger f11662f;

    /* renamed from: g  reason: collision with root package name */
    public final ConcurrentHashMap f11663g;

    /* renamed from: h  reason: collision with root package name */
    public volatile String f11664h;

    /* renamed from: i  reason: collision with root package name */
    public volatile String f11665i;

    /* renamed from: j  reason: collision with root package name */
    public volatile String f11666j;

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f11667k;

    /* renamed from: m  reason: collision with root package name */
    public final String f11669m;

    /* renamed from: o  reason: collision with root package name */
    public final Map f11671o;

    /* renamed from: l  reason: collision with root package name */
    public boolean f11668l = false;

    /* renamed from: n  reason: collision with root package name */
    public final AtomicReference f11670n = new AtomicReference();

    public b(BigInteger bigInteger, i iVar, BigInteger bigInteger2, String str, String str2, int i10, String str3, Map map, LinkedHashMap linkedHashMap, h hVar, d dVar, Map map2) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f11663g = concurrentHashMap;
        String name = Thread.currentThread().getName();
        long id2 = Thread.currentThread().getId();
        this.f11657a = dVar;
        this.f11658b = hVar;
        this.f11660d = bigInteger;
        this.f11661e = iVar;
        this.f11662f = bigInteger2;
        if (map == null) {
            this.f11659c = new ConcurrentHashMap(0);
        } else {
            this.f11659c = new ConcurrentHashMap(map);
        }
        if (linkedHashMap != null) {
            concurrentHashMap.putAll(linkedHashMap);
        }
        this.f11671o = map2;
        h(str);
        this.f11666j = str2;
        this.f11665i = null;
        this.f11667k = false;
        this.f11669m = str3;
        if (i10 != Integer.MIN_VALUE) {
            g(i10);
        }
        if (str3 != null) {
            concurrentHashMap.put("_dd.origin", str3);
        }
        concurrentHashMap.put("thread.name", name);
        concurrentHashMap.put("thread.id", Long.valueOf(id2));
    }

    @Override // ff.d
    public final String a() {
        return this.f11661e.toString();
    }

    @Override // ff.d
    public final String b() {
        return this.f11660d.toString();
    }

    public final Map c() {
        Map map = (Map) this.f11670n.get();
        if (map == null) {
            return f11656p;
        }
        return map;
    }

    public final int d() {
        b bVar;
        a y10 = this.f11658b.y();
        if (y10 != null && (bVar = y10.f11651b) != this) {
            return bVar.d();
        }
        Number number = (Number) c().get("_sampling_priority_v1");
        if (number == null) {
            return Integer.MIN_VALUE;
        }
        return number.intValue();
    }

    public final boolean e() {
        boolean z10;
        b bVar;
        a y10 = this.f11658b.y();
        if (y10 != null && (bVar = y10.f11651b) != this) {
            return bVar.e();
        }
        synchronized (this) {
            try {
                if (c().get("_sampling_priority_v1") != null && !this.f11668l) {
                    this.f11668l = true;
                }
                z10 = this.f11668l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public final void f(Number number, String str) {
        AtomicReference atomicReference = this.f11670n;
        if (atomicReference.get() == null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            while (!atomicReference.compareAndSet(null, concurrentHashMap) && atomicReference.get() == null) {
            }
        }
        if (number instanceof Float) {
            ((Map) atomicReference.get()).put(str, Double.valueOf(number.doubleValue()));
        } else {
            ((Map) atomicReference.get()).put(str, number);
        }
    }

    public final boolean g(int i10) {
        a y10;
        b bVar;
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        h hVar = this.f11658b;
        if (hVar != null && (y10 = hVar.y()) != null && (bVar = y10.f11651b) != this) {
            return bVar.g(i10);
        }
        synchronized (this) {
            try {
                if (this.f11668l) {
                    return false;
                }
                f(Integer.valueOf(i10), "_sampling_priority_v1");
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(String str) {
        if (this.f11671o.containsKey(str)) {
            this.f11664h = (String) this.f11671o.get(str);
        } else {
            this.f11664h = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r1 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void i(String str, Object obj) {
        if (obj != null) {
            try {
                if (!(obj instanceof String) || !((String) obj).isEmpty()) {
                    List<N6.a> list = (List) this.f11657a.f11690o0.get(str);
                    if (list != null) {
                        boolean z10 = true;
                        for (N6.a aVar : list) {
                            try {
                                z10 &= aVar.a(this, str, obj);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    this.f11663g.put(str, obj);
                    return;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f11663g.remove(str);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DDSpan [ t_id=");
        sb2.append(this.f11660d);
        sb2.append(", s_id=");
        sb2.append(this.f11661e);
        sb2.append(", p_id=");
        sb2.append(this.f11662f);
        sb2.append("] trace=");
        sb2.append(this.f11664h);
        sb2.append(Separators.SLASH);
        sb2.append(this.f11666j);
        sb2.append(Separators.SLASH);
        if (this.f11665i != null && !this.f11665i.isEmpty()) {
            str = this.f11665i;
        } else {
            str = this.f11666j;
        }
        sb2.append(str);
        sb2.append(" metrics=");
        sb2.append(new TreeMap(c()));
        if (this.f11667k) {
            sb2.append(" *errored*");
        }
        sb2.append(" tags=");
        sb2.append(new TreeMap(this.f11663g));
        return sb2.toString();
    }
}
