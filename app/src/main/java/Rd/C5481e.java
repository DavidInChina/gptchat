package rd;

import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import td.C5756a;
import wf.k;
import wf.n;

/* renamed from: rd.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5481e extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f44953Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ k f44954Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC5482f f44955h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5481e(k kVar, AbstractC5482f abstractC5482f, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f44954Z = kVar;
        this.f44955h0 = abstractC5482f;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5481e c5481e = new C5481e(this.f44954Z, this.f44955h0, abstractC4825e);
        c5481e.f44953Y = obj;
        return c5481e;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((C5481e) create((P1.b) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        P1.b bVar = (P1.b) this.f44953Y;
        P1.f fVar = AbstractC5482f.f44956f;
        bVar.getClass();
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, fVar);
        String str = (String) bVar.f13775a.get(fVar);
        AbstractC5482f abstractC5482f = this.f44955h0;
        if (str != null) {
            obj2 = abstractC5482f.f44957a.a(str);
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            obj2 = abstractC5482f.f44958b;
        }
        Object invoke = this.f44954Z.invoke(obj2);
        if (invoke != null) {
            C5756a c5756a = abstractC5482f.f44957a;
            c5756a.getClass();
            bVar.b(fVar, md.b.f39132a.d(c5756a.f46115a, invoke));
        }
        return y.f36177a;
    }
}
