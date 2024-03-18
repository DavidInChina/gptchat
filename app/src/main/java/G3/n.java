package G3;

import V1.Z;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import m.RunnableC4517N;
import y1.C6497g;

/* loaded from: classes2.dex */
public class n extends Z {
    @Override // V1.Z
    public final void a(View view, Object obj) {
        ((s) obj).b(view);
    }

    @Override // V1.Z
    public final void b(Object obj, ArrayList arrayList) {
        s sVar;
        s sVar2 = (s) obj;
        if (sVar2 == null) {
            return;
        }
        int i10 = 0;
        if (sVar2 instanceof x) {
            x xVar = (x) sVar2;
            int size = xVar.f5973C0.size();
            while (i10 < size) {
                if (i10 >= 0 && i10 < xVar.f5973C0.size()) {
                    sVar = (s) xVar.f5973C0.get(i10);
                } else {
                    sVar = null;
                }
                b(sVar, arrayList);
                i10++;
            }
        } else if (Z.h(sVar2.f5951j0) && Z.h(null) && Z.h(null) && Z.h(sVar2.f5952k0)) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                sVar2.b((View) arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // V1.Z
    public final void c(ViewGroup viewGroup, Object obj) {
        v.a(viewGroup, (s) obj);
    }

    @Override // V1.Z
    public final boolean e(Object obj) {
        return obj instanceof s;
    }

    @Override // V1.Z
    public final Object f(Object obj) {
        if (obj != null) {
            return ((s) obj).clone();
        }
        return null;
    }

    @Override // V1.Z
    public final Object i(Object obj, Object obj2, Object obj3) {
        s sVar = (s) obj;
        s sVar2 = (s) obj2;
        s sVar3 = (s) obj3;
        if (sVar != null && sVar2 != null) {
            x xVar = new x();
            xVar.I(sVar);
            xVar.I(sVar2);
            xVar.f5974D0 = false;
            sVar = xVar;
        } else if (sVar == null) {
            if (sVar2 != null) {
                sVar = sVar2;
            } else {
                sVar = null;
            }
        }
        if (sVar3 != null) {
            x xVar2 = new x();
            if (sVar != null) {
                xVar2.I(sVar);
            }
            xVar2.I(sVar3);
            return xVar2;
        }
        return sVar;
    }

    @Override // V1.Z
    public final Object j(Object obj, Object obj2) {
        x xVar = new x();
        if (obj != null) {
            xVar.I((s) obj);
        }
        xVar.I((s) obj2);
        return xVar;
    }

    @Override // V1.Z
    public final void k(Object obj, View view, ArrayList arrayList) {
        ((s) obj).a(new C0607k(view, arrayList));
    }

    @Override // V1.Z
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((s) obj).a(new l(this, obj2, arrayList, obj3, arrayList2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, r.f] */
    @Override // V1.Z
    public final void m(View view, Object obj) {
        if (view != null) {
            Z.g(view, new Rect());
            ((s) obj).B(new Object());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, r.f] */
    @Override // V1.Z
    public final void n(Object obj, Rect rect) {
        ((s) obj).B(new Object());
    }

    @Override // V1.Z
    public final void o(Object obj, C6497g c6497g, RunnableC4517N runnableC4517N) {
        s sVar = (s) obj;
        c6497g.a(new U3.c(this, sVar, 9));
        sVar.a(new m(runnableC4517N));
    }

    @Override // V1.Z
    public final void p(Object obj, View view, ArrayList arrayList) {
        x xVar = (x) obj;
        ArrayList arrayList2 = xVar.f5952k0;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Z.d((View) arrayList.get(i10), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(xVar, arrayList);
    }

    @Override // V1.Z
    public final void q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        x xVar = (x) obj;
        if (xVar != null) {
            ArrayList arrayList3 = xVar.f5952k0;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(xVar, arrayList, arrayList2);
        }
    }

    @Override // V1.Z
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        x xVar = new x();
        xVar.I((s) obj);
        return xVar;
    }

    public final void s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        s sVar;
        s sVar2 = (s) obj;
        int i11 = 0;
        if (sVar2 instanceof x) {
            x xVar = (x) sVar2;
            int size = xVar.f5973C0.size();
            while (i11 < size) {
                if (i11 >= 0 && i11 < xVar.f5973C0.size()) {
                    sVar = (s) xVar.f5973C0.get(i11);
                } else {
                    sVar = null;
                }
                s(sVar, arrayList, arrayList2);
                i11++;
            }
        } else if (Z.h(sVar2.f5951j0) && Z.h(null) && Z.h(null)) {
            ArrayList arrayList3 = sVar2.f5952k0;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i10 = 0;
                } else {
                    i10 = arrayList2.size();
                }
                while (i11 < i10) {
                    sVar2.b((View) arrayList2.get(i11));
                    i11++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    sVar2.x((View) arrayList.get(size2));
                }
            }
        }
    }
}
