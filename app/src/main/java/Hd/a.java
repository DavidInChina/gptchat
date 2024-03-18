package Hd;

import F.J;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import java.util.List;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes.dex */
public final class a extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f7607Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ J f7608Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ List f7609h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(J j6, List list, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f7608Z = j6;
        this.f7609h0 = list;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new a(this.f7608Z, this.f7609h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f7607Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f7607Y = 1;
            if (J.j(this.f7608Z, this.f7609h0.size() - 1, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
