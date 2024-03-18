package Z1;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import java.util.concurrent.CancellationException;
import nf.AbstractC4828h;

/* renamed from: Z1.a0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1751a0 extends AppWidgetProvider {

    /* renamed from: a  reason: collision with root package name */
    public final Tg.e f22940a = Ng.Q.f12904a;

    public static final void a(AbstractC1751a0 abstractC1751a0, Ng.F f6, Context context) {
        abstractC1751a0.getClass();
        Ad.l.O0(f6, null, null, new Z(context, abstractC1751a0, null), 3);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i10, Bundle bundle) {
        AbstractC4828h.R(this, this.f22940a, new U(this, context, i10, bundle, null));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        AbstractC4828h.R(this, this.f22940a, new V(this, context, iArr, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[Catch: all -> 0x0048, CancellationException -> 0x00b8, TryCatch #2 {CancellationException -> 0x00b8, all -> 0x0048, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001d, B:15:0x0027, B:17:0x002f, B:19:0x0038, B:22:0x004a, B:23:0x0055, B:24:0x0056, B:25:0x0061, B:26:0x0062, B:29:0x006b, B:32:0x0074, B:34:0x0086, B:36:0x0091, B:37:0x0099, B:38:0x009d, B:39:0x00a1, B:40:0x00ac, B:41:0x00ad), top: B:45:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1 A[Catch: all -> 0x0048, CancellationException -> 0x00b8, TryCatch #2 {CancellationException -> 0x00b8, all -> 0x0048, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001d, B:15:0x0027, B:17:0x002f, B:19:0x0038, B:22:0x004a, B:23:0x0055, B:24:0x0056, B:25:0x0061, B:26:0x0062, B:29:0x006b, B:32:0x0074, B:34:0x0086, B:36:0x0091, B:37:0x0099, B:38:0x009d, B:39:0x00a1, B:40:0x00ac, B:41:0x00ad), top: B:45:0x0002 }] */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        String canonicalName;
        int[] iArr;
        try {
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -19011148) {
                    if (hashCode != 649033583) {
                        if (hashCode == 1989767543 && action.equals("ACTION_TRIGGER_LAMBDA")) {
                            String stringExtra = intent.getStringExtra("EXTRA_ACTION_KEY");
                            if (stringExtra != null) {
                                int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
                                if (intExtra != -1) {
                                    AbstractC4828h.R(this, this.f22940a, new W(this, context, intExtra, stringExtra, null));
                                    return;
                                }
                                throw new IllegalStateException("Intent is missing AppWidgetId extra".toString());
                            }
                            throw new IllegalStateException("Intent is missing ActionKey extra".toString());
                        }
                    } else {
                        if (!action.equals("androidx.glance.appwidget.action.DEBUG_UPDATE")) {
                        }
                        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                        String packageName = context.getPackageName();
                        canonicalName = getClass().getCanonicalName();
                        if (canonicalName == null) {
                            ComponentName componentName = new ComponentName(packageName, canonicalName);
                            if (intent.hasExtra("appWidgetIds")) {
                                iArr = intent.getIntArrayExtra("appWidgetIds");
                                AbstractC3557B.Z(iArr);
                            } else {
                                iArr = appWidgetManager.getAppWidgetIds(componentName);
                            }
                            onUpdate(context, appWidgetManager, iArr);
                            return;
                        }
                        throw new IllegalStateException("no canonical name".toString());
                    }
                } else {
                    if (!action.equals("android.intent.action.LOCALE_CHANGED")) {
                    }
                    AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(context);
                    String packageName2 = context.getPackageName();
                    canonicalName = getClass().getCanonicalName();
                    if (canonicalName == null) {
                    }
                }
            }
            super.onReceive(context, intent);
        } catch (CancellationException unused) {
        } catch (Throwable th2) {
            AbstractC3612c.d("GlanceAppWidget", "Error in Glance App Widget", th2);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        AbstractC4828h.R(this, this.f22940a, new Y(this, context, iArr, null));
    }
}
