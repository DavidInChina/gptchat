package F;

import N.Y;
import Z.l1;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import q0.C5251c;
import s3.C5562l;
import wf.AbstractC6216a;
import z.C6720r;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f4951Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l1 f4952Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(l1 l1Var, int i10) {
        super(0);
        this.f4951Y = i10;
        this.f4952Z = l1Var;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        long j6;
        long j10;
        int i10 = this.f4951Y;
        l1 l1Var = this.f4952Z;
        switch (i10) {
            case 0:
                return new C0535i((wf.k) l1Var.getValue());
            case 1:
                return (G.F) ((AbstractC6216a) l1Var.getValue()).mo122invoke();
            case 2:
                Boolean bool = (Boolean) l1Var.getValue();
                bool.getClass();
                return bool;
            case 3:
                switch (i10) {
                    case 3:
                        j6 = ((C5251c) l1Var.getValue()).f43623a;
                        break;
                    default:
                        C6720r c6720r = Y.f12269a;
                        j6 = ((C5251c) l1Var.getValue()).f43623a;
                        break;
                }
                return new C5251c(j6);
            case 4:
                switch (i10) {
                    case 3:
                        j10 = ((C5251c) l1Var.getValue()).f43623a;
                        break;
                    default:
                        C6720r c6720r2 = Y.f12269a;
                        j10 = ((C5251c) l1Var.getValue()).f43623a;
                        break;
                }
                return new C5251c(j10);
            case 5:
                ArrayList arrayList = new ArrayList();
                for (Object obj : (List) l1Var.getValue()) {
                    if (AbstractC3557B.K(((C5562l) obj).f45306Z.f45215Y, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            default:
                return (mh.w) l1Var.getValue();
        }
    }
}
