package Od;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class k extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ u f13704Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Activity f13705Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Bundle f13706h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(u uVar, Activity activity, Bundle bundle, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f13704Y = uVar;
        this.f13705Z = activity;
        this.f13706h0 = bundle;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new k(this.f13704Y, this.f13705Z, this.f13706h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        ((k) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f13704Y.f().g(new j(this.f13705Z, this.f13706h0, 0));
        return y.f36177a;
    }
}
