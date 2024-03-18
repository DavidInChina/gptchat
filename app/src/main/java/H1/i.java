package H1;

import D1.C0343c;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes2.dex */
public final class i extends C0343c {
    @Override // D1.C0343c
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        boolean z10;
        super.d(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        if (nestedScrollView.getScrollRange() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityEvent.setScrollable(z10);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        E1.s.c(accessibilityEvent, nestedScrollView.getScrollX());
        E1.s.d(accessibilityEvent, nestedScrollView.getScrollRange());
    }

    @Override // D1.C0343c
    public final void e(View view, E1.p pVar) {
        int scrollRange;
        this.f3255Y.onInitializeAccessibilityNodeInfo(view, pVar.f4118a);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        pVar.i(ScrollView.class.getName());
        if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
            pVar.m(true);
            if (nestedScrollView.getScrollY() > 0) {
                pVar.b(E1.h.f4104i);
                pVar.b(E1.h.f4108m);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                pVar.b(E1.h.f4103h);
                pVar.b(E1.h.f4110o);
            }
        }
    }

    @Override // D1.C0343c
    public final boolean h(View view, int i10, Bundle bundle) {
        if (super.h(view, i10, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        Rect rect = new Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i10 != 4096) {
            if (i10 != 8192 && i10 != 16908344) {
                if (i10 != 16908346) {
                    return false;
                }
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.u(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                return true;
            }
        }
        int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.u(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
        return true;
    }
}
