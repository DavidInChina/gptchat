package D1;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.openai.chatgpt.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: D1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339a extends View.AccessibilityDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final C0343c f3253a;

    public C0339a(C0343c c0343c) {
        this.f3253a = c0343c;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f3253a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        J0.a c10 = this.f3253a.c(view);
        if (c10 != null) {
            return (AccessibilityNodeProvider) c10.f8729Y;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f3253a.d(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        ClickableSpan[] clickableSpanArr;
        int i10;
        E1.p pVar = new E1.p(accessibilityNodeInfo);
        WeakHashMap weakHashMap = Z.f3247a;
        int i11 = 0;
        Boolean bool = (Boolean) new D(R.id.tag_screen_reader_focusable, 0).d(view);
        boolean z11 = true;
        if (bool != null && bool.booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z10);
        } else {
            pVar.h(1, z10);
        }
        Boolean bool2 = (Boolean) new D(R.id.tag_accessibility_heading, 3).d(view);
        if (bool2 == null || !bool2.booleanValue()) {
            z11 = false;
        }
        if (i12 >= 28) {
            accessibilityNodeInfo.setHeading(z11);
        } else {
            pVar.h(2, z11);
        }
        CharSequence d10 = Z.d(view);
        if (i12 >= 28) {
            accessibilityNodeInfo.setPaneTitle(d10);
        } else {
            E1.i.c(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", d10);
        }
        CharSequence charSequence = (CharSequence) new D(R.id.tag_state_description, 64, 30, 2).d(view);
        if (i12 >= 30) {
            E1.j.c(accessibilityNodeInfo, charSequence);
        } else {
            E1.i.c(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f3253a.e(view, pVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i12 < 26) {
            E1.i.c(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            E1.i.c(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            E1.i.c(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            E1.i.c(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    if (((WeakReference) sparseArray.valueAt(i13)).get() == null) {
                        arrayList.add(Integer.valueOf(i13));
                    }
                }
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    sparseArray.remove(((Integer) arrayList.get(i14)).intValue());
                }
            }
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            } else {
                clickableSpanArr = null;
            }
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                E1.i.c(accessibilityNodeInfo).putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i15 = 0;
                while (i15 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i15];
                    int i16 = i11;
                    while (true) {
                        if (i16 < sparseArray2.size()) {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i16)).get())) {
                                i10 = sparseArray2.keyAt(i16);
                                break;
                            }
                            i16++;
                        } else {
                            i10 = E1.p.f4117d;
                            E1.p.f4117d = i10 + 1;
                            break;
                        }
                    }
                    sparseArray2.put(i10, new WeakReference(clickableSpanArr[i15]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i15];
                    Spanned spanned = (Spanned) text;
                    pVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    pVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    pVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    pVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
                    i15++;
                    i11 = 0;
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            pVar.b((E1.h) list.get(i17));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f3253a.f(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f3253a.g(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        return this.f3253a.h(view, i10, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i10) {
        this.f3253a.i(view, i10);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f3253a.j(view, accessibilityEvent);
    }
}
