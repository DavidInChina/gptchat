package lb;

import android.content.Intent;
import com.google.android.gms.internal.play_billing.N;
import gb.V;
import gb.k0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class y extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ k0 f38071Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ K f38072Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(k0 k0Var, K k10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f38071Y = k0Var;
        this.f38072Z = k10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new y(this.f38071Y, this.f38072Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        ((y) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        String str = ((V) this.f38071Y).f31377a.f24021a.f32019c;
        if (str != null) {
            Intent intent = new Intent();
            A7.b.G0(intent, str);
            this.f38072Z.f(new gb.H(intent));
        }
        return jf.y.f36177a;
    }
}
