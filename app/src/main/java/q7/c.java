package Q7;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* loaded from: classes2.dex */
public abstract class c extends d {

    /* renamed from: c  reason: collision with root package name */
    public boolean f14460c;

    /* renamed from: d  reason: collision with root package name */
    public int f14461d;

    /* renamed from: e  reason: collision with root package name */
    public int f14462e;

    /* renamed from: f  reason: collision with root package name */
    public int f14463f;

    /* renamed from: g  reason: collision with root package name */
    public VelocityTracker f14464g;

    @Override // m1.AbstractC4544a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f14463f < 0) {
            this.f14463f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f14460c) {
            int i10 = this.f14461d;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f14462e) > this.f14463f) {
                this.f14462e = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f14464g;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f14461d = -1;
        motionEvent.getX();
        motionEvent.getY();
        android.gov.nist.core.a.u(view);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    @Override // m1.AbstractC4544a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 1;
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        if (motionEvent.getActionIndex() != 0) {
                            i10 = 0;
                        }
                        this.f14461d = motionEvent.getPointerId(i10);
                        this.f14462e = (int) (motionEvent.getY(i10) + 0.5f);
                    }
                    velocityTracker = this.f14464g;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(motionEvent);
                    }
                    return this.f14460c;
                }
            } else {
                int findPointerIndex = motionEvent.findPointerIndex(this.f14461d);
                if (findPointerIndex == -1) {
                    return false;
                }
                this.f14462e = (int) motionEvent.getY(findPointerIndex);
                AbstractC2469q0.p(view);
                throw null;
            }
        } else {
            VelocityTracker velocityTracker2 = this.f14464g;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                this.f14464g.computeCurrentVelocity(1000);
                this.f14464g.getYVelocity(this.f14461d);
                AbstractC2469q0.p(view);
                throw null;
            }
        }
        this.f14460c = false;
        this.f14461d = -1;
        VelocityTracker velocityTracker3 = this.f14464g;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f14464g = null;
        }
        velocityTracker = this.f14464g;
        if (velocityTracker != null) {
        }
        return this.f14460c;
    }
}
