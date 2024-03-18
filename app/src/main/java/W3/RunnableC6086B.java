package w3;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: w3.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC6086B implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f47738Y;

    public /* synthetic */ RunnableC6086B(RecyclerView recyclerView) {
        this.f47738Y = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        long j6;
        long j10;
        RecyclerView recyclerView = this.f47738Y;
        AbstractC6092H abstractC6092H = recyclerView.f25436O0;
        if (abstractC6092H != null) {
            C6103j c6103j = (C6103j) abstractC6092H;
            ArrayList arrayList2 = c6103j.f47900h;
            boolean z10 = !arrayList2.isEmpty();
            ArrayList arrayList3 = c6103j.f47902j;
            boolean z11 = !arrayList3.isEmpty();
            ArrayList arrayList4 = c6103j.f47903k;
            boolean z12 = !arrayList4.isEmpty();
            ArrayList arrayList5 = c6103j.f47901i;
            boolean z13 = !arrayList5.isEmpty();
            if (z10 || z11 || z13 || z12) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    arrayList = arrayList3;
                    j6 = c6103j.f47745d;
                    if (!hasNext) {
                        break;
                    }
                    Y y10 = (Y) it.next();
                    View view = y10.f47800a;
                    ViewPropertyAnimator animate = view.animate();
                    c6103j.f47909q.add(y10);
                    animate.setDuration(j6).alpha(0.0f).setListener(new C6098e(c6103j, y10, animate, view)).start();
                    arrayList3 = arrayList;
                }
                arrayList2.clear();
                if (z11) {
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.addAll(arrayList);
                    c6103j.f47905m.add(arrayList6);
                    arrayList.clear();
                    RunnableC6097d runnableC6097d = new RunnableC6097d(c6103j, arrayList6, 0);
                    if (z10) {
                        View view2 = ((C6102i) arrayList6.get(0)).f47889a.f47800a;
                        WeakHashMap weakHashMap = D1.Z.f3247a;
                        D1.H.n(view2, runnableC6097d, j6);
                    } else {
                        runnableC6097d.run();
                    }
                }
                if (z12) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.addAll(arrayList4);
                    c6103j.f47906n.add(arrayList7);
                    arrayList4.clear();
                    RunnableC6097d runnableC6097d2 = new RunnableC6097d(c6103j, arrayList7, 1);
                    if (z10) {
                        View view3 = ((C6101h) arrayList7.get(0)).f47883a.f47800a;
                        WeakHashMap weakHashMap2 = D1.Z.f3247a;
                        D1.H.n(view3, runnableC6097d2, j6);
                    } else {
                        runnableC6097d2.run();
                    }
                }
                if (z13) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.addAll(arrayList5);
                    c6103j.f47904l.add(arrayList8);
                    arrayList5.clear();
                    RunnableC6097d runnableC6097d3 = new RunnableC6097d(c6103j, arrayList8, 2);
                    if (!z10 && !z11 && !z12) {
                        runnableC6097d3.run();
                    } else {
                        long j11 = 0;
                        if (!z10) {
                            j6 = 0;
                        }
                        if (z11) {
                            j10 = c6103j.f47746e;
                        } else {
                            j10 = 0;
                        }
                        if (z12) {
                            j11 = c6103j.f47747f;
                        }
                        View view4 = ((Y) arrayList8.get(0)).f47800a;
                        WeakHashMap weakHashMap3 = D1.Z.f3247a;
                        D1.H.n(view4, runnableC6097d3, Math.max(j10, j11) + j6);
                    }
                }
            }
        }
        recyclerView.f25464m1 = false;
    }
}
