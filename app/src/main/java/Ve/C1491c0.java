package Ve;

import A.C0045u;
import Sg.C1394f;
import android.os.SystemClock;
import cf.AbstractC2406e;
import cf.AbstractC2408g;
import cf.C2404c;
import cf.C2405d;
import com.statsig.androidsdk.StatsigLoggerKt;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jh.C4027i3;
import jh.E3;
import jh.H3;
import jh.I1;
import jh.M3;
import jh.S2;
import jh.U1;
import livekit.LivekitModels$ParticipantTracks;
import livekit.LivekitModels$TrackInfo;
import livekit.LivekitRtc$DataChannelInfo;
import livekit.LivekitRtc$ReconnectResponse;
import livekit.LivekitRtc$SessionDescription;
import livekit.LivekitRtc$SignalRequest;
import livekit.LivekitRtc$SyncState;
import livekit.LivekitRtc$TrackPublishedResponse;
import livekit.LivekitRtc$UpdateSubscription;
import livekit.org.webrtc.DataChannel;
import livekit.org.webrtc.PeerConnection;
import nf.AbstractC4825e;
import nf.C4832l;
import of.EnumC5000a;
import pf.AbstractC5163j;
import ud.C5902a;
import yf.AbstractC6583a;
import z.AbstractC6708l;

