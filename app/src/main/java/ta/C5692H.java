package ta;

import e9.C2814g;
import nf.AbstractC4825e;
import oa.C4972C;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: ta.H  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5692H extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f45821Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ T9.a f45822Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5715n f45823h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5692H(T9.a aVar, C5715n c5715n, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f45822Z = aVar;
        this.f45823h0 = c5715n;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C5692H(this.f45822Z, this.f45823h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C5692H) create(bool, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f45821Y;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C2814g c2814g = ((C4972C) this.f45822Z).f41060o;
            this.f45821Y = 1;
            obj = L4.a.m0(c2814g, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        T9.c cVar = (T9.c) obj;
        String str = cVar.f16966a;
        this.f45821Y = 2;
        if (this.f45823h0.d(str, cVar.f16967b, this) == enumC5000a) {
            return enumC5000a;
        }
        return jf.y.f36177a;
    }
}
