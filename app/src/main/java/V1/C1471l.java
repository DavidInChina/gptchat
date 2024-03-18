package V1;

import D1.AbstractC0346d0;
import D1.ViewTreeObserver$OnPreDrawListenerC0377x;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.openai.chatgpt.R;
import d0.C2564b;
import g.RunnableC3111d;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.WeakHashMap;
import jf.C3959i;
import m.RunnableC4517N;
import w.C6049A;
import w.C6059f;
import y1.C6497g;

/* renamed from: V1.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1471l {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f18216a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f18217b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f18218c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f18219d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18220e;

    public C1471l(ViewGroup viewGroup) {
        AbstractC3557B.c0("container", viewGroup);
        this.f18216a = viewGroup;
    }

    public static void a(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (AbstractC0346d0.b(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(view);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    a(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void i(View view, C6059f c6059f) {
        WeakHashMap weakHashMap = D1.Z.f3247a;
        String k10 = D1.N.k(view);
        if (k10 != null) {
            c6059f.put(k10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    i(childAt, c6059f);
                }
            }
        }
    }

    public static final C1471l l(ViewGroup viewGroup, K k10) {
        AbstractC3557B.c0("container", viewGroup);
        AbstractC3557B.c0("fragmentManager", k10);
        AbstractC3557B.b0("fragmentManager.specialEffectsControllerFactory", k10.F());
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C1471l) {
            return (C1471l) tag;
        }
        C1471l c1471l = new C1471l(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c1471l);
        return c1471l;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [y1.g, java.lang.Object] */
    public final void b(int i10, int i11, P p10) {
        synchronized (this.f18217b) {
            ?? obj = new Object();
            AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = p10.f18101c;
            AbstractC3557B.b0("fragmentStateManager.fragment", abstractComponentCallbacksC1480v);
            e0 j6 = j(abstractComponentCallbacksC1480v);
            if (j6 != null) {
                j6.c(i10, i11);
                return;
            }
            final d0 d0Var = new d0(i10, i11, p10, obj);
            this.f18217b.add(d0Var);
            d0Var.f18186d.add(new Runnable(this) { // from class: V1.c0

                /* renamed from: Z  reason: collision with root package name */
                public final /* synthetic */ C1471l f18175Z;

                {
                    this.f18175Z = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = r3;
                    d0 d0Var2 = d0Var;
                    C1471l c1471l = this.f18175Z;
                    switch (i12) {
                        case 0:
                            AbstractC3557B.c0("this$0", c1471l);
                            AbstractC3557B.c0("$operation", d0Var2);
                            if (c1471l.f18217b.contains(d0Var2)) {
                                int i13 = d0Var2.f18183a;
                                View view = d0Var2.f18185c.f18269J0;
                                AbstractC3557B.b0("operation.fragment.mView", view);
                                R.a.i(i13, view);
                                return;
                            }
                            return;
                        default:
                            AbstractC3557B.c0("this$0", c1471l);
                            AbstractC3557B.c0("$operation", d0Var2);
                            c1471l.f18217b.remove(d0Var2);
                            c1471l.f18218c.remove(d0Var2);
                            return;
                    }
                }
            });
            d0Var.f18186d.add(new Runnable(this) { // from class: V1.c0

                /* renamed from: Z  reason: collision with root package name */
                public final /* synthetic */ C1471l f18175Z;

                {
                    this.f18175Z = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = r3;
                    d0 d0Var2 = d0Var;
                    C1471l c1471l = this.f18175Z;
                    switch (i12) {
                        case 0:
                            AbstractC3557B.c0("this$0", c1471l);
                            AbstractC3557B.c0("$operation", d0Var2);
                            if (c1471l.f18217b.contains(d0Var2)) {
                                int i13 = d0Var2.f18183a;
                                View view = d0Var2.f18185c.f18269J0;
                                AbstractC3557B.b0("operation.fragment.mView", view);
                                R.a.i(i13, view);
                                return;
                            }
                            return;
                        default:
                            AbstractC3557B.c0("this$0", c1471l);
                            AbstractC3557B.c0("$operation", d0Var2);
                            c1471l.f18217b.remove(d0Var2);
                            c1471l.f18218c.remove(d0Var2);
                            return;
                    }
                }
            });
        }
    }

    public final void c(int i10, P p10) {
        AbstractC2469q0.q("finalState", i10);
        AbstractC3557B.c0("fragmentStateManager", p10);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + p10.f18101c);
        }
        b(i10, 2, p10);
    }

    public final void d(P p10) {
        AbstractC3557B.c0("fragmentStateManager", p10);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + p10.f18101c);
        }
        b(3, 1, p10);
    }

    public final void e(P p10) {
        AbstractC3557B.c0("fragmentStateManager", p10);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + p10.f18101c);
        }
        b(1, 3, p10);
    }

    public final void f(P p10) {
        AbstractC3557B.c0("fragmentStateManager", p10);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + p10.f18101c);
        }
        b(2, 1, p10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v20, types: [w.A, w.f] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v77, types: [y1.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v78, types: [y1.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v81, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object, w.A, w.f] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v6, types: [w.A] */
    /* JADX WARN: Type inference failed for: r6v7, types: [w.A, w.f] */
    public final void g(ArrayList arrayList, boolean z10) {
        String str;
        Object obj;
        ?? r22;
        ArrayList arrayList2;
        e0 e0Var;
        ArrayList arrayList3;
        e0 e0Var2;
        String str2;
        ViewGroup viewGroup;
        String str3;
        LinkedHashMap linkedHashMap;
        boolean z11;
        e0 e0Var3;
        e0 e0Var4;
        e0 e0Var5;
        View view;
        View view2;
        boolean z12;
        Iterator it;
        String str4;
        Iterator it2;
        boolean z13;
        View view3;
        View view4;
        ArrayList arrayList4;
        String str5;
        e0 e0Var6;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        C3959i c3959i;
        View view5;
        View view6;
        C1468i c1468i;
        boolean z14;
        boolean z15 = z10;
        Iterator it3 = arrayList.iterator();
        while (true) {
            str = "operation.fragment.mView";
            if (it3.hasNext()) {
                obj = it3.next();
                e0 e0Var7 = (e0) obj;
                View view7 = e0Var7.f18185c.f18269J0;
                AbstractC3557B.b0(str, view7);
                if (Gi.e.h(view7) == 2 && e0Var7.f18183a != 2) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        e0 e0Var8 = (e0) obj;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                r22 = listIterator.previous();
                e0 e0Var9 = (e0) r22;
                View view8 = e0Var9.f18185c.f18269J0;
                AbstractC3557B.b0(str, view8);
                if (Gi.e.h(view8) != 2 && e0Var9.f18183a == 2) {
                    break;
                }
            } else {
                r22 = 0;
                break;
            }
        }
        e0 e0Var10 = r22;
        String str6 = "FragmentManager";
        if (Log.isLoggable(str6, 2)) {
            Log.v(str6, "Executing operations from " + e0Var8 + " to " + e0Var10);
        }
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList M22 = kf.t.M2(arrayList);
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = ((e0) kf.t.o2(arrayList)).f18185c;
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            C1479u c1479u = ((e0) it4.next()).f18185c.f18272M0;
            C1479u c1479u2 = abstractComponentCallbacksC1480v.f18272M0;
            c1479u.f18247b = c1479u2.f18247b;
            c1479u.f18248c = c1479u2.f18248c;
            c1479u.f18249d = c1479u2.f18249d;
            c1479u.f18250e = c1479u2.f18250e;
        }
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            e0 e0Var11 = (e0) it5.next();
            ?? obj2 = new Object();
            e0Var11.d();
            LinkedHashSet linkedHashSet = e0Var11.f18187e;
            linkedHashSet.add(obj2);
            arrayList9.add(new C1467h(e0Var11, obj2, z15));
            ?? obj3 = new Object();
            e0Var11.d();
            linkedHashSet.add(obj3);
            if (!z15 ? e0Var11 == e0Var10 : e0Var11 == e0Var8) {
                z14 = true;
            } else {
                z14 = false;
            }
            arrayList10.add(new C1468i(e0Var11, obj3, z15, z14));
            e0Var11.f18186d.add(new Q1.n(M22, e0Var11, this, 1));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList11 = new ArrayList();
        Iterator it6 = arrayList10.iterator();
        while (it6.hasNext()) {
            Object next = it6.next();
            if (!((C1468i) next).g()) {
                arrayList11.add(next);
            }
        }
        ArrayList arrayList12 = new ArrayList();
        Iterator it7 = arrayList11.iterator();
        while (it7.hasNext()) {
            Object next2 = it7.next();
            if (((C1468i) next2).k() != null) {
                arrayList12.add(next2);
            }
        }
        Iterator it8 = arrayList12.iterator();
        Z z16 = null;
        while (it8.hasNext()) {
            Z k10 = ((C1468i) it8.next()).k();
            if (z16 != null && k10 != z16) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + ((e0) c1468i.f38593Y).f18185c + " returned Transition " + c1468i.f18204h0 + " which uses a different Transition type than other Fragments.").toString());
            }
            z16 = k10;
        }
        ViewGroup viewGroup2 = this.f18216a;
        if (z16 == null) {
            Iterator it9 = arrayList10.iterator();
            while (it9.hasNext()) {
                C1468i c1468i2 = (C1468i) it9.next();
                linkedHashMap2.put((e0) c1468i2.f38593Y, Boolean.FALSE);
                c1468i2.b();
            }
            arrayList2 = M22;
            e0Var2 = e0Var8;
            e0Var = e0Var10;
            str3 = str6;
            str2 = " to ";
            arrayList3 = arrayList9;
            viewGroup = viewGroup2;
            linkedHashMap = linkedHashMap2;
        } else {
            View view9 = new View(viewGroup2.getContext());
            Rect rect = new Rect();
            ArrayList arrayList13 = new ArrayList();
            str2 = " to ";
            ArrayList arrayList14 = new ArrayList();
            View view10 = view9;
            Object c6049a = new C6049A(0);
            Iterator it10 = arrayList10.iterator();
            Object obj4 = null;
            View view11 = null;
            boolean z17 = false;
            while (it10.hasNext()) {
                ViewGroup viewGroup3 = viewGroup2;
                Object obj5 = ((C1468i) it10.next()).f18206j0;
                if (obj5 != null && e0Var8 != null && e0Var10 != null) {
                    Object r10 = z16.r(z16.f(obj5));
                    AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v2 = e0Var10.f18185c;
                    C1479u c1479u3 = abstractComponentCallbacksC1480v2.f18272M0;
                    if (c1479u3 == null || (arrayList5 = c1479u3.f18252g) == null) {
                        arrayList5 = new ArrayList();
                    }
                    Rect rect2 = rect;
                    AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v3 = e0Var8.f18185c;
                    Z z18 = z16;
                    C1479u c1479u4 = abstractComponentCallbacksC1480v3.f18272M0;
                    if (c1479u4 == null || (arrayList6 = c1479u4.f18252g) == null) {
                        arrayList6 = new ArrayList();
                    }
                    ArrayList arrayList15 = M22;
                    C1479u c1479u5 = abstractComponentCallbacksC1480v3.f18272M0;
                    if (c1479u5 == null || (arrayList7 = c1479u5.f18253h) == null) {
                        arrayList7 = new ArrayList();
                    }
                    ArrayList arrayList16 = arrayList10;
                    int size = arrayList7.size();
                    str5 = str;
                    ArrayList arrayList17 = arrayList9;
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = size;
                        int indexOf = arrayList5.indexOf(arrayList7.get(i10));
                        if (indexOf != -1) {
                            arrayList5.set(indexOf, arrayList6.get(i10));
                        }
                        i10++;
                        size = i11;
                    }
                    C1479u c1479u6 = abstractComponentCallbacksC1480v2.f18272M0;
                    if (c1479u6 == null || (arrayList8 = c1479u6.f18253h) == null) {
                        arrayList8 = new ArrayList();
                    }
                    ArrayList arrayList18 = arrayList8;
                    if (!z15) {
                        c3959i = new C3959i(null, null);
                    } else {
                        c3959i = new C3959i(null, null);
                    }
                    AbstractC2469q0.p(c3959i.f36155Y);
                    AbstractC2469q0.p(c3959i.f36156Z);
                    int size2 = arrayList5.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        c6049a.put((String) arrayList5.get(i12), (String) arrayList18.get(i12));
                    }
                    if (Log.isLoggable(str6, 2)) {
                        Log.v(str6, ">>> entering view names <<<");
                        Iterator it11 = arrayList18.iterator();
                        while (it11.hasNext()) {
                            Log.v(str6, "Name: " + ((String) it11.next()));
                        }
                        Log.v(str6, ">>> exiting view names <<<");
                        Iterator it12 = arrayList5.iterator();
                        while (it12.hasNext()) {
                            Log.v(str6, "Name: " + ((String) it12.next()));
                        }
                    }
                    ?? c6049a2 = new C6049A(0);
                    View view12 = abstractComponentCallbacksC1480v3.f18269J0;
                    AbstractC3557B.b0("firstOut.fragment.mView", view12);
                    i(view12, c6049a2);
                    c6049a2.m(arrayList5);
                    c6049a.m(c6049a2.keySet());
                    ?? c6049a3 = new C6049A(0);
                    View view13 = abstractComponentCallbacksC1480v2.f18269J0;
                    AbstractC3557B.b0("lastIn.fragment.mView", view13);
                    i(view13, c6049a3);
                    c6049a3.m(arrayList18);
                    c6049a3.m(c6049a.values());
                    X x10 = S.f18113a;
                    for (int i13 = c6049a.f47560h0 - 1; -1 < i13; i13--) {
                        if (!c6049a3.containsKey((String) c6049a.j(i13))) {
                            c6049a.h(i13);
                        }
                    }
                    kf.s.Q1(c6049a2.entrySet(), new C2564b(3, c6049a.keySet()), false);
                    kf.s.Q1(c6049a3.entrySet(), new C2564b(3, c6049a.values()), false);
                    if (c6049a.isEmpty()) {
                        arrayList13.clear();
                        arrayList14.clear();
                        viewGroup2 = viewGroup3;
                        rect = rect2;
                        z16 = z18;
                        M22 = arrayList15;
                        arrayList10 = arrayList16;
                        arrayList9 = arrayList17;
                        str = str5;
                        obj4 = null;
                    } else {
                        View view14 = view10;
                        View view15 = view11;
                        ArrayList arrayList19 = arrayList5;
                        Object obj6 = c6049a;
                        String str7 = str6;
                        e0 e0Var12 = e0Var10;
                        LinkedHashMap linkedHashMap3 = linkedHashMap2;
                        e0 e0Var13 = e0Var8;
                        arrayList4 = arrayList15;
                        ViewTreeObserver$OnPreDrawListenerC0377x.a(viewGroup3, new RunnableC1466g(e0Var10, e0Var8, z10, c6049a3, 0));
                        arrayList13.addAll(c6049a2.values());
                        if (!arrayList19.isEmpty()) {
                            view5 = (View) c6049a2.get((String) arrayList19.get(0));
                            z18.m(view5, r10);
                        } else {
                            view5 = view15;
                        }
                        arrayList14.addAll(c6049a3.values());
                        if ((!arrayList18.isEmpty()) && (view6 = (View) c6049a3.get((String) arrayList18.get(0))) != null) {
                            ViewTreeObserver$OnPreDrawListenerC0377x.a(viewGroup3, new Q1.n(z18, view6, rect2, 2));
                            z17 = true;
                        }
                        z18.p(r10, view14, arrayList13);
                        z18.l(r10, null, null, r10, arrayList14);
                        Boolean bool = Boolean.TRUE;
                        e0Var6 = e0Var13;
                        linkedHashMap3.put(e0Var6, bool);
                        linkedHashMap3.put(e0Var12, bool);
                        view11 = view5;
                        obj4 = r10;
                        view10 = view14;
                        z16 = z18;
                        linkedHashMap2 = linkedHashMap3;
                        rect = rect2;
                        viewGroup2 = viewGroup3;
                        e0Var10 = e0Var12;
                        arrayList10 = arrayList16;
                        arrayList9 = arrayList17;
                        c6049a = obj6;
                        str6 = str7;
                    }
                } else {
                    arrayList4 = M22;
                    str5 = str;
                    e0Var6 = e0Var8;
                    view10 = view10;
                    z16 = z16;
                    linkedHashMap2 = linkedHashMap2;
                    rect = rect;
                    viewGroup2 = viewGroup3;
                    e0Var10 = e0Var10;
                    arrayList10 = arrayList10;
                    arrayList9 = arrayList9;
                    c6049a = c6049a;
                    str6 = str6;
                    view11 = view11;
                }
                M22 = arrayList4;
                z15 = z10;
                e0Var8 = e0Var6;
                str = str5;
            }
            arrayList2 = M22;
            ArrayList arrayList20 = arrayList10;
            C6059f c6059f = c6049a;
            String str8 = str;
            e0 e0Var14 = e0Var8;
            String str9 = str6;
            arrayList3 = arrayList9;
            View view16 = view10;
            View view17 = view11;
            viewGroup = viewGroup2;
            linkedHashMap = linkedHashMap2;
            e0 e0Var15 = e0Var10;
            Rect rect3 = rect;
            Z z19 = z16;
            ArrayList arrayList21 = new ArrayList();
            Iterator it13 = arrayList20.iterator();
            Object obj7 = null;
            Object obj8 = null;
            while (it13.hasNext()) {
                C1468i c1468i3 = (C1468i) it13.next();
                if (c1468i3.g()) {
                    it2 = it13;
                    linkedHashMap.put((e0) c1468i3.f38593Y, Boolean.FALSE);
                    c1468i3.b();
                } else {
                    it2 = it13;
                    Object f6 = z19.f(c1468i3.f18204h0);
                    e0 e0Var16 = (e0) c1468i3.f38593Y;
                    if (obj4 != null && (e0Var16 == e0Var14 || e0Var16 == e0Var15)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (f6 == null) {
                        if (!z13) {
                            linkedHashMap.put(e0Var16, Boolean.FALSE);
                            c1468i3.b();
                        }
                    } else {
                        e0 e0Var17 = e0Var15;
                        ArrayList arrayList22 = new ArrayList();
                        Object obj9 = obj4;
                        View view18 = e0Var16.f18185c.f18269J0;
                        Object obj10 = obj8;
                        String str10 = str8;
                        AbstractC3557B.b0(str10, view18);
                        a(arrayList22, view18);
                        if (z13) {
                            if (e0Var16 == e0Var14) {
                                arrayList22.removeAll(kf.t.P2(arrayList13));
                            } else {
                                arrayList22.removeAll(kf.t.P2(arrayList14));
                            }
                        }
                        if (arrayList22.isEmpty()) {
                            z19.a(view16, f6);
                            str8 = str10;
                            view3 = view16;
                        } else {
                            z19.b(f6, arrayList22);
                            z19.l(f6, f6, arrayList22, null, null);
                            view3 = view16;
                            if (e0Var16.f18183a == 3) {
                                ArrayList arrayList23 = arrayList2;
                                arrayList23.remove(e0Var16);
                                ArrayList arrayList24 = new ArrayList(arrayList22);
                                str8 = str10;
                                AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v4 = e0Var16.f18185c;
                                arrayList2 = arrayList23;
                                arrayList24.remove(abstractComponentCallbacksC1480v4.f18269J0);
                                z19.k(f6, abstractComponentCallbacksC1480v4.f18269J0, arrayList24);
                                ViewTreeObserver$OnPreDrawListenerC0377x.a(viewGroup, new RunnableC3111d(10, arrayList22));
                            } else {
                                str8 = str10;
                            }
                        }
                        if (e0Var16.f18183a == 2) {
                            arrayList21.addAll(arrayList22);
                            if (z17) {
                                z19.n(f6, rect3);
                            }
                            view4 = view17;
                        } else {
                            view4 = view17;
                            z19.m(view4, f6);
                        }
                        linkedHashMap.put(e0Var16, Boolean.TRUE);
                        if (c1468i3.f18205i0) {
                            obj7 = z19.j(obj7, f6);
                            it13 = it2;
                            view17 = view4;
                            view16 = view3;
                            obj8 = obj10;
                        } else {
                            obj8 = z19.j(obj10, f6);
                            it13 = it2;
                            view17 = view4;
                            view16 = view3;
                        }
                        obj4 = obj9;
                        e0Var15 = e0Var17;
                    }
                }
                it13 = it2;
            }
            Object obj11 = obj4;
            e0Var = e0Var15;
            Object i14 = z19.i(obj7, obj8, obj11);
            if (i14 == null) {
                e0Var2 = e0Var14;
                str3 = str9;
            } else {
                ArrayList arrayList25 = new ArrayList();
                Iterator it14 = arrayList20.iterator();
                while (it14.hasNext()) {
                    Object next3 = it14.next();
                    if (!((C1468i) next3).g()) {
                        arrayList25.add(next3);
                    }
                }
                Iterator it15 = arrayList25.iterator();
                while (it15.hasNext()) {
                    C1468i c1468i4 = (C1468i) it15.next();
                    Object obj12 = c1468i4.f18204h0;
                    e0 e0Var18 = (e0) c1468i4.f38593Y;
                    e0 e0Var19 = e0Var;
                    if (obj11 != null && (e0Var18 == e0Var14 || e0Var18 == e0Var19)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (obj12 == null && !z12) {
                        it = it15;
                        str4 = str9;
                    } else {
                        WeakHashMap weakHashMap = D1.Z.f3247a;
                        if (!D1.K.c(viewGroup)) {
                            str4 = str9;
                            if (Log.isLoggable(str4, 2)) {
                                Log.v(str4, "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + e0Var18);
                            }
                            c1468i4.b();
                            it = it15;
                        } else {
                            str4 = str9;
                            AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v5 = ((e0) c1468i4.f38593Y).f18185c;
                            it = it15;
                            z19.o(i14, (C6497g) c1468i4.f38594Z, new RunnableC4517N(c1468i4, 3, e0Var18));
                        }
                    }
                    it15 = it;
                    e0Var = e0Var19;
                    str9 = str4;
                }
                str3 = str9;
                e0 e0Var20 = e0Var;
                WeakHashMap weakHashMap2 = D1.Z.f3247a;
                if (!D1.K.c(viewGroup)) {
                    e0Var = e0Var20;
                    e0Var2 = e0Var14;
                } else {
                    S.a(4, arrayList21);
                    ArrayList arrayList26 = new ArrayList();
                    int size3 = arrayList14.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        View view19 = (View) arrayList14.get(i15);
                        WeakHashMap weakHashMap3 = D1.Z.f3247a;
                        arrayList26.add(D1.N.k(view19));
                        D1.N.v(view19, null);
                    }
                    if (Log.isLoggable(str3, 2)) {
                        Log.v(str3, ">>>>> Beginning transition <<<<<");
                        Log.v(str3, ">>>>> SharedElementFirstOutViews <<<<<");
                        for (Iterator it16 = arrayList13.iterator(); it16.hasNext(); it16 = it16) {
                            Object next4 = it16.next();
                            AbstractC3557B.b0("sharedElementFirstOutViews", next4);
                            Log.v(str3, "View: " + ((View) next4) + " Name: " + D1.N.k(view2));
                        }
                        Log.v(str3, ">>>>> SharedElementLastInViews <<<<<");
                        for (Iterator it17 = arrayList14.iterator(); it17.hasNext(); it17 = it17) {
                            Object next5 = it17.next();
                            AbstractC3557B.b0("sharedElementLastInViews", next5);
                            Log.v(str3, "View: " + ((View) next5) + " Name: " + D1.N.k(view));
                        }
                    }
                    z19.c(viewGroup, i14);
                    int size4 = arrayList14.size();
                    ArrayList arrayList27 = new ArrayList();
                    int i16 = 0;
                    while (i16 < size4) {
                        View view20 = (View) arrayList13.get(i16);
                        WeakHashMap weakHashMap4 = D1.Z.f3247a;
                        String k11 = D1.N.k(view20);
                        arrayList27.add(k11);
                        if (k11 == null) {
                            e0Var4 = e0Var20;
                            e0Var5 = e0Var14;
                        } else {
                            e0Var4 = e0Var20;
                            D1.N.v(view20, null);
                            C6059f c6059f2 = c6059f;
                            String str11 = (String) c6059f2.get(k11);
                            c6059f = c6059f2;
                            int i17 = 0;
                            while (true) {
                                e0Var5 = e0Var14;
                                if (i17 >= size4) {
                                    break;
                                } else if (str11.equals(arrayList26.get(i17))) {
                                    D1.N.v((View) arrayList14.get(i17), k11);
                                    break;
                                } else {
                                    i17++;
                                    e0Var14 = e0Var5;
                                }
                            }
                        }
                        i16++;
                        e0Var14 = e0Var5;
                        e0Var20 = e0Var4;
                    }
                    e0Var = e0Var20;
                    e0Var2 = e0Var14;
                    ViewTreeObserver$OnPreDrawListenerC0377x.a(viewGroup, new Y(size4, arrayList14, arrayList26, arrayList13, arrayList27));
                    S.a(0, arrayList21);
                    z19.q(obj11, arrayList13, arrayList14);
                }
            }
        }
        boolean containsValue = linkedHashMap.containsValue(Boolean.TRUE);
        Context context = viewGroup.getContext();
        ArrayList arrayList28 = new ArrayList();
        Iterator it18 = arrayList3.iterator();
        boolean z20 = false;
        while (it18.hasNext()) {
            C1467h c1467h = (C1467h) it18.next();
            if (c1467h.g()) {
                c1467h.b();
            } else {
                AbstractC3557B.b0("context", context);
                U3.c k12 = c1467h.k(context);
                if (k12 == null) {
                    c1467h.b();
                } else {
                    Animator animator = (Animator) k12.f17397h0;
                    if (animator == null) {
                        arrayList28.add(c1467h);
                    } else {
                        e0 e0Var21 = (e0) c1467h.f38593Y;
                        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v6 = e0Var21.f18185c;
                        if (AbstractC3557B.K(linkedHashMap.get(e0Var21), Boolean.TRUE)) {
                            if (Log.isLoggable(str3, 2)) {
                                Log.v(str3, "Ignoring Animator set on " + abstractComponentCallbacksC1480v6 + " as this Fragment was involved in a Transition.");
                            }
                            c1467h.b();
                        } else {
                            if (e0Var21.f18183a == 3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            ArrayList arrayList29 = arrayList2;
                            if (z11) {
                                arrayList29.remove(e0Var21);
                            }
                            View view21 = abstractComponentCallbacksC1480v6.f18269J0;
                            viewGroup.startViewTransition(view21);
                            animator.addListener(new C1469j(this, view21, z11, e0Var21, c1467h));
                            animator.setTarget(view21);
                            animator.start();
                            if (Log.isLoggable(str3, 2)) {
                                StringBuilder sb2 = new StringBuilder("Animator from operation ");
                                e0Var3 = e0Var21;
                                sb2.append(e0Var3);
                                sb2.append(" has started.");
                                Log.v(str3, sb2.toString());
                            } else {
                                e0Var3 = e0Var21;
                            }
                            ((C6497g) c1467h.f38594Z).a(new C1464e(animator, 0, e0Var3));
                            arrayList2 = arrayList29;
                            z20 = true;
                        }
                    }
                }
            }
        }
        ArrayList arrayList30 = arrayList2;
        Iterator it19 = arrayList28.iterator();
        while (it19.hasNext()) {
            C1467h c1467h2 = (C1467h) it19.next();
            e0 e0Var22 = (e0) c1467h2.f38593Y;
            AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v7 = e0Var22.f18185c;
            if (containsValue) {
                if (Log.isLoggable(str3, 2)) {
                    Log.v(str3, "Ignoring Animation set on " + abstractComponentCallbacksC1480v7 + " as Animations cannot run alongside Transitions.");
                }
                c1467h2.b();
            } else if (z20) {
                if (Log.isLoggable(str3, 2)) {
                    Log.v(str3, "Ignoring Animation set on " + abstractComponentCallbacksC1480v7 + " as Animations cannot run alongside Animators.");
                }
                c1467h2.b();
            } else {
                View view22 = abstractComponentCallbacksC1480v7.f18269J0;
                AbstractC3557B.b0("context", context);
                U3.c k13 = c1467h2.k(context);
                if (k13 != null) {
                    Animation animation = (Animation) k13.f17396Z;
                    if (animation != null) {
                        if (e0Var22.f18183a != 1) {
                            view22.startAnimation(animation);
                            c1467h2.b();
                        } else {
                            viewGroup.startViewTransition(view22);
                            RunnableC1484z runnableC1484z = new RunnableC1484z(animation, viewGroup, view22);
                            runnableC1484z.setAnimationListener(new animation.Animation$AnimationListenerC1470k(view22, c1467h2, this, e0Var22));
                            view22.startAnimation(runnableC1484z);
                            if (Log.isLoggable(str3, 2)) {
                                Log.v(str3, "Animation from operation " + e0Var22 + " has started.");
                            }
                        }
                        ((C6497g) c1467h2.f38594Z).a(new C1465f(view22, this, c1467h2, e0Var22, 0));
                        containsValue = containsValue;
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
        }
        Iterator it20 = arrayList30.iterator();
        while (it20.hasNext()) {
            e0 e0Var23 = (e0) it20.next();
            View view23 = e0Var23.f18185c.f18269J0;
            int i18 = e0Var23.f18183a;
            AbstractC3557B.b0("view", view23);
            R.a.i(i18, view23);
        }
        arrayList30.clear();
        if (Log.isLoggable(str3, 2)) {
            Log.v(str3, "Completed executing operations from " + e0Var2 + str2 + e0Var);
        }
    }

    public final void h() {
        if (!this.f18220e) {
            ViewGroup viewGroup = this.f18216a;
            WeakHashMap weakHashMap = D1.Z.f3247a;
            if (!D1.K.b(viewGroup)) {
                k();
                this.f18219d = false;
                return;
            }
            synchronized (this.f18217b) {
                try {
                    if (!this.f18217b.isEmpty()) {
                        ArrayList M22 = kf.t.M2(this.f18218c);
                        this.f18218c.clear();
                        Iterator it = M22.iterator();
                        while (it.hasNext()) {
                            e0 e0Var = (e0) it.next();
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + e0Var);
                            }
                            e0Var.a();
                            if (!e0Var.f18189g) {
                                this.f18218c.add(e0Var);
                            }
                        }
                        n();
                        ArrayList M23 = kf.t.M2(this.f18217b);
                        this.f18217b.clear();
                        this.f18218c.addAll(M23);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                        }
                        Iterator it2 = M23.iterator();
                        while (it2.hasNext()) {
                            ((e0) it2.next()).d();
                        }
                        g(M23, this.f18219d);
                        this.f18219d = false;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final e0 j(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        Object obj;
        Iterator it = this.f18217b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                e0 e0Var = (e0) obj;
                if (AbstractC3557B.K(e0Var.f18185c, abstractComponentCallbacksC1480v) && !e0Var.f18188f) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (e0) obj;
    }

    public final void k() {
        String str;
        String str2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f18216a;
        WeakHashMap weakHashMap = D1.Z.f3247a;
        boolean b10 = D1.K.b(viewGroup);
        synchronized (this.f18217b) {
            try {
                n();
                Iterator it = this.f18217b.iterator();
                while (it.hasNext()) {
                    ((e0) it.next()).d();
                }
                Iterator it2 = kf.t.M2(this.f18218c).iterator();
                while (it2.hasNext()) {
                    e0 e0Var = (e0) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (b10) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f18216a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + e0Var);
                    }
                    e0Var.a();
                }
                Iterator it3 = kf.t.M2(this.f18217b).iterator();
                while (it3.hasNext()) {
                    e0 e0Var2 = (e0) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (b10) {
                            str = "";
                        } else {
                            str = "Container " + this.f18216a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + e0Var2);
                    }
                    e0Var2.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m() {
        Object obj;
        synchronized (this.f18217b) {
            try {
                n();
                ArrayList arrayList = this.f18217b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        e0 e0Var = (e0) obj;
                        View view = e0Var.f18185c.f18269J0;
                        AbstractC3557B.b0("operation.fragment.mView", view);
                        int h10 = Gi.e.h(view);
                        if (e0Var.f18183a == 2 && h10 != 2) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                e0 e0Var2 = (e0) obj;
                this.f18220e = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n() {
        Iterator it = this.f18217b.iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            int i10 = 2;
            if (e0Var.f18184b == 2) {
                int visibility = e0Var.f18185c.L().getVisibility();
                if (visibility != 0) {
                    i10 = 4;
                    if (visibility != 4) {
                        if (visibility == 8) {
                            i10 = 3;
                        } else {
                            throw new IllegalArgumentException(android.gov.nist.core.a.e("Unknown visibility ", visibility));
                        }
                    }
                }
                e0Var.c(i10, 1);
            }
        }
    }
}
