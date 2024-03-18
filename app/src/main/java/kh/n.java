package kh;

import Ng.F;
import Ng.Q;
import Z.AbstractC1710f0;
import Z.l1;
import android.content.Context;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.io.IOException;
import lh.v;
import lh.x;
import lh.y;
import lh.z;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class n extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC1710f0 f37562Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f37563Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Context f37564h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ l f37565i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f37566j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ y f37567k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ c f37568l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ l1 f37569m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, l lVar, AbstractC1710f0 abstractC1710f0, y yVar, c cVar, l1 l1Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37564h0 = context;
        this.f37565i0 = lVar;
        this.f37566j0 = abstractC1710f0;
        this.f37567k0 = yVar;
        this.f37568l0 = cVar;
        this.f37569m0 = l1Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new n(this.f37564h0, this.f37565i0, this.f37566j0, this.f37567k0, this.f37568l0, this.f37569m0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        AbstractC1710f0 abstractC1710f0;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37563Z;
        Context context = this.f37564h0;
        l lVar = this.f37565i0;
        try {
        } catch (IOException unused) {
            ((g) ((i) this.f37569m0.getValue())).getClass();
            AbstractC3557B.c0("imageSource", lVar);
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    abstractC1710f0 = this.f37562Y;
                    N.B0(obj);
                    abstractC1710f0.setValue(obj);
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
        } else {
            N.B0(obj);
            this.f37563Z = 1;
            obj = Ad.l.n1(this, Q.f12904a, new v(context, null, lVar));
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        AbstractC1710f0 abstractC1710f02 = this.f37566j0;
        y yVar = this.f37567k0;
        z zVar = new z(context, lVar, this.f37568l0, (x) obj);
        this.f37562Y = abstractC1710f02;
        this.f37563Z = 2;
        obj = yVar.a(zVar, this);
        if (obj == enumC5000a) {
            return enumC5000a;
        }
        abstractC1710f0 = abstractC1710f02;
        abstractC1710f0.setValue(obj);
        return jf.y.f36177a;
    }
}
