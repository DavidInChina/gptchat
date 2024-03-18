package H;

import z.AbstractC6696f;
import z.AbstractC6714o;
import z.C6697f0;

/* renamed from: H.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0664m implements B.N {

    /* renamed from: b  reason: collision with root package name */
    public final F f6640b;

    /* renamed from: c  reason: collision with root package name */
    public final C6697f0 f6641c = AbstractC6696f.u(0.0f, 0.0f, null, 7);

    public C0664m(F f6) {
        this.f6640b = f6;
    }

    @Override // B.N
    public final float a(float f6, float f10, float f11) {
        if (f6 < f11 && f6 >= 0.0f) {
            if ((f10 > f11 || f10 + f6 <= f11) && Math.abs(this.f6640b.f6549d.f6528c.h()) == 0.0f) {
                return 0.0f;
            }
            return f6;
        }
        return f6;
    }

    @Override // B.N
    public final AbstractC6714o b() {
        return this.f6641c;
    }
}
