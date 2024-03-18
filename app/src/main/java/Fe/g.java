package Fe;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import java.util.List;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class g extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public byte[] f5318Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f5319Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f5320h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.io.x f5321i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.io.u f5322j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.io.u f5323k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(io.ktor.utils.io.x xVar, io.ktor.utils.io.u uVar, io.ktor.utils.io.u uVar2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f5321i0 = xVar;
        this.f5322j0 = uVar;
        this.f5323k0 = uVar2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        g gVar = new g(this.f5321i0, this.f5322j0, this.f5323k0, abstractC4825e);
        gVar.f5320h0 = obj;
        return gVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:13:0x002f, B:15:0x0042, B:17:0x004b, B:21:0x005f, B:24:0x0090, B:28:0x00a5), top: B:38:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090 A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:13:0x002f, B:15:0x0042, B:17:0x004b, B:21:0x005f, B:24:0x0090, B:28:0x00a5), top: B:38:0x000d }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, byte[]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008d -> B:8:0x001c). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        F f6;
        byte[] bArr;
        List G02;
        F f10;
        byte[] bArr2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        Object obj2 = this.f5319Z;
        io.ktor.utils.io.x xVar = this.f5321i0;
        io.ktor.utils.io.u uVar = this.f5323k0;
        io.ktor.utils.io.u uVar2 = this.f5322j0;
        try {
        } catch (Throwable th2) {
            try {
                ((io.ktor.utils.io.t) xVar).h(th2);
                ((io.ktor.utils.io.t) uVar2).h(th2);
                ((io.ktor.utils.io.t) uVar).h(th2);
                Oe.b.f13740a.E0(obj2);
            } catch (Throwable th3) {
                Oe.b.f13740a.E0(obj2);
                P4.a.y(uVar2);
                P4.a.y(uVar);
                throw th3;
            }
        }
        if (obj2 != 0) {
            if (obj2 != 1) {
                if (obj2 == 2) {
                    byte[] bArr3 = this.f5318Y;
                    f6 = (F) this.f5320h0;
                    N.B0(obj);
                    bArr2 = bArr3;
                    f10 = f6;
                    obj2 = bArr2;
                    if (((io.ktor.utils.io.t) xVar).r()) {
                        this.f5320h0 = f10;
                        this.f5318Y = obj2;
                        this.f5319Z = 1;
                        Object y10 = ((io.ktor.utils.io.t) xVar).y(obj2, 0, obj2.length, this);
                        if (y10 == enumC5000a) {
                            return enumC5000a;
                        }
                        f6 = f10;
                        obj = y10;
                        bArr = obj2;
                        int intValue = ((Number) obj).intValue();
                        G02 = AbstractC4344b.G0(Ad.l.L(f6, null, new e(uVar2, bArr, intValue, null), 3), Ad.l.L(f6, null, new f(uVar, bArr, intValue, null), 3));
                        this.f5320h0 = f6;
                        this.f5318Y = bArr;
                        this.f5319Z = 2;
                        bArr2 = bArr;
                        if (L4.a.W(G02, this) == enumC5000a) {
                            return enumC5000a;
                        }
                        f10 = f6;
                        obj2 = bArr2;
                        if (((io.ktor.utils.io.t) xVar).r()) {
                            Throwable q10 = ((io.ktor.utils.io.t) xVar).q();
                            if (q10 == null) {
                                Oe.b.f13740a.E0(obj2);
                                P4.a.y(uVar2);
                                P4.a.y(uVar);
                                return jf.y.f36177a;
                            }
                            throw q10;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                byte[] bArr4 = this.f5318Y;
                f6 = (F) this.f5320h0;
                N.B0(obj);
                bArr = bArr4;
                int intValue2 = ((Number) obj).intValue();
                G02 = AbstractC4344b.G0(Ad.l.L(f6, null, new e(uVar2, bArr, intValue2, null), 3), Ad.l.L(f6, null, new f(uVar, bArr, intValue2, null), 3));
                this.f5320h0 = f6;
                this.f5318Y = bArr;
                this.f5319Z = 2;
                bArr2 = bArr;
                if (L4.a.W(G02, this) == enumC5000a) {
                }
                f10 = f6;
                obj2 = bArr2;
                if (((io.ktor.utils.io.t) xVar).r()) {
                }
            }
        } else {
            N.B0(obj);
            f10 = (F) this.f5320h0;
            obj2 = (byte[]) Oe.b.f13740a.C();
            if (((io.ktor.utils.io.t) xVar).r()) {
            }
        }
    }
}
