package Rg;

import Qg.AbstractC1206i;
import Qg.AbstractC1207j;
import com.google.android.gms.internal.play_billing.N;
import java.util.concurrent.atomic.AtomicInteger;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class u extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Pg.o f15578Y;

    /* renamed from: Z  reason: collision with root package name */
    public byte[] f15579Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f15580h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f15581i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f15582j0;

    /* renamed from: k0  reason: collision with root package name */
    public /* synthetic */ Object f15583k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i[] f15584l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f15585m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ wf.o f15586n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1207j f15587o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(AbstractC4825e abstractC4825e, AbstractC6216a abstractC6216a, wf.o oVar, AbstractC1207j abstractC1207j, AbstractC1206i[] abstractC1206iArr) {
        super(2, abstractC4825e);
        this.f15584l0 = abstractC1206iArr;
        this.f15585m0 = abstractC6216a;
        this.f15586n0 = oVar;
        this.f15587o0 = abstractC1207j;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        u uVar = new u(abstractC4825e, this.f15585m0, this.f15586n0, this.f15587o0, this.f15584l0);
        uVar.f15583k0 = obj;
        return uVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd A[LOOP:1: B:25:0x00bd->B:31:0x00da, LOOP_START, PHI: r9 r12 
      PHI: (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:23:0x00ba, B:31:0x00da] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r12v2 kf.y) = (r12v1 kf.y), (r12v13 kf.y) binds: [B:23:0x00ba, B:31:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00dc -> B:19:0x009f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00fc -> B:19:0x009f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0115 -> B:41:0x0118). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Pg.o oVar;
        Object[] objArr;
        int i10;
        byte b10;
        byte[] bArr;
        Object obj2;
        kf.y yVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i11 = this.f15582j0;
        Q1.u uVar = AbstractC1282c.f15531c;
        jf.y yVar2 = jf.y.f36177a;
        byte b11 = 1;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        ?? r22 = this.f15581i0;
                        i10 = this.f15580h0;
                        byte[] bArr2 = this.f15579Z;
                        oVar = this.f15578Y;
                        N.B0(obj);
                        b10 = r22;
                        bArr = bArr2;
                        objArr = (Object[]) this.f15583k0;
                        b11 = 1;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ?? r23 = this.f15581i0;
                    i10 = this.f15580h0;
                    byte[] bArr3 = this.f15579Z;
                    oVar = this.f15578Y;
                    N.B0(obj);
                    b10 = r23;
                    bArr = bArr3;
                    objArr = (Object[]) this.f15583k0;
                }
            } else {
                ?? r24 = this.f15581i0;
                i10 = this.f15580h0;
                byte[] bArr4 = this.f15579Z;
                oVar = this.f15578Y;
                N.B0(obj);
                obj2 = ((Pg.s) obj).f14247a;
                b10 = r24;
                bArr = bArr4;
                objArr = (Object[]) this.f15583k0;
                yVar = (kf.y) Pg.s.b(obj2);
                if (yVar != null) {
                    return yVar2;
                }
                do {
                    int i12 = yVar.f37486a;
                    Object obj3 = objArr[i12];
                    objArr[i12] = yVar.f37487b;
                    if (obj3 == uVar) {
                        i10--;
                    }
                    if (bArr[i12] == b10) {
                        break;
                    }
                    bArr[i12] = b10;
                    yVar = (kf.y) Pg.s.b(oVar.e());
                } while (yVar != null);
                if (i10 == 0) {
                    Object[] objArr2 = (Object[]) this.f15585m0.mo122invoke();
                    AbstractC1207j abstractC1207j = this.f15587o0;
                    wf.o oVar2 = this.f15586n0;
                    if (objArr2 == null) {
                        this.f15583k0 = objArr;
                        this.f15578Y = oVar;
                        this.f15579Z = bArr;
                        this.f15580h0 = i10;
                        this.f15581i0 = b10;
                        this.f15582j0 = 2;
                        if (oVar2.invoke(abstractC1207j, objArr, this) == enumC5000a) {
                            return enumC5000a;
                        }
                    } else {
                        kf.q.a3(objArr, objArr2, 0, 0, 14);
                        this.f15583k0 = objArr;
                        this.f15578Y = oVar;
                        this.f15579Z = bArr;
                        this.f15580h0 = i10;
                        this.f15581i0 = b10;
                        this.f15582j0 = 3;
                        if (oVar2.invoke(abstractC1207j, objArr2, this) == enumC5000a) {
                            return enumC5000a;
                        }
                        b11 = 1;
                    }
                }
            }
        } else {
            N.B0(obj);
            Ng.F f6 = (Ng.F) this.f15583k0;
            i10 = this.f15584l0.length;
            if (i10 == 0) {
                return yVar2;
            }
            objArr = new Object[i10];
            kf.q.d3(0, i10, uVar, objArr);
            oVar = Bi.c.d(i10, null, 6);
            AtomicInteger atomicInteger = new AtomicInteger(i10);
            int i13 = 0;
            while (i13 < i10) {
                int i14 = i13;
                AtomicInteger atomicInteger2 = atomicInteger;
                Ad.l.O0(f6, null, null, new t(this.f15584l0, i14, atomicInteger2, oVar, null), 3);
                i13 = i14 + 1;
                atomicInteger = atomicInteger2;
            }
            bArr = new byte[i10];
            b10 = 0;
        }
        b10 = (byte) (b10 + b11);
        this.f15583k0 = objArr;
        this.f15578Y = oVar;
        this.f15579Z = bArr;
        this.f15580h0 = i10;
        this.f15581i0 = b10;
        this.f15582j0 = b11;
        obj2 = oVar.f(this);
        if (obj2 == enumC5000a) {
            return enumC5000a;
        }
        yVar = (kf.y) Pg.s.b(obj2);
        if (yVar != null) {
        }
    }
}
