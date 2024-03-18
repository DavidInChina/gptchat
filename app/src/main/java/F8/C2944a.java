package f8;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: f8.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2944a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f29661a;

    public C2944a(float f6) {
        this.f29661a = f6;
    }

    @Override // f8.c
    public final float a(RectF rectF) {
        return this.f29661a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2944a) && this.f29661a == ((C2944a) obj).f29661a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f29661a)});
    }
}
