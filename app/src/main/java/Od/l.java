package Od;

import android.app.Activity;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class l extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ u f13707Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Activity f13708Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(u uVar, Activity activity, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f13707Y = uVar;
        this.f13708Z = activity;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new l(this.f13707Y, this.f13708Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        ((l) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f13707Y.f().g(new w6.d(this.f13708Z, 1));
        return y.f36177a;
    }
}
