package G;

import Z.C1724m0;
import Z.l1;
import Z.o1;
import nf.AbstractC4828h;

/* loaded from: classes2.dex */
public final class L implements l1 {

    /* renamed from: Y  reason: collision with root package name */
    public final C1724m0 f5438Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f5439Z;

    public L(int i10) {
        int i11 = (i10 / 30) * 30;
        this.f5438Y = AbstractC4828h.Z(com.google.android.gms.internal.play_billing.N.D0(Math.max(i11 - 100, 0), i11 + 130), o1.f22665a);
        this.f5439Z = i10;
    }

    public final void b(int i10) {
        if (i10 != this.f5439Z) {
            this.f5439Z = i10;
            int i11 = (i10 / 30) * 30;
            this.f5438Y.setValue(com.google.android.gms.internal.play_billing.N.D0(Math.max(i11 - 100, 0), i11 + 130));
        }
    }

    @Override // Z.l1
    public final Object getValue() {
        return (Cf.g) this.f5438Y.getValue();
    }
}
