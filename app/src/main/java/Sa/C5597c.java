package sa;

import ca.AbstractC2313e;
import com.google.android.gms.internal.play_billing.N;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import jf.C3959i;
import jf.y;
import kf.AbstractC4273I;
import kf.t;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.O;
import wf.n;

/* renamed from: sa.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5597c extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f45478Y;

    /* JADX WARN: Type inference failed for: r0v0, types: [pf.j, sa.c, nf.e] */
    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        ?? abstractC5163j = new AbstractC5163j(2, abstractC4825e);
        abstractC5163j.f45478Y = obj;
        return abstractC5163j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5597c) create((T9.c) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        O o10;
        O o11;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        T9.c cVar = (T9.c) this.f45478Y;
        ArrayList b10 = T9.b.b(cVar.f16971f);
        ArrayList arrayList = new ArrayList();
        Iterator it = b10.iterator();
        while (true) {
            o10 = null;
            if (!it.hasNext()) {
                break;
            }
            String str = ((AbstractC2313e) it.next()).c().f30006A;
            if (str != null) {
                o10 = new O(str);
            }
            if (o10 != null) {
                arrayList.add(o10);
            }
        }
        Set P22 = t.P2(arrayList);
        String str2 = cVar.f16972g;
        if (str2 != null) {
            o11 = new O(str2);
        } else {
            o11 = null;
        }
        ArrayList d22 = t.d2(AbstractC4273I.v2(P22, o11));
        if (str2 != null) {
            o10 = new O(str2);
        }
        return new C3959i(d22, o10);
    }
}
