package U3;

import A2.RunnableC0065i;
import M3.w;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Insets;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowInsetsAnimation;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import i8.C3493k;
import id.AbstractC3557B;
import io.sentry.EnumC3642e1;
import io.sentry.H;
import io.sentry.android.core.AbstractC3612c;
import io.sentry.y1;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import jh.O1;
import l8.C4348f;
import l8.C4350h;
import l8.C4351i;
import p3.AbstractC5074B;
import p3.C5075C;
import p3.C5077E;
import p3.F;
import s1.C5523e;
import s2.z;
import u8.AbstractC5856f;
import u8.AbstractC5857g;
import x3.y;
import y2.C6520g;
import y2.SurfaceHolder$CallbackC6500C;

/* loaded from: classes.dex */
public final class l implements AbstractC5074B, m8.c, AbstractC5856f, K8.n, io.sentry.internal.debugmeta.a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f17422Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f17423Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f17424h0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l() {
        this(new Se.a(), O1.GCM);
        this.f17422Y = 21;
    }

    @Override // u8.AbstractC5857g
    public final /* bridge */ /* synthetic */ Object a() {
        return new o8.f((o8.p) ((AbstractC5857g) this.f17423Z).a(), (o8.t) ((AbstractC5857g) this.f17424h0).a());
    }

    @Override // p3.AbstractC5074B
    public final void b(s2.u uVar) {
        if (uVar.u() != 0 || (uVar.u() & 128) == 0) {
            return;
        }
        uVar.G(6);
        int a5 = uVar.a() / 4;
        for (int i10 = 0; i10 < a5; i10++) {
            s2.t tVar = (s2.t) this.f17423Z;
            uVar.e(tVar.f45186b, 0, 4);
            tVar.p(0);
            int i11 = ((s2.t) this.f17423Z).i(16);
            ((s2.t) this.f17423Z).s(3);
            if (i11 == 0) {
                ((s2.t) this.f17423Z).s(13);
            } else {
                int i12 = ((s2.t) this.f17423Z).i(13);
                if (((F) this.f17424h0).f42416e.get(i12) == null) {
                    F f6 = (F) this.f17424h0;
                    f6.f42416e.put(i12, new C5075C(new C5077E(f6, i12)));
                    ((F) this.f17424h0).f42422k++;
                }
            }
        }
        F f10 = (F) this.f17424h0;
        f10.getClass();
        f10.f42416e.remove(0);
    }

    @Override // io.sentry.internal.debugmeta.a
    public final List d() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(((Context) this.f17423Z).getAssets().open("sentry-debug-meta.properties"));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                List singletonList = Collections.singletonList(properties);
                bufferedInputStream.close();
                return singletonList;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException e10) {
            ((H) this.f17424h0).b(EnumC3642e1.INFO, e10, "%s file was not found.", "sentry-debug-meta.properties");
            return null;
        } catch (IOException e11) {
            ((H) this.f17424h0).d(EnumC3642e1.ERROR, "Error getting Proguard UUIDs.", e11);
            return null;
        } catch (RuntimeException e12) {
            ((H) this.f17424h0).b(EnumC3642e1.ERROR, e12, "%s file is malformed.", "sentry-debug-meta.properties");
            return null;
        }
    }

    public final void e(String str, Object obj) {
        ((List) this.f17423Z).add(android.gov.nist.core.a.j(str, Separators.EQUALS, String.valueOf(obj)));
    }

    public final E8.c f() {
        Map map;
        String str = (String) this.f17423Z;
        if (((Map) this.f17424h0) == null) {
            map = Collections.emptyMap();
        } else {
            map = Collections.unmodifiableMap(new HashMap((Map) this.f17424h0));
        }
        return new E8.c(str, map);
    }

    @Override // m8.c
    public final Object g() {
        Context context = ((C4348f) ((m8.c) this.f17423Z)).f37872Y.f24351a;
        if (context != null) {
            return new C4350h(context, (C4351i) ((m8.c) this.f17424h0).g());
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final void h(String str, Object obj) {
        obj.getClass();
        ((Map) this.f17423Z).put(str, obj);
        ((List) this.f17424h0).remove(str);
    }

    @Override // K8.n
    public final Object i() {
        throw new RuntimeException((String) this.f17423Z);
    }

    public final boolean j(j jVar) {
        boolean containsKey;
        synchronized (this.f17423Z) {
            containsKey = ((Map) this.f17424h0).containsKey(jVar);
        }
        return containsKey;
    }

    public final void k(C6520g c6520g) {
        synchronized (c6520g) {
        }
        Object obj = this.f17423Z;
        if (((Handler) obj) != null) {
            ((Handler) obj).post(new RunnableC0065i(this, c6520g, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CctBackendFactory l(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.f17424h0) == null) {
            Context context = (Context) this.f17423Z;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                AbstractC3612c.r("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                AbstractC3612c.r("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    AbstractC3612c.r("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        AbstractC3612c.r("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.emptyMap();
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(Separators.COMMA, -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.f17424h0 = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.f17424h0 = map;
        }
        String str4 = (String) ((Map) this.f17424h0).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e10) {
            AbstractC3612c.s("BackendRegistry", "Class " + str4 + " is not found.", e10);
            return null;
        } catch (IllegalAccessException e11) {
            AbstractC3612c.s("BackendRegistry", "Could not instantiate " + str4 + Separators.DOT, e11);
            return null;
        } catch (InstantiationException e12) {
            AbstractC3612c.s("BackendRegistry", "Could not instantiate " + str4 + Separators.DOT, e12);
            return null;
        } catch (NoSuchMethodException e13) {
            AbstractC3612c.s("BackendRegistry", "Could not instantiate ".concat(str4), e13);
            return null;
        } catch (InvocationTargetException e14) {
            AbstractC3612c.s("BackendRegistry", "Could not instantiate ".concat(str4), e14);
            return null;
        }
    }

    public final synchronized Object m() {
        try {
            if (this.f17423Z == null) {
                this.f17423Z = ((C3493k) this.f17424h0).a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f17423Z;
    }

    public final w n(j jVar) {
        w wVar;
        AbstractC3557B.c0(ParameterNames.ID, jVar);
        synchronized (this.f17423Z) {
            wVar = (w) ((Map) this.f17424h0).remove(jVar);
        }
        return wVar;
    }

    public final List o(String str) {
        List K22;
        AbstractC3557B.c0("workSpecId", str);
        synchronized (this.f17423Z) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((Map) this.f17424h0).entrySet()) {
                    if (AbstractC3557B.K(((j) entry.getKey()).f17418a, str)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (j jVar : linkedHashMap.keySet()) {
                    ((Map) this.f17424h0).remove(jVar);
                }
                K22 = kf.t.K2(linkedHashMap.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return K22;
    }

    public final w p(j jVar) {
        w wVar;
        synchronized (this.f17423Z) {
            try {
                Map map = (Map) this.f17424h0;
                Object obj = map.get(jVar);
                if (obj == null) {
                    obj = new w(jVar);
                    map.put(jVar, obj);
                }
                wVar = (w) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public final void q(H8.a aVar) {
        if (((Map) this.f17424h0) == null) {
            this.f17424h0 = new HashMap();
        }
        ((Map) this.f17424h0).put(H8.e.class, aVar);
    }

    public final String toString() {
        switch (this.f17422Y) {
            case 3:
                return "Bounds{lower=" + ((C5523e) this.f17423Z) + " upper=" + ((C5523e) this.f17424h0) + "}";
            case 15:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f17424h0.getClass().getSimpleName());
                sb2.append('{');
                int size = ((List) this.f17423Z).size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) ((List) this.f17423Z).get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public l(int i10, int i11) {
        this.f17422Y = i10;
        if (i10 == 5) {
            this.f17423Z = new HashMap();
            this.f17424h0 = new ArrayList();
        } else if (i10 != 9) {
            this.f17423Z = new ArrayList();
            this.f17424h0 = new float[64];
        } else {
            this.f17423Z = new Object();
            this.f17424h0 = new LinkedHashMap();
        }
    }

    public /* synthetic */ l(int i10, Object obj) {
        this.f17422Y = i10;
        this.f17424h0 = null;
        this.f17423Z = obj;
    }

    public /* synthetic */ l(R.a aVar) {
        this.f17422Y = 7;
    }

    public /* synthetic */ l(y1 y1Var, y1 y1Var2) {
        this.f17422Y = 22;
        this.f17424h0 = y1Var;
        this.f17423Z = y1Var2;
    }

    public /* synthetic */ l(Object obj, int i10, Object obj2) {
        this.f17422Y = i10;
        this.f17423Z = obj;
        this.f17424h0 = obj2;
    }

    public /* synthetic */ l(Object obj) {
        this.f17422Y = 15;
        A7.b.k0(obj);
        this.f17424h0 = obj;
        this.f17423Z = new ArrayList();
    }

    public l(P5.c cVar) {
        this.f17422Y = 12;
        this.f17423Z = cVar;
        this.f17424h0 = Charset.forName("UTF-8");
    }

    public l(C3493k c3493k) {
        this.f17422Y = 24;
        this.f17423Z = null;
        this.f17424h0 = c3493k;
    }

    public l(y yVar) {
        this.f17422Y = 0;
        this.f17423Z = yVar;
        this.f17424h0 = new b(this, yVar, 3);
    }

    public l(Se.a aVar, O1 o12) {
        this.f17422Y = 21;
        AbstractC3557B.c0("keyProvider", aVar);
        AbstractC3557B.c0("encryptionType", o12);
        this.f17423Z = aVar;
        this.f17424h0 = o12;
    }

    public l(Handler handler, SurfaceHolder$CallbackC6500C surfaceHolder$CallbackC6500C) {
        this.f17422Y = 6;
        this.f17423Z = handler;
        this.f17424h0 = surfaceHolder$CallbackC6500C;
    }

    public l(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.f17422Y = 3;
        lowerBound = bounds.getLowerBound();
        this.f17423Z = C5523e.c(lowerBound);
        upperBound = bounds.getUpperBound();
        this.f17424h0 = C5523e.c(upperBound);
    }

    public l(F f6) {
        this.f17422Y = 8;
        this.f17424h0 = f6;
        this.f17423Z = new s2.t(new byte[4], 0);
    }

    public l(Nh.r[] rVarArr) {
        this.f17422Y = 27;
        this.f17423Z = rVarArr;
        this.f17424h0 = new HashMap();
    }

    @Override // p3.AbstractC5074B
    public final void c(z zVar, L2.s sVar, p3.H h10) {
    }
}
