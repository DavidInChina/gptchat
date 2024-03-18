package L1;

import D1.Z;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import com.google.android.gms.internal.play_billing.N;
import g.RunnableC3118k;
import io.sentry.android.core.AbstractC3612c;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: v  reason: collision with root package name */
    public static final d f10495v = new d(0);

    /* renamed from: a  reason: collision with root package name */
    public int f10496a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10497b;

    /* renamed from: d  reason: collision with root package name */
    public float[] f10499d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f10500e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f10501f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f10502g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f10503h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f10504i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f10505j;

    /* renamed from: k  reason: collision with root package name */
    public int f10506k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f10507l;

    /* renamed from: m  reason: collision with root package name */
    public final float f10508m;

    /* renamed from: n  reason: collision with root package name */
    public final float f10509n;

    /* renamed from: o  reason: collision with root package name */
    public final int f10510o;

    /* renamed from: p  reason: collision with root package name */
    public final OverScroller f10511p;

    /* renamed from: q  reason: collision with root package name */
    public final N f10512q;

    /* renamed from: r  reason: collision with root package name */
    public View f10513r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f10514s;

    /* renamed from: t  reason: collision with root package name */
    public final ViewGroup f10515t;

    /* renamed from: c  reason: collision with root package name */
    public int f10498c = -1;

    /* renamed from: u  reason: collision with root package name */
    public final RunnableC3118k f10516u = new RunnableC3118k(6, this);

    public e(Context context, ViewGroup viewGroup, N n10) {
        if (viewGroup != null) {
            if (n10 != null) {
                this.f10515t = viewGroup;
                this.f10512q = n10;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                this.f10510o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.f10497b = viewConfiguration.getScaledTouchSlop();
                this.f10508m = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f10509n = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f10511p = new OverScroller(context, f10495v);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public final void a() {
        this.f10498c = -1;
        float[] fArr = this.f10499d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f10500e, 0.0f);
            Arrays.fill(this.f10501f, 0.0f);
            Arrays.fill(this.f10502g, 0.0f);
            Arrays.fill(this.f10503h, 0);
            Arrays.fill(this.f10504i, 0);
            Arrays.fill(this.f10505j, 0);
            this.f10506k = 0;
        }
        VelocityTracker velocityTracker = this.f10507l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10507l = null;
        }
    }

    public final void b(View view, int i10) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f10515t;
        if (parent == viewGroup) {
            this.f10513r = view;
            this.f10498c = i10;
            this.f10512q.g0(view, i10);
            n(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + Separators.RPAREN);
    }

    public final boolean c(View view, float f6, float f10) {
        boolean z10;
        boolean z11;
        if (view == null) {
            return false;
        }
        N n10 = this.f10512q;
        if (n10.b0(view) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (n10.c0() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            float f11 = f10 * f10;
            int i10 = this.f10497b;
            if (f11 + (f6 * f6) <= i10 * i10) {
                return false;
            }
            return true;
        } else if (z10) {
            if (Math.abs(f6) <= this.f10497b) {
                return false;
            }
            return true;
        } else if (!z11 || Math.abs(f10) <= this.f10497b) {
            return false;
        } else {
            return true;
        }
    }

    public final void d(int i10) {
        float[] fArr = this.f10499d;
        if (fArr != null) {
            int i11 = this.f10506k;
            int i12 = 1 << i10;
            if ((i11 & i12) != 0) {
                fArr[i10] = 0.0f;
                this.f10500e[i10] = 0.0f;
                this.f10501f[i10] = 0.0f;
                this.f10502g[i10] = 0.0f;
                this.f10503h[i10] = 0;
                this.f10504i[i10] = 0;
                this.f10505j[i10] = 0;
                this.f10506k = (~i12) & i11;
            }
        }
    }

    public final int e(int i10, int i11, int i12) {
        int width;
        int i13;
        if (i10 == 0) {
            return 0;
        }
        float width2 = this.f10515t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs = Math.abs(i11);
        if (abs > 0) {
            i13 = Math.round(Math.abs(sin / abs) * 1000.0f) * 4;
        } else {
            i13 = (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f);
        }
        return Math.min(i13, 600);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r2 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f() {
        if (this.f10496a == 2) {
            OverScroller overScroller = this.f10511p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f10513r.getLeft();
            int top = currY - this.f10513r.getTop();
            if (left != 0) {
                View view = this.f10513r;
                WeakHashMap weakHashMap = Z.f3247a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f10513r;
                WeakHashMap weakHashMap2 = Z.f3247a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f10512q.i0(this.f10513r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
            }
            this.f10515t.post(this.f10516u);
        }
        if (this.f10496a == 2) {
            return true;
        }
        return false;
    }

    public final View g(int i10, int i11) {
        ViewGroup viewGroup = this.f10515t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f10512q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i10, int i11, int i12, int i13) {
        float f6;
        float f10;
        float f11;
        float f12;
        int left = this.f10513r.getLeft();
        int top = this.f10513r.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        OverScroller overScroller = this.f10511p;
        int i16 = 0;
        if (i14 == 0 && i15 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f10513r;
        int i17 = (int) this.f10509n;
        int i18 = (int) this.f10508m;
        int abs = Math.abs(i12);
        if (abs < i17) {
            i12 = 0;
        } else if (abs > i18) {
            if (i12 > 0) {
                i12 = i18;
            } else {
                i12 = -i18;
            }
        }
        int abs2 = Math.abs(i13);
        if (abs2 >= i17) {
            if (abs2 > i18) {
                if (i13 > 0) {
                    i13 = i18;
                } else {
                    i16 = -i18;
                }
            }
            int abs3 = Math.abs(i14);
            int abs4 = Math.abs(i15);
            int abs5 = Math.abs(i12);
            int abs6 = Math.abs(i13);
            int i19 = abs5 + abs6;
            int i20 = abs3 + abs4;
            if (i12 == 0) {
                f6 = abs5;
                f10 = i19;
            } else {
                f6 = abs3;
                f10 = i20;
            }
            float f13 = f6 / f10;
            if (i13 == 0) {
                f11 = abs6;
                f12 = i19;
            } else {
                f11 = abs4;
                f12 = i20;
            }
            float f14 = f11 / f12;
            N n10 = this.f10512q;
            overScroller.startScroll(left, top, i14, i15, (int) ((e(i15, i13, n10.c0()) * f14) + (e(i14, i12, n10.b0(view)) * f13)));
            n(2);
            return true;
        }
        i13 = i16;
        int abs32 = Math.abs(i14);
        int abs42 = Math.abs(i15);
        int abs52 = Math.abs(i12);
        int abs62 = Math.abs(i13);
        int i192 = abs52 + abs62;
        int i202 = abs32 + abs42;
        if (i12 == 0) {
        }
        float f132 = f6 / f10;
        if (i13 == 0) {
        }
        float f142 = f11 / f12;
        N n102 = this.f10512q;
        overScroller.startScroll(left, top, i14, i15, (int) ((e(i15, i13, n102.c0()) * f142) + (e(i14, i12, n102.b0(view)) * f132)));
        n(2);
        return true;
    }

    public final boolean i(int i10) {
        if ((this.f10506k & (1 << i10)) != 0) {
            return true;
        }
        AbstractC3612c.c("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        if (r9.f10498c == (-1)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
        k();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f10507l == null) {
            this.f10507l = VelocityTracker.obtain();
        }
        this.f10507l.addMovement(motionEvent);
        int i10 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                N n10 = this.f10512q;
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f10496a == 1 && pointerId == this.f10498c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i10 >= pointerCount) {
                                            break;
                                        }
                                        int pointerId2 = motionEvent.getPointerId(i10);
                                        if (pointerId2 != this.f10498c) {
                                            View g10 = g((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                                            View view = this.f10513r;
                                            if (g10 == view && q(view, pointerId2)) {
                                            }
                                        }
                                        i10++;
                                    }
                                }
                                d(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x10 = motionEvent.getX(actionIndex);
                        float y10 = motionEvent.getY(actionIndex);
                        l(x10, y10, pointerId3);
                        if (this.f10496a == 0) {
                            q(g((int) x10, (int) y10), pointerId3);
                            int i11 = this.f10503h[pointerId3];
                            return;
                        }
                        int i12 = (int) x10;
                        int i13 = (int) y10;
                        View view2 = this.f10513r;
                        if (view2 != null && i12 >= view2.getLeft() && i12 < view2.getRight() && i13 >= view2.getTop() && i13 < view2.getBottom()) {
                            q(this.f10513r, pointerId3);
                            return;
                        }
                        return;
                    }
                    if (this.f10496a == 1) {
                        this.f10514s = true;
                        n10.j0(this.f10513r, 0.0f, 0.0f);
                        this.f10514s = false;
                        if (this.f10496a == 1) {
                            n(0);
                        }
                    }
                    a();
                    return;
                } else if (this.f10496a == 1) {
                    if (i(this.f10498c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f10498c);
                        float x11 = motionEvent.getX(findPointerIndex);
                        float y11 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f10501f;
                        int i14 = this.f10498c;
                        int i15 = (int) (x11 - fArr[i14]);
                        int i16 = (int) (y11 - this.f10502g[i14]);
                        int left = this.f10513r.getLeft() + i15;
                        int top = this.f10513r.getTop() + i16;
                        int left2 = this.f10513r.getLeft();
                        int top2 = this.f10513r.getTop();
                        if (i15 != 0) {
                            left = n10.h(this.f10513r, left);
                            WeakHashMap weakHashMap = Z.f3247a;
                            this.f10513r.offsetLeftAndRight(left - left2);
                        }
                        if (i16 != 0) {
                            top = n10.i(this.f10513r, top);
                            WeakHashMap weakHashMap2 = Z.f3247a;
                            this.f10513r.offsetTopAndBottom(top - top2);
                        }
                        if (i15 != 0 || i16 != 0) {
                            n10.i0(this.f10513r, left, top);
                        }
                        m(motionEvent);
                        return;
                    }
                    return;
                } else {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (i10 < pointerCount2) {
                        int pointerId4 = motionEvent.getPointerId(i10);
                        if (i(pointerId4)) {
                            float x12 = motionEvent.getX(i10);
                            float y12 = motionEvent.getY(i10);
                            float f6 = x12 - this.f10499d[pointerId4];
                            float f10 = y12 - this.f10500e[pointerId4];
                            Math.abs(f6);
                            Math.abs(f10);
                            int i17 = this.f10503h[pointerId4];
                            Math.abs(f10);
                            Math.abs(f6);
                            int i18 = this.f10503h[pointerId4];
                            Math.abs(f6);
                            Math.abs(f10);
                            int i19 = this.f10503h[pointerId4];
                            Math.abs(f10);
                            Math.abs(f6);
                            int i20 = this.f10503h[pointerId4];
                            if (this.f10496a != 1) {
                                View g11 = g((int) x12, (int) y12);
                                if (c(g11, f6, f10) && q(g11, pointerId4)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i10++;
                    }
                    m(motionEvent);
                    return;
                }
            }
            if (this.f10496a == 1) {
                k();
            }
            a();
            return;
        }
        float x13 = motionEvent.getX();
        float y13 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View g12 = g((int) x13, (int) y13);
        l(x13, y13, pointerId5);
        q(g12, pointerId5);
        int i21 = this.f10503h[pointerId5];
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f10507l;
        float f6 = this.f10508m;
        velocityTracker.computeCurrentVelocity(1000, f6);
        float xVelocity = this.f10507l.getXVelocity(this.f10498c);
        float f10 = this.f10509n;
        float abs = Math.abs(xVelocity);
        float f11 = 0.0f;
        if (abs < f10) {
            xVelocity = 0.0f;
        } else if (abs > f6) {
            if (xVelocity > 0.0f) {
                xVelocity = f6;
            } else {
                xVelocity = -f6;
            }
        }
        float yVelocity = this.f10507l.getYVelocity(this.f10498c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f10) {
            if (abs2 > f6) {
                if (yVelocity <= 0.0f) {
                    f6 = -f6;
                }
                f11 = f6;
            } else {
                f11 = yVelocity;
            }
        }
        this.f10514s = true;
        this.f10512q.j0(this.f10513r, xVelocity, f11);
        this.f10514s = false;
        if (this.f10496a == 1) {
            n(0);
        }
    }

    public final void l(float f6, float f10, int i10) {
        float[] fArr = this.f10499d;
        int i11 = 0;
        if (fArr == null || fArr.length <= i10) {
            int i12 = i10 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f10500e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f10501f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f10502g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f10503h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f10504i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f10505j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f10499d = fArr2;
            this.f10500e = fArr3;
            this.f10501f = fArr4;
            this.f10502g = fArr5;
            this.f10503h = iArr;
            this.f10504i = iArr2;
            this.f10505j = iArr3;
        }
        float[] fArr9 = this.f10499d;
        this.f10501f[i10] = f6;
        fArr9[i10] = f6;
        float[] fArr10 = this.f10500e;
        this.f10502g[i10] = f10;
        fArr10[i10] = f10;
        int[] iArr7 = this.f10503h;
        int i13 = (int) f6;
        int i14 = (int) f10;
        ViewGroup viewGroup = this.f10515t;
        int left = viewGroup.getLeft();
        int i15 = this.f10510o;
        if (i13 < left + i15) {
            i11 = 1;
        }
        if (i14 < viewGroup.getTop() + i15) {
            i11 |= 4;
        }
        if (i13 > viewGroup.getRight() - i15) {
            i11 |= 2;
        }
        if (i14 > viewGroup.getBottom() - i15) {
            i11 |= 8;
        }
        iArr7[i10] = i11;
        this.f10506k |= 1 << i10;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (i(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f10501f[pointerId] = x10;
                this.f10502g[pointerId] = y10;
            }
        }
    }

    public final void n(int i10) {
        this.f10515t.removeCallbacks(this.f10516u);
        if (this.f10496a != i10) {
            this.f10496a = i10;
            this.f10512q.h0(i10);
            if (this.f10496a == 0) {
                this.f10513r = null;
            }
        }
    }

    public final boolean o(int i10, int i11) {
        if (this.f10514s) {
            return h(i10, i11, (int) this.f10507l.getXVelocity(this.f10498c), (int) this.f10507l.getYVelocity(this.f10498c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cd, code lost:
        if (r12 != r11) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(MotionEvent motionEvent) {
        boolean z10;
        View g10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f10507l == null) {
            this.f10507l = VelocityTracker.obtain();
        }
        this.f10507l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                d(motionEvent.getPointerId(actionIndex));
                            }
                        } else {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x10 = motionEvent.getX(actionIndex);
                            float y10 = motionEvent.getY(actionIndex);
                            l(x10, y10, pointerId);
                            int i10 = this.f10496a;
                            if (i10 == 0) {
                                int i11 = this.f10503h[pointerId];
                            } else if (i10 == 2 && (g10 = g((int) x10, (int) y10)) == this.f10513r) {
                                q(g10, pointerId);
                            }
                        }
                    }
                } else if (this.f10499d != null && this.f10500e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i12 = 0; i12 < pointerCount; i12++) {
                        int pointerId2 = motionEvent.getPointerId(i12);
                        if (i(pointerId2)) {
                            float x11 = motionEvent.getX(i12);
                            float y11 = motionEvent.getY(i12);
                            float f6 = x11 - this.f10499d[pointerId2];
                            float f10 = y11 - this.f10500e[pointerId2];
                            View g11 = g((int) x11, (int) y11);
                            if (g11 != null && c(g11, f6, f10)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                int left = g11.getLeft();
                                N n10 = this.f10512q;
                                int h10 = n10.h(g11, ((int) f6) + left);
                                int top = g11.getTop();
                                int i13 = n10.i(g11, ((int) f10) + top);
                                int b02 = n10.b0(g11);
                                int c02 = n10.c0();
                                if (b02 != 0) {
                                    if (b02 > 0) {
                                    }
                                }
                                if (c02 == 0) {
                                    break;
                                } else if (c02 > 0 && i13 == top) {
                                    break;
                                }
                            }
                            Math.abs(f6);
                            Math.abs(f10);
                            int i14 = this.f10503h[pointerId2];
                            Math.abs(f10);
                            Math.abs(f6);
                            int i15 = this.f10503h[pointerId2];
                            Math.abs(f6);
                            Math.abs(f10);
                            int i16 = this.f10503h[pointerId2];
                            Math.abs(f10);
                            Math.abs(f6);
                            int i17 = this.f10503h[pointerId2];
                            if (this.f10496a != 1) {
                                if (z10 && q(g11, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    m(motionEvent);
                }
            }
            a();
        } else {
            float x12 = motionEvent.getX();
            float y12 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            l(x12, y12, pointerId3);
            View g12 = g((int) x12, (int) y12);
            if (g12 == this.f10513r && this.f10496a == 2) {
                q(g12, pointerId3);
            }
            int i18 = this.f10503h[pointerId3];
        }
        if (this.f10496a == 1) {
            return true;
        }
        return false;
    }

    public final boolean q(View view, int i10) {
        if (view == this.f10513r && this.f10498c == i10) {
            return true;
        }
        if (view != null && this.f10512q.C0(view, i10)) {
            this.f10498c = i10;
            b(view, i10);
            return true;
        }
        return false;
    }
}
