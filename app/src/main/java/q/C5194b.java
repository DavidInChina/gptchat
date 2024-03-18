package q;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: q.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5194b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f43400a;

    public C5194b(ActionBarContainer actionBarContainer) {
        this.f43400a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f43400a;
        if (actionBarContainer.f24454n0) {
            Drawable drawable = actionBarContainer.f24453m0;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f24451k0;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f24452l0;
        if (drawable3 != null && actionBarContainer.f24455o0) {
            drawable3.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f43400a;
        if (actionBarContainer.f24454n0) {
            if (actionBarContainer.f24453m0 != null) {
                actionBarContainer.f24451k0.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable = actionBarContainer.f24451k0;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
