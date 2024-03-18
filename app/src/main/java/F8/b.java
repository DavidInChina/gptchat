package f8;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f29662a;

    /* renamed from: b  reason: collision with root package name */
    public final float f29663b;

    public b(float f6, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f29662a;
            f6 += ((b) cVar).f29663b;
        }
        this.f29662a = cVar;
        this.f29663b = f6;
    }

    @Override // f8.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f29662a.a(rectF) + this.f29663b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f29662a.equals(bVar.f29662a) && this.f29663b == bVar.f29663b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29662a, Float.valueOf(this.f29663b)});
    }
}
