package pg;

import Bg.A;
import Mf.B;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: pg.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5186w extends AbstractC5170g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5186w(String str) {
        super(str);
        AbstractC3557B.c0("value", str);
    }

    @Override // pg.AbstractC5170g
    public final A a(B b10) {
        AbstractC3557B.c0("module", b10);
        return b10.j().u();
    }

    @Override // pg.AbstractC5170g
    public final String toString() {
        return android.gov.nist.core.a.n(new StringBuilder(Separators.DOUBLE_QUOTE), (String) this.f43144a, '\"');
    }
}
