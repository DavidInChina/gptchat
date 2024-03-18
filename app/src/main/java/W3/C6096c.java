package w3;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: w3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6096c {

    /* renamed from: a  reason: collision with root package name */
    public final C6087C f47833a;

    /* renamed from: b  reason: collision with root package name */
    public final S2.c f47834b = new S2.c(1);

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f47835c = new ArrayList();

    public C6096c(C6087C c6087c) {
        this.f47833a = c6087c;
    }

    public final void a(View view, int i10, boolean z10) {
        int i11;
        C6087C c6087c = this.f47833a;
        if (i10 < 0) {
            i11 = c6087c.f47739a.getChildCount();
        } else {
            i11 = f(i10);
        }
        this.f47834b.e(i11, z10);
        if (z10) {
            i(view);
        }
        c6087c.f47739a.addView(view, i11);
        RecyclerView.I(view);
    }

    public final void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int i11;
        C6087C c6087c = this.f47833a;
        if (i10 < 0) {
            i11 = c6087c.f47739a.getChildCount();
        } else {
            i11 = f(i10);
        }
        this.f47834b.e(i11, z10);
        if (z10) {
            i(view);
        }
        c6087c.getClass();
        Y I10 = RecyclerView.I(view);
        RecyclerView recyclerView = c6087c.f47739a;
        if (I10 != null) {
            if (!I10.l() && !I10.q()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(I10);
                throw new IllegalArgumentException(AbstractC2469q0.h(recyclerView, sb2));
            }
            I10.f47809j &= -257;
        }
        recyclerView.attachViewToParent(view, i11, layoutParams);
    }

    public final void c(int i10) {
        Y I10;
        int f6 = f(i10);
        this.f47834b.f(f6);
        RecyclerView recyclerView = this.f47833a.f47739a;
        View childAt = recyclerView.getChildAt(f6);
        if (childAt != null && (I10 = RecyclerView.I(childAt)) != null) {
            if (I10.l() && !I10.q()) {
                StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                sb2.append(I10);
                throw new IllegalArgumentException(AbstractC2469q0.h(recyclerView, sb2));
            }
            I10.b(256);
        }
        recyclerView.detachViewFromParent(f6);
    }

    public final View d(int i10) {
        return this.f47833a.f47739a.getChildAt(f(i10));
    }

    public final int e() {
        return this.f47833a.f47739a.getChildCount() - this.f47835c.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r3.d(r2) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int childCount = this.f47833a.f47739a.getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            S2.c cVar = this.f47834b;
            int b10 = i10 - (i11 - cVar.b(i11));
            if (b10 == 0) {
                break;
            }
            i11 += b10;
        }
        return -1;
    }

    public final View g(int i10) {
        return this.f47833a.f47739a.getChildAt(i10);
    }

    public final int h() {
        return this.f47833a.f47739a.getChildCount();
    }

    public final void i(View view) {
        this.f47835c.add(view);
        C6087C c6087c = this.f47833a;
        c6087c.getClass();
        Y I10 = RecyclerView.I(view);
        if (I10 != null) {
            int i10 = I10.f47816q;
            View view2 = I10.f47800a;
            if (i10 != -1) {
                I10.f47815p = i10;
            } else {
                WeakHashMap weakHashMap = D1.Z.f3247a;
                I10.f47815p = D1.H.c(view2);
            }
            RecyclerView recyclerView = c6087c.f47739a;
            if (recyclerView.L()) {
                I10.f47816q = 4;
                recyclerView.f25478t1.add(I10);
                return;
            }
            WeakHashMap weakHashMap2 = D1.Z.f3247a;
            D1.H.s(view2, 4);
        }
    }

    public final boolean j(View view) {
        return this.f47835c.contains(view);
    }

    public final void k(View view) {
        if (this.f47835c.remove(view)) {
            C6087C c6087c = this.f47833a;
            c6087c.getClass();
            Y I10 = RecyclerView.I(view);
            if (I10 != null) {
                int i10 = I10.f47815p;
                RecyclerView recyclerView = c6087c.f47739a;
                if (recyclerView.L()) {
                    I10.f47816q = i10;
                    recyclerView.f25478t1.add(I10);
                } else {
                    WeakHashMap weakHashMap = D1.Z.f3247a;
                    D1.H.s(I10.f47800a, i10);
                }
                I10.f47815p = 0;
            }
        }
    }

    public final String toString() {
        return this.f47834b.toString() + ", hidden list:" + this.f47835c.size();
    }
}
