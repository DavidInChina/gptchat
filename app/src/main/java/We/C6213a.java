package we;

import Oe.g;
import com.google.android.gms.internal.play_billing.N;
import io.ktor.utils.io.B;
import io.ktor.utils.io.t;
import io.ktor.utils.io.u;
import io.ktor.utils.io.x;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;
import wf.o;

/* renamed from: we.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6213a extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public Object f48482Y;

    /* renamed from: Z  reason: collision with root package name */
    public x f48483Z;

    /* renamed from: h0  reason: collision with root package name */
    public o f48484h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f48485i0;

    /* renamed from: j0  reason: collision with root package name */
    public byte[] f48486j0;

    /* renamed from: k0  reason: collision with root package name */
    public long f48487k0;

    /* renamed from: l0  reason: collision with root package name */
    public long f48488l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f48489m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f48490n0;

    /* renamed from: o0  reason: collision with root package name */
    public /* synthetic */ Object f48491o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ Long f48492p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ x f48493q0;

    /* renamed from: r0  reason: collision with root package name */
    public final /* synthetic */ o f48494r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6213a(Long l10, x xVar, o oVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f48492p0 = l10;
        this.f48493q0 = xVar;
        this.f48494r0 = oVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C6213a c6213a = new C6213a(this.f48492p0, this.f48493q0, this.f48494r0, abstractC4825e);
        c6213a.f48491o0 = obj;
        return c6213a;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6213a) create((B) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:9:0x001b, B:37:0x00cc, B:39:0x00d4, B:43:0x00f4, B:55:0x0162, B:59:0x0175), top: B:66:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0162 A[Catch: all -> 0x0020, TRY_ENTER, TryCatch #0 {all -> 0x0020, blocks: (B:9:0x001b, B:37:0x00cc, B:39:0x00d4, B:43:0x00f4, B:55:0x0162, B:59:0x0175), top: B:66:0x000a }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x014f -> B:52:0x015a). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g gVar;
        Throwable th2;
        Object obj2;
        x xVar;
        B b10;
        o oVar;
        byte[] bArr;
        long j6;
        long j10;
        x xVar2;
        Object obj3;
        long j11;
        g gVar2;
        byte[] bArr2;
        long j12;
        int i10;
        long j13;
        Long l10;
        Long l11;
        x xVar3;
        o oVar2;
        Object obj4;
        int intValue;
        u uVar;
        t tVar;
        long j14;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        Object obj5 = this.f48490n0;
        int i11 = 1;
        try {
            if (obj5 != 0) {
                if (obj5 != 1) {
                    if (obj5 != 2) {
                        if (obj5 != 3) {
                            if (obj5 == 4) {
                                obj2 = this.f48482Y;
                                gVar = (g) this.f48491o0;
                                N.B0(obj);
                                gVar.E0(obj2);
                                return y.f36177a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        long j15 = this.f48488l0;
                        long j16 = this.f48487k0;
                        byte[] bArr3 = this.f48486j0;
                        Object obj6 = this.f48485i0;
                        o oVar3 = this.f48484h0;
                        xVar = this.f48483Z;
                        g gVar3 = (g) this.f48482Y;
                        B b11 = (B) this.f48491o0;
                        try {
                            N.B0(obj);
                            bArr = bArr3;
                            obj2 = obj6;
                            b10 = b11;
                            gVar = gVar3;
                            j10 = j16;
                            oVar = oVar3;
                            j6 = j15;
                            xVar2 = xVar;
                            i11 = 1;
                            tVar = (t) xVar2;
                            if (!tVar.r()) {
                                this.f48491o0 = b10;
                                this.f48482Y = gVar;
                                this.f48483Z = tVar;
                                this.f48484h0 = oVar;
                                this.f48485i0 = obj2;
                                this.f48486j0 = bArr;
                                this.f48487k0 = j10;
                                this.f48488l0 = j6;
                                this.f48490n0 = i11;
                                obj4 = tVar.y(bArr, 0, bArr.length, this);
                                if (obj4 == enumC5000a) {
                                    return enumC5000a;
                                }
                                o oVar4 = oVar;
                                xVar3 = tVar;
                                oVar2 = oVar4;
                                intValue = ((Number) obj4).intValue();
                                uVar = b10.f33365Y;
                                this.f48491o0 = b10;
                                this.f48482Y = gVar;
                                this.f48483Z = xVar3;
                                this.f48484h0 = oVar2;
                                this.f48485i0 = obj2;
                                this.f48486j0 = bArr;
                                this.f48487k0 = j10;
                                this.f48488l0 = j6;
                                this.f48489m0 = intValue;
                                this.f48490n0 = 2;
                                if (((t) uVar).Y(bArr, intValue, this) != enumC5000a) {
                                    return enumC5000a;
                                }
                                try {
                                    xVar = xVar3;
                                    oVar = oVar2;
                                    byte[] bArr4 = bArr;
                                    obj3 = obj2;
                                    i10 = intValue;
                                    long j17 = j6;
                                    gVar2 = gVar;
                                    j11 = j10;
                                    j12 = j17;
                                    bArr2 = bArr4;
                                    l10 = new Long(j13);
                                    l11 = new Long(j11);
                                    this.f48491o0 = b10;
                                    this.f48482Y = gVar2;
                                    this.f48483Z = xVar;
                                    this.f48484h0 = oVar;
                                    this.f48485i0 = obj3;
                                    this.f48486j0 = bArr2;
                                    this.f48487k0 = j11;
                                    this.f48488l0 = j13;
                                    this.f48490n0 = 3;
                                    if (oVar.invoke(l10, l11, this) != enumC5000a) {
                                        return enumC5000a;
                                    }
                                    Object obj7 = obj3;
                                    bArr = bArr2;
                                    j10 = j11;
                                    gVar = gVar2;
                                    j6 = j13;
                                    obj2 = obj7;
                                    xVar2 = xVar;
                                    i11 = 1;
                                    tVar = (t) xVar2;
                                    if (!tVar.r()) {
                                        Throwable q10 = tVar.q();
                                        ((t) b10.f33365Y).j(q10);
                                        if (q10 == null && j6 == 0) {
                                            Long l12 = new Long(j6);
                                            Long l13 = new Long(j10);
                                            this.f48491o0 = gVar;
                                            this.f48482Y = obj2;
                                            this.f48483Z = null;
                                            this.f48484h0 = null;
                                            this.f48485i0 = null;
                                            this.f48486j0 = null;
                                            this.f48490n0 = 4;
                                            if (oVar.invoke(l12, l13, this) == enumC5000a) {
                                                return enumC5000a;
                                            }
                                        }
                                        gVar.E0(obj2);
                                        return y.f36177a;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    gVar = gVar2;
                                    obj5 = obj3;
                                }
                                j13 = j12 + i10;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            gVar = gVar3;
                            obj5 = obj6;
                        }
                    } else {
                        i10 = this.f48489m0;
                        j12 = this.f48488l0;
                        long j18 = this.f48487k0;
                        bArr2 = this.f48486j0;
                        Object obj8 = this.f48485i0;
                        oVar = this.f48484h0;
                        x xVar4 = this.f48483Z;
                        g gVar4 = (g) this.f48482Y;
                        B b12 = (B) this.f48491o0;
                        try {
                            N.B0(obj);
                            gVar2 = gVar4;
                            b10 = b12;
                            xVar = xVar4;
                            j11 = j18;
                            obj3 = obj8;
                            j13 = j12 + i10;
                            l10 = new Long(j13);
                            l11 = new Long(j11);
                            this.f48491o0 = b10;
                            this.f48482Y = gVar2;
                            this.f48483Z = xVar;
                            this.f48484h0 = oVar;
                            this.f48485i0 = obj3;
                            this.f48486j0 = bArr2;
                            this.f48487k0 = j11;
                            this.f48488l0 = j13;
                            this.f48490n0 = 3;
                            if (oVar.invoke(l10, l11, this) != enumC5000a) {
                            }
                        } catch (Throwable th5) {
                            th2 = th5;
                            obj5 = obj8;
                            gVar = gVar4;
                        }
                    }
                } else {
                    long j19 = this.f48488l0;
                    j10 = this.f48487k0;
                    bArr = this.f48486j0;
                    Object obj9 = this.f48485i0;
                    oVar2 = this.f48484h0;
                    xVar3 = this.f48483Z;
                    g gVar5 = (g) this.f48482Y;
                    b10 = (B) this.f48491o0;
                    try {
                        N.B0(obj);
                        obj4 = obj;
                        j6 = j19;
                        obj2 = obj9;
                        gVar = gVar5;
                        intValue = ((Number) obj4).intValue();
                        uVar = b10.f33365Y;
                        this.f48491o0 = b10;
                        this.f48482Y = gVar;
                        this.f48483Z = xVar3;
                        this.f48484h0 = oVar2;
                        this.f48485i0 = obj2;
                        this.f48486j0 = bArr;
                        this.f48487k0 = j10;
                        this.f48488l0 = j6;
                        this.f48489m0 = intValue;
                        this.f48490n0 = 2;
                        if (((t) uVar).Y(bArr, intValue, this) != enumC5000a) {
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        obj5 = obj9;
                        gVar = gVar5;
                    }
                }
            } else {
                N.B0(obj);
                B b13 = (B) this.f48491o0;
                gVar = Oe.b.f13740a;
                Object C10 = gVar.C();
                try {
                    byte[] bArr5 = (byte[]) C10;
                    Long l14 = this.f48492p0;
                    if (l14 != null) {
                        j14 = l14.longValue();
                    } else {
                        j14 = -1;
                    }
                    xVar2 = this.f48493q0;
                    oVar = this.f48494r0;
                    b10 = b13;
                    obj2 = C10;
                    j6 = 0;
                    long j20 = j14;
                    bArr = bArr5;
                    j10 = j20;
                    tVar = (t) xVar2;
                    if (!tVar.r()) {
                    }
                } catch (Throwable th7) {
                    th2 = th7;
                    obj5 = C10;
                }
            }
        } catch (Throwable th8) {
            th2 = th8;
        }
        gVar.E0(obj5);
        throw th2;
    }
}
