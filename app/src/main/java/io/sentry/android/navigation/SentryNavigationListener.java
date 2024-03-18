package io.sentry.android.navigation;

import C2.r;
import Lg.n;
import P4.a;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import i8.C3493k;
import id.AbstractC3557B;
import io.sentry.A;
import io.sentry.A1;
import io.sentry.C1;
import io.sentry.C3636c1;
import io.sentry.C3640e;
import io.sentry.C3686u;
import io.sentry.E0;
import io.sentry.EnumC3642e1;
import io.sentry.G;
import io.sentry.I1;
import io.sentry.J1;
import io.sentry.T;
import io.sentry.protocol.B;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kf.w;
import kotlin.Metadata;
import r.f;
import s3.AbstractC5540C;
import s3.AbstractC5566p;
import s3.AbstractC5568s;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/sentry/android/navigation/SentryNavigationListener;", "Ls3/p;", "xe/t", "sentry-android-navigation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SentryNavigationListener implements AbstractC5566p {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f34267b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f34268c;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference f34270e;

    /* renamed from: f  reason: collision with root package name */
    public Bundle f34271f;

    /* renamed from: g  reason: collision with root package name */
    public T f34272g;

    /* renamed from: a  reason: collision with root package name */
    public final G f34266a = A.f33710a;

    /* renamed from: d  reason: collision with root package name */
    public final String f34269d = "jetpack_compose";

    public SentryNavigationListener(boolean z10, boolean z11) {
        this.f34267b = z10;
        this.f34268c = z11;
        f.e(SentryNavigationListener.class);
        C3636c1.l().c("maven:io.sentry:sentry-android-navigation");
    }

    public static Map b(Bundle bundle) {
        if (bundle != null) {
            Set<String> keySet = bundle.keySet();
            AbstractC3557B.b0("args.keySet()", keySet);
            ArrayList arrayList = new ArrayList();
            for (Object obj : keySet) {
                if (!AbstractC3557B.K((String) obj, "android-support-nav:controller:deepLinkIntent")) {
                    arrayList.add(obj);
                }
            }
            int n02 = a.n0(AbstractC6583a.H1(arrayList, 10));
            if (n02 < 16) {
                n02 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                linkedHashMap.put(next, bundle.get((String) next));
            }
            return linkedHashMap;
        }
        return w.f37484Y;
    }

    @Override // s3.AbstractC5566p
    public final void a(AbstractC5568s abstractC5568s, AbstractC5540C abstractC5540C, Bundle bundle) {
        String str;
        String str2;
        AbstractC5540C abstractC5540C2;
        AbstractC3557B.c0("controller", abstractC5568s);
        AbstractC3557B.c0("destination", abstractC5540C);
        Map b10 = b(bundle);
        boolean z10 = this.f34267b;
        G g10 = this.f34266a;
        if (z10) {
            C3640e c3640e = new C3640e();
            c3640e.f34320h0 = "navigation";
            c3640e.f34322j0 = "navigation";
            WeakReference weakReference = this.f34270e;
            if (weakReference != null && (abstractC5540C2 = (AbstractC5540C) weakReference.get()) != null) {
                str2 = abstractC5540C2.f45222m0;
            } else {
                str2 = null;
            }
            if (str2 != null) {
                Map map = c3640e.f34321i0;
                AbstractC3557B.b0("data", map);
                map.put("from", Separators.SLASH.concat(str2));
            }
            Map b11 = b(this.f34271f);
            if (!b11.isEmpty()) {
                Map map2 = c3640e.f34321i0;
                AbstractC3557B.b0("data", map2);
                map2.put("from_arguments", b11);
            }
            String str3 = abstractC5540C.f45222m0;
            if (str3 != null) {
                Map map3 = c3640e.f34321i0;
                AbstractC3557B.b0("data", map3);
                map3.put("to", Separators.SLASH.concat(str3));
            }
            if (!b10.isEmpty()) {
                Map map4 = c3640e.f34321i0;
                AbstractC3557B.b0("data", map4);
                map4.put("to_arguments", b10);
            }
            c3640e.f34323k0 = EnumC3642e1.INFO;
            C3686u c3686u = new C3686u();
            c3686u.c("android:navigationDestination", abstractC5540C);
            g10.o(c3640e, c3686u);
        }
        if (g10.s().isTracingEnabled() && this.f34268c) {
            T t10 = this.f34272g;
            if (t10 != null) {
                C1 a5 = t10.a();
                if (a5 == null) {
                    a5 = C1.OK;
                }
                AbstractC3557B.b0("activeTransaction?.status ?: SpanStatus.OK", a5);
                T t11 = this.f34272g;
                if (t11 != null) {
                    t11.j(a5);
                }
                g10.p(new C3493k(6, this));
                this.f34272g = null;
            }
            if (AbstractC3557B.K(abstractC5540C.f45215Y, "activity")) {
                g10.s().getLogger().f(EnumC3642e1.DEBUG, "Navigating to activity destination, no transaction captured.", new Object[0]);
            } else {
                String str4 = abstractC5540C.f45222m0;
                if (str4 == null) {
                    try {
                        str4 = abstractC5568s.f45340a.getResources().getResourceEntryName(abstractC5540C.f45221l0);
                    } catch (Resources.NotFoundException unused) {
                        g10.s().getLogger().f(EnumC3642e1.DEBUG, "Destination id cannot be retrieved from Resources, no transaction captured.", new Object[0]);
                    }
                }
                AbstractC3557B.b0("name", str4);
                String concat = Separators.SLASH.concat(n.R2(str4, '/'));
                J1 j12 = new J1();
                j12.f33811f = true;
                j12.f33812g = g10.s().getIdleTimeout();
                j12.f33813h = 300000L;
                j12.f552b = true;
                final T m10 = g10.m(new I1(concat, B.ROUTE, "navigation", null), j12);
                AbstractC3557B.b0("hub.startTransaction(\n  \u2026nsactionOptions\n        )", m10);
                A1 s10 = m10.s();
                String str5 = this.f34269d;
                if (str5 == null || (str = "auto.navigation.".concat(str5)) == null) {
                    str = "auto.navigation";
                }
                s10.f33722n0 = str;
                if (!b10.isEmpty()) {
                    m10.e("arguments", b10);
                }
                g10.p(new E0() { // from class: io.sentry.y
                    @Override // io.sentry.E0
                    public final void f(N n10) {
                        T t12 = T.this;
                        AbstractC3557B.c0("$transaction", t12);
                        AbstractC3557B.c0("scope", n10);
                        D0 d02 = (D0) n10;
                        synchronized (d02.f33775n) {
                            if (d02.f33763b == null) {
                                ((D0) n10).b(t12);
                            }
                        }
                    }
                });
                this.f34272g = m10;
            }
        } else {
            g10.p(new r(5));
        }
        this.f34270e = new WeakReference(abstractC5540C);
        this.f34271f = bundle;
    }
}
