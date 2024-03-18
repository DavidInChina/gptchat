package q;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class M0 implements View.OnTouchListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ N0 f43312Y;

    public M0(N0 n02) {
        this.f43312Y = n02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        F f6;
        int action = motionEvent.getAction();
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        N0 n02 = this.f43312Y;
        if (action == 0 && (f6 = n02.f43320E0) != null && f6.isShowing() && x10 >= 0 && x10 < n02.f43320E0.getWidth() && y10 >= 0 && y10 < n02.f43320E0.getHeight()) {
            n02.f43316A0.postDelayed(n02.f43338w0, 250L);
            return false;
        } else if (action == 1) {
            n02.f43316A0.removeCallbacks(n02.f43338w0);
            return false;
        } else {
            return false;
        }
    }
}
