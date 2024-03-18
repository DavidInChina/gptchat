package M5;

import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: Y  reason: collision with root package name */
    public final AtomicReference f11640Y;

    public g(String str) {
        this.f11640Y = new AtomicReference(str);
    }

    @Override // M5.b
    public final String getVersion() {
        Object obj = this.f11640Y.get();
        AbstractC3557B.b0("value.get()", obj);
        return (String) obj;
    }

    @Override // M5.b
    public final void h(String str) {
        this.f11640Y.set(str);
    }
}
