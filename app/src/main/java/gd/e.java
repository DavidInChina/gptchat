package Gd;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes.dex */
public final class e extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f6283Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ g f6284Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f6284Z = gVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new e(this.f6284Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f6283Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f6283Y = 1;
            if (g.a(this.f6284Z, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
