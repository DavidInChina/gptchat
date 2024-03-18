package Fg;

import Bg.o0;
import Mf.AbstractC1000i;
import Mf.a0;
import Mf.b0;
import id.AbstractC3557B;
import kotlin.jvm.internal.o;
import wf.k;

/* loaded from: classes2.dex */
public final class a extends o implements k {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f5370Y = new o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        o0 o0Var = (o0) obj;
        AbstractC3557B.c0("it", o0Var);
        AbstractC1000i k10 = o0Var.y0().k();
        boolean z10 = false;
        if (k10 != null && (k10 instanceof b0) && (((b0) k10).mo20k() instanceof a0)) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
