package io.ktor.websocket;

import Ng.F;
import Pg.C;
import Pg.C1171d;
import Pg.D;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.jvm.internal.B;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class f extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Serializable f33624Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f33625Z;

    /* renamed from: h0  reason: collision with root package name */
    public kotlin.jvm.internal.x f33626h0;

    /* renamed from: i0  reason: collision with root package name */
    public j f33627i0;

    /* renamed from: j0  reason: collision with root package name */
    public D f33628j0;

    /* renamed from: k0  reason: collision with root package name */
    public C f33629k0;

    /* renamed from: l0  reason: collision with root package name */
    public C1171d f33630l0;

    /* renamed from: m0  reason: collision with root package name */
    public q f33631m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f33632n0;

    /* renamed from: o0  reason: collision with root package name */
    public /* synthetic */ Object f33633o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ j f33634p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ D f33635q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, D d10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f33634p0 = jVar;
        this.f33635q0 = d10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        f fVar = new f(this.f33634p0, this.f33635q0, abstractC4825e);
        fVar.f33633o0 = obj;
        return fVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x027c A[Catch: all -> 0x0049, TRY_ENTER, TryCatch #4 {all -> 0x0049, blocks: (B:9:0x003d, B:14:0x0067, B:16:0x0084, B:18:0x00a0, B:22:0x00d6, B:24:0x00f2, B:28:0x011a, B:29:0x011e, B:31:0x0122, B:33:0x0130, B:37:0x0143, B:43:0x0173, B:45:0x017b, B:47:0x0187, B:48:0x0189, B:51:0x01a7, B:68:0x01fb, B:70:0x0201, B:76:0x0232, B:90:0x027c, B:92:0x0280, B:93:0x0282, B:95:0x0286, B:96:0x028d, B:101:0x02aa, B:103:0x02b8, B:108:0x02e8, B:109:0x02f0), top: B:215:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a6 A[Catch: all -> 0x03d3, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x03d3, blocks: (B:39:0x014b, B:41:0x0153, B:66:0x01f7, B:74:0x022e, B:79:0x024c, B:81:0x0254, B:84:0x0263, B:99:0x02a6, B:110:0x02f1, B:112:0x02fa, B:114:0x0306, B:116:0x031e), top: B:222:0x014b }] */
    /* JADX WARN: Type inference failed for: r0v77, types: [Pg.D] */
    /* JADX WARN: Type inference failed for: r13v1, types: [kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r14v1, types: [kotlin.jvm.internal.B] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [kotlin.jvm.internal.B] */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x02da -> B:148:0x03b2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x03ab -> B:147:0x03ad). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x021b -> B:148:0x03b2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x0299 -> B:98:0x02a3). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jf.y yVar;
        B b10;
        kotlin.jvm.internal.x xVar;
        C c10;
        String str;
        Throwable th2;
        Me.c cVar;
        Me.c cVar2;
        Throwable th3;
        Throwable th4;
        String str2;
        B b11;
        kotlin.jvm.internal.x xVar2;
        C1171d c1171d;
        D d10;
        j jVar;
        B b12;
        F f6;
        B b13;
        B b14;
        kotlin.jvm.internal.x xVar3;
        j jVar2;
        F f10;
        C1171d c1171d2;
        F f11;
        B b15;
        kotlin.jvm.internal.x xVar4;
        B b16;
        j jVar3;
        D d11;
        C1171d c1171d3;
        B b17;
        kotlin.jvm.internal.x xVar5;
        F f12;
        C1171d c1171d4;
        q qVar;
        Object obj2;
        Object pVar;
        char c11;
        B b18;
        kotlin.jvm.internal.x xVar6;
        F f13;
        B b19;
        D d12;
        C1171d c1171d5;
        Me.c cVar3;
        Object obj3;
        q qVar2;
        B b20;
        kotlin.jvm.internal.x xVar7;
        B b21;
        B b22;
        kotlin.jvm.internal.x xVar8;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f33632n0;
        jf.y yVar2 = jf.y.f36177a;
        q qVar3 = null;
        String str3 = "Connection was closed without close frame";
        int i11 = 1;
        try {
            switch (i10) {
                case 0:
                    N.B0(obj);
                    f6 = (F) this.f33633o0;
                    ?? obj4 = new Object();
                    b10 = new Object();
                    xVar = new Object();
                    try {
                        c10 = this.f33634p0.f33652Y.r();
                        jVar = this.f33634p0;
                        d10 = this.f33635q0;
                        c1171d = c10.iterator();
                        b21 = obj4;
                        xVar7 = xVar;
                        b20 = b10;
                        this.f33633o0 = f6;
                        try {
                            this.f33624Y = b21;
                            this.f33625Z = b20;
                            this.f33626h0 = xVar7;
                            this.f33627i0 = jVar;
                            this.f33628j0 = d10;
                            this.f33629k0 = c10;
                            this.f33630l0 = c1171d;
                            this.f33631m0 = qVar3;
                            this.f33632n0 = i11;
                            obj3 = c1171d.a(this);
                            if (obj3 == enumC5000a) {
                                return enumC5000a;
                            }
                            C1171d c1171d6 = c1171d;
                            f13 = f6;
                            c1171d5 = c1171d6;
                            D d13 = d10;
                            b19 = b21;
                            d12 = d13;
                            xVar = xVar7;
                            b10 = b20;
                            if (!((Boolean) obj3).booleanValue()) {
                                try {
                                    try {
                                        Ei.a aVar = k.f33661a;
                                        aVar.c("WebSocketSession(" + f13 + ") receiving frame " + qVar2);
                                        if (qVar2 instanceof m) {
                                            xVar = xVar;
                                            b10 = b10;
                                            if (!jVar.f33655i0.u()) {
                                                Pg.k kVar = jVar.f33655i0;
                                                b n02 = N.n0((m) qVar2);
                                                if (n02 == null) {
                                                    n02 = k.f33664d;
                                                }
                                                m mVar = new m(n02);
                                                this.f33633o0 = b10;
                                                this.f33624Y = xVar;
                                                this.f33625Z = c10;
                                                this.f33626h0 = null;
                                                this.f33627i0 = null;
                                                this.f33628j0 = null;
                                                this.f33629k0 = null;
                                                this.f33630l0 = null;
                                                this.f33632n0 = 2;
                                                xVar = xVar;
                                                b10 = b10;
                                                if (kVar.n(mVar, this) == enumC5000a) {
                                                    return enumC5000a;
                                                }
                                            }
                                            xVar.f37645Y = true;
                                            R4.b.Q(c10, null);
                                            this.f33635q0.l(null);
                                            cVar3 = (Me.c) b10.f37622Y;
                                            if (cVar3 != null) {
                                                cVar3.close();
                                            }
                                            this.f33634p0.f33654h0.l(null);
                                            if (xVar.f37645Y) {
                                                j jVar4 = this.f33634p0;
                                                b bVar = new b(EnumC3606a.CLOSED_ABNORMALLY, str3);
                                                this.f33633o0 = yVar2;
                                                this.f33624Y = null;
                                                this.f33625Z = null;
                                                this.f33626h0 = null;
                                                this.f33627i0 = null;
                                                this.f33628j0 = null;
                                                this.f33629k0 = null;
                                                this.f33630l0 = null;
                                                this.f33632n0 = 3;
                                                if (AbstractC4344b.V(jVar4, bVar, this) == enumC5000a) {
                                                    return enumC5000a;
                                                }
                                                return yVar2;
                                            }
                                            return yVar2;
                                        }
                                        if (qVar2 instanceof o) {
                                            D d14 = (D) jVar.pinger;
                                            xVar6 = xVar;
                                            b18 = b10;
                                            if (d14 != null) {
                                                this.f33633o0 = f13;
                                                this.f33624Y = b19;
                                                this.f33625Z = b10;
                                                this.f33626h0 = xVar;
                                                this.f33627i0 = jVar;
                                                this.f33628j0 = d12;
                                                this.f33629k0 = c10;
                                                this.f33630l0 = c1171d5;
                                                this.f33632n0 = 4;
                                                xVar6 = xVar;
                                                b18 = b10;
                                                if (d14.n(qVar2, this) == enumC5000a) {
                                                    return enumC5000a;
                                                }
                                            }
                                        } else if (qVar2 instanceof n) {
                                            this.f33633o0 = f13;
                                            this.f33624Y = b19;
                                            this.f33625Z = b10;
                                            this.f33626h0 = xVar;
                                            this.f33627i0 = jVar;
                                            this.f33628j0 = d12;
                                            this.f33629k0 = c10;
                                            this.f33630l0 = c1171d5;
                                            this.f33632n0 = 5;
                                            xVar6 = xVar;
                                            b18 = b10;
                                            if (d12.n(qVar2, this) == enumC5000a) {
                                                return enumC5000a;
                                            }
                                        } else {
                                            Me.c cVar4 = (Me.c) b10.f37622Y;
                                            this.f33633o0 = f13;
                                            this.f33624Y = b19;
                                            this.f33625Z = b10;
                                            this.f33626h0 = xVar;
                                            this.f33627i0 = jVar;
                                            this.f33628j0 = d12;
                                            this.f33629k0 = c10;
                                            this.f33630l0 = c1171d5;
                                            this.f33631m0 = qVar2;
                                            this.f33632n0 = 6;
                                            if (j.a(jVar, cVar4, qVar2, this) == enumC5000a) {
                                                return enumC5000a;
                                            }
                                            D d15 = d12;
                                            c1171d4 = c1171d5;
                                            qVar = qVar2;
                                            b13 = b19;
                                            d10 = d15;
                                            F f14 = f13;
                                            jVar2 = jVar;
                                            f12 = f14;
                                            xVar = xVar;
                                            b10 = b10;
                                            if (!qVar.f33665a) {
                                                if (b13.f37622Y == null) {
                                                    b13.f37622Y = qVar;
                                                }
                                                if (b10.f37622Y == null) {
                                                    b10.f37622Y = new Me.c();
                                                }
                                                Object obj5 = b10.f37622Y;
                                                AbstractC3557B.Z(obj5);
                                                P4.a.V0((Me.i) obj5, qVar.f33667c);
                                                yVar = yVar2;
                                                f6 = f12;
                                                str2 = str3;
                                                jVar = jVar2;
                                                c1171d = c1171d4;
                                                xVar5 = xVar;
                                                b17 = b10;
                                                b12 = b13;
                                                xVar2 = xVar5;
                                                b11 = b17;
                                                yVar2 = yVar;
                                                str3 = str2;
                                                qVar3 = null;
                                                i11 = 1;
                                                b21 = b12;
                                                xVar7 = xVar2;
                                                b20 = b11;
                                                this.f33633o0 = f6;
                                                this.f33624Y = b21;
                                                this.f33625Z = b20;
                                                this.f33626h0 = xVar7;
                                                this.f33627i0 = jVar;
                                                this.f33628j0 = d10;
                                                this.f33629k0 = c10;
                                                this.f33630l0 = c1171d;
                                                this.f33631m0 = qVar3;
                                                this.f33632n0 = i11;
                                                obj3 = c1171d.a(this);
                                                if (obj3 == enumC5000a) {
                                                }
                                            } else if (b13.f37622Y == null) {
                                                Pg.k kVar2 = jVar2.f33654h0;
                                                Iterator it = jVar2.f33657k0.iterator();
                                                if (!it.hasNext()) {
                                                    this.f33633o0 = f12;
                                                    this.f33624Y = b13;
                                                    this.f33625Z = b10;
                                                    this.f33626h0 = xVar;
                                                    this.f33627i0 = jVar2;
                                                    this.f33628j0 = d10;
                                                    this.f33629k0 = c10;
                                                    this.f33630l0 = c1171d4;
                                                    this.f33631m0 = null;
                                                    this.f33632n0 = 7;
                                                    if (kVar2.n(qVar, this) == enumC5000a) {
                                                        return enumC5000a;
                                                    }
                                                    c1171d3 = c1171d4;
                                                    d11 = d10;
                                                    jVar3 = jVar2;
                                                    b16 = b13;
                                                    f11 = f12;
                                                    xVar4 = xVar;
                                                    b15 = b10;
                                                    yVar = yVar2;
                                                    str2 = str3;
                                                    jVar = jVar3;
                                                    d10 = d11;
                                                    b12 = b16;
                                                    c1171d = c1171d3;
                                                    f6 = f11;
                                                    xVar2 = xVar4;
                                                    b11 = b15;
                                                    yVar2 = yVar;
                                                    str3 = str2;
                                                    qVar3 = null;
                                                    i11 = 1;
                                                    b21 = b12;
                                                    xVar7 = xVar2;
                                                    b20 = b11;
                                                    this.f33633o0 = f6;
                                                    this.f33624Y = b21;
                                                    this.f33625Z = b20;
                                                    this.f33626h0 = xVar7;
                                                    this.f33627i0 = jVar;
                                                    this.f33628j0 = d10;
                                                    this.f33629k0 = c10;
                                                    this.f33630l0 = c1171d;
                                                    this.f33631m0 = qVar3;
                                                    this.f33632n0 = i11;
                                                    obj3 = c1171d.a(this);
                                                    if (obj3 == enumC5000a) {
                                                    }
                                                } else {
                                                    AbstractC2469q0.p(it.next());
                                                    throw null;
                                                }
                                            } else {
                                                try {
                                                    try {
                                                        try {
                                                            Object obj6 = b10.f37622Y;
                                                            AbstractC3557B.Z(obj6);
                                                            P4.a.V0((Me.i) obj6, qVar.f33667c);
                                                            Object obj7 = b13.f37622Y;
                                                            AbstractC3557B.Z(obj7);
                                                            s sVar = ((q) obj7).f33666b;
                                                            Object obj8 = b10.f37622Y;
                                                            AbstractC3557B.Z(obj8);
                                                            byte[] l02 = N.l0(((Me.c) obj8).p());
                                                            Object obj9 = b13.f37622Y;
                                                            AbstractC3557B.Z(obj9);
                                                            boolean z10 = ((q) obj9).f33668d;
                                                            Object obj10 = b13.f37622Y;
                                                            AbstractC3557B.Z(obj10);
                                                            boolean z11 = ((q) obj10).f33669e;
                                                            boolean z12 = ((q) obj2).f33670f;
                                                            AbstractC3557B.c0("frameType", sVar);
                                                            int ordinal = sVar.ordinal();
                                                            if (ordinal != 0) {
                                                                if (ordinal != 1) {
                                                                    if (ordinal != 2) {
                                                                        c11 = 3;
                                                                        if (ordinal != 3) {
                                                                            if (ordinal == 4) {
                                                                                pVar = new o(l02, t.f33679Y);
                                                                            } else {
                                                                                throw new RuntimeException();
                                                                            }
                                                                        } else {
                                                                            pVar = new n(l02);
                                                                        }
                                                                    } else {
                                                                        c11 = 3;
                                                                        pVar = new m(l02);
                                                                    }
                                                                } else {
                                                                    pVar = new l(l02, z10, z11, z12);
                                                                }
                                                            } else {
                                                                pVar = new p(l02, z10, z11, z12);
                                                            }
                                                            b13.f37622Y = null;
                                                            Pg.k kVar3 = jVar2.f33654h0;
                                                            Iterator it2 = jVar2.f33657k0.iterator();
                                                            if (!it2.hasNext()) {
                                                                this.f33633o0 = f12;
                                                                this.f33624Y = b13;
                                                                this.f33625Z = b10;
                                                                this.f33626h0 = xVar;
                                                                this.f33627i0 = jVar2;
                                                                this.f33628j0 = d10;
                                                                this.f33629k0 = c10;
                                                                this.f33630l0 = c1171d4;
                                                                this.f33631m0 = null;
                                                                this.f33632n0 = 8;
                                                                if (kVar3.n(pVar, this) == enumC5000a) {
                                                                    return enumC5000a;
                                                                }
                                                                c1171d2 = c1171d4;
                                                                f10 = f12;
                                                                xVar3 = xVar;
                                                                b14 = b10;
                                                                jVar = jVar2;
                                                                c1171d = c1171d2;
                                                                f6 = f10;
                                                                xVar5 = xVar3;
                                                                b17 = b14;
                                                                b12 = b13;
                                                                xVar2 = xVar5;
                                                                b11 = b17;
                                                                yVar2 = yVar;
                                                                str3 = str2;
                                                                qVar3 = null;
                                                                i11 = 1;
                                                                b21 = b12;
                                                                xVar7 = xVar2;
                                                                b20 = b11;
                                                                this.f33633o0 = f6;
                                                                this.f33624Y = b21;
                                                                this.f33625Z = b20;
                                                                this.f33626h0 = xVar7;
                                                                this.f33627i0 = jVar;
                                                                this.f33628j0 = d10;
                                                                this.f33629k0 = c10;
                                                                this.f33630l0 = c1171d;
                                                                this.f33631m0 = qVar3;
                                                                this.f33632n0 = i11;
                                                                obj3 = c1171d.a(this);
                                                                if (obj3 == enumC5000a) {
                                                                }
                                                            } else {
                                                                AbstractC2469q0.p(it2.next());
                                                                throw null;
                                                            }
                                                        } catch (Throwable th5) {
                                                            th4 = th5;
                                                            str2 = str3;
                                                            th2 = th4;
                                                            str = str2;
                                                            xVar = xVar;
                                                            b10 = b10;
                                                            try {
                                                                throw th2;
                                                            } catch (Throwable th6) {
                                                                try {
                                                                    R4.b.Q(c10, th2);
                                                                    throw th6;
                                                                } catch (Pg.w unused) {
                                                                    this.f33635q0.l(null);
                                                                    cVar2 = (Me.c) b10.f37622Y;
                                                                    if (cVar2 != null) {
                                                                    }
                                                                    this.f33634p0.f33654h0.l(null);
                                                                    if (!xVar.f37645Y) {
                                                                    }
                                                                } catch (Throwable th7) {
                                                                    th = th7;
                                                                    try {
                                                                        this.f33635q0.l(null);
                                                                        this.f33634p0.f33654h0.o(th, false);
                                                                        this.f33635q0.l(null);
                                                                        cVar = (Me.c) b10.f37622Y;
                                                                        if (cVar != null) {
                                                                        }
                                                                        this.f33634p0.f33654h0.l(null);
                                                                        if (!xVar.f37645Y) {
                                                                        }
                                                                    } catch (Throwable th8) {
                                                                        this.f33635q0.l(null);
                                                                        Me.c cVar5 = (Me.c) b10.f37622Y;
                                                                        if (cVar5 != null) {
                                                                            cVar5.close();
                                                                        }
                                                                        this.f33634p0.f33654h0.l(null);
                                                                        if (!xVar.f37645Y) {
                                                                            j jVar5 = this.f33634p0;
                                                                            b bVar2 = new b(EnumC3606a.CLOSED_ABNORMALLY, str);
                                                                            this.f33633o0 = th8;
                                                                            this.f33624Y = null;
                                                                            this.f33625Z = null;
                                                                            this.f33626h0 = null;
                                                                            this.f33627i0 = null;
                                                                            this.f33628j0 = null;
                                                                            this.f33629k0 = null;
                                                                            this.f33630l0 = null;
                                                                            this.f33631m0 = null;
                                                                            this.f33632n0 = 12;
                                                                            if (AbstractC4344b.V(jVar5, bVar2, this) == enumC5000a) {
                                                                                return enumC5000a;
                                                                            }
                                                                            throw th8;
                                                                        }
                                                                        throw th8;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        obj2 = b13.f37622Y;
                                                        AbstractC3557B.Z(obj2);
                                                    } catch (Throwable th9) {
                                                        th4 = th9;
                                                    }
                                                    yVar = yVar2;
                                                } catch (Throwable th10) {
                                                    th4 = th10;
                                                    th2 = th4;
                                                    str = str2;
                                                    xVar = xVar;
                                                    b10 = b10;
                                                    throw th2;
                                                }
                                                str2 = str3;
                                            }
                                        }
                                        yVar = yVar2;
                                        str2 = str3;
                                        F f15 = f13;
                                        c1171d = c1171d5;
                                        f6 = f15;
                                        B b23 = b19;
                                        d10 = d12;
                                        b12 = b23;
                                        xVar2 = xVar6;
                                        b11 = b18;
                                        yVar2 = yVar;
                                        str3 = str2;
                                        qVar3 = null;
                                        i11 = 1;
                                        b21 = b12;
                                        xVar7 = xVar2;
                                        b20 = b11;
                                        this.f33633o0 = f6;
                                        this.f33624Y = b21;
                                        this.f33625Z = b20;
                                        this.f33626h0 = xVar7;
                                        this.f33627i0 = jVar;
                                        this.f33628j0 = d10;
                                        this.f33629k0 = c10;
                                        this.f33630l0 = c1171d;
                                        this.f33631m0 = qVar3;
                                        this.f33632n0 = i11;
                                        obj3 = c1171d.a(this);
                                        if (obj3 == enumC5000a) {
                                        }
                                    } catch (Throwable th11) {
                                        th4 = th11;
                                        yVar = yVar2;
                                        str2 = str3;
                                        th2 = th4;
                                        str = str2;
                                        xVar = xVar;
                                        b10 = b10;
                                        throw th2;
                                    }
                                    qVar2 = (q) c1171d5.b();
                                } catch (Throwable th12) {
                                    th4 = th12;
                                    yVar = yVar2;
                                }
                            } else {
                                yVar = yVar2;
                                ?? r32 = qVar3;
                                String str4 = str3;
                                try {
                                    R4.b.Q(c10, r32);
                                    this.f33635q0.l(r32);
                                    Me.c cVar6 = (Me.c) b10.f37622Y;
                                    if (cVar6 != null) {
                                        cVar6.close();
                                    }
                                    this.f33634p0.f33654h0.l(null);
                                    if (!xVar.f37645Y) {
                                        j jVar6 = this.f33634p0;
                                        b bVar3 = new b(EnumC3606a.CLOSED_ABNORMALLY, str4);
                                        this.f33633o0 = null;
                                        this.f33624Y = null;
                                        this.f33625Z = null;
                                        this.f33626h0 = null;
                                        this.f33627i0 = null;
                                        this.f33628j0 = null;
                                        this.f33629k0 = null;
                                        this.f33630l0 = null;
                                        this.f33632n0 = 9;
                                        if (AbstractC4344b.V(jVar6, bVar3, this) == enumC5000a) {
                                            return enumC5000a;
                                        }
                                        return yVar;
                                    }
                                    return yVar;
                                } catch (Pg.w unused2) {
                                    str = str4;
                                    this.f33635q0.l(null);
                                    cVar2 = (Me.c) b10.f37622Y;
                                    if (cVar2 != null) {
                                    }
                                    this.f33634p0.f33654h0.l(null);
                                    if (!xVar.f37645Y) {
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    str = str4;
                                    this.f33635q0.l(null);
                                    this.f33634p0.f33654h0.o(th, false);
                                    this.f33635q0.l(null);
                                    cVar = (Me.c) b10.f37622Y;
                                    if (cVar != null) {
                                    }
                                    this.f33634p0.f33654h0.l(null);
                                    if (!xVar.f37645Y) {
                                    }
                                }
                            }
                        } catch (Throwable th14) {
                            th3 = th14;
                            yVar = yVar2;
                            str = str3;
                            th2 = th3;
                            xVar = xVar7;
                            b10 = b20;
                            throw th2;
                        }
                    } catch (Pg.w unused3) {
                        yVar = yVar2;
                        str = str3;
                        this.f33635q0.l(null);
                        cVar2 = (Me.c) b10.f37622Y;
                        if (cVar2 != null) {
                            cVar2.close();
                        }
                        this.f33634p0.f33654h0.l(null);
                        if (!xVar.f37645Y) {
                            j jVar7 = this.f33634p0;
                            b bVar4 = new b(EnumC3606a.CLOSED_ABNORMALLY, str);
                            this.f33633o0 = null;
                            this.f33624Y = null;
                            this.f33625Z = null;
                            this.f33626h0 = null;
                            this.f33627i0 = null;
                            this.f33628j0 = null;
                            this.f33629k0 = null;
                            this.f33630l0 = null;
                            this.f33631m0 = null;
                            this.f33632n0 = 10;
                            if (AbstractC4344b.V(jVar7, bVar4, this) == enumC5000a) {
                                return enumC5000a;
                            }
                            return yVar;
                        }
                        return yVar;
                    } catch (Throwable th15) {
                        th = th15;
                        yVar = yVar2;
                        str = str3;
                        this.f33635q0.l(null);
                        this.f33634p0.f33654h0.o(th, false);
                        this.f33635q0.l(null);
                        cVar = (Me.c) b10.f37622Y;
                        if (cVar != null) {
                            cVar.close();
                        }
                        this.f33634p0.f33654h0.l(null);
                        if (!xVar.f37645Y) {
                            j jVar8 = this.f33634p0;
                            b bVar5 = new b(EnumC3606a.CLOSED_ABNORMALLY, str);
                            this.f33633o0 = null;
                            this.f33624Y = null;
                            this.f33625Z = null;
                            this.f33626h0 = null;
                            this.f33627i0 = null;
                            this.f33628j0 = null;
                            this.f33629k0 = null;
                            this.f33630l0 = null;
                            this.f33631m0 = null;
                            this.f33632n0 = 11;
                            if (AbstractC4344b.V(jVar8, bVar5, this) == enumC5000a) {
                                return enumC5000a;
                            }
                            return yVar;
                        }
                        return yVar;
                    }
                case 1:
                    c1171d5 = this.f33630l0;
                    c10 = this.f33629k0;
                    d12 = this.f33628j0;
                    jVar = this.f33627i0;
                    kotlin.jvm.internal.x xVar9 = this.f33626h0;
                    B b24 = (B) this.f33625Z;
                    b19 = (B) this.f33624Y;
                    f13 = (F) this.f33633o0;
                    N.B0(obj);
                    obj3 = obj;
                    xVar = xVar9;
                    b10 = b24;
                    if (!((Boolean) obj3).booleanValue()) {
                    }
                    break;
                case 2:
                    c10 = (C) this.f33625Z;
                    kotlin.jvm.internal.x xVar10 = (kotlin.jvm.internal.x) this.f33624Y;
                    B b25 = (B) this.f33633o0;
                    N.B0(obj);
                    xVar = xVar10;
                    b10 = b25;
                    xVar.f37645Y = true;
                    R4.b.Q(c10, null);
                    this.f33635q0.l(null);
                    cVar3 = (Me.c) b10.f37622Y;
                    if (cVar3 != null) {
                    }
                    this.f33634p0.f33654h0.l(null);
                    if (xVar.f37645Y) {
                    }
                    break;
                case 3:
                    jf.y yVar3 = (jf.y) this.f33633o0;
                    N.B0(obj);
                    return yVar3;
                case 4:
                    c1171d5 = this.f33630l0;
                    c10 = this.f33629k0;
                    d12 = this.f33628j0;
                    jVar = this.f33627i0;
                    kotlin.jvm.internal.x xVar11 = this.f33626h0;
                    B b26 = (B) this.f33625Z;
                    b19 = (B) this.f33624Y;
                    f13 = (F) this.f33633o0;
                    xVar8 = xVar11;
                    b22 = b26;
                    N.B0(obj);
                    xVar6 = xVar8;
                    b18 = b22;
                    yVar = yVar2;
                    str2 = str3;
                    F f152 = f13;
                    c1171d = c1171d5;
                    f6 = f152;
                    B b232 = b19;
                    d10 = d12;
                    b12 = b232;
                    xVar2 = xVar6;
                    b11 = b18;
                    yVar2 = yVar;
                    str3 = str2;
                    qVar3 = null;
                    i11 = 1;
                    b21 = b12;
                    xVar7 = xVar2;
                    b20 = b11;
                    this.f33633o0 = f6;
                    this.f33624Y = b21;
                    this.f33625Z = b20;
                    this.f33626h0 = xVar7;
                    this.f33627i0 = jVar;
                    this.f33628j0 = d10;
                    this.f33629k0 = c10;
                    this.f33630l0 = c1171d;
                    this.f33631m0 = qVar3;
                    this.f33632n0 = i11;
                    obj3 = c1171d.a(this);
                    if (obj3 == enumC5000a) {
                    }
                    break;
                case 5:
                    c1171d5 = this.f33630l0;
                    c10 = this.f33629k0;
                    d12 = this.f33628j0;
                    jVar = this.f33627i0;
                    kotlin.jvm.internal.x xVar12 = this.f33626h0;
                    B b27 = (B) this.f33625Z;
                    b19 = (B) this.f33624Y;
                    f13 = (F) this.f33633o0;
                    xVar8 = xVar12;
                    b22 = b27;
                    N.B0(obj);
                    xVar6 = xVar8;
                    b18 = b22;
                    yVar = yVar2;
                    str2 = str3;
                    F f1522 = f13;
                    c1171d = c1171d5;
                    f6 = f1522;
                    B b2322 = b19;
                    d10 = d12;
                    b12 = b2322;
                    xVar2 = xVar6;
                    b11 = b18;
                    yVar2 = yVar;
                    str3 = str2;
                    qVar3 = null;
                    i11 = 1;
                    b21 = b12;
                    xVar7 = xVar2;
                    b20 = b11;
                    this.f33633o0 = f6;
                    this.f33624Y = b21;
                    this.f33625Z = b20;
                    this.f33626h0 = xVar7;
                    this.f33627i0 = jVar;
                    this.f33628j0 = d10;
                    this.f33629k0 = c10;
                    this.f33630l0 = c1171d;
                    this.f33631m0 = qVar3;
                    this.f33632n0 = i11;
                    obj3 = c1171d.a(this);
                    if (obj3 == enumC5000a) {
                    }
                    break;
                case 6:
                    qVar = this.f33631m0;
                    c1171d4 = this.f33630l0;
                    c10 = this.f33629k0;
                    d10 = this.f33628j0;
                    jVar2 = this.f33627i0;
                    kotlin.jvm.internal.x xVar13 = this.f33626h0;
                    B b28 = (B) this.f33625Z;
                    b13 = (B) this.f33624Y;
                    f12 = (F) this.f33633o0;
                    N.B0(obj);
                    xVar = xVar13;
                    b10 = b28;
                    if (!qVar.f33665a) {
                    }
                    break;
                case 7:
                    c1171d3 = this.f33630l0;
                    c10 = this.f33629k0;
                    d11 = this.f33628j0;
                    jVar3 = this.f33627i0;
                    kotlin.jvm.internal.x xVar14 = this.f33626h0;
                    B b29 = (B) this.f33625Z;
                    b16 = (B) this.f33624Y;
                    f11 = (F) this.f33633o0;
                    N.B0(obj);
                    xVar4 = xVar14;
                    b15 = b29;
                    yVar = yVar2;
                    str2 = str3;
                    jVar = jVar3;
                    d10 = d11;
                    b12 = b16;
                    c1171d = c1171d3;
                    f6 = f11;
                    xVar2 = xVar4;
                    b11 = b15;
                    yVar2 = yVar;
                    str3 = str2;
                    qVar3 = null;
                    i11 = 1;
                    b21 = b12;
                    xVar7 = xVar2;
                    b20 = b11;
                    this.f33633o0 = f6;
                    this.f33624Y = b21;
                    this.f33625Z = b20;
                    this.f33626h0 = xVar7;
                    this.f33627i0 = jVar;
                    this.f33628j0 = d10;
                    this.f33629k0 = c10;
                    this.f33630l0 = c1171d;
                    this.f33631m0 = qVar3;
                    this.f33632n0 = i11;
                    obj3 = c1171d.a(this);
                    if (obj3 == enumC5000a) {
                    }
                    break;
                case 8:
                    c1171d2 = this.f33630l0;
                    c10 = this.f33629k0;
                    d10 = this.f33628j0;
                    jVar2 = this.f33627i0;
                    kotlin.jvm.internal.x xVar15 = this.f33626h0;
                    B b30 = (B) this.f33625Z;
                    b13 = (B) this.f33624Y;
                    f10 = (F) this.f33633o0;
                    N.B0(obj);
                    yVar = yVar2;
                    str2 = str3;
                    xVar3 = xVar15;
                    b14 = b30;
                    jVar = jVar2;
                    c1171d = c1171d2;
                    f6 = f10;
                    xVar5 = xVar3;
                    b17 = b14;
                    b12 = b13;
                    xVar2 = xVar5;
                    b11 = b17;
                    yVar2 = yVar;
                    str3 = str2;
                    qVar3 = null;
                    i11 = 1;
                    b21 = b12;
                    xVar7 = xVar2;
                    b20 = b11;
                    this.f33633o0 = f6;
                    this.f33624Y = b21;
                    this.f33625Z = b20;
                    this.f33626h0 = xVar7;
                    this.f33627i0 = jVar;
                    this.f33628j0 = d10;
                    this.f33629k0 = c10;
                    this.f33630l0 = c1171d;
                    this.f33631m0 = qVar3;
                    this.f33632n0 = i11;
                    obj3 = c1171d.a(this);
                    if (obj3 == enumC5000a) {
                    }
                    break;
                case 9:
                case 10:
                case 11:
                    N.B0(obj);
                    return yVar2;
                case 12:
                    Throwable th16 = (Throwable) this.f33633o0;
                    N.B0(obj);
                    throw th16;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th17) {
            th3 = th17;
        }
    }
}
