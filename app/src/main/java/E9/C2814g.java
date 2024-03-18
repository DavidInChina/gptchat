package e9;

import Df.H;
import Qg.AbstractC1206i;
import Qg.AbstractC1207j;
import Qg.j0;
import com.openai.experiment.ExperimentKey;
import jf.y;
import na.L0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import rb.C5436z;
import wd.EnumC6206t;
import wf.o;
import y.F;

/* renamed from: e9.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2814g implements AbstractC1206i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f29061Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f29062Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f29063h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f29064i0;

    public /* synthetic */ C2814g(Object obj, Object obj2, Object obj3, int i10) {
        this.f29061Y = i10;
        this.f29062Z = obj;
        this.f29063h0 = obj2;
        this.f29064i0 = obj3;
    }

    @Override // Qg.AbstractC1206i
    public final Object b(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        y yVar = y.f36177a;
        int i10 = this.f29061Y;
        Object obj = this.f29064i0;
        Object obj2 = this.f29063h0;
        Object obj3 = this.f29062Z;
        switch (i10) {
            case 0:
                AbstractC1206i[] abstractC1206iArr = (AbstractC1206i[]) obj3;
                Object u10 = H.u(abstractC4825e, new Q3.g(abstractC1206iArr, 1), new C2813f(null, (C2815h) obj2, (EnumC6206t) obj), abstractC1207j, abstractC1206iArr);
                if (u10 == EnumC5000a.f41328Y) {
                    return u10;
                }
                return yVar;
            case 1:
                Object b10 = ((AbstractC1206i) obj3).b(new F(abstractC1207j, (C5436z) obj2, (wf.k) obj, 3), abstractC4825e);
                if (b10 == EnumC5000a.f41328Y) {
                    return b10;
                }
                return yVar;
            case 2:
                Object b11 = ((AbstractC1206i) obj3).b(new F(abstractC1207j, (xc.e) obj2, (ExperimentKey.BooleanKey) obj, 4), abstractC4825e);
                if (b11 == EnumC5000a.f41328Y) {
                    return b11;
                }
                return yVar;
            case 3:
                Object b12 = ((AbstractC1206i) obj3).b(new F(abstractC1207j, (String) obj2, (String) obj, 5), abstractC4825e);
                if (b12 == EnumC5000a.f41328Y) {
                    return b12;
                }
                return yVar;
            default:
                Object u11 = H.u(abstractC4825e, j0.f14864Y, new L0((o) obj, (AbstractC4825e) null, 11), abstractC1207j, new AbstractC1206i[]{(AbstractC1206i) obj3, (AbstractC1206i) obj2});
                if (u11 == EnumC5000a.f41328Y) {
                    return u11;
                }
                return yVar;
        }
    }
}
