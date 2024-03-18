package p;

import D1.K;
import D1.Z;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import q.M;
import q.N;
import q.T;
import q.T0;
import q.W;

/* renamed from: p.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnGlobalLayoutListenerC5029e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f41552Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f41553Z;

    public /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC5029e(int i10, Object obj) {
        this.f41552Y = i10;
        this.f41553Z = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i10 = this.f41552Y;
        Object obj = this.f41553Z;
        switch (i10) {
            case 0:
                View$OnKeyListenerC5033i view$OnKeyListenerC5033i = (View$OnKeyListenerC5033i) obj;
                if (view$OnKeyListenerC5033i.a()) {
                    ArrayList arrayList = view$OnKeyListenerC5033i.f41577n0;
                    if (arrayList.size() > 0 && !((C5032h) arrayList.get(0)).f41561a.f43319D0) {
                        View view = view$OnKeyListenerC5033i.f41584u0;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C5032h) it.next()).f41561a.f();
                            }
                            return;
                        }
                        view$OnKeyListenerC5033i.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                H h10 = (H) obj;
                if (h10.a()) {
                    T0 t02 = h10.f41517n0;
                    if (!t02.f43319D0) {
                        View view2 = h10.f41522s0;
                        if (view2 != null && view2.isShown()) {
                            t02.f();
                            return;
                        } else {
                            h10.dismiss();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                W w10 = (W) obj;
                if (!w10.getInternalPopup().a()) {
                    w10.f43369m0.m(N.b(w10), N.a(w10));
                }
                ViewTreeObserver viewTreeObserver = w10.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    M.a(viewTreeObserver, this);
                    return;
                }
                return;
            default:
                T t10 = (T) obj;
                W w11 = t10.f43358M0;
                WeakHashMap weakHashMap = Z.f3247a;
                if (K.b(w11) && w11.getGlobalVisibleRect(t10.f43356K0)) {
                    t10.r();
                    t10.f();
                    return;
                }
                t10.dismiss();
                return;
        }
    }
}
