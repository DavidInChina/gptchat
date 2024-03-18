package Ua;

import Jc.AbstractC0810d;
import id.AbstractC3557B;
import k4.AbstractC4164f;
import k4.AbstractC4165g;
import q4.n;
import wd.C6209w;

/* loaded from: classes2.dex */
public final class e implements AbstractC4164f {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0810d f17581a;

    public e(AbstractC0810d abstractC0810d) {
        this.f17581a = abstractC0810d;
    }

    @Override // k4.AbstractC4164f
    public final AbstractC4165g a(Object obj, n nVar, f4.i iVar) {
        String str = ((C6209w) obj).f48469a;
        AbstractC3557B.c0("data", str);
        AbstractC3557B.c0("options", nVar);
        AbstractC3557B.c0("imageLoader", iVar);
        return new g(this.f17581a, str, nVar, iVar);
    }
}
