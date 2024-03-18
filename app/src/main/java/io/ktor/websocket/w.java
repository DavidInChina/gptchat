package io.ktor.websocket;

import Df.H;
import K4.J;
import Ng.F;
import Pg.D;
import com.google.android.gms.internal.play_billing.N;
import java.util.TimeZone;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q1.AbstractC5260f;

/* loaded from: classes.dex */
public final class w extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Af.d f33686Y;

    /* renamed from: Z  reason: collision with root package name */
    public byte[] f33687Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f33688h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f33689i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ long f33690j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ wf.n f33691k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Pg.o f33692l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ D f33693m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j6, long j10, wf.n nVar, Pg.o oVar, D d10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f33689i0 = j6;
        this.f33690j0 = j10;
        this.f33691k0 = nVar;
        this.f33692l0 = oVar;
        this.f33693m0 = d10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new w(this.f33689i0, this.f33690j0, this.f33691k0, this.f33692l0, this.f33693m0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad A[Catch: v | w | CancellationException -> 0x00ce, TRY_LEAVE, TryCatch #0 {v | w | CancellationException -> 0x00ce, blocks: (B:7:0x0016, B:11:0x0027, B:13:0x0030, B:15:0x0065, B:19:0x0078, B:22:0x00a9, B:24:0x00ad), top: B:31:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARN: Type inference failed for: r11v10, types: [Af.d] */
    /* JADX WARN: Type inference failed for: r11v9, types: [Af.d] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a6 -> B:22:0x00a9). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Af.e eVar;
        byte[] bArr;
        Af.e eVar2;
        Af.e eVar3;
        u uVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f33688h0;
        Pg.o oVar = this.f33692l0;
        long j6 = this.f33690j0;
        long j10 = this.f33689i0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        N.B0(obj);
                        return jf.y.f36177a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bArr = this.f33687Z;
                ?? r11 = this.f33686Y;
                N.B0(obj);
                eVar = r11;
                if (((jf.y) obj) == null) {
                    k.f33661a.c("WebSocket pinger has timed out");
                    wf.n nVar = this.f33691k0;
                    b bVar = new b(EnumC3606a.INTERNAL_ERROR, "Ping timeout");
                    this.f33686Y = null;
                    this.f33687Z = null;
                    this.f33688h0 = 3;
                    if (nVar.invoke(bVar, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    return jf.y.f36177a;
                }
                eVar2 = eVar;
                uVar = new u(oVar, null);
                this.f33686Y = eVar2;
                this.f33687Z = bArr;
                this.f33688h0 = 1;
                if (J.k0(j10, uVar, this) != enumC5000a) {
                    return enumC5000a;
                }
                eVar3 = eVar2;
                eVar3.b(bArr);
                v vVar = new v(this.f33693m0, "[ping " + H.X(bArr) + " ping]", oVar, null);
                this.f33686Y = eVar3;
                this.f33687Z = bArr;
                this.f33688h0 = 2;
                obj = J.k0(j6, vVar, this);
                eVar = eVar3;
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
                if (((jf.y) obj) == null) {
                }
            } else {
                bArr = this.f33687Z;
                ?? r112 = this.f33686Y;
                N.B0(obj);
                eVar3 = r112;
                eVar3.b(bArr);
                v vVar2 = new v(this.f33693m0, "[ping " + H.X(bArr) + " ping]", oVar, null);
                this.f33686Y = eVar3;
                this.f33687Z = bArr;
                this.f33688h0 = 2;
                obj = J.k0(j6, vVar2, this);
                eVar = eVar3;
                if (obj == enumC5000a) {
                }
                if (((jf.y) obj) == null) {
                }
            }
        } else {
            N.B0(obj);
            Ei.a aVar = k.f33661a;
            aVar.c("Starting WebSocket pinger coroutine with period " + j10 + " ms and timeout " + j6 + " ms");
            TimeZone timeZone = He.a.f7667a;
            eVar2 = AbstractC5260f.d(System.currentTimeMillis());
            bArr = new byte[32];
            uVar = new u(oVar, null);
            this.f33686Y = eVar2;
            this.f33687Z = bArr;
            this.f33688h0 = 1;
            if (J.k0(j10, uVar, this) != enumC5000a) {
            }
        }
    }
}
