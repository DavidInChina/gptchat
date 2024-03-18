package q;

import android.graphics.Canvas;
import n.AbstractC4699j;

/* renamed from: q.y0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5246y0 extends AbstractC4699j {

    /* renamed from: Z  reason: collision with root package name */
    public boolean f43588Z;

    @Override // n.AbstractC4699j, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f43588Z) {
            super.draw(canvas);
        }
    }

    @Override // n.AbstractC4699j, android.graphics.drawable.Drawable
    public final void setHotspot(float f6, float f10) {
        if (this.f43588Z) {
            super.setHotspot(f6, f10);
        }
    }

    @Override // n.AbstractC4699j, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        if (this.f43588Z) {
            super.setHotspotBounds(i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f43588Z) {
            return this.f39577Y.setState(iArr);
        }
        return false;
    }

    @Override // n.AbstractC4699j, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        if (this.f43588Z) {
            return super.setVisible(z10, z11);
        }
        return false;
    }
}
