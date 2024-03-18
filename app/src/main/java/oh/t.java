package oh;

import A.B0;
import com.google.android.gms.internal.play_billing.N;
import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class t extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public kotlin.jvm.internal.B f41459Y;

    /* renamed from: Z  reason: collision with root package name */
    public kotlin.jvm.internal.B f41460Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f41461h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f41462i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ x f41463j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x xVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41463j0 = xVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        t tVar = new t(this.f41463j0, abstractC4825e);
        tVar.f41462i0 = obj;
        return tVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078 A[Catch: CancellationException -> 0x0037, TryCatch #0 {CancellationException -> 0x0037, blocks: (B:25:0x0072, B:27:0x0078, B:30:0x007e), top: B:35:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[Catch: CancellationException -> 0x0037, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0037, blocks: (B:25:0x0072, B:27:0x0078, B:30:0x007e), top: B:35:0x0072 }] */
    /* JADX WARN: Type inference failed for: r1v11, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0070 -> B:35:0x0072). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0084 -> B:14:0x0037). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ng.F f6;
        kotlin.jvm.internal.B b10;
        Object obj2;
        C5021h c5021h;
        Ng.F f10;
        kotlin.jvm.internal.B b11;
        kotlin.jvm.internal.B b12;
        C5018e c5018e;
        B0 b02;
        s sVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41461h0;
        x xVar = this.f41463j0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    b10 = this.f41459Y;
                    Ng.F f11 = (Ng.F) this.f41462i0;
                    try {
                        N.B0(obj);
                        f6 = f11;
                    } catch (CancellationException unused) {
                        f6 = f11;
                    }
                    obj2 = b10.f37622Y;
                    if (!(obj2 instanceof C5021h)) {
                        c5021h = (C5021h) obj2;
                    } else {
                        c5021h = null;
                    }
                    if (c5021h != null) {
                        xVar.f41480y0.mo122invoke();
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.jvm.internal.B b13 = this.f41460Z;
                b11 = this.f41459Y;
                f10 = (Ng.F) this.f41462i0;
                N.B0(obj);
                b12 = b13;
                b12.f37622Y = obj;
                try {
                } catch (CancellationException unused2) {
                    f6 = f10;
                }
                c5018e = xVar.f41481z0;
                b02 = B0.f15Z;
                sVar = new s(b11, xVar, null);
                this.f41462i0 = f10;
                this.f41459Y = b11;
                this.f41460Z = null;
                this.f41461h0 = 2;
                if (c5018e.a(b02, sVar, this) != enumC5000a) {
                    return enumC5000a;
                }
                b10 = b11;
                f6 = f10;
                obj2 = b10.f37622Y;
                if (!(obj2 instanceof C5021h)) {
                }
                if (c5021h != null) {
                }
            }
        } else {
            N.B0(obj);
            f6 = (Ng.F) this.f41462i0;
        }
        if (Ad.l.F0(f6)) {
            ?? obj3 = new Object();
            Pg.k kVar = xVar.f41474B0;
            this.f41462i0 = f6;
            this.f41459Y = obj3;
            this.f41460Z = obj3;
            this.f41461h0 = 1;
            Object g10 = kVar.g(this);
            if (g10 == enumC5000a) {
                return enumC5000a;
            }
            f10 = f6;
            obj = g10;
            b11 = obj3;
            b12 = obj3;
            b12.f37622Y = obj;
            c5018e = xVar.f41481z0;
            b02 = B0.f15Z;
            sVar = new s(b11, xVar, null);
            this.f41462i0 = f10;
            this.f41459Y = b11;
            this.f41460Z = null;
            this.f41461h0 = 2;
            if (c5018e.a(b02, sVar, this) != enumC5000a) {
            }
        } else {
            return jf.y.f36177a;
        }
    }
}
