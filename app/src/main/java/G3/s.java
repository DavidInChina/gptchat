package G3;

import D1.N;
import D1.Z;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.gov.nist.core.Separators;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import q.C5200d;
import w.C6049A;
import w.C6059f;
import w.C6066m;

/* loaded from: classes2.dex */
public abstract class s implements Cloneable {

    /* renamed from: p0  reason: collision with root package name */
    public ArrayList f5957p0;

    /* renamed from: q0  reason: collision with root package name */
    public ArrayList f5958q0;

    /* renamed from: x0  reason: collision with root package name */
    public r.f f5965x0;

    /* renamed from: z0  reason: collision with root package name */
    public static final int[] f5946z0 = {2, 1, 3, 4};

    /* renamed from: A0  reason: collision with root package name */
    public static final P5.c f5944A0 = new Object();

    /* renamed from: B0  reason: collision with root package name */
    public static final ThreadLocal f5945B0 = new ThreadLocal();

    /* renamed from: Y  reason: collision with root package name */
    public final String f5947Y = getClass().getName();

    /* renamed from: Z  reason: collision with root package name */
    public long f5948Z = -1;

    /* renamed from: h0  reason: collision with root package name */
    public long f5949h0 = -1;

    /* renamed from: i0  reason: collision with root package name */
    public TimeInterpolator f5950i0 = null;

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f5951j0 = new ArrayList();

    /* renamed from: k0  reason: collision with root package name */
    public final ArrayList f5952k0 = new ArrayList();

    /* renamed from: l0  reason: collision with root package name */
    public U3.n f5953l0 = new U3.n(7);

    /* renamed from: m0  reason: collision with root package name */
    public U3.n f5954m0 = new U3.n(7);

    /* renamed from: n0  reason: collision with root package name */
    public x f5955n0 = null;

    /* renamed from: o0  reason: collision with root package name */
    public final int[] f5956o0 = f5946z0;

    /* renamed from: r0  reason: collision with root package name */
    public final ArrayList f5959r0 = new ArrayList();

    /* renamed from: s0  reason: collision with root package name */
    public int f5960s0 = 0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f5961t0 = false;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f5962u0 = false;

    /* renamed from: v0  reason: collision with root package name */
    public ArrayList f5963v0 = null;

    /* renamed from: w0  reason: collision with root package name */
    public ArrayList f5964w0 = new ArrayList();

    /* renamed from: y0  reason: collision with root package name */
    public P5.c f5966y0 = f5944A0;

