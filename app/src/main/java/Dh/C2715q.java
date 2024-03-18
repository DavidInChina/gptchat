package dh;

import Df.AbstractC0405d;
import Sg.C1391c;
import ah.C2001l;
import id.AbstractC3557B;
import j$.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.KSerializer;
import ud.C5902a;

/* renamed from: dh.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2715q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28479a;

    /* renamed from: b  reason: collision with root package name */
    public final wf.k f28480b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f28481c;

    public C2715q(int i10, C2001l c2001l) {
        this.f28479a = i10;
        if (i10 != 1) {
            this.f28480b = c2001l;
            this.f28481c = new C1391c(1);
            return;
        }
        this.f28480b = c2001l;
        this.f28481c = new ConcurrentHashMap();
    }

    public final KSerializer a(AbstractC0405d abstractC0405d) {
        Object obj;
        Object putIfAbsent;
        switch (this.f28479a) {
            case 0:
                obj = ((C1391c) this.f28481c).get(R4.b.k1(abstractC0405d));
                AbstractC3557B.b0("get(...)", obj);
                Y y10 = (Y) obj;
                Object obj2 = y10.f28432a.get();
                if (obj2 == null) {
                    obj2 = y10.a(new C5902a(this, 28, abstractC0405d));
                }
                return ((C2709k) obj2).f28462a;
            default:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f28481c;
                Class k12 = R4.b.k1(abstractC0405d);
                Object obj3 = concurrentHashMap.get(k12);
                if (obj3 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(k12, (obj3 = new C2709k((KSerializer) this.f28480b.invoke(abstractC0405d))))) != null) {
                    obj3 = putIfAbsent;
                }
                return ((C2709k) obj3).f28462a;
        }
    }
}
