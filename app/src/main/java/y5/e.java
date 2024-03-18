package y5;

import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kf.AbstractC4268D;
import kf.w;
import o5.EnumC4919c;
import q5.C5271a;
import q5.C5272b;
import q5.C5274d;
import q5.C5275e;
import q5.EnumC5273c;

/* loaded from: classes.dex */
public final class e implements AbstractC6542a {

    /* renamed from: a  reason: collision with root package name */
    public final d f50809a;

    public e(d dVar) {
        this.f50809a = dVar;
    }

    @Override // y5.AbstractC6542a
    public final Map a(String str) {
        Map map = (Map) this.f50809a.f50779C.get(str);
        if (map != null) {
            return AbstractC4268D.l1(map);
        }
        return w.f37484Y;
    }

    @Override // y5.AbstractC6542a
    public final void b(String str, LinkedHashMap linkedHashMap) {
        this.f50809a.f50779C.put(str, linkedHashMap);
    }

    @Override // y5.AbstractC6542a
    public final C5271a getContext() {
        d dVar = this.f50809a;
        EnumC4919c enumC4919c = dVar.f50806x;
        String str = dVar.f50796n;
        String str2 = dVar.f50799q;
        String str3 = dVar.f50803u;
        String version = dVar.f50798p.getVersion();
        String str4 = dVar.f50804v;
        String str5 = dVar.f50801s;
        String str6 = dVar.f50800r;
        O5.d dVar2 = dVar.f50790h;
        long z10 = dVar2.z();
        long A10 = dVar2.A();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j6 = A10 - z10;
        q5.f fVar = new q5.f(timeUnit.toNanos(z10), timeUnit.toNanos(A10), timeUnit.toNanos(j6), j6);
        C5275e c5275e = new C5275e(dVar.f50802t);
        C5274d R10 = dVar.f50788f.R();
        M5.a aVar = dVar.f50778B;
        if (aVar != null) {
            String t10 = aVar.t();
            String l10 = aVar.l();
            EnumC5273c L10 = aVar.L();
            C5272b c5272b = new C5272b(t10, l10, aVar.D(), L10, aVar.u(), aVar.y(), aVar.n(), aVar.G(), aVar.r());
            q5.g k10 = dVar.f50792j.k();
            h6.a B10 = dVar.f50791i.B();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : dVar.f50779C.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), AbstractC4268D.l1((Map) entry.getValue()));
            }
            return new C5271a(enumC4919c, str, str2, str3, version, str4, str6, str5, fVar, c5275e, R10, c5272b, k10, B10, linkedHashMap);
        }
        AbstractC3557B.C2("androidInfoProvider");
        throw null;
    }
}
