package Z1;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kf.AbstractC4268D;
import kf.AbstractC4273I;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class Q extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f22894Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Set f22895Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(Set set, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f22895Z = set;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        Q q10 = new Q(this.f22895Z, abstractC4825e);
        q10.f22894Y = obj;
        return q10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((Q) create((P1.h) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        P1.h hVar = (P1.h) this.f22894Y;
        P1.f fVar = T.f22902g;
        P1.b bVar = (P1.b) hVar;
        bVar.getClass();
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, fVar);
        Set set = (Set) bVar.f13775a.get(fVar);
        if (set == null) {
            return hVar;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            if (true ^ this.f22895Z.contains((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            return hVar;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(((P1.b) hVar).f13775a);
        AbstractC3557B.b0("unmodifiableMap(preferencesMap)", unmodifiableMap);
        P1.b bVar2 = new P1.b(AbstractC4268D.m1(unmodifiableMap), false);
        bVar2.b(T.f22902g, AbstractC4273I.t2(set, arrayList));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            Map map = bVar2.f13775a;
            if (hasNext) {
                T.f22899d.getClass();
                String str = "provider:" + ((String) it.next());
                AbstractC3557B.c0("name", str);
                P1.f fVar2 = new P1.f(str);
                bVar2.a();
                map.remove(fVar2);
            } else {
                Map unmodifiableMap2 = Collections.unmodifiableMap(map);
                AbstractC3557B.b0("unmodifiableMap(preferencesMap)", unmodifiableMap2);
                return new P1.b(AbstractC4268D.m1(unmodifiableMap2), true);
            }
        }
    }
}
