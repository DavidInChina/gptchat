package Vc;

import Df.H;
import com.google.android.gms.internal.play_billing.N;
import he.C3418c;
import java.io.Serializable;
import kotlin.jvm.internal.C;
import kotlinx.serialization.KSerializer;
import me.T;
import nf.AbstractC4825e;
import of.EnumC5000a;
import x8.W;

/* loaded from: classes2.dex */
public final class h {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e A[Catch: Exception -> 0x002c, a | IllegalArgumentException -> 0x0085, TRY_LEAVE, TryCatch #2 {a | IllegalArgumentException -> 0x0085, Exception -> 0x002c, blocks: (B:12:0x0028, B:17:0x0039, B:21:0x005e, B:26:0x006b, B:28:0x0073, B:29:0x007a), top: B:33:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073 A[Catch: Exception -> 0x002c, a | IllegalArgumentException -> 0x0085, TryCatch #2 {a | IllegalArgumentException -> 0x0085, Exception -> 0x002c, blocks: (B:12:0x0028, B:17:0x0039, B:21:0x005e, B:26:0x006b, B:28:0x0073, B:29:0x007a), top: B:33:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(T t10, AbstractC4825e abstractC4825e) {
        g gVar;
        Object obj;
        int i10;
        try {
            if (abstractC4825e instanceof g) {
                gVar = (g) abstractC4825e;
                int i11 = gVar.f18544i0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    gVar.f18544i0 = i11 - Integer.MIN_VALUE;
                    obj = gVar.f18542Z;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = gVar.f18544i0;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            t10 = gVar.f18541Y;
                            N.B0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        N.B0(obj);
                        C3418c b10 = t10.f39189Y.b();
                        Df.w a5 = C.a(i.class);
                        Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(i.class), a5);
                        gVar.f18541Y = t10;
                        gVar.f18544i0 = 1;
                        obj = b10.a(n22, gVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    if (obj == null) {
                        e eVar = ((i) obj).f18545a;
                        String str = eVar.f18537a;
                        String str2 = eVar.f18538b;
                        if (str == null && str2 == null) {
                            return null;
                        }
                        return new j(eVar.f18537a, str2, t10);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.openai.network.ApiServiceError.ErrorResponse");
                }
            }
            if (i10 == 0) {
            }
            if (obj == null) {
            }
        } catch (Ce.a | IllegalArgumentException unused) {
            return null;
        } catch (Exception e10) {
            W.W(Pc.e.a(), "Unexpected exception parsing ApiServiceError.ErrorDetail", e10, null, 4);
            return null;
        }
        gVar = new g(this, abstractC4825e);
        obj = gVar.f18542Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = gVar.f18544i0;
    }

    public final KSerializer serializer() {
        return f.f18539a;
    }
}
