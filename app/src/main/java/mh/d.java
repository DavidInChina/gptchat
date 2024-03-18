package Mh;

import Qh.AbstractC1235m;
import Qh.AbstractC1239q;
import uh.AbstractC5929a;

/* loaded from: classes2.dex */
public enum d {
    STATIC(178, Hh.o.ZERO),
    INSTANCE(180, Hh.o.SINGLE);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f12149Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f12150Z;

    d(int i10, Hh.o oVar) {
        this.f12149Y = i10;
        this.f12150Z = oVar.f7825Y;
    }

    public static Hh.n a(AbstractC5929a abstractC5929a) {
        vh.l lVar = (vh.l) ((AbstractC1239q) abstractC5929a.b().U0()).f(AbstractC1235m.c(abstractC5929a.d()));
        if (lVar.size() == 1) {
            AbstractC1239q abstractC1239q = (AbstractC1239q) lVar;
            if (((vh.c) abstractC1239q.r()).h1(8) && ((vh.c) abstractC1239q.r()).h1(1) && ((vh.c) abstractC1239q.r()).h1(16384)) {
                return new b(new c(STATIC, (vh.c) abstractC1239q.r()));
            }
        }
        return Hh.k.f7814Y;
    }
}