    public static void c(U3.n nVar, View view, z zVar) {
        ((C6059f) nVar.f17426Y).put(view, zVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (((SparseArray) nVar.f17427Z).indexOfKey(id2) >= 0) {
                ((SparseArray) nVar.f17427Z).put(id2, null);
            } else {
                ((SparseArray) nVar.f17427Z).put(id2, view);
            }
        }
        WeakHashMap weakHashMap = Z.f3247a;
        String k10 = N.k(view);
        if (k10 != null) {
            if (((C6059f) nVar.f17429i0).containsKey(k10)) {
                ((C6059f) nVar.f17429i0).put(k10, null);
            } else {
                ((C6059f) nVar.f17429i0).put(k10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (((C6066m) nVar.f17428h0).f(itemIdAtPosition) >= 0) {
                    View view2 = (View) ((C6066m) nVar.f17428h0).d(itemIdAtPosition);
                    if (view2 != null) {
                        D1.H.r(view2, false);
                        ((C6066m) nVar.f17428h0).h(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                D1.H.r(view, true);
                ((C6066m) nVar.f17428h0).h(itemIdAtPosition, view);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, w.A, w.f] */
    public static C6059f p() {
        ThreadLocal threadLocal = f5945B0;
        C6059f c6059f = (C6059f) threadLocal.get();
        if (c6059f == null) {
            ?? c6049a = new C6049A();
            threadLocal.set(c6049a);
            return c6049a;
        }
        return c6059f;
    }

    public static boolean u(z zVar, z zVar2, String str) {
        Object obj = zVar.f5981a.get(str);
        Object obj2 = zVar2.f5981a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j6) {
        this.f5949h0 = j6;
    }

    public void B(r.f fVar) {
        this.f5965x0 = fVar;
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.f5950i0 = timeInterpolator;
    }

    public void D(P5.c cVar) {
        if (cVar == null) {
            this.f5966y0 = f5944A0;
        } else {
            this.f5966y0 = cVar;
        }
    }

    public void F(long j6) {
        this.f5948Z = j6;
    }

    public final void G() {
        if (this.f5960s0 == 0) {
            ArrayList arrayList = this.f5963v0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5963v0.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((r) arrayList2.get(i10)).c(this);
                }
            }
            this.f5962u0 = false;
        }
        this.f5960s0++;
    }

    public String H(String str) {
        StringBuilder p10 = android.gov.nist.core.a.p(str);
        p10.append(getClass().getSimpleName());
        p10.append(Separators.AT);
        p10.append(Integer.toHexString(hashCode()));
        p10.append(": ");
        String sb2 = p10.toString();
        if (this.f5949h0 != -1) {
            sb2 = android.gov.nist.core.a.m(android.gov.nist.core.a.r(sb2, "dur("), this.f5949h0, ") ");
        }
        if (this.f5948Z != -1) {
            sb2 = android.gov.nist.core.a.m(android.gov.nist.core.a.r(sb2, "dly("), this.f5948Z, ") ");
        }
        if (this.f5950i0 != null) {
            StringBuilder r10 = android.gov.nist.core.a.r(sb2, "interp(");
            r10.append(this.f5950i0);
            r10.append(") ");
            sb2 = r10.toString();
        }
        ArrayList arrayList = this.f5951j0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f5952k0;
        if (size > 0 || arrayList2.size() > 0) {
            String g10 = android.gov.nist.core.a.g(sb2, "tgts(");
            if (arrayList.size() > 0) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (i10 > 0) {
                        g10 = android.gov.nist.core.a.g(g10, ", ");
                    }
                    StringBuilder p11 = android.gov.nist.core.a.p(g10);
                    p11.append(arrayList.get(i10));
                    g10 = p11.toString();
                }
            }
            if (arrayList2.size() > 0) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (i11 > 0) {
                        g10 = android.gov.nist.core.a.g(g10, ", ");
                    }
                    StringBuilder p12 = android.gov.nist.core.a.p(g10);
                    p12.append(arrayList2.get(i11));
                    g10 = p12.toString();
                }
            }
            return android.gov.nist.core.a.g(g10, Separators.RPAREN);
        }
        return sb2;
    }

    public void a(r rVar) {
        if (this.f5963v0 == null) {
            this.f5963v0 = new ArrayList();
        }
        this.f5963v0.add(rVar);
    }

    public void b(View view) {
        this.f5952k0.add(view);
    }

