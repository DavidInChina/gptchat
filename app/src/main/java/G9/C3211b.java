package g9;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nd.AbstractC4815d;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* renamed from: g9.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3211b extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f31310Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4815d f31311Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3211b(AbstractC4815d abstractC4815d, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31311Z = abstractC4815d;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C3211b(this.f31311Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3211b) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f31310Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f31310Y = 1;
            if (this.f31311Z.b(this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
