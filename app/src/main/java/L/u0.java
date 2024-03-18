package L;

import B.Z1;
import B0.C0194k;
import B0.EnumC0195l;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5161h;

/* loaded from: classes2.dex */
public final class u0 extends AbstractC5161h implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public B0.u f10308Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f10309h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f10310i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ x0 f10311j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(x0 x0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f10311j0 = x0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        u0 u0Var = new u0(this.f10311j0, abstractC4825e);
        u0Var.f10310i0 = obj;
        return u0Var;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((u0) create((B0.N) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0050 -> B:17:0x0053). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        B0.N n10;
        B0.u uVar;
        int size;
        int i10;
        B0.N n11;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i11 = this.f10309h0;
        x0 x0Var = this.f10311j0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    uVar = this.f10308Z;
                    n10 = (B0.N) this.f10310i0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    List list = ((C0194k) obj).f1652a;
                    size = list.size();
                    i10 = 0;
                    while (i10 < size) {
                        B0.u uVar2 = (B0.u) list.get(i10);
                        if (B0.t.a(uVar2.f1670a, uVar.f1670a) && uVar2.f1673d) {
                            this.f10310i0 = n10;
                            this.f10308Z = uVar;
                            this.f10309h0 = 2;
                            obj = n10.c(EnumC0195l.f1657Z, this);
                            if (obj == enumC5000a) {
                                return enumC5000a;
                            }
                            List list2 = ((C0194k) obj).f1652a;
                            size = list2.size();
                            i10 = 0;
                            while (i10 < size) {
                            }
                        } else {
                            i10++;
                        }
                    }
                    x0Var.e();
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n11 = (B0.N) this.f10310i0;
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            n11 = (B0.N) this.f10310i0;
            this.f10310i0 = n11;
            this.f10309h0 = 1;
            obj = Z1.c(n11, this, 2);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        B0.u uVar3 = (B0.u) obj;
        long j6 = uVar3.f1672c;
        x0Var.f();
        n10 = n11;
        uVar = uVar3;
        this.f10310i0 = n10;
        this.f10308Z = uVar;
        this.f10309h0 = 2;
        obj = n10.c(EnumC0195l.f1657Z, this);
        if (obj == enumC5000a) {
        }
        List list22 = ((C0194k) obj).f1652a;
        size = list22.size();
        i10 = 0;
        while (i10 < size) {
        }
        x0Var.e();
        return jf.y.f36177a;
    }
}
