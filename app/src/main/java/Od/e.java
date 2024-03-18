package Od;

import Df.H;
import Ng.F;
import Qd.A;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.lifecycle.D;
import com.segment.analytics.kotlin.core.Settings;
import eh.AbstractC2911k;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class e implements Rd.j {
    public static final a Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public Qd.i f13694Y;

    /* renamed from: Z  reason: collision with root package name */
    public Context f13695Z;

    /* renamed from: h0  reason: collision with root package name */
    public A f13696h0;

    /* renamed from: i0  reason: collision with root package name */
    public kotlinx.serialization.json.c f13697i0;

    /* renamed from: j0  reason: collision with root package name */
    public kotlinx.serialization.json.c f13698j0;

    /* renamed from: k0  reason: collision with root package name */
    public kotlinx.serialization.json.c f13699k0;

    /* renamed from: l0  reason: collision with root package name */
    public kotlinx.serialization.json.c f13700l0;

    @Override // Rd.j
    public final com.segment.analytics.kotlin.core.a a(com.segment.analytics.kotlin.core.a aVar) {
        D d10 = new D(6);
        Vd.h.b(d10, aVar.d());
        kotlinx.serialization.json.c cVar = this.f13697i0;
        if (cVar != null) {
            d10.m("app", cVar);
            kotlinx.serialization.json.c cVar2 = this.f13699k0;
            if (cVar2 != null) {
                d10.m("device", cVar2);
                kotlinx.serialization.json.c cVar3 = this.f13698j0;
                if (cVar3 != null) {
                    d10.m("os", cVar3);
                    kotlinx.serialization.json.c cVar4 = this.f13700l0;
                    if (cVar4 != null) {
                        d10.m("screen", cVar4);
                        D d11 = new D(6);
                        Context context = this.f13695Z;
                        if (context != null) {
                            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                                Context context2 = this.f13695Z;
                                if (context2 != null) {
                                    Object systemService = context2.getSystemService("connectivity");
                                    if (systemService != null) {
                                        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                                        Network[] allNetworks = connectivityManager.getAllNetworks();
                                        AbstractC3557B.b0("connectivityManager.allNetworks", allNetworks);
                                        boolean z10 = false;
                                        boolean z11 = false;
                                        boolean z12 = false;
                                        for (Network network : allNetworks) {
                                            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                                            if (!z10 && (networkCapabilities == null || !networkCapabilities.hasTransport(1))) {
                                                z10 = false;
                                            } else {
                                                z10 = true;
                                            }
                                            if (!z12 && (networkCapabilities == null || !networkCapabilities.hasTransport(0))) {
                                                z12 = false;
                                            } else {
                                                z12 = true;
                                            }
                                            if (!z11 && (networkCapabilities == null || !networkCapabilities.hasTransport(2))) {
                                                z11 = false;
                                            } else {
                                                z11 = true;
                                            }
                                        }
                                        H.l0(d11, "wifi", Boolean.valueOf(z10));
                                        H.l0(d11, "bluetooth", Boolean.valueOf(z11));
                                        H.l0(d11, "cellular", Boolean.valueOf(z12));
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
                                    }
                                } else {
                                    AbstractC3557B.C2("context");
                                    throw null;
                                }
                            }
                            d10.m("network", d11.c());
                            H.k0(d10, "locale", Locale.getDefault().getLanguage() + '-' + Locale.getDefault().getCountry());
                            Vd.h.c(d10, "userAgent", System.getProperty("http.agent"));
                            Vd.h.c(d10, "timezone", TimeZone.getDefault().getID());
                            aVar.l(d10.c());
                            return aVar;
                        }
                        AbstractC3557B.C2("context");
                        throw null;
                    }
                    AbstractC3557B.C2("screen");
                    throw null;
                }
                AbstractC3557B.C2("os");
                throw null;
            }
            AbstractC3557B.C2("device");
            throw null;
        }
        AbstractC3557B.C2("app");
        throw null;
    }

    @Override // Rd.j
    public final void c(Settings settings, Rd.i iVar) {
        AbstractC3557B.J2(settings, iVar);
    }

    @Override // Rd.j
    public final void d(Qd.i iVar) {
        kotlinx.serialization.json.c cVar;
        Context context;
        String str;
        long longVersionCode;
        AbstractC3557B.t2(this, iVar);
        Qd.k kVar = iVar.f14610Y;
        Object obj = kVar.f14621b;
        AbstractC3557B.a0("null cannot be cast to non-null type android.content.Context", obj);
        this.f13695Z = (Context) obj;
        this.f13696h0 = iVar.h();
        boolean z10 = kVar.f14623d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kotlinx.serialization.json.d b10 = AbstractC2911k.b("Android");
        AbstractC3557B.c0("element", b10);
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) linkedHashMap.put("name", b10);
        kotlinx.serialization.json.d b11 = AbstractC2911k.b(Build.VERSION.RELEASE);
        AbstractC3557B.c0("element", b11);
        kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) linkedHashMap.put(ParameterNames.VERSION, b11);
        this.f13698j0 = new kotlinx.serialization.json.c(linkedHashMap);
        D d10 = new D(6);
        Context context2 = this.f13695Z;
        if (context2 != null) {
            DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
            H.m0(d10, "density", Float.valueOf(displayMetrics.density));
            H.m0(d10, "height", Integer.valueOf(displayMetrics.heightPixels));
            H.m0(d10, "width", Integer.valueOf(displayMetrics.widthPixels));
            this.f13700l0 = d10.c();
            try {
                context = this.f13695Z;
            } catch (PackageManager.NameNotFoundException unused) {
                cVar = Qd.p.f14647a;
            }
            if (context != null) {
                PackageManager packageManager = context.getPackageManager();
                Context context3 = this.f13695Z;
                if (context3 != null) {
                    PackageInfo packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
                    D d11 = new D(6);
                    Vd.h.c(d11, "name", packageInfo.applicationInfo.loadLabel(packageManager));
                    Vd.h.c(d11, ParameterNames.VERSION, packageInfo.versionName);
                    Vd.h.c(d11, "namespace", packageInfo.packageName);
                    if (Build.VERSION.SDK_INT >= 28) {
                        longVersionCode = packageInfo.getLongVersionCode();
                        str = String.valueOf(longVersionCode);
                    } else {
                        str = String.valueOf(packageInfo.versionCode);
                    }
                    H.k0(d11, "build", str);
                    cVar = d11.c();
                    this.f13697i0 = cVar;
                    A a5 = this.f13696h0;
                    if (a5 != null) {
                        String b12 = a5.b(9);
                        if (b12 == null) {
                            b12 = "";
                        }
                        D d12 = new D(6);
                        H.k0(d12, ParameterNames.ID, b12);
                        H.k0(d12, "manufacturer", Build.MANUFACTURER);
                        H.k0(d12, "model", Build.MODEL);
                        H.k0(d12, "name", Build.DEVICE);
                        H.k0(d12, "type", "android");
                        this.f13699k0 = d12.c();
                        if (b12.length() == 0) {
                            Qd.i iVar2 = this.f13694Y;
                            if (iVar2 != null) {
                                F b13 = iVar2.f14611Z.b();
                                Qd.i iVar3 = this.f13694Y;
                                if (iVar3 != null) {
                                    Ad.l.O0(b13, iVar3.f14611Z.d(), null, new d(this, z10, null), 2);
                                    return;
                                } else {
                                    AbstractC3557B.C2("analytics");
                                    throw null;
                                }
                            }
                            AbstractC3557B.C2("analytics");
                            throw null;
                        }
                        return;
                    }
                    AbstractC3557B.C2("storage");
                    throw null;
                }
                AbstractC3557B.C2("context");
                throw null;
            }
            AbstractC3557B.C2("context");
            throw null;
        }
        AbstractC3557B.C2("context");
        throw null;
    }

    @Override // Rd.j
    public final void e(Qd.i iVar) {
        AbstractC3557B.c0("<set-?>", iVar);
        this.f13694Y = iVar;
    }

    @Override // Rd.j
    public final Rd.h getType() {
        return Rd.h.f15443Y;
    }
}
