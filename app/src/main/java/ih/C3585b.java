package ih;

import Ad.l;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;
import wf.k;

/* renamed from: ih.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3585b extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C3585b f33247Z = new C3585b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C3585b f33248h0 = new C3585b(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f33249Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3585b(int i10) {
        super(0);
        this.f33249Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        switch (this.f33249Y) {
            case 0:
                return new Handler(Looper.getMainLooper());
            default:
                try {
                    Object obj = Class.forName("leakcanary.internal.InternalLeakCanary").getDeclaredField("INSTANCE").get(null);
                    if (obj != null) {
                        l.M(1, obj);
                        return (k) obj;
                    }
                    throw new ClassCastException("null cannot be cast to non-null type (android.app.Application) -> kotlin.Unit");
                } catch (Throwable unused) {
                    return d.f33251Y;
                }
        }
    }
}
