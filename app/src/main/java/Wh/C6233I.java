package wh;

import java.util.List;
import sh.AbstractC5634f;
import th.C5805m;

/* renamed from: wh.I  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6233I extends AbstractC6227C {

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC6242g f48525Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f48526h0;

    public C6233I(AbstractC6242g abstractC6242g, List list) {
        super(0);
        this.f48525Z = abstractC6242g;
        this.f48526h0 = list;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        List list = this.f48526h0;
        int i11 = !((AbstractC5634f) this.f48525Z).h1(8);
        for (C6261z c6261z : list.subList(0, i10)) {
            i11 += c6261z.f48584a.p().f7825Y;
        }
        C6261z c6261z2 = (C6261z) list.get(i10);
        return new C6259x(this.f48525Z, c6261z2.f48584a, new C5805m(0, c6261z2.f48585b), c6261z2.f48586c, c6261z2.f48587d, i10, i11);
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f48526h0.size();
    }
}
