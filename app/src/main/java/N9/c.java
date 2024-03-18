package N9;

import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import com.openai.experiment.r;
import com.openai.experiment.t;
import fa.EnumC2970G;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final r f12756a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12757b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f12758c = AbstractC4268D.a1(new C3959i(EnumC2970G.f30037i0, a.f12746Z), new C3959i(EnumC2970G.f30036h0, a.f12747h0), new C3959i(EnumC2970G.f30039k0, a.f12748i0), new C3959i(EnumC2970G.f30043o0, a.f12749j0), new C3959i(EnumC2970G.f30038j0, a.f12750k0), new C3959i(EnumC2970G.f30040l0, new b(this, 0)), new C3959i(EnumC2970G.f30035Z, new b(this, 1)), new C3959i(EnumC2970G.f30041m0, a.f12751l0), new C3959i(EnumC2970G.f30042n0, a.f12752m0));

    public c(r rVar, t tVar) {
        this.f12756a = rVar;
        this.f12757b = ((G) tVar).c(ExperimentKey.AdaV2Enabled.INSTANCE);
    }
}
