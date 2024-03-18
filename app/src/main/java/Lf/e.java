package Lf;

import Df.v;
import Mf.AbstractC0994c;
import Mf.AbstractC0997f;
import id.AbstractC3557B;
import kg.C4290b;
import kg.C4291c;
import kg.C4293e;
import ng.AbstractC4838e;
import rg.AbstractC5493d;

/* loaded from: classes2.dex */
public final class e implements Ig.a {

    /* renamed from: Y  reason: collision with root package name */
    public static final e f11081Y = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public static final e f11082Z = new Object();

    public static AbstractC0997f a(AbstractC0997f abstractC0997f) {
        C4293e g10 = AbstractC4838e.g(abstractC0997f);
        String str = d.f11067a;
        C4291c c4291c = (C4291c) d.f11077k.get(g10);
        if (c4291c != null) {
            return AbstractC5493d.e(abstractC0997f).i(c4291c);
        }
        throw new IllegalArgumentException("Given class " + abstractC0997f + " is not a read-only collection");
    }

    public static AbstractC0997f b(e eVar, C4291c c4291c, Jf.l lVar) {
        eVar.getClass();
        AbstractC3557B.c0("builtIns", lVar);
        String str = d.f11067a;
        C4290b c4290b = (C4290b) d.f11074h.get(c4291c.i());
        if (c4290b != null) {
            return lVar.i(c4290b.b());
        }
        return null;
    }

    @Override // Ig.a
    public Iterable c(Object obj) {
        v[] vVarArr = q.f11113i;
        return ((AbstractC0994c) obj).mo24a().m();
    }
}
