package zh;

import Bh.AbstractC0258m0;
import Bh.C0256l0;
import Bh.EnumC0254k0;
import Bh.F0;
import Bh.R0;
import Bh.f1;
import yh.l1;

/* renamed from: zh.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6886n extends AbstractC6887o {
    @Override // zh.AbstractC6869C
    public final C6871E e() {
        AbstractC0258m0 abstractC0258m0;
        R0 r02 = (R0) h();
        String str = R0.f2247u;
        if (str == null) {
            abstractC0258m0 = EnumC0254k0.f2357Y;
        } else {
            abstractC0258m0 = new C0256l0(System.currentTimeMillis(), str);
        }
        F0 a5 = r02.a(r02.f2259k, abstractC0258m0);
        l1 l1Var = r02.f2249a;
        byte[] bArr = a5.f2202a;
        abstractC0258m0.a(l1Var, false, bArr);
        R0 r03 = a5.f2204c;
        return new C6871E(r03.f2249a, bArr, r03.f2258j, A7.b.l1(r03.f2253e, a5.f2203b));
    }

    public abstract f1 h();
}
