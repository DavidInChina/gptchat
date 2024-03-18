package U3;

import K4.C0820h;
import L2.G;
import L3.w;
import L3.z;
import V1.AbstractComponentCallbacksC1480v;
import V1.K;
import Z1.t0;
import android.content.Context;
import android.database.Cursor;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import androidx.lifecycle.E;
import cg.C2419j;
import cg.C2424o;
import cg.C2427r;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import dg.C2658G;
import g.RunnableC3115h;
import id.AbstractC3557B;
import io.sentry.C1;
import io.sentry.D1;
import io.sentry.EnumC3642e1;
import io.sentry.H;
import io.sentry.I1;
import io.sentry.L0;
import io.sentry.S;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import jf.C3959i;
import nf.AbstractC4828h;
import p2.C5064q;
import p2.C5065s;
import pf.AbstractC5163j;
import q6.C5279d;
import qh.AbstractC5327a;
import x3.C6270B;
import x3.y;
import yf.AbstractC6583a;
import z1.C6747f;
import z1.RunnableC6742a;

/* loaded from: classes.dex */
public final class e implements z, K8.n, io.sentry.internal.debugmeta.a, AbstractC5327a {

    /* renamed from: Y  reason: collision with root package name */
    public Object f17400Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f17401Z;

    public e(int i10) {
        if (i10 == 7) {
            this.f17400Y = new E();
            this.f17401Z = new Object();
            y(z.f10735o);
            return;
        }
        if (i10 != 15 && i10 != 11) {
            if (i10 == 12) {
                this.f17400Y = Boolean.FALSE;
            } else if (i10 == 18) {
                this.f17400Y = new AbstractC5163j(2, null);
            } else if (i10 != 19) {
                this.f17400Y = new ByteArrayOutputStream(512);
                this.f17401Z = new DataOutputStream((ByteArrayOutputStream) this.f17400Y);
            } else {
                this.f17400Y = new ArrayList();
                Boolean bool = Boolean.FALSE;
                this.f17401Z = new Boolean[]{bool, bool, bool};
            }
        }
    }

    public final void A(C6747f c6747f) {
        int i10 = c6747f.f51448b;
        if (i10 == 0) {
            ((Handler) this.f17401Z).post(new RunnableC6742a(this, (F4.a) this.f17400Y, c6747f.f51447a, 0));
        } else {
            ((Handler) this.f17401Z).post(new RunnableC3115h(this, (F4.a) this.f17400Y, i10, 4));
        }
    }

    public final D1 B() {
        return (D1) ((Deque) this.f17400Y).peek();
    }

    @Override // qh.AbstractC5327a
    public final void a(Q4.a aVar) {
        try {
            ((Field) this.f17401Z).set(aVar, 13);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Cannot access an Android dex file translation method", e10);
        }
    }

