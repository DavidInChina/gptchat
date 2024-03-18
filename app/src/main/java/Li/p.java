package Li;

import Df.AbstractC0405d;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class p extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ q f11253Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC0405d f11254Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, AbstractC0405d abstractC0405d, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f11253Y = qVar;
        this.f11254Z = abstractC0405d;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        AbstractC3557B.c0("completion", abstractC4825e);
        return new p(this.f11253Y, this.f11254Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create(obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        ArrayList arrayList = this.f11253Y.f11256b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (AbstractC3557B.K(((d) next).f11216d, this.f11254Z)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }
}
