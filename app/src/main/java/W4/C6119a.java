package w4;

import I4.f;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* renamed from: w4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6119a extends Paint {
    public C6119a(PorterDuff.Mode mode) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        if (Build.VERSION.SDK_INT < 30) {
            int color = getColor();
            PointF pointF = f.f8054a;
            setColor((Math.max(0, Math.min(255, i10)) << 24) | (color & 16777215));
            return;
        }
        PointF pointF2 = f.f8054a;
        super.setAlpha(Math.max(0, Math.min(255, i10)));
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }
}
