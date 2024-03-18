package Dd;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.C5451O;

/* loaded from: classes.dex */
public final class T extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Ed.i f3535Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f3536Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ W f3537h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(W w10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f3537h0 = w10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new T(this.f3537h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[RETURN] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ed.i iVar;
        zd.q qVar;
        Ed.i iVar2;
        Object e10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f3536Z;
        jf.y yVar = jf.y.f36177a;
        W w10 = this.f3537h0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar = this.f3535Y;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                qVar = ((zd.g) obj).f51969e;
                if (qVar == null) {
                    Ed.i.Companion.getClass();
                    iVar2 = Ed.h.c(qVar);
                } else {
                    iVar2 = null;
                }
                if (iVar != null && iVar2 == null) {
                    this.f3535Y = null;
                    this.f3536Z = 3;
                    w10.getClass();
                    e10 = ((C5451O) w10.f3549c).e(iVar.f4682Y, this);
                    if (e10 != enumC5000a) {
                        e10 = yVar;
                    }
                    if (e10 != enumC5000a) {
                        return enumC5000a;
                    }
                }
                return yVar;
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Ia.j jVar = w10.f3547a.f44961e;
            this.f3536Z = 1;
            obj = L4.a.m0(jVar, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        iVar = ((C0388i) obj).f3562a;
        Ia.j jVar2 = ((C5451O) w10.f3549c).f44814c;
        this.f3535Y = iVar;
        this.f3536Z = 2;
        obj = L4.a.m0(jVar2, this);
        if (obj == enumC5000a) {
            return enumC5000a;
        }
        qVar = ((zd.g) obj).f51969e;
        if (qVar == null) {
        }
        if (iVar != null) {
            this.f3535Y = null;
            this.f3536Z = 3;
            w10.getClass();
            e10 = ((C5451O) w10.f3549c).e(iVar.f4682Y, this);
            if (e10 != enumC5000a) {
            }
            if (e10 != enumC5000a) {
            }
        }
        return yVar;
    }
}
