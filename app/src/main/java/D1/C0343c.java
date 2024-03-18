package D1;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC3612c;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: D1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0343c {

    /* renamed from: h0  reason: collision with root package name */
    public static final View.AccessibilityDelegate f3254h0 = new View.AccessibilityDelegate();

    /* renamed from: Y  reason: collision with root package name */
    public final View.AccessibilityDelegate f3255Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C0339a f3256Z;

    public C0343c() {
        this(f3254h0);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f3255Y.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public J0.a c(View view) {
        AccessibilityNodeProvider a5 = AbstractC0341b.a(this.f3255Y, view);
        if (a5 != null) {
            return new J0.a(a5);
        }
        return null;
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        this.f3255Y.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void e(View view, E1.p pVar) {
        this.f3255Y.onInitializeAccessibilityNodeInfo(view, pVar.f4118a);
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f3255Y.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f3255Y.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean h(View view, int i10, Bundle bundle) {
        ClickableSpan[] clickableSpanArr;
        boolean z10;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            clickableSpanArr = null;
            if (i11 >= list.size()) {
                break;
            }
            E1.h hVar = (E1.h) list.get(i11);
            if (hVar.a() == i10) {
                E1.B b10 = hVar.f4115d;
                if (b10 != null) {
                    Class cls = hVar.f4114c;
                    if (cls != null) {
                        try {
                            AbstractC2469q0.p(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                            throw null;
                        } catch (Exception e10) {
                            AbstractC3612c.d("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e10);
                        }
                    }
                    z10 = b10.b(view);
                }
            } else {
                i11++;
            }
        }
        z10 = false;
        if (!z10) {
            z10 = AbstractC0341b.b(this.f3255Y, view, i10, bundle);
        }
        if (!z10 && i10 == R.id.accessibility_action_clickable_span && bundle != null) {
            int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                int i13 = 0;
                while (true) {
                    if (clickableSpanArr == null || i13 >= clickableSpanArr.length) {
                        break;
                    } else if (clickableSpan.equals(clickableSpanArr[i13])) {
                        clickableSpan.onClick(view);
                        z11 = true;
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            return z11;
        }
        return z10;
    }

    public void i(View view, int i10) {
        this.f3255Y.sendAccessibilityEvent(view, i10);
    }

    public void j(View view, AccessibilityEvent accessibilityEvent) {
        this.f3255Y.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0343c(View.AccessibilityDelegate accessibilityDelegate) {
        this.f3255Y = accessibilityDelegate;
        this.f3256Z = new C0339a(this);
    }
}
