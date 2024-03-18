package Qg;

import Rg.AbstractC1281b;
import Rg.AbstractC1282c;
import Rg.AbstractC1283d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nf.AbstractC4825e;

/* loaded from: classes2.dex */
public final class G0 extends AbstractC1283d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14753a = AtomicReferenceFieldUpdater.newUpdater(G0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    @Override // Rg.AbstractC1283d
    public final boolean a(AbstractC1281b abstractC1281b) {
        F0 f02 = (F0) abstractC1281b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14753a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, s0.f14918b);
        return true;
    }

    @Override // Rg.AbstractC1283d
    public final AbstractC4825e[] b(AbstractC1281b abstractC1281b) {
        F0 f02 = (F0) abstractC1281b;
        f14753a.set(this, null);
        return AbstractC1282c.f15529a;
    }
}
