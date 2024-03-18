package O3;

import L3.s;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f13343a = s.f("Alarms");

    public static void a(Context context, U3.j jVar, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = c.f13344k0;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        c.e(intent, jVar);
        PendingIntent service = PendingIntent.getService(context, i10, intent, 603979776);
        if (service != null && alarmManager != null) {
            s d10 = s.d();
            d10.a(f13343a, "Cancelling existing alarm with (workSpecId, systemId) (" + jVar + ", " + i10 + Separators.RPAREN);
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, WorkDatabase workDatabase, U3.j jVar, long j6) {
        U3.i r10 = workDatabase.r();
        U3.g B10 = r10.B(jVar);
        if (B10 != null) {
            int i10 = B10.f17410c;
            a(context, jVar, i10);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = c.f13344k0;
            Intent intent = new Intent(context, SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            c.e(intent, jVar);
            PendingIntent service = PendingIntent.getService(context, i10, intent, 201326592);
            if (alarmManager != null) {
                a.a(alarmManager, 0, j6, service);
                return;
            }
            return;
        }
        F4.a aVar = new F4.a(workDatabase);
        Object m10 = ((WorkDatabase) aVar.f5033Z).m(new V3.g(0, aVar));
        AbstractC3557B.b0("workDatabase.runInTransa\u2026ANAGER_ID_KEY)\n        })", m10);
        int intValue = ((Number) m10).intValue();
        r10.C(new U3.g(jVar.f17418a, jVar.f17419b, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = c.f13344k0;
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        c.e(intent2, jVar);
        PendingIntent service2 = PendingIntent.getService(context, intValue, intent2, 201326592);
        if (alarmManager2 != null) {
            a.a(alarmManager2, 0, j6, service2);
        }
    }
}
