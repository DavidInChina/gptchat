package Fd;

import Ng.F;
import Uc.C1422g;
import Uc.EnumC1421f;
import Z.l1;
import android.content.Context;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.List;
import l8.AbstractC4344b;
import m.AbstractActivityC4532l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x8.W;

/* loaded from: classes2.dex */
public final class m extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Context f5251Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4532l f5252Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ l1 f5253h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, AbstractActivityC4532l abstractActivityC4532l, l1 l1Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f5251Y = context;
        this.f5252Z = abstractActivityC4532l;
        this.f5253h0 = l1Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new m(this.f5251Y, this.f5252Z, this.f5253h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        boolean K10 = AbstractC3557B.K((Boolean) this.f5253h0.getValue(), Boolean.TRUE);
        jf.y yVar = jf.y.f36177a;
        if (!K10) {
            return yVar;
        }
        C1422g c1422g = C1422g.f17674i;
        String r12 = C1422g.r1(EnumC1421f.f17668Y);
        List G02 = AbstractC4344b.G0(new Integer(268435456), new Integer(67108864), new Integer(32768));
        Context context = this.f5251Y;
        context.startActivity(W.D(context, r12, G02));
        this.f5252Z.finish();
        return yVar;
    }
}
