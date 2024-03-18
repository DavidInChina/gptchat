package w3;

import D1.C0343c;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Z extends C0343c {

    /* renamed from: i0  reason: collision with root package name */
    public final a0 f47818i0;

    /* renamed from: j0  reason: collision with root package name */
    public final WeakHashMap f47819j0 = new WeakHashMap();

    public Z(a0 a0Var) {
        this.f47818i0 = a0Var;
    }

    @Override // D1.C0343c
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0343c c0343c = (C0343c) this.f47819j0.get(view);
        if (c0343c != null) {
            return c0343c.a(view, accessibilityEvent);
        }
        return this.f3255Y.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // D1.C0343c
    public final J0.a c(View view) {
        C0343c c0343c = (C0343c) this.f47819j0.get(view);
        if (c0343c != null) {
            return c0343c.c(view);
        }
        return super.c(view);
    }

    @Override // D1.C0343c
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        C0343c c0343c = (C0343c) this.f47819j0.get(view);
        if (c0343c != null) {
            c0343c.d(view, accessibilityEvent);
        } else {
            super.d(view, accessibilityEvent);
        }
    }

    @Override // D1.C0343c
    public final void e(View view, E1.p pVar) {
        a0 a0Var = this.f47818i0;
        boolean K10 = a0Var.f47824i0.K();
        View.AccessibilityDelegate accessibilityDelegate = this.f3255Y;
        AccessibilityNodeInfo accessibilityNodeInfo = pVar.f4118a;
        if (!K10) {
            RecyclerView recyclerView = a0Var.f47824i0;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().S(view, pVar);
                C0343c c0343c = (C0343c) this.f47819j0.get(view);
                if (c0343c != null) {
                    c0343c.e(view, pVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // D1.C0343c
    public final void f(View view, AccessibilityEvent accessibilityEvent) {
        C0343c c0343c = (C0343c) this.f47819j0.get(view);
        if (c0343c != null) {
            c0343c.f(view, accessibilityEvent);
        } else {
            super.f(view, accessibilityEvent);
        }
    }

    @Override // D1.C0343c
    public final boolean g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0343c c0343c = (C0343c) this.f47819j0.get(viewGroup);
        if (c0343c != null) {
            return c0343c.g(viewGroup, view, accessibilityEvent);
        }
        return this.f3255Y.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // D1.C0343c
    public final boolean h(View view, int i10, Bundle bundle) {
        a0 a0Var = this.f47818i0;
        if (!a0Var.f47824i0.K()) {
            RecyclerView recyclerView = a0Var.f47824i0;
            if (recyclerView.getLayoutManager() != null) {
                C0343c c0343c = (C0343c) this.f47819j0.get(view);
                if (c0343c != null) {
                    if (c0343c.h(view, i10, bundle)) {
                        return true;
                    }
                } else if (super.h(view, i10, bundle)) {
                    return true;
                }
                i3.g gVar = recyclerView.getLayoutManager().f47753b.f25455i0;
                return false;
            }
        }
        return super.h(view, i10, bundle);
    }

    @Override // D1.C0343c
    public final void i(View view, int i10) {
        C0343c c0343c = (C0343c) this.f47819j0.get(view);
        if (c0343c != null) {
            c0343c.i(view, i10);
        } else {
            super.i(view, i10);
        }
    }

    @Override // D1.C0343c
    public final void j(View view, AccessibilityEvent accessibilityEvent) {
        C0343c c0343c = (C0343c) this.f47819j0.get(view);
        if (c0343c != null) {
            c0343c.j(view, accessibilityEvent);
        } else {
            super.j(view, accessibilityEvent);
        }
    }
}
