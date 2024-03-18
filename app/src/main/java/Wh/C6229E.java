package wh;

import java.util.Collections;
import java.util.List;
import sh.AbstractC5634f;
import yh.AbstractC6632q;

/* renamed from: wh.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6229E extends AbstractC6227C {

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC6242g f48520Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f48521h0;

    public C6229E(AbstractC6242g abstractC6242g, List list) {
        super(0);
        this.f48520Z = abstractC6242g;
        this.f48521h0 = list;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int i11 = 0;
        int i12 = !((AbstractC5634f) this.f48520Z).h1(8);
        while (true) {
            List list = this.f48521h0;
            if (i11 < i10) {
                i12 += ((AbstractC6632q) list.get(i11)).p().f7825Y;
                i11++;
            } else {
                return new C6259x(this.f48520Z, ((AbstractC6632q) list.get(i10)).w0(), Collections.emptyList(), null, null, i10, i12);
            }
        }
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f48521h0.size();
    }
}
