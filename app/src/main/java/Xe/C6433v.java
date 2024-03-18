package xe;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;

/* renamed from: xe.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6433v extends Fe.x {
    public C6433v() {
        super(8);
    }

    @Override // Fe.x
    public final void l(String str) {
        AbstractC3557B.c0("name", str);
        super.l(str);
        List list = AbstractC6435x.f49956a;
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            int i12 = i11 + 1;
            if (AbstractC3557B.e0(charAt, 32) > 0 && !Lg.n.a2("\"(),/:;<=>?@[\\]{}", charAt)) {
                i10++;
                i11 = i12;
            } else {
                throw new Ad.t(str, i11, 0);
            }
        }
    }

    @Override // Fe.x
    public final void m(String str) {
        AbstractC3557B.c0("value", str);
        super.m(str);
        List list = AbstractC6435x.f49956a;
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            int i12 = i11 + 1;
            if (AbstractC3557B.e0(charAt, 32) < 0 && charAt != '\t') {
                throw new Ad.t(str, i11, 1);
            }
            i10++;
            i11 = i12;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Fe.y, xe.w] */
    public final C6434w n() {
        Map map = this.f5366b;
        AbstractC3557B.c0(DiagnosticsEntry.Histogram.VALUES_KEY, map);
        return new Fe.y(map);
    }
}
