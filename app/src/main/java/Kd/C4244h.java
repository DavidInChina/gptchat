package kd;

import Ng.F;
import Pg.C;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import kotlin.jvm.internal.A;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import se.C5621c;
import x8.W;
import y.C6484w;

/* renamed from: kd.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4244h extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f37305Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f37306Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4255s f37307h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C5621c f37308i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ A f37309j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ long f37310k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4244h(C4255s c4255s, C5621c c5621c, A a5, long j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37307h0 = c4255s;
        this.f37308i0 = c5621c;
        this.f37309j0 = a5;
        this.f37310k0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4244h c4244h = new C4244h(this.f37307h0, this.f37308i0, this.f37309j0, this.f37310k0, abstractC4825e);
        c4244h.f37306Z = obj;
        return c4244h;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((C4244h) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
        return EnumC5000a.f41328Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0057 -> B:13:0x0058). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C4259w c4259w;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37305Y;
        C4255s c4255s = this.f37307h0;
        if (i10 != 0) {
            if (i10 == 1) {
                C4255s c4255s2 = (C4255s) this.f37306Z;
                N.B0(obj);
                io.ktor.websocket.q qVar = (io.ktor.websocket.q) obj;
                int i11 = C4255s.f37347j;
                c4255s2.getClass();
                if (qVar instanceof io.ktor.websocket.p) {
                    try {
                    } catch (Exception e10) {
                        W.W(Pc.e.a(), "Failed to parse websocket message", e10, null, 4);
                    }
                    c4259w = (C4259w) md.b.f39132a.b(C4259w.Companion.serializer(), N.o0((io.ktor.websocket.p) qVar));
                    if (c4259w != null) {
                        c4255s.f37354g.g(c4259w);
                    }
                    C r10 = this.f37308i0.f45554Y.r();
                    this.f37306Z = c4255s;
                    this.f37305Y = 1;
                    obj = r10.g(this);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c4255s2 = c4255s;
                    io.ktor.websocket.q qVar2 = (io.ktor.websocket.q) obj;
                    int i112 = C4255s.f37347j;
                    c4255s2.getClass();
                    if (qVar2 instanceof io.ktor.websocket.p) {
                    }
                }
                c4259w = null;
                if (c4259w != null) {
                }
                C r102 = this.f37308i0.f45554Y.r();
                this.f37306Z = c4255s;
                this.f37305Y = 1;
                obj = r102.g(this);
                if (obj == enumC5000a) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            F f6 = (F) this.f37306Z;
            W.M(Pc.e.a(), "Connected to websocket", null, 6);
            C6484w c6484w = new C6484w(this.f37309j0, this.f37310k0, 8);
            AbstractC3557B.c0("<this>", f6);
            L4.a.y0(f6).V(c6484w);
            C r1022 = this.f37308i0.f45554Y.r();
            this.f37306Z = c4255s;
            this.f37305Y = 1;
            obj = r1022.g(this);
            if (obj == enumC5000a) {
            }
        }
    }
}
