package leakcanary.internal;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import hh.AbstractC3438f;
import hh.AbstractC3440h;
import hh.C3434b;
import hh.C3439g;
import hh.C3443k;
import hh.p;
import hh.t;
import id.AbstractC3557B;
import ih.c;
import ih.e;
import io.sentry.android.core.performance.b;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import l8.AbstractC4344b;
import wf.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lleakcanary/internal/MainProcessAppWatcherInstaller;", "Landroid/content/ContentProvider;", "<init>", "()V", "leakcanary-object-watcher-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class MainProcessAppWatcherInstaller extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        AbstractC3557B.d0("uri", uri);
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        AbstractC3557B.d0("uri", uri);
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        AbstractC3557B.d0("uri", uri);
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [Ki.a, java.lang.Object] */
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        b.c(this);
        Context context = getContext();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                Application application = (Application) applicationContext;
                RuntimeException runtimeException = AbstractC3438f.f32355b;
                long millis = TimeUnit.SECONDS.toMillis(5L);
                C3443k c3443k = AbstractC3438f.f32356c;
                AbstractC3557B.d0("reachabilityWatcher", c3443k);
                List<AbstractC3440h> G02 = AbstractC4344b.G0(new C3434b(application, c3443k), new C3439g(application, c3443k), new p(c3443k), new t(c3443k));
                c.a();
                if (AbstractC3438f.f32355b == null) {
                    if (millis >= 0) {
                        AbstractC3438f.f32354a = millis;
                        if ((2 & application.getApplicationInfo().flags) != 0) {
                            R4.b.f15040a = new Object();
                        }
                        ((k) e.f33252a.getValue()).invoke(application);
                        for (AbstractC3440h abstractC3440h : G02) {
                            abstractC3440h.a();
                        }
                        AbstractC3438f.f32355b = new RuntimeException("manualInstall() first called here");
                        b.d(this);
                        return true;
                    }
                    throw new IllegalStateException(("retainedDelayMillis " + millis + " must be at least 0 ms").toString());
                }
                throw new IllegalStateException("AppWatcher already installed, see exception cause for prior install call", AbstractC3438f.f32355b);
            }
            ClassCastException classCastException = new ClassCastException("null cannot be cast to non-null type android.app.Application");
            b.d(this);
            throw classCastException;
        }
        AbstractC3557B.A2();
        throw null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AbstractC3557B.d0("uri", uri);
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        AbstractC3557B.d0("uri", uri);
        return 0;
    }
}
