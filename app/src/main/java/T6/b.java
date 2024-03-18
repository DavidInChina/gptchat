package T6;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public volatile Map f16927a;

    public b(Double d10) {
        double doubleValue = d10.doubleValue();
        this.f16927a = Collections.singletonMap("service:,env:", new a((doubleValue < 0.0d || doubleValue > 1.0d) ? 1.0d : doubleValue));
    }

    @Override // T6.d
    public final boolean a(M6.a aVar) {
        return true;
    }
}
