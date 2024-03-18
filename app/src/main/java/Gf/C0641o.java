package Gf;

import Mf.AbstractC1003l;
import hg.AbstractC3428g;
import hg.C3430i;
import id.AbstractC3557B;
import ig.C3579e;
import kg.AbstractC4295g;
import kg.C4294f;
import lg.C4470o;
import zg.AbstractC6864k;
import zg.C6862i;

/* renamed from: Gf.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0641o extends U3.f {

    /* renamed from: g  reason: collision with root package name */
    public final Mf.P f6437g;

    /* renamed from: h  reason: collision with root package name */
    public final fg.G f6438h;

    /* renamed from: i  reason: collision with root package name */
    public final C3579e f6439i;

    /* renamed from: j  reason: collision with root package name */
    public final AbstractC3428g f6440j;

    /* renamed from: k  reason: collision with root package name */
    public final C3430i f6441k;

    /* renamed from: l  reason: collision with root package name */
    public final String f6442l;

    public C0641o(Mf.P p10, fg.G g10, C3579e c3579e, AbstractC3428g abstractC3428g, C3430i c3430i) {
        String str;
        String str2;
        String str3;
        AbstractC3557B.c0("proto", g10);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        AbstractC3557B.c0("typeTable", c3430i);
        this.f6437g = p10;
        this.f6438h = g10;
        this.f6439i = c3579e;
        this.f6440j = abstractC3428g;
        this.f6441k = c3430i;
        if ((c3579e.f33187Z & 4) == 4) {
            str = abstractC3428g.b(c3579e.f33190j0.f33174h0).concat(abstractC3428g.b(c3579e.f33190j0.f33175i0));
        } else {
            jg.d b10 = jg.i.b(g10, abstractC3428g, c3430i, true);
            if (b10 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Uf.C.a(b10.f36183a));
                AbstractC1003l mo20k = p10.mo20k();
                AbstractC3557B.b0("getContainingDeclaration(...)", mo20k);
                if (AbstractC3557B.K(p10.getVisibility(), Mf.r.f12104d) && (mo20k instanceof C6862i)) {
                    C4470o c4470o = ig.k.f33240i;
                    AbstractC3557B.b0("classModuleName", c4470o);
                    Integer num = (Integer) A7.b.P0(((C6862i) mo20k).f52038j0, c4470o);
                    if (num != null) {
                        str3 = abstractC3428g.b(num.intValue());
                    } else {
                        str3 = "main";
                    }
                    str2 = "$".concat(AbstractC4295g.f37509a.c(str3, "_"));
                } else {
                    if (AbstractC3557B.K(p10.getVisibility(), Mf.r.f12101a) && (mo20k instanceof Mf.G)) {
                        AbstractC6864k abstractC6864k = ((zg.r) p10).f52086K0;
                        if (abstractC6864k instanceof dg.r) {
                            dg.r rVar = (dg.r) abstractC6864k;
                            if (rVar.f28358c != null) {
                                StringBuilder sb3 = new StringBuilder("$");
                                String e10 = rVar.f28357b.e();
                                AbstractC3557B.b0("getInternalName(...)", e10);
                                sb3.append(C4294f.e(Lg.n.P2('/', e10, e10)).b());
                                str2 = sb3.toString();
                            }
                        }
                    }
                    str2 = "";
                }
                sb2.append(str2);
                sb2.append("()");
                sb2.append(b10.f36184b);
                str = sb2.toString();
            } else {
                throw new Lc.l("No field signature for property: " + p10, 3);
            }
        }
        this.f6442l = str;
    }

    @Override // U3.f
    public final String i() {
        return this.f6442l;
    }
}
