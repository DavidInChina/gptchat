package androidx.startup;

import E3.a;
import Gi.e;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import io.sentry.android.core.performance.b;

/* loaded from: classes2.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        b.c(this);
        Context context = getContext();
        if (context != null) {
            if (context.getApplicationContext() != null) {
                a c10 = a.c(context);
                Context context2 = c10.f4429c;
                try {
                    try {
                        Trace.beginSection(e.V("Startup"));
                        c10.a(context2.getPackageManager().getProviderInfo(new ComponentName(context2.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                    } catch (PackageManager.NameNotFoundException e10) {
                        throw new K0.e(2, e10);
                    }
                } finally {
                    Trace.endSection();
                }
            }
            b.d(this);
            return true;
        }
        RuntimeException runtimeException = new RuntimeException("Context cannot be null");
        b.d(this);
        throw runtimeException;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
