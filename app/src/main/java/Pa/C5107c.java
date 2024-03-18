package pa;

import c4.C2288c;
import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import com.openai.experiment.t;
import d4.AbstractC2592a;
import e4.AbstractC2796d;

/* renamed from: pa.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5107c extends AbstractC2796d {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ t f42861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5107c(t tVar, C2288c c2288c, AbstractC2592a[] abstractC2592aArr) {
        super(c2288c, abstractC2592aArr);
        this.f42861d = tVar;
    }

    @Override // B3.c
    public final void e(C3.b bVar) {
        bVar.Q(true);
        if (((G) this.f42861d).c(ExperimentKey.WriteAheadLogging.INSTANCE)) {
            bVar.a();
        }
    }
}