/* renamed from: Ve.c0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1491c0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Pe.c f18735Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f18736Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f18737h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f18738i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f18739j0;

    /* renamed from: k0  reason: collision with root package name */
    public long f18740k0;

    /* renamed from: l0  reason: collision with root package name */
    public long f18741l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f18742m0;

    /* renamed from: n0  reason: collision with root package name */
    public /* synthetic */ Object f18743n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ C1503i0 f18744o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ boolean f18745p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ String f18746q0;

    /* renamed from: r0  reason: collision with root package name */
    public final /* synthetic */ String f18747r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1491c0(C1503i0 c1503i0, boolean z10, String str, String str2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18744o0 = c1503i0;
        this.f18745p0 = z10;
        this.f18746q0 = str;
        this.f18747r0 = str2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C1491c0 c1491c0 = new C1491c0(this.f18744o0, this.f18745p0, this.f18746q0, this.f18747r0, abstractC4825e);
        c1491c0.f18743n0 = obj;
        return c1491c0;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1491c0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:71|(1:75)|(1:86)(4:77|(2:79|(1:81)(2:83|84))|82|85)|87|88|363|89|375|90|(2:369|92)|94|(1:96)|97|98|99|367|100|(1:102)(4:103|104|212|(7:214|(1:218)|219|41|356|(1:358)|359)(2:220|(3:222|223|(3:246|248|(7:250|(1:254)|219|41|356|(0)|359)(3:255|256|(3:281|282|(5:289|(4:291|(4:293|(4:295|(1:297)|298|(2:300|(1:303)))|301|(0))|305|(5:307|(1:309)(1:310)|311|(2:313|(1:315)(1:316))(4:317|(4:320|(5:323|(1:325)(1:326)|(5:403|328|(1:333)(1:330)|334|406)(1:405)|404|321)|402|318)|401|335)|(1:337)(1:408))(2:338|339))|304|340|(5:342|41|356|(0)|359)(4:343|344|355|(0)))(7:284|(1:288)|219|41|356|(0)|359))(2:258|(7:260|(1:262)|263|(3:265|266|(5:270|(1:274)|275|282|(0)(0))(2:276|(1:278)(4:279|280|256|(0)(0))))|267|266|(0)(0))(4:268|267|266|(0)(0)))))(2:225|(6:227|(1:229)|230|(2:232|(5:236|(1:240)|241|248|(0)(0))(5:242|(1:244)|245|223|(0)(0)))|233|(0)(0))(3:234|233|(0)(0))))(3:247|248|(0)(0))))) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:114|(1:116)|117|(1:121)|122|(1:124)|365|125|(1:127)(15:128|377|129|(5:371|131|(2:133|(1:135)(1:136))|138|(2:140|(1:142)(1:143)))|144|145|(1:149)|150|(3:(1:153)(1:154)|155|(23:157|(7:160|(5:163|(1:165)(1:166)|(4:382|168|(1:173)(1:170)|(3:384|175|388)(1:387))(1:386)|385|161)|383|176|(2:178|380)(1:381)|179|158)|379|180|(2:183|181)|389|184|(5:187|(1:189)(1:190)|(3:390|192|394)(1:393)|392|185)|391|193|(4:196|(3:396|198|399)(1:398)|397|194)|395|199|(2:202|200)|400|203|(1:205)|206|208|(1:210)|211|212|(0)(0)))|207|208|(0)|211|212|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02bd, code lost:
        r1 = r9;
        r2 = r12;
        r5 = r14;
        r12 = r15;
        r4 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02c4, code lost:
        r17 = r10;
        r10 = 4;
        r1 = r9;
        r2 = r12;
        r5 = r14;
        r12 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02ce, code lost:
        r19 = r4;
        r17 = r10;
        r10 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x08bd, code lost:
        r3 = r17;
        r5 = r20;
        r0 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0206, code lost:
        if (r28.f18745p0 == false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0357 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0217  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x02ec -> B:355:0x08e6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:245:0x06bb -> B:223:0x0645). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:280:0x077e -> B:256:0x06f6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:290:0x07b3 -> B:304:0x07ec). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:296:0x07d4 -> B:298:0x07d7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:301:0x07e4 -> B:302:0x07e7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:354:0x08e2 -> B:344:0x08a0). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC1486a enumC1486a;
        jf.y yVar;
        String str;
        Ng.F f6;
        Pe.c cVar;
        int i10;
        int i11;
        int i12;
        int i13;
        long j6;
        int i14;
        Object obj2;
        String str2;
        EnumC1486a enumC1486a2;
        int i15;
        Ng.F f10;
        int i16;
        jf.y yVar2;
        long j10;
        AbstractC2406e abstractC2406e;
        int i17;
        F f11;
        int i18;
        long j11;
        int i19;
        int i20;
        int i21;
        int i22;
        Ng.F f12;
        int i23;
        boolean z10;
        LivekitRtc$TrackPublishedResponse livekitRtc$TrackPublishedResponse;
        Xe.r rVar;
        boolean z11;
        int i24;
        int i25;
        int i26;
        Ng.F f13;
        int i27;
        Ng.F f14;
        long j12;
        int i28;
        int i29;
        F f15;
        boolean z12;
        jf.y yVar3;
        Object obj3;
        Xe.r rVar2;
        jf.y yVar4;
        int i30;
        Ng.F f16;
        jf.y yVar5;
        Ng.F f17;
        int i31;
        boolean z13;
        Object obj4;
        Ng.F f18;
        int i32;
        long j13;
        int i33;
        long j14;
        EnumC1486a enumC1486a3;
        long j15;
        int i34;
        int i35;
        boolean z14;
        Object obj5;
        int i36;
        long j16;
        int i37;
        long j17;
        long j18;
        int i38;
        boolean z15;
        Object obj6;
        String str3;
        int i39;
        long j19;
        int i40;
        int f19;
        int i41;
        Pe.c cVar2;
        F f20;
        int i42;
        int i43;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i44 = this.f18742m0;
        EnumC1486a enumC1486a4 = EnumC1486a.f18719Z;
        jf.y yVar6 = jf.y.f36177a;
        String str4 = "<this>";
        C1503i0 c1503i0 = this.f18744o0;
        int i45 = 10;
        switch (i44) {
            case 0:
                com.google.android.gms.internal.play_billing.N.B0(obj);
                j12 = SystemClock.elapsedRealtime();
                f14 = (Ng.F) this.f18743n0;
                i27 = 0;
                i28 = 0;
                i13 = 0;
                if (i27 < i45) {
                    Ad.l.h0(f14);
                    if (i27 != 0) {
                        this.f18743n0 = f14;
                        this.f18735Y = null;
                        this.f18736Z = i28;
                        this.f18737h0 = i13;
                        this.f18740k0 = j12;
                        this.f18738i0 = i27;
                        this.f18742m0 = 1;
                        if (L4.a.a1(this) == enumC5000a) {
                            return enumC5000a;
                        }
                        int i46 = i13;
                        i42 = i28;
                        i43 = i46;
                        int i47 = i42;
                        i13 = i43;
                        i28 = i47;
                    }
                    if (!c1503i0.f18797w) {
                        AbstractC2408g.Companion.getClass();
                        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                            Mi.a.e(new Object[0]);
                        }
                    } else {
                        long j20 = i27;
                        yVar = yVar6;
                        enumC1486a = enumC1486a4;
                        long j21 = (j20 * j20 * 500) + 100;
                        if (j21 > 5000) {
                            j21 = 5000;
                        }
                        AbstractC2408g.Companion.getClass();
                        if (AbstractC6708l.b(2, 7) >= 0 && Mi.a.d() > 0) {
                            Mi.a.c(new Object[0]);
                        }
                        this.f18743n0 = f14;
                        this.f18735Y = null;
                        this.f18736Z = i28;
                        this.f18737h0 = i13;
                        this.f18740k0 = j12;
                        this.f18738i0 = i27;
                        i40 = 2;
                        this.f18742m0 = 2;
                        if (R4.b.p0(j21, this) == enumC5000a) {
                            return enumC5000a;
                        }
                        i15 = i27;
                        j10 = j12;
                        i16 = i28;
                        f10 = f14;
                        f19 = AbstractC6708l.f(c1503i0.f18800z);
                        if (f19 != 0) {
                            if (f19 != 1) {
                                if (f19 != i40) {
                                    throw new RuntimeException();
                                }
                                i41 = 1;
                            }
                            i41 = 0;
                        } else {
                            if (i15 == 0) {
                                break;
                            }
                            i41 = 1;
                        }
                        cVar2 = c1503i0.f18785k;
                        if (cVar2 == null) {
                            cVar2 = new Pe.c();
                        }
                        Pe.c cVar3 = cVar2;
                        E0 e02 = c1503i0.f18775a;
                        if (i41 == 0) {
                            AbstractC2408g.Companion.getClass();
                            if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                                Mi.a.e(new Object[0]);
                            }
                            if (i13 == 0) {
                                F f21 = c1503i0.f18778d;
                                if (f21 != null) {
                                    r0 r0Var = (r0) f21;
                                    r0Var.o(k0.f18809i0);
                                    Te.w wVar = new Te.w(r0Var);
                                    C1394f c1394f = r0Var.f18872k;
                                    if (c1394f != null) {
                                        r0Var.f18873l.a(wVar, c1394f);
                                    } else {
                                        AbstractC3557B.C2("coroutineScope");
                                        throw null;
                                    }
                                }
                                i13 = 1;
                            }
                            c1503i0.m(EnumC1486a.f18721i0);
                            ef.e.a(new zc.u(14, c1503i0));
                            E0.g(e02, "Full Reconnecting");
                            F f22 = c1503i0.f18778d;
                            if (f22 != null) {
                                try {
                                } catch (Exception unused) {
                                    i21 = i15;
                                    str3 = str4;
                                    j19 = j10;
                                    i23 = i16;
                                    f12 = f10;
                                    i39 = 4;
                                    AbstractC2408g.Companion.getClass();
                                    if (AbstractC6708l.b(i39, 7) >= 0) {
                                        Mi.a.f(new Object[0]);
                                        break;
                                    }
                                    i24 = i13;
                                    i16 = i23;
                                    yVar2 = yVar;
                                    enumC1486a2 = enumC1486a;
                                    i25 = 1;
                                    i17 = 10;
                                    i26 = i21;
                                    long j22 = j19;
                                    f13 = f12;
                                    j10 = j22;
                                    str2 = str3;
                                    enumC1486a4 = enumC1486a2;
                                    i27 = i26 + i25;
                                    yVar6 = yVar2;
                                    i13 = i24;
                                    f14 = f13;
                                    j12 = j10;
                                    int i48 = i17;
                                    str4 = str2;
                                    i28 = i16;
                                    i45 = i48;
                                    if (i27 < i45) {
                                    }
                                    yVar5 = yVar6;
                                    c1503i0.b("Failed reconnecting");
                                    f20 = c1503i0.f18778d;
                                    if (f20 != null) {
                                    }
                                    return yVar5;
                                }
                                ((r0) f22).l();
                            }
                            String str5 = this.f18746q0;
                            String str6 = this.f18747r0;
                            Pe.e eVar = c1503i0.f18786l;
                            if (eVar == null) {
                                eVar = new Pe.e();
                            }
                            Pe.e eVar2 = eVar;
                            this.f18743n0 = f10;
                            this.f18736Z = i16;
                            this.f18737h0 = i13;
                            this.f18740k0 = j10;
                            this.f18738i0 = i15;
                            this.f18739j0 = i41;
                            this.f18742m0 = 3;
                            str3 = str4;
                            i39 = 4;
                            int i49 = i13;
                            int i50 = i41;
                            if (c1503i0.g(str5, str6, cVar3, eVar2, this) == enumC5000a) {
                                return enumC5000a;
                            }
                            i22 = i50;
                            i21 = i15;
                            j19 = j10;
                            i23 = i16;
                            f12 = f10;
                            i13 = i49;
                            j11 = j19;
                            str2 = str3;
                            Ad.l.h0(f12);
                            if (c1503i0.f18797w) {
                                AbstractC2408g.Companion.getClass();
                                if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                                    Mi.a.e(new Object[0]);
                                }
                                yVar5 = yVar;
                                c1503i0.b("Failed reconnecting");
                                f20 = c1503i0.f18778d;
                                if (f20 != null) {
                                    ((r0) f20).k(1);
                                }
                                return yVar5;
                            }
                            j13 = SystemClock.elapsedRealtime() + 20000;
                            if (c1503i0.f18798x) {
                                i34 = i22;
                                i37 = i23;
                                f18 = f12;
                                i36 = i13;
                                i26 = i21;
                                j18 = j13;
                                j17 = j11;
                                if (SystemClock.elapsedRealtime() < j18) {
                                    C1519y c1519y = c1503i0.f18790p;
                                    if (c1519y != null) {
                                        this.f18743n0 = f18;
                                        this.f18735Y = null;
                                        this.f18736Z = i37;
                                        this.f18737h0 = i36;
                                        this.f18740k0 = j17;
                                        this.f18738i0 = i26;
                                        this.f18739j0 = i34;
                                        this.f18741l0 = j18;
                                        this.f18742m0 = 5;
                                        obj6 = c1519y.d(this);
                                        if (obj6 == enumC5000a) {
                                            return enumC5000a;
                                        }
                                        i38 = 1;
                                        if (((Boolean) obj6).booleanValue()) {
                                            z15 = true;
                                            if (!z15) {
                                                AbstractC2408g.Companion.getClass();
                                                if (AbstractC6708l.b(i38, 7) >= 0 && Mi.a.d() > 0) {
                                                    Mi.a.e(new Object[0]);
                                                }
                                                j11 = j17;
                                                i23 = i37;
                                                j13 = j18;
                                                j15 = 100;
                                                Ad.l.h0(f18);
                                                if (c1503i0.f18797w) {
                                                }
                                            } else {
                                                this.f18743n0 = f18;
                                                this.f18735Y = null;
                                                this.f18736Z = i37;
                                                this.f18737h0 = i36;
                                                this.f18740k0 = j17;
                                                this.f18738i0 = i26;
                                                this.f18739j0 = i34;
                                                this.f18741l0 = j18;
                                                this.f18742m0 = 6;
                                                j16 = j18;
                                                if (R4.b.p0(100L, this) == enumC5000a) {
                                                    return enumC5000a;
                                                }
                                                j18 = j16;
                                                if (SystemClock.elapsedRealtime() < j18) {
                                                }
                                            }
                                        }
                                        z15 = false;
                                        if (!z15) {
                                        }
                                    } else {
                                        i38 = 1;
                                        z15 = false;
                                        if (!z15) {
                                        }
                                    }
                                } else {
                                    long j23 = j18;
                                    j15 = 100;
                                    j11 = j17;
                                    i23 = i37;
                                    j13 = j23;
                                    Ad.l.h0(f18);
                                    if (c1503i0.f18797w) {
                                        AbstractC2408g.Companion.getClass();
                                        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                                            Mi.a.e(new Object[0]);
                                        }
                                        yVar5 = yVar;
                                        c1503i0.b("Failed reconnecting");
                                        f20 = c1503i0.f18778d;
                                        if (f20 != null) {
                                        }
                                        return yVar5;
                                    }
                                    i30 = i23;
                                    i33 = i36;
                                    j10 = j11;
                                    if (SystemClock.elapsedRealtime() < j13) {
                                        C1519y c1519y2 = c1503i0.f18791q;
                                        if (c1519y2 != null) {
                                            this.f18743n0 = f18;
                                            this.f18735Y = null;
                                            this.f18736Z = i30;
                                            this.f18737h0 = i33;
                                            this.f18740k0 = j10;
                                            this.f18738i0 = i26;
                                            this.f18739j0 = i34;
                                            this.f18741l0 = j13;
                                            this.f18742m0 = 7;
                                            obj5 = c1519y2.d(this);
                                            if (obj5 == enumC5000a) {
                                                return enumC5000a;
                                            }
                                            i35 = 1;
                                            if (((Boolean) obj5).booleanValue()) {
                                                z14 = true;
                                                Ng.F f23 = f18;
                                                i24 = i33;
                                                f16 = f23;
                                                if (!z14) {
                                                    AbstractC2408g.Companion.getClass();
                                                    if (AbstractC6708l.b(i35, 7) >= 0 && Mi.a.d() > 0) {
                                                        Mi.a.e(new Object[0]);
                                                    }
                                                    enumC1486a2 = enumC1486a;
                                                    c1503i0.m(enumC1486a2);
                                                    i29 = i34;
                                                    Ad.l.h0(f16);
                                                    if (c1503i0.f18797w) {
                                                    }
                                                } else {
                                                    enumC1486a3 = enumC1486a;
                                                    this.f18743n0 = f16;
                                                    this.f18735Y = null;
                                                    this.f18736Z = i30;
                                                    this.f18737h0 = i24;
                                                    this.f18740k0 = j10;
                                                    this.f18738i0 = i26;
                                                    this.f18739j0 = i34;
                                                    this.f18741l0 = j13;
                                                    this.f18742m0 = 8;
                                                    i32 = i34;
                                                    int i51 = i26;
                                                    j14 = 100;
                                                    if (R4.b.p0(100L, this) == enumC5000a) {
                                                        return enumC5000a;
                                                    }
                                                    i26 = i51;
                                                    f18 = f16;
                                                    i33 = i24;
                                                    enumC1486a = enumC1486a3;
                                                    j15 = j14;
                                                    i34 = i32;
                                                    if (SystemClock.elapsedRealtime() < j13) {
                                                    }
                                                }
                                            }
                                            z14 = false;
                                            Ng.F f232 = f18;
                                            i24 = i33;
                                            f16 = f232;
                                            if (!z14) {
                                            }
                                        } else {
                                            i35 = 1;
                                            z14 = false;
                                            Ng.F f2322 = f18;
                                            i24 = i33;
                                            f16 = f2322;
                                            if (!z14) {
                                            }
                                        }
                                    } else {
                                        i29 = i34;
                                        enumC1486a2 = enumC1486a;
                                        Ng.F f24 = f18;
                                        i24 = i33;
                                        f16 = f24;
                                        Ad.l.h0(f16);
                                        if (c1503i0.f18797w) {
                                            AbstractC2408g.Companion.getClass();
                                            if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                                                Mi.a.e(new Object[0]);
                                            }
                                            yVar5 = yVar;
                                            c1503i0.b("Failed reconnecting");
                                            f20 = c1503i0.f18778d;
                                            if (f20 != null) {
                                            }
                                            return yVar5;
                                        }
                                        if (c1503i0.f() == enumC1486a2) {
                                            if (c1503i0.f18798x) {
                                                C1519y c1519y3 = c1503i0.f18790p;
                                                if (c1519y3 != null) {
                                                    this.f18743n0 = f16;
                                                    this.f18735Y = null;
                                                    this.f18736Z = i30;
                                                    this.f18737h0 = i24;
                                                    this.f18740k0 = j10;
                                                    this.f18738i0 = i26;
                                                    this.f18739j0 = i29;
                                                    this.f18742m0 = 9;
                                                    obj4 = c1519y3.d(this);
                                                    if (obj4 == enumC5000a) {
                                                        return enumC5000a;
                                                    }
                                                    if (((Boolean) obj4).booleanValue()) {
                                                        f17 = f16;
                                                        i31 = i26;
                                                        z13 = true;
                                                        if (!z13) {
                                                            i26 = i31;
                                                            f16 = f17;
                                                        }
                                                    }
                                                }
                                                f17 = f16;
                                                i31 = i26;
                                                z13 = false;
                                                if (!z13) {
                                                }
                                            }
                                            c1503i0.f18775a.v();
                                            f15 = c1503i0.f18778d;
                                            if (f15 == null) {
                                                if (i29 != 0) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                this.f18743n0 = null;
                                                this.f18735Y = null;
                                                this.f18742m0 = 10;
                                                r0 r0Var2 = (r0) f15;
                                                if (z12) {
                                                    obj3 = r0Var2.f18883v.t(this);
                                                    if (obj3 == EnumC5000a.f41328Y) {
                                                        yVar3 = yVar;
                                                    } else {
                                                        obj3 = yVar;
                                                        yVar3 = obj3;
                                                    }
                                                } else {
                                                    for (We.C c10 : kf.t.K2(r0Var2.d().values())) {
                                                        for (Xe.B b10 : kf.t.K2(c10.c().values())) {
                                                            if (b10 instanceof Xe.r) {
                                                                rVar2 = (Xe.r) b10;
                                                            } else {
                                                                rVar2 = null;
                                                            }
                                                            if (rVar2 != null) {
                                                                if (!rVar2.f21924o || rVar2.a() == null) {
                                                                    yVar4 = yVar;
                                                                } else {
                                                                    C0045u c0045u = rVar2.f21925p;
                                                                    AbstractC3557B.c0(str2, c0045u);
                                                                    yVar4 = yVar;
                                                                    c0045u.invoke(yVar4);
                                                                }
                                                                yVar = yVar4;
                                                            }
                                                        }
                                                    }
                                                    yVar3 = yVar;
                                                    obj3 = yVar3;
                                                }
                                                if (obj3 == enumC5000a) {
                                                    return enumC5000a;
                                                }
                                                return yVar3;
                                            }
                                            return yVar;
                                        }
                                        jf.y yVar7 = yVar;
                                        if (SystemClock.elapsedRealtime() - j10 > StatsigLoggerKt.FLUSH_TIMER_MS) {
                                            yVar5 = yVar7;
                                            c1503i0.b("Failed reconnecting");
                                            f20 = c1503i0.f18778d;
                                            if (f20 != null) {
                                            }
                                            return yVar5;
                                        }
                                        f13 = f16;
                                        yVar2 = yVar7;
                                        i16 = i30;
                                        i17 = 10;
                                        i25 = 1;
                                        enumC1486a4 = enumC1486a2;
                                        i27 = i26 + i25;
                                        yVar6 = yVar2;
                                        i13 = i24;
                                        f14 = f13;
                                        j12 = j10;
                                        int i482 = i17;
                                        str4 = str2;
                                        i28 = i16;
                                        i45 = i482;
                                        if (i27 < i45) {
                                        }
                                    }
                                }
                            } else {
                                int i52 = i22;
                                j15 = 100;
                                f18 = f12;
                                i36 = i13;
                                i26 = i21;
                                i34 = i52;
                                Ad.l.h0(f18);
                                if (c1503i0.f18797w) {
                                }
                            }
                        } else {
                            i11 = i41;
                            str = str4;
                            i10 = 4;
                            if (i16 == 0) {
                                i16 = 1;
                            }
                            c1503i0.m(EnumC1486a.f18722j0);
                            AbstractC2408g.Companion.getClass();
                            if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                                Mi.a.e(new Object[0]);
                            }
                            C1519y c1519y4 = c1503i0.f18791q;
                            if (c1519y4 != null) {
                                c1519y4.f18923e = true;
                            }
                            String str7 = this.f18746q0;
                            String str8 = this.f18747r0;
                            String str9 = c1503i0.f18787m;
                            this.f18743n0 = f10;
                            this.f18735Y = cVar3;
                            this.f18736Z = i16;
                            this.f18737h0 = i13;
                            this.f18740k0 = j10;
                            this.f18738i0 = i15;
                            this.f18739j0 = i11;
                            this.f18742m0 = 4;
                            obj2 = e02.p(str7, str8, str9, this);
                            if (obj2 == enumC5000a) {
                                return enumC5000a;
                            }
                            i14 = i15;
                            i12 = i16;
                            long j24 = j10;
                            cVar = cVar3;
                            j6 = j24;
                            f6 = f10;
                            try {
                            } catch (Exception unused2) {
                                str2 = str;
                                enumC1486a2 = enumC1486a;
                                i15 = i14;
                                f10 = f6;
                                i16 = i12;
                                yVar2 = yVar;
                                j10 = j6;
                                i17 = 10;
                                AbstractC2408g.Companion.getClass();
                                if (AbstractC6708l.b(4, 7) < 0) {
                                }
                                f13 = f10;
                                i24 = i13;
                                i26 = i15;
                                i25 = 1;
                                enumC1486a4 = enumC1486a2;
                                i27 = i26 + i25;
                                yVar6 = yVar2;
                                i13 = i24;
                                f14 = f13;
                                j12 = j10;
                                int i4822 = i17;
                                str4 = str2;
                                i28 = i16;
                                i45 = i4822;
                                if (i27 < i45) {
                                }
                                yVar5 = yVar6;
                                c1503i0.b("Failed reconnecting");
                                f20 = c1503i0.f18778d;
                                if (f20 != null) {
                                }
                                return yVar5;
                            }
                            abstractC2406e = (AbstractC2406e) obj2;
                            if (abstractC2406e instanceof C2404c) {
                                try {
                                } catch (Exception unused3) {
                                    i15 = i14;
                                    i16 = i12;
                                    f10 = f6;
                                    yVar2 = yVar;
                                    enumC1486a2 = enumC1486a;
                                    i17 = 10;
                                    j10 = j6;
                                    str2 = str;
                                    AbstractC2408g.Companion.getClass();
                                    if (AbstractC6708l.b(4, 7) < 0) {
                                    }
                                    f13 = f10;
                                    i24 = i13;
                                    i26 = i15;
                                    i25 = 1;
                                    enumC1486a4 = enumC1486a2;
                                    i27 = i26 + i25;
                                    yVar6 = yVar2;
                                    i13 = i24;
                                    f14 = f13;
                                    j12 = j10;
                                    int i48222 = i17;
                                    str4 = str2;
                                    i28 = i16;
                                    i45 = i48222;
                                    if (i27 < i45) {
                                    }
                                    yVar5 = yVar6;
                                    c1503i0.b("Failed reconnecting");
                                    f20 = c1503i0.f18778d;
                                    if (f20 != null) {
                                    }
                                    return yVar5;
                                }
                                C2405d c2405d = new C2405d((LivekitRtc$ReconnectResponse) ((C2404c) abstractC2406e).f26611a);
                                D d10 = C1503i0.Companion;
                                c1503i0.getClass();
                                PeerConnection.RTCConfiguration h10 = C1503i0.h(c2405d, cVar);
                                C1519y c1519y5 = c1503i0.f18791q;
                                if (c1519y5 != null) {
                                    C1517w c1517w = new C1517w(c1519y5, h10);
                                    if (!c1519y5.f18926h.get()) {
                                        ef.e.a(new C5902a(c1519y5, i10, c1517w));
                                    }
                                }
                                C1519y c1519y6 = c1503i0.f18790p;
                                if (c1519y6 != null) {
                                    C1517w c1517w2 = new C1517w(c1519y6, h10);
                                    if (!c1519y6.f18926h.get()) {
                                        ef.e.a(new C5902a(c1519y6, i10, c1517w2));
                                    }
                                }
                            }
                            c1503i0.f18775a.o();
                            AbstractC2408g.Companion.getClass();
                            if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                                Mi.a.e(new Object[0]);
                            }
                            f11 = c1503i0.f18778d;
                            if (f11 != null) {
                                if (i11 == 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                r0 r0Var3 = (r0) f11;
                                if (z10) {
                                    boolean z16 = r0Var3.f18860A.f13953a;
                                    ArrayList arrayList = new ArrayList();
                                    for (We.C c11 : r0Var3.d().values()) {
                                        U1 newBuilder = LivekitModels$ParticipantTracks.newBuilder();
                                        int i53 = i14;
                                        String str10 = c11.f21059a;
                                        newBuilder.d();
                                        long j25 = j6;
                                        ((LivekitModels$ParticipantTracks) newBuilder.f27507Z).setParticipantSid(str10);
                                        for (Xe.B b11 : c11.c().values()) {
                                            if (b11 instanceof Xe.r) {
                                                rVar = (Xe.r) b11;
                                            } else {
                                                rVar = null;
                                            }
                                            if (rVar != null) {
                                                if (!rVar.f21924o || rVar.a() == null) {
                                                    z11 = false;
                                                } else {
                                                    z11 = true;
                                                }
                                                if (z11 != z16) {
                                                    String str11 = rVar.f21844c;
                                                    newBuilder.d();
                                                    ((LivekitModels$ParticipantTracks) newBuilder.f27507Z).addTrackSids(str11);
                                                }
                                            }
                                        }
                                        if (((LivekitModels$ParticipantTracks) newBuilder.f27507Z).getTrackSidsCount() > 0) {
                                            arrayList.add(newBuilder.b());
                                        }
                                        i14 = i53;
                                        j6 = j25;
                                    }
                                    i18 = i14;
                                    j11 = j6;
                                    ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(((LivekitModels$ParticipantTracks) it.next()).getTrackSidsList());
                                    }
                                    ArrayList I12 = AbstractC6583a.I1(arrayList2);
                                    M3 newBuilder2 = LivekitRtc$UpdateSubscription.newBuilder();
                                    newBuilder2.d();
                                    ((LivekitRtc$UpdateSubscription) newBuilder2.f27507Z).setSubscribe(!z16);
                                    newBuilder2.d();
                                    ((LivekitRtc$UpdateSubscription) newBuilder2.f27507Z).addAllParticipantTracks(arrayList);
                                    newBuilder2.d();
                                    ((LivekitRtc$UpdateSubscription) newBuilder2.f27507Z).addAllTrackSids(I12);
                                    LivekitRtc$UpdateSubscription livekitRtc$UpdateSubscription = (LivekitRtc$UpdateSubscription) newBuilder2.b();
                                    List list = We.j.f21029a;
                                    We.i iVar = r0Var3.f18883v;
                                    str2 = str;
                                    AbstractC3557B.c0(str2, iVar);
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Xe.B b12 : iVar.c().values()) {
                                        Xe.z a5 = b12.a();
                                        if (a5 == null) {
                                            livekitRtc$TrackPublishedResponse = null;
                                        } else {
                                            H3 newBuilder3 = LivekitRtc$TrackPublishedResponse.newBuilder();
                                            String id2 = a5.b().id();
                                            newBuilder3.d();
                                            ((LivekitRtc$TrackPublishedResponse) newBuilder3.f27507Z).setCid(id2);
                                            LivekitModels$TrackInfo livekitModels$TrackInfo = b12.f21848g;
                                            newBuilder3.d();
                                            ((LivekitRtc$TrackPublishedResponse) newBuilder3.f27507Z).setTrack(livekitModels$TrackInfo);
                                            livekitRtc$TrackPublishedResponse = (LivekitRtc$TrackPublishedResponse) newBuilder3.b();
                                        }
                                        if (livekitRtc$TrackPublishedResponse != null) {
                                            arrayList3.add(livekitRtc$TrackPublishedResponse);
                                        }
                                    }
                                    C1503i0 c1503i02 = r0Var3.f18863b;
                                    c1503i02.getClass();
                                    LivekitRtc$SessionDescription livekitRtc$SessionDescription = (LivekitRtc$SessionDescription) Ad.l.a1(C4832l.f40334Y, new C1501h0(c1503i02, null));
                                    List<I1> z32 = kf.q.z3(I1.values());
                                    ArrayList arrayList4 = new ArrayList();
                                    for (I1 i110 : z32) {
                                        DataChannel d11 = c1503i02.d(i110);
                                        if (d11 != null) {
                                            arrayList4.add(d11);
                                        }
                                    }
                                    ArrayList arrayList5 = new ArrayList(AbstractC6583a.H1(arrayList4, 10));
                                    Iterator it2 = arrayList4.iterator();
                                    while (it2.hasNext()) {
                                        DataChannel dataChannel = (DataChannel) it2.next();
                                        S2 newBuilder4 = LivekitRtc$DataChannelInfo.newBuilder();
                                        int i54 = i13;
                                        int id3 = dataChannel.id();
                                        newBuilder4.d();
                                        ((LivekitRtc$DataChannelInfo) newBuilder4.f27507Z).setId(id3);
                                        String label = dataChannel.label();
                                        newBuilder4.d();
                                        ((LivekitRtc$DataChannelInfo) newBuilder4.f27507Z).setLabel(label);
                                        arrayList5.add((LivekitRtc$DataChannelInfo) newBuilder4.b());
                                        i13 = i54;
                                        i12 = i12;
                                    }
                                    i20 = i13;
                                    i19 = i12;
                                    E3 newBuilder5 = LivekitRtc$SyncState.newBuilder();
                                    if (livekitRtc$SessionDescription != null) {
                                        newBuilder5.d();
                                        LivekitRtc$SyncState.access$45700((LivekitRtc$SyncState) newBuilder5.f27507Z, livekitRtc$SessionDescription);
                                    }
                                    newBuilder5.d();
                                    LivekitRtc$SyncState.access$46000((LivekitRtc$SyncState) newBuilder5.f27507Z, livekitRtc$UpdateSubscription);
                                    newBuilder5.d();
                                    LivekitRtc$SyncState.access$46600((LivekitRtc$SyncState) newBuilder5.f27507Z, arrayList3);
                                    newBuilder5.d();
                                    LivekitRtc$SyncState.access$47200((LivekitRtc$SyncState) newBuilder5.f27507Z, arrayList5);
                                    E0 e03 = c1503i02.f18775a;
                                    e03.getClass();
                                    C4027i3 newBuilder6 = LivekitRtc$SignalRequest.newBuilder();
                                    newBuilder6.d();
                                    ((LivekitRtc$SignalRequest) newBuilder6.f27507Z).setSyncState((LivekitRtc$SyncState) newBuilder5.b());
                                    e03.s((LivekitRtc$SignalRequest) newBuilder6.b());
                                    if (c1503i0.f18798x) {
                                        c1503i0.i();
                                    }
                                    i21 = i18;
                                    i22 = i11;
                                    f12 = f6;
                                    i13 = i20;
                                    i23 = i19;
                                    Ad.l.h0(f12);
                                    if (c1503i0.f18797w) {
                                    }
                                }
                            }
                            i18 = i14;
                            j11 = j6;
                            i20 = i13;
                            str2 = str;
                            i19 = i12;
                            if (c1503i0.f18798x) {
                            }
                            i21 = i18;
                            i22 = i11;
                            f12 = f6;
                            i13 = i20;
                            i23 = i19;
                            Ad.l.h0(f12);
                            if (c1503i0.f18797w) {
                            }
                        }
                    }
                }
                yVar5 = yVar6;
                c1503i0.b("Failed reconnecting");
                f20 = c1503i0.f18778d;
                if (f20 != null) {
                }
                return yVar5;
            case 1:
                i27 = this.f18738i0;
                j12 = this.f18740k0;
                i43 = this.f18737h0;
                i42 = this.f18736Z;
                f14 = (Ng.F) this.f18743n0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                int i472 = i42;
                i13 = i43;
                i28 = i472;
                if (!c1503i0.f18797w) {
                }
                break;
            case 2:
                int i55 = this.f18738i0;
                long j26 = this.f18740k0;
                int i56 = this.f18737h0;
                int i57 = this.f18736Z;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                j10 = j26;
                i16 = i57;
                f10 = (Ng.F) this.f18743n0;
                enumC1486a = enumC1486a4;
                yVar = yVar6;
                i40 = 2;
                i15 = i55;
                i13 = i56;
                f19 = AbstractC6708l.f(c1503i0.f18800z);
                if (f19 != 0) {
                }
                cVar2 = c1503i0.f18785k;
                if (cVar2 == null) {
                }
                Pe.c cVar32 = cVar2;
                E0 e022 = c1503i0.f18775a;
                if (i41 == 0) {
                }
                break;
            case 3:
                i22 = this.f18739j0;
                i21 = this.f18738i0;
                j19 = this.f18740k0;
                i13 = this.f18737h0;
                i23 = this.f18736Z;
                f12 = (Ng.F) this.f18743n0;
                try {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    enumC1486a = enumC1486a4;
                    yVar = yVar6;
                    str3 = str4;
                } catch (Exception unused4) {
                    enumC1486a = enumC1486a4;
                    yVar = yVar6;
                    str3 = str4;
                    i39 = 4;
                    AbstractC2408g.Companion.getClass();
                    if (AbstractC6708l.b(i39, 7) >= 0) {
                    }
                    i24 = i13;
                    i16 = i23;
                    yVar2 = yVar;
                    enumC1486a2 = enumC1486a;
                    i25 = 1;
                    i17 = 10;
                    i26 = i21;
                    long j222 = j19;
                    f13 = f12;
                    j10 = j222;
                    str2 = str3;
                    enumC1486a4 = enumC1486a2;
                    i27 = i26 + i25;
                    yVar6 = yVar2;
                    i13 = i24;
                    f14 = f13;
                    j12 = j10;
                    int i482222 = i17;
                    str4 = str2;
                    i28 = i16;
                    i45 = i482222;
                    if (i27 < i45) {
                    }
                    yVar5 = yVar6;
                    c1503i0.b("Failed reconnecting");
                    f20 = c1503i0.f18778d;
                    if (f20 != null) {
                    }
                    return yVar5;
                }
                j11 = j19;
                str2 = str3;
                Ad.l.h0(f12);
                if (c1503i0.f18797w) {
                }
                break;
            case 4:
                int i58 = this.f18739j0;
                i14 = this.f18738i0;
                j6 = this.f18740k0;
                i13 = this.f18737h0;
                i12 = this.f18736Z;
                cVar = this.f18735Y;
                f6 = (Ng.F) this.f18743n0;
                try {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    enumC1486a = enumC1486a4;
                    yVar = yVar6;
                    str = str4;
                    i10 = 4;
                    i11 = i58;
                    obj2 = obj;
                } catch (Exception unused5) {
                    enumC1486a2 = enumC1486a4;
                    f10 = f6;
                    j10 = j6;
                    str2 = str4;
                    i17 = 10;
                    i16 = i12;
                    yVar2 = yVar6;
                    i15 = i14;
                    AbstractC2408g.Companion.getClass();
                    if (AbstractC6708l.b(4, 7) < 0 && Mi.a.d() > 0) {
                        Mi.a.f(new Object[0]);
                    }
                    f13 = f10;
                    i24 = i13;
                    i26 = i15;
                    i25 = 1;
                    enumC1486a4 = enumC1486a2;
                    i27 = i26 + i25;
                    yVar6 = yVar2;
                    i13 = i24;
                    f14 = f13;
                    j12 = j10;
                    int i4822222 = i17;
                    str4 = str2;
                    i28 = i16;
                    i45 = i4822222;
                    if (i27 < i45) {
                    }
                    yVar5 = yVar6;
                    c1503i0.b("Failed reconnecting");
                    f20 = c1503i0.f18778d;
                    if (f20 != null) {
                    }
                    return yVar5;
                }
                abstractC2406e = (AbstractC2406e) obj2;
                if (abstractC2406e instanceof C2404c) {
                }
                c1503i0.f18775a.o();
                AbstractC2408g.Companion.getClass();
                if (AbstractC6708l.b(1, 7) >= 0) {
                    Mi.a.e(new Object[0]);
                    break;
                }
                f11 = c1503i0.f18778d;
                if (f11 != null) {
                }
                i18 = i14;
                j11 = j6;
                i20 = i13;
                str2 = str;
                i19 = i12;
                if (c1503i0.f18798x) {
                }
                i21 = i18;
                i22 = i11;
                f12 = f6;
                i13 = i20;
                i23 = i19;
                Ad.l.h0(f12);
                if (c1503i0.f18797w) {
                }
                break;
            case 5:
                j18 = this.f18741l0;
                i34 = this.f18739j0;
                int i59 = this.f18738i0;
                long j27 = this.f18740k0;
                i36 = this.f18737h0;
                i37 = this.f18736Z;
                f18 = (Ng.F) this.f18743n0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                enumC1486a = enumC1486a4;
                yVar = yVar6;
                j17 = j27;
                obj6 = obj;
                i26 = i59;
                str2 = str4;
                i38 = 1;
                if (((Boolean) obj6).booleanValue()) {
                }
                z15 = false;
                if (!z15) {
                }
                break;
            case 6:
                long j28 = this.f18741l0;
                i34 = this.f18739j0;
                int i60 = this.f18738i0;
                long j29 = this.f18740k0;
                i36 = this.f18737h0;
                i37 = this.f18736Z;
                f18 = (Ng.F) this.f18743n0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                j16 = j28;
                enumC1486a = enumC1486a4;
                yVar = yVar6;
                j17 = j29;
                i26 = i60;
                str2 = str4;
                j18 = j16;
                if (SystemClock.elapsedRealtime() < j18) {
                }
                break;
            case 7:
                long j30 = this.f18741l0;
                i34 = this.f18739j0;
                int i61 = this.f18738i0;
                long j31 = this.f18740k0;
                int i62 = this.f18737h0;
                int i63 = this.f18736Z;
                f18 = (Ng.F) this.f18743n0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                enumC1486a = enumC1486a4;
                yVar = yVar6;
                j13 = j30;
                obj5 = obj;
                i26 = i61;
                str2 = str4;
                i33 = i62;
                i30 = i63;
                j10 = j31;
                i35 = 1;
                if (((Boolean) obj5).booleanValue()) {
                }
                z14 = false;
                Ng.F f23222 = f18;
                i24 = i33;
                f16 = f23222;
                if (!z14) {
                }
                break;
            case 8:
                long j32 = this.f18741l0;
                int i64 = this.f18739j0;
                int i65 = this.f18738i0;
                j10 = this.f18740k0;
                int i66 = this.f18737h0;
                int i67 = this.f18736Z;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                i32 = i64;
                yVar = yVar6;
                i26 = i65;
                str2 = str4;
                i30 = i67;
                f18 = (Ng.F) this.f18743n0;
                i33 = i66;
                enumC1486a3 = enumC1486a4;
                j13 = j32;
                j14 = 100;
                enumC1486a = enumC1486a3;
                j15 = j14;
                i34 = i32;
                if (SystemClock.elapsedRealtime() < j13) {
                }
                break;
            case 9:
                int i68 = this.f18739j0;
                int i69 = this.f18738i0;
                j10 = this.f18740k0;
                int i70 = this.f18737h0;
                int i71 = this.f18736Z;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                i29 = i68;
                i26 = i69;
                enumC1486a2 = enumC1486a4;
                yVar = yVar6;
                f16 = (Ng.F) this.f18743n0;
                obj4 = obj;
                i24 = i70;
                i30 = i71;
                str2 = str4;
                if (((Boolean) obj4).booleanValue()) {
                }
                f17 = f16;
                i31 = i26;
                z13 = false;
                if (!z13) {
                }
                c1503i0.f18775a.v();
                f15 = c1503i0.f18778d;
                if (f15 == null) {
                }
                break;
            case 10:
                com.google.android.gms.internal.play_billing.N.B0(obj);
                return yVar6;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
