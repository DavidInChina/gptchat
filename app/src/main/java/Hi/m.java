package Hi;

import Ii.AbstractC0804i;
import j9.C3925a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import jf.C3959i;
import kf.AbstractC4268D;
import l8.AbstractC4344b;
import x8.W;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ m f7896a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final CopyOnWriteArrayList f7897b = new CopyOnWriteArrayList();

    public static void a(AbstractC4344b abstractC4344b) {
        AbstractC0804i.a();
        Iterator it = f7897b.iterator();
        while (it.hasNext()) {
            ((C3925a) ((n) it.next())).getClass();
            if (abstractC4344b instanceof k) {
                k kVar = (k) abstractC4344b;
                C3959i c3959i = new C3959i("isSlowLaunch", Boolean.valueOf(kVar.H1()));
                o oVar = kVar.f7886l;
                LinkedHashMap c12 = AbstractC4268D.c1(c3959i, new C3959i("appLaunchType", E9.f.E(oVar.f7908Y)), new C3959i("preLaunchState", oVar), new C3959i("durationUptimeMillis", Long.valueOf(kVar.f7887m)), new C3959i("trampolined", Boolean.valueOf(kVar.f7888n)), new C3959i("startUptimeMillis", Long.valueOf(kVar.f7890p)));
                Long l10 = kVar.f7889o;
                if (l10 != null) {
                    c12.put("invisibleDurationRealtimeMillis", Long.valueOf(l10.longValue()));
                }
                W.M(Pc.e.a(), "App launched", c12, 2);
                if (kVar.H1()) {
                    W.W(Pc.e.a(), "Slow app launch!", null, c12, 2);
                }
            } else if (abstractC4344b instanceof l) {
                l lVar = (l) abstractC4344b;
                W.W(Pc.e.a(), "Frozen frame detected!", null, AbstractC4268D.a1(new C3959i("repeatTouchDownCount", Integer.valueOf(lVar.f7892m)), new C3959i("deliverDurationUptimeMillis", Long.valueOf(lVar.f7893n)), new C3959i("displayDurationUptimeMillis", Long.valueOf(lVar.f7894o))), 2);
            }
        }
    }
}
