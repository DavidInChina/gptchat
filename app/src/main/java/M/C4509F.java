package m;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* renamed from: m.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4509F extends ContentFrameLayout {

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ LayoutInflater$Factory2C4511H f38595p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4509F(LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H, androidx.appcompat.view.f fVar) {
        super(fVar, null);
        this.f38595p0 = layoutInflater$Factory2C4511H;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f38595p0.t(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (x10 < -5 || y10 < -5 || x10 > getWidth() + 5 || y10 > getHeight() + 5) {
                LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = this.f38595p0;
                layoutInflater$Factory2C4511H.r(layoutInflater$Factory2C4511H.A(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i10) {
        setBackgroundDrawable(kotlin.jvm.internal.m.u(getContext(), i10));
    }
}
