package io.ktor.client.plugins.auth;

import G.X;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import j$.util.concurrent.ConcurrentMap$EL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import wf.o;

/* loaded from: classes.dex */
public final class d extends AbstractC5163j implements o {

    /* renamed from: Y  reason: collision with root package name */
    public Iterator f33338Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f33339Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Ie.e f33340h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ h f33341i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, AbstractC4825e abstractC4825e) {
        super(3, abstractC4825e);
        this.f33341i0 = hVar;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d dVar = new d(this.f33341i0, (AbstractC4825e) obj3);
        dVar.f33340h0 = (Ie.e) obj;
        return dVar.invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Ie.e eVar;
        Iterator it;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f33339Z;
        if (i10 != 0) {
            if (i10 == 1) {
                it = this.f33338Y;
                eVar = this.f33340h0;
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Ie.e eVar2 = this.f33340h0;
            List list = this.f33341i0.f33361a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                Yc.d dVar = (Yc.d) obj2;
                dVar.getClass();
                AbstractC3557B.c0("request", (C5760d) eVar2.f8578Y);
                if (dVar.f22238b) {
                    arrayList.add(obj2);
                }
            }
            it = arrayList.iterator();
            eVar = eVar2;
        }
        while (it.hasNext()) {
            Yc.d dVar2 = (Yc.d) it.next();
            Ei.a aVar = i.f33362a;
            aVar.c("Adding auth headers for " + ((C5760d) eVar.f8578Y).f46125a + " from provider " + dVar2);
            ((Map) ((C5760d) eVar.f8578Y).f46130f.f(h.f33360f, c.f33333Z)).put(dVar2, new Integer(((a) ConcurrentMap$EL.computeIfAbsent(h.f33359e.f6328Y, dVar2, new Ge.a(new X(c.f33334h0, 12)))).atomic));
            this.f33340h0 = eVar;
            this.f33338Y = it;
            this.f33339Z = 1;
            if (dVar2.a((C5760d) eVar.f8578Y, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
