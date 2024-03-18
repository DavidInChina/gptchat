package th;

import Qh.AbstractC1239q;
import java.util.Iterator;
import java.util.List;

/* renamed from: th.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5803k extends AbstractC1239q implements AbstractC5806n {
    @Override // th.AbstractC5806n
    public final AbstractC5798f Y0(Class cls) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            AbstractC5802j abstractC5802j = (AbstractC5802j) it.next();
            if (abstractC5802j.d().H(cls)) {
                return abstractC5802j.b(cls);
            }
        }
        return null;
    }

    @Override // th.AbstractC5806n
    public final boolean isAnnotationPresent(Class cls) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (((AbstractC5802j) it.next()).d().H(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // Qh.AbstractC1239q
    public final Qh.r y(List list) {
        return new C5805m(0, list);
    }
}
