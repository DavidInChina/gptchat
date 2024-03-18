package dc;

import U8.u;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import java.util.ArrayList;
import java.util.Map;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import uc.C5898p;
import uc.C5900r;

/* loaded from: classes.dex */
public final class i extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f28206Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ k f28207Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f28207Z = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        i iVar = new i(this.f28207Z, abstractC4825e);
        iVar.f28206Y = obj;
        return iVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((i) create((Map) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        Map map = (Map) this.f28206Y;
        k kVar = this.f28207Z;
        com.openai.experiment.h hVar = kVar.f28211j;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            AbstractC2469q0.p(entry.getKey());
            arrayList.add(null);
        }
        C5900r c5900r = (C5900r) hVar;
        c5900r.getClass();
        Ad.l.O0(c5900r.f46665a, null, null, new C5898p(c5900r, arrayList, null), 3);
        kVar.l(new u(map, 1));
        return y.f36177a;
    }
}
