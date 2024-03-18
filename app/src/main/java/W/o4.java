package W;

import Z.C1718j0;
import nf.AbstractC4828h;

/* loaded from: classes2.dex */
public final class o4 {

    /* renamed from: d  reason: collision with root package name */
    public static final i0.r f20265d = AbstractC4828h.X(S0.f19648F0, S.f19641z0);

    /* renamed from: a  reason: collision with root package name */
    public final C1718j0 f20266a;

    /* renamed from: b  reason: collision with root package name */
    public final C1718j0 f20267b;

    /* renamed from: c  reason: collision with root package name */
    public final C1718j0 f20268c;

    public o4(float f6, float f10, float f11) {
        this.f20266a = Df.H.h0(f6);
        this.f20267b = Df.H.h0(f11);
        this.f20268c = Df.H.h0(f10);
    }

    public final float a() {
        if (c() == 0.0f) {
            return 0.0f;
        }
        return b() / c();
    }

    public final float b() {
        return this.f20268c.h();
    }

    public final float c() {
        return this.f20266a.h();
    }

    public final void d(float f6) {
        this.f20268c.i(com.google.android.gms.internal.play_billing.N.o(f6, this.f20266a.h(), 0.0f));
    }
}
