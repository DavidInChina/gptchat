package ac;

import Z8.AbstractC1809m0;
import Z8.C1801i0;
import android.content.Intent;
import id.AbstractC3557B;
import kf.w;

/* loaded from: classes2.dex */
public final class h extends g {
    public h() {
        super(j.f24151a);
        AbstractC1809m0.a().b(C1801i0.f23354c, w.f37484Y);
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        f fVar = (f) iVar;
        AbstractC3557B.c0("intent", fVar);
        if (fVar instanceof C1972e) {
            Intent intent = new Intent();
            A7.b.G0(intent, "https://platform.openai.com/docs/supported-countries");
            f(new C1970c(intent));
        }
    }
}
