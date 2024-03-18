package Jh;

import yh.l1;

/* loaded from: classes.dex */
public enum d implements f {
    BOOLEAN(g.BOOLEAN),
    BYTE(g.BYTE),
    SHORT(g.SHORT),
    CHARACTER(g.CHARACTER),
    INTEGER(g.INTEGER),
    LONG(g.LONG),
    FLOAT(g.FLOAT),
    DOUBLE(g.DOUBLE);
    

    /* renamed from: Y  reason: collision with root package name */
    public final g f9250Y;

    d(g gVar) {
        this.f9250Y = gVar;
    }

    @Override // Jh.f
    public final Hh.j a(l1.a aVar, int i10) {
        g gVar = this.f9250Y;
        return new Hh.j(gVar, i.a(gVar.f9262Z).b(aVar));
    }
}
