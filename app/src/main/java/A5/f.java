package A5;

import Wh.B;
import ji.AbstractC4136k;
import ji.C4115D;

/* loaded from: classes.dex */
public final class f extends B {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ B f680b;

    public f(B b10) {
        this.f680b = b10;
    }

    @Override // Wh.B
    public final long a() {
        return -1L;
    }

    @Override // Wh.B
    public final Wh.u b() {
        return this.f680b.b();
    }

    @Override // Wh.B
    public final void c(AbstractC4136k abstractC4136k) {
        C4115D I10 = R4.b.I(new ji.t(abstractC4136k));
        this.f680b.c(I10);
        I10.close();
    }
}
