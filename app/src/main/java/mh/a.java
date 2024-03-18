package Mh;

import Eh.AbstractC0511j;

/* loaded from: classes2.dex */
public abstract class a extends Hh.i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ c f12142Y;

    public a(c cVar) {
        this.f12142Y = cVar;
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        c cVar = ((b) this).f12143Z;
        int i10 = cVar.f12145b.f12149Y;
        c cVar2 = this.f12142Y;
        String D02 = cVar2.f12144a.mo118a().D0();
        vh.c cVar3 = cVar2.f12144a;
        lVar.k(D02, i10, cVar3.getName(), cVar3.getDescriptor());
        int i11 = cVar3.getType().p().f7825Y - cVar.f12145b.f12150Z;
        return new Hh.l(i11, i11);
    }
}
