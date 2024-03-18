package com.segment.analytics.kotlin.core;

import Df.AbstractC0405d;
import Lg.n;
import Li.q;
import Qd.H;
import Qd.j;
import Qd.o;
import Qd.p;
import ah.AbstractC1998i;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import y.AbstractC6463a;

@AbstractC1998i(with = b.class)
/* loaded from: classes2.dex */
public abstract class a {
    public static final BaseEvent$Companion Companion = new Object();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(q qVar, AbstractC4825e abstractC4825e) {
        j jVar;
        int i10;
        a aVar;
        H h10;
        if (abstractC4825e instanceof j) {
            jVar = (j) abstractC4825e;
            int i11 = jVar.f14619i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f14619i0 = i11 - Integer.MIN_VALUE;
                Object obj = jVar.f14617Z;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = jVar.f14619i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        aVar = jVar.f14616Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    AbstractC0405d b10 = C.f37623a.b(H.class);
                    jVar.f14616Y = this;
                    jVar.f14619i0 = 1;
                    obj = qVar.a(b10, jVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                    aVar = this;
                }
                h10 = (H) obj;
                y yVar = y.f36177a;
                if (h10 != null) {
                    return yVar;
                }
                aVar.k(h10.f14582a);
                aVar.m(p.f14647a);
                if (n.n2(aVar.i())) {
                    String str = h10.f14583b;
                    if (str == null) {
                        str = "";
                    }
                    aVar.p(str);
                }
                return yVar;
            }
        }
        jVar = new j(this, abstractC4825e);
        Object obj3 = jVar.f14617Z;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = jVar.f14619i0;
        if (i10 == 0) {
        }
        h10 = (H) obj3;
        y yVar2 = y.f36177a;
        if (h10 != null) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.segment.analytics.kotlin.core.GroupEvent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, com.segment.analytics.kotlin.core.AliasEvent] */
    public final a b() {
        IdentifyEvent identifyEvent;
        if (this instanceof AliasEvent) {
            String i10 = i();
            AbstractC3557B.c0("userId", i10);
            String str = ((AliasEvent) this).f27755b;
            AbstractC3557B.c0("previousId", str);
            ?? obj = new Object();
            obj.f27754a = i10;
            obj.f27755b = str;
            obj.f27756c = o.f14643i0;
            obj.f27762i = new DestinationMetadata();
            identifyEvent = obj;
        } else if (this instanceof GroupEvent) {
            GroupEvent groupEvent = (GroupEvent) this;
            String str2 = groupEvent.f27766a;
            AbstractC3557B.c0("groupId", str2);
            kotlinx.serialization.json.c cVar = groupEvent.f27767b;
            AbstractC3557B.c0("traits", cVar);
            ?? obj2 = new Object();
            obj2.f27766a = str2;
            obj2.f27767b = cVar;
            obj2.f27768c = o.f14645k0;
            obj2.f27773h = "";
            obj2.f27774i = new DestinationMetadata();
            identifyEvent = obj2;
        } else if (this instanceof IdentifyEvent) {
            identifyEvent = new IdentifyEvent(i(), ((IdentifyEvent) this).f27777b);
        } else if (this instanceof ScreenEvent) {
            ScreenEvent screenEvent = (ScreenEvent) this;
            identifyEvent = new ScreenEvent(screenEvent.f27785a, screenEvent.f27786b, screenEvent.f27787c);
        } else if (this instanceof TrackEvent) {
            TrackEvent trackEvent = (TrackEvent) this;
            identifyEvent = new TrackEvent(trackEvent.f27801b, trackEvent.f27800a);
        } else {
            throw new RuntimeException();
        }
        identifyEvent.k(c());
        identifyEvent.n(f());
        identifyEvent.o(g());
        identifyEvent.l(d());
        identifyEvent.m(e());
        identifyEvent.p(i());
        identifyEvent.q(j());
        return identifyEvent;
    }

    public abstract String c();

    public abstract kotlinx.serialization.json.c d();

    public abstract kotlinx.serialization.json.c e();

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3557B.K(cls2, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type com.segment.analytics.kotlin.core.BaseEvent", obj);
        a aVar = (a) obj;
        if (h() == aVar.h() && AbstractC3557B.K(c(), aVar.c()) && AbstractC3557B.K(f(), aVar.f()) && AbstractC3557B.K(g(), aVar.g()) && AbstractC3557B.K(d(), aVar.d()) && AbstractC3557B.K(e(), aVar.e()) && AbstractC3557B.K(i(), aVar.i()) && AbstractC3557B.K(j(), aVar.j())) {
            return true;
        }
        return false;
    }

    public abstract String f();

    public abstract String g();

    public abstract o h();

    public int hashCode() {
        int hashCode = c().hashCode();
        int hashCode2 = f().hashCode();
        int hashCode3 = g().hashCode();
        int f6 = AbstractC6463a.f(e().f37662Y, AbstractC6463a.f(d().f37662Y, (hashCode3 + ((hashCode2 + ((hashCode + (h().hashCode() * 31)) * 31)) * 31)) * 31, 31), 31);
        return j().hashCode() + ((i().hashCode() + f6) * 31);
    }

    public abstract String i();

    public abstract DestinationMetadata j();

    public abstract void k(String str);

    public abstract void l(kotlinx.serialization.json.c cVar);

    public abstract void m(kotlinx.serialization.json.c cVar);

    public abstract void n(String str);

    public abstract void o(String str);

    public abstract void p(String str);

    public abstract void q(DestinationMetadata destinationMetadata);
}
