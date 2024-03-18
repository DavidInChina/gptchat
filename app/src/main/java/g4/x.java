package G4;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class x implements J {

    /* renamed from: Y  reason: collision with root package name */
    public static final x f6039Y = new Object();

    @Override // G4.J
    public final Object c(H4.a aVar, float f6) {
        int P = aVar.P();
        if (P == 1) {
            return q.b(aVar, f6);
        }
        if (P == 3) {
            return q.b(aVar, f6);
        }
        if (P == 7) {
            PointF pointF = new PointF(((float) aVar.r()) * f6, ((float) aVar.r()) * f6);
            while (aVar.m()) {
                aVar.d0();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(E9.f.J(P)));
    }
}
