package M3;

import android.content.Context;
import android.content.SharedPreferences;
import y3.AbstractC6540b;

/* loaded from: classes2.dex */
public final class r extends AbstractC6540b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f11595c = 1;

    /* renamed from: d  reason: collision with root package name */
    public final Context f11596d;

    public r(Context context) {
        super(9, 10);
        this.f11596d = context;
    }

    @Override // y3.AbstractC6540b
    public final void a(C3.b bVar) {
        int i10 = this.f11595c;
        Context context = this.f11596d;
        switch (i10) {
            case 0:
                if (this.f50713b >= 10) {
                    bVar.W("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                bVar.t("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j6 = 0;
                    long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                        j6 = 1;
                    }
                    bVar.n();
                    try {
                        bVar.W("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                        bVar.W("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j6)});
                        sharedPreferences.edit().clear().apply();
                        bVar.U();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i11 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i12 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    bVar.n();
                    try {
                        bVar.W("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i11)});
                        bVar.W("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i12)});
                        sharedPreferences2.edit().clear().apply();
                        bVar.U();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public r(Context context, int i10, int i11) {
        super(i10, i11);
        this.f11596d = context;
    }
}
