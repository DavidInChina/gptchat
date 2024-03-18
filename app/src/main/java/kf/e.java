package Kf;

import Mf.AbstractC0997f;
import id.AbstractC3557B;
import java.util.List;
import kf.v;
import l8.AbstractC4344b;
import ug.AbstractC5926h;

/* loaded from: classes2.dex */
public final class e extends AbstractC5926h {
    @Override // ug.AbstractC5926h
    public final List h() {
        AbstractC0997f abstractC0997f = this.f46791b;
        AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor", abstractC0997f);
        c cVar = (c) abstractC0997f;
        g gVar = g.f9801c;
        k kVar = cVar.f9794l0;
        if (AbstractC3557B.K(kVar, gVar)) {
            return AbstractC4344b.F0(Cf.k.e(cVar, false));
        }
        if (AbstractC3557B.K(kVar, j.f9804c)) {
            return AbstractC4344b.F0(Cf.k.e(cVar, true));
        }
        return v.f37483Y;
    }
}
