package C6;

import id.AbstractC3557B;
import java.security.SecureRandom;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends M6.d {

    /* renamed from: v0  reason: collision with root package name */
    public final r5.d f2714v0;

    /* renamed from: w0  reason: collision with root package name */
    public final M6.e f2715w0;

    /* renamed from: x0  reason: collision with root package name */
    public final boolean f2716x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r5.d dVar, R6.b bVar, U6.a aVar, SecureRandom secureRandom, M6.e eVar, boolean z10) {
        super(bVar, aVar, secureRandom);
        AbstractC3557B.c0("sdkCore", dVar);
        AbstractC3557B.c0("random", secureRandom);
        AbstractC3557B.c0("logsHandler", eVar);
        this.f2714v0 = dVar;
        this.f2715w0 = eVar;
        this.f2716x0 = z10;
        b bVar2 = new b(this);
        ff.b bVar3 = this.f11684i0;
        if (bVar3 instanceof Q6.a) {
            ((Q6.a) bVar3).f14438b.add(bVar2);
        }
    }

    @Override // ff.f
    public final ff.e E(String str) {
        String str2;
        String str3;
        String str4;
        AbstractC3557B.c0("operationName", str);
        M6.c cVar = new M6.c(this, str, this.f11684i0);
        if (this.f2716x0) {
            Map a5 = this.f2714v0.a("rum");
            Object obj = a5.get("application_id");
            String str5 = null;
            if (obj instanceof String) {
                str2 = (String) obj;
            } else {
                str2 = null;
            }
            cVar.c("application_id", str2);
            Object obj2 = a5.get("session_id");
            if (obj2 instanceof String) {
                str3 = (String) obj2;
            } else {
                str3 = null;
            }
            cVar.c("session_id", str3);
            Object obj3 = a5.get("view_id");
            if (obj3 instanceof String) {
                str4 = (String) obj3;
            } else {
                str4 = null;
            }
            cVar.c("view.id", str4);
            Object obj4 = a5.get("action_id");
            if (obj4 instanceof String) {
                str5 = (String) obj4;
            }
            cVar.c("user_action.id", str5);
        }
        return cVar;
    }

    @Override // M6.d
    public final String toString() {
        return R.a.r("AndroidTracer/", super.toString());
    }
}