    public final C0820h b() {
        Object obj = this.f17400Y;
        if (((K4.q) obj) != null) {
            if (((K4.q) obj).f9468j != null && ((String) this.f17401Z) == null) {
                throw new NullPointerException("offerToken is required for constructing ProductDetailsParams for subscriptions.");
            }
            return new C0820h(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    public final boolean c(int i10) {
        return ((C5064q) this.f17400Y).f42219a.get(i10);
    }

    @Override // io.sentry.internal.debugmeta.a
    public final List d() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = ((ClassLoader) this.f17401Z).getResources("sentry-debug-meta.properties");
            while (resources.hasMoreElements()) {
                URL nextElement = resources.nextElement();
                try {
                    InputStream openStream = nextElement.openStream();
                    try {
                        Properties properties = new Properties();
                        properties.load(openStream);
                        arrayList.add(properties);
                        ((H) this.f17400Y).f(EnumC3642e1.INFO, "Debug Meta Data Properties loaded from %s", nextElement);
                        if (openStream != null) {
                            openStream.close();
                        }
                    } catch (Throwable th2) {
                        if (openStream != null) {
                            try {
                                openStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                        break;
                    }
                } catch (RuntimeException e10) {
                    ((H) this.f17400Y).b(EnumC3642e1.ERROR, e10, "%s file is malformed.", nextElement);
                }
            }
        } catch (IOException e11) {
            ((H) this.f17400Y).b(EnumC3642e1.ERROR, e11, "Failed to load %s", "sentry-debug-meta.properties");
        }
        if (arrayList.isEmpty()) {
            ((H) this.f17400Y).f(EnumC3642e1.INFO, "No %s file was found.", "sentry-debug-meta.properties");
            return null;
        }
        return arrayList;
    }

    public final void e(L2.s sVar, p3.H h10) {
        boolean z10;
        for (int i10 = 0; i10 < ((G[]) this.f17401Z).length; i10++) {
            h10.c();
            h10.i();
            G f6 = sVar.f(h10.f42432c, 3);
            C5065s c5065s = (C5065s) ((List) this.f17400Y).get(i10);
            String str = c5065s.f42319q0;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z10 = false;
            } else {
                z10 = true;
            }
            Gi.e.k("Invalid closed caption MIME type provided: " + str, z10);
            String str2 = c5065s.f42308Y;
            if (str2 == null) {
                str2 = h10.d();
            }
            p2.r rVar = new p2.r();
            rVar.f42227a = str2;
            rVar.f42237k = str;
            rVar.f42230d = c5065s.f42311i0;
            rVar.f42229c = c5065s.f42310h0;
            rVar.f42222C = c5065s.f42302I0;
            rVar.f42239m = c5065s.f42321s0;
            f6.b(new C5065s(rVar));
            ((G[]) this.f17401Z)[i10] = f6;
        }
    }

    public final void f(boolean z10) {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = ((K) this.f17401Z).f18066w;
        if (abstractComponentCallbacksC1480v != null) {
            abstractComponentCallbacksC1480v.o().f18056m.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17400Y).iterator();
        if (it.hasNext()) {
            AbstractC2469q0.p(it.next());
            if (z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void g(boolean z10) {
        K k10 = (K) this.f17401Z;
        Context context = k10.f18064u.f18309Z;
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = k10.f18066w;
        if (abstractComponentCallbacksC1480v != null) {
            abstractComponentCallbacksC1480v.o().f18056m.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17400Y).iterator();
        if (it.hasNext()) {
            AbstractC2469q0.p(it.next());
            if (z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void h(boolean z10) {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = ((K) this.f17401Z).f18066w;
        if (abstractComponentCallbacksC1480v != null) {
            abstractComponentCallbacksC1480v.o().f18056m.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17400Y).iterator();
        if (it.hasNext()) {
            AbstractC2469q0.p(it.next());
            if (z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // K8.n
    public final Object i() {
        throw new RuntimeException((String) this.f17400Y);
    }

    @Override // qh.AbstractC5327a
    public final void j(O4.a aVar, byte[] bArr, R4.a aVar2, Q4.a aVar3, S4.b bVar) {
        try {
            AbstractC2469q0.p(((Method) this.f17400Y).invoke(null, aVar, bArr, aVar2, aVar3, bVar));
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Cannot access an Android dex file translation method", e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException("Cannot invoke Android dex file translation method", e11.getTargetException());
        }
    }

    public final void k(boolean z10) {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = ((K) this.f17401Z).f18066w;
        if (abstractComponentCallbacksC1480v != null) {
            abstractComponentCallbacksC1480v.o().f18056m.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17400Y).iterator();
        if (it.hasNext()) {
            AbstractC2469q0.p(it.next());
            if (z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void l(boolean z10) {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = ((K) this.f17401Z).f18066w;
        if (abstractComponentCallbacksC1480v != null) {
            abstractComponentCallbacksC1480v.o().f18056m.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17400Y).iterator();
        if (it.hasNext()) {
            AbstractC2469q0.p(it.next());
            if (z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void m(boolean z10) {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = ((K) this.f17401Z).f18066w;
        if (abstractComponentCallbacksC1480v != null) {
            abstractComponentCallbacksC1480v.o().f18056m.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17400Y).iterator();
        if (it.hasNext()) {
            AbstractC2469q0.p(it.next());
            if (z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void n(boolean z10) {
        K k10 = (K) this.f17401Z;
        Context context = k10.f18064u.f18309Z;
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = k10.f18066w;
        if (abstractComponentCallbacksC1480v != null) {
            abstractComponentCallbacksC1480v.o().f18056m.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17400Y).iterator();
        if (it.hasNext()) {
            AbstractC2469q0.p(it.next());
            if (z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void o(boolean z10) {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = ((K) this.f17401Z).f18066w;
        if (abstractComponentCallbacksC1480v != null) {
            abstractComponentCallbacksC1480v.o().f18056m.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17400Y).iterator();
        if (it.hasNext()) {
            AbstractC2469q0.p(it.next());
            if (z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void p(boolean z10) {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = ((K) this.f17401Z).f18066w;
        if (abstractComponentCallbacksC1480v != null) {
            abstractComponentCallbacksC1480v.o().f18056m.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17400Y).iterator();
        if (it.hasNext()) {
            AbstractC2469q0.p(it.next());
            if (z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void q(boolean z10) {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = ((K) this.f17401Z).f18066w;
        if (abstractComponentCallbacksC1480v != null) {
            abstractComponentCallbacksC1480v.o().f18056m.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17400Y).iterator();
        if (it.hasNext()) {
            AbstractC2469q0.p(it.next());
            if (z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void r(boolean z10) {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = ((K) this.f17401Z).f18066w;
        if (abstractComponentCallbacksC1480v != null) {
            abstractComponentCallbacksC1480v.o().f18056m.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17400Y).iterator();
        if (it.hasNext()) {
            AbstractC2469q0.p(it.next());
            if (z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void s(boolean z10) {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = ((K) this.f17401Z).f18066w;
        if (abstractComponentCallbacksC1480v != null) {
            abstractComponentCallbacksC1480v.o().f18056m.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17400Y).iterator();
        if (it.hasNext()) {
            AbstractC2469q0.p(it.next());
            if (z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void t(boolean z10) {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = ((K) this.f17401Z).f18066w;
        if (abstractComponentCallbacksC1480v != null) {
            abstractComponentCallbacksC1480v.o().f18056m.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17400Y).iterator();
        if (it.hasNext()) {
            AbstractC2469q0.p(it.next());
            if (z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void u(boolean z10) {
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = ((K) this.f17401Z).f18066w;
        if (abstractComponentCallbacksC1480v != null) {
            abstractComponentCallbacksC1480v.o().f18056m.u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f17400Y).iterator();
        if (it.hasNext()) {
            AbstractC2469q0.p(it.next());
            if (z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void v(String str, wf.k kVar) {
        AbstractMap abstractMap = ((t0) this.f17401Z).f23111a;
        C2424o c2424o = new C2424o(this, str);
        kVar.invoke(c2424o);
        String str2 = (String) this.f17400Y;
        ArrayList arrayList = c2424o.f26647b;
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((C3959i) it.next()).f36155Y);
        }
        String str3 = (String) c2424o.f26648c.f36155Y;
        String str4 = c2424o.f26646a;
        AbstractC3557B.c0("name", str4);
        AbstractC3557B.c0("ret", str3);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str4);
        sb2.append('(');
        sb2.append(kf.t.m2(arrayList2, "", null, null, C2658G.f28292Y, 30));
        sb2.append(')');
        if (str3.length() > 1) {
            str3 = android.gov.nist.core.a.h(TokenNames.f24315L, str3, ';');
        }
        sb2.append(str3);
        String sb3 = sb2.toString();
        AbstractC3557B.c0("internalName", str2);
        AbstractC3557B.c0("jvmDescriptor", sb3);
        String str5 = str2 + '.' + sb3;
        C2427r c2427r = (C2427r) c2424o.f26648c.f36156Z;
        ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((C2427r) ((C3959i) it2.next()).f36156Z);
        }
        abstractMap.put(str5, new C2419j(c2427r, arrayList3));
    }

    public final Long w(String str) {
        S s10;
        S d10 = L0.d();
        Long l10 = null;
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.PreferenceDao");
        } else {
            s10 = null;
        }
        C6270B a5 = C6270B.a(1, "SELECT long_value FROM Preference where `key`=?");
        a5.b(1, str);
        ((y) this.f17400Y).b();
        Cursor t12 = A7.b.t1((y) this.f17400Y, a5, false);
        try {
            if (t12.moveToFirst() && !t12.isNull(0)) {
                l10 = Long.valueOf(t12.getLong(0));
            }
            return l10;
        } finally {
            t12.close();
            if (s10 != null) {
                s10.b();
            }
            a5.j();
        }
    }

    public final void x(d dVar) {
        S s10;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.PreferenceDao");
        } else {
            s10 = null;
        }
        ((y) this.f17400Y).b();
        ((y) this.f17400Y).c();
        try {
            ((x3.g) this.f17401Z).i(dVar);
            ((y) this.f17400Y).n();
            if (s10 != null) {
                s10.c(C1.OK);
            }
        } finally {
            ((y) this.f17400Y).j();
            if (s10 != null) {
                s10.b();
            }
        }
    }

    public final void y(AbstractC4828h abstractC4828h) {
        ((E) this.f17400Y).g(abstractC4828h);
        if (abstractC4828h instanceof L3.y) {
            ((W3.i) this.f17401Z).j((L3.y) abstractC4828h);
        } else if (abstractC4828h instanceof w) {
            ((W3.i) this.f17401Z).k(((w) abstractC4828h).f10733p);
        }
    }

    public final void z(MotionEvent motionEvent) {
        View view;
        View a5;
        AbstractC3557B.c0("event", motionEvent);
        ((GestureDetector) ((GestureDetectorCompat) this.f17401Z).f24927a.f8729Y).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            C5279d c5279d = (C5279d) this.f17400Y;
            c5279d.getClass();
            Window window = (Window) c5279d.f43952b.get();
            if (window != null) {
                view = window.getDecorView();
            } else {
                view = null;
            }
            i6.d dVar = c5279d.f43958h;
            if (dVar == null) {
                if (view != null && (a5 = c5279d.a(view, c5279d.f43960j, c5279d.f43961k)) == c5279d.a(view, motionEvent.getX(), motionEvent.getY()) && a5 != null) {
                    c5279d.d(a5);
                }
            } else {
                i6.f a10 = i6.b.a(c5279d.f43951a);
                View view2 = (View) c5279d.f43959i.get();
                if (view != null && view2 != null) {
                    LinkedHashMap c10 = c5279d.c(view2, AbstractC4828h.k0((Context) c5279d.f43955e.get(), view2.getId()), motionEvent);
                    AbstractC4828h.j0(c5279d.f43954d, view2);
                    a10.p(dVar, c10);
                }
            }
            c5279d.f43959i.clear();
            c5279d.f43958h = null;
            c5279d.f43961k = 0.0f;
            c5279d.f43960j = 0.0f;
        }
    }

    public /* synthetic */ e(Object obj, Serializable serializable) {
        this.f17400Y = serializable;
        this.f17401Z = obj;
    }

    public /* synthetic */ e(Object obj, Object obj2) {
        this.f17400Y = obj;
        this.f17401Z = obj2;
    }

    public e(I1 i12) {
        this.f17400Y = i12;
        this.f17401Z = null;
    }

    public e(H h10, D1 d12) {
        this.f17400Y = new LinkedBlockingDeque();
        Ad.l.Z0("logger is required", h10);
        this.f17401Z = h10;
        ((Deque) this.f17400Y).push(d12);
    }

    public e(t0 t0Var, String str) {
        AbstractC3557B.c0("className", str);
        this.f17401Z = t0Var;
        this.f17400Y = str;
    }
}
