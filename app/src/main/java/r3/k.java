package r3;

import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class k extends AbstractC3557B {

    /* renamed from: h  reason: collision with root package name */
    public final WeakReference f44407h;

    /* renamed from: i  reason: collision with root package name */
    public final Choreographer f44408i;

    /* renamed from: j  reason: collision with root package name */
    public final q f44409j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f44410k;

    /* renamed from: l  reason: collision with root package name */
    public final C5362e f44411l;

    /* renamed from: m  reason: collision with root package name */
    public final j f44412m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, View view) {
        super(iVar);
        AbstractC3557B.c0("jankStats", iVar);
        this.f44407h = new WeakReference(view);
        Choreographer choreographer = Choreographer.getInstance();
        AbstractC3557B.b0("getInstance()", choreographer);
        this.f44408i = choreographer;
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = (View) parent;
            parent = view.getParent();
        }
        Object tag = view.getTag(R.id.metricsStateHolder);
        if (tag == null) {
            tag = new Object();
            view.setTag(R.id.metricsStateHolder, tag);
        }
        this.f44409j = (q) tag;
        ArrayList arrayList = new ArrayList();
        this.f44410k = arrayList;
        this.f44411l = new C5362e(arrayList);
        this.f44412m = new j(iVar, this);
    }

    public static void Q2(View view, j jVar) {
        AbstractViewTreeObserver$OnPreDrawListenerC5361d abstractViewTreeObserver$OnPreDrawListenerC5361d = (AbstractViewTreeObserver$OnPreDrawListenerC5361d) view.getTag(R.id.metricsDelegator);
        if (abstractViewTreeObserver$OnPreDrawListenerC5361d != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            AbstractC3557B.b0("viewTreeObserver", viewTreeObserver);
            AbstractC3557B.c0("delegate", jVar);
            synchronized (abstractViewTreeObserver$OnPreDrawListenerC5361d) {
                try {
                    if (abstractViewTreeObserver$OnPreDrawListenerC5361d.f44389h0) {
                        abstractViewTreeObserver$OnPreDrawListenerC5361d.f44391j0.add(jVar);
                    } else {
                        boolean z10 = !abstractViewTreeObserver$OnPreDrawListenerC5361d.f44388Z.isEmpty();
                        abstractViewTreeObserver$OnPreDrawListenerC5361d.f44388Z.remove(jVar);
                        if (z10 && abstractViewTreeObserver$OnPreDrawListenerC5361d.f44388Z.isEmpty()) {
                            viewTreeObserver.removeOnPreDrawListener(abstractViewTreeObserver$OnPreDrawListenerC5361d);
                            View view2 = (View) abstractViewTreeObserver$OnPreDrawListenerC5361d.f44392k0.get();
                            if (view2 != null) {
                                view2.setTag(R.id.metricsDelegator, null);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public abstract AbstractViewTreeObserver$OnPreDrawListenerC5361d P2(View view, Choreographer choreographer, ArrayList arrayList);

    public void R2(boolean z10) {
        View view = (View) this.f44407h.get();
        if (view != null) {
            if (z10) {
                AbstractViewTreeObserver$OnPreDrawListenerC5361d abstractViewTreeObserver$OnPreDrawListenerC5361d = (AbstractViewTreeObserver$OnPreDrawListenerC5361d) view.getTag(R.id.metricsDelegator);
                if (abstractViewTreeObserver$OnPreDrawListenerC5361d == null) {
                    abstractViewTreeObserver$OnPreDrawListenerC5361d = P2(view, this.f44408i, new ArrayList());
                    view.getViewTreeObserver().addOnPreDrawListener(abstractViewTreeObserver$OnPreDrawListenerC5361d);
                    view.setTag(R.id.metricsDelegator, abstractViewTreeObserver$OnPreDrawListenerC5361d);
                }
                j jVar = this.f44412m;
                AbstractC3557B.c0("delegate", jVar);
                synchronized (abstractViewTreeObserver$OnPreDrawListenerC5361d) {
                    try {
                        if (abstractViewTreeObserver$OnPreDrawListenerC5361d.f44389h0) {
                            abstractViewTreeObserver$OnPreDrawListenerC5361d.f44390i0.add(jVar);
                        } else {
                            abstractViewTreeObserver$OnPreDrawListenerC5361d.f44388Z.add(jVar);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            }
            Q2(view, this.f44412m);
        }
    }
}
