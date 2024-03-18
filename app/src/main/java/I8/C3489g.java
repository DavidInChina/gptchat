package i8;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* renamed from: i8.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3489g extends AbstractC3490h {
    @Override // f8.g
    public final void f(Canvas canvas) {
        if (this.f32770C0.f32768v.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f32770C0.f32768v);
        } else {
            canvas.clipRect(this.f32770C0.f32768v, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }
}
