package A;

import android.view.View;
import android.widget.Magnifier;
import l8.AbstractC4344b;
import q0.C5254f;

/* loaded from: classes2.dex */
public final class R0 implements N0 {

    /* renamed from: a  reason: collision with root package name */
    public static final R0 f106a = new Object();

    @Override // A.N0
    public final boolean a() {
        return true;
    }

    @Override // A.N0
    public final M0 b(View view, boolean z10, long j6, float f6, float f10, boolean z11, Z0.b bVar, float f11) {
        if (z10) {
            return new O0(new Magnifier(view));
        }
        long g02 = bVar.g0(j6);
        float R10 = bVar.R(f6);
        float R11 = bVar.R(f10);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (g02 != C5254f.f43638c) {
            builder.setSize(AbstractC4344b.Y0(C5254f.d(g02)), AbstractC4344b.Y0(C5254f.b(g02)));
        }
        if (!Float.isNaN(R10)) {
            builder.setCornerRadius(R10);
        }
        if (!Float.isNaN(R11)) {
            builder.setElevation(R11);
        }
        if (!Float.isNaN(f11)) {
            builder.setInitialZoom(f11);
        }
        builder.setClippingEnabled(z11);
        return new O0(builder.build());
    }
}
