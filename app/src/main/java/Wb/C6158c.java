package wb;

import Ia.j;
import Qg.AbstractC1206i;
import Qg.n0;
import Qg.v0;
import Qg.x0;
import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import com.openai.experiment.t;
import java.util.ArrayList;
import ld.C4428a;
import nd.l;
import rb.C5426p;
import rc.C5472v;
import rc.Q;
import uc.C5900r;
import wd.EnumC6212z;
import xb.C6390c;
import xd.h;

/* renamed from: wb.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6158c implements Qc.b {

    /* renamed from: b  reason: collision with root package name */
    public final e f48285b;

    /* renamed from: c  reason: collision with root package name */
    public final n0 f48286c;

    public C6158c(l lVar, h hVar, xd.b bVar, t tVar, com.openai.experiment.h hVar2, C6390c c6390c, C4428a c4428a, e eVar) {
        this.f48285b = eVar;
        x0 x0Var = v0.f14936b;
        Qc.b.f14570a.getClass();
        this.f48286c = L4.a.S0(eVar.f44961e, c4428a, x0Var, Qc.a.f14569c);
        AbstractC1206i i02 = L4.a.i0(new C5426p(((Q) hVar).f44819b, 2));
        L4.a.E0(new j(new AbstractC1206i[]{i02, ((C5472v) bVar).f44936f, ((C5900r) hVar2).f46669e}, 10, new C6156a(lVar, c6390c, this, ((G) tVar).c(ExperimentKey.AlphaModelsEnabled.INSTANCE), null)), c4428a);
    }

    public static boolean a(ArrayList arrayList, Sc.j jVar) {
        if (arrayList.size() > 1) {
            return true;
        }
        EnumC6212z enumC6212z = EnumC6212z.f48476h0;
        EnumC6212z enumC6212z2 = jVar.f16521a;
        if (enumC6212z2 == enumC6212z || enumC6212z2 == EnumC6212z.f48477i0) {
            return true;
        }
        return false;
    }
}
