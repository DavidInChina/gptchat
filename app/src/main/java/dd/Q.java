package Dd;

import Qg.F0;
import Qg.n0;
import Qg.s0;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a  reason: collision with root package name */
    public final F0 f3532a;

    /* renamed from: b  reason: collision with root package name */
    public final n0 f3533b;

    public Q() {
        F0 c10 = s0.c(new P(false));
        this.f3532a = c10;
        this.f3533b = new n0(c10);
    }

    public final void a(boolean z10) {
        F0 f02;
        Object value;
        do {
            f02 = this.f3532a;
            value = f02.getValue();
            P p10 = (P) value;
            ((P) f02.getValue()).getClass();
        } while (!f02.e(value, new P(z10)));
    }
}
