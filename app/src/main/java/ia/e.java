package Ia;

import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import com.openai.experiment.t;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class e extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ t f8499Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t tVar) {
        super(0);
        this.f8499Y = tVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        return Boolean.valueOf(((G) this.f8499Y).c(ExperimentKey.LazyLoadMessages.INSTANCE));
    }
}
