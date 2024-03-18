package q;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class D0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: Y  reason: collision with root package name */
    public final float f43252Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f43253Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f43254h0;

    /* renamed from: i0  reason: collision with root package name */
    public final View f43255i0;

    /* renamed from: j0  reason: collision with root package name */
    public C0 f43256j0;

    /* renamed from: k0  reason: collision with root package name */
    public C0 f43257k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f43258l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f43259m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int[] f43260n0 = new int[2];

    public D0(View view) {
        this.f43255i0 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f43252Y = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f43253Z = tapTimeout;
        this.f43254h0 = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        C0 c02 = this.f43257k0;
        View view = this.f43255i0;
        if (c02 != null) {
            view.removeCallbacks(c02);
        }
        C0 c03 = this.f43256j0;
        if (c03 != null) {
            view.removeCallbacks(c03);
        }
    }

    public abstract p.G b();

    public abstract boolean c();

    public boolean d() {
        p.G b10 = b();
        if (b10 != null && b10.a()) {
            b10.dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (r14 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
        if (r4 != 3) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        A0 h10;
        boolean z11;
        boolean z12 = this.f43258l0;
        View view2 = this.f43255i0;
        if (z12) {
            p.G b10 = b();
            if (b10 != null && b10.a() && (h10 = b10.h()) != null && h10.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f43260n0;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                h10.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b11 = h10.b(obtainNoHistory, this.f43259m0);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 1 && actionMasked != 3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (b11) {
                }
            }
            if (d()) {
                z10 = false;
            }
            z10 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f43259m0);
                            if (findPointerIndex >= 0) {
                                float x10 = motionEvent.getX(findPointerIndex);
                                float y10 = motionEvent.getY(findPointerIndex);
                                float f6 = this.f43252Y;
                                float f10 = -f6;
                                if (x10 < f10 || y10 < f10 || x10 >= (view2.getRight() - view2.getLeft()) + f6 || y10 >= (view2.getBottom() - view2.getTop()) + f6) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z10 = true;
                                        if (z10) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                            view2.onTouchEvent(obtain);
                                            obtain.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a();
                } else {
                    this.f43259m0 = motionEvent.getPointerId(0);
                    if (this.f43256j0 == null) {
                        this.f43256j0 = new C0(this, 0);
                    }
                    view2.postDelayed(this.f43256j0, this.f43253Z);
                    if (this.f43257k0 == null) {
                        this.f43257k0 = new C0(this, 1);
                    }
                    view2.postDelayed(this.f43257k0, this.f43254h0);
                }
            }
            z10 = false;
            if (z10) {
            }
        }
        this.f43258l0 = z10;
        if (z10 || z12) {
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f43258l0 = false;
        this.f43259m0 = -1;
        C0 c02 = this.f43256j0;
        if (c02 != null) {
            this.f43255i0.removeCallbacks(c02);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
