package mg;

import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import Mf.G;
import Mf.b0;
import Pf.I;
import id.AbstractC3557B;
import kg.C4293e;
import kg.C4294f;

/* renamed from: mg.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4654d implements AbstractC4655e {

    /* renamed from: a  reason: collision with root package name */
    public static final C4654d f39288a = new Object();

    public static String b(AbstractC1000i abstractC1000i) {
        String str;
        C4294f name = abstractC1000i.getName();
        AbstractC3557B.b0("getName(...)", name);
        String w12 = Bi.c.w1(name);
        if (abstractC1000i instanceof b0) {
            return w12;
        }
        AbstractC1003l mo20k = abstractC1000i.mo20k();
        AbstractC3557B.b0("getContainingDeclaration(...)", mo20k);
        if (mo20k instanceof AbstractC0997f) {
            str = b((AbstractC1000i) mo20k);
        } else if (mo20k instanceof G) {
            C4293e i10 = ((I) ((G) mo20k)).f14010j0.i();
            AbstractC3557B.b0("toUnsafe(...)", i10);
            str = Bi.c.x1(i10.e());
        } else {
            str = null;
        }
        if (str != null && !AbstractC3557B.K(str, "")) {
            return str + '.' + w12;
        }
        return w12;
    }

    @Override // mg.AbstractC4655e
    public final String a(AbstractC1000i abstractC1000i, m mVar) {
        AbstractC3557B.c0("renderer", mVar);
        return b(abstractC1000i);
    }
}
