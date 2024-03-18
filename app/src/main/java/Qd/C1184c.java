package Qd;

import com.google.android.gms.internal.play_billing.N;
import com.segment.analytics.kotlin.core.Settings;
import eh.AbstractC2904d;
import eh.C2903c;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Qd.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1184c extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Li.q f14590Y;

    /* renamed from: Z  reason: collision with root package name */
    public i f14591Z;

    /* renamed from: h0  reason: collision with root package name */
    public Li.q f14592h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f14593i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ i f14594j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1184c(i iVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f14594j0 = iVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1184c(this.f14594j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1184c) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:2|(1:(1:(1:(1:(3:8|38|39)(2:9|10))(7:11|32|(1:34)|35|(1:37)|38|39))(9:12|29|(1:31)|32|(0)|35|(0)|38|39))(1:13))(2:14|(1:16)(1:17))|18|40|19|(1:21)|22|23|25|(1:27)(9:28|29|(0)|32|(0)|35|(0)|38|39)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
        r10 = r12.f14630k;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd A[RETURN] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Li.q qVar;
        i iVar;
        A h10;
        Li.q qVar2;
        i iVar2;
        Li.q qVar3;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f14593i0;
        i iVar3 = this.f14594j0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            N.B0(obj);
                            return jf.y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    N.B0(obj);
                    if (iVar3.f14610Y.f14631l) {
                        iVar3.f(new Sd.e());
                    }
                    this.f14590Y = null;
                    this.f14593i0 = 4;
                    if (P4.a.w(iVar3, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    return jf.y.f36177a;
                }
                iVar = this.f14591Z;
                qVar = this.f14590Y;
                N.B0(obj);
                h10 = iVar.h();
                this.f14590Y = qVar;
                this.f14591Z = null;
                this.f14593i0 = 3;
                if (h10.a(this) == enumC5000a) {
                    return enumC5000a;
                }
                if (iVar3.f14610Y.f14631l) {
                }
                this.f14590Y = null;
                this.f14593i0 = 4;
                if (P4.a.w(iVar3, this) == enumC5000a) {
                }
                return jf.y.f36177a;
            }
            qVar3 = this.f14592h0;
            iVar2 = this.f14591Z;
            qVar2 = this.f14590Y;
            N.B0(obj);
        } else {
            N.B0(obj);
            qVar3 = iVar3.f14611Z.e();
            H h11 = iVar3.f14614j0;
            this.f14590Y = qVar3;
            this.f14591Z = iVar3;
            this.f14592h0 = qVar3;
            this.f14593i0 = 1;
            if (qVar3.d(h11, this) == enumC5000a) {
                return enumC5000a;
            }
            qVar2 = qVar3;
            iVar2 = iVar3;
        }
        com.segment.analytics.kotlin.core.d dVar = E.Companion;
        k kVar = iVar2.f14610Y;
        A h12 = iVar2.h();
        dVar.getClass();
        AbstractC3557B.c0("configuration", kVar);
        AbstractC3557B.c0("storage", h12);
        C2903c c2903c = AbstractC2904d.f29415d;
        KSerializer serializer = Settings.Companion.serializer();
        String b10 = h12.b(4);
        if (b10 == null) {
            b10 = "";
        }
        Settings settings = (Settings) c2903c.b(serializer, b10);
        E e10 = new E(kVar, settings, false, kf.x.f37485Y, true);
        this.f14590Y = qVar2;
        this.f14591Z = iVar2;
        this.f14592h0 = null;
        this.f14593i0 = 2;
        if (qVar3.d(e10, this) == enumC5000a) {
            return enumC5000a;
        }
        iVar = iVar2;
        qVar = qVar2;
        h10 = iVar.h();
        this.f14590Y = qVar;
        this.f14591Z = null;
        this.f14593i0 = 3;
        if (h10.a(this) == enumC5000a) {
        }
        if (iVar3.f14610Y.f14631l) {
        }
        this.f14590Y = null;
        this.f14593i0 = 4;
        if (P4.a.w(iVar3, this) == enumC5000a) {
        }
        return jf.y.f36177a;
    }
}
