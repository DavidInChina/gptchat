package rh;

import Eh.AbstractC0511j;
import Qh.AbstractC1230h;
import Rh.p1;
import java.util.HashMap;
import java.util.Iterator;
import vh.l;
import wh.AbstractC6250o;
import wh.AbstractC6256u;
import wh.C6244i;
import yh.l1;

/* renamed from: rh.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5498e implements AbstractC5496c {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC1230h f44993Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC1230h f44994Z;

    public C5498e(AbstractC1230h abstractC1230h, AbstractC1230h abstractC1230h2) {
        this.f44993Y = abstractC1230h;
        this.f44994Z = abstractC1230h2;
    }

    @Override // rh.AbstractC5496c
    public final io.sentry.vendor.b b(l1 l1Var, io.sentry.vendor.b bVar, AbstractC0511j abstractC0511j, p1 p1Var, l lVar, AbstractC6256u abstractC6256u, int i10, int i11) {
        HashMap hashMap = new HashMap();
        Iterator it = lVar.iterator();
        while (it.hasNext()) {
            vh.c cVar = (vh.c) it.next();
            hashMap.put(cVar.getName() + cVar.getDescriptor(), cVar);
        }
        HashMap hashMap2 = new HashMap();
        for (AbstractC6250o abstractC6250o : A7.b.m1(abstractC6256u, new C6244i(l1Var))) {
            hashMap2.put(abstractC6250o.D0() + abstractC6250o.getDescriptor(), abstractC6250o);
        }
        return new C5497d(bVar, this.f44993Y, this.f44994Z, hashMap, hashMap2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5498e.class != obj.getClass()) {
            return false;
        }
        C5498e c5498e = (C5498e) obj;
        if (this.f44993Y.equals(c5498e.f44993Y) && this.f44994Z.equals(c5498e.f44994Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f44993Y.hashCode();
        return this.f44994Z.hashCode() + ((hashCode + (C5498e.class.hashCode() * 31)) * 31);
    }

    @Override // rh.AbstractC5496c
    public final int a(int i10) {
        return i10;
    }

    @Override // rh.AbstractC5496c
    public final int c(int i10) {
        return i10;
    }
}
