package r0;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import s0.AbstractC5502d;
import s0.C5503e;

/* renamed from: r0.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5346j {
    public static final AbstractC5502d a(Bitmap bitmap) {
        ColorSpace colorSpace;
        AbstractC5502d b10;
        colorSpace = bitmap.getColorSpace();
        if (colorSpace == null || (b10 = v.b(colorSpace)) == null) {
            float[] fArr = C5503e.f45026a;
            return C5503e.f45028c;
        }
        return b10;
    }

    public static final Bitmap b(int i10, int i11, int i12, boolean z10, AbstractC5502d abstractC5502d) {
        Bitmap createBitmap;
        createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, androidx.compose.ui.graphics.a.t(i12), z10, v.a(abstractC5502d));
        return createBitmap;
    }
}
