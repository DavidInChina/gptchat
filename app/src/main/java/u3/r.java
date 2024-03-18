package U3;

import id.AbstractC3557B;
import p.AbstractC5028d;
import x3.y;

/* loaded from: classes.dex */
public final class r extends AbstractC5028d {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f17473d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(y yVar) {
        super(yVar);
        this.f17473d = 8;
        AbstractC3557B.c0("database", yVar);
    }

    @Override // p.AbstractC5028d
    public final String e() {
        switch (this.f17473d) {
            case 0:
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            case 1:
                return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
            case 2:
                return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
            case 3:
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            case 4:
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            case 5:
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            case 6:
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            case 7:
                return "UPDATE workspec SET stop_reason=? WHERE id=?";
            case 8:
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            case 9:
                return "DELETE FROM workspec WHERE id=?";
            case 10:
                return "UPDATE workspec SET state=? WHERE id=?";
            case 11:
                return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
            case 12:
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            case 13:
                return "UPDATE workspec SET output=? WHERE id=?";
            case 14:
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            default:
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(y yVar, int i10) {
        super(yVar);
        this.f17473d = i10;
    }
}
