package Od;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class o extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ u f13713Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Activity f13714Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Bundle f13715h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(u uVar, Activity activity, Bundle bundle, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f13713Y = uVar;
        this.f13714Z = activity;
        this.f13715h0 = bundle;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new o(this.f13713Y, this.f13714Z, this.f13715h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        ((o) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f13713Y.f().g(new j(this.f13714Z, this.f13715h0, 1));
        return y.f36177a;
    }
}
