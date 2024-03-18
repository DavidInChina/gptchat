package Uf;

import Mf.AbstractC0997f;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kg.C4291c;
import kg.C4294f;
import l8.AbstractC4344b;
import pg.AbstractC5170g;
import pg.C5165b;
import pg.C5172i;
import rg.AbstractC5493d;

/* renamed from: Uf.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1442d extends AbstractC1439a {
    public static List j(AbstractC5170g abstractC5170g) {
        if (abstractC5170g instanceof C5165b) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC5170g abstractC5170g2 : (Iterable) ((C5165b) abstractC5170g).f43144a) {
                kf.s.N1(j(abstractC5170g2), arrayList);
            }
            return arrayList;
        } else if (abstractC5170g instanceof C5172i) {
            return AbstractC4344b.F0(((C5172i) abstractC5170g).f43147c.c());
        } else {
            return kf.v.f37483Y;
        }
    }

    @Override // Uf.AbstractC1439a
    public final ArrayList a(Object obj, boolean z10) {
        Iterable iterable;
        Nf.c cVar = (Nf.c) obj;
        AbstractC3557B.c0("<this>", cVar);
        Map b10 = cVar.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : b10.entrySet()) {
            C4294f c4294f = (C4294f) entry.getKey();
            AbstractC5170g abstractC5170g = (AbstractC5170g) entry.getValue();
            if (z10 && !AbstractC3557B.K(c4294f, D.f17727b)) {
                iterable = kf.v.f37483Y;
            } else {
                iterable = j(abstractC5170g);
            }
            kf.s.N1(iterable, arrayList);
        }
        return arrayList;
    }

    @Override // Uf.AbstractC1439a
    public final C4291c d(Object obj) {
        Nf.c cVar = (Nf.c) obj;
        AbstractC3557B.c0("<this>", cVar);
        return cVar.a();
    }

    @Override // Uf.AbstractC1439a
    public final Iterable e(Object obj) {
        Nf.i annotations;
        Nf.c cVar = (Nf.c) obj;
        AbstractC3557B.c0("<this>", cVar);
        AbstractC0997f d10 = AbstractC5493d.d(cVar);
        if (d10 == null || (annotations = d10.getAnnotations()) == null) {
            return kf.v.f37483Y;
        }
        return annotations;
    }
}