    public void d() {
        ArrayList arrayList = this.f5959r0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = this.f5963v0;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.f5963v0.clone();
            int size2 = arrayList3.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((r) arrayList3.get(i10)).b();
            }
        }
    }

    public abstract void e(z zVar);

    public final void f(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            z zVar = new z(view);
            if (z10) {
                h(zVar);
            } else {
                e(zVar);
            }
            zVar.f5983c.add(this);
            g(zVar);
            if (z10) {
                c(this.f5953l0, view, zVar);
            } else {
                c(this.f5954m0, view, zVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), z10);
            }
        }
    }

    public abstract void h(z zVar);

    public final void i(ViewGroup viewGroup, boolean z10) {
        j(z10);
        ArrayList arrayList = this.f5951j0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f5952k0;
        if (size <= 0 && arrayList2.size() <= 0) {
            f(viewGroup, z10);
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i10)).intValue());
            if (findViewById != null) {
                z zVar = new z(findViewById);
                if (z10) {
                    h(zVar);
                } else {
                    e(zVar);
                }
                zVar.f5983c.add(this);
                g(zVar);
                if (z10) {
                    c(this.f5953l0, findViewById, zVar);
                } else {
                    c(this.f5954m0, findViewById, zVar);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            View view = (View) arrayList2.get(i11);
            z zVar2 = new z(view);
            if (z10) {
                h(zVar2);
            } else {
                e(zVar2);
            }
            zVar2.f5983c.add(this);
            g(zVar2);
            if (z10) {
                c(this.f5953l0, view, zVar2);
            } else {
                c(this.f5954m0, view, zVar2);
            }
        }
    }

    public final void j(boolean z10) {
        if (z10) {
            ((C6059f) this.f5953l0.f17426Y).clear();
            ((SparseArray) this.f5953l0.f17427Z).clear();
            ((C6066m) this.f5953l0.f17428h0).b();
            return;
        }
        ((C6059f) this.f5954m0.f17426Y).clear();
        ((SparseArray) this.f5954m0.f17427Z).clear();
        ((C6066m) this.f5954m0.f17428h0).b();
    }

    /* renamed from: k */
    public s clone() {
        try {
            s sVar = (s) super.clone();
            sVar.f5964w0 = new ArrayList();
            sVar.f5953l0 = new U3.n(7);
            sVar.f5954m0 = new U3.n(7);
            sVar.f5957p0 = null;
            sVar.f5958q0 = null;
            return sVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator l(ViewGroup viewGroup, z zVar, z zVar2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, G3.q] */
    public void m(ViewGroup viewGroup, U3.n nVar, U3.n nVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        Animator l10;
        z zVar;
        View view;
        z zVar2;
        Animator animator;
        C6059f p10 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            z zVar3 = (z) arrayList.get(i11);
            z zVar4 = (z) arrayList2.get(i11);
            if (zVar3 != null && !zVar3.f5983c.contains(this)) {
                zVar3 = null;
            }
            if (zVar4 != null && !zVar4.f5983c.contains(this)) {
                zVar4 = null;
            }
            if ((zVar3 == null && zVar4 == null) || ((zVar3 != null && zVar4 != null && !s(zVar3, zVar4)) || (l10 = l(viewGroup, zVar3, zVar4)) == null)) {
                i10 = size;
            } else {
                String str = this.f5947Y;
                if (zVar4 != null) {
                    String[] q10 = q();
                    view = zVar4.f5982b;
                    if (q10 != null && q10.length > 0) {
                        zVar2 = new z(view);
                        z zVar5 = (z) ((C6059f) nVar2.f17426Y).get(view);
                        i10 = size;
                        if (zVar5 != null) {
                            int i12 = 0;
                            while (i12 < q10.length) {
                                HashMap hashMap = zVar2.f5981a;
                                String str2 = q10[i12];
                                hashMap.put(str2, zVar5.f5981a.get(str2));
                                i12++;
                                q10 = q10;
                            }
                        }
                        int i13 = p10.f47560h0;
                        int i14 = 0;
                        while (true) {
                            if (i14 < i13) {
                                q qVar = (q) p10.get((Animator) p10.g(i14));
                                if (qVar.f5941c != null && qVar.f5939a == view && qVar.f5940b.equals(str) && qVar.f5941c.equals(zVar2)) {
                                    animator = null;
                                    break;
                                }
                                i14++;
                            } else {
                                animator = l10;
                                break;
                            }
                        }
                    } else {
                        i10 = size;
                        animator = l10;
                        zVar2 = null;
                    }
                    l10 = animator;
                    zVar = zVar2;
                } else {
                    i10 = size;
                    view = zVar3.f5982b;
                    zVar = null;
                }
                if (l10 != null) {
                    E e10 = A.f5879a;
                    J j6 = new J(viewGroup);
                    ?? obj = new Object();
                    obj.f5939a = view;
                    obj.f5940b = str;
                    obj.f5941c = zVar;
                    obj.f5942d = j6;
                    obj.f5943e = this;
                    p10.put(l10, obj);
                    this.f5964w0.add(l10);
                }
            }
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                Animator animator2 = (Animator) this.f5964w0.get(sparseIntArray.keyAt(i15));
                animator2.setStartDelay(animator2.getStartDelay() + (sparseIntArray.valueAt(i15) - Long.MAX_VALUE));
            }
        }
    }

    public final void n() {
        int i10 = this.f5960s0 - 1;
        this.f5960s0 = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f5963v0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5963v0.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((r) arrayList2.get(i11)).d(this);
                }
            }
            for (int i12 = 0; i12 < ((C6066m) this.f5953l0.f17428h0).i(); i12++) {
                View view = (View) ((C6066m) this.f5953l0.f17428h0).j(i12);
                if (view != null) {
                    WeakHashMap weakHashMap = Z.f3247a;
                    D1.H.r(view, false);
                }
            }
            for (int i13 = 0; i13 < ((C6066m) this.f5954m0.f17428h0).i(); i13++) {
                View view2 = (View) ((C6066m) this.f5954m0.f17428h0).j(i13);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = Z.f3247a;
                    D1.H.r(view2, false);
                }
            }
            this.f5962u0 = true;
        }
    }

    public final z o(View view, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        x xVar = this.f5955n0;
        if (xVar != null) {
            return xVar.o(view, z10);
        }
        if (z10) {
            arrayList = this.f5957p0;
        } else {
            arrayList = this.f5958q0;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                z zVar = (z) arrayList.get(i10);
                if (zVar == null) {
                    return null;
                }
                if (zVar.f5982b == view) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0) {
            return null;
        }
        if (z10) {
            arrayList2 = this.f5958q0;
        } else {
            arrayList2 = this.f5957p0;
        }
        return (z) arrayList2.get(i10);
    }

    public String[] q() {
        return null;
    }

    public final z r(View view, boolean z10) {
        U3.n nVar;
        x xVar = this.f5955n0;
        if (xVar != null) {
            return xVar.r(view, z10);
        }
        if (z10) {
            nVar = this.f5953l0;
        } else {
            nVar = this.f5954m0;
        }
        return (z) ((C6059f) nVar.f17426Y).get(view);
    }

    public boolean s(z zVar, z zVar2) {
        if (zVar == null || zVar2 == null) {
            return false;
        }
        String[] q10 = q();
        if (q10 != null) {
            for (String str : q10) {
                if (!u(zVar, zVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : zVar.f5981a.keySet()) {
            if (u(zVar, zVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public final boolean t(View view) {
        int id2 = view.getId();
        ArrayList arrayList = this.f5951j0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f5952k0;
        if ((size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id2)) || arrayList2.contains(view)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return H("");
    }

    public void v(View view) {
        if (!this.f5962u0) {
            ArrayList arrayList = this.f5959r0;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Animator) arrayList.get(size)).pause();
            }
            ArrayList arrayList2 = this.f5963v0;
            if (arrayList2 != null && arrayList2.size() > 0) {
                ArrayList arrayList3 = (ArrayList) this.f5963v0.clone();
                int size2 = arrayList3.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((r) arrayList3.get(i10)).a();
                }
            }
            this.f5961t0 = true;
        }
    }

    public void w(r rVar) {
        ArrayList arrayList = this.f5963v0;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(rVar);
        if (this.f5963v0.size() == 0) {
            this.f5963v0 = null;
        }
    }

    public void x(View view) {
        this.f5952k0.remove(view);
    }

    public void y(ViewGroup viewGroup) {
        if (this.f5961t0) {
            if (!this.f5962u0) {
                ArrayList arrayList = this.f5959r0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((Animator) arrayList.get(size)).resume();
                }
                ArrayList arrayList2 = this.f5963v0;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.f5963v0.clone();
                    int size2 = arrayList3.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((r) arrayList3.get(i10)).e();
                    }
                }
            }
            this.f5961t0 = false;
        }
    }

    public void z() {
        G();
        C6059f p10 = p();
        Iterator it = this.f5964w0.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p10.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new p(this, p10));
                    long j6 = this.f5949h0;
                    if (j6 >= 0) {
                        animator.setDuration(j6);
                    }
                    long j10 = this.f5948Z;
                    if (j10 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j10);
                    }
                    TimeInterpolator timeInterpolator = this.f5950i0;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C5200d(1, this));
                    animator.start();
                }
            }
        }
        this.f5964w0.clear();
        n();
    }

    public void E() {
    }

    public void g(z zVar) {
    }
}
