package D1;

import android.view.View;
import android.view.autofill.AutofillId;
import com.openai.chatgpt.R;
import j$.util.Objects;
import w.C6049A;

/* loaded from: classes.dex */
public abstract class S {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnUnhandledKeyEventListener, java.lang.Object] */
    public static void a(View view, X x10) {
        C6049A c6049a = (C6049A) view.getTag(R.id.tag_unhandled_key_listeners);
        C6049A c6049a2 = c6049a;
        if (c6049a == null) {
            C6049A c6049a3 = new C6049A();
            view.setTag(R.id.tag_unhandled_key_listeners, c6049a3);
            c6049a2 = c6049a3;
        }
        Objects.requireNonNull(x10);
        ?? obj = new Object();
        c6049a2.put(x10, obj);
        view.addOnUnhandledKeyEventListener(obj);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, X x10) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C6049A c6049a = (C6049A) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c6049a != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c6049a.get(x10)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    public static <T> T f(View view, int i10) {
        return (T) view.requireViewById(i10);
    }

    public static void g(View view, boolean z10) {
        view.setAccessibilityHeading(z10);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, AutofillId autofillId) {
        view.setAutofillId(autofillId);
    }

    public static void j(View view, boolean z10) {
        view.setScreenReaderFocusable(z10);
    }
}
