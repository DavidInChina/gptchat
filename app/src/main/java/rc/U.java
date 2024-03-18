package rc;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class U extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Object f44822Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f44823Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ V f44824h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ xd.g f44825i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(V v10, xd.g gVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f44824h0 = v10;
        this.f44825i0 = gVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new U(this.f44824h0, this.f44825i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[RETURN] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        zd.n nVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f44823Z;
        xd.g gVar = this.f44825i0;
        V v10 = this.f44824h0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return jf.y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.f44822Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    String str2 = ((zd.g) obj).f51970f;
                    if (str != null && str2 == null) {
                        this.f44822Y = null;
                        this.f44823Z = 4;
                        if (((C5451O) gVar).f(str, this) == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    return jf.y.f36177a;
                }
                nVar = (zd.n) this.f44822Y;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                str = nVar.f51983b;
                Ia.j jVar = ((C5451O) gVar).f44814c;
                this.f44822Y = str;
                this.f44823Z = 3;
                obj = L4.a.m0(jVar, this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
                String str22 = ((zd.g) obj).f51970f;
                if (str != null) {
                    this.f44822Y = null;
                    this.f44823Z = 4;
                    if (((C5451O) gVar).f(str, this) == enumC5000a) {
                    }
                }
                return jf.y.f36177a;
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f44823Z = 1;
            obj = L4.a.m0(v10.f44961e, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        nVar = (zd.n) obj;
        if (nVar.f51989h) {
            T t10 = T.f44821Y;
            this.f44822Y = nVar;
            this.f44823Z = 2;
            if (v10.b(t10, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        str = nVar.f51983b;
        Ia.j jVar2 = ((C5451O) gVar).f44814c;
        this.f44822Y = str;
        this.f44823Z = 3;
        obj = L4.a.m0(jVar2, this);
        if (obj == enumC5000a) {
        }
        String str222 = ((zd.g) obj).f51970f;
        if (str != null) {
        }
        return jf.y.f36177a;
    }
}
