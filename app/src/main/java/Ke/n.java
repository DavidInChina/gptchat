package ke;

import Pg.AbstractC1169b;
import Pg.C1171d;
import Wh.I;
import Wh.J;
import Wh.K;
import Wh.w;
import Wh.z;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import ii.C3591f;
import io.ktor.websocket.EnumC3606a;
import java.util.LinkedHashMap;
import jf.y;
import ji.C4138m;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class n extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Object f37422Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f37423Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f37424h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f37425i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ o f37426j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ z f37427k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, z zVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37426j0 = oVar;
        this.f37427k0 = zVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        n nVar = new n(this.f37426j0, this.f37427k0, abstractC4825e);
        nVar.f37425i0 = obj;
        return nVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((AbstractC1169b) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[Catch: all -> 0x001c, TRY_ENTER, TryCatch #3 {all -> 0x001c, blocks: (B:7:0x0018, B:18:0x006c, B:21:0x007b, B:24:0x0085, B:26:0x008f, B:27:0x00a0, B:29:0x00a4, B:30:0x00bd, B:32:0x00c1, B:34:0x00de, B:42:0x00fb, B:43:0x0100), top: B:62:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0078 -> B:21:0x007b). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        Object obj2;
        io.ktor.websocket.b bVar;
        C1171d c1171d;
        boolean booleanValue;
        AbstractC1169b abstractC1169b;
        I i10;
        z zVar;
        Object c10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i11 = this.f37424h0;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        c1171d = (C1171d) this.f37423Z;
                        bVar = (io.ktor.websocket.b) this.f37422Y;
                        obj2 = (J) this.f37425i0;
                        try {
                            N.B0(obj);
                            booleanValue = ((Boolean) obj).booleanValue();
                            y yVar = y.f36177a;
                            if (booleanValue) {
                                io.ktor.websocket.q qVar = (io.ktor.websocket.q) c1171d.b();
                                if (qVar instanceof io.ktor.websocket.l) {
                                    C4138m c4138m = C4138m.f36722i0;
                                    byte[] bArr = qVar.f33667c;
                                    ((C3591f) obj2).i(2, ei.l.i(bArr, 0, bArr.length));
                                } else if (qVar instanceof io.ktor.websocket.p) {
                                    String str = new String(qVar.f33667c, Lg.a.f11131a);
                                    C3591f c3591f = (C3591f) obj2;
                                    c3591f.getClass();
                                    C4138m c4138m2 = C4138m.f36722i0;
                                    c3591f.i(1, ei.l.g(str));
                                } else if (qVar instanceof io.ktor.websocket.m) {
                                    io.ktor.websocket.b n02 = N.n0((io.ktor.websocket.m) qVar);
                                    AbstractC3557B.Z(n02);
                                    io.ktor.websocket.b bVar2 = p.f37435a;
                                    LinkedHashMap linkedHashMap = EnumC3606a.f33606Z;
                                    EnumC3606a enumC3606a = (EnumC3606a) EnumC3606a.f33606Z.get(Short.valueOf(n02.f33613a));
                                    if (enumC3606a != null && enumC3606a != EnumC3606a.CLOSED_ABNORMALLY) {
                                        bVar = n02;
                                    }
                                    try {
                                        ((C3591f) obj2).b(bVar.f33613a, bVar.f33614b);
                                        return yVar;
                                    } finally {
                                    }
                                } else {
                                    throw new t(qVar);
                                }
                                this.f37425i0 = obj2;
                                this.f37422Y = bVar;
                                this.f37423Z = c1171d;
                                this.f37424h0 = 2;
                                obj = c1171d.a(this);
                                if (obj == enumC5000a) {
                                    return enumC5000a;
                                }
                                booleanValue = ((Boolean) obj).booleanValue();
                                y yVar2 = y.f36177a;
                                if (booleanValue) {
                                    try {
                                        ((C3591f) obj2).b(bVar.f33613a, bVar.f33614b);
                                        return yVar2;
                                    } finally {
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            try {
                                ((C3591f) obj2).b(bVar.f33613a, bVar.f33614b);
                                throw th2;
                            } finally {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    zVar = (z) this.f37423Z;
                    i10 = (I) this.f37422Y;
                    abstractC1169b = (AbstractC1169b) this.f37425i0;
                    N.B0(obj);
                }
            } else {
                N.B0(obj);
                abstractC1169b = (AbstractC1169b) this.f37425i0;
                o oVar = this.f37426j0;
                i10 = oVar.f37428Y;
                this.f37425i0 = abstractC1169b;
                this.f37422Y = i10;
                zVar = this.f37427k0;
                this.f37423Z = zVar;
                this.f37424h0 = 1;
                obj = oVar.f37430h0.z(this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
            }
            Pg.p pVar = (Pg.p) abstractC1169b;
            pVar.getClass();
            c1171d = pVar.f14244i0.iterator();
            obj2 = c10;
            this.f37425i0 = obj2;
            this.f37422Y = bVar;
            this.f37423Z = c1171d;
            this.f37424h0 = 2;
            obj = c1171d.a(this);
            if (obj == enumC5000a) {
            }
            booleanValue = ((Boolean) obj).booleanValue();
            y yVar22 = y.f36177a;
            if (booleanValue) {
            }
        } catch (Throwable th4) {
            obj2 = c10;
            th2 = th4;
            ((C3591f) obj2).b(bVar.f33613a, bVar.f33614b);
            throw th2;
        }
        c10 = ((w) i10).c(zVar, (K) obj);
        bVar = p.f37435a;
    }
}
