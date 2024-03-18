package fa;

import id.AbstractC3557B;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class m extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Set f30068j;

    public m(LinkedHashSet linkedHashSet) {
        this.f30068j = linkedHashSet;
    }

    @Override // L4.a
    public final void W0(wi.o oVar) {
        AbstractC3557B.c0("node", oVar);
        String str = oVar.f48603g;
        AbstractC3557B.b0("getDestination(...)", str);
        this.f30068j.add(str);
        Y0(oVar);
    }
}
