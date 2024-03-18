package G4;

import android.graphics.Color;

/* renamed from: G4.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0613f implements J {

    /* renamed from: Y  reason: collision with root package name */
    public static final C0613f f6003Y = new Object();

    @Override // G4.J
    public final Object c(H4.a aVar, float f6) {
        double d10;
        boolean z10 = true;
        if (aVar.P() != 1) {
            z10 = false;
        }
        if (z10) {
            aVar.a();
        }
        double r10 = aVar.r();
        double r11 = aVar.r();
        double r12 = aVar.r();
        if (aVar.P() == 7) {
            d10 = aVar.r();
        } else {
            d10 = 1.0d;
        }
        if (z10) {
            aVar.i();
        }
        if (r10 <= 1.0d && r11 <= 1.0d && r12 <= 1.0d) {
            r10 *= 255.0d;
            r11 *= 255.0d;
            r12 *= 255.0d;
            if (d10 <= 1.0d) {
                d10 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d10, (int) r10, (int) r11, (int) r12));
    }
}
