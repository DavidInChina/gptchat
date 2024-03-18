package B;

import l0.AbstractC4327s;
import nf.AbstractC4825e;
import z.C6736z;

/* loaded from: classes.dex */
public final class W implements L0 {

    /* renamed from: a  reason: collision with root package name */
    public C6736z f1211a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC4327s f1212b;

    public W(C6736z c6736z) {
        C0142l1 c0142l1 = androidx.compose.foundation.gestures.a.f24695d;
        this.f1211a = c6736z;
        this.f1212b = c0142l1;
    }

    @Override // B.L0
    public final Object a(AbstractC0130h1 abstractC0130h1, float f6, AbstractC4825e abstractC4825e) {
        return Ad.l.n1(abstractC4825e, this.f1212b, new V(f6, this, abstractC0130h1, null));
    }
}
