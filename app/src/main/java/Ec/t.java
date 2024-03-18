package Ec;

import K4.J;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class t extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ a7.h f4643Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a7.h hVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f4643Y = hVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new t(this.f4643Y, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((t) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        jf.y yVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        a7.g gVar = (a7.g) this.f4643Y;
        J j6 = gVar.f23920e;
        jf.y yVar2 = jf.y.f36177a;
        if (j6 != null) {
            j6.K(gVar.f23916a);
            yVar = yVar2;
        } else {
            yVar = null;
        }
        if (yVar != null) {
            return yVar2;
        }
        throw new IllegalStateException("ActivityResultLauncher cannot be null");
    }
}
