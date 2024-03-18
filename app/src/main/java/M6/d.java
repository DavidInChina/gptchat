package M6;

import N.b0;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.os.StrictMode;
import androidx.lifecycle.D;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import ff.AbstractC3029a;
import g6.C3201a;
import gf.AbstractC3260a;
import hf.C3421a;
import io.sentry.protocol.DebugImage;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentSkipListSet;
import x2.j;

/* loaded from: classes.dex */
public abstract class d implements ff.f, Closeable {

    /* renamed from: t0  reason: collision with root package name */
    public static final BigInteger f11679t0 = BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE);

    /* renamed from: u0  reason: collision with root package name */
    public static final BigInteger f11680u0 = BigInteger.ZERO;

    /* renamed from: Y  reason: collision with root package name */
    public final String f11681Y;

    /* renamed from: Z  reason: collision with root package name */
    public final U6.a f11682Z;

    /* renamed from: h0  reason: collision with root package name */
    public final T6.d f11683h0;

    /* renamed from: i0  reason: collision with root package name */
    public final ff.b f11684i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Map f11685j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Map f11686k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Map f11687l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f11688m0;

    /* renamed from: n0  reason: collision with root package name */
    public final j f11689n0;

    /* renamed from: o0  reason: collision with root package name */
    public final ConcurrentHashMap f11690o0;

    /* renamed from: p0  reason: collision with root package name */
    public final ConcurrentSkipListSet f11691p0;

    /* renamed from: q0  reason: collision with root package name */
    public final P6.h f11692q0;

    /* renamed from: r0  reason: collision with root package name */
    public final P6.g f11693r0;

    /* renamed from: s0  reason: collision with root package name */
    public final Random f11694s0;

    /* JADX WARN: Multi-variable type inference failed */
    public d(R6.b bVar, U6.a aVar, SecureRandom secureRandom) {
        T6.d dVar;
        R6.a aVar2;
        R6.a aVar3;
        R6.a aVar4;
        R6.a aVar5;
        R6.a aVar6;
        O6.b bVar2;
        String str;
        String str2;
        int i10 = 2;
        if (bVar.f15104j) {
            Double d10 = bVar.f15083X;
            if (d10 != null) {
                dVar = new T6.b(d10);
            } else {
                dVar = new T6.b(Double.valueOf(1.0d));
            }
        } else {
            dVar = new D(4);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = bVar.f15066C.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            aVar2 = R6.a.f15055j0;
            aVar3 = R6.a.f15054i0;
            aVar4 = R6.a.f15053h0;
            aVar5 = R6.a.f15052Z;
            aVar6 = R6.a.f15051Y;
            if (!hasNext) {
                break;
            }
            R6.a aVar7 = (R6.a) it.next();
            if (aVar7 == aVar6) {
                arrayList.add(new P6.b(2));
            } else if (aVar7 == aVar5) {
                arrayList.add(new P6.b(0));
            } else if (aVar7 == aVar4) {
                arrayList.add(new P6.b(1));
            } else if (aVar7 == aVar3) {
                arrayList.add(new P6.b(4));
            } else if (aVar7 == aVar2) {
                arrayList.add(new P6.b(3));
            }
        }
        P6.f fVar = new P6.f(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (R6.a aVar8 : bVar.f15065B) {
            Map map = bVar.f15117q;
            if (aVar8 == aVar6) {
                arrayList2.add(new P6.a(map, i10));
            } else if (aVar8 == aVar5) {
                arrayList2.add(new P6.a(map, 0));
            } else if (aVar8 == aVar4) {
                arrayList2.add(new P6.a(map, 1));
            } else {
                if (aVar8 == aVar3) {
                    arrayList2.add(new P6.a(map, 4));
                } else if (aVar8 == aVar2) {
                    arrayList2.add(new P6.a(map, 3));
                }
                i10 = 2;
            }
        }
        P6.a aVar9 = new P6.a(arrayList2);
        int intValue = R6.b.f15063v0.f15125y.intValue();
        try {
            bVar2 = (O6.b) Class.forName("com.datadog.opentracing.jfr.openjdk.ScopeEventFactory").newInstance();
        } catch (ClassFormatError | NoClassDefFoundError | ReflectiveOperationException unused) {
            bVar2 = new Object();
        }
        Q6.a aVar10 = new Q6.a(intValue, bVar2);
        HashMap hashMap = new HashMap(3, 1.0f);
        hashMap.put("runtime-id", bVar.f15086a);
        HashMap hashMap2 = new HashMap(Collections.unmodifiableMap(hashMap));
        hashMap2.put("language", DebugImage.JVM);
        if (bVar.P) {
            if (System.getProperty("os.name").startsWith("Windows")) {
                str = System.getenv("COMPUTERNAME");
            } else {
                str = System.getenv("HOSTNAME");
            }
            String str3 = str;
            if (str3 != null && !str3.isEmpty()) {
                str2 = str3.trim();
            } else {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("hostname").getInputStream()));
                    str3 = bufferedReader.readLine();
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                if (str3 != null && !str3.isEmpty()) {
                    str2 = str3.trim();
                } else {
                    try {
                        str2 = InetAddress.getLocalHost().getHostName();
                    } catch (UnknownHostException unused3) {
                        str2 = null;
                    }
                }
            }
            if (str2 != null && !str2.isEmpty()) {
                hashMap2.put("_dd.hostname", str2);
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap2);
        Map map2 = bVar.f15110m;
        int size = map2.size();
        Map map3 = bVar.f15112n;
        HashMap hashMap3 = new HashMap(map3.size() + size + 1, 1.0f);
        hashMap3.putAll(map2);
        hashMap3.putAll(map3);
        Map unmodifiableMap2 = Collections.unmodifiableMap(hashMap3);
        int intValue2 = bVar.f15126z.intValue();
        this.f11690o0 = new ConcurrentHashMap();
        this.f11691p0 = new ConcurrentSkipListSet(new b0(4, this));
        this.f11694s0 = secureRandom;
        this.f11681Y = bVar.f15090c;
        this.f11682Z = aVar;
        this.f11683h0 = dVar;
        this.f11692q0 = fVar;
        this.f11693r0 = aVar9;
        this.f11684i0 = aVar10;
        this.f11685j0 = unmodifiableMap;
        this.f11686k0 = unmodifiableMap2;
        this.f11687l0 = bVar.f15108l;
        this.f11688m0 = intValue2;
        j jVar = new j(this, 0);
        this.f11689n0 = jVar;
        try {
            Runtime.getRuntime().addShutdownHook(jVar);
        } catch (IllegalStateException unused4) {
        }
        ArrayList arrayList3 = new ArrayList();
        for (N6.a aVar11 : Arrays.asList(new N6.b(0), new N6.b(1), new N6.b(2), new N6.b(3), new N6.c("service.name", false), new N6.c(ReferencesHeader.SERVICE, false), new N6.b(4))) {
            R6.b bVar3 = R6.b.f15063v0;
            String simpleName = aVar11.getClass().getSimpleName();
            bVar3.getClass();
            String A10 = android.gov.nist.core.a.A("trace.", simpleName, ".enabled");
            Boolean bool = Boolean.TRUE;
            if (R6.b.b(A10, bool).booleanValue()) {
                if (R6.b.b("trace." + simpleName.toLowerCase(Locale.US) + ".enabled", bool).booleanValue()) {
                    arrayList3.add(aVar11);
                }
            }
        }
        for (String str4 : R6.b.f15063v0.f15124x) {
            arrayList3.add(new N6.c(str4, true));
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            N6.a aVar12 = (N6.a) it2.next();
            String str5 = aVar12.f12718a;
            ConcurrentHashMap concurrentHashMap = this.f11690o0;
            List list = (List) concurrentHashMap.get(str5);
            if (list == null) {
                list = new ArrayList();
            }
            list.add(aVar12);
            concurrentHashMap.put(aVar12.f12718a, list);
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        try {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            Iterator it3 = ServiceLoader.load(S6.b.class, systemClassLoader).iterator();
            while (it3.hasNext()) {
                AbstractC2469q0.p(it3.next());
                this.f11691p0.add(null);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (ServiceConfigurationError unused5) {
        }
        f fVar2 = (f) h.f11697p0.getAndSet(new f());
        if (fVar2 != null) {
            fVar2.run();
        }
    }

    @Override // ff.f
    public final void B(ff.d dVar, C3201a c3201a) {
        b bVar = (b) dVar;
        a(bVar.f11658b.y());
        this.f11692q0.a(bVar, c3201a);
    }

    @Override // ff.f
    public final AbstractC3029a J(ff.c cVar) {
        AbstractC3029a dVar;
        Q6.a aVar = (Q6.a) this.f11684i0;
        AbstractC3029a a5 = aVar.a();
        if (a5 instanceof Q6.c) {
            if (aVar.f14439c <= ((Q6.c) a5).q0()) {
                return AbstractC3260a.f31614z;
            }
        }
        synchronized (aVar.f14437a) {
            Iterator it = aVar.f14437a.iterator();
            if (it.hasNext()) {
                AbstractC2469q0.p(it.next());
                throw null;
            }
        }
        if (cVar instanceof a) {
            dVar = new Q6.b(aVar, (a) cVar, aVar.f14440d);
        } else {
            dVar = new Q6.d(aVar, cVar);
        }
        return dVar;
    }

    public final void a(a aVar) {
        String str;
        boolean z10;
        if ((this.f11683h0 instanceof T6.b) && aVar != null && aVar.f11651b.d() == Integer.MIN_VALUE) {
            T6.b bVar = (T6.b) this.f11683h0;
            bVar.getClass();
            String str2 = aVar.f11651b.f11664h;
            if (aVar.f().get("env") == null) {
                str = "";
            } else {
                str = String.valueOf(aVar.f().get("env"));
            }
            String k10 = android.gov.nist.core.a.k("service:", str2, ",env:", str);
            Map map = bVar.f16927a;
            T6.c cVar = (T6.c) bVar.f16927a.get(k10);
            if (cVar == null) {
                cVar = (T6.c) map.get("service:,env:");
            }
            T6.a aVar2 = (T6.a) cVar;
            if (aVar2.a(aVar)) {
                z10 = aVar.f11651b.g(1);
            } else {
                z10 = aVar.f11651b.g(0);
            }
            if (z10) {
                aVar.f11651b.f(Double.valueOf(aVar2.f16926b), "_dd.agent_psr");
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f fVar = (f) h.f11697p0.getAndSet(null);
        if (fVar != null) {
            fVar.run();
        }
        this.f11682Z.close();
    }

    public final void finalize() {
        try {
            Runtime runtime = Runtime.getRuntime();
            j jVar = this.f11689n0;
            runtime.removeShutdownHook(jVar);
            jVar.run();
        } catch (Exception unused) {
        }
    }

    public final void h(Collection collection) {
        ArrayList arrayList;
        if (collection.isEmpty()) {
            return;
        }
        ConcurrentSkipListSet concurrentSkipListSet = this.f11691p0;
        if (concurrentSkipListSet.isEmpty()) {
            arrayList = new ArrayList(collection);
        } else {
            ArrayList arrayList2 = new ArrayList(collection);
            Iterator it = concurrentSkipListSet.iterator();
            if (!it.hasNext()) {
                arrayList = new ArrayList(arrayList2.size());
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    S6.a aVar = (S6.a) it2.next();
                    if (aVar instanceof a) {
                        arrayList.add((a) aVar);
                    }
                }
            } else {
                AbstractC2469q0.p(it.next());
                throw null;
            }
        }
        U6.a aVar2 = this.f11682Z;
        aVar2.getClass();
        if (!arrayList.isEmpty()) {
            a y10 = ((a) arrayList.get(0)).f11651b.f11658b.y();
            a(y10);
            if (y10 == null) {
                y10 = (a) arrayList.get(0);
            }
            if (this.f11683h0.a(y10)) {
                aVar2.L0(arrayList);
            }
        }
    }

    @Override // ff.f
    public final ff.d k0(C3421a c3421a) {
        return ((P6.a) this.f11693r0).a(c3421a);
    }

    public String toString() {
        return "DDTracer-" + Integer.toHexString(hashCode()) + "{ serviceName=" + this.f11681Y + ", writer=" + this.f11682Z + ", sampler=" + this.f11683h0 + ", defaultSpanTags=" + this.f11686k0 + '}';
    }
}
