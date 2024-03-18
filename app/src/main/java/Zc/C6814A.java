package zc;

import Cd.C0338x;
import Dd.C0382c;
import Dd.EnumC0401w;
import Z8.Z0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x8.W;

/* renamed from: zc.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6814A extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f51815Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Q f51816Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Cd.y f51817h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6814A(Q q10, Cd.y yVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f51816Z = q10;
        this.f51817h0 = yVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C6814A(this.f51816Z, this.f51817h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C6814A) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (r7 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
        if (r7 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (r7 != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        return r0;
     */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f51815Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            boolean z10 = ((C0338x) this.f51817h0).f3075a;
            this.f51815Y = 1;
            Q q10 = this.f51816Z;
            q10.getClass();
            q10.l(new J.c(11, z10));
            Kd.I i11 = q10.f51860l;
            if (z10) {
                q10.f51870v = true;
                q10.o(Z0.f23316c, kf.w.f37484Y);
                W.F(i11.f9691n, "Manually starting listening intently", null, 6);
                obj2 = i11.f(new Dd.K(EnumC0401w.f3577Z, new C0382c(Dd.H.f3512Z)), this);
                if (obj2 != enumC5000a) {
                    obj2 = yVar;
                }
            } else {
                obj2 = i11.i(this);
            }
        }
        return yVar;
    }
}
