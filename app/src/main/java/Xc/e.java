package xc;

import Ad.l;
import Ia.j;
import Qg.v0;
import com.openai.experiment.ExperimentKey;
import com.openai.experiment.t;
import e9.C2814g;
import id.AbstractC3557B;
import ld.C4428a;
import nd.AbstractC4816e;
import nd.C4812a;
import nf.C4832l;
import rb.C5426p;
import rc.C5472v;
import wd.EnumC6181c;

/* loaded from: classes.dex */
public final class e implements AbstractC4816e {

    /* renamed from: a  reason: collision with root package name */
    public final t f49800a;

    /* renamed from: b  reason: collision with root package name */
    public final C5426p f49801b;

    public e(C4428a c4428a, C4812a c4812a, xd.b bVar, t tVar) {
        this.f49800a = tVar;
        this.f49801b = L4.a.l0(L4.a.S0(new j(((C5472v) bVar).f44936f, 6, c4812a), c4428a, v0.f14935a, null));
    }

    public final C2814g a(EnumC6181c enumC6181c, ExperimentKey.BooleanKey booleanKey) {
        AbstractC3557B.c0("feature", enumC6181c);
        AbstractC3557B.c0("experimentKey", booleanKey);
        return new C2814g(new j(this.f49801b, 5, enumC6181c), this, booleanKey, 2);
    }

    public final boolean b(ExperimentKey.BreezeEnabled breezeEnabled) {
        EnumC6181c enumC6181c = EnumC6181c.f48388k0;
        AbstractC3557B.c0("experimentKey", breezeEnabled);
        return ((Boolean) l.a1(C4832l.f40334Y, new C6394c(this, enumC6181c, breezeEnabled, null))).booleanValue();
    }
}
