package c4;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import d4.AbstractC2597f;
import d4.AbstractC2599h;
import d4.C2593b;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* renamed from: c4.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2286a extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f26236Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC2599h f26237Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC2597f f26238h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2286a(AbstractC2599h abstractC2599h, AbstractC2597f abstractC2597f, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f26237Z = abstractC2599h;
        this.f26238h0 = abstractC2597f;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C2286a(this.f26237Z, this.f26238h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2286a) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f26236Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f26236Y = 1;
            if (((C2593b) this.f26237Z.b(this.f26238h0)).f27989b.invoke(this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
