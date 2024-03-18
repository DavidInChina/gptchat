package Nd;

import Qd.E;
import Qd.H;
import kotlin.jvm.internal.k;
import nf.AbstractC4825e;
import pf.AbstractC5162i;
import wf.n;

/* loaded from: classes.dex */
public final /* synthetic */ class c extends k implements n, AbstractC5162i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12789Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i10, Object obj) {
        super(2, obj, d.class, "userInfoUpdate", "userInfoUpdate(Lcom/segment/analytics/kotlin/core/UserInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.f12789Y = i10;
        if (i10 != 1) {
        } else {
            super(2, obj, d.class, "systemUpdate", "systemUpdate(Lcom/segment/analytics/kotlin/core/System;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12789Y) {
            case 0:
                d dVar = (d) this.receiver;
                dVar.getClass();
                return com.segment.analytics.kotlin.core.c.b(dVar, (H) obj, (AbstractC4825e) obj2);
            default:
                d dVar2 = (d) this.receiver;
                dVar2.getClass();
                return com.segment.analytics.kotlin.core.c.a(dVar2, (E) obj, (AbstractC4825e) obj2);
        }
    }
}
