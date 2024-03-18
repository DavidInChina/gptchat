package G0;

import A.C0007a0;
import E0.AbstractC0442a;
import H0.C0709v0;
import H0.C0714y;
import L.AbstractC0861m0;
import M1.C0929j;
import V1.AbstractComponentCallbacksC1480v;
import V1.C1460a;
import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentContainerView;
import b0.C2104h;
import b4.AbstractC2121b;
import b4.AbstractC2122c;
import ca.C2311c;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import d4.C2595d;
import e4.C2793a;
import e4.C2797e;
import g2.C3153k;
import h.C3277c;
import h9.C3341f;
import id.AbstractC3557B;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import k6.AbstractC4194d;
import kf.AbstractC4268D;
import kf.AbstractC4283h;
import kf.C4288m;
import l0.AbstractC4324p;
import n9.C4726e;
import p5.AbstractC5092d;
import r0.AbstractC5352p;
import s3.C5545H;
import s3.C5563m;
import s3.C5570u;
import s3.C5573x;
import w.C6053E;
import wd.C6189g;

/* renamed from: G0.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0571a extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5698Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f5699Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0571a(int i10, Object obj) {
        super(1);
        this.f5698Y = i10;
        this.f5699Z = obj;
    }

    private final void e(Throwable th2) {
        if (th2 != null) {
            ((M1.J) this.f5699Z).f11423g.setValue(new C0929j(th2));
        }
        Object obj = M1.J.f11416k;
        M1.J j6 = (M1.J) this.f5699Z;
        synchronized (obj) {
            M1.J.f11415j.remove(j6.d().getAbsolutePath());
        }
    }

    public final String a(String str) {
        int i10 = this.f5698Y;
        Object obj = this.f5699Z;
        switch (i10) {
            case 19:
                AbstractC3557B.c0("it", str);
                Set set = w5.e.f48025c;
                ((w5.e) obj).getClass();
                int k22 = Lg.n.k2(str, ':', 0, false, 6);
                if (k22 > 0) {
                    String substring = str.substring(0, k22);
                    AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
                    if (w5.e.f48025c.contains(substring)) {
                        return null;
                    }
                    return str;
                }
                return str;
            default:
                AbstractC3557B.c0("property", str);
                return ((I8.w) ((I8.u) ((I8.u) obj).f8133Y.get(str)).f8133Y.get(ParameterNames.ID)).T();
        }
    }

    public final void c(Throwable th2) {
        switch (this.f5698Y) {
            case 9:
                e(th2);
                return;
            case 10:
                ((Pg.p) ((Pg.A) this.f5699Z)).t(null);
                return;
            case 11:
            default:
                Object obj = this.f5699Z;
                if (th2 == null) {
                    if (!((L3.m) obj).f10722Y.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    return;
                } else if (th2 instanceof CancellationException) {
                    ((L3.m) obj).f10722Y.cancel(true);
                    return;
                } else {
                    W3.i iVar = ((L3.m) obj).f10722Y;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    iVar.k(th2);
                    return;
                }
            case 12:
                C3153k c3153k = (C3153k) this.f5699Z;
                synchronized (c3153k.f31106l0) {
                    c3153k.f31107m0 = c3153k.f31101Z;
                    c3153k.f31109o0 = null;
                }
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [kf.h, kf.m, java.lang.Object] */
    @Override // wf.k
    public final Object invoke(Object obj) {
        String str;
        Object[] objArr;
        String str2;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f5698Y;
        int i11 = 0;
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = null;
        Object obj2 = this.f5699Z;
        switch (i10) {
            case 0:
                AbstractC0574c abstractC0574c = (AbstractC0574c) obj;
                if (abstractC0574c.I()) {
                    if (abstractC0574c.a().f5709b) {
                        abstractC0574c.H();
                    }
                    AbstractC0573b abstractC0573b = (AbstractC0573b) obj2;
                    for (Map.Entry entry : abstractC0574c.a().f5716i.entrySet()) {
                        AbstractC0573b.a(abstractC0573b, (AbstractC0442a) entry.getKey(), ((Number) entry.getValue()).intValue(), abstractC0574c.e());
                    }
                    g0 g0Var = abstractC0574c.e().f5772p0;
                    AbstractC3557B.Z(g0Var);
                    while (!AbstractC3557B.K(g0Var, abstractC0573b.f5708a.e())) {
                        for (AbstractC0442a abstractC0442a : abstractC0573b.c(g0Var).keySet()) {
                            AbstractC0573b.a(abstractC0573b, abstractC0442a, abstractC0573b.d(g0Var, abstractC0442a), g0Var);
                        }
                        g0Var = g0Var.f5772p0;
                        AbstractC3557B.Z(g0Var);
                    }
                }
                return yVar;
            case 1:
                ((C2104h) obj2).b((AbstractC4324p) obj);
                return Boolean.TRUE;
            case 2:
                AbstractC5352p abstractC5352p = (AbstractC5352p) obj;
                g0 g0Var2 = (g0) obj2;
                if (g0Var2.f5770n0.T()) {
                    r0 snapshotObserver = ((C0714y) AbstractC0579h.C(g0Var2.f5770n0)).getSnapshotObserver();
                    r0.I i12 = g0.f5759G0;
                    snapshotObserver.a(g0Var2, C0578g.f5747n0, new C0007a0(g0Var2, 14, abstractC5352p));
                    g0Var2.f5768E0 = false;
                } else {
                    g0Var2.f5768E0 = true;
                }
                return yVar;
            case 3:
                Z.N n10 = (Z.N) obj;
                return new C3277c(7, (C0709v0) obj2);
            case 4:
                L0.t.e((L0.v) obj, ((L0.g) obj2).f10380a);
                return yVar;
            case 5:
                S0.M m10 = (S0.M) obj;
                return ((S0.t) obj2).a(new S0.M(null, m10.f15987b, m10.f15988c, m10.f15989d, m10.f15990e)).getValue();
            case 6:
                AbstractC2469q0.p(obj);
                throw null;
            case 7:
                FragmentContainerView fragmentContainerView = (FragmentContainerView) obj;
                V1.K k10 = (V1.K) obj2;
                if (k10 != null) {
                    abstractComponentCallbacksC1480v = k10.B(fragmentContainerView.getId());
                }
                if (abstractComponentCallbacksC1480v != null && !k10.L()) {
                    C1460a c1460a = new C1460a(k10);
                    c1460a.g(abstractComponentCallbacksC1480v);
                    if (!c1460a.f18138g) {
                        c1460a.f18147p.z(c1460a, false);
                    } else {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                }
                return yVar;
            case 8:
                ((androidx.compose.ui.node.a) obj2).t0((Z0.b) obj);
                return yVar;
            case 9:
                c((Throwable) obj);
                return yVar;
            case 10:
                c((Throwable) obj);
                return yVar;
            case 11:
                Y1.e eVar = (Y1.e) obj;
                if (Build.VERSION.SDK_INT >= 31) {
                    return eVar;
                }
                AbstractC4268D.m1(Collections.unmodifiableMap(((Y1.g) eVar).f22053a));
                AbstractC2469q0.p(obj2);
                throw null;
            case 12:
                c((Throwable) obj);
                return yVar;
            case 13:
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, (String) obj);
                C5573x c5573x = (C5573x) obj2;
                ArrayList arrayList = c5573x.f45379d;
                ArrayList arrayList2 = new ArrayList();
                for (C5570u c5570u : ((Map) c5573x.f45383h.getValue()).values()) {
                    kf.s.N1(c5570u.f45369b, arrayList2);
                }
                return Boolean.valueOf(!kf.t.w2((List) c5573x.f45386k.getValue(), kf.t.w2(arrayList2, arrayList)).contains(str));
            case 14:
                Bundle bundle = (Bundle) obj;
                C5545H U10 = A7.b.U((Context) obj2);
                if (bundle != null) {
                    bundle.setClassLoader(U10.f45340a.getClassLoader());
                    U10.f45343d = bundle.getBundle("android-support-nav:controller:navigatorState");
                    U10.f45344e = bundle.getParcelableArray("android-support-nav:controller:backStack");
                    LinkedHashMap linkedHashMap = U10.f45353n;
                    linkedHashMap.clear();
                    int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                    if (intArray != null && stringArrayList != null) {
                        int length = intArray.length;
                        int i13 = 0;
                        while (i11 < length) {
                            U10.f45352m.put(Integer.valueOf(intArray[i11]), stringArrayList.get(i13));
                            i11++;
                            i13++;
                        }
                    }
                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                    if (stringArrayList2 != null) {
                        for (String str3 : stringArrayList2) {
                            Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str3);
                            if (parcelableArray != null) {
                                AbstractC3557B.b0(ParameterNames.ID, str3);
                                int length2 = parcelableArray.length;
                                ?? abstractC4283h = new AbstractC4283h();
                                if (length2 == 0) {
                                    objArr = C4288m.f37473i0;
                                } else if (length2 > 0) {
                                    objArr = new Object[length2];
                                } else {
                                    throw new IllegalArgumentException(android.gov.nist.core.a.e("Illegal Capacity: ", length2));
                                }
                                abstractC4283h.f37475Z = objArr;
                                C6053E f02 = com.google.android.gms.internal.play_billing.N.f0(parcelableArray);
                                while (f02.hasNext()) {
                                    Parcelable parcelable = (Parcelable) f02.next();
                                    AbstractC3557B.a0("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState", parcelable);
                                    abstractC4283h.addLast((C5563m) parcelable);
                                }
                                linkedHashMap.put(str3, abstractC4283h);
                            }
                        }
                    }
                    U10.f45345f = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
                }
                return U10;
            case 15:
                c((Throwable) obj);
                return yVar;
            case 16:
                String str4 = (String) obj;
                AbstractC3557B.c0("it", str4);
                ((C2797e) obj2).f28956e.add(str4);
                return yVar;
            case 17:
                C2793a c2793a = (C2793a) obj;
                AbstractC3557B.c0("cursor", c2793a);
                ArrayList arrayList3 = new ArrayList();
                while (c2793a.f28944a.moveToNext()) {
                    arrayList3.add(((AbstractC2122c) obj2).f25617a.invoke(c2793a));
                }
                return new C2595d(arrayList3);
            case 18:
                IOException iOException = (IOException) obj;
                ((i4.i) obj2).f32692p0 = true;
                return yVar;
            case 19:
                return a((String) obj);
            case 20:
                File file = (File) obj;
                AbstractC3557B.c0("$this$safeCall", file);
                return file.listFiles((FileFilter) obj2);
            case 21:
                File file2 = (File) obj;
                AbstractC3557B.c0("$this$safeCall", file2);
                return Boolean.valueOf(file2.renameTo((File) obj2));
            case 22:
                return a((String) obj);
            case 23:
                AbstractC5092d abstractC5092d = (AbstractC5092d) obj;
                AbstractC3557B.c0("it", abstractC5092d);
                ((g6.d) obj2).e((u5.g) abstractC5092d);
                return yVar;
            case 24:
            default:
                AbstractC3557B.c0("$this$$receiver", (AbstractC0861m0) obj);
                AbstractC4194d.d((p0.f) obj2);
                return yVar;
            case 25:
                Map map = (Map) obj;
                AbstractC3557B.c0("it", map);
                map.putAll(((o6.O) obj2).c().b());
                return yVar;
            case 26:
                ((Boolean) obj).getClass();
                ((a7.g) obj2).c();
                return yVar;
            case 27:
                C6189g c6189g = (C6189g) obj;
                if (c6189g != null) {
                    str2 = c6189g.f48410a;
                } else {
                    str2 = null;
                }
                if (AbstractC3557B.K(str2, ((C3341f) obj2).f31968d.f40276c)) {
                    return null;
                }
                return c6189g;
            case 28:
                C2793a c2793a2 = (C2793a) obj;
                AbstractC3557B.c0("cursor", c2793a2);
                AbstractC2121b abstractC2121b = ((C4726e) obj2).f39671b.f39673b;
                String a5 = c2793a2.a(0);
                AbstractC3557B.Z(a5);
                return (C2311c) abstractC2121b.g(a5);
        }
    }
}
