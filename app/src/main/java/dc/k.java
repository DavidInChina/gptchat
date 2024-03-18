package dc;

import Qg.F0;
import id.AbstractC3557B;
import java.util.Map;
import nf.AbstractC4828h;
import uc.C5900r;

/* loaded from: classes.dex */
public final class k extends h {

    /* renamed from: j  reason: collision with root package name */
    public final com.openai.experiment.h f28211j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(com.openai.experiment.h hVar) {
        super(new g(K8.d.p0((Map) r1.getValue())));
        F0 f02 = ((C5900r) hVar).f46669e;
        this.f28211j = hVar;
        L4.a.E0(L4.a.I0(new i(this, null), f02), AbstractC4828h.Q(this));
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        AbstractC2624e abstractC2624e = (AbstractC2624e) iVar;
        AbstractC3557B.c0("intent", abstractC2624e);
        if (abstractC2624e instanceof C2623d) {
            h(new j(this, abstractC2624e, null));
        }
    }
}
