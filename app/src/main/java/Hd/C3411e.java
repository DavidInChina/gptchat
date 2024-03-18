package hd;

import id.AbstractC3557B;
import io.sentry.D0;
import io.sentry.E0;
import io.sentry.EnumC3642e1;
import io.sentry.K0;
import io.sentry.N;
import io.sentry.O;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.C3674a;
import io.sentry.protocol.C3676c;
import io.sentry.r1;
import java.util.ArrayList;
import jh.H1;

/* renamed from: hd.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3411e implements K0, E0 {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ String f32249Y;

    public /* synthetic */ C3411e(String str) {
        this.f32249Y = str;
    }

    @Override // io.sentry.K0
    public final void a(r1 r1Var) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) r1Var;
        String str = this.f32249Y;
        AbstractC3557B.c0("$environment", str);
        AbstractC3557B.c0("options", sentryAndroidOptions);
        sentryAndroidOptions.setDsn("https://6884768431e4ba548d58cbf3ad96e4ce@o33249.ingest.sentry.io/4506613529051136");
        sentryAndroidOptions.setEnableUserInteractionTracing(true);
        sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(true);
        sentryAndroidOptions.setAttachViewHierarchy(true);
        sentryAndroidOptions.getInAppIncludes().add("com.openai");
        sentryAndroidOptions.setEnvironment(str);
        sentryAndroidOptions.setBeforeSend(new A9.a(20));
        if (AbstractC3557B.K(str, "developer")) {
            sentryAndroidOptions.setDebug(true);
            sentryAndroidOptions.setDiagnosticLevel(EnumC3642e1.INFO);
            sentryAndroidOptions.setLogger(new H1(0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.E0
    public final void f(N n10) {
        D0 d02 = (D0) n10;
        d02.getClass();
        C3676c c3676c = d02.f33777p;
        C3674a c3674a = (C3674a) c3676c.c(C3674a.class, "app");
        C3674a c3674a2 = c3674a;
        if (c3674a == null) {
            Object obj = new Object();
            c3676c.put("app", obj);
            c3674a2 = obj;
        }
        String str = this.f32249Y;
        if (str == null) {
            c3674a2.f34502n0 = null;
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            c3674a2.f34502n0 = arrayList;
        }
        for (O o10 : d02.f33772k.getScopeObservers()) {
            o10.c(c3676c);
        }
    }
}
