package yh;

import java.util.Iterator;
import yh.l1;

/* renamed from: yh.i0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6616i0 extends AbstractC6621k0 {
    @Override // yh.AbstractC6632q
    public final l1.a L() {
        if (l0().L() == null) {
            return null;
        }
        return new C6610g0(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6630p(this);
    }

    @Override // yh.AbstractC6632q
    public final G1 o0() {
        return new C6604e0(this, l0().o0());
    }
}
