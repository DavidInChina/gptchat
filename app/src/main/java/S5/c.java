package S5;

import java.security.SecureRandom;
import jf.C3963m;
import p5.AbstractC5091c;
import p5.C5089a;
import p5.EnumC5090b;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6216a f16190a;

    /* renamed from: b  reason: collision with root package name */
    public final C3963m f16191b = R4.b.D1(b.f16189Y);

    public c(float f6) {
        this.f16190a = new a(0, f6);
    }

    public final Float a() {
        float floatValue = ((Number) this.f16190a.mo122invoke()).floatValue();
        float f6 = 0.0f;
        int i10 = (floatValue > 0.0f ? 1 : (floatValue == 0.0f ? 0 : -1));
        EnumC5090b enumC5090b = EnumC5090b.f42738Y;
        if (i10 < 0) {
            AbstractC5091c.f42742a.getClass();
            P4.a.m0(C5089a.f42737b, 4, enumC5090b, new a(1, floatValue), null, false, 56);
        } else {
            f6 = 100.0f;
            if (floatValue > 100.0f) {
                AbstractC5091c.f42742a.getClass();
                P4.a.m0(C5089a.f42737b, 4, enumC5090b, new a(2, floatValue), null, false, 56);
            }
            return Float.valueOf(floatValue);
        }
        floatValue = f6;
        return Float.valueOf(floatValue);
    }

    public final boolean b() {
        float floatValue = a().floatValue();
        if (floatValue == 0.0f) {
            return false;
        }
        if (floatValue != 100.0f && ((SecureRandom) this.f16191b.getValue()).nextFloat() * 100 > floatValue) {
            return false;
        }
        return true;
    }
}
