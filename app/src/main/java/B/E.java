package B;

import W.C1645z;
import Z.C1718j0;

/* loaded from: classes.dex */
public final class E implements AbstractC0173w0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1057a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1058b;

    public /* synthetic */ E(int i10, Object obj) {
        this.f1057a = i10;
        this.f1058b = obj;
    }

    @Override // B.AbstractC0173w0
    public final void b(float f6) {
        float f10;
        float f11;
        int i10 = this.f1057a;
        Object obj = this.f1058b;
        switch (i10) {
            case 0:
                H h10 = (H) obj;
                C c10 = h10.f1092l;
                C1718j0 c1718j0 = h10.f1088h;
                if (Float.isNaN(c1718j0.h())) {
                    f10 = 0.0f;
                } else {
                    f10 = c1718j0.h();
                }
                float f12 = f10 + f6;
                Float s22 = kf.t.s2(h10.d().f1149a.values());
                float f13 = Float.NaN;
                if (s22 != null) {
                    f11 = s22.floatValue();
                } else {
                    f11 = Float.NaN;
                }
                Float r22 = kf.t.r2(h10.d().f1149a.values());
                if (r22 != null) {
                    f13 = r22.floatValue();
                }
                float o10 = com.google.android.gms.internal.play_billing.N.o(f12, f11, f13);
                H h11 = c10.f1039a;
                h11.f1088h.i(o10);
                h11.f1089i.i(0.0f);
                return;
            case 1:
                ((U) obj).f1189a.invoke(Float.valueOf(f6));
                return;
            default:
                W.C c11 = (W.C) obj;
                C1645z c1645z = c11.f19004m;
                float f14 = c11.f(f6);
                W.C c12 = c1645z.f20634a;
                c12.f19000i.i(f14);
                c12.f19001j.i(0.0f);
                return;
        }
    }
}
