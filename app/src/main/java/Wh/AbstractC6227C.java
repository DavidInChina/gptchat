package wh;

import Qh.AbstractC1230h;
import Qh.AbstractC1239q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sh.C5629a;
import th.AbstractC5806n;
import yh.G1;
import yh.Y0;
import yh.l1;
import yh.t1;

/* renamed from: wh.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6227C extends AbstractC1239q implements AbstractC6235K {
    @Override // wh.AbstractC6235K
    public G1 I0() {
        ArrayList arrayList = new ArrayList(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC6226B) it.next()).getType());
        }
        return new t1(arrayList);
    }

    @Override // wh.AbstractC6235K
    public final C5629a b(AbstractC1230h abstractC1230h) {
        String str;
        ArrayList arrayList = new ArrayList(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            AbstractC6257v abstractC6257v = (AbstractC6257v) ((AbstractC6226B) it.next());
            l1.a aVar = (l1.a) abstractC6257v.getType().k(new Y0(abstractC1230h));
            AbstractC5806n declaredAnnotations = abstractC6257v.getDeclaredAnnotations();
            Integer num = null;
            if (abstractC6257v.v0()) {
                str = abstractC6257v.getName();
            } else {
                str = null;
            }
            if (abstractC6257v.L0()) {
                num = Integer.valueOf(abstractC6257v.u0());
            }
            arrayList.add(new C6261z(aVar, declaredAnnotations, str, num));
        }
        return new C5629a(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a  */
    @Override // wh.AbstractC6235K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean k0() {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            AbstractC6226B abstractC6226B = (AbstractC6226B) it.next();
            if (!abstractC6226B.v0() || !abstractC6226B.L0()) {
                return false;
            }
            while (it.hasNext()) {
            }
        }
        return true;
    }

    @Override // Qh.AbstractC1239q
    public final Qh.r y(List list) {
        return new C6230F(list);
    }
}
