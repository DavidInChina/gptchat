package v7;

import D1.Z;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import g.RunnableC3118k;
import j7.RunnableC3921k;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import t7.C5682d;
import w7.AbstractC6134f;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f47315a;

    /* renamed from: b  reason: collision with root package name */
    public Object f47316b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f47317c;

    /* renamed from: d  reason: collision with root package name */
    public int f47318d;

    /* renamed from: e  reason: collision with root package name */
    public Object f47319e;

    public /* synthetic */ l() {
        this.f47315a = 0;
        this.f47317c = true;
        this.f47318d = 0;
    }

    public final l a() {
        boolean z10;
        if (((AbstractC5992j) this.f47319e) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new l(this, (C5682d[]) this.f47316b, this.f47317c, this.f47318d);
        }
        throw new IllegalArgumentException("execute parameter required");
    }

    public final void b(int i10) {
        switch (this.f47315a) {
            case 2:
                WeakReference weakReference = ((BottomSheetBehavior) this.f47316b).f27035U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f47318d = i10;
                    if (!this.f47317c) {
                        WeakHashMap weakHashMap = Z.f3247a;
                        D1.H.m((View) ((BottomSheetBehavior) this.f47316b).f27035U.get(), (Runnable) this.f47319e);
                        this.f47317c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                WeakReference weakReference2 = ((SideSheetBehavior) this.f47316b).f27243p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f47318d = i10;
                    if (!this.f47317c) {
                        WeakHashMap weakHashMap2 = Z.f3247a;
                        D1.H.m((View) ((SideSheetBehavior) this.f47316b).f27243p.get(), (Runnable) this.f47319e);
                        this.f47317c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void c(AbstractC6134f abstractC6134f, N7.f fVar) {
        ((AbstractC5992j) ((l) this.f47319e).f47319e).b(abstractC6134f, fVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this(bottomSheetBehavior);
        this.f47315a = 2;
    }

    public l(l lVar, C5682d[] c5682dArr, boolean z10, int i10) {
        boolean z11 = true;
        this.f47315a = 1;
        this.f47319e = lVar;
        this.f47316b = c5682dArr;
        this.f47317c = (c5682dArr == null || !z10) ? false : z11;
        this.f47318d = i10;
    }

    public l(SideSheetBehavior sideSheetBehavior) {
        this.f47315a = 3;
        this.f47316b = sideSheetBehavior;
        this.f47319e = new RunnableC3921k(3, this);
    }

    public l(BottomSheetBehavior bottomSheetBehavior) {
        this.f47315a = 2;
        this.f47316b = bottomSheetBehavior;
        this.f47319e = new RunnableC3118k(16, this);
    }
}
