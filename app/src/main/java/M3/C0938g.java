package M3;

import y3.AbstractC6540b;

/* renamed from: M3.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0938g extends AbstractC6540b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0938g f11568c = new AbstractC6540b(15, 16);

    @Override // y3.AbstractC6540b
    public final void a(C3.b bVar) {
        bVar.t("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
        bVar.t("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
        bVar.t("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.t("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
        bVar.t("DROP TABLE `SystemIdInfo`");
        bVar.t("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
    }
}
