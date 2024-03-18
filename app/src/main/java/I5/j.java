package I5;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class j extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ short f8088Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f8089Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(short s10, int i10) {
        super(0);
        this.f8088Y = s10;
        this.f8089Z = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f8089Z;
        short n10 = E9.f.n(i10);
        StringBuilder sb2 = new StringBuilder("Unexpected block type identifier=");
        sb2.append((int) this.f8088Y);
        sb2.append(" met, was expecting ");
        sb2.append(E9.f.O(i10));
        sb2.append(Separators.LPAREN);
        return android.gov.nist.core.a.l(sb2, n10, Separators.RPAREN);
    }
}
