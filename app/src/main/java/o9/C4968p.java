package o9;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: o9.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4968p extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f41029Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4969q f41030Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4968p(C4969q c4969q, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41030Z = c4969q;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4968p(this.f41030Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4968p) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41029Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            wf.k kVar = this.f41030Z.f41033c;
            this.f41029Y = 1;
            obj = kVar.invoke(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
