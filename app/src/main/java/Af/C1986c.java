package af;

import Ng.F;
import cf.AbstractC2406e;
import com.google.android.gms.internal.play_billing.N;
import java.util.ArrayList;
import java.util.List;
import jf.y;
import kf.t;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* renamed from: af.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1986c extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public Wg.d f24171Y;

    /* renamed from: Z  reason: collision with root package name */
    public C1988e f24172Z;

    /* renamed from: h0  reason: collision with root package name */
    public AbstractC2406e f24173h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f24174i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C1988e f24175j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC2406e f24176k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1986c(C1988e c1988e, AbstractC2406e abstractC2406e, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f24175j0 = c1988e;
        this.f24176k0 = abstractC2406e;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1986c(this.f24175j0, this.f24176k0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1986c) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Wg.d dVar;
        C1988e c1988e;
        AbstractC2406e abstractC2406e;
        List list;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f24174i0;
        if (i10 != 0) {
            if (i10 == 1) {
                abstractC2406e = this.f24173h0;
                c1988e = this.f24172Z;
                dVar = this.f24171Y;
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            c1988e = this.f24175j0;
            Wg.d dVar2 = c1988e.f24183a;
            this.f24171Y = dVar2;
            this.f24172Z = c1988e;
            AbstractC2406e abstractC2406e2 = this.f24176k0;
            this.f24173h0 = abstractC2406e2;
            this.f24174i0 = 1;
            if (dVar2.e(null, this) == enumC5000a) {
                return enumC5000a;
            }
            dVar = dVar2;
            abstractC2406e = abstractC2406e2;
        }
        try {
            c1988e.f24184b = abstractC2406e;
            if (abstractC2406e != null) {
                ArrayList arrayList = c1988e.f24185c;
                list = t.K2(arrayList);
                arrayList.clear();
            } else {
                list = null;
            }
            return list;
        } finally {
            dVar.g(null);
        }
    }
}
