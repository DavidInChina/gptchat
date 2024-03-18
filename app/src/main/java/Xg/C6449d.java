package xg;

import fg.C3036d;
import fg.C3039g;
import fg.C3044l;
import fg.C3051t;
import fg.C3056y;
import fg.Q;
import fg.W;
import fg.Z;
import hg.AbstractC3428g;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import lg.AbstractC4456a;
import lg.C4470o;
import wg.AbstractC6224a;
import yf.AbstractC6583a;
import yg.C6584a;

/* renamed from: xg.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6449d implements AbstractC6448c {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6224a f49997a;

    /* renamed from: b  reason: collision with root package name */
    public final U3.c f49998b;

    public C6449d(Mf.B b10, U3.i iVar, C6584a c6584a) {
        AbstractC3557B.c0("module", b10);
        AbstractC3557B.c0("protocol", c6584a);
        this.f49997a = c6584a;
        this.f49998b = new U3.c(b10, iVar);
    }

    @Override // xg.AbstractC6451f
    public final List a(D d10, fg.G g10) {
        Iterable<C3039g> iterable;
        AbstractC3557B.c0("proto", g10);
        C4470o c4470o = this.f49997a.f48510j;
        if (c4470o != null) {
            iterable = (List) g10.i(c4470o);
        } else {
            iterable = null;
        }
        if (iterable == null) {
            iterable = kf.v.f37483Y;
        }
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(iterable, 10));
        for (C3039g c3039g : iterable) {
            arrayList.add(this.f49998b.k(c3039g, d10.f49967a));
        }
        return arrayList;
    }

    @Override // xg.AbstractC6451f
    public final ArrayList b(W w10, AbstractC3428g abstractC3428g) {
        AbstractC3557B.c0("proto", w10);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        Iterable<C3039g> iterable = (List) w10.i(this.f49997a.f48516p);
        if (iterable == null) {
            iterable = kf.v.f37483Y;
        }
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(iterable, 10));
        for (C3039g c3039g : iterable) {
            arrayList.add(this.f49998b.k(c3039g, abstractC3428g));
        }
        return arrayList;
    }

    @Override // xg.AbstractC6451f
    public final List c(C6445B c6445b, C3051t c3051t) {
        AbstractC3557B.c0("container", c6445b);
        AbstractC3557B.c0("proto", c3051t);
        Iterable<C3039g> iterable = (List) c3051t.i(this.f49997a.f48512l);
        if (iterable == null) {
            iterable = kf.v.f37483Y;
        }
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(iterable, 10));
        for (C3039g c3039g : iterable) {
            arrayList.add(this.f49998b.k(c3039g, c6445b.f49967a));
        }
        return arrayList;
    }

    @Override // xg.AbstractC6451f
    public final List d(D d10, AbstractC4456a abstractC4456a, EnumC6447b enumC6447b, int i10, Z z10) {
        AbstractC3557B.c0("container", d10);
        AbstractC3557B.c0("callableProto", abstractC4456a);
        AbstractC3557B.c0("kind", enumC6447b);
        AbstractC3557B.c0("proto", z10);
        Iterable<C3039g> iterable = (List) z10.i(this.f49997a.f48514n);
        if (iterable == null) {
            iterable = kf.v.f37483Y;
        }
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(iterable, 10));
        for (C3039g c3039g : iterable) {
            arrayList.add(this.f49998b.k(c3039g, d10.f49967a));
        }
        return arrayList;
    }

    @Override // xg.AbstractC6451f
    public final List e(D d10, AbstractC4456a abstractC4456a, EnumC6447b enumC6447b) {
        AbstractC3557B.c0("proto", abstractC4456a);
        AbstractC3557B.c0("kind", enumC6447b);
        boolean z10 = abstractC4456a instanceof C3056y;
        List<C3039g> list = null;
        AbstractC6224a abstractC6224a = this.f49997a;
        if (z10) {
            C4470o c4470o = abstractC6224a.f48505e;
            if (c4470o != null) {
                list = (List) ((C3056y) abstractC4456a).i(c4470o);
            }
        } else if (abstractC4456a instanceof fg.G) {
            int ordinal = enumC6447b.ordinal();
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + enumC6447b).toString());
            }
            C4470o c4470o2 = abstractC6224a.f48509i;
            if (c4470o2 != null) {
                list = (List) ((fg.G) abstractC4456a).i(c4470o2);
            }
        } else {
            throw new IllegalStateException(("Unknown message: " + abstractC4456a).toString());
        }
        if (list == null) {
            list = kf.v.f37483Y;
        }
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        for (C3039g c3039g : list) {
            arrayList.add(this.f49998b.k(c3039g, d10.f49967a));
        }
        return arrayList;
    }

    @Override // xg.AbstractC6448c
    public final Object f(D d10, fg.G g10, Bg.A a5) {
        AbstractC3557B.c0("proto", g10);
        return null;
    }

    @Override // xg.AbstractC6451f
    public final ArrayList g(Q q10, AbstractC3428g abstractC3428g) {
        AbstractC3557B.c0("proto", q10);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        Iterable<C3039g> iterable = (List) q10.i(this.f49997a.f48515o);
        if (iterable == null) {
            iterable = kf.v.f37483Y;
        }
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(iterable, 10));
        for (C3039g c3039g : iterable) {
            arrayList.add(this.f49998b.k(c3039g, abstractC3428g));
        }
        return arrayList;
    }

    @Override // xg.AbstractC6448c
    public final Object h(D d10, fg.G g10, Bg.A a5) {
        AbstractC3557B.c0("proto", g10);
        C3036d c3036d = (C3036d) A7.b.P0(g10, this.f49997a.f48513m);
        if (c3036d == null) {
            return null;
        }
        return this.f49998b.B(a5, c3036d, d10.f49967a);
    }

    @Override // xg.AbstractC6451f
    public final List i(D d10, AbstractC4456a abstractC4456a, EnumC6447b enumC6447b) {
        Iterable<C3039g> iterable;
        AbstractC3557B.c0("proto", abstractC4456a);
        AbstractC3557B.c0("kind", enumC6447b);
        boolean z10 = abstractC4456a instanceof C3044l;
        AbstractC6224a abstractC6224a = this.f49997a;
        if (z10) {
            iterable = (List) ((C3044l) abstractC4456a).i(abstractC6224a.f48502b);
        } else if (abstractC4456a instanceof C3056y) {
            iterable = (List) ((C3056y) abstractC4456a).i(abstractC6224a.f48504d);
        } else if (abstractC4456a instanceof fg.G) {
            int ordinal = enumC6447b.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        iterable = (List) ((fg.G) abstractC4456a).i(abstractC6224a.f48508h);
                    } else {
                        throw new IllegalStateException("Unsupported callable kind with property proto".toString());
                    }
                } else {
                    iterable = (List) ((fg.G) abstractC4456a).i(abstractC6224a.f48507g);
                }
            } else {
                iterable = (List) ((fg.G) abstractC4456a).i(abstractC6224a.f48506f);
            }
        } else {
            throw new IllegalStateException(("Unknown message: " + abstractC4456a).toString());
        }
        if (iterable == null) {
            iterable = kf.v.f37483Y;
        }
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(iterable, 10));
        for (C3039g c3039g : iterable) {
            arrayList.add(this.f49998b.k(c3039g, d10.f49967a));
        }
        return arrayList;
    }

    @Override // xg.AbstractC6451f
    public final ArrayList j(C6445B c6445b) {
        AbstractC3557B.c0("container", c6445b);
        Iterable<C3039g> iterable = (List) c6445b.f49961d.i(this.f49997a.f48503c);
        if (iterable == null) {
            iterable = kf.v.f37483Y;
        }
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(iterable, 10));
        for (C3039g c3039g : iterable) {
            arrayList.add(this.f49998b.k(c3039g, c6445b.f49967a));
        }
        return arrayList;
    }

    @Override // xg.AbstractC6451f
    public final List k(D d10, fg.G g10) {
        Iterable<C3039g> iterable;
        AbstractC3557B.c0("proto", g10);
        C4470o c4470o = this.f49997a.f48511k;
        if (c4470o != null) {
            iterable = (List) g10.i(c4470o);
        } else {
            iterable = null;
        }
        if (iterable == null) {
            iterable = kf.v.f37483Y;
        }
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(iterable, 10));
        for (C3039g c3039g : iterable) {
            arrayList.add(this.f49998b.k(c3039g, d10.f49967a));
        }
        return arrayList;
    }
}
