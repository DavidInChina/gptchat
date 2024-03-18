package A;

import android.widget.Magnifier;
import q0.C5251c;

/* loaded from: classes2.dex */
public class O0 implements M0 {

    /* renamed from: a  reason: collision with root package name */
    public final Magnifier f99a;

    public O0(Magnifier magnifier) {
        this.f99a = magnifier;
    }

    @Override // A.M0
    public void a(float f6, long j6, long j10) {
        this.f99a.show(C5251c.d(j6), C5251c.e(j6));
    }

    public final void b() {
        this.f99a.dismiss();
    }

    public final long c() {
        Magnifier magnifier = this.f99a;
        return Ng.H.c(magnifier.getWidth(), magnifier.getHeight());
    }

    public final void d() {
        this.f99a.update();
    }
}
