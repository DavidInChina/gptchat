package X7;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: Y  reason: collision with root package name */
    public final Dialog f21796Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f21797Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f21798h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f21799i0;

    public a(Dialog dialog, Rect rect) {
        this.f21796Y = dialog;
        this.f21797Z = rect.left;
        this.f21798h0 = rect.top;
        this.f21799i0 = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f21797Z;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f21798h0;
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f21799i0;
            obtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f21796Y.onTouchEvent(obtain);
    }
}
