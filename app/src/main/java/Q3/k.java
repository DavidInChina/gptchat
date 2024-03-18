package Q3;

import N.W;
import Ng.F;
import Pg.EnumC1170c;
import Qg.AbstractC1206i;
import Qg.C1194c;
import U3.q;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.y;
import kf.t;
import nf.AbstractC4825e;
import nf.C4832l;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class k extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f14419Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ j f14420Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ q f14421h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ e f14422i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, q qVar, e eVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f14420Z = jVar;
        this.f14421h0 = qVar;
        this.f14422i0 = eVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new k(this.f14420Z, this.f14421h0, this.f14422i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f14419Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            j jVar = this.f14420Z;
            jVar.getClass();
            q qVar = this.f14421h0;
            AbstractC3557B.c0("spec", qVar);
            List list = jVar.f14418b;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((R3.d) obj2).b(qVar)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                R3.d dVar = (R3.d) it.next();
                dVar.getClass();
                arrayList2.add(new C1194c(new R3.c(dVar, null), C4832l.f40334Y, -2, EnumC1170c.f14192Y));
            }
            AbstractC1206i i02 = L4.a.i0(new i((AbstractC1206i[]) t.K2(arrayList2).toArray(new AbstractC1206i[0]), 0));
            W w10 = new W(this.f14422i0, 2, qVar);
            this.f14419Y = 1;
            if (i02.b(w10, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
