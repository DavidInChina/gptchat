package s3;

import A.C0039q0;
import Pg.EnumC1170c;
import Qg.F0;
import Qg.n0;
import Qg.r0;
import Qg.s0;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.EnumC2082q;
import androidx.lifecycle.d0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import g.C3105D;
import h.C3278d;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import jf.C3959i;
import kf.C4288m;
import l8.AbstractC4344b;
import wf.AbstractC6216a;
import z.C6686a;

/* renamed from: s3.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5568s {

    /* renamed from: D  reason: collision with root package name */
    public static boolean f45336D = true;

    /* renamed from: A  reason: collision with root package name */
    public int f45337A;

    /* renamed from: B  reason: collision with root package name */
    public final ArrayList f45338B;

    /* renamed from: C  reason: collision with root package name */
    public final r0 f45339C;

    /* renamed from: a  reason: collision with root package name */
    public final Context f45340a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f45341b;

    /* renamed from: c  reason: collision with root package name */
    public C5542E f45342c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f45343d;

    /* renamed from: e  reason: collision with root package name */
    public Parcelable[] f45344e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f45345f;

    /* renamed from: g  reason: collision with root package name */
    public final C4288m f45346g;

    /* renamed from: h  reason: collision with root package name */
    public final F0 f45347h;

    /* renamed from: i  reason: collision with root package name */
    public final F0 f45348i;

    /* renamed from: j  reason: collision with root package name */
    public final n0 f45349j;

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashMap f45350k;

    /* renamed from: l  reason: collision with root package name */
    public final LinkedHashMap f45351l;

    /* renamed from: m  reason: collision with root package name */
    public final LinkedHashMap f45352m;

    /* renamed from: n  reason: collision with root package name */
    public final LinkedHashMap f45353n;

    /* renamed from: o  reason: collision with root package name */
    public AbstractC2086v f45354o;

    /* renamed from: p  reason: collision with root package name */
    public C5569t f45355p;

    /* renamed from: q  reason: collision with root package name */
    public final CopyOnWriteArrayList f45356q;

    /* renamed from: r  reason: collision with root package name */
    public EnumC2082q f45357r;

    /* renamed from: s  reason: collision with root package name */
    public final C5564n f45358s;

    /* renamed from: t  reason: collision with root package name */
    public final C3105D f45359t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f45360u;

    /* renamed from: v  reason: collision with root package name */
    public final X f45361v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f45362w;

    /* renamed from: x  reason: collision with root package name */
    public wf.k f45363x;

    /* renamed from: y  reason: collision with root package name */
    public wf.k f45364y;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f45365z;

    public AbstractC5568s(Context context) {
        Object obj;
        AbstractC3557B.c0("context", context);
        this.f45340a = context;
        Iterator it = Kg.p.c1(context, C5552b.f45282h0).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f45341b = (Activity) obj;
        this.f45346g = new C4288m();
        kf.v vVar = kf.v.f37483Y;
        this.f45347h = s0.c(vVar);
        F0 c10 = s0.c(vVar);
        this.f45348i = c10;
        this.f45349j = new n0(c10);
        this.f45350k = new LinkedHashMap();
        this.f45351l = new LinkedHashMap();
        this.f45352m = new LinkedHashMap();
        this.f45353n = new LinkedHashMap();
        this.f45356q = new CopyOnWriteArrayList();
        this.f45357r = EnumC2082q.f25376Z;
        this.f45358s = new C5564n(0, this);
        this.f45359t = new C3105D(this);
        this.f45360u = true;
        X x10 = new X();
        this.f45361v = x10;
        this.f45362w = new LinkedHashMap();
        this.f45365z = new LinkedHashMap();
        x10.a(new C5544G(x10));
        x10.a(new C5553c(this.f45340a));
        this.f45338B = new ArrayList();
        R4.b.D1(new X0.b(7, this));
        this.f45339C = s0.b(1, 0, EnumC1170c.f14193Z, 2);
    }

    public static AbstractC5540C f(AbstractC5540C abstractC5540C, int i10) {
        C5542E c5542e;
        if (abstractC5540C.f45221l0 == i10) {
            return abstractC5540C;
        }
        if (abstractC5540C instanceof C5542E) {
            c5542e = (C5542E) abstractC5540C;
        } else {
            c5542e = abstractC5540C.f45216Z;
            AbstractC3557B.Z(c5542e);
        }
        return c5542e.U(i10, true);
    }

    public static /* synthetic */ void t(AbstractC5568s abstractC5568s, C5562l c5562l) {
        abstractC5568s.s(c5562l, false, new C4288m());
    }

    public final void a(AbstractC5540C abstractC5540C, Bundle bundle, C5562l c5562l, List list) {
        AbstractC5540C abstractC5540C2;
        Object obj;
        AbstractC5540C abstractC5540C3;
        Object obj2;
        Bundle bundle2;
        Object obj3;
        Object obj4;
        AbstractC5540C abstractC5540C4 = c5562l.f45306Z;
        boolean z10 = abstractC5540C4 instanceof AbstractC5555e;
        boolean z11 = true;
        C4288m c4288m = this.f45346g;
        if (!z10) {
            while (!c4288m.isEmpty() && (((C5562l) c4288m.last()).f45306Z instanceof AbstractC5555e) && q(((C5562l) c4288m.last()).f45306Z.f45221l0, true, false)) {
            }
        }
        C4288m c4288m2 = new C4288m();
        boolean z12 = abstractC5540C instanceof C5542E;
        Context context = this.f45340a;
        C5562l c5562l2 = null;
        if (z12) {
            AbstractC5540C abstractC5540C5 = abstractC5540C4;
            do {
                AbstractC3557B.Z(abstractC5540C5);
                abstractC5540C5 = abstractC5540C5.f45216Z;
                if (abstractC5540C5 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj4 = listIterator.previous();
                            if (AbstractC3557B.K(((C5562l) obj4).f45306Z, abstractC5540C5)) {
                                break;
                            }
                        } else {
                            obj4 = null;
                            break;
                        }
                    }
                    C5562l c5562l3 = (C5562l) obj4;
                    if (c5562l3 == null) {
                        c5562l3 = P5.c.u(context, abstractC5540C5, bundle, k(), this.f45355p);
                    }
                    c4288m2.addFirst(c5562l3);
                    if ((!c4288m.isEmpty()) && ((C5562l) c4288m.last()).f45306Z == abstractC5540C5) {
                        t(this, (C5562l) c4288m.last());
                    }
                }
                if (abstractC5540C5 == null) {
                    break;
                }
            } while (abstractC5540C5 != abstractC5540C);
        }
        if (c4288m2.isEmpty()) {
            abstractC5540C2 = abstractC5540C4;
        } else {
            abstractC5540C2 = ((C5562l) c4288m2.first()).f45306Z;
        }
        while (abstractC5540C2 != null && e(abstractC5540C2.f45221l0) != abstractC5540C2) {
            abstractC5540C2 = abstractC5540C2.f45216Z;
            if (abstractC5540C2 != null) {
                if (bundle != null && bundle.isEmpty() == z11) {
                    bundle2 = null;
                } else {
                    bundle2 = bundle;
                }
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        obj3 = listIterator2.previous();
                        if (AbstractC3557B.K(((C5562l) obj3).f45306Z, abstractC5540C2)) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                C5562l c5562l4 = (C5562l) obj3;
                if (c5562l4 == null) {
                    c5562l4 = P5.c.u(context, abstractC5540C2, abstractC5540C2.s(bundle2), k(), this.f45355p);
                }
                c4288m2.addFirst(c5562l4);
            }
            z11 = true;
        }
        if (!c4288m2.isEmpty()) {
            abstractC5540C4 = ((C5562l) c4288m2.first()).f45306Z;
        }
        while (!c4288m.isEmpty() && (((C5562l) c4288m.last()).f45306Z instanceof C5542E)) {
            AbstractC5540C abstractC5540C6 = ((C5562l) c4288m.last()).f45306Z;
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.navigation.NavGraph", abstractC5540C6);
            if (((C5542E) abstractC5540C6).U(abstractC5540C4.f45221l0, false) != null) {
                break;
            }
            t(this, (C5562l) c4288m.last());
        }
        if (c4288m.isEmpty()) {
            obj = null;
        } else {
            obj = c4288m.f37475Z[c4288m.f37474Y];
        }
        C5562l c5562l5 = (C5562l) obj;
        if (c5562l5 == null) {
            if (c4288m2.isEmpty()) {
                obj2 = null;
            } else {
                obj2 = c4288m2.f37475Z[c4288m2.f37474Y];
            }
            c5562l5 = (C5562l) obj2;
        }
        if (c5562l5 != null) {
            abstractC5540C3 = c5562l5.f45306Z;
        } else {
            abstractC5540C3 = null;
        }
        if (!AbstractC3557B.K(abstractC5540C3, this.f45342c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                AbstractC5540C abstractC5540C7 = ((C5562l) previous).f45306Z;
                C5542E c5542e = this.f45342c;
                AbstractC3557B.Z(c5542e);
                if (AbstractC3557B.K(abstractC5540C7, c5542e)) {
                    c5562l2 = previous;
                    break;
                }
            }
            C5562l c5562l6 = c5562l2;
            if (c5562l6 == null) {
                C5542E c5542e2 = this.f45342c;
                AbstractC3557B.Z(c5542e2);
                C5542E c5542e3 = this.f45342c;
                AbstractC3557B.Z(c5542e3);
                c5562l6 = P5.c.u(context, c5542e2, c5542e3.s(bundle), k(), this.f45355p);
            }
            c4288m2.addFirst(c5562l6);
        }
        Iterator it = c4288m2.iterator();
        while (it.hasNext()) {
            C5562l c5562l7 = (C5562l) it.next();
            Object obj5 = this.f45362w.get(this.f45361v.b(c5562l7.f45306Z.f45215Y));
            if (obj5 != null) {
                ((C5565o) obj5).a(c5562l7);
            } else {
                throw new IllegalStateException(R.a.t(new StringBuilder("NavigatorBackStack for "), abstractC5540C.f45215Y, " should already be created").toString());
            }
        }
        c4288m.addAll(c4288m2);
        c4288m.addLast(c5562l);
        Iterator it2 = kf.t.x2(c5562l, c4288m2).iterator();
        while (it2.hasNext()) {
            C5562l c5562l8 = (C5562l) it2.next();
            C5542E c5542e4 = c5562l8.f45306Z.f45216Z;
            if (c5542e4 != null) {
                m(c5562l8, g(c5542e4.f45221l0));
            }
        }
    }

    public final void b(AbstractC5566p abstractC5566p) {
        AbstractC3557B.c0("listener", abstractC5566p);
        this.f45356q.add(abstractC5566p);
        C4288m c4288m = this.f45346g;
        if (!c4288m.isEmpty()) {
            C5562l c5562l = (C5562l) c4288m.last();
            abstractC5566p.a(this, c5562l.f45306Z, c5562l.d());
        }
    }

    public final boolean c() {
        C4288m c4288m;
        while (true) {
            c4288m = this.f45346g;
            if (c4288m.isEmpty() || !(((C5562l) c4288m.last()).f45306Z instanceof C5542E)) {
                break;
            }
            t(this, (C5562l) c4288m.last());
        }
        C5562l c5562l = (C5562l) c4288m.T();
        ArrayList arrayList = this.f45338B;
        if (c5562l != null) {
            arrayList.add(c5562l);
        }
        this.f45337A++;
        x();
        int i10 = this.f45337A - 1;
        this.f45337A = i10;
        if (i10 == 0) {
            ArrayList M22 = kf.t.M2(arrayList);
            arrayList.clear();
            Iterator it = M22.iterator();
            while (it.hasNext()) {
                C5562l c5562l2 = (C5562l) it.next();
                Iterator it2 = this.f45356q.iterator();
                while (it2.hasNext()) {
                    ((AbstractC5566p) it2.next()).a(this, c5562l2.f45306Z, c5562l2.d());
                }
                this.f45339C.g(c5562l2);
            }
            this.f45347h.setValue(kf.t.M2(c4288m));
            this.f45348i.setValue(u());
        }
        if (c5562l != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.jvm.internal.x] */
    public final boolean d(ArrayList arrayList, AbstractC5540C abstractC5540C, boolean z10, boolean z11) {
        String str;
        String str2;
        C5563m c5563m;
        String str3;
        ?? obj = new Object();
        C4288m c4288m = new C4288m();
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                ?? obj2 = new Object();
                this.f45364y = new L.J(obj2, z11, obj, this, c4288m, 1);
                ((W) it.next()).e((C5562l) this.f45346g.last(), z11);
                str = null;
                this.f45364y = null;
                if (!obj2.f37645Y) {
                    break;
                }
            } else {
                str = null;
                break;
            }
        }
        if (z11) {
            LinkedHashMap linkedHashMap = this.f45352m;
            if (!z10) {
                Iterator it2 = new Kg.j(Kg.p.c1(abstractC5540C, C5552b.f45284j0), new C5567q(this, 0)).iterator();
                while (it2.hasNext()) {
                    Integer valueOf = Integer.valueOf(((AbstractC5540C) it2.next()).f45221l0);
                    if (c4288m.isEmpty()) {
                        c5563m = str;
                    } else {
                        c5563m = c4288m.f37475Z[c4288m.f37474Y];
                    }
                    C5563m c5563m2 = c5563m;
                    if (c5563m2 != null) {
                        str3 = c5563m2.f45317Y;
                    } else {
                        str3 = str;
                    }
                    linkedHashMap.put(valueOf, str3);
                }
            }
            if (!c4288m.isEmpty()) {
                C5563m c5563m3 = (C5563m) c4288m.first();
                Iterator it3 = new Kg.j(Kg.p.c1(e(c5563m3.f45318Z), C5552b.f45285k0), new C5567q(this, 1)).iterator();
                while (true) {
                    boolean hasNext = it3.hasNext();
                    str2 = c5563m3.f45317Y;
                    if (!hasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((AbstractC5540C) it3.next()).f45221l0), str2);
                }
                if (linkedHashMap.values().contains(str2)) {
                    this.f45353n.put(str2, c4288m);
                }
            }
        }
        y();
        return obj.f37645Y;
    }

    public final AbstractC5540C e(int i10) {
        AbstractC5540C abstractC5540C;
        C5542E c5542e = this.f45342c;
        if (c5542e == null) {
            return null;
        }
        if (c5542e.f45221l0 == i10) {
            return c5542e;
        }
        C5562l c5562l = (C5562l) this.f45346g.T();
        if (c5562l == null || (abstractC5540C = c5562l.f45306Z) == null) {
            abstractC5540C = this.f45342c;
            AbstractC3557B.Z(abstractC5540C);
        }
        return f(abstractC5540C, i10);
    }

    public final C5562l g(int i10) {
        Object obj;
        C4288m c4288m = this.f45346g;
        ListIterator<E> listIterator = c4288m.listIterator(c4288m.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((C5562l) obj).f45306Z.f45221l0 == i10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C5562l c5562l = (C5562l) obj;
        if (c5562l != null) {
            return c5562l;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("No destination with ID ", i10, " is on the NavController's back stack. The current destination is ");
        q10.append(h());
        throw new IllegalArgumentException(q10.toString().toString());
    }

    public final AbstractC5540C h() {
        C5562l c5562l = (C5562l) this.f45346g.T();
        if (c5562l != null) {
            return c5562l.f45306Z;
        }
        return null;
    }

    public final int i() {
        C4288m<C5562l> c4288m = this.f45346g;
        int i10 = 0;
        if (!(c4288m instanceof Collection) || !c4288m.isEmpty()) {
            for (C5562l c5562l : c4288m) {
                if ((!(c5562l.f45306Z instanceof C5542E)) && (i10 = i10 + 1) < 0) {
                    AbstractC4344b.c1();
                    throw null;
                }
            }
        }
        return i10;
    }

    public final C5542E j() {
        C5542E c5542e = this.f45342c;
        if (c5542e != null) {
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.navigation.NavGraph", c5542e);
            return c5542e;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
    }

    public final EnumC2082q k() {
        if (this.f45354o == null) {
            return EnumC2082q.f25377h0;
        }
        return this.f45357r;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(Intent intent) {
        int[] intArray;
        ArrayList arrayList;
        Bundle bundle;
        Context context;
        AbstractC5540C abstractC5540C;
        C5542E c5542e;
        Bundle bundle2;
        AbstractC5540C abstractC5540C2;
        C5542E c5542e2;
        C5539B I10;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        String str = null;
        if (extras != null) {
            try {
                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
            } catch (Exception e10) {
                AbstractC3612c.d("NavController", "handleDeepLink() could not extract deepLink from " + intent, e10);
            }
            if (extras == null) {
                arrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
            } else {
                arrayList = null;
            }
            Bundle bundle32 = new Bundle();
            if (extras == null) {
                bundle = extras.getBundle("android-support-nav:controller:deepLinkExtras");
            } else {
                bundle = null;
            }
            if (bundle != null) {
                bundle32.putAll(bundle);
            }
            if (intArray != null || intArray.length == 0) {
                C5542E c5542e32 = this.f45342c;
                AbstractC3557B.Z(c5542e32);
                I10 = c5542e32.I(new U3.u(intent));
                if (I10 != null) {
                    AbstractC5540C abstractC5540C3 = I10.f45208Y;
                    int[] y10 = abstractC5540C3.y(null);
                    Bundle s10 = abstractC5540C3.s(I10.f45209Z);
                    if (s10 != null) {
                        bundle32.putAll(s10);
                    }
                    intArray = y10;
                    arrayList = null;
                }
            }
            if (intArray != null || intArray.length == 0) {
                return false;
            }
            C5542E c5542e4 = this.f45342c;
            int length = intArray.length;
            int i10 = 0;
            while (true) {
                context = this.f45340a;
                if (i10 >= length) {
                    break;
                }
                int i11 = intArray[i10];
                if (i10 == 0) {
                    C5542E c5542e5 = this.f45342c;
                    AbstractC3557B.Z(c5542e5);
                    if (c5542e5.f45221l0 == i11) {
                        abstractC5540C2 = this.f45342c;
                    } else {
                        abstractC5540C2 = null;
                    }
                } else {
                    AbstractC3557B.Z(c5542e4);
                    abstractC5540C2 = c5542e4.U(i11, true);
                }
                if (abstractC5540C2 == null) {
                    int i12 = AbstractC5540C.f45214n0;
                    str = B2.u.w(context, i11);
                    break;
                }
                if (i10 != intArray.length - 1 && (abstractC5540C2 instanceof C5542E)) {
                    while (true) {
                        c5542e2 = (C5542E) abstractC5540C2;
                        AbstractC3557B.Z(c5542e2);
                        if (!(c5542e2.U(c5542e2.f45228p0, true) instanceof C5542E)) {
                            break;
                        }
                        abstractC5540C2 = c5542e2.U(c5542e2.f45228p0, true);
                    }
                    c5542e4 = c5542e2;
                }
                i10++;
            }
            if (str != null) {
                Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                return false;
            }
            bundle32.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
            int length2 = intArray.length;
            Bundle[] bundleArr = new Bundle[length2];
            for (int i13 = 0; i13 < length2; i13++) {
                Bundle bundle4 = new Bundle();
                bundle4.putAll(bundle32);
                if (arrayList != null && (bundle2 = (Bundle) arrayList.get(i13)) != null) {
                    bundle4.putAll(bundle2);
                }
                bundleArr[i13] = bundle4;
            }
            int flags = intent.getFlags();
            int i14 = 268435456 & flags;
            if (i14 != 0 && (flags & 32768) == 0) {
                intent.addFlags(32768);
                o1.S s11 = new o1.S(context);
                ComponentName component = intent.getComponent();
                if (component == null) {
                    component = intent.resolveActivity(((Context) s11.f40450h0).getPackageManager());
                }
                if (component != null) {
                    s11.f(component);
                }
                ((ArrayList) s11.f40449Z).add(intent);
                s11.r();
                Activity activity = this.f45341b;
                if (activity != null) {
                    activity.finish();
                    activity.overridePendingTransition(0, 0);
                }
                return true;
            } else if (i14 != 0) {
                if (!this.f45346g.isEmpty()) {
                    C5542E c5542e6 = this.f45342c;
                    AbstractC3557B.Z(c5542e6);
                    q(c5542e6.f45221l0, true, false);
                }
                int i15 = 0;
                while (i15 < intArray.length) {
                    int i16 = intArray[i15];
                    int i17 = i15 + 1;
                    Bundle bundle5 = bundleArr[i15];
                    AbstractC5540C e11 = e(i16);
                    if (e11 != null) {
                        n(e11, bundle5, Gi.e.I(new r(e11, 0, this)));
                        i15 = i17;
                    } else {
                        int i18 = AbstractC5540C.f45214n0;
                        StringBuilder s12 = android.gov.nist.core.a.s("Deep Linking failed: destination ", B2.u.w(context, i16), " cannot be found from the current destination ");
                        s12.append(h());
                        throw new IllegalStateException(s12.toString());
                    }
                }
                this.f45345f = true;
                return true;
            } else {
                C5542E c5542e7 = this.f45342c;
                int length3 = intArray.length;
                for (int i19 = 0; i19 < length3; i19++) {
                    int i20 = intArray[i19];
                    Bundle bundle6 = bundleArr[i19];
                    if (i19 == 0) {
                        abstractC5540C = this.f45342c;
                    } else {
                        AbstractC3557B.Z(c5542e7);
                        abstractC5540C = c5542e7.U(i20, true);
                    }
                    if (abstractC5540C != null) {
                        if (i19 != intArray.length - 1) {
                            if (abstractC5540C instanceof C5542E) {
                                while (true) {
                                    c5542e = (C5542E) abstractC5540C;
                                    AbstractC3557B.Z(c5542e);
                                    if (!(c5542e.U(c5542e.f45228p0, true) instanceof C5542E)) {
                                        break;
                                    }
                                    abstractC5540C = c5542e.U(c5542e.f45228p0, true);
                                }
                                c5542e7 = c5542e;
                            }
                        } else {
                            C5542E c5542e8 = this.f45342c;
                            AbstractC3557B.Z(c5542e8);
                            n(abstractC5540C, bundle6, new C5548K(false, false, c5542e8.f45221l0, true, false, 0, 0, -1, -1));
                        }
                    } else {
                        int i21 = AbstractC5540C.f45214n0;
                        throw new IllegalStateException("Deep Linking failed: destination " + B2.u.w(context, i20) + " cannot be found in graph " + c5542e7);
                    }
                }
                this.f45345f = true;
                return true;
            }
        }
        intArray = null;
        if (extras == null) {
        }
        Bundle bundle322 = new Bundle();
        if (extras == null) {
        }
        if (bundle != null) {
        }
        if (intArray != null) {
        }
        C5542E c5542e322 = this.f45342c;
        AbstractC3557B.Z(c5542e322);
        I10 = c5542e322.I(new U3.u(intent));
        if (I10 != null) {
        }
        if (intArray != null) {
        }
        return false;
    }

    public final void m(C5562l c5562l, C5562l c5562l2) {
        this.f45350k.put(c5562l, c5562l2);
        LinkedHashMap linkedHashMap = this.f45351l;
        if (linkedHashMap.get(c5562l2) == null) {
            linkedHashMap.put(c5562l2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(c5562l2);
        AbstractC3557B.Z(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:664)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:522)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:280)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:167)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:286)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:265)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7 A[LOOP:2: B:39:0x00b1->B:41:0x00b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e0 A[LOOP:6: B:75:0x01da->B:77:0x01e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.jvm.internal.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(s3.AbstractC5540C r28, android.os.Bundle r29, s3.C5548K r30) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.AbstractC5568s.n(s3.C, android.os.Bundle, s3.K):void");
    }

    public final void o() {
        Bundle bundle;
        int[] iArr;
        Bundle bundle2;
        Bundle bundle3;
        Intent intent;
        int i10 = 0;
        if (i() == 1) {
            Activity activity = this.f45341b;
            if (activity != null && (intent = activity.getIntent()) != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                iArr = bundle.getIntArray("android-support-nav:controller:deepLinkIds");
            } else {
                iArr = null;
            }
            if (iArr != null) {
                if (this.f45345f) {
                    AbstractC3557B.Z(activity);
                    Intent intent2 = activity.getIntent();
                    Bundle extras = intent2.getExtras();
                    AbstractC3557B.Z(extras);
                    int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                    AbstractC3557B.Z(intArray);
                    ArrayList A32 = kf.q.A3(intArray);
                    ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                    int intValue = ((Number) kf.s.U1(A32)).intValue();
                    if (parcelableArrayList != null) {
                        Bundle bundle4 = (Bundle) kf.s.U1(parcelableArrayList);
                    }
                    if (!A32.isEmpty()) {
                        AbstractC5540C f6 = f(j(), intValue);
                        if (f6 instanceof C5542E) {
                            int i11 = C5542E.f45226s0;
                            intValue = P5.c.y((C5542E) f6).f45221l0;
                        }
                        AbstractC5540C h10 = h();
                        if (h10 != null && intValue == h10.f45221l0) {
                            z zVar = new z((C5545H) this);
                            Bundle L10 = R4.b.L(new C3959i("android-support-nav:controller:deepLinkIntent", intent2));
                            Bundle bundle5 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
                            if (bundle5 != null) {
                                L10.putAll(bundle5);
                            }
                            zVar.f45398e = L10;
                            ((Intent) zVar.f45395b).putExtra("android-support-nav:controller:deepLinkExtras", L10);
                            Iterator it = A32.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                int i12 = i10 + 1;
                                if (i10 >= 0) {
                                    int intValue2 = ((Number) next).intValue();
                                    if (parcelableArrayList != null) {
                                        bundle3 = (Bundle) parcelableArrayList.get(i10);
                                    } else {
                                        bundle3 = null;
                                    }
                                    ((List) zVar.f45397d).add(new C5574y(intValue2, bundle3));
                                    if (((C5542E) zVar.f45396c) != null) {
                                        zVar.g();
                                    }
                                    i10 = i12;
                                } else {
                                    AbstractC4344b.d1();
                                    throw null;
                                }
                            }
                            zVar.b().r();
                            activity.finish();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            AbstractC5540C h11 = h();
            AbstractC3557B.Z(h11);
            int i13 = h11.f45221l0;
            for (C5542E c5542e = h11.f45216Z; c5542e != null; c5542e = c5542e.f45216Z) {
                if (c5542e.f45228p0 != i13) {
                    Bundle bundle6 = new Bundle();
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        bundle6.putParcelable("android-support-nav:controller:deepLinkIntent", activity.getIntent());
                        C5542E c5542e2 = this.f45342c;
                        AbstractC3557B.Z(c5542e2);
                        Intent intent3 = activity.getIntent();
                        AbstractC3557B.b0("activity!!.intent", intent3);
                        C5539B I10 = c5542e2.I(new U3.u(intent3));
                        if (I10 != null) {
                            bundle2 = I10.f45209Z;
                        } else {
                            bundle2 = null;
                        }
                        if (bundle2 != null) {
                            bundle6.putAll(I10.f45208Y.s(I10.f45209Z));
                        }
                    }
                    z zVar2 = new z((C5545H) this);
                    int i14 = c5542e.f45221l0;
                    ((List) zVar2.f45397d).clear();
                    ((List) zVar2.f45397d).add(new C5574y(i14, null));
                    if (((C5542E) zVar2.f45396c) != null) {
                        zVar2.g();
                    }
                    zVar2.f45398e = bundle6;
                    ((Intent) zVar2.f45395b).putExtra("android-support-nav:controller:deepLinkExtras", bundle6);
                    zVar2.b().r();
                    if (activity != null) {
                        activity.finish();
                        return;
                    }
                    return;
                }
                i13 = c5542e.f45221l0;
            }
            return;
        }
        p();
    }

    public final boolean p() {
        if (this.f45346g.isEmpty()) {
            return false;
        }
        AbstractC5540C h10 = h();
        AbstractC3557B.Z(h10);
        if (!q(h10.f45221l0, true, false) || !c()) {
            return false;
        }
        return true;
    }

    public final boolean q(int i10, boolean z10, boolean z11) {
        AbstractC5540C abstractC5540C;
        C4288m c4288m = this.f45346g;
        if (c4288m.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = kf.t.y2(c4288m).iterator();
        while (true) {
            if (it.hasNext()) {
                abstractC5540C = ((C5562l) it.next()).f45306Z;
                W b10 = this.f45361v.b(abstractC5540C.f45215Y);
                if (z10 || abstractC5540C.f45221l0 != i10) {
                    arrayList.add(b10);
                }
                if (abstractC5540C.f45221l0 == i10) {
                    break;
                }
            } else {
                abstractC5540C = null;
                break;
            }
        }
        if (abstractC5540C == null) {
            int i11 = AbstractC5540C.f45214n0;
            String w10 = B2.u.w(this.f45340a, i10);
            Log.i("NavController", "Ignoring popBackStack to destination " + w10 + " as it was not found on the current back stack");
            return false;
        }
        return d(arrayList, abstractC5540C, z10, z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3 A[EDGE_INSN: B:55:0x00c3->B:45:0x00c3 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(String str, boolean z10, boolean z11) {
        Object obj;
        AbstractC5540C abstractC5540C;
        boolean z12;
        AbstractC5540C abstractC5540C2;
        T t10;
        Object obj2;
        Object obj3;
        C4288m c4288m = this.f45346g;
        if (c4288m.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = c4288m.listIterator(c4288m.r());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                C5562l c5562l = (C5562l) obj;
                AbstractC5540C abstractC5540C3 = c5562l.f45306Z;
                Bundle d10 = c5562l.d();
                abstractC5540C3.getClass();
                if (!AbstractC3557B.K(abstractC5540C3.f45222m0, str)) {
                    C5539B M10 = abstractC5540C3.M(str);
                    if (M10 != null) {
                        abstractC5540C2 = M10.f45208Y;
                    } else {
                        abstractC5540C2 = null;
                    }
                    if (AbstractC3557B.K(abstractC5540C3, abstractC5540C2)) {
                        if (d10 != null) {
                            Bundle bundle = M10.f45209Z;
                            if (bundle != null) {
                                Set<String> keySet = bundle.keySet();
                                AbstractC3557B.b0("matchingArgs.keySet()", keySet);
                                for (String str2 : keySet) {
                                    if (d10.containsKey(str2)) {
                                        C5557g c5557g = (C5557g) M10.f45208Y.f45220k0.get(str2);
                                        if (c5557g != null) {
                                            t10 = c5557g.f45297a;
                                        } else {
                                            t10 = null;
                                        }
                                        if (t10 != null) {
                                            AbstractC3557B.b0(SubscriberAttributeKt.JSON_NAME_KEY, str2);
                                            obj2 = t10.a(bundle, str2);
                                        } else {
                                            obj2 = null;
                                        }
                                        if (t10 != null) {
                                            AbstractC3557B.b0(SubscriberAttributeKt.JSON_NAME_KEY, str2);
                                            obj3 = t10.a(d10, str2);
                                        } else {
                                            obj3 = null;
                                        }
                                        if (!AbstractC3557B.K(obj2, obj3)) {
                                        }
                                    }
                                }
                            }
                        } else {
                            M10.getClass();
                        }
                    }
                    z12 = false;
                    if (!z10 || !z12) {
                        arrayList.add(this.f45361v.b(c5562l.f45306Z.f45215Y));
                        continue;
                    }
                    if (z12) {
                        break;
                    }
                }
                z12 = true;
                if (!z10) {
                }
                arrayList.add(this.f45361v.b(c5562l.f45306Z.f45215Y));
                continue;
                if (z12) {
                }
            } else {
                obj = null;
                break;
            }
        }
        C5562l c5562l2 = (C5562l) obj;
        if (c5562l2 != null) {
            abstractC5540C = c5562l2.f45306Z;
        } else {
            abstractC5540C = null;
        }
        if (abstractC5540C == null) {
            Log.i("NavController", "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
            return false;
        }
        return d(arrayList, abstractC5540C, z10, z11);
    }

    public final void s(C5562l c5562l, boolean z10, C4288m c4288m) {
        C5569t c5569t;
        n0 n0Var;
        Set set;
        C4288m c4288m2 = this.f45346g;
        C5562l c5562l2 = (C5562l) c4288m2.last();
        if (AbstractC3557B.K(c5562l2, c5562l)) {
            c4288m2.removeLast();
            C5565o c5565o = (C5565o) this.f45362w.get(this.f45361v.b(c5562l2.f45306Z.f45215Y));
            boolean z11 = true;
            if ((c5565o == null || (n0Var = c5565o.f45328f) == null || (set = (Set) n0Var.f14881Y.getValue()) == null || !set.contains(c5562l2)) && !this.f45351l.containsKey(c5562l2)) {
                z11 = false;
            }
            EnumC2082q enumC2082q = c5562l2.f45312m0.f25386f;
            EnumC2082q enumC2082q2 = EnumC2082q.f25377h0;
            if (enumC2082q.a(enumC2082q2)) {
                if (z10) {
                    c5562l2.g(enumC2082q2);
                    c4288m.addFirst(new C5563m(c5562l2));
                }
                if (!z11) {
                    c5562l2.g(EnumC2082q.f25375Y);
                    w(c5562l2);
                } else {
                    c5562l2.g(enumC2082q2);
                }
            }
            if (!z10 && !z11 && (c5569t = this.f45355p) != null) {
                String str = c5562l2.f45310k0;
                AbstractC3557B.c0("backStackEntryId", str);
                d0 d0Var = (d0) c5569t.f45367d.remove(str);
                if (d0Var != null) {
                    d0Var.a();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + c5562l.f45306Z + ", which is not the top of the back stack (" + c5562l2.f45306Z + ')').toString());
    }

    public final ArrayList u() {
        EnumC2082q enumC2082q;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f45362w.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            enumC2082q = EnumC2082q.f25378i0;
            if (!hasNext) {
                break;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : (Iterable) ((C5565o) it.next()).f45328f.f14881Y.getValue()) {
                C5562l c5562l = (C5562l) obj;
                if (!arrayList.contains(c5562l) && !c5562l.f45315p0.a(enumC2082q)) {
                    arrayList2.add(obj);
                }
            }
            kf.s.N1(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f45346g.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C5562l c5562l2 = (C5562l) next;
            if (!arrayList.contains(c5562l2) && c5562l2.f45315p0.a(enumC2082q)) {
                arrayList3.add(next);
            }
        }
        kf.s.N1(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((C5562l) next2).f45306Z instanceof C5542E)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.jvm.internal.x] */
    public final boolean v(int i10, Bundle bundle, C5548K c5548k) {
        AbstractC5540C abstractC5540C;
        C5562l c5562l;
        AbstractC5540C abstractC5540C2;
        LinkedHashMap linkedHashMap = this.f45352m;
        if (!linkedHashMap.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i10));
        kf.s.S1(linkedHashMap.values(), new C0039q0(str, 3));
        LinkedHashMap linkedHashMap2 = this.f45353n;
        Ad.l.I(linkedHashMap2);
        C4288m c4288m = (C4288m) linkedHashMap2.remove(str);
        ArrayList arrayList = new ArrayList();
        C5562l c5562l2 = (C5562l) this.f45346g.T();
        if (c5562l2 == null || (abstractC5540C = c5562l2.f45306Z) == null) {
            abstractC5540C = j();
        }
        if (c4288m != null) {
            Iterator it = c4288m.iterator();
            while (it.hasNext()) {
                C5563m c5563m = (C5563m) it.next();
                AbstractC5540C f6 = f(abstractC5540C, c5563m.f45318Z);
                Context context = this.f45340a;
                if (f6 != null) {
                    arrayList.add(c5563m.a(context, f6, k(), this.f45355p));
                    abstractC5540C = f6;
                } else {
                    int i11 = AbstractC5540C.f45214n0;
                    String w10 = B2.u.w(context, c5563m.f45318Z);
                    throw new IllegalStateException(("Restore State failed: destination " + w10 + " cannot be found from the current destination " + abstractC5540C).toString());
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!(((C5562l) next).f45306Z instanceof C5542E)) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it3.hasNext()) {
                break;
            }
            C5562l c5562l3 = (C5562l) it3.next();
            List list = (List) kf.t.p2(arrayList2);
            if (list != null && (c5562l = (C5562l) kf.t.o2(list)) != null && (abstractC5540C2 = c5562l.f45306Z) != null) {
                str2 = abstractC5540C2.f45215Y;
            }
            if (AbstractC3557B.K(str2, c5562l3.f45306Z.f45215Y)) {
                list.add(c5562l3);
            } else {
                arrayList2.add(AbstractC4344b.N0(c5562l3));
            }
        }
        ?? obj = new Object();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            List list2 = (List) it4.next();
            W b10 = this.f45361v.b(((C5562l) kf.t.f2(list2)).f45306Z.f45215Y);
            this.f45363x = new C3278d(obj, arrayList, new Object(), this, bundle, 3);
            b10.d(list2, c5548k);
            this.f45363x = null;
        }
        return obj.f37645Y;
    }

    public final void w(C5562l c5562l) {
        Integer num;
        AbstractC3557B.c0("child", c5562l);
        C5562l c5562l2 = (C5562l) this.f45350k.remove(c5562l);
        if (c5562l2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f45351l;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(c5562l2);
        if (atomicInteger != null) {
            num = Integer.valueOf(atomicInteger.decrementAndGet());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            C5565o c5565o = (C5565o) this.f45362w.get(this.f45361v.b(c5562l2.f45306Z.f45215Y));
            if (c5565o != null) {
                c5565o.b(c5562l2);
            }
            linkedHashMap.remove(c5562l2);
        }
    }

    public final void x() {
        Boolean bool;
        AtomicInteger atomicInteger;
        n0 n0Var;
        Set set;
        ArrayList M22 = kf.t.M2(this.f45346g);
        if (M22.isEmpty()) {
            return;
        }
        AbstractC5540C abstractC5540C = ((C5562l) kf.t.o2(M22)).f45306Z;
        ArrayList arrayList = new ArrayList();
        if (abstractC5540C instanceof AbstractC5555e) {
            for (C5562l c5562l : kf.t.y2(M22)) {
                AbstractC5540C abstractC5540C2 = c5562l.f45306Z;
                arrayList.add(abstractC5540C2);
                if (!(abstractC5540C2 instanceof AbstractC5555e) && !(abstractC5540C2 instanceof C5542E)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (C5562l c5562l2 : kf.t.y2(M22)) {
            EnumC2082q enumC2082q = c5562l2.f45315p0;
            AbstractC5540C abstractC5540C3 = c5562l2.f45306Z;
            EnumC2082q enumC2082q2 = EnumC2082q.f25379j0;
            EnumC2082q enumC2082q3 = EnumC2082q.f25378i0;
            if (abstractC5540C != null && abstractC5540C3.f45221l0 == abstractC5540C.f45221l0) {
                if (enumC2082q != enumC2082q2) {
                    C5565o c5565o = (C5565o) this.f45362w.get(this.f45361v.b(abstractC5540C3.f45215Y));
                    if (c5565o != null && (n0Var = c5565o.f45328f) != null && (set = (Set) n0Var.f14881Y.getValue()) != null) {
                        bool = Boolean.valueOf(set.contains(c5562l2));
                    } else {
                        bool = null;
                    }
                    if (!AbstractC3557B.K(bool, Boolean.TRUE) && ((atomicInteger = (AtomicInteger) this.f45351l.get(c5562l2)) == null || atomicInteger.get() != 0)) {
                        hashMap.put(c5562l2, enumC2082q2);
                    } else {
                        hashMap.put(c5562l2, enumC2082q3);
                    }
                }
                AbstractC5540C abstractC5540C4 = (AbstractC5540C) kf.t.h2(arrayList);
                if (abstractC5540C4 != null && abstractC5540C4.f45221l0 == abstractC5540C3.f45221l0) {
                    kf.s.T1(arrayList);
                }
                abstractC5540C = abstractC5540C.f45216Z;
            } else if ((!arrayList.isEmpty()) && abstractC5540C3.f45221l0 == ((AbstractC5540C) kf.t.f2(arrayList)).f45221l0) {
                AbstractC5540C abstractC5540C5 = (AbstractC5540C) kf.s.T1(arrayList);
                if (enumC2082q == enumC2082q2) {
                    c5562l2.g(enumC2082q3);
                } else if (enumC2082q != enumC2082q3) {
                    hashMap.put(c5562l2, enumC2082q3);
                }
                C5542E c5542e = abstractC5540C5.f45216Z;
                if (c5542e != null && !arrayList.contains(c5542e)) {
                    arrayList.add(c5542e);
                }
            } else {
                c5562l2.g(EnumC2082q.f25377h0);
            }
        }
        Iterator it = M22.iterator();
        while (it.hasNext()) {
            C5562l c5562l3 = (C5562l) it.next();
            EnumC2082q enumC2082q4 = (EnumC2082q) hashMap.get(c5562l3);
            if (enumC2082q4 != null) {
                c5562l3.g(enumC2082q4);
            } else {
                c5562l3.i();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (i() > 1) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y() {
        boolean z10;
        if (this.f45360u) {
            z10 = true;
        }
        z10 = false;
        C3105D c3105d = this.f45359t;
        c3105d.f30995a = z10;
        AbstractC6216a abstractC6216a = c3105d.f30997c;
        if (abstractC6216a != null) {
            abstractC6216a.mo122invoke();
        }
    }
}
