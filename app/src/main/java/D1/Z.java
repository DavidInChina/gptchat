package D1;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC3612c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class Z {

    /* renamed from: b  reason: collision with root package name */
    public static Field f3248b;

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap f3247a = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f3249c = false;

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f3250d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e  reason: collision with root package name */
    public static final C f3251e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static final E f3252f = new E();

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, D1.C] */
    static {
        new AtomicInteger(1);
    }

    public static C0358j0 a(View view) {
        if (f3247a == null) {
            f3247a = new WeakHashMap();
        }
        C0358j0 c0358j0 = (C0358j0) f3247a.get(view);
        if (c0358j0 == null) {
            C0358j0 c0358j02 = new C0358j0(view);
            f3247a.put(view, c0358j02);
            return c0358j02;
        }
        return c0358j0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [D1.Y, java.lang.Object] */
    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = Y.f3243d;
        Y y10 = (Y) view.getTag(R.id.tag_unhandled_key_event_manager);
        Y y11 = y10;
        if (y10 == null) {
            ?? obj = new Object();
            obj.f3244a = null;
            obj.f3245b = null;
            obj.f3246c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            y11 = obj;
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = y11.f3244a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = Y.f3243d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (y11.f3244a == null) {
                            y11.f3244a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = Y.f3243d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                y11.f3244a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    y11.f3244a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a5 = y11.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a5 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (y11.f3245b == null) {
                    y11.f3245b = new SparseArray();
                }
                y11.f3245b.put(keyCode, new WeakReference(a5));
            }
        }
        if (a5 == null) {
            return false;
        }
        return true;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return T.a(view);
        }
        if (f3249c) {
            return null;
        }
        if (f3248b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3248b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3249c = true;
                return null;
            }
        }
        try {
            Object obj = f3248b.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            f3249c = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        return (CharSequence) new D(R.id.tag_accessibility_pane_title, 8, 28, 1).d(view);
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static String[] f(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return V.a(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(View view, int i10) {
        boolean z10;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (d(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = 32;
        if (K.a(view) == 0 && !z10) {
            if (i10 == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                K.g(obtain, i10);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(d(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            } else if (view.getParent() != null) {
                try {
                    K.e(view.getParent(), view, view, i10);
                    return;
                } catch (AbstractMethodError e10) {
                    AbstractC3612c.d("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                    return;
                }
            } else {
                return;
            }
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z10) {
            i11 = 2048;
        }
        obtain2.setEventType(i11);
        K.g(obtain2, i10);
        if (z10) {
            obtain2.getText().add(d(view));
            if (H.c(view) == 0) {
                H.s(view, 1);
            }
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    public static C0353h h(View view, C0353h c0353h) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0353h + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return V.b(view, c0353h);
        }
        AbstractC0375v abstractC0375v = (AbstractC0375v) view.getTag(R.id.tag_on_receive_content_listener);
        AbstractC0376w abstractC0376w = f3251e;
        if (abstractC0375v != null) {
            C0353h a5 = ((H1.y) abstractC0375v).a(view, c0353h);
            if (a5 == null) {
                return null;
            }
            if (view instanceof AbstractC0376w) {
                abstractC0376w = (AbstractC0376w) view;
            }
            return abstractC0376w.a(a5);
        }
        if (view instanceof AbstractC0376w) {
            abstractC0376w = (AbstractC0376w) view;
        }
        return abstractC0376w.a(c0353h);
    }

    public static void i(View view, int i10) {
        ArrayList e10 = e(view);
        for (int i11 = 0; i11 < e10.size(); i11++) {
            if (((E1.h) e10.get(i11)).a() == i10) {
                e10.remove(i11);
                return;
            }
        }
    }

    public static void j(View view, E1.h hVar, E1.B b10) {
        C0343c c0343c;
        E1.h hVar2 = new E1.h(null, hVar.f4113b, null, b10, hVar.f4114c);
        View.AccessibilityDelegate c10 = c(view);
        if (c10 == null) {
            c0343c = null;
        } else if (c10 instanceof C0339a) {
            c0343c = ((C0339a) c10).f3253a;
        } else {
            c0343c = new C0343c(c10);
        }
        if (c0343c == null) {
            c0343c = new C0343c();
        }
        l(view, c0343c);
        i(view, hVar2.a());
        e(view).add(hVar2);
        g(view, 0);
    }

    public static void k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            T.d(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void l(View view, C0343c c0343c) {
        C0339a c0339a;
        if (c0343c == null && (c(view) instanceof C0339a)) {
            c0343c = new C0343c();
        }
        if (H.c(view) == 0) {
            H.s(view, 1);
        }
        if (c0343c == null) {
            c0339a = null;
        } else {
            c0339a = c0343c.f3256Z;
        }
        view.setAccessibilityDelegate(c0339a);
    }

    public static void m(View view, CharSequence charSequence) {
        boolean z10 = true;
        new D(R.id.tag_accessibility_pane_title, 8, 28, 1).g(view, charSequence);
        E e10 = f3252f;
        if (charSequence != null) {
            WeakHashMap weakHashMap = e10.f3220Y;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z10 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z10));
            view.addOnAttachStateChangeListener(e10);
            if (K.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(e10);
                return;
            }
            return;
        }
        e10.f3220Y.remove(view);
        view.removeOnAttachStateChangeListener(e10);
        H.o(view.getViewTreeObserver(), e10);
    }

    public static void n(View view, AbstractC0366n0 abstractC0366n0) {
        s0 s0Var = null;
        if (Build.VERSION.SDK_INT >= 30) {
            if (abstractC0366n0 != null) {
                s0Var = new s0(abstractC0366n0);
            }
            view.setWindowInsetsAnimationCallback(s0Var);
            return;
        }
        PathInterpolator pathInterpolator = r0.f3295e;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (abstractC0366n0 == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener q0Var = new q0(view, abstractC0366n0);
        view.setTag(R.id.tag_window_insets_animation_callback, q0Var);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(q0Var);
        }
    }
}
