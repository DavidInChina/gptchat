package qe;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import io.ktor.utils.io.x;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import ve.AbstractC6034c;
import xe.C6417f;

/* renamed from: qe.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5319k extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public StringBuilder f44108Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f44109Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f44110h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C5320l f44111i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5319k(C5320l c5320l, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f44111i0 = c5320l;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5319k c5319k = new C5319k(this.f44111i0, abstractC4825e);
        c5319k.f44110h0 = obj;
        return c5319k;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5319k) create((AbstractC6034c) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb A[RETURN] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C5312d c5312d;
        StringBuilder sb2;
        String obj2;
        String obj3;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f44109Z;
        y yVar = y.f36177a;
        switch (i10) {
            case 0:
                N.B0(obj);
                AbstractC6034c abstractC6034c = (AbstractC6034c) this.f44110h0;
                if (this.f44111i0.f44115b != 5 && !abstractC6034c.b().h().a(AbstractC5321m.f44119b)) {
                    c5312d = (C5312d) abstractC6034c.b().h().b(AbstractC5321m.f44118a);
                    sb2 = new StringBuilder();
                    try {
                        C6417f k02 = AbstractC3557B.k0(abstractC6034c);
                        x c10 = abstractC6034c.c();
                        this.f44110h0 = c5312d;
                        this.f44108Y = sb2;
                        this.f44109Z = 1;
                        if (AbstractC3557B.c2(sb2, k02, c10, this) == enumC5000a) {
                            return enumC5000a;
                        }
                        String sb3 = sb2.toString();
                        AbstractC3557B.b0("log.toString()", sb3);
                        obj3 = Lg.n.U2(sb3).toString();
                        this.f44110h0 = c5312d;
                        this.f44108Y = null;
                        this.f44109Z = 2;
                        if (c5312d.c(obj3, this) == enumC5000a) {
                            return enumC5000a;
                        }
                        this.f44110h0 = null;
                        this.f44109Z = 3;
                        if (c5312d.b(this) == enumC5000a) {
                            return enumC5000a;
                        }
                    } catch (Throwable unused) {
                        String sb4 = sb2.toString();
                        AbstractC3557B.b0("log.toString()", sb4);
                        obj2 = Lg.n.U2(sb4).toString();
                        this.f44110h0 = c5312d;
                        this.f44108Y = null;
                        this.f44109Z = 4;
                        if (c5312d.c(obj2, this) == enumC5000a) {
                            return enumC5000a;
                        }
                        this.f44110h0 = null;
                        this.f44109Z = 5;
                        if (c5312d.b(this) == enumC5000a) {
                        }
                    }
                }
                return yVar;
            case 1:
                StringBuilder sb5 = this.f44108Y;
                C5312d c5312d2 = (C5312d) this.f44110h0;
                try {
                    N.B0(obj);
                    sb2 = sb5;
                    c5312d = c5312d2;
                    String sb32 = sb2.toString();
                    AbstractC3557B.b0("log.toString()", sb32);
                    obj3 = Lg.n.U2(sb32).toString();
                    this.f44110h0 = c5312d;
                    this.f44108Y = null;
                    this.f44109Z = 2;
                    if (c5312d.c(obj3, this) == enumC5000a) {
                    }
                    this.f44110h0 = null;
                    this.f44109Z = 3;
                } catch (Throwable unused2) {
                    sb2 = sb5;
                    c5312d = c5312d2;
                    String sb42 = sb2.toString();
                    AbstractC3557B.b0("log.toString()", sb42);
                    obj2 = Lg.n.U2(sb42).toString();
                    this.f44110h0 = c5312d;
                    this.f44108Y = null;
                    this.f44109Z = 4;
                    if (c5312d.c(obj2, this) == enumC5000a) {
                    }
                    this.f44110h0 = null;
                    this.f44109Z = 5;
                    if (c5312d.b(this) == enumC5000a) {
                    }
                }
                if (c5312d.b(this) == enumC5000a) {
                    return yVar;
                }
                break;
            case 2:
                c5312d = (C5312d) this.f44110h0;
                N.B0(obj);
                this.f44110h0 = null;
                this.f44109Z = 3;
                if (c5312d.b(this) == enumC5000a) {
                }
                break;
            case 3:
            case 5:
                N.B0(obj);
                return yVar;
            case 4:
                c5312d = (C5312d) this.f44110h0;
                N.B0(obj);
                this.f44110h0 = null;
                this.f44109Z = 5;
                if (c5312d.b(this) == enumC5000a) {
                    return enumC5000a;
                }
                break;
            case 6:
                Throwable th2 = (Throwable) this.f44108Y;
                N.B0(obj);
                this.f44110h0 = th2;
                this.f44108Y = null;
                this.f44109Z = 7;
                if (((C5312d) this.f44110h0).b(this) == enumC5000a) {
                    return enumC5000a;
                }
                throw th2;
            case 7:
                Throwable th3 = (Throwable) this.f44110h0;
                N.B0(obj);
                throw th3;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
