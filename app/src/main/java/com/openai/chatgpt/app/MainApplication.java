package com.openai.chatgpt.app;

import Ad.l;
import Hi.m;
import Hi.n;
import Ii.q;
import L4.a;
import S4.o;
import android.app.Application;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.SystemClock;
import com.pairip.StartupLauncher;
import ed.C2877c;
import f4.j;
import f9.p;
import hd.C3411e;
import i9.AbstractC3509a;
import i9.C3511c;
import i9.C3513e;
import i9.C3514f;
import id.AbstractC3557B;
import io.sentry.C3640e;
import io.sentry.EnumC3642e1;
import io.sentry.G;
import io.sentry.L0;
import io.sentry.android.core.AbstractC3612c;
import io.sentry.android.core.C3617h;
import io.sentry.android.core.S;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.performance.b;
import io.sentry.android.core.performance.c;
import j9.C3928d;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import ld.g;
import od.AbstractC4991b;
import od.EnumC4990a;
import s3.AbstractC5568s;
import w.C6053E;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/openai/chatgpt/app/MainApplication;", "Landroid/app/Application;", "Lf4/j;", "<init>", "()V", "app_googlePlayRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class MainApplication extends Application implements j {

    /* renamed from: Y  reason: collision with root package name */
    public p f27652Y;

    static {
        StartupLauncher.launch();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [io.sentry.android.core.N, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [k9.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, P5.c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, P5.c] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, P5.c] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, P5.c] */
    @Override // android.app.Application
    public final void onCreate() {
        EnumC4990a enumC4990a;
        List list;
        b bVar = b.f34207j;
        long uptimeMillis = SystemClock.uptimeMillis();
        c cVar = b.b().f34211d;
        if (cVar.f34218h0 == 0) {
            cVar.c(uptimeMillis);
            AbstractC3612c.k();
        }
        C3411e c3411e = new C3411e("production");
        int i10 = S.f34026b;
        ?? obj = new Object();
        synchronized (S.class) {
            try {
                try {
                    L0.e(new o(15, SentryAndroidOptions.class), new C3617h(obj, this, c3411e));
                    G c10 = L0.c();
                    if (c10.s().isEnableAutoSessionTracking() && AbstractC3612c.k()) {
                        C3640e c3640e = new C3640e();
                        c3640e.f34320h0 = ParameterNames.SESSION;
                        c3640e.a("state", "session.start");
                        c3640e.f34322j0 = "app.lifecycle";
                        c3640e.f34323k0 = EnumC3642e1.INFO;
                        c10.i(c3640e);
                        c10.B();
                    }
                } catch (IllegalAccessException e10) {
                    obj.d(EnumC3642e1.FATAL, "Fatal error during SentryAndroid.init(...)", e10);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e10);
                } catch (InvocationTargetException e11) {
                    obj.d(EnumC3642e1.FATAL, "Fatal error during SentryAndroid.init(...)", e11);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e11);
                }
            } catch (InstantiationException e12) {
                obj.d(EnumC3642e1.FATAL, "Fatal error during SentryAndroid.init(...)", e12);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e12);
            } catch (NoSuchMethodException e13) {
                obj.d(EnumC3642e1.FATAL, "Fatal error during SentryAndroid.init(...)", e13);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e13);
            }
        }
        L0.b(5000L);
        AbstractC5568s.f45336D = false;
        p pVar = new p(new Object(), new Object(), new Object(), new Object(), new Object(), new q(5), this);
        this.f27652Y = pVar;
        g.f38286a.a(pVar);
        C3928d c3928d = C3928d.f36085Y;
        C3928d.f36086Z = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(c3928d);
        m mVar = n.f7898a;
        Object obj2 = new Object();
        mVar.getClass();
        m.f7897b.add(obj2);
        super.onCreate();
        p pVar2 = this.f27652Y;
        if (pVar2 != null) {
            C3514f c3514f = (C3514f) pVar2.f29899b0.get();
            if (!c3514f.f32892d.getAndSet(true)) {
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : c3514f.f32890b) {
                    if (((AbstractC4991b) obj3).a() != null) {
                        arrayList.add(obj3);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    EnumC4990a a5 = ((AbstractC4991b) next).a();
                    Object obj4 = linkedHashMap.get(a5);
                    if (obj4 == null) {
                        obj4 = new ArrayList();
                        linkedHashMap.put(a5, obj4);
                    }
                    ((List) obj4).add(next);
                }
                Iterator it2 = AbstractC3509a.f32879a.iterator();
                do {
                    C6053E c6053e = (C6053E) it2;
                    if (c6053e.hasNext()) {
                        enumC4990a = (EnumC4990a) c6053e.next();
                        if (linkedHashMap.containsKey(enumC4990a)) {
                            list = (List) linkedHashMap.get(enumC4990a);
                            if (list == null) {
                                break;
                            }
                        } else {
                            throw new IllegalArgumentException(("There is no initializer for " + enumC4990a + "!").toString());
                        }
                    } else {
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            ((AbstractC4991b) it3.next()).e();
                        }
                        l.O0(c3514f.f32889a, null, null, new C3511c(c3514f, null), 3);
                        a.E0(a.F0(new C3513e(c3514f, null), ((C2877c) c3514f.f32891c).f29281c), c3514f.f32889a);
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        b b10 = b.b();
                        if (b10.f34211d.a()) {
                            String concat = MainApplication.class.getName().concat(".onCreate");
                            c cVar2 = b10.f34211d;
                            cVar2.f34216Y = concat;
                            cVar2.f34219i0 = uptimeMillis2;
                            return;
                        }
                        return;
                    }
                } while (list.size() == 1);
                throw new IllegalArgumentException(("There are multiple initializers for " + enumC4990a + "!").toString());
            }
            throw new IllegalArgumentException("Initialize may only be called once!".toString());
        }
        AbstractC3557B.C2("appComponent");
        throw null;
    }
}
