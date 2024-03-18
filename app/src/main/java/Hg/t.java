package Hg;

import Mf.AbstractC1013w;
import Mf.h0;
import Pf.b0;
import id.AbstractC3557B;
import java.util.List;
import rg.AbstractC5493d;

/* loaded from: classes2.dex */
public final class t implements AbstractC0732e {

    /* renamed from: a  reason: collision with root package name */
    public static final t f7790a = new Object();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    @Override // Hg.AbstractC0732e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(AbstractC1013w abstractC1013w) {
        AbstractC3557B.c0("functionDescriptor", abstractC1013w);
        List<h0> S = abstractC1013w.S();
        AbstractC3557B.b0("getValueParameters(...)", S);
        if (S.isEmpty()) {
            return true;
        }
        for (h0 h0Var : S) {
            AbstractC3557B.Z(h0Var);
            if (AbstractC5493d.a(h0Var) || ((b0) h0Var).f14085o0 != null) {
                return false;
            }
            while (r4.hasNext()) {
            }
        }
        return true;
    }

    @Override // Hg.AbstractC0732e
    public final String b(AbstractC1013w abstractC1013w) {
        return Bi.c.c1(this, abstractC1013w);
    }

    @Override // Hg.AbstractC0732e
    public final String getDescription() {
        return "should not have varargs or parameters with default values";
    }
}
