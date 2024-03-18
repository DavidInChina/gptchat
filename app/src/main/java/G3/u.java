package G3;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;
import w.C6059f;
import w.C6066m;

/* loaded from: classes2.dex */
public final class u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: Y  reason: collision with root package name */
    public s f5967Y;

    /* renamed from: Z  reason: collision with root package name */
    public ViewGroup f5968Z;

    /* JADX WARN: Removed duplicated region for block: B:106:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e3 A[EDGE_INSN: B:134:0x01e3->B:89:0x01e3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0209  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        s sVar;
        int i10;
        U3.n nVar;
        C6059f c6059f;
        C6059f c6059f2;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        q qVar;
        View view;
        U3.n nVar2;
        z zVar;
        View view2;
        View view3;
        U3.n nVar3;
        ViewGroup viewGroup = this.f5968Z;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = v.f5971c;
        ViewGroup viewGroup2 = this.f5968Z;
        int i15 = 1;
        if (!arrayList2.remove(viewGroup2)) {
            return true;
        }
        C6059f b10 = v.b();
        ArrayList arrayList3 = (ArrayList) b10.get(viewGroup2);
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            b10.put(viewGroup2, arrayList3);
        } else if (arrayList3.size() > 0) {
            arrayList = new ArrayList(arrayList3);
            sVar = this.f5967Y;
            arrayList3.add(sVar);
            sVar.a(new C0604h(this, 1, b10));
            i10 = 0;
            sVar.i(viewGroup2, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((s) it.next()).y(viewGroup2);
                }
            }
            sVar.f5957p0 = new ArrayList();
            sVar.f5958q0 = new ArrayList();
            U3.n nVar4 = sVar.f5953l0;
            nVar = sVar.f5954m0;
            c6059f = new C6059f((C6059f) nVar4.f17426Y);
            c6059f2 = new C6059f((C6059f) nVar.f17426Y);
            i11 = 0;
            while (true) {
                iArr = sVar.f5956o0;
                if (i11 < iArr.length) {
                    break;
                }
                int i16 = iArr[i11];
                if (i16 != i15) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            if (i16 == 4) {
                                C6066m c6066m = (C6066m) nVar4.f17428h0;
                                C6066m c6066m2 = (C6066m) nVar.f17428h0;
                                int i17 = c6066m.i();
                                int i18 = i10;
                                while (i18 < i17) {
                                    View view4 = (View) c6066m.j(i18);
                                    if (view4 != null && sVar.t(view4)) {
                                        nVar3 = nVar;
                                        View view5 = (View) c6066m2.d(c6066m.g(i18));
                                        if (view5 != null && sVar.t(view5)) {
                                            z zVar2 = (z) c6059f.get(view4);
                                            z zVar3 = (z) c6059f2.get(view5);
                                            if (zVar2 != null && zVar3 != null) {
                                                sVar.f5957p0.add(zVar2);
                                                sVar.f5958q0.add(zVar3);
                                                c6059f.remove(view4);
                                                c6059f2.remove(view5);
                                            }
                                        }
                                    } else {
                                        nVar3 = nVar;
                                    }
                                    i18++;
                                    nVar = nVar3;
                                }
                            }
                            nVar2 = nVar;
                        } else {
                            SparseArray sparseArray = (SparseArray) nVar4.f17427Z;
                            nVar2 = nVar;
                            SparseArray sparseArray2 = (SparseArray) nVar2.f17427Z;
                            int size = sparseArray.size();
                            for (int i19 = 0; i19 < size; i19++) {
                                View view6 = (View) sparseArray.valueAt(i19);
                                if (view6 != null && sVar.t(view6) && (view3 = (View) sparseArray2.get(sparseArray.keyAt(i19))) != null && sVar.t(view3)) {
                                    z zVar4 = (z) c6059f.get(view6);
                                    z zVar5 = (z) c6059f2.get(view3);
                                    if (zVar4 != null && zVar5 != null) {
                                        sVar.f5957p0.add(zVar4);
                                        sVar.f5958q0.add(zVar5);
                                        c6059f.remove(view6);
                                        c6059f2.remove(view3);
                                    }
                                }
                            }
                        }
                    } else {
                        nVar2 = nVar;
                        C6059f c6059f3 = (C6059f) nVar4.f17429i0;
                        C6059f c6059f4 = (C6059f) nVar2.f17429i0;
                        int i20 = c6059f3.f47560h0;
                        for (int i21 = 0; i21 < i20; i21++) {
                            View view7 = (View) c6059f3.j(i21);
                            if (view7 != null && sVar.t(view7) && (view2 = (View) c6059f4.get(c6059f3.g(i21))) != null && sVar.t(view2)) {
                                z zVar6 = (z) c6059f.get(view7);
                                z zVar7 = (z) c6059f2.get(view2);
                                if (zVar6 != null && zVar7 != null) {
                                    sVar.f5957p0.add(zVar6);
                                    sVar.f5958q0.add(zVar7);
                                    c6059f.remove(view7);
                                    c6059f2.remove(view2);
                                }
                            }
                        }
                    }
                } else {
                    nVar2 = nVar;
                    for (int i22 = c6059f.f47560h0 - 1; i22 >= 0; i22--) {
                        View view8 = (View) c6059f.g(i22);
                        if (view8 != null && sVar.t(view8) && (zVar = (z) c6059f2.remove(view8)) != null && sVar.t(zVar.f5982b)) {
                            sVar.f5957p0.add((z) c6059f.h(i22));
                            sVar.f5958q0.add(zVar);
                        }
                    }
                }
                i11++;
                nVar = nVar2;
                i10 = 0;
                i15 = 1;
            }
            for (i12 = 0; i12 < c6059f.f47560h0; i12++) {
                z zVar8 = (z) c6059f.j(i12);
                if (sVar.t(zVar8.f5982b)) {
                    sVar.f5957p0.add(zVar8);
                    sVar.f5958q0.add(null);
                }
            }
            for (i13 = 0; i13 < c6059f2.f47560h0; i13++) {
                z zVar9 = (z) c6059f2.j(i13);
                if (sVar.t(zVar9.f5982b)) {
                    sVar.f5958q0.add(zVar9);
                    sVar.f5957p0.add(null);
                }
            }
            C6059f p10 = s.p();
            int i23 = p10.f47560h0;
            E e10 = A.f5879a;
            WindowId windowId = viewGroup2.getWindowId();
            for (i14 = i23 - 1; i14 >= 0; i14--) {
                Animator animator = (Animator) p10.g(i14);
                if (animator != null && (qVar = (q) p10.get(animator)) != null && (view = qVar.f5939a) != null) {
                    K k10 = qVar.f5942d;
                    if ((k10 instanceof J) && ((J) k10).f5902a.equals(windowId)) {
                        z r10 = sVar.r(view, true);
                        z o10 = sVar.o(view, true);
                        if (r10 == null && o10 == null) {
                            o10 = (z) ((C6059f) sVar.f5954m0.f17426Y).get(view);
                        }
                        if ((r10 != null || o10 != null) && qVar.f5943e.s(qVar.f5941c, o10)) {
                            if (!animator.isRunning() && !animator.isStarted()) {
                                p10.remove(animator);
                            } else {
                                animator.cancel();
                            }
                        }
                    }
                }
            }
            sVar.m(viewGroup2, sVar.f5953l0, sVar.f5954m0, sVar.f5957p0, sVar.f5958q0);
            sVar.z();
            return true;
        }
        arrayList = null;
        sVar = this.f5967Y;
        arrayList3.add(sVar);
        sVar.a(new C0604h(this, 1, b10));
        i10 = 0;
        sVar.i(viewGroup2, false);
        if (arrayList != null) {
        }
        sVar.f5957p0 = new ArrayList();
        sVar.f5958q0 = new ArrayList();
        U3.n nVar42 = sVar.f5953l0;
        nVar = sVar.f5954m0;
        c6059f = new C6059f((C6059f) nVar42.f17426Y);
        c6059f2 = new C6059f((C6059f) nVar.f17426Y);
        i11 = 0;
        while (true) {
            iArr = sVar.f5956o0;
            if (i11 < iArr.length) {
            }
            i11++;
            nVar = nVar2;
            i10 = 0;
            i15 = 1;
        }
        while (i12 < c6059f.f47560h0) {
        }
        while (i13 < c6059f2.f47560h0) {
        }
        C6059f p102 = s.p();
        int i232 = p102.f47560h0;
        E e102 = A.f5879a;
        WindowId windowId2 = viewGroup2.getWindowId();
        while (i14 >= 0) {
        }
        sVar.m(viewGroup2, sVar.f5953l0, sVar.f5954m0, sVar.f5957p0, sVar.f5958q0);
        sVar.z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f5968Z;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = v.f5971c;
        ViewGroup viewGroup2 = this.f5968Z;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) v.b().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((s) it.next()).y(viewGroup2);
            }
        }
        this.f5967Y.j(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
