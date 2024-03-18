package L1;

import D1.C0343c;
import D1.H;
import D1.I;
import D1.Z;
import E1.p;
import E1.t;
import U3.f;
import a1.C1915c;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import w.AbstractC6051C;
import w.C6050B;

/* loaded from: classes2.dex */
public abstract class b extends C0343c {

    /* renamed from: s0  reason: collision with root package name */
    public static final Rect f10477s0 = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: t0  reason: collision with root package name */
    public static final C1915c f10478t0 = new C1915c(5);

    /* renamed from: u0  reason: collision with root package name */
    public static final P5.c f10479u0 = new P5.c(6);

    /* renamed from: m0  reason: collision with root package name */
    public final AccessibilityManager f10484m0;

    /* renamed from: n0  reason: collision with root package name */
    public final View f10485n0;

    /* renamed from: o0  reason: collision with root package name */
    public a f10486o0;

    /* renamed from: i0  reason: collision with root package name */
    public final Rect f10480i0 = new Rect();

    /* renamed from: j0  reason: collision with root package name */
    public final Rect f10481j0 = new Rect();

    /* renamed from: k0  reason: collision with root package name */
    public final Rect f10482k0 = new Rect();

    /* renamed from: l0  reason: collision with root package name */
    public final int[] f10483l0 = new int[2];

    /* renamed from: p0  reason: collision with root package name */
    public int f10487p0 = Integer.MIN_VALUE;

    /* renamed from: q0  reason: collision with root package name */
    public int f10488q0 = Integer.MIN_VALUE;

    /* renamed from: r0  reason: collision with root package name */
    public int f10489r0 = Integer.MIN_VALUE;

