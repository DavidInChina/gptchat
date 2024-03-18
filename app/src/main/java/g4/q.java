package G4;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static final U3.c f6025a = U3.c.y("x", "y");

    public static int a(H4.a aVar) {
        aVar.a();
        int r10 = (int) (aVar.r() * 255.0d);
        int r11 = (int) (aVar.r() * 255.0d);
        int r12 = (int) (aVar.r() * 255.0d);
        while (aVar.m()) {
            aVar.d0();
        }
        aVar.i();
        return Color.argb(255, r10, r11, r12);
    }

    public static PointF b(H4.a aVar, float f6) {
        int f10 = AbstractC6708l.f(aVar.P());
        if (f10 != 0) {
            if (f10 != 2) {
                if (f10 == 6) {
                    float r10 = (float) aVar.r();
                    float r11 = (float) aVar.r();
                    while (aVar.m()) {
                        aVar.d0();
                    }
                    return new PointF(r10 * f6, r11 * f6);
                }
                throw new IllegalArgumentException("Unknown point starts with ".concat(E9.f.J(aVar.P())));
            }
            aVar.h();
            float f11 = 0.0f;
            float f12 = 0.0f;
            while (aVar.m()) {
                int V10 = aVar.V(f6025a);
                if (V10 != 0) {
                    if (V10 != 1) {
                        aVar.a0();
                        aVar.d0();
                    } else {
                        f12 = d(aVar);
                    }
                } else {
                    f11 = d(aVar);
                }
            }
            aVar.j();
            return new PointF(f11 * f6, f12 * f6);
        }
        aVar.a();
        float r12 = (float) aVar.r();
        float r13 = (float) aVar.r();
        while (aVar.P() != 2) {
            aVar.d0();
        }
        aVar.i();
        return new PointF(r12 * f6, r13 * f6);
    }

    public static ArrayList c(H4.a aVar, float f6) {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.P() == 1) {
            aVar.a();
            arrayList.add(b(aVar, f6));
            aVar.i();
        }
        aVar.i();
        return arrayList;
    }

    public static float d(H4.a aVar) {
        int P = aVar.P();
        int f6 = AbstractC6708l.f(P);
        if (f6 != 0) {
            if (f6 == 6) {
                return (float) aVar.r();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(E9.f.J(P)));
        }
        aVar.a();
        float r10 = (float) aVar.r();
        while (aVar.m()) {
            aVar.d0();
        }
        aVar.i();
        return r10;
    }
}
