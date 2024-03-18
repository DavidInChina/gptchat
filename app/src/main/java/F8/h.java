package f8;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f29709a;

    public h(float f6) {
        this.f29709a = f6;
    }

    @Override // f8.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f29709a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && this.f29709a == ((h) obj).f29709a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f29709a)});
    }
}
