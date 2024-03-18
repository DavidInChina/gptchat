package io.ktor.websocket;

import Ng.F;
import Pg.C;
import Pg.C1171d;
import Pg.D;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class x extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public D f33694Y;

    /* renamed from: Z  reason: collision with root package name */
    public C f33695Z;

    /* renamed from: h0  reason: collision with root package name */
    public C1171d f33696h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f33697i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Pg.o f33698j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ D f33699k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Pg.o oVar, D d10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f33698j0 = oVar;
        this.f33699k0 = d10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new x(this.f33698j0, this.f33699k0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #2 {w -> 0x0080, blocks: (B:14:0x002e, B:26:0x0076, B:7:0x0012, B:12:0x0027, B:15:0x0032, B:16:0x0036, B:20:0x0048, B:22:0x0050), top: B:30:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0072 -> B:8:0x0015). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        D d10;
        C c10;
        C1171d c1171d;
        D d11;
        Object a5;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f33697i0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    c1171d = this.f33696h0;
                    c10 = this.f33695Z;
                    d10 = this.f33694Y;
                    N.B0(obj);
                    d11 = d10;
                    this.f33694Y = d11;
                    this.f33695Z = c10;
                    this.f33696h0 = c1171d;
                    this.f33697i0 = 1;
                    a5 = c1171d.a(this);
                    if (a5 == enumC5000a) {
                        return enumC5000a;
                    }
                    d10 = d11;
                    obj = a5;
                    if (!((Boolean) obj).booleanValue()) {
                        k.f33661a.c("Received ping message, sending pong message");
                        o oVar = new o(((n) c1171d.b()).f33667c, t.f33679Y);
                        this.f33694Y = d10;
                        this.f33695Z = c10;
                        this.f33696h0 = c1171d;
                        this.f33697i0 = 2;
                        if (d10.n(oVar, this) == enumC5000a) {
                            return enumC5000a;
                        }
                        d11 = d10;
                        this.f33694Y = d11;
                        this.f33695Z = c10;
                        this.f33696h0 = c1171d;
                        this.f33697i0 = 1;
                        a5 = c1171d.a(this);
                        if (a5 == enumC5000a) {
                        }
                    } else {
                        R4.b.Q(c10, null);
                        return jf.y.f36177a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                c1171d = this.f33696h0;
                c10 = this.f33695Z;
                d10 = this.f33694Y;
                N.B0(obj);
                if (!((Boolean) obj).booleanValue()) {
                }
            }
        } else {
            N.B0(obj);
            c10 = this.f33698j0;
            d11 = this.f33699k0;
            c1171d = c10.iterator();
            this.f33694Y = d11;
            this.f33695Z = c10;
            this.f33696h0 = c1171d;
            this.f33697i0 = 1;
            a5 = c1171d.a(this);
            if (a5 == enumC5000a) {
            }
        }
    }
}
