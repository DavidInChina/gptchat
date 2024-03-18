package t7;

import V1.AbstractActivityC1483y;
import V1.K;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC3612c;
import k6.AbstractC4194d;
import o1.C4903s;
import o1.v;
import r0.s;
import v7.AbstractC5989g;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f45770c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final e f45771d = new Object();

    public static AlertDialog d(Context context, int i10, w7.q qVar, DialogInterface.OnCancelListener onCancelListener) {
        String str;
        AlertDialog.Builder builder = null;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(w7.n.b(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    str = resources.getString(17039370);
                } else {
                    str = resources.getString(R.string.common_google_play_services_enable_button);
                }
            } else {
                str = resources.getString(R.string.common_google_play_services_update_button);
            }
        } else {
            str = resources.getString(R.string.common_google_play_services_install_button);
        }
        if (str != null) {
            builder.setPositiveButton(str, qVar);
        }
        String c10 = w7.n.c(context, i10);
        if (c10 != null) {
            builder.setTitle(c10);
        }
        AbstractC3612c.s("GoogleApiAvailability", android.gov.nist.core.a.e("Creating dialog for Google Play services availability issue. ConnectionResult=", i10), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.app.DialogFragment, t7.c] */
    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC1483y) {
                K e10 = ((AbstractActivityC1483y) activity).f18317y0.e();
                k kVar = new k();
                A7.b.l0(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                kVar.f45781q1 = alertDialog;
                if (onCancelListener != null) {
                    kVar.f45782r1 = onCancelListener;
                }
                kVar.Q(e10, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        A7.b.l0(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.f45764Y = alertDialog;
        if (onCancelListener != null) {
            dialogFragment.f45765Z = onCancelListener;
        }
        dialogFragment.show(fragmentManager, str);
    }

    @Override // t7.f
    public final Intent a(int i10, Context context, String str) {
        return super.a(i10, context, str);
    }

    @Override // t7.f
    public final int b(Context context, int i10) {
        return super.b(context, i10);
    }

    public final void c(Activity activity, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d10 = d(activity, i10, new w7.o(activity, super.a(i10, activity, "d")), onCancelListener);
        if (d10 == null) {
            return;
        }
        e(activity, d10, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, o1.u] */
    public final void f(Context context, int i10, PendingIntent pendingIntent) {
        String str;
        String str2;
        NotificationManager notificationManager;
        v vVar;
        NotificationManager notificationManager2;
        int i11;
        NotificationChannel notificationChannel;
        CharSequence name;
        AbstractC3612c.s("GoogleApiAvailability", AbstractC4194d.v("GMS core API Availability. ConnectionResult=", i10, ", tag=null"), new IllegalArgumentException());
        if (i10 == 18) {
            new l(this, context).sendEmptyMessageDelayed(1, 120000L);
        } else if (pendingIntent == null) {
            if (i10 == 6) {
                AbstractC3612c.r("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            if (i10 == 6) {
                str = w7.n.e(context, "common_google_play_services_resolution_required_title");
            } else {
                str = w7.n.c(context, i10);
            }
            if (str == null) {
                str = context.getResources().getString(R.string.common_google_play_services_notification_ticker);
            }
            if (i10 != 6 && i10 != 19) {
                str2 = w7.n.b(context, i10);
            } else {
                str2 = w7.n.d(context, "common_google_play_services_resolution_required_text", w7.n.a(context));
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            A7.b.k0(systemService);
            NotificationManager notificationManager3 = (NotificationManager) systemService;
            v vVar2 = new v(context, null);
            vVar2.f40498l = true;
            vVar2.f40503q.flags |= 16;
            vVar2.f40491e = v.b(str);
            ?? obj = new Object();
            obj.f40486b = v.b(str2);
            vVar2.c(obj);
            PackageManager packageManager = context.getPackageManager();
            if (A7.b.f724i == null) {
                A7.b.f724i = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            if (A7.b.f724i.booleanValue()) {
                vVar2.f40503q.icon = context.getApplicationInfo().icon;
                vVar2.f40494h = 2;
                if (A7.b.j1(context)) {
                    notificationManager = notificationManager3;
                    vVar2.f40488b.add(new C4903s(IconCompat.b(null, "", 2131230906), resources.getString(R.string.common_open_on_phone), pendingIntent, new Bundle(), null, null, true, 0, true, false, false));
                    vVar = vVar2;
                } else {
                    vVar = vVar2;
                    notificationManager = notificationManager3;
                    vVar.f40493g = pendingIntent;
                }
            } else {
                vVar = vVar2;
                notificationManager = notificationManager3;
                vVar.f40503q.icon = 17301642;
                vVar.f40503q.tickerText = v.b(resources.getString(R.string.common_google_play_services_notification_ticker));
                vVar.f40503q.when = System.currentTimeMillis();
                vVar.f40493g = pendingIntent;
                vVar.f40492f = v.b(str2);
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 26) {
                if (i12 >= 26) {
                    synchronized (f45770c) {
                    }
                    notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String string = context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
                    if (notificationChannel == null) {
                        notificationManager2 = notificationManager;
                        notificationManager2.createNotificationChannel(s.e(string));
                    } else {
                        notificationManager2 = notificationManager;
                        name = notificationChannel.getName();
                        if (!string.contentEquals(name)) {
                            notificationChannel.setName(string);
                            notificationManager2.createNotificationChannel(notificationChannel);
                        }
                    }
                    vVar.f40501o = "com.google.android.gms.availability";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                notificationManager2 = notificationManager;
            }
            Notification a5 = vVar.a();
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                i11 = 39789;
            } else {
                i.f45775a.set(false);
                i11 = 10436;
            }
            notificationManager2.notify(i11, a5);
        }
    }

    public final void g(Activity activity, AbstractC5989g abstractC5989g, int i10, v7.o oVar) {
        AlertDialog d10 = d(activity, i10, new w7.p(super.a(i10, activity, "d"), abstractC5989g), oVar);
        if (d10 == null) {
            return;
        }
        e(activity, d10, "GooglePlayServicesErrorDialog", oVar);
    }
}
