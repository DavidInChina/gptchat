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
public final class d {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e A[Catch: Exception -> 0x002c, a | IllegalArgumentException -> 0x0081, TryCatch #2 {a | IllegalArgumentException -> 0x0081, Exception -> 0x002c, blocks: (B:12:0x0028, B:17:0x0039, B:21:0x005e, B:25:0x0069, B:27:0x006f, B:28:0x0076), top: B:32:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[Catch: Exception -> 0x002c, a | IllegalArgumentException -> 0x0081, TryCatch #2 {a | IllegalArgumentException -> 0x0081, Exception -> 0x002c, blocks: (B:12:0x0028, B:17:0x0039, B:21:0x005e, B:25:0x0069, B:27:0x006f, B:28:0x0076), top: B:32:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(T t10, AbstractC4825e abstractC4825e) {
        c cVar;
        Object obj;
        int i10;
        try {
            if (abstractC4825e instanceof c) {
                cVar = (c) abstractC4825e;
                int i11 = cVar.f18536i0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    cVar.f18536i0 = i11 - Integer.MIN_VALUE;
                    obj = cVar.f18534Z;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = cVar.f18536i0;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            t10 = cVar.f18533Y;
                            N.B0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        N.B0(obj);
                        C3418c b10 = t10.f39189Y.b();
                        Df.w a5 = C.a(e.class);
                        Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(e.class), a5);
                        cVar.f18533Y = t10;
                        cVar.f18536i0 = 1;
                        obj = b10.a(n22, cVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    if (obj == null) {
                        e eVar = (e) obj;
                        String str = eVar.f18538b;
                        String str2 = eVar.f18537a;
                        if (str2 == null && str == null) {
                            return null;
                        }
                        return new j(str2, str, t10);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.openai.network.ApiServiceError.ErrorDetail");
                }
            }
            if (i10 == 0) {
            }
            if (obj == null) {
            }
        } catch (Ce.a | IllegalArgumentException unused) {
            return null;
        } catch (Exception e10) {
            W.W(Pc.e.a(), "Unexpected exception parsing ApiServiceError.ErrorMessage", e10, null, 4);
            return null;
        }
        cVar = new c(this, abstractC4825e);
        obj = cVar.f18534Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = cVar.f18536i0;
    }

    public final KSerializer serializer() {
        return b.f18531a;
    }
}
