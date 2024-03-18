package H;

import B.Z1;
import B0.C0194k;
import B0.EnumC0195l;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5161h;
import q0.C5251c;

/* renamed from: H.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0655d extends AbstractC5161h implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public B0.u f6612Z;

    /* renamed from: h0  reason: collision with root package name */
    public B0.u f6613h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f6614i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f6615j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ F f6616k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0655d(F f6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f6616k0 = f6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0655d c0655d = new C0655d(this.f6616k0, abstractC4825e);
        c0655d.f6615j0 = obj;
        return c0655d;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0655d) create((B0.N) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0063 -> B:18:0x0066). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        B0.N n10;
        B0.u uVar;
        B0.u uVar2;
        B0.N n11;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f6614i0;
        EnumC0195l enumC0195l = EnumC0195l.f1656Y;
        F f6 = this.f6616k0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    uVar2 = this.f6613h0;
                    uVar = this.f6612Z;
                    n10 = (B0.N) this.f6615j0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    C0194k c0194k = (C0194k) obj;
                    List list = c0194k.f1652a;
                    int size = list.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            if (!r9.y.X((B0.u) list.get(i11))) {
                                break;
                            }
                            i11++;
                        } else {
                            uVar2 = (B0.u) c0194k.f1652a.get(0);
                            break;
                        }
                    }
                    if (uVar2 == null) {
                        this.f6615j0 = n10;
                        this.f6612Z = uVar;
                        this.f6613h0 = uVar2;
                        this.f6614i0 = 2;
                        obj = n10.c(enumC0195l, this);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        C0194k c0194k2 = (C0194k) obj;
                        List list2 = c0194k2.f1652a;
                        int size2 = list2.size();
                        int i112 = 0;
                        while (true) {
                            if (i112 < size2) {
                            }
                            i112++;
                        }
                        if (uVar2 == null) {
                            long g10 = C5251c.g(uVar2.f1672c, uVar.f1672c);
                            f6.getClass();
                            f6.f6546a.setValue(new C5251c(g10));
                            return jf.y.f36177a;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n11 = (B0.N) this.f6615j0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            n11 = (B0.N) this.f6615j0;
            this.f6615j0 = n11;
            this.f6614i0 = 1;
            obj = Z1.b(n11, false, enumC0195l, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        long j6 = C5251c.f43619b;
        f6.getClass();
        f6.f6546a.setValue(new C5251c(j6));
        n10 = n11;
        uVar2 = null;
        uVar = (B0.u) obj;
        if (uVar2 == null) {
        }
    }
}
