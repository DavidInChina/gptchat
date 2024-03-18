package M3;

import y3.AbstractC6540b;

/* loaded from: classes2.dex */
public final class l extends AbstractC6540b {

    /* renamed from: c  reason: collision with root package name */
    public static final l f11573c = new AbstractC6540b(6, 7);

    @Override // y3.AbstractC6540b
    public final void a(C3.b bVar) {
        bVar.t("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
