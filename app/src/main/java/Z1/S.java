package Z1;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kf.AbstractC4268D;
import kf.AbstractC4273I;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class S extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f22896Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f22897Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f22898h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(String str, String str2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f22897Z = str;
        this.f22898h0 = str2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        S s10 = new S(this.f22897Z, this.f22898h0, abstractC4825e);
        s10.f22896Y = obj;
        return s10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((S) create((P1.h) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        P1.h hVar = (P1.h) this.f22896Y;
        hVar.getClass();
        Map map = ((P1.b) hVar).f13775a;
        Map unmodifiableMap = Collections.unmodifiableMap(map);
        AbstractC3557B.b0("unmodifiableMap(preferencesMap)", unmodifiableMap);
        P1.b bVar = new P1.b(AbstractC4268D.m1(unmodifiableMap), false);
        P1.f fVar = T.f22902g;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, fVar);
        Set set = (Set) map.get(fVar);
        if (set == null) {
            set = kf.x.f37485Y;
        }
        String str = this.f22897Z;
        bVar.b(fVar, AbstractC4273I.v2(set, str));
        T.f22899d.getClass();
        String str2 = "provider:" + str;
        AbstractC3557B.c0("name", str2);
        bVar.b(new P1.f(str2), this.f22898h0);
        Map unmodifiableMap2 = Collections.unmodifiableMap(bVar.f13775a);
        AbstractC3557B.b0("unmodifiableMap(preferencesMap)", unmodifiableMap2);
        return new P1.b(AbstractC4268D.m1(unmodifiableMap2), true);
    }
}
