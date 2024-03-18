package kb;

import Qg.F0;
import Qg.n0;
import Qg.s0;
import id.AbstractC3557B;
import java.util.List;

/* renamed from: kb.E  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4211E {

    /* renamed from: a  reason: collision with root package name */
    public final F0 f37234a;

    /* renamed from: b  reason: collision with root package name */
    public final n0 f37235b;

    public C4211E() {
        F0 c10 = s0.c(new C4213G());
        this.f37234a = c10;
        this.f37235b = new n0(c10);
    }

    public static void a(C4211E c4211e, List list, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        c4211e.getClass();
        AbstractC3557B.c0("imageSelections", list);
        c4211e.f37234a.setValue(new C4213G(i10, list, z10));
    }
}
