package V;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* loaded from: classes2.dex */
public final class D extends RippleDrawable {

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f17900Y;

    /* renamed from: Z  reason: collision with root package name */
    public r0.r f17901Z;

    /* renamed from: h0  reason: collision with root package name */
    public Integer f17902h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f17903i0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D(boolean z10) {
        super(r0, null, r2);
        ColorDrawable colorDrawable;
        ColorStateList valueOf = ColorStateList.valueOf(-16777216);
        if (z10) {
            colorDrawable = new ColorDrawable(-1);
        } else {
            colorDrawable = null;
        }
        this.f17900Y = z10;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f17900Y) {
            this.f17903i0 = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f17903i0 = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f17903i0;
    }
}
