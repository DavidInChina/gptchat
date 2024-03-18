package j0;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5161h;

/* renamed from: j0.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3897m extends AbstractC5161h implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public int[] f35903Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f35904h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f35905i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f35906j0;

    /* renamed from: k0  reason: collision with root package name */
    public /* synthetic */ Object f35907k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ n f35908l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3897m(n nVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f35908l0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C3897m c3897m = new C3897m(this.f35908l0, abstractC4825e);
        c3897m.f35907k0 = obj;
        return c3897m;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3897m) create((Kg.l) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0099 -> B:27:0x009a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00cc -> B:38:0x00cd). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i10;
        Kg.l lVar;
        Kg.l lVar2;
        Kg.l lVar3;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i14 = this.f35906j0;
        n nVar = this.f35908l0;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        int i15 = this.f35904h0;
                        lVar = (Kg.l) this.f35907k0;
                        N.B0(obj);
                        i10 = i15;
                        i10++;
                        if (i10 < 64) {
                            if ((nVar.f35910Y & (1 << i10)) != 0) {
                                Integer num = new Integer(i10 + 64 + nVar.f35912h0);
                                this.f35907k0 = lVar;
                                this.f35903Z = null;
                                this.f35904h0 = i10;
                                this.f35906j0 = 3;
                                lVar.c(num, this);
                                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                                return enumC5000a;
                            }
                            i10++;
                            if (i10 < 64) {
                            }
                        }
                        return jf.y.f36177a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.f35904h0;
                lVar3 = (Kg.l) this.f35907k0;
                N.B0(obj);
                char c10 = 2;
                i11++;
                if (i11 < 64) {
                    if ((nVar.f35911Z & (1 << i11)) != 0) {
                        Integer num2 = new Integer(nVar.f35912h0 + i11);
                        this.f35907k0 = lVar3;
                        this.f35903Z = null;
                        this.f35904h0 = i11;
                        this.f35906j0 = 2;
                        lVar3.c(num2, this);
                        EnumC5000a enumC5000a3 = EnumC5000a.f41328Y;
                        return enumC5000a;
                    }
                    c10 = 2;
                    i11++;
                    if (i11 < 64) {
                    }
                } else {
                    lVar2 = lVar3;
                    if (nVar.f35910Y != 0) {
                        lVar = lVar2;
                        i10 = 0;
                        if (i10 < 64) {
                        }
                    }
                    return jf.y.f36177a;
                }
            } else {
                i13 = this.f35905i0;
                int i16 = this.f35904h0;
                iArr = this.f35903Z;
                lVar2 = (Kg.l) this.f35907k0;
                N.B0(obj);
                i12 = i16 + 1;
            }
        } else {
            N.B0(obj);
            lVar2 = (Kg.l) this.f35907k0;
            iArr = nVar.f35913i0;
            if (iArr != null) {
                i13 = iArr.length;
                i12 = 0;
            }
            if (nVar.f35911Z != 0) {
                lVar3 = lVar2;
                i11 = 0;
                if (i11 < 64) {
                }
            }
            if (nVar.f35910Y != 0) {
            }
            return jf.y.f36177a;
        }
        if (i12 < i13) {
            Integer num3 = new Integer(iArr[i12]);
            this.f35907k0 = lVar2;
            this.f35903Z = iArr;
            this.f35904h0 = i12;
            this.f35905i0 = i13;
            this.f35906j0 = 1;
            lVar2.c(num3, this);
            return enumC5000a;
        }
        if (nVar.f35911Z != 0) {
        }
        if (nVar.f35910Y != 0) {
        }
        return jf.y.f36177a;
    }
}
