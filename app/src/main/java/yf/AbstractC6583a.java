package yf;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kf.s;
import l8.AbstractC4344b;

/* renamed from: yf.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6583a extends AbstractC4344b {
    public static int H1(Iterable iterable, int i10) {
        AbstractC3557B.c0("<this>", iterable);
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i10;
    }

    public static ArrayList I1(Iterable iterable) {
        AbstractC3557B.c0("<this>", iterable);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            s.N1((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }
}
