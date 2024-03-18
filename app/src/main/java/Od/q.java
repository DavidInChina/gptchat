package Od;

import android.app.Activity;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class q extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ u f13718Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Activity f13719Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u uVar, Activity activity, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f13718Y = uVar;
        this.f13719Z = activity;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new q(this.f13718Y, this.f13719Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        ((q) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f13718Y.f().g(new w6.d(this.f13719Z, 5));
        return y.f36177a;
    }
}
