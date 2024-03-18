package w3;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: w3.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC6097d implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f47843Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ ArrayList f47844Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C6103j f47845h0;

    public /* synthetic */ RunnableC6097d(C6103j c6103j, ArrayList arrayList, int i10) {
        this.f47843Y = i10;
        this.f47845h0 = c6103j;
        this.f47844Z = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        View view2;
        long j6;
        char c10;
        int i10 = this.f47843Y;
        C6103j c6103j = this.f47845h0;
        ArrayList arrayList = this.f47844Z;
        switch (i10) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C6102i c6102i = (C6102i) it.next();
                    Y y10 = c6102i.f47889a;
                    c6103j.getClass();
                    View view3 = y10.f47800a;
                    int i11 = c6102i.f47892d - c6102i.f47890b;
                    int i12 = c6102i.f47893e - c6102i.f47891c;
                    if (i11 != 0) {
                        view3.animate().translationX(0.0f);
                    }
                    if (i12 != 0) {
                        view3.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view3.animate();
                    c6103j.f47908p.add(y10);
                    animate.setDuration(c6103j.f47746e).setListener(new C6099f(c6103j, y10, i11, view3, i12, animate)).start();
                }
                arrayList.clear();
                c6103j.f47905m.remove(arrayList);
                return;
            case 1:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C6101h c6101h = (C6101h) it2.next();
                    c6103j.getClass();
                    Y y11 = c6101h.f47883a;
                    if (y11 == null) {
                        view = null;
                    } else {
                        view = y11.f47800a;
                    }
                    Y y12 = c6101h.f47884b;
                    if (y12 != null) {
                        view2 = y12.f47800a;
                    } else {
                        view2 = null;
                    }
                    ArrayList arrayList2 = c6103j.f47910r;
                    long j10 = c6103j.f47747f;
                    if (view != null) {
                        ViewPropertyAnimator duration = view.animate().setDuration(j10);
                        arrayList2.add(c6101h.f47883a);
                        duration.translationX(c6101h.f47887e - c6101h.f47885c);
                        duration.translationY(c6101h.f47888f - c6101h.f47886d);
                        j6 = j10;
                        duration.alpha(0.0f).setListener(new C6100g(c6103j, c6101h, duration, view, 0)).start();
                    } else {
                        j6 = j10;
                    }
                    if (view2 != null) {
                        ViewPropertyAnimator animate2 = view2.animate();
                        arrayList2.add(c6101h.f47884b);
                        c10 = 0;
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(j6).alpha(1.0f).setListener(new C6100g(c6103j, c6101h, animate2, view2, 1)).start();
                    } else {
                        c10 = 0;
                    }
                }
                arrayList.clear();
                c6103j.f47906n.remove(arrayList);
                return;
            default:
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Y y13 = (Y) it3.next();
                    c6103j.getClass();
                    View view4 = y13.f47800a;
                    ViewPropertyAnimator animate3 = view4.animate();
                    c6103j.f47907o.add(y13);
                    animate3.alpha(1.0f).setDuration(c6103j.f47744c).setListener(new C6098e(c6103j, y13, view4, animate3)).start();
                }
                arrayList.clear();
                c6103j.f47904l.remove(arrayList);
                return;
        }
    }
}
