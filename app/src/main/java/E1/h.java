package E1;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: e  reason: collision with root package name */
    public static final h f4100e = new h(16, (String) null);

    /* renamed from: f  reason: collision with root package name */
    public static final h f4101f = new h(64, (String) null);

    /* renamed from: g  reason: collision with root package name */
    public static final h f4102g = new h(128, (String) null);

    /* renamed from: h  reason: collision with root package name */
    public static final h f4103h = new h(4096, (String) null);

    /* renamed from: i  reason: collision with root package name */
    public static final h f4104i = new h(8192, (String) null);

    /* renamed from: j  reason: collision with root package name */
    public static final h f4105j = new h(262144, (String) null);

    /* renamed from: k  reason: collision with root package name */
    public static final h f4106k = new h(524288, (String) null);

    /* renamed from: l  reason: collision with root package name */
    public static final h f4107l = new h(1048576, (String) null);

    /* renamed from: m  reason: collision with root package name */
    public static final h f4108m = new h(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);

    /* renamed from: n  reason: collision with root package name */
    public static final h f4109n = new h(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);

    /* renamed from: o  reason: collision with root package name */
    public static final h f4110o = new h(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);

    /* renamed from: p  reason: collision with root package name */
    public static final h f4111p = new h(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);

    /* renamed from: a  reason: collision with root package name */
    public final Object f4112a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4113b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f4114c;

    /* renamed from: d  reason: collision with root package name */
    public final B f4115d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction24 = null;
        new h(1, (String) null);
        new h(2, (String) null);
        new h(4, (String) null);
        new h(8, (String) null);
        new h(32, (String) null);
        new h(256, u.class);
        new h(512, u.class);
        new h(1024, v.class);
        new h(2048, v.class);
        new h(16384, (String) null);
        new h(32768, (String) null);
        new h(65536, (String) null);
        new h(131072, z.class);
        new h(2097152, A.class);
        int i10 = Build.VERSION.SDK_INT;
        new h(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
        new h(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, x.class);
        if (i10 >= 29) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction = null;
        }
        new h(accessibilityAction, 16908358, null, null, null);
        if (i10 >= 29) {
            accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction23;
        } else {
            accessibilityAction2 = null;
        }
        new h(accessibilityAction2, 16908359, null, null, null);
        if (i10 >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new h(accessibilityAction3, 16908360, null, null, null);
        if (i10 >= 29) {
            accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction4 = accessibilityAction22;
        } else {
            accessibilityAction4 = null;
        }
        new h(accessibilityAction4, 16908361, null, null, null);
        new h(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
        if (i10 >= 24) {
            accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            accessibilityAction5 = accessibilityAction21;
        } else {
            accessibilityAction5 = null;
        }
        new h(accessibilityAction5, 16908349, null, null, y.class);
        if (i10 >= 26) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction6 = null;
        }
        new h(accessibilityAction6, 16908354, null, null, w.class);
        if (i10 >= 28) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction7 = accessibilityAction20;
        } else {
            accessibilityAction7 = null;
        }
        new h(accessibilityAction7, 16908356, null, null, null);
        if (i10 >= 28) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction8 = accessibilityAction19;
        } else {
            accessibilityAction8 = null;
        }
        new h(accessibilityAction8, 16908357, null, null, null);
        if (i10 >= 30) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction9 = null;
        }
        new h(accessibilityAction9, 16908362, null, null, null);
        if (i10 >= 30) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction10 = accessibilityAction18;
        } else {
            accessibilityAction10 = null;
        }
        new h(accessibilityAction10, 16908372, null, null, null);
        if (i10 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction11 = null;
        }
        new h(accessibilityAction11, 16908373, null, null, null);
        if (i10 >= 32) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction12 = accessibilityAction17;
        } else {
            accessibilityAction12 = null;
        }
        new h(accessibilityAction12, 16908374, null, null, null);
        if (i10 >= 32) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction13 = accessibilityAction16;
        } else {
            accessibilityAction13 = null;
        }
        new h(accessibilityAction13, 16908375, null, null, null);
        if (i10 >= 33) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction14 = accessibilityAction15;
        } else {
            accessibilityAction14 = null;
        }
        new h(accessibilityAction14, 16908376, null, null, null);
        if (i10 >= 34) {
            accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }
        new h(accessibilityAction24, 16908382, null, null, null);
    }

    public h(int i10, Class cls) {
        this(null, i10, null, null, cls);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f4112a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        Object obj2 = ((h) obj).f4112a;
        Object obj3 = this.f4112a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        } else if (!obj3.equals(obj2)) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        Object obj = this.f4112a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String d10 = p.d(this.f4113b);
        if (d10.equals("ACTION_UNKNOWN")) {
            Object obj = this.f4112a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d10 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(d10);
        return sb2.toString();
    }

    public h(int i10, String str) {
        this(null, i10, str, null, null);
    }

    public h(Object obj, int i10, String str, B b10, Class cls) {
        this.f4113b = i10;
        this.f4115d = b10;
        if (obj == null) {
            this.f4112a = new AccessibilityNodeInfo.AccessibilityAction(i10, str);
        } else {
            this.f4112a = obj;
        }
        this.f4114c = cls;
    }
}
