package M3;

import y3.AbstractC6540b;

/* renamed from: M3.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0940i extends AbstractC6540b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0940i f11570c = new AbstractC6540b(1, 2);

    @Override // y3.AbstractC6540b
    public final void a(C3.b bVar) {
        bVar.t("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        bVar.t("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        bVar.t("DROP TABLE IF EXISTS alarmInfo");
        bVar.t("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
