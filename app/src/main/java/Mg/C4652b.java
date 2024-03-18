package mg;

import Mf.AbstractC1000i;
import Mf.b0;
import id.AbstractC3557B;
import kg.C4293e;
import kg.C4294f;
import ng.AbstractC4838e;

/* renamed from: mg.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4652b implements AbstractC4655e {

    /* renamed from: a  reason: collision with root package name */
    public static final C4652b f39286a = new Object();

    @Override // mg.AbstractC4655e
    public final String a(AbstractC1000i abstractC1000i, m mVar) {
        AbstractC3557B.c0("renderer", mVar);
        if (abstractC1000i instanceof b0) {
            C4294f name = ((b0) abstractC1000i).getName();
            AbstractC3557B.b0("getName(...)", name);
            return mVar.O(name, false);
        }
        C4293e g10 = AbstractC4838e.g(abstractC1000i);
        AbstractC3557B.b0("getFqName(...)", g10);
        return mVar.G(g10);
    }
}
