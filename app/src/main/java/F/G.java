package F;

import B.AbstractC0130h1;
import E0.g0;
import G.C0549d;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class G extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ J f4863Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f4864Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f4865h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(J j6, int i10, int i11, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f4863Y = j6;
        this.f4864Z = i10;
        this.f4865h0 = i11;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new G(this.f4863Y, this.f4864Z, this.f4865h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((G) create((AbstractC0130h1) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        J j6 = this.f4863Y;
        C c10 = j6.f4873c;
        c10.a(this.f4864Z, this.f4865h0);
        c10.f4852d = null;
        C0538l c0538l = j6.f4887q;
        c0538l.f4933a.clear();
        c0538l.f4934b = C0549d.f5492b;
        c0538l.f4935c = -1;
        g0 g0Var = j6.f4884n;
        if (g0Var != null) {
            ((androidx.compose.ui.node.a) g0Var).k();
        }
        return jf.y.f36177a;
    }
}
