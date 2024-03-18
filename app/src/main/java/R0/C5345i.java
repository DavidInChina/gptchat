package r0;

import android.graphics.PathMeasure;

/* renamed from: r0.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5345i {

    /* renamed from: a  reason: collision with root package name */
    public final PathMeasure f44245a;

    public C5345i(PathMeasure pathMeasure) {
        this.f44245a = pathMeasure;
    }

    public final void a(float f6, float f10, E e10) {
        if (e10 instanceof C5344h) {
            this.f44245a.getSegment(f6, f10, ((C5344h) e10).f44241a, true);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
