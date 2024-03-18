package A;

import android.widget.Magnifier;
import q0.C5251c;

/* loaded from: classes2.dex */
public final class Q0 extends O0 {
    @Override // A.O0, A.M0
    public final void a(float f6, long j6, long j10) {
        boolean isNaN = Float.isNaN(f6);
        Magnifier magnifier = this.f99a;
        if (!isNaN) {
            magnifier.setZoom(f6);
        }
        if (R4.b.z1(j10)) {
            magnifier.show(C5251c.d(j6), C5251c.e(j6), C5251c.d(j10), C5251c.e(j10));
        } else {
            magnifier.show(C5251c.d(j6), C5251c.e(j6));
        }
    }
}
