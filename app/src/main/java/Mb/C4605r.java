package mb;

import com.google.android.gms.internal.play_billing.N;
import java.util.Map;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: mb.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4605r extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39090Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4607t f39091Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4605r(C4607t c4607t, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39091Z = c4607t;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4605r(this.f39091Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4605r) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39090Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Ng.L l10 = this.f39091Z.f39103e;
            this.f39090Y = 1;
            obj = l10.z(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        Map map = (Map) obj;
        if (map == null) {
            return null;
        }
        v2.o oVar = new v2.o();
        V.s sVar = oVar.f47118a;
        synchronized (sVar) {
            sVar.f17971b = null;
            sVar.f17970a.clear();
            sVar.f17970a.putAll(map);
        }
        return oVar;
    }
}
