package e7;

import g7.AbstractC3205b;
import java.util.concurrent.Executors;
import k7.C4200a;
import m7.C4567c;

/* loaded from: classes2.dex */
public final class n implements AbstractC3205b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29018a;

    @Override // p000if.a
    public final Object get() {
        int i10 = this.f29018a;
        switch (i10) {
            case 0:
                return new X3.a(1, Executors.newSingleThreadExecutor());
            case 1:
                return "com.google.android.datatransport.events";
            case 2:
                return Integer.valueOf(k7.n.f37195i0);
            case 3:
                C4200a c4200a = C4200a.f37166f;
                if (c4200a != null) {
                    return c4200a;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 4:
                switch (i10) {
                    case 4:
                        return new C4567c(1);
                    default:
                        return new C4567c(0);
                }
            default:
                switch (i10) {
                    case 4:
                        return new C4567c(1);
                    default:
                        return new C4567c(0);
                }
        }
    }
}
