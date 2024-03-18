package io.sentry.android.core.internal.util;

import Ad.l;
import android.content.Context;
import io.sentry.H;
import io.sentry.android.core.B;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: g  reason: collision with root package name */
    public static final Charset f34169g = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final Context f34170a;

    /* renamed from: b  reason: collision with root package name */
    public final B f34171b;

    /* renamed from: c  reason: collision with root package name */
    public final H f34172c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f34173d = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};

    /* renamed from: e  reason: collision with root package name */
    public final String[] f34174e = {"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};

    /* renamed from: f  reason: collision with root package name */
    public final Runtime f34175f;

    public g(Context context, H h10, B b10) {
        Runtime runtime = Runtime.getRuntime();
        l.Z0("The application context is required.", context);
        this.f34170a = context;
        l.Z0("The BuildInfoProvider is required.", b10);
        this.f34171b = b10;
        l.Z0("The Logger is required.", h10);
        this.f34172c = h10;
        l.Z0("The Runtime is required.", runtime);
        this.f34175f = runtime;
    }
}
