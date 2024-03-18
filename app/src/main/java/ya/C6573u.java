package ya;

import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import id.AbstractC3557B;
import jf.C3959i;

/* renamed from: ya.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6573u extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ com.openai.experiment.t f50879Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6573u(com.openai.experiment.t tVar) {
        super(2);
        this.f50879Y = tVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        x xVar = (x) obj;
        C3959i c3959i = (C3959i) obj2;
        AbstractC3557B.c0("$this$setOnEach", xVar);
        AbstractC3557B.c0("<name for destructuring parameter 0>", c3959i);
        zd.n nVar = (zd.n) c3959i.f36155Y;
        zd.g gVar = (zd.g) c3959i.f36156Z;
        Boolean bool = gVar.f51966b;
        if (bool == null ? !nVar.f51982a : bool.booleanValue()) {
            if (gVar.f51967c == null) {
                if (((G) this.f50879Y).c(ExperimentKey.VoiceTrainingSettingEnabled.INSTANCE)) {
                    z10 = true;
                    return x.e(xVar, null, z10, 3);
                }
            }
        }
        z10 = false;
        return x.e(xVar, null, z10, 3);
    }
}
