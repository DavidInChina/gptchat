package h9;

import bb.C2152D;
import ec.C2873y;
import hc.F;
import hc.L;
import id.AbstractC3557B;
import kotlin.jvm.internal.o;
import wd.C6189g;
import wd.C6205s;

/* renamed from: h9.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3338c extends o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31959Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6205s f31960Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3338c(C6205s c6205s, int i10) {
        super(1);
        this.f31959Y = i10;
        this.f31960Z = c6205s;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f31959Y;
        C6205s c6205s = this.f31960Z;
        switch (i10) {
            case 0:
                C6189g c6189g = (C6189g) obj;
                return c6205s.f48457a;
            case 1:
                C2152D c2152d = (C2152D) obj;
                AbstractC3557B.c0("$this$setState", c2152d);
                return C2152D.e(c2152d, null, null, null, null, false, c6205s.f48458b.f48353b, false, false, 447);
            case 2:
                C2873y c2873y = (C2873y) obj;
                AbstractC3557B.c0("$this$setState", c2873y);
                return C2873y.e(c2873y, null, null, null, null, null, c6205s.f48457a, null, null, 991);
            case 3:
                AbstractC3557B.c0("$this$setState", (F) obj);
                return new F(c6205s.e());
            default:
                L l10 = (L) obj;
                AbstractC3557B.c0("$this$setState", l10);
                return L.e(l10, false, c6205s.e(), null, 13);
        }
    }
}
