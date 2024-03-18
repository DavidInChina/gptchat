package z;

import Pg.C1171d;
import Z.l1;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: z.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6702i extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public C1171d f51274Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f51275Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f51276h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Pg.o f51277i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C6694e f51278j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ l1 f51279k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ l1 f51280l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6702i(Pg.o oVar, C6694e c6694e, l1 l1Var, l1 l1Var2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51277i0 = oVar;
        this.f51278j0 = c6694e;
        this.f51279k0 = l1Var;
        this.f51280l0 = l1Var2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C6702i c6702i = new C6702i(this.f51277i0, this.f51278j0, this.f51279k0, this.f51280l0, abstractC4825e);
        c6702i.f51276h0 = obj;
        return c6702i;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6702i) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ng.F f6;
        C1171d c1171d;
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f51275Z;
        Pg.o oVar = this.f51277i0;
        if (i10 != 0) {
            if (i10 == 1) {
                c1171d = this.f51274Y;
                f6 = (Ng.F) this.f51276h0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                if (((Boolean) obj).booleanValue()) {
                    Object b10 = c1171d.b();
                    Object b11 = Pg.s.b(oVar.e());
                    if (b11 == null) {
                        obj2 = b10;
                    } else {
                        obj2 = b11;
                    }
                    Ad.l.O0(f6, null, null, new C6700h(obj2, this.f51278j0, this.f51279k0, this.f51280l0, null), 3);
                    this.f51276h0 = f6;
                    this.f51274Y = c1171d;
                    this.f51275Z = 1;
                    obj = c1171d.a(this);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return jf.y.f36177a;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            c1171d = oVar.iterator();
            f6 = (Ng.F) this.f51276h0;
            this.f51276h0 = f6;
            this.f51274Y = c1171d;
            this.f51275Z = 1;
            obj = c1171d.a(this);
            if (obj == enumC5000a) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }
}
