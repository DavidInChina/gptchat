package com.datadog.android.rum;

import android.app.ActivityManager;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Process;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import io.sentry.android.core.performance.b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, d2 = {"Lcom/datadog/android/rum/DdRumContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "K4/J", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0})
/* loaded from: classes.dex */
public final class DdRumContentProvider extends ContentProvider {

    /* renamed from: Y  reason: collision with root package name */
    public static int f26755Y;

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        AbstractC3557B.c0("uri", uri);
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        AbstractC3557B.c0("uri", uri);
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        AbstractC3557B.c0("uri", uri);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Object obj;
        ActivityManager activityManager;
        int i10;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        b.c(this);
        if (f26755Y == 0) {
            Context context = getContext();
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = null;
            if (context != null) {
                obj = context.getSystemService("activity");
            } else {
                obj = null;
            }
            if (obj instanceof ActivityManager) {
                activityManager = (ActivityManager) obj;
            } else {
                activityManager = null;
            }
            int myPid = Process.myPid();
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                Iterator<T> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((ActivityManager.RunningAppProcessInfo) next).pid == myPid) {
                        runningAppProcessInfo = next;
                        break;
                    }
                }
                runningAppProcessInfo = runningAppProcessInfo;
            }
            if (runningAppProcessInfo != null) {
                i10 = runningAppProcessInfo.importance;
            } else {
                i10 = 100;
            }
            f26755Y = i10;
            AbstractC3612c.r("DdRumContentProvider", "processImportance:" + i10);
        }
        b.d(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AbstractC3557B.c0("uri", uri);
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        AbstractC3557B.c0("uri", uri);
        return 0;
    }
}
