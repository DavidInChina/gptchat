package androidx.compose.ui.node;

import G0.b0;
import M3.H;
import id.AbstractC3557B;
import l0.AbstractC4324p;
import l0.AbstractC4325q;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f24863a;

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.q, G0.b0] */
    static {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f37723i0 = -1;
        f24863a = abstractC4325q;
    }

    public static final int a(AbstractC4324p abstractC4324p, AbstractC4324p abstractC4324p2) {
        if (AbstractC3557B.K(abstractC4324p, abstractC4324p2)) {
            return 2;
        }
        if (!H.B(abstractC4324p, abstractC4324p2) && (!(abstractC4324p instanceof ForceUpdateElement) || !H.B(((ForceUpdateElement) abstractC4324p).f24825b, abstractC4324p2))) {
            return 0;
        }
        return 1;
    }
}