    public b(View view) {
        if (view != null) {
            this.f10485n0 = view;
            this.f10484m0 = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap weakHashMap = Z.f3247a;
            if (H.c(view) == 0) {
                H.s(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // D1.C0343c
    public final J0.a c(View view) {
        if (this.f10486o0 == null) {
            this.f10486o0 = new a(this);
        }
        return this.f10486o0;
    }

    @Override // D1.C0343c
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
    }

    @Override // D1.C0343c
    public final void e(View view, p pVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f3255Y;
        AccessibilityNodeInfo accessibilityNodeInfo = pVar.f4118a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((W7.d) this).f20757v0;
        accessibilityNodeInfo.setCheckable(chip.d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        pVar.i(chip.getAccessibilityClassName());
        pVar.n(chip.getText());
    }

    public final boolean k(int i10) {
        if (this.f10488q0 != i10) {
            return false;
        }
        this.f10488q0 = Integer.MIN_VALUE;
        W7.d dVar = (W7.d) this;
        if (i10 == 1) {
            Chip chip = dVar.f20757v0;
            chip.f27114t0 = false;
            chip.refreshDrawableState();
        }
        r(i10, 8);
        return true;
    }

    public final p l(int i10) {
        boolean z10;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        p pVar = new p(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        pVar.i("android.view.View");
        Rect rect = f10477s0;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        pVar.f4119b = -1;
        View view = this.f10485n0;
        obtain.setParent(view);
        p(i10, pVar);
        if (pVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f10481j0;
        pVar.f(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(view.getContext().getPackageName());
                    pVar.f4120c = i10;
                    obtain.setSource(view, i10);
                    if (this.f10487p0 == i10) {
                        obtain.setAccessibilityFocused(true);
                        pVar.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        pVar.a(64);
                    }
                    if (this.f10488q0 == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        pVar.a(2);
                    } else if (obtain.isFocusable()) {
                        pVar.a(1);
                    }
                    obtain.setFocused(z10);
                    int[] iArr = this.f10483l0;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.f10480i0;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        pVar.f(rect3);
                        if (pVar.f4119b != -1) {
                            p pVar2 = new p(AccessibilityNodeInfo.obtain());
                            for (int i11 = pVar.f4119b; i11 != -1; i11 = pVar2.f4119b) {
                                pVar2.f4119b = -1;
                                AccessibilityNodeInfo accessibilityNodeInfo = pVar2.f4118a;
                                accessibilityNodeInfo.setParent(view, -1);
                                accessibilityNodeInfo.setBoundsInParent(rect);
                                p(i11, pVar2);
                                pVar2.f(rect2);
                                rect3.offset(rect2.left, rect2.top);
                            }
                        }
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.f10482k0;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            AccessibilityNodeInfo accessibilityNodeInfo2 = pVar.f4118a;
                            accessibilityNodeInfo2.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                                ViewParent parent = view.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view2 = (View) parent;
                                        if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view2.getParent();
                                    } else if (parent != null) {
                                        accessibilityNodeInfo2.setVisibleToUser(true);
                                    }
                                }
                            }
                        }
                    }
                    return pVar;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public abstract void m(ArrayList arrayList);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(int i10, Rect rect) {
        p pVar;
        int i11;
        int i12;
        boolean z10;
        Object obj;
        p pVar2;
        int i13;
        int i14;
        int f6;
        int i15;
        ArrayList arrayList = new ArrayList();
        m(arrayList);
        C6050B c6050b = new C6050B(0);
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            c6050b.e(((Integer) arrayList.get(i16)).intValue(), l(((Integer) arrayList.get(i16)).intValue()));
        }
        int i17 = this.f10488q0;
        int i18 = Integer.MIN_VALUE;
        if (i17 == Integer.MIN_VALUE) {
            pVar = null;
        } else {
            pVar = (p) c6050b.c(i17);
        }
        C1915c c1915c = f10478t0;
        P5.c cVar = f10479u0;
        View view = this.f10485n0;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i19 = this.f10488q0;
            if (i19 != Integer.MIN_VALUE) {
                o(i19).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = view.getWidth();
                int height = view.getHeight();
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 == 130) {
                                rect2.set(0, -1, width, -1);
                                i12 = -1;
                            } else {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                        } else {
                            rect2.set(-1, 0, -1, height);
                            i12 = -1;
                        }
                    } else {
                        i12 = -1;
                        rect2.set(0, height, width, height);
                    }
                } else {
                    i12 = -1;
                    rect2.set(width, 0, width, height);
                }
                Rect rect3 = new Rect(rect2);
                if (i10 == 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 == 130) {
                                i11 = 0;
                                rect3.offset(0, -(rect2.height() + 1));
                            } else {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                        } else {
                            i11 = 0;
                            rect3.offset(-(rect2.width() + 1), 0);
                        }
                    } else {
                        i11 = 0;
                        rect3.offset(0, rect2.height() + 1);
                    }
                } else {
                    i11 = 0;
                    rect3.offset(rect2.width() + 1, 0);
                }
                cVar.getClass();
                f6 = c6050b.f();
                Rect rect4 = new Rect();
                pVar2 = null;
                for (i15 = i11; i15 < f6; i15++) {
                    p pVar3 = (p) c6050b.g(i15);
                    if (pVar3 != pVar) {
                        c1915c.getClass();
                        pVar3.f(rect4);
                        if (f.b0(i10, rect2, rect4)) {
                            if (f.b0(i10, rect2, rect3) && !f.j(i10, rect2, rect4, rect3)) {
                                if (!f.j(i10, rect2, rect3, rect4)) {
                                    int e02 = f.e0(i10, rect2, rect4);
                                    int g02 = f.g0(i10, rect2, rect4);
                                    int i20 = (g02 * g02) + (e02 * 13 * e02);
                                    int e03 = f.e0(i10, rect2, rect3);
                                    int g03 = f.g0(i10, rect2, rect3);
                                    if (i20 >= (g03 * g03) + (e03 * 13 * e03)) {
                                    }
                                }
                            }
                            rect3.set(rect4);
                            pVar2 = pVar3;
                        }
                    }
                }
            }
            i12 = -1;
            Rect rect32 = new Rect(rect2);
            if (i10 == 17) {
            }
            cVar.getClass();
            f6 = c6050b.f();
            Rect rect42 = new Rect();
            pVar2 = null;
            while (i15 < f6) {
            }
        } else {
            i11 = 0;
            i12 = -1;
            WeakHashMap weakHashMap = Z.f3247a;
            if (I.d(view) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            cVar.getClass();
            int f10 = c6050b.f();
            ArrayList arrayList2 = new ArrayList(f10);
            for (int i21 = 0; i21 < f10; i21++) {
                arrayList2.add((p) c6050b.g(i21));
            }
            Collections.sort(arrayList2, new c(z10, c1915c));
            if (i10 != 1) {
                if (i10 == 2) {
                    int size = arrayList2.size();
                    if (pVar == null) {
                        i13 = -1;
                    } else {
                        i13 = arrayList2.lastIndexOf(pVar);
                    }
                    int i22 = i13 + 1;
                    if (i22 < size) {
                        obj = arrayList2.get(i22);
                        pVar2 = (p) obj;
                    }
                    obj = null;
                    pVar2 = (p) obj;
                } else {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
            } else {
                int size2 = arrayList2.size();
                if (pVar != null) {
                    size2 = arrayList2.indexOf(pVar);
                }
                int i23 = size2 - 1;
                if (i23 >= 0) {
                    obj = arrayList2.get(i23);
                    pVar2 = (p) obj;
                }
                obj = null;
                pVar2 = (p) obj;
            }
        }
        p pVar4 = pVar2;
        if (pVar4 != null) {
            if (c6050b.f47561Y) {
                AbstractC6051C.a(c6050b);
            }
            int i24 = c6050b.f47564i0;
            int i25 = i11;
            while (true) {
                if (i25 < i24) {
                    if (c6050b.f47563h0[i25] == pVar4) {
                        i14 = i25;
                        break;
                    }
                    i25++;
                } else {
                    i14 = i12;
                    break;
                }
            }
            i18 = c6050b.d(i14);
        }
        return q(i18);
    }

    public final p o(int i10) {
        if (i10 == -1) {
            View view = this.f10485n0;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            p pVar = new p(obtain);
            WeakHashMap weakHashMap = Z.f3247a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            m(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                pVar.f4118a.addChild(view, ((Integer) arrayList.get(i11)).intValue());
            }
            return pVar;
        }
        return l(i10);
    }

    public abstract void p(int i10, p pVar);

    public final boolean q(int i10) {
        int i11;
        View view = this.f10485n0;
        if ((!view.isFocused() && !view.requestFocus()) || (i11 = this.f10488q0) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            k(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f10488q0 = i10;
        W7.d dVar = (W7.d) this;
        if (i10 == 1) {
            Chip chip = dVar.f20757v0;
            chip.f27114t0 = true;
            chip.refreshDrawableState();
        }
        r(i10, 8);
        return true;
    }

    public final void r(int i10, int i11) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEvent;
        if (i10 == Integer.MIN_VALUE || !this.f10484m0.isEnabled() || (parent = (view = this.f10485n0).getParent()) == null) {
            return;
        }
        if (i10 != -1) {
            accessibilityEvent = AccessibilityEvent.obtain(i11);
            p o10 = o(i10);
            accessibilityEvent.getText().add(o10.g());
            AccessibilityNodeInfo accessibilityNodeInfo = o10.f4118a;
            accessibilityEvent.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEvent.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEvent.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEvent.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEvent.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEvent.getText().isEmpty() && accessibilityEvent.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEvent.setClassName(accessibilityNodeInfo.getClassName());
            t.a(accessibilityEvent, view, i10);
            accessibilityEvent.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEvent = AccessibilityEvent.obtain(i11);
            view.onInitializeAccessibilityEvent(accessibilityEvent);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
