package w3;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.ArrayList;
import s3.C5547J;

/* renamed from: w3.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6103j extends AbstractC6092H {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f47898s;

    /* renamed from: g  reason: collision with root package name */
    public boolean f47899g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f47900h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f47901i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f47902j;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f47903k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f47904l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f47905m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f47906n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f47907o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f47908p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f47909q;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList f47910r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Y) arrayList.get(size)).f47800a.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [w3.h, java.lang.Object] */
    @Override // w3.AbstractC6092H
    public final boolean a(Y y10, Y y11, C5547J c5547j, C5547J c5547j2) {
        int i10;
        int i11;
        int i12 = c5547j.f45241a;
        int i13 = c5547j.f45242b;
        if (y11.q()) {
            int i14 = c5547j.f45241a;
            i10 = c5547j.f45242b;
            i11 = i14;
        } else {
            i11 = c5547j2.f45241a;
            i10 = c5547j2.f45242b;
        }
        if (y10 == y11) {
            return g(y10, i12, i13, i11, i10);
        }
        View view = y10.f47800a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(y10);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(y11);
        View view2 = y11.f47800a;
        view2.setTranslationX(-((int) ((i11 - i12) - translationX)));
        view2.setTranslationY(-((int) ((i10 - i13) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f47903k;
        ?? obj = new Object();
        obj.f47883a = y10;
        obj.f47884b = y11;
        obj.f47885c = i12;
        obj.f47886d = i13;
        obj.f47887e = i11;
        obj.f47888f = i10;
        arrayList.add(obj);
        return true;
    }

    @Override // w3.AbstractC6092H
    public final void d(Y y10) {
        View view = y10.f47800a;
        view.animate().cancel();
        ArrayList arrayList = this.f47902j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C6102i) arrayList.get(size)).f47889a == y10) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(y10);
                arrayList.remove(size);
            }
        }
        j(y10, this.f47903k);
        if (this.f47900h.remove(y10)) {
            view.setAlpha(1.0f);
            c(y10);
        }
        if (this.f47901i.remove(y10)) {
            view.setAlpha(1.0f);
            c(y10);
        }
        ArrayList arrayList2 = this.f47906n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(y10, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f47905m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C6102i) arrayList5.get(size4)).f47889a == y10) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(y10);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f47904l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(y10)) {
                view.setAlpha(1.0f);
                c(y10);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f47909q.remove(y10);
        this.f47907o.remove(y10);
        this.f47910r.remove(y10);
        this.f47908p.remove(y10);
        i();
    }

    @Override // w3.AbstractC6092H
    public final void e() {
        ArrayList arrayList = this.f47902j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C6102i c6102i = (C6102i) arrayList.get(size);
            View view = c6102i.f47889a.f47800a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c6102i.f47889a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f47900h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((Y) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f47901i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            Y y10 = (Y) arrayList3.get(size3);
            y10.f47800a.setAlpha(1.0f);
            c(y10);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f47903k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C6101h c6101h = (C6101h) arrayList4.get(size4);
            Y y11 = c6101h.f47883a;
            if (y11 != null) {
                k(c6101h, y11);
            }
            Y y12 = c6101h.f47884b;
            if (y12 != null) {
                k(c6101h, y12);
            }
        }
        arrayList4.clear();
        if (!f()) {
            return;
        }
        ArrayList arrayList5 = this.f47905m;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                C6102i c6102i2 = (C6102i) arrayList6.get(size6);
                View view2 = c6102i2.f47889a.f47800a;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                c(c6102i2.f47889a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f47904l;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                Y y13 = (Y) arrayList8.get(size8);
                y13.f47800a.setAlpha(1.0f);
                c(y13);
                arrayList8.remove(size8);
                if (arrayList8.isEmpty()) {
                    arrayList7.remove(arrayList8);
                }
            }
        }
        ArrayList arrayList9 = this.f47906n;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                C6101h c6101h2 = (C6101h) arrayList10.get(size10);
                Y y14 = c6101h2.f47883a;
                if (y14 != null) {
                    k(c6101h2, y14);
                }
                Y y15 = c6101h2.f47884b;
                if (y15 != null) {
                    k(c6101h2, y15);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        h(this.f47909q);
        h(this.f47908p);
        h(this.f47907o);
        h(this.f47910r);
        ArrayList arrayList11 = this.f47743b;
        if (arrayList11.size() <= 0) {
            arrayList11.clear();
        } else {
            AbstractC2469q0.p(arrayList11.get(0));
            throw null;
        }
    }

    @Override // w3.AbstractC6092H
    public final boolean f() {
        if (this.f47901i.isEmpty() && this.f47903k.isEmpty() && this.f47902j.isEmpty() && this.f47900h.isEmpty() && this.f47908p.isEmpty() && this.f47909q.isEmpty() && this.f47907o.isEmpty() && this.f47910r.isEmpty() && this.f47905m.isEmpty() && this.f47904l.isEmpty() && this.f47906n.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [w3.i, java.lang.Object] */
    public final boolean g(Y y10, int i10, int i11, int i12, int i13) {
        View view = y10.f47800a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) y10.f47800a.getTranslationY());
        l(y10);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            c(y10);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        ArrayList arrayList = this.f47902j;
        ?? obj = new Object();
        obj.f47889a = y10;
        obj.f47890b = translationX;
        obj.f47891c = translationY;
        obj.f47892d = i12;
        obj.f47893e = i13;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.f47743b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                AbstractC2469q0.p(arrayList.get(0));
                throw null;
            }
        }
    }

    public final void j(Y y10, ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C6101h c6101h = (C6101h) arrayList.get(size);
            if (k(c6101h, y10) && c6101h.f47883a == null && c6101h.f47884b == null) {
                arrayList.remove(c6101h);
            }
        }
    }

    public final boolean k(C6101h c6101h, Y y10) {
        if (c6101h.f47884b == y10) {
            c6101h.f47884b = null;
        } else if (c6101h.f47883a == y10) {
            c6101h.f47883a = null;
        } else {
            return false;
        }
        y10.f47800a.setAlpha(1.0f);
        View view = y10.f47800a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(y10);
        return true;
    }

    public final void l(Y y10) {
        if (f47898s == null) {
            f47898s = new ValueAnimator().getInterpolator();
        }
        y10.f47800a.animate().setInterpolator(f47898s);
        d(y10);
    }
}
