package se;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jf.y;
import kf.t;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5757a;
import te.C5760d;
import wf.AbstractC6216a;
import wf.o;
import xe.AbstractC6435x;
import xe.C6408M;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class h extends AbstractC5163j implements o {

    /* renamed from: Y  reason: collision with root package name */
    public int f45559Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Ie.e f45560Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f45561h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ j f45562i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, AbstractC4825e abstractC4825e, boolean z10) {
        super(3, abstractC4825e);
        this.f45561h0 = z10;
        this.f45562i0 = jVar;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z10 = this.f45561h0;
        h hVar = new h(this.f45562i0, (AbstractC4825e) obj3, z10);
        hVar.f45560Z = (Ie.e) obj;
        return hVar.invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f45559Y;
        y yVar = y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Ie.e eVar = this.f45560Z;
            C6408M c6408m = ((C5760d) eVar.f8578Y).f46125a.f49839a;
            AbstractC3557B.c0("<this>", c6408m);
            String str = c6408m.f49854a;
            if (!AbstractC3557B.K(str, "ws") && !AbstractC3557B.K(str, "wss")) {
                z10 = false;
            } else {
                z10 = true;
            }
            Object obj2 = eVar.f8578Y;
            if (!z10) {
                k.f45574b.c("Skipping WebSocket plugin for non-websocket request: " + ((C5760d) obj2).f46125a);
                return yVar;
            }
            Ei.a aVar = k.f45574b;
            StringBuilder sb2 = new StringBuilder("Sending WebSocket request ");
            C5760d c5760d = (C5760d) obj2;
            sb2.append(c5760d.f46125a);
            aVar.c(sb2.toString());
            e eVar2 = e.f45556a;
            c5760d.getClass();
            ((Map) c5760d.f46130f.f(je.f.f36131a, C5757a.f46117h0)).put(eVar2, yVar);
            if (this.f45561h0) {
                List<AbstractC6216a> list = (List) this.f45562i0.f45572c.f17400Y;
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                for (AbstractC6216a abstractC6216a : list) {
                    AbstractC2469q0.p(abstractC6216a.mo122invoke());
                    arrayList.add(null);
                }
                c5760d.f46130f.e(k.f45573a, arrayList);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    if (!arrayList2.isEmpty()) {
                        String m22 = t.m2(arrayList2, Separators.SEMICOLON, null, null, null, 62);
                        List list2 = AbstractC6435x.f49956a;
                        c5760d.f46127c.f("Sec-WebSocket-Extensions", m22.toString());
                    }
                } else {
                    AbstractC2469q0.p(it.next());
                    throw null;
                }
            }
            f fVar = new f();
            this.f45559Y = 1;
            if (eVar.d(fVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
