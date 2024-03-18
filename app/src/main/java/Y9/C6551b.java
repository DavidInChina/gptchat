package y9;

import Ad.l;
import a9.AbstractC1936a;
import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import com.openai.experiment.t;
import id.AbstractC3557B;
import ld.C4428a;
import m.AbstractActivityC4532l;

/* renamed from: y9.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6551b implements AbstractC1936a {

    /* renamed from: a  reason: collision with root package name */
    public final C4428a f50841a;

    /* renamed from: b  reason: collision with root package name */
    public final t f50842b;

    public C6551b(C4428a c4428a, t tVar) {
        this.f50841a = c4428a;
        this.f50842b = tVar;
    }

    public final void a(AbstractActivityC4532l abstractActivityC4532l) {
        AbstractC3557B.c0("activity", abstractActivityC4532l);
        if (((G) this.f50842b).c(ExperimentKey.AppReviewPrompt.INSTANCE)) {
            l.O0(this.f50841a, null, null, new C6550a(abstractActivityC4532l, null), 3);
        }
    }
}
