package io.ktor.websocket;

import Ng.F;
import Pg.D;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class v extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f33682Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ D f33683Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f33684h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Pg.o f33685i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(D d10, String str, Pg.o oVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f33683Z = d10;
        this.f33684h0 = str;
        this.f33685i0 = oVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new v(this.f33683Z, this.f33684h0, this.f33685i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0060 -> B:20:0x0063). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        byte[] bArr;
        byte[] bArr2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f33682Y;
        String str = this.f33684h0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    o oVar = (o) obj;
                    bArr = oVar.f33667c;
                    if (!AbstractC3557B.K(new String(bArr, 0, bArr.length, Lg.a.f11132b), str)) {
                        Ei.a aVar = k.f33661a;
                        aVar.c("WebSocket Pinger: received valid pong frame " + oVar);
                        return jf.y.f36177a;
                    }
                    Ei.a aVar2 = k.f33661a;
                    aVar2.c("WebSocket Pinger: received invalid pong frame " + oVar + ", continue waiting");
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                N.B0(obj);
            }
        } else {
            N.B0(obj);
            k.f33661a.c("WebSocket Pinger: sending ping frame");
            Charset charset = Lg.a.f11132b;
            if (AbstractC3557B.K(charset, Lg.a.f11131a)) {
                bArr2 = Lg.n.b2(str);
            } else {
                CharsetEncoder newEncoder = charset.newEncoder();
                AbstractC3557B.b0("charset.newEncoder()", newEncoder);
                bArr2 = Le.a.c(newEncoder, str, str.length());
            }
            n nVar = new n(bArr2);
            this.f33682Y = 1;
            if (this.f33683Z.n(nVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        this.f33682Y = 2;
        obj = this.f33685i0.g(this);
        if (obj == enumC5000a) {
            return enumC5000a;
        }
        o oVar2 = (o) obj;
        bArr = oVar2.f33667c;
        if (!AbstractC3557B.K(new String(bArr, 0, bArr.length, Lg.a.f11132b), str)) {
        }
    }
}
