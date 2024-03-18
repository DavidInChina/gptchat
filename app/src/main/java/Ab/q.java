package Ab;

import Uc.C1418c;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.P;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kf.w;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class q implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f776a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f777b;

    public q(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f776a = abstractC2400f;
        this.f777b = abstractC2400f2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Ad.g, java.lang.Object, Ab.p] */
    @Override // p000if.a
    public final Object get() {
        Uri uri;
        Map map;
        Set<String> queryParameterNames;
        Object obj = this.f776a.get();
        AbstractC3557B.b0("get(...)", obj);
        j jVar = (j) obj;
        Object obj2 = this.f777b.get();
        AbstractC3557B.b0("get(...)", obj2);
        P p10 = (P) obj2;
        ?? gVar = new Ad.g(new l());
        C1418c c1418c = C1418c.f17664i;
        String str = (String) p10.b("functionId");
        Intent intent = (Intent) p10.b("android-support-nav:controller:deepLinkIntent");
        Map map2 = null;
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        if (uri != null && (queryParameterNames = uri.getQueryParameterNames()) != null) {
            Set<String> set = queryParameterNames;
            int n02 = P4.a.n0(AbstractC6583a.H1(set, 10));
            if (n02 < 16) {
                n02 = 16;
            }
            map2 = new LinkedHashMap(n02);
            for (Object obj3 : set) {
                String queryParameter = uri.getQueryParameter((String) obj3);
                if (queryParameter == null) {
                    queryParameter = "";
                }
                map2.put(obj3, queryParameter);
            }
        }
        if (map2 == null) {
            map = w.f37484Y;
        } else {
            map = map2;
        }
        if (str != null) {
            gVar.h(new o(jVar, str, map, gVar, null));
        }
        return gVar;
    }
}
