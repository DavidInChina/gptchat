package Od;

import Df.H;
import Ng.F;
import Ng.Q;
import Qd.A;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.C2088x;
import androidx.lifecycle.D;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.S;
import com.segment.analytics.kotlin.core.Settings;
import eh.AbstractC2911k;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class u implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver, Rd.j {
    public static final i Companion = new Object();

    /* renamed from: r0  reason: collision with root package name */
    public static final h f13727r0;

    /* renamed from: Y  reason: collision with root package name */
    public Qd.i f13728Y;

    /* renamed from: Z  reason: collision with root package name */
    public PackageInfo f13729Z;

    /* renamed from: h0  reason: collision with root package name */
    public Application f13730h0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f13733k0;

    /* renamed from: p0  reason: collision with root package name */
    public C2088x f13738p0;

    /* renamed from: q0  reason: collision with root package name */
    public A f13739q0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f13731i0 = true;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f13732j0 = true;

    /* renamed from: l0  reason: collision with root package name */
    public final AtomicBoolean f13734l0 = new AtomicBoolean(false);

    /* renamed from: m0  reason: collision with root package name */
    public final AtomicInteger f13735m0 = new AtomicInteger(1);

    /* renamed from: n0  reason: collision with root package name */
    public final AtomicBoolean f13736n0 = new AtomicBoolean(false);

    /* renamed from: o0  reason: collision with root package name */
    public final AtomicBoolean f13737o0 = new AtomicBoolean(false);

    /* JADX WARN: Type inference failed for: r0v0, types: [Od.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Od.h] */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.lifecycle.S, Od.g] */
    static {
        ?? obj = new Object();
        obj.f13702Y = new S();
        f13727r0 = obj;
    }

    @Override // Rd.j
    public final void c(Settings settings, Rd.i iVar) {
        AbstractC3557B.J2(settings, iVar);
    }

    @Override // Rd.j
    public final void d(Qd.i iVar) {
        Application application;
        AbstractC3557B.t2(this, iVar);
        Qd.k kVar = iVar.f14610Y;
        Object obj = kVar.f14621b;
        if (obj instanceof Application) {
            application = (Application) obj;
        } else {
            application = null;
        }
        if (application != null) {
            this.f13730h0 = application;
            this.f13731i0 = kVar.f14624e;
            this.f13732j0 = kVar.f14626g;
            this.f13733k0 = kVar.f14625f;
            this.f13739q0 = iVar.h();
            Application application2 = this.f13730h0;
            if (application2 != null) {
                PackageManager packageManager = application2.getPackageManager();
                AbstractC3557B.b0("application.packageManager", packageManager);
                try {
                    Application application3 = this.f13730h0;
                    if (application3 != null) {
                        PackageInfo packageInfo = packageManager.getPackageInfo(application3.getPackageName(), 0);
                        AbstractC3557B.b0("{\n            packageMan\u2026packageName, 0)\n        }", packageInfo);
                        this.f13729Z = packageInfo;
                        Application application4 = this.f13730h0;
                        if (application4 != null) {
                            application4.registerActivityLifecycleCallbacks(this);
                            if (this.f13733k0) {
                                this.f13738p0 = ProcessLifecycleOwner.f25313n0.f25319k0;
                                zc.u uVar = new zc.u(7, this);
                                F b10 = f().f14611Z.b();
                                Tg.e eVar = Q.f12904a;
                                Ad.l.O0(b10, Sg.u.f16684a, null, new s(uVar, null), 2);
                                return;
                            }
                            return;
                        }
                        AbstractC3557B.C2(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
                        throw null;
                    }
                    AbstractC3557B.C2(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
                    throw null;
                } catch (PackageManager.NameNotFoundException unused) {
                    StringBuilder sb2 = new StringBuilder("Package not found: ");
                    Application application5 = this.f13730h0;
                    if (application5 == null) {
                        AbstractC3557B.C2(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
                        throw null;
                    }
                    sb2.append(application5.getPackageName());
                    AssertionError assertionError = new AssertionError(sb2.toString());
                    AbstractC4344b.W0(iVar, assertionError);
                    throw assertionError;
                }
            }
            AbstractC3557B.C2(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
            throw null;
        }
        throw new IllegalStateException("no android application context registered".toString());
    }

    @Override // Rd.j
    public final void e(Qd.i iVar) {
        AbstractC3557B.c0("<set-?>", iVar);
        this.f13728Y = iVar;
    }

    public final Qd.i f() {
        Qd.i iVar = this.f13728Y;
        if (iVar != null) {
            return iVar;
        }
        AbstractC3557B.C2("analytics");
        throw null;
    }

    public final void g(wf.k kVar) {
        Qd.m mVar = f().f14611Z;
        Ad.l.O0(mVar.b(), mVar.d(), null, new r(kVar, null), 2);
    }

    @Override // Rd.j
    public final Rd.h getType() {
        return Rd.h.f15447j0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent;
        AbstractC3557B.c0("activity", activity);
        String str = null;
        g(new k(this, activity, bundle, null));
        if (!this.f13733k0) {
            onCreate(f13727r0);
        }
        if (this.f13732j0 && (intent = activity.getIntent()) != null) {
            Uri referrer = activity.getReferrer();
            if (referrer != null) {
                str = referrer.toString();
            }
            Qd.i f6 = f();
            if (intent.getData() != null) {
                D d10 = new D(6);
                if (str != null) {
                    H.k0(d10, "referrer", str);
                }
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        for (String str2 : data.getQueryParameterNames()) {
                            String queryParameter = data.getQueryParameter(str2);
                            if (queryParameter != null && Lg.n.U2(queryParameter).toString().length() > 0) {
                                AbstractC3557B.b0("parameter", str2);
                                H.k0(d10, str2, queryParameter);
                            }
                        }
                    }
                    H.k0(d10, "url", data.toString());
                }
                f6.k("Deep Link Opened", d10.c());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        g(new l(this, activity, null));
        if (!this.f13733k0) {
            onDestroy(f13727r0);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        g(new m(this, activity, null));
        if (!this.f13733k0) {
            onPause(f13727r0);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        g(new n(this, activity, null));
        if (!this.f13733k0) {
            onStart(f13727r0);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC3557B.c0("activity", activity);
        AbstractC3557B.c0("bundle", bundle);
        g(new o(this, activity, bundle, null));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        g(new p(this, activity, null));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        g(new q(this, activity, null));
        if (!this.f13733k0) {
            onStop(f13727r0);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(AbstractC2086v abstractC2086v) {
        Object obj;
        long longVersionCode;
        AbstractC3557B.c0("owner", abstractC2086v);
        if (!this.f13734l0.getAndSet(true) && this.f13731i0) {
            this.f13735m0.set(0);
            this.f13736n0.set(true);
            PackageInfo packageInfo = this.f13729Z;
            if (packageInfo != null) {
                String str = packageInfo.versionName;
                if (Build.VERSION.SDK_INT >= 28) {
                    longVersionCode = packageInfo.getLongVersionCode();
                    obj = Long.valueOf(longVersionCode);
                } else {
                    obj = Integer.valueOf(packageInfo.versionCode);
                }
                String obj2 = obj.toString();
                A a5 = this.f13739q0;
                if (a5 != null) {
                    String b10 = a5.b(6);
                    A a10 = this.f13739q0;
                    if (a10 != null) {
                        String b11 = a10.b(7);
                        A a11 = this.f13739q0;
                        if (a11 != null) {
                            String b12 = a11.b(8);
                            if (b11 == null && b12 == null) {
                                Qd.i f6 = f();
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                kotlinx.serialization.json.d b13 = AbstractC2911k.b(str);
                                AbstractC3557B.c0("element", b13);
                                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) linkedHashMap.put(ParameterNames.VERSION, b13);
                                kotlinx.serialization.json.d b14 = AbstractC2911k.b(obj2);
                                AbstractC3557B.c0("element", b14);
                                kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) linkedHashMap.put("build", b14);
                                f6.k("Application Installed", new kotlinx.serialization.json.c(linkedHashMap));
                            } else if (!AbstractC3557B.K(obj2, b11)) {
                                Qd.i f10 = f();
                                D d10 = new D(6);
                                H.k0(d10, ParameterNames.VERSION, str);
                                H.k0(d10, "build", obj2);
                                H.k0(d10, "previous_version", b10);
                                H.k0(d10, "previous_build", String.valueOf(b11));
                                f10.k("Application Updated", d10.c());
                            }
                            g(new t(this, str, obj2, null));
                            return;
                        }
                        AbstractC3557B.C2("storage");
                        throw null;
                    }
                    AbstractC3557B.C2("storage");
                    throw null;
                }
                AbstractC3557B.C2("storage");
                throw null;
            }
            AbstractC3557B.C2("packageInfo");
            throw null;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(AbstractC2086v abstractC2086v) {
        AbstractC3557B.c0("owner", abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(AbstractC2086v abstractC2086v) {
        AbstractC3557B.c0("owner", abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(AbstractC2086v abstractC2086v) {
        AbstractC3557B.c0("owner", abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(AbstractC2086v abstractC2086v) {
        Object obj;
        long longVersionCode;
        AbstractC3557B.c0("owner", abstractC2086v);
        if (this.f13731i0 && this.f13735m0.incrementAndGet() == 1 && !this.f13737o0.get()) {
            D d10 = new D(6);
            AtomicBoolean atomicBoolean = this.f13736n0;
            if (atomicBoolean.get()) {
                PackageInfo packageInfo = this.f13729Z;
                if (packageInfo != null) {
                    H.k0(d10, ParameterNames.VERSION, packageInfo.versionName);
                    PackageInfo packageInfo2 = this.f13729Z;
                    if (packageInfo2 != null) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            longVersionCode = packageInfo2.getLongVersionCode();
                            obj = Long.valueOf(longVersionCode);
                        } else {
                            obj = Integer.valueOf(packageInfo2.versionCode);
                        }
                        H.k0(d10, "build", obj.toString());
                    } else {
                        AbstractC3557B.C2("packageInfo");
                        throw null;
                    }
                } else {
                    AbstractC3557B.C2("packageInfo");
                    throw null;
                }
            }
            H.l0(d10, "from_background", Boolean.valueOf(true ^ atomicBoolean.getAndSet(false)));
            f().k("Application Opened", d10.c());
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(AbstractC2086v abstractC2086v) {
        AbstractC3557B.c0("owner", abstractC2086v);
        if (this.f13731i0 && this.f13735m0.decrementAndGet() == 0 && !this.f13737o0.get()) {
            f().k("Application Backgrounded", Qd.p.f14647a);
        }
    }

    @Override // Rd.j
    public final com.segment.analytics.kotlin.core.a a(com.segment.analytics.kotlin.core.a aVar) {
        return aVar;
    }
}
