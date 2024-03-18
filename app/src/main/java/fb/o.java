package Fb;

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

/* loaded from: classes.dex */
public final class o {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[Catch: Exception -> 0x002a, a | IllegalArgumentException -> 0x0070, TryCatch #2 {a | IllegalArgumentException -> 0x0070, Exception -> 0x002a, blocks: (B:11:0x0026, B:16:0x0037, B:20:0x005a, B:21:0x005e, B:22:0x0065), top: B:26:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e A[Catch: Exception -> 0x002a, a | IllegalArgumentException -> 0x0070, TryCatch #2 {a | IllegalArgumentException -> 0x0070, Exception -> 0x002a, blocks: (B:11:0x0026, B:16:0x0037, B:20:0x005a, B:21:0x005e, B:22:0x0065), top: B:26:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(T t10, AbstractC4825e abstractC4825e) {
        n nVar;
        Object obj;
        int i10;
        try {
            if (abstractC4825e instanceof n) {
                nVar = (n) abstractC4825e;
                int i11 = nVar.f5165h0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    nVar.f5165h0 = i11 - Integer.MIN_VALUE;
                    obj = nVar.f5163Y;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = nVar.f5165h0;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            N.B0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        N.B0(obj);
                        C3418c b10 = t10.f39189Y.b();
                        Df.w a5 = C.a(s.class);
                        Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(s.class), a5);
                        nVar.f5165h0 = 1;
                        obj = b10.a(n22, nVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    if (obj == null) {
                        return (s) obj;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.openai.feature.onboarding.impl.api.model.response.OpenAIApiError");
                }
            }
            if (i10 == 0) {
            }
            if (obj == null) {
            }
        } catch (Ce.a | IllegalArgumentException unused) {
            return null;
        } catch (Exception e10) {
            W.W(Pc.e.a(), "Unexpected exception parsing OpenAIApiError response", e10, null, 4);
            return null;
        }
        nVar = new n(this, abstractC4825e);
        obj = nVar.f5163Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = nVar.f5165h0;
    }

    public final KSerializer serializer() {
        return m.f5161a;
    }
}
