package g6;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* renamed from: g6.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3203c extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C3203c f31286Z = new C3203c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C3203c f31287h0 = new C3203c(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C3203c f31288i0 = new C3203c(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C3203c f31289j0 = new C3203c(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31290Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3203c(int i10) {
        super(0);
        this.f31290Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        switch (this.f31290Y) {
            case 0:
                return "Failed to update intercepted OkHttp request";
            case 1:
                return "You added a TracingInterceptor to your OkHttpClient, but you did not specify any first party hosts. Your requests won't be traced.\nTo set a list of known hosts, you can use the Configuration.Builder::setFirstPartyHosts() method.";
            case 2:
                return "You added a TracingInterceptor to your OkHttpClient, but you didn't register any Tracer. We automatically created a local tracer for you.";
            default:
                return "You added a TracingInterceptor to your OkHttpClient, but you did not enable the TracingFeature. Your requests won't be traced.";
        }
    }
}
