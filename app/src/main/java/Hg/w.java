package Hg;

import Mf.AbstractC1013w;
import Mf.h0;
import Pf.b0;
import id.AbstractC3557B;
import java.util.List;
import rg.AbstractC5493d;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final w f7796Y = new kotlin.jvm.internal.o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        AbstractC1013w abstractC1013w = (AbstractC1013w) obj;
        AbstractC3557B.c0("$this$$receiver", abstractC1013w);
        List S = abstractC1013w.S();
        AbstractC3557B.b0("getValueParameters(...)", S);
        h0 h0Var = (h0) kf.t.p2(S);
        boolean z10 = false;
        if (h0Var != null && !AbstractC5493d.a(h0Var) && ((b0) h0Var).f14085o0 == null) {
            z10 = true;
        }
        List list = z.f7799g;
        if (!z10) {
            return "last parameter should not have a default value or be a vararg";
        }
        return null;
    }
}
