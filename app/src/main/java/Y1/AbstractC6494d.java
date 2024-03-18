package y1;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* renamed from: y1.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6494d {
    public static final void a(Bundle bundle, String str, Size size) {
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
