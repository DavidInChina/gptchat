package rh;

import Eh.AbstractC0511j;
import Rh.p1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import vh.l;
import wh.AbstractC6256u;
import yh.l1;

/* renamed from: rh.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5494a implements AbstractC5496c {

    /* renamed from: Y  reason: collision with root package name */
    public final ArrayList f44986Y = new ArrayList();

    public C5494a(AbstractC5496c... abstractC5496cArr) {
        List<AbstractC5496c> asList = Arrays.asList(abstractC5496cArr);
        for (AbstractC5496c abstractC5496c : asList) {
            if (abstractC5496c instanceof C5494a) {
                this.f44986Y.addAll(((C5494a) abstractC5496c).f44986Y);
            } else if (!(abstractC5496c instanceof EnumC5495b)) {
                this.f44986Y.add(abstractC5496c);
            }
        }
    }

    @Override // rh.AbstractC5496c
    public final int a(int i10) {
        Iterator it = this.f44986Y.iterator();
        while (it.hasNext()) {
            i10 = ((AbstractC5496c) it.next()).a(i10);
        }
        return i10;
    }

    @Override // rh.AbstractC5496c
    public final io.sentry.vendor.b b(l1 l1Var, io.sentry.vendor.b bVar, AbstractC0511j abstractC0511j, p1 p1Var, l lVar, AbstractC6256u abstractC6256u, int i10, int i11) {
        Iterator it = this.f44986Y.iterator();
        io.sentry.vendor.b bVar2 = bVar;
        while (it.hasNext()) {
            bVar2 = ((AbstractC5496c) it.next()).b(l1Var, bVar2, abstractC0511j, p1Var, lVar, abstractC6256u, i10, i11);
        }
        return bVar2;
    }

    @Override // rh.AbstractC5496c
    public final int c(int i10) {
        Iterator it = this.f44986Y.iterator();
        while (it.hasNext()) {
            i10 = ((AbstractC5496c) it.next()).c(i10);
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5494a.class == obj.getClass() && this.f44986Y.equals(((C5494a) obj).f44986Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f44986Y.hashCode() + (C5494a.class.hashCode() * 31);
    }
}
