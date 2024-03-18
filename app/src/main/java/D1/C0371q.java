package D1;

import android.view.View;
import android.view.ViewParent;
import io.sentry.android.core.AbstractC3612c;

/* renamed from: D1.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371q {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f3288a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f3289b;

    /* renamed from: c  reason: collision with root package name */
    public final View f3290c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3291d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f3292e;

    public C0371q(View view) {
        this.f3290c = view;
    }

    public final boolean a(float f6, float f10, boolean z10) {
        ViewParent f11;
        if (!this.f3291d || (f11 = f(0)) == null) {
            return false;
        }
        try {
            return AbstractC0350f0.a(f11, this.f3290c, f6, f10, z10);
        } catch (AbstractMethodError e10) {
            AbstractC3612c.d("ViewParentCompat", "ViewParent " + f11 + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    public final boolean b(float f6, float f10) {
        ViewParent f11;
        if (!this.f3291d || (f11 = f(0)) == null) {
            return false;
        }
        try {
            return AbstractC0350f0.b(f11, this.f3290c, f6, f10);
        } catch (AbstractMethodError e10) {
            AbstractC3612c.d("ViewParentCompat", "ViewParent " + f11 + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    public final boolean c(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        ViewParent f6;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.f3291d || (f6 = f(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f3290c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i14 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i14 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            if (this.f3292e == null) {
                this.f3292e = new int[2];
            }
            iArr3 = this.f3292e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        boolean z10 = f6 instanceof r;
        View view2 = this.f3290c;
        if (z10) {
            ((r) f6).h(view2, i10, i11, iArr3, i12);
        } else if (i12 == 0) {
            try {
                AbstractC0350f0.c(f6, view2, i10, i11, iArr3);
            } catch (AbstractMethodError e10) {
                AbstractC3612c.d("ViewParentCompat", "ViewParent " + f6 + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i14;
            iArr2[1] = iArr2[1] - i13;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public final void d(int i10, int i11, int i12, int[] iArr) {
        e(0, i10, 0, i11, null, i12, iArr);
    }

    public final boolean e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent f6;
        int i15;
        int i16;
        int[] iArr3;
        if (!this.f3291d || (f6 = f(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f3290c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i16 = iArr[0];
            i15 = iArr[1];
        } else {
            i16 = 0;
            i15 = 0;
        }
        if (iArr2 == null) {
            if (this.f3292e == null) {
                this.f3292e = new int[2];
            }
            int[] iArr4 = this.f3292e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        boolean z10 = f6 instanceof AbstractC0372s;
        View view2 = this.f3290c;
        if (z10) {
            ((AbstractC0372s) f6).c(view2, i10, i11, i12, i13, i14, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i12;
            iArr3[1] = iArr3[1] + i13;
            if (f6 instanceof r) {
                ((r) f6).d(view2, i10, i11, i12, i13, i14);
            } else if (i14 == 0) {
                try {
                    AbstractC0350f0.d(f6, view2, i10, i11, i12, i13);
                } catch (AbstractMethodError e10) {
                    AbstractC3612c.d("ViewParentCompat", "ViewParent " + f6 + " does not implement interface method onNestedScroll", e10);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i16;
            iArr[1] = iArr[1] - i15;
        }
        return true;
    }

    public final ViewParent f(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return this.f3289b;
        }
        return this.f3288a;
    }

    public final boolean g(int i10) {
        if (f(i10) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i10, int i11) {
        boolean z10;
        if (g(i11)) {
            return true;
        }
        if (this.f3291d) {
            View view = this.f3290c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z11 = parent instanceof r;
                if (z11) {
                    z10 = ((r) parent).e(view2, view, i10, i11);
                } else {
                    if (i11 == 0) {
                        try {
                            z10 = AbstractC0350f0.f(parent, view2, view, i10);
                        } catch (AbstractMethodError e10) {
                            AbstractC3612c.d("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                        }
                    }
                    if (!(parent instanceof View)) {
                        view2 = (View) parent;
                    }
                }
                if (z10) {
                    if (i11 != 0) {
                        if (i11 == 1) {
                            this.f3289b = parent;
                        }
                    } else {
                        this.f3288a = parent;
                    }
                    if (z11) {
                        ((r) parent).f(view2, view, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            AbstractC0350f0.e(parent, view2, view, i10);
                        } catch (AbstractMethodError e11) {
                            AbstractC3612c.d("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                        }
                    }
                    return true;
                }
                if (!(parent instanceof View)) {
                }
            }
            return false;
        }
        return false;
    }

    public final void i(int i10) {
        ViewParent f6 = f(i10);
        if (f6 != null) {
            boolean z10 = f6 instanceof r;
            View view = this.f3290c;
            if (z10) {
                ((r) f6).g(view, i10);
            } else if (i10 == 0) {
                try {
                    AbstractC0350f0.g(f6, view);
                } catch (AbstractMethodError e10) {
                    AbstractC3612c.d("ViewParentCompat", "ViewParent " + f6 + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f3289b = null;
                    return;
                }
                return;
            }
            this.f3288a = null;
        }
    }
}
