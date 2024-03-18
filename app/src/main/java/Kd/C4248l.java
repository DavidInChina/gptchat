package kd;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: kd.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4248l extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f37327Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ boolean f37328Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4255s f37329h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4248l(C4255s c4255s, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37329h0 = c4255s;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4248l c4248l = new C4248l(this.f37329h0, abstractC4825e);
        c4248l.f37328Z = ((Boolean) obj).booleanValue();
        return c4248l;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C4248l) create(bool, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37327Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            if (this.f37328Z) {
                this.f37327Y = 1;
                if (C4255s.d(this.f37329h0, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return jf.y.f36177a;
    }
}
